package com.tsu.myapplication.login;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tsu.myapplication.BR;
import com.tsu.myapplication.R;
import com.tsu.myapplication.databinding.ActivityLoginBinding;

import me.goldze.mvvmhabit.base.BaseActivity;

@Route(path = "/login/LoginActivity")
public class LoginActivity extends BaseActivity<ActivityLoginBinding , LoginViewModel> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
    }

    @Override
    public LoginViewModel initViewModel() {
        return ViewModelProviders.of(this).get(LoginViewModel.class);
    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
