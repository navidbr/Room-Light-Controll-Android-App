package com.example.navid_university.mysweethome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class settings extends AppCompatActivity {


    public static String mastertopautoenable="";
    public static String mastertopautodisable="";
    public static String mastersideautoenable="";
    public static String mastersideautodisable="";
    public static String mastertopon="";
    public static String mastertopoff="";
    public static String mastersideon="";
    public static String mastersideoff="";
    public static String mastertimeroner="";
    public static String mastertimeroffer="";
    public static String mastertimerdisable="";
    public static String navidtopautoenable="";
    public static String navidtopautodisable="";
    public static String navidsideautoenable="";
    public static String navidsideautodisable="";
    public static String navidtopon="";
    public static String navidtopoff="";
    public static String navidsideon="";
    public static String navidsideoff="";
    public static String navidtimeroner="";
    public static String navidtimeroffer="";
    public static String navidtimerdisable="";
    public static String pouyatopautoenable="";
    public static String pouyatopautodisable="";
    public static String pouyasideautoenable="";
    public static String pouyasideautodisable="";
    public static String pouyatopon="";
    public static String pouyatopoff="";
    public static String pouyasideon="";
    public static String pouyasideoff="";
    public static String pouyatimeroner="";
    public static String pouyatimeroffer="";
    public static String pouyatimerdisable="";



    public static EditText et_destinationip ;
    public static EditText et_destinationport ;
    public static EditText et_topautoenable;
    public static EditText et_topautodisable;
    public static EditText et_sideautoenable;
    public static EditText et_sideautodisable;
    public static EditText et_topon;
    public static EditText et_topoff;
    public static EditText et_sideon;
    public static EditText et_sideoff;
    public static EditText et_timeroner;
    public static EditText et_timeroffer;
    public static EditText et_timerdisable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        TextView tv_setting_acount_name = (TextView)findViewById(R.id.tv_acount_name_setting);
        tv_setting_acount_name.setText(DadRoom.acount_name);
        et_destinationip= (EditText)findViewById(R.id.destinationip);
        et_destinationport= (EditText)findViewById(R.id.destinationport);
        et_topautoenable= (EditText)findViewById(R.id.topautoenable);
        et_topautodisable= (EditText)findViewById(R.id.topautodisable);
        et_sideautoenable= (EditText)findViewById(R.id.sideautoenable);
        et_sideautodisable= (EditText)findViewById(R.id.sideautodisable);
        et_topon= (EditText)findViewById(R.id.topon);
        et_topoff= (EditText)findViewById(R.id.topoff);
        et_sideon= (EditText)findViewById(R.id.sideon);
        et_sideoff= (EditText)findViewById(R.id.sideoff);
        et_timeroner= (EditText)findViewById(R.id.lampontimer);
        et_timeroffer= (EditText)findViewById(R.id.lampofftimer);
        et_timerdisable= (EditText)findViewById(R.id.timerdisable);

        switch (DadRoom.acount_name)
        {
            case "Master Room":
                settings.et_destinationip.setText(MainActivity.server_ip);
                settings.et_destinationport.setText(Integer.toString(MainActivity.server_port));
                settings.et_topautoenable.setText(settings.mastertopautoenable);
                settings.et_topautodisable.setText(settings.mastertopautodisable);
                settings.et_sideautoenable.setText(settings.mastersideautoenable);
                settings.et_sideautodisable.setText(settings.mastersideautodisable);
                settings.et_topon.setText(settings.mastertopon);
                settings.et_topoff.setText(settings.mastertopoff);
                settings.et_sideon.setText(settings.mastersideon);
                settings.et_sideoff.setText(settings.mastersideoff);
                settings.et_timeroner.setText(settings.mastertimeroner);
                settings.et_timeroffer.setText(settings.mastertimeroffer);
                settings.et_timerdisable.setText(settings.mastertimerdisable);
                break;
            case "Navid":
                settings.et_destinationip.setText(MainActivity.server_ip);
                settings.et_destinationport.setText(Integer.toString(MainActivity.server_port));
                settings.et_topautoenable.setText(settings.navidtopautoenable);
                settings.et_topautodisable.setText(settings.navidtopautodisable);
                settings.et_sideautoenable.setText(settings.navidsideautoenable);
                settings.et_sideautodisable.setText(settings.navidsideautodisable);
                settings.et_topon.setText(settings.navidtopon);
                settings.et_topoff.setText(settings.navidtopoff);
                settings.et_sideon.setText(settings.navidsideon);
                settings.et_sideoff.setText(settings.navidsideoff);
                settings.et_timeroner.setText(settings.navidtimeroner);
                settings.et_timeroffer.setText(settings.navidtimeroffer);
                settings.et_timerdisable.setText(settings.navidtimerdisable);
                break;
            case "Pouya":
                settings.et_destinationip.setText(MainActivity.server_ip);
                settings.et_destinationport.setText(Integer.toString(MainActivity.server_port));
                settings.et_topautoenable.setText(settings.pouyatopautoenable);
                settings.et_topautodisable.setText(settings.pouyatopautodisable);
                settings.et_sideautoenable.setText(settings.pouyasideautoenable);
                settings.et_sideautodisable.setText(settings.pouyasideautodisable);
                settings.et_topon.setText(settings.pouyatopon);
                settings.et_topoff.setText(settings.pouyatopoff);
                settings.et_sideon.setText(settings.pouyasideon);
                settings.et_sideoff.setText(settings.pouyasideoff);
                settings.et_timeroner.setText(settings.pouyatimeroner);
                settings.et_timeroffer.setText(settings.pouyatimeroffer);
                settings.et_timerdisable.setText(settings.pouyatimerdisable);
                break;


        }

        Button setting_submit = (Button)findViewById(R.id.btn_setting_submit);
        setting_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(DadRoom.acount_name)
                {
                    case("Master Room"):
                        MainActivity.server_ip=et_destinationip.getText().toString();
                        MainActivity.server_port=Integer.parseInt(et_destinationport.getText().toString());
                        mastertopautoenable=et_topautoenable.getText().toString();
                        mastertopautodisable=et_topautodisable.getText().toString();
                        mastersideautoenable=et_sideautoenable.getText().toString();
                        mastersideautodisable=et_sideautodisable.getText().toString();
                        mastertopon=et_topon.getText().toString();
                        mastertopoff=et_topoff.getText().toString();
                        mastersideon=et_sideon.getText().toString();
                        mastersideoff=et_sideoff.getText().toString();
                        mastertimeroner=et_timeroner.getText().toString();
                        mastertimeroffer=et_timeroffer.getText().toString();
                        mastertimerdisable=et_timerdisable.getText().toString();
                        break;
                    case("Navid"):

                        MainActivity.server_ip=et_destinationip.getText().toString();
                        MainActivity.server_port=Integer.parseInt(et_destinationport.getText().toString());
                        navidtopautoenable=et_topautoenable.getText().toString();
                        navidtopautodisable=et_topautodisable.getText().toString();
                        navidsideautoenable=et_sideautoenable.getText().toString();
                        navidsideautodisable=et_sideautodisable.getText().toString();
                        navidtopon=et_topon.getText().toString();
                        navidtopoff=et_topoff.getText().toString();
                        navidsideon=et_sideon.getText().toString();
                        navidsideoff=et_sideoff.getText().toString();
                        navidtimeroner=et_timeroner.getText().toString();
                        navidtimeroffer=et_timeroffer.getText().toString();
                        navidtimerdisable=et_timerdisable.getText().toString();
                        break;
                    case("Pouya"):

                        MainActivity.server_ip=et_destinationip.getText().toString();
                        MainActivity.server_port=Integer.parseInt(et_destinationport.getText().toString());
                        pouyatopautoenable=et_topautoenable.getText().toString();
                        pouyatopautodisable=et_topautodisable.getText().toString();
                        pouyasideautoenable=et_sideautoenable.getText().toString();
                        pouyasideautodisable=et_sideautodisable.getText().toString();
                        pouyatopon=et_topon.getText().toString();
                        pouyatopoff=et_topoff.getText().toString();
                        pouyasideon=et_sideon.getText().toString();
                        pouyasideoff=et_sideoff.getText().toString();
                        pouyatimeroner=et_timeroner.getText().toString();
                        pouyatimeroffer=et_timeroffer.getText().toString();
                        pouyatimerdisable=et_timerdisable.getText().toString();
                        break;


                }
                filing.Write_To_File_setting(MainActivity.context1);
                settings.this.finish();
            }
        });
    }
}
