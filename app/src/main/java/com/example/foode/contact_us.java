package com.example.foode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class contact_us extends AppCompatActivity {
    TextView txtmail, txtnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        txtmail = findViewById(R.id.txt_mail);
        txtmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contact_us.this, contact_mail.class);
                startActivity(intent);
            }
        });

        txtnum = findViewById(R.id.txt_num);
        txtnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl="http://wa.me/+923086045982?text=Hi,Is Any Available ?";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
    }
}