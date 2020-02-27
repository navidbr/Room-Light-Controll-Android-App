package com.example.navid_university.mysweethome;

import android.app.Activity;
import android.util.Log;

import org.w3c.dom.Text;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class connection extends Activity {

    private static Socket socket1;
    private static int SERVERPORT = 5010;
    private static String SERVER_IP = "192.168.1.100";
    private static String TEXT;


    public void connect(String ip , int port) {
       try {
           Log.i("looog","ip:"+MainActivity.server_ip);
            if (socket1.isClosed())
            {
                SERVER_IP = ip;
                SERVERPORT = port;

                new Thread(new ClientThread()).start();
            }

        }catch (Exception e)
        {
            SERVER_IP = ip;
            SERVERPORT = port;


            new Thread(new ClientThread()).start();
        }
    }

    public void send_data(String text)
    {

        TEXT=text;
        new  Thread(new sendThread()).start();
    }
    public static void close()
    {
        if (!(socket1.isClosed()))
        {
            try {
                socket1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static boolean isconnect()
    {
        try {
            if (socket1.isClosed())
            {
                return false;
            }else {
                return true;
            }

        }catch (Exception e)
        {
            return false;
        }

    }
    class sendThread implements Runnable {

        @Override
        public void run() {
            OutputStream OS=null;
            try {
                OS = socket1.getOutputStream();
            } catch (Exception e) {
                //Log.i("looog","1:"+e.toString());
            }
            DataOutputStream dout = new DataOutputStream(OS);
            try {
                dout.writeUTF(TEXT);
            } catch (Exception e) {
                //Log.i("looog",TEXT+e.toString());
            }
        }
    }
    class ClientThread implements Runnable {
        @Override
        public void run() {
            try {
                InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
                socket1 = new Socket(serverAddr, SERVERPORT);
            }catch (UnknownHostException e1) {
                e1.printStackTrace();
            }catch (SecurityException e1) {
                e1.printStackTrace();
            }catch (IllegalArgumentException e1){
                e1.printStackTrace();
            }catch (NullPointerException e1) {
                e1.printStackTrace();
            }catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
