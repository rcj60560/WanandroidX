package com.luocj.wanandroidx.actyivity.splash;

import android.content.Intent;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.multidex.MultiDex;

import com.luocj.wanandroidx.MainActivity;
import com.luocj.wanandroidx.R;
import com.luocj.wanandroidx.actyivity.LoginActivity;

/**
 * 欢迎页面
 * 2020年3月11日17:42:16
 */
public class SplashAvtivity extends AppCompatActivity {

    private ViewDataBinding viewDataBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        new Handler()
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashAvtivity.this, LoginActivity.class));
                        finish();
                    }
                }, 2000);
    }
}
