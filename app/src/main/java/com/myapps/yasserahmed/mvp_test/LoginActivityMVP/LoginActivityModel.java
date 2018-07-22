package com.myapps.yasserahmed.mvp_test.LoginActivityMVP;

import com.myapps.yasserahmed.mvp_test.User;

public class LoginActivityModel  implements LoginActivityMVP.Model   {
    private LoginRepository repository;

    public LoginActivityModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String fname, String lname) {

        repository.setuser(new User(fname,lname));
    }

    @Override
    public User getuser() {
        return repository.getuser();
    }
}
