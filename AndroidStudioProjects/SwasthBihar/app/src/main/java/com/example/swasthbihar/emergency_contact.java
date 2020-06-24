package com.example.swasthbihar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class emergency_contact extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);

        TextView nhn;
        nhn=findViewById(R.id.textView36);
        nhn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+911800112545"));
                startActivity(intent);
            }
        });

        TextView bhn;
        bhn=findViewById(R.id.textView39);
        bhn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0612 2217781"));
                startActivity(intent);
            }
        });

        TextView cf;
        cf=findViewById(R.id.textView41);
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91101"));
                startActivity(intent);
            }
        });

    }
    public void onBackPressed(){
        Intent intent = new Intent(emergency_contact.this, home.class);
        startActivity(intent);
        finish();
    }
}
