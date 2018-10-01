package com.viernes.david;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ith", "Created");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ith", "Paused");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ith", "Started");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ith", "Restarted");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ith", "Resumed");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ith", "Destroyed");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ith", "Paused");
    }
    public void displayToast(View v){
        Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
        //Snackbar.make(v, "Hello again", Snackbar.LENGTH_LONG).show();
    }
    public void displaySnack(View v){
        //Toast.makeText(this, "Hello 4ith..", Toast.LENGTH_SHORT).show();
        Snackbar.make(v, "This is a Snackbar", Snackbar.LENGTH_LONG).show();
    }
}
