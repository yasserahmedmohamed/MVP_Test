package com.myapps.yasserahmed.mvp_test;

import android.app.Application;

import com.myapps.yasserahmed.mvp_test.LoginActivityMVP.LoginActivity;
import com.myapps.yasserahmed.mvp_test.LoginActivityMVP.LoginModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component (modules= {ApplicationModule.class, LoginModule.class})
public interface ApplicationCompoonent {
    void inject(LoginActivity target);
}
