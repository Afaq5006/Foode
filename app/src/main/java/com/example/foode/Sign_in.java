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
    EditText editText,editText2;
    Button login;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        DB = new DBHelper(this);
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

        editText = findViewById(R.id.sig_email);
        editText2 = findViewById(R.id.sin_pass);
        login = findViewById(R.id.LogIn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=editText.getText().toString();
                String password=editText2.getText().toString();
                Boolean checklogin=DB.checklogin(username,password);
                if (checklogin==true){
                    Intent intent=new Intent(Sign_in.this,Dashboard.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Sign_in.this, "Invalid username Password", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }


}