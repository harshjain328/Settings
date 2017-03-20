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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {

    ListView lv;
    ArrayList<String> profileLabel,profileText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Edit Profile");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        lv=(ListView)findViewById(R.id.listView2);

        profileLabel=new ArrayList<>();
        profileText=new ArrayList<>();

        profileLabel.add("User Name");
        profileText.add("Dwayne Johnson");
        profileLabel.add("Height");
        profileText.add("6 ft 5 in");
        profileLabel.add("Gender");
        profileText.add("Male");
        profileLabel.add("Date of Birth");
        profileText.add("March 29, 1996");
        profileLabel.add("Country");
        profileText.add("USA");
        profileLabel.add("Time Zone");
        profileText.add("Pacific Time");
        profileLabel.add("Zip Code");
        profileText.add("380058");
        profileLabel.add("Units");
        profileText.add("Kilograms, Feet/Inches");
        mybase obj=new mybase();
        lv.setAdapter(obj);
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
            return profileLabel.size();
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

            v.label.setText(profileLabel.get(position));
            v.text.setText(profileText.get(position));
            return convertView;
        }
    }
}
