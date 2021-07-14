package com.example.chapter3.homework;

import com.airbnb.lottie.LottieAnimationView;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PlaceholderFragment extends Fragment {
    private static final String TAG = "TAG";
    private RecyclerView recyclerView;
    private Myadapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    Context context;
    private GridLayoutManager gridLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO ex3-3: 修改 fragment_placeholder，添加 loading 控件和列表视图控件
       // return inflater.inflate(R.layout.fragment_placeholder, container, false);
        View view=inflater.inflate(R.layout.fragment_placeholder,container,false);
        context=view.getContext();
        recyclerView=view.findViewById(R.id.rv);
        recyclerView.setAlpha(0);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(context);
        mAdapter = new Myadapter(TestDataSet.getData());
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(RecyclerView.VERTICAL );
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(context,LinearLayoutManager.VERTICAL));
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getView().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 这里会在 5s 后执行
                // TODO ex3-4：实现动画，将 lottie 控件淡出，列表数据淡入
                LottieAnimationView animationView = getView().findViewById(R.id.animation_view);
                animationView.setAlpha(1f);
                ObjectAnimator animator3 = ObjectAnimator.ofFloat(animationView,"alpha",1.0f,0.0f);
                animator3.setDuration(1000);
                View bview = getView().findViewById(R.id.rv);
                ObjectAnimator animator4 = ObjectAnimator.ofFloat(bview,"alpha",0.0f,1.0f);
                animator4.setDuration(1000);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(animator3,animator4);
                animatorSet.start();
            }
        }, 5000);
    }
}
