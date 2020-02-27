package com.example.navid_university.mysweethome;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DadRoom extends AppCompatActivity {

    public static String acount_name ="";
    public String connection_state = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad_room);

        final Context context1=this;
        TextView tv_acount_name = (TextView) findViewById(R.id.tv_acount_name);
        TextView tv_connection_state = (TextView) findViewById(R.id.tv_connection_state);
        //String
        if (connection.isconnect()) {
            connection_state = "Connected";
        } else {
            connection_state = "Disconnect";
            Toast.makeText(this, "Connection State : " + connection_state, Toast.LENGTH_LONG).show();
        }
        tv_acount_name.setText("Room Name : " + acount_name);
        tv_connection_state.setText("Connection Status : " + connection_state);


        final Button setting = (Button) findViewById(R.id.btn_settings);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent setting_activity = new Intent(DadRoom.this, settings.class);
                startActivity(setting_activity);
            }
        });

        Button btn_top_auto_on = (Button) findViewById(R.id.btn_top_auto_on);
        Button btn_top_auto_off = (Button) findViewById(R.id.btn_top_auto_off);
        Button btn_side_auto_on = (Button) findViewById(R.id.btn_side_auto_on);
        Button btn_side_auto_off = (Button) findViewById(R.id.btn_side_auto_off);
        Button btn_top_on = (Button) findViewById(R.id.btn_top_on);
        Button btn_top_off = (Button) findViewById(R.id.btn_top_off);
        Button btn_side_on = (Button) findViewById(R.id.btn_side_on);
        Button btn_side_off = (Button) findViewById(R.id.btn_side_off);
        Button btn_timer_oner = (Button) findViewById(R.id.btn_timer_oner);
        Button btn_timer_offer = (Button) findViewById(R.id.btn_timer_offer);
        Button btn_timer_disable = (Button) findViewById(R.id.btn_timer_disable);
        Button btn_send_special_command = (Button)findViewById(R.id.btn_send_command);
        final Button btn_manual_connect = (Button)findViewById(R.id.btn_manual_connect);

        btn_top_auto_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastertopautoenable);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidtopautoenable);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyatopautoenable);
                            break;

                    }
                }
            }
        });
        btn_top_auto_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastertopautodisable);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidtopautodisable);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyatopautodisable);
                            break;

                    }
                }
            }
        });
        btn_side_auto_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect())) {
                    Toast.makeText(DadRoom.this, "No Connection", Toast.LENGTH_SHORT).show();
                } else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastersideautoenable);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidsideautoenable);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyasideautoenable);
                            break;

                    }

                }
            }
        });
        btn_side_auto_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (!(connection.isconnect()))
                    {
                        Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                    }else {
                        switch (DadRoom.acount_name) {
                            case "Master Room":
                                MainActivity.con.send_data(settings.mastersideautodisable);
                                break;
                            case "Navid":
                                MainActivity.con.send_data(settings.navidsideautodisable);
                                break;
                            case "Pouya":
                                MainActivity.con.send_data(settings.pouyasideautodisable);
                                break;
                        }
                    }
            }
        });
        btn_top_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect())) {
                    Toast.makeText(DadRoom.this, "No Connection", Toast.LENGTH_SHORT).show();
                } else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastertopon);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidtopon);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyatopon);
                            break;
                    }
                }
            }
        });
        btn_top_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect())) {
                    Toast.makeText(DadRoom.this, "No Connection", Toast.LENGTH_SHORT).show();
                } else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastertopoff);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidtopoff);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyatopoff);
                            break;
                    }
                }
            }
        });
        btn_side_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastersideon);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidsideon);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyasideon);
                            break;
                    }
                }
            }
        });
        btn_side_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastersideoff);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidsideoff);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyasideoff);
                            break;
                    }
                }
            }
        });
        btn_timer_oner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    EditText et_time = (EditText) findViewById(R.id.minute);
                    String minute = "";
                    minute = et_time.getText().toString();
                    if (minute.equals("")) {
                        Toast.makeText(DadRoom.this, "Please Enter Time", Toast.LENGTH_SHORT).show();
                    } else {
                        switch (DadRoom.acount_name) {
                            case "Master Room":
                                MainActivity.con.send_data(settings.mastertimeroner + minute);
                                break;
                            case "Navid":
                                MainActivity.con.send_data(settings.navidtimeroner + minute);
                                break;
                            case "Pouya":
                                MainActivity.con.send_data(settings.pouyatimeroner + minute);
                                break;
                        }
                    }
                }
            }
        });
        btn_timer_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    EditText et_time = (EditText) findViewById(R.id.minute);
                    String minute = "";
                    minute = et_time.getText().toString();
                    if (minute.equals("")) {
                        Toast.makeText(DadRoom.this, "Please Enter Time", Toast.LENGTH_SHORT).show();
                    } else {
                        switch (DadRoom.acount_name) {
                            case "Master Room":
                                MainActivity.con.send_data(settings.mastertimeroffer + minute);
                                break;
                            case "Navid":
                                MainActivity.con.send_data(settings.navidtimeroffer + minute);
                                break;
                            case "Pouya":
                                MainActivity.con.send_data(settings.pouyatimeroffer + minute);
                                break;
                        }
                    }
                }
            }
        });
        btn_timer_disable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    switch (DadRoom.acount_name) {
                        case "Master Room":
                            MainActivity.con.send_data(settings.mastertimerdisable);
                            break;
                        case "Navid":
                            MainActivity.con.send_data(settings.navidtimerdisable);
                            break;
                        case "Pouya":
                            MainActivity.con.send_data(settings.pouyatimerdisable);
                            break;
                    }
                }
            }
        });
        btn_send_special_command.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(connection.isconnect()))
                {
                    Toast.makeText(DadRoom.this,"No Connection",Toast.LENGTH_SHORT).show();
                }else {
                    EditText et = (EditText) findViewById(R.id.et_command);
                    String cmd = "";
                    cmd = et.getText().toString();
                    if (cmd.equals("")) {
                        Toast.makeText(DadRoom.this, "Please Enter Command", Toast.LENGTH_SHORT).show();
                    } else {
                        MainActivity.con.send_data(cmd);
                    }
                }
            }
        });
        btn_manual_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_connection_state = (TextView)findViewById(R.id.tv_connection_state);
                if (connection.isconnect())
                {
                    connection.close();
                    if (connection.isconnect()) {
                        Toast.makeText(context1, "Could Not Disconnect", Toast.LENGTH_SHORT).show();
                    }else
                    {
                        btn_manual_connect.setText("Connect");
                        connection_state = "Disconnect";
                        tv_connection_state.setText("Connection Status : " + connection_state);
                    }

                }else {
                    MainActivity.con.connect(MainActivity.server_ip,MainActivity.server_port);
                    if (connection.isconnect())
                    {
                        btn_manual_connect.setText("Disconnect");
                        connection_state = "Connected";
                        tv_connection_state.setText("Connection Status : " + connection_state);
                    }
                    else {
                        Toast.makeText(context1, "Could Not Connect", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });







    }

}
/*
    TextView tv_connection_state = (TextView)findViewById(R.id.tv_connection_state);
MainActivity.con.connect(MainActivity.server_ip,MainActivity.server_port);
        connection_state = "";
        if (btn_manual_connect.getText().toString().equals("Connect")) {
        if (connection.isconnect()) {
        connection_state = "Connected";
        btn_manual_connect.setText("Disconnect");
        } else {
        connection_state = "Disconnect";
        btn_manual_connect.setText("Connect");
        Toast.makeText(context1, "Connection State : " + connection_state, Toast.LENGTH_SHORT).show();
        }
        tv_connection_state.setText("Connection Status : " + connection_state);
        }else {
        connection.close();
        if (connection.isconnect())
        {
        Toast.makeText(context1, "Could Not Disconnect", Toast.LENGTH_SHORT).show();
        }else {
        connection_state = "Disconnect";
        }
        }*/