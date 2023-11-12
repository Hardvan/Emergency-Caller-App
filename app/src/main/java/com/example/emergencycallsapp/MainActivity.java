package com.example.emergencycallsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b_happy, b_mom, b_dad, b_police, b_fire, b_medical, b_all_emergency, b_call;
    TextView tv_title;
    EditText et_custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_happy = findViewById(R.id.b_happy);
        b_mom = findViewById(R.id.b_mom);
        b_dad = findViewById(R.id.b_dad);
        b_police = findViewById(R.id.b_police);
        b_fire = findViewById(R.id.b_fire);
        b_medical = findViewById(R.id.b_medical);
        b_all_emergency = findViewById(R.id.b_all_emergency);

        b_call = findViewById(R.id.b_call);
        et_custom = findViewById(R.id.et_custom);


        b_happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneCall("9845072575");
                changeTitle("Calling Happy");

            }
        });
        b_mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneCall("9972409755");
                changeTitle("Calling Mom");

            }
        });
        b_dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneCall("9945566135");
                changeTitle("Calling Dad");

            }
        });
        b_police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneCall("100");
                changeTitle("Calling Police");

            }
        });
        b_fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneCall("101");
                changeTitle("Calling Fire");

            }
        });
        b_medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneCall("108");
                changeTitle("Calling Medical");

            }
        });
        b_all_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phoneCall("112");
                changeTitle("Calling Emergency");

            }
        });

        b_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phone = et_custom.getText().toString();
                phoneCall(phone);
                changeTitle("Calling "+phone);

            }
        });

    }

    public void phoneCall(String phone) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+phone));
        startActivity(callIntent);

    }

    public void changeTitle(String text) {

        tv_title.setText(text);

    }

}