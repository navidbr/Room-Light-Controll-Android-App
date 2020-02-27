package com.example.navid_university.mysweethome;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by NAVID_University on 11/4/2016.
 */

public class filing {

    public static void Write_To_File_acount(String data , Context context)
    {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("acount.txt",Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();

        }catch (Exception e1)
        {

        }
    }
    public static String read_from_file_acount(Context context)
    {
        String ret="";
        try {
            InputStream inputStream = context.openFileInput("acount.txt");
            if (inputStream != null)
            {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                ret=bufferedReader.readLine();
                inputStream.close();
            }
        }catch (Exception e1)
        {

        }
        return ret;

    }
    public static void Write_To_File_setting(Context context)
    {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("setting.txt",Context.MODE_PRIVATE));
            outputStreamWriter.write(MainActivity.server_ip);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(Integer.toString(MainActivity.server_port));
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastertopautoenable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastertopautodisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastersideautoenable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastersideautodisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastertopon);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastertopoff);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastersideon);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastersideoff);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastertimeroner);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastertimeroffer);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.mastertimerdisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidtopautoenable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidtopautodisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidsideautoenable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidsideautodisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidtopon);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidtopoff);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidsideon);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidsideoff);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidtimeroner);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidtimeroffer);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.navidtimerdisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyatopautoenable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyatopautodisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyasideautoenable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyasideautodisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyatopon);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyatopoff);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyasideon);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyasideoff);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyatimeroner);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyatimeroffer);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.write(settings.pouyatimerdisable);
            outputStreamWriter.write(13);
            outputStreamWriter.write(10);
            outputStreamWriter.close();
        }catch (Exception e1)
        {
            Toast.makeText(MainActivity.context1,"setting file write exception : "+e1.toString(),Toast.LENGTH_LONG).show();
        }
    }
    public static void read_from_file_setting(Context context) {

        try {
            InputStream inputStream = context.openFileInput("setting.txt");
            if (inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                MainActivity.server_ip=bufferedReader.readLine();
                MainActivity.server_port=Integer.parseInt(bufferedReader.readLine());
                settings.mastertopautoenable=bufferedReader.readLine();
                settings.mastertopautodisable=bufferedReader.readLine();
                settings.mastersideautoenable=bufferedReader.readLine();
                settings.mastersideautodisable=bufferedReader.readLine();
                settings.mastertopon=bufferedReader.readLine();
                settings.mastertopoff=bufferedReader.readLine();
                settings.mastersideon=bufferedReader.readLine();
                settings.mastersideoff=bufferedReader.readLine();
                settings.mastertimeroner=bufferedReader.readLine();
                settings.mastertimeroffer=bufferedReader.readLine();
                settings.mastertimerdisable=bufferedReader.readLine();
                settings.navidtopautoenable=bufferedReader.readLine();
                settings.navidtopautodisable=bufferedReader.readLine();
                settings.navidsideautoenable=bufferedReader.readLine();
                settings.navidsideautodisable=bufferedReader.readLine();
                settings.navidtopon=bufferedReader.readLine();
                settings.navidtopoff=bufferedReader.readLine();
                settings.navidsideon=bufferedReader.readLine();
                settings.navidsideoff=bufferedReader.readLine();
                settings.navidtimeroner=bufferedReader.readLine();
                settings.navidtimeroffer=bufferedReader.readLine();
                settings.navidtimerdisable=bufferedReader.readLine();
                settings.pouyatopautoenable=bufferedReader.readLine();
                settings.pouyatopautodisable=bufferedReader.readLine();
                settings.pouyasideautoenable=bufferedReader.readLine();
                settings.pouyasideautodisable=bufferedReader.readLine();
                settings.pouyatopon=bufferedReader.readLine();
                settings.pouyatopoff=bufferedReader.readLine();
                settings.pouyasideon=bufferedReader.readLine();
                settings.pouyasideoff=bufferedReader.readLine();
                settings.pouyatimeroner=bufferedReader.readLine();
                settings.pouyatimeroffer=bufferedReader.readLine();
                settings.pouyatimerdisable=bufferedReader.readLine();
                inputStream.close();

            }
        } catch (FileNotFoundException e1)   // maghadire avvaliye dar avvalin ejra
        {

            MainActivity.server_ip="192.168.100.1";
            MainActivity.server_port=5010;
            settings.mastertopautoenable="";
            settings.mastertopautodisable="";
            settings.mastersideautoenable="";
            settings.mastersideautodisable="";
            settings.mastertopon="";
            settings.mastertopoff="";
            settings.mastersideon="";
            settings.mastersideoff="";
            settings.mastertimeroner="";
            settings.mastertimeroffer="";
            settings.mastertimerdisable="";
            settings.navidtopautoenable="";
            settings.navidtopautodisable="";
            settings.navidsideautoenable="";
            settings.navidsideautodisable="";
            settings.navidtopon="";
            settings.navidtopoff="";
            settings.navidsideon="";
            settings.navidsideoff="";
            settings.navidtimeroner="";
            settings.navidtimeroffer="";
            settings.navidtimerdisable="";
            settings.pouyatopautoenable="";
            settings.pouyatopautodisable="";
            settings.pouyasideautoenable="";
            settings.pouyasideautodisable="";
            settings.pouyatopon="";
            settings.pouyatopoff="";
            settings.pouyasideon="";
            settings.pouyasideoff="";
            settings.pouyatimeroner="";
            settings.pouyatimeroffer="";
            settings.pouyatimerdisable="";
            Write_To_File_setting(MainActivity.context1);

        }catch (IOException e1)
        {
            Toast.makeText(MainActivity.context1,"setting file read IOException : "+e1.toString(),Toast.LENGTH_LONG).show();
        }catch (Exception e1)
        {
            Toast.makeText(MainActivity.context1,"setting file read exception : "+e1.toString(),Toast.LENGTH_LONG).show();
        }

    }


}