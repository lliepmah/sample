package ru.kodep.sample.sampleproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int mFinalTestForLint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);
        findViewById(R.id.ac_main_tv_test).setOnClickListener(this::testLambda);

        mFinalTestForLint = 2;

    }

    private void testLambda(View view) {
        Log.d(MainActivity.class.getName(), "-> testLambda ->");
    }
}
