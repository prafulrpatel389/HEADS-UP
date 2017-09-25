package com.example.weichen.jd_injuryprecaution_prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        username = (EditText) findViewById(R.id.login_input_username);
        if (username.getText().toString().length() == 0) {
            username.setError("Username can't be empty!");
        }
        password = (EditText) findViewById(R.id.login_input_password);
        if (password.getText().toString().length() == 0)
            password.setError("Password can't be empty!");

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


    public void toMainLayout(View view){

        String _username = username.getText().toString();
        String _password = password.getText().toString();
        String type = "login";


        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, _username, _password);



    }

    public void toForgotLayout(View view) {
        startActivity(new Intent(Login.this, Forgot.class));
    }
}
