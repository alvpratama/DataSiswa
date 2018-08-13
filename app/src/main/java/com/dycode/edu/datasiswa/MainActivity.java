package com.dycode.edu.datasiswa;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    List<SiswaModel>lisSiswaModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        lisSiswaModel = MyApp.db.userDao().getAll();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MainAdappter adappter = new MainAdappter(this, lisSiswaModel);
        recyclerView.setAdapter(adappter);
    }

    @OnClick(R.id.fab)
    public void onViewClicked(){
        startActivity(new Intent(this, AddSiswaActivity.class));
    }
}
