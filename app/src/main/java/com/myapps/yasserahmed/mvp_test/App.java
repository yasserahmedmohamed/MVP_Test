package com.myapps.yasserahmed.mvp_test;

import android.app.Application;

import com.myapps.yasserahmed.mvp_test.LoginActivityMVP.LoginModule;

public class App extends Application{
    private ApplicationCompoonent compoonent;

    @Override
    public void onCreate() {
        super.onCreate();
        compoonent =DaggerApplicationCompoonent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }


    public ApplicationCompoonent getCompoonent() {
        return compoonent;
    }
}
