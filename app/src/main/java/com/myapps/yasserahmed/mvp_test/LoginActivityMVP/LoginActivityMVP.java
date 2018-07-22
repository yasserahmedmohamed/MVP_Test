package com.myapps.yasserahmed.mvp_test.LoginActivityMVP;

import com.myapps.yasserahmed.mvp_test.User;

public class LoginActivityMVP {

   public
   interface View{
        String getfirstname();
        String getlastname();

        void showusernotavailable();
        void showinputerror();
        void showusersavedmessage();

        void showNotAvailable();
        void setfirstname(String fname);
        void setlastname(String lname);
    }

   public interface presenter{
        void  setview(LoginActivityMVP.View view);
        void loginbuttonClicked();
        void  getCurrentUser();
    }
   public interface Model{
        void  createUser(String fname,String lname);
        User getuser();

    }
}
