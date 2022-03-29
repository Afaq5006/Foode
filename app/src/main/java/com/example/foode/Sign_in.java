package com.example.foode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_in extends AppCompatActivity {
    TextView textView, repass;
    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        textView = (TextView) findViewById(R.id.Reg_1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sign_in.this,register_now.class);
                startActivity(intent);
            }
        });

        repass = findViewById(R.id.TV_forget);
        repass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_in.this, RePassword.class);
                startActivity(intent);
            }
        });

        email = findViewById(R.id.sig_email);
        password = findViewById(R.id.sin_pass);
        login = findViewById(R.id.LogIn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }

    private void login() {
        String Email = email.getText().toString();
        String Password = password.getText().toString();
        if (Email.isEmpty())
        {
            email.setError("Email not Found");
        }
        if (Password.isEmpty())
        {
            password.setError("Password not Found");
        }
        else
        {
            
        }
    }
}