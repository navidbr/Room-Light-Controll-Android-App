package com.example.navid_university.mysweethome;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    public static Context context1;

    public static String acountname="";
    public static connection con;
    public static String server_ip = "192.168.1.100";
    public static int server_port = 5010;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context1=this;
        String acountname="";
        acountname=filing.read_from_file_acount(context1);
        filing.read_from_file_setting(context1);
        con = new connection();
        con.connect(server_ip,server_port);
        if (!(acountname.equals("")))
        {
            if (acountname.equals("Master Room"))
            {
                DadRoom.acount_name="Master Room";
                Intent acount =new Intent(MainActivity.this,DadRoom.class);
                startActivity(acount);
            }
            if (acountname.equals("Navid"))
            {
                DadRoom.acount_name="Navid";
                Intent acount =new Intent(MainActivity.this,DadRoom.class);
                startActivity(acount);
            }
            if (acountname.equals("Pouya"))
            {
                DadRoom.acount_name="Pouya";
                Intent acount =new Intent(MainActivity.this,DadRoom.class);
                startActivity(acount);
            }

        }



        Button btn_master_room =(Button)findViewById(R.id.btn_master_room);
        Button btn_navid_room =(Button)findViewById(R.id.btn_navid);
        Button btn_pouya_room =(Button)findViewById(R.id.btn_pouya);
        btn_master_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DadRoom.acount_name="Master Room";
                filing.Write_To_File_acount("Master Room",context1);
                Intent acount =new Intent(MainActivity.this,DadRoom.class);
                startActivity(acount);
            }
        });

        btn_navid_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filing.Write_To_File_acount("Navid",context1  );
                DadRoom.acount_name="Navid";
                Intent acount =new Intent(MainActivity.this,DadRoom.class);
                startActivity(acount);
            }
        });

        btn_pouya_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filing.Write_To_File_acount("Pouya",context1);
                DadRoom.acount_name="Pouya";
                Intent acount =new Intent(MainActivity.this,DadRoom.class);
                startActivity(acount);
            }
        });





    }


}
