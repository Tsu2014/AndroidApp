package com.tsu.myapplication.login;

import android.app.Application;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.tsu.myapplication.R;

import me.goldze.mvvmhabit.BR;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class LoginViewModel extends BaseViewModel {

    private final String TAG = "LoginViewModel";

    public ObservableField<String> userName = new ObservableField<>("");
    public ObservableField<String> tipText = new ObservableField<>("");
    public ObservableField<String> imgUrl = new ObservableField<>("");
    public final ObservableField<NetWorkItemViewModel> observableList = new ObservableField<NetWorkItemViewModel>();
    public final ItemBinding<NetWorkItemViewModel> itemBinding = ItemBinding.of(BR.viewModel , R.layout.item_network);

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public View.OnClickListener loginOnClick = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            String unameText = userName.get();
            tipText.set("hello : "+unameText);
            Log.d(TAG , "editeText : "+unameText);
        }
    };

    public BindingCommand loginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            String unameText = userName.get();
            tipText.set("你好 : "+unameText);
            Log.d(TAG , "editeText : "+unameText);
            imgUrl.set("https://www.baidu.com/img/flexible/logo/pc/result.png");
        }
    });

}
