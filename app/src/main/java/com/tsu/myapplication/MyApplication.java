package com.tsu.myapplication;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.crash.CaocConfig;
import me.goldze.mvvmhabit.utils.KLog;

public class MyApplication extends BaseApplication {

    private final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(true);
        CaocConfig.Builder.create()
                .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT)
                .enabled(true)
                .showErrorDetails(true)
                .showRestartButton(true)
                .trackActivities(true)
                .minTimeBetweenCrashesMs(2*1000)
                .errorDrawable(R.mipmap.ic_launcher)
                .restartActivity(MainActivity.class)
                //.errorActivity(MainActivity.class)
                //.eventListener(new YouserCustomEventListener())
                .apply();

        ARouter.init(this);
    }
}
