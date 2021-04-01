package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.AnalyticsListener;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SiswaAdapter adapter;
    private ArrayList<Siswa> siswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();

        adapter = new SiswaAdapter(siswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    void addData(){
        siswaArrayList = new ArrayList<>();
        siswaArrayList.add(new Siswa("Muhammad", "909", "081222","Muhammad@gmail.com"));
        siswaArrayList.add(new Siswa("Samy", "010", "081222", "Samy@gmail.com"));
        siswaArrayList.add(new Siswa("Syafta", "100", "083333", "Syafta@gmail.com"));
        Siswa Yanto = new Siswa("Yanto", "202" , "123", "Yanto@gmail.com");
        siswaArrayList.add(Yanto);
    }
}