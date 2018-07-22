package com.myapps.yasserahmed.mvp_test.LoginActivityMVP;

import com.myapps.yasserahmed.mvp_test.User;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {
@Provides
    public LoginActivityMVP.presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
    return new LoginActivityPresenter(model);
}

@Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
    return new LoginActivityModel(repository);
}
@Provides
    public LoginRepository provideLoginRepositry(){
    return  new MemoryRepository();
}
}
