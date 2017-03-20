package com.example.hi.aniset;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Goals extends AppCompatActivity {
    ListView lv,lv2,lv3;
    ArrayList<String> goalLabel,goalText,fGoalLabel,fGoalText,nGoalLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lv=(ListView)findViewById(R.id.listView3);
        lv2=(ListView) findViewById(R.id.listView4);
        lv3=(ListView)findViewById(R.id.listView5);
        goalLabel=new ArrayList<>();
        goalText=new ArrayList<>();
        fGoalLabel=new ArrayList<>();
        fGoalText=new ArrayList<>();
        nGoalLabel=new ArrayList<>();

        goalLabel.add("Starting Weight");
        goalText.add("80 kg on 30-Nov-2016");
        goalLabel.add("Current Weight");
        goalText.add("75");
        goalLabel.add("Goal Weight");
        goalText.add("60");
        goalLabel.add("Weekly Goal");
        goalText.add("Gain 0.75 kg per week");
        goalLabel.add("Activity Level");
        goalText.add("Active");

        nGoalLabel.add("Calorie and Macronutrient Goals");
        nGoalLabel.add("Additional Nutrients Goals");

        fGoalLabel.add("Workouts/Week");
        fGoalText.add("0");
        fGoalLabel.add("Minutes/Workout");
        fGoalText.add("0");

        mybase obj=new mybase();
        mybase1 obj1=new mybase1();
        ArrayAdapter obj2=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,nGoalLabel);
        lv.setAdapter(obj);
        lv2.setAdapter(obj1);
        lv3.setAdapter(obj2);
    }

    class mybase extends BaseAdapter
    {
        LayoutInflater layoutInflater;
        mybase()
        {
            layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return goalLabel.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        class ViewHolder
        {
            TextView label,text;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder v=null;
            if (convertView == null) {
                v=new ViewHolder();
                convertView= layoutInflater.inflate(R.layout.profile_row,null);
                v.label=(TextView)convertView.findViewById(R.id.textView2);
                v.text=(TextView)convertView.findViewById(R.id.textView3);
                convertView.setTag(v);
            }
            else
            {
                v=(ViewHolder) convertView.getTag();
            }

            v.label.setText(goalLabel.get(position));
            v.text.setText(goalText.get(position));
            return convertView;
        }
    }

    class mybase1 extends BaseAdapter
    {
        LayoutInflater layoutInflater;
        mybase1()
        {
            layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return fGoalLabel.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        class ViewHolder
        {
            TextView label,text;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder v=null;
            if (convertView == null) {
                v=new ViewHolder();
                convertView= layoutInflater.inflate(R.layout.profile_row,null);
                v.label=(TextView)convertView.findViewById(R.id.textView2);
                v.text=(TextView)convertView.findViewById(R.id.textView3);
                convertView.setTag(v);
            }
            else
            {
                v=(ViewHolder) convertView.getTag();
            }

            v.label.setText(fGoalLabel.get(position));
            v.text.setText(fGoalText.get(position));
            return convertView;
        }
    }

}
