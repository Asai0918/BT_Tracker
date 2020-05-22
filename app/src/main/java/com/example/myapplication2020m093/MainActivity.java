package com.example.myapplication2020m093;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogActivity(View view) {
        Intent toLog = new Intent (this,Main2Activity.class);
        startActivity(toLog);
    }

    public void goToNormalActivity(View view) {
   Intent toNormal = new Intent (this, NormalActivity.class);
   startActivity(toNormal);
    }

    public void goToMechanismActivity(View view) {
        Intent toMechanism = new Intent(this,MechanismActivity.class);
        startActivity(toMechanism);
    }

    public void goToHandleActivity(View view) {
        Intent toLink2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthline.com/health/how-to-break-a-feve"));
        startActivity(toLink2);
    }
}

