package com.luocj.wanandroidx.actyivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import com.luocj.wanandroidx.MainActivity;
import com.luocj.wanandroidx.R;
import com.luocj.wanandroidx.databinding.ActivityLoginBinding;
import com.luocj.wanandroidx.model.LoginViewModel;

public class LoginActivity extends AppCompatActivity {


    private ActivityLoginBinding dataBinding;
    private LoginViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        dataBinding.setLifecycleOwner(this);
        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        dataBinding.setLogin(viewModel);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,TestActivity.class ));
            }
        });


    }
}
