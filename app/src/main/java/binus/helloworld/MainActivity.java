package binus.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String TAG = "MainActivity";

    //deklarasi variabel
    TextView tvHello;
    EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG,"masuk onCreate");

        //inisiasi variabel
        tvHello = (TextView)findViewById(R.id.tvHello);
        tvHello.setOnClickListener(this);
        etInput = (EditText) findViewById(R.id.etInput);
        etInput.setError("Error cuy");

        Toast.makeText(this, "Doraemon", Toast.LENGTH_LONG).show();

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

    @Override
    public void onClick(View view) {
        //pindah halaman
        Intent niat = new Intent(this,NextActivity.class);
        startActivity(niat);
    }
}
