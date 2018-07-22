package com.myapps.yasserahmed.mvp_test.LoginActivityMVP;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.myapps.yasserahmed.mvp_test.App;
import com.myapps.yasserahmed.mvp_test.R;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {

    @Inject
    LoginActivityMVP.presenter presenter;

    private EditText firstname;
    private  EditText lastname;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((App)getApplication()).getCompoonent().inject(this);
        firstname=(EditText)findViewById(R.id.loginactivity_fisrtname_edittext);
        lastname=(EditText)findViewById(R.id.loginactivity_lastname_edittext);
        login=(Button)findViewById(R.id.loginactivity_login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
presenter.loginbuttonClicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setview(this);
        presenter.getCurrentUser();

    }

    @Override
    public String getfirstname() {
        return firstname.getText().toString();
    }

    @Override
    public String getlastname() {
        return lastname.getText().toString();
    }

    @Override
    public void showusernotavailable() {
        Toast.makeText(this, "Error the user is not available", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showinputerror() {
        Toast.makeText(this, "First name or last is not available", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showusersavedmessage() {
        Toast.makeText(this, "User Saved!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showNotAvailable() {


    }

    @Override
    public void setfirstname(String fname) {

        firstname.setText(fname);

    }

    @Override
    public void setlastname(String lname) {

        lastname.setText(lname);
    }
}
