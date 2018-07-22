package com.myapps.yasserahmed.mvp_test.LoginActivityMVP;

import com.myapps.yasserahmed.mvp_test.User;

public class MemoryRepository  implements LoginRepository {
    private User user;

    @Override
    public User getuser() {
        if (user==null){
            User user=new User("yasser","ahmed");
            user.setId(0);
            return user;
        }

        return user;
    }

    @Override
    public void setuser(User user) {

        if (user==null){
            user=getuser();
        }
        this.user=user;

    }
}
