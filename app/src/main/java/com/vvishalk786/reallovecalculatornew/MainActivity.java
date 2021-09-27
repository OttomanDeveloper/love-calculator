package com.vvishalk786.reallovecalculatornew;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int Splash_time=2000;

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

try {


        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent newIntent = new Intent(MainActivity.this, home.class);
                startActivity(newIntent);
                finish();
            }
        }, Splash_time);

    }catch(Exception ex){
    Toast empty = Toast.makeText(getApplicationContext(), "Sorry app not opening", Toast.LENGTH_SHORT);
    empty.setGravity(Gravity.BOTTOM, 0, 200);
    empty.show();
    }

    }
}