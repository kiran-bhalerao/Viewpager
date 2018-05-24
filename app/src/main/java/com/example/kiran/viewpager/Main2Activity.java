package com.example.kiran.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String num = bundle.getString("message");

        Toast.makeText(this, num, Toast.LENGTH_SHORT).show();
        viewPager=findViewById(R.id.viewpager);
        Pager adapter=new Pager(this,Integer.parseInt(num));
        viewPager.setAdapter(adapter);
    }
}
