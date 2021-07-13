package com.example.chapter2;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chapter2.Linear;
import com.example.chapter2.Myadapter;
import com.example.chapter2.TestData;
import com.example.chapter2.TestDataSet;

public class search extends AppCompatActivity implements Myadapter.IOnItemClickListener {
    private static final String TAG = "TAG";
    private RecyclerView recyclerView;
    private Myadapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Log.i(TAG, "RecyclerViewActivity onCreate");
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new Myadapter(TestDataSet.getData());
        mAdapter.setOnItemClickListener(this);
        recyclerView.setAdapter(mAdapter);
        Linear itemDecoration = new Linear(Color.BLUE);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        DefaultItemAnimator animator = new DefaultItemAnimator();
        animator.setAddDuration(3000);
        recyclerView.setItemAnimator(animator);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "RecyclerViewActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "RecyclerViewActivity onResume");
    }


    @Override
    public void onItemCLick(int position, TestData data) {
        Toast.makeText(search.this, "点击了第" + position + "条", Toast.LENGTH_SHORT).show();
        mAdapter.addData(position + 1, new TestData("新增头条", "0w"));
    }

    @Override
    public void onItemLongCLick(int position, TestData data) {
        Toast.makeText(search.this, "长按了第" + position + "条", Toast.LENGTH_SHORT).show();
        mAdapter.removeData(position);
    }
}