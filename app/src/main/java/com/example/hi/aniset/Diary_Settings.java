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
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Diary_Settings extends AppCompatActivity {
    ListView lv;
    ArrayList<String> diarySLabel;
    ArrayList<Boolean> diaryState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary__settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Diary Settings");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lv=(ListView)findViewById(R.id.listView6);

        diarySLabel=new ArrayList<>();

        diarySLabel.add("Show all Meals in Diary Tabs");
        diarySLabel.add("Use Multi-Add by Default");
        diarySLabel.add("Show Diary Food Insights");
        diarySLabel.add("Customize Meal Names");



        mybase2 obj3=new mybase2();
        lv.setAdapter(obj3);

    }
    class mybase2 extends BaseAdapter
    {
        LayoutInflater layoutInflater;
        mybase2()
        {
            layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return diarySLabel.size();
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
            TextView label;
            CheckBox checkBox;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder v=null;
            if (convertView == null) {
                v=new ViewHolder();
                convertView= layoutInflater.inflate(R.layout.diary_row,null);
                v.label=(TextView)convertView.findViewById(R.id.textView6);
                v.checkBox=(CheckBox)convertView.findViewById(R.id.checkBox1);
                convertView.setTag(v);
            }
            else
            {
                v=(ViewHolder) convertView.getTag();
            }

            v.label.setText(diarySLabel.get(position));
            return convertView;
        }
    }

}
