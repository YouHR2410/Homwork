package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class image extends AppCompatActivity {
    String imagurl="https://ss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/zhidao/pic/item/2934349b033b5bb5813a1d2b30d3d539b700bc71.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        RequestOptions cropOptions = new RequestOptions();
        ImageView v1 = findViewById(R.id.imageView);
        RoundedCorners roundedCorners= new RoundedCorners(60);
        RequestOptions options=RequestOptions.bitmapTransform(roundedCorners).override(300, 300);
        //cropOptions.centerCrop().circleCrop();
        Glide.with(this)
                .load(imagurl)
                .placeholder(R.drawable.loading)
                .error(R.drawable.errorr)
                .apply(options)
                //.apply(cropOptions)
                .into(v1);
    }
}
