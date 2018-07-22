package com.myapps.yasserahmed.mvp_test.LoginActivityMVP;

import android.support.annotation.Nullable;

import com.myapps.yasserahmed.mvp_test.User;

public class LoginActivityPresenter implements LoginActivityMVP.presenter {
    @Nullable
    private LoginActivityMVP.View view;
    private LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setview(LoginActivityMVP.View view) {
         this.view=view;

    }

    @Override
    public void loginbuttonClicked() {
        if (view!=null){
            if (view.getfirstname().trim().equals("")||view.getlastname().trim().equals("")  ){
                view.showinputerror();
            }
            else {
                model.createUser(view.getfirstname(),view.getlastname());
                view.showusersavedmessage();
            }
        }

    }

    @Override
    public void getCurrentUser() {

        User user=model.getuser();
        if (user==null){
            if (view!=null){
                view.showusernotavailable();
            }
        }else {
            if (view!=null){
                view.setfirstname(user.getFirstname());
                view.setlastname(user.getLastname());
            }
        }
    }
}
