package com.example.fragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    fragA fragA;
    fragB fragB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();


        if (savedInstanceState==null) {
            fragA = new fragA();
            fragmentManager.beginTransaction().add(R.id.frame_a, fragA, "fragA").commit();

            fragB = new fragB();
            fragmentManager.beginTransaction().add(R.id.frame_b, fragB, "fragB").commit();
        }

    }
}
