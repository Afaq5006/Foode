package com.example.foode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class contact_us extends AppCompatActivity {
    TextView txtmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        txtmail = findViewById(R.id.txt_mail);
        txtmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contact_us.this, contact_us.class);
                startActivity(intent);
            }
        });
    }
}