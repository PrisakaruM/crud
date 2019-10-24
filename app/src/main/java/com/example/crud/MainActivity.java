package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText login;
    public EditText password;
    public TextView alert;
    public Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        alert = findViewById(R.id.alert);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alert.setAlpha(1);
                alert.setText("login: "
                              .concat(login.getText().toString())
                              .concat("\nPassword: ")
                              .concat(password.getText().toString()));

                submit.setAlpha(0);
            }
        });
    }
}
