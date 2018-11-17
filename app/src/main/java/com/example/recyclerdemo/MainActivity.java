package com.example.recyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    ArrayList<Person> al;
    Person p;

    MyAdapter md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        r1 = findViewById(R.id.rc);

        RecyclerView.LayoutManager rlm = new LinearLayoutManager(this);

        r1.setLayoutManager(rlm);

        al = new ArrayList<>();

        for(int i=1; i<=10;i++) {
            p = new Person();
            p.setName("ABHISHEK TYAGI " + i);
            p.setDesc("I am a Teacher");
            p.setImage(R.drawable.lpu);
            al.add(p);
        }

        md = new MyAdapter(this,al);

        r1.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));

        r1.setAdapter(md);

    }
}
