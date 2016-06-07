package com.miaow.haifei.lovebaby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private int current=0;
    private int todayN = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView togetherV = (TextView) findViewById(R.id.together);
        String data = getResources().getString(R.string.togetherStr);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        int days = 10000;
        try {
            long from = df.parse("2014-11-7").getTime();
            long to = df.parse(df.format(new Date())).getTime();
            days = (int)((to - from) / (1000 * 60 * 60 * 24));
        }catch (ParseException e){
            e.printStackTrace();
        }
        data = String.format(data, days);
        togetherV.setText(data);

        View v = findViewById(R.id.layout);
        v.getBackground().setAlpha(60);
        todayN = getNow();
        init();
    }

    public void clickPre(View view){
        current --;
        current = (current <1) ? 0:current;
        setCurrent(current);
        TextView titleView = (TextView)findViewById(R.id.titledetail);
        if (current<todayN){
            titleView.setText(R.string.detailYes);
        }else{
            titleView.setText(R.string.detailNo);
        }
    }

    public void clickReset(View view){
        init();
    }

    public void clickNext(View view){
        current ++;
        current = (current >14) ? 15:current;
        setCurrent(current);
        TextView titleView = (TextView)findViewById(R.id.titledetail);
        if (current<todayN){
            titleView.setText(R.string.detailYes);
        }else{
            titleView.setText(R.string.detailNo);
        }
    }

    public void init() {
        TextView titleView = (TextView)findViewById(R.id.titledetail);
        titleView.setText(R.string.detailNo);

        long epoch = System.currentTimeMillis()/1000;

        if(epoch<1461736800L){
            setCurrent(1);
            current=1;
        }else if (epoch<1461754800L){
            setCurrent(2);
            current=2;
        }else if (epoch<1462341600L){
            setCurrent(3);
            current=3;
        }else if (epoch<1462357800L){
            setCurrent(4);
            current=4;
        }else if (epoch<1462789800L){
            setCurrent(5);
            current=5;
        }else if (epoch<1462946400L){
            setCurrent(6);
            current=6;
        }else if (epoch<1462964400L){
            setCurrent(7);
            current=7;
        }else if (epoch<1463187600L){
            setCurrent(8);
            current=8;
        }else if (epoch<1463551200L){
            setCurrent(9);
            current=9;
        }else if (epoch<1463569200L){
            setCurrent(10);
            current=10;
        }else if (epoch<1464156000L){
            setCurrent(11);
            current=11;
        }else if (epoch<1464174000L){
            setCurrent(12);
            current=12;
        }else if (epoch<1464242400L){
            setCurrent(13);
            current=13;
        }else if (epoch<1464760800L){
            setCurrent(14);
            current=14;
        }else{
            setCurrent(15);
        }
    }

    public int getNow(){
        long epoch = System.currentTimeMillis()/1000;
        if(epoch<1461736800L){
            return 1;
        }else if (epoch<1461754800L){
            return 2;
        }else if (epoch<1462341600L){
            return 3;
        }else if (epoch<1462357800L){
            return 4;
        }else if (epoch<1462789800L){
            return 5;
        }else if (epoch<1462946400L){
            return 6;
        }else if (epoch<1462964400L){
            return 7;
        }else if (epoch<1463187600L){
            return 8;
        }else if (epoch<1463551200L){
            return 9;
        }else if (epoch<1463569200L){
            return 10;
        }else if (epoch<1464156000L){
            return 11;
        }else if (epoch<1464174000L){
            return 12;
        }else if (epoch<1464242400L){
            return 13;
        }else if (epoch<1464760800L){
            return 14;
        }else{
            return 15;
        }
    }

    public void setCurrent(int index){
        TextView weekView = (TextView)findViewById(R.id.week);
        TextView dateView = (TextView)findViewById(R.id.date);
        TextView timeView = (TextView)findViewById(R.id.time);
        TextView subjectView = (TextView)findViewById(R.id.subject);
        TextView nameView = (TextView)findViewById(R.id.name);

        switch(index){
            case 1:
                weekView.setText(R.string.week101);
                dateView.setText(R.string.date427);
                timeView.setText(R.string.time14);
                subjectView.setText(R.string.subjectRJ);
                nameView.setText(R.string.name1);
                break;
            case 2:
                weekView.setText(R.string.week102);
                dateView.setText(R.string.date427);
                timeView.setText(R.string.time19);
                subjectView.setText(R.string.subjectRJ);
                nameView.setText(R.string.name2);
                break;
            case 3:
                weekView.setText(R.string.week111);
                dateView.setText(R.string.date504);
                timeView.setText(R.string.time14);
                subjectView.setText(R.string.subjectRS);
                nameView.setText(R.string.name3);
                break;
            case 4:
                weekView.setText(R.string.week112);
                dateView.setText(R.string.date504);
                timeView.setText(R.string.time18);
                subjectView.setText(R.string.subjectJS);
                nameView.setText(R.string.name4);
                break;
            case 5:
                weekView.setText(R.string.week12Mon);
                dateView.setText(R.string.date509);
                timeView.setText(R.string.time18);
                subjectView.setText(R.string.subjectJS);
                nameView.setText(R.string.name5);
                break;
            case 6:
                weekView.setText(R.string.week121);
                dateView.setText(R.string.date511);
                timeView.setText(R.string.time14);
                subjectView.setText(R.string.subjectRJ);
                nameView.setText(R.string.name6);
                break;
            case 7:
                weekView.setText(R.string.week122);
                dateView.setText(R.string.date511);
                timeView.setText(R.string.time19);
                subjectView.setText(R.string.subjectRJ);
                nameView.setText(R.string.name8);
                break;
            case 8:
                weekView.setText(R.string.week123);
                dateView.setText(R.string.date514);
                timeView.setText(R.string.time9);
                subjectView.setText(R.string.subjectRS);
                nameView.setText(R.string.name7);
                break;
            case 9:
                weekView.setText(R.string.week131);
                dateView.setText(R.string.date518);
                timeView.setText(R.string.time14);
                subjectView.setText(R.string.subjectBFRC);
                nameView.setText(R.string.name9);
                break;
            case 10:
                weekView.setText(R.string.week132);
                dateView.setText(R.string.date518);
                timeView.setText(R.string.time19);
                subjectView.setText(R.string.subjectRC);
                nameView.setText(R.string.name10);
                break;
            case 11:
                weekView.setText(R.string.week141);
                dateView.setText(R.string.date525);
                timeView.setText(R.string.time14);
                subjectView.setText(R.string.subjectRC);
                nameView.setText(R.string.name11);
                break;
            case 12:
                weekView.setText(R.string.week142);
                dateView.setText(R.string.date525);
                timeView.setText(R.string.time19);
                subjectView.setText(R.string.subjectRC);
                nameView.setText(R.string.name12);
                break;
            case 13:
                weekView.setText(R.string.week143);
                dateView.setText(R.string.date526);
                timeView.setText(R.string.time14);
                subjectView.setText(R.string.subjectRC);
                nameView.setText(R.string.name13);
                break;
            case 14:
                weekView.setText(R.string.week151);
                dateView.setText(R.string.date601);
                timeView.setText(R.string.time14);
                subjectView.setText(R.string.subjectBFRC);
                nameView.setText(R.string.name14);
                break;
            default:
                weekView.setText(R.string.yeah);
                dateView.setText(R.string.yeah);
                timeView.setText(R.string.yeah);
                subjectView.setText(R.string.yeah);
                nameView.setText(R.string.yeah);

        }


    }
}
