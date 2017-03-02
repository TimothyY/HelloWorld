package binus.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NextActivity extends AppCompatActivity {

    String TAG = "NextActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Log.v(TAG,"masuk onCreate");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.v(TAG,"masuk onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"masuk onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"masuk onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"masuk onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"masuk onDestroy");
    }
}
