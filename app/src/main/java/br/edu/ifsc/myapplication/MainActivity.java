package br.edu.ifsc.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag informação","Passou aqui");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag informação","onStart");
        Toast.makeText(this, "On Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("tag informação","onResume");
        Toast.makeText(this, "On Resume", Toast.LENGTH_LONG).show();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.tost_personalizado, (ViewGroup) findViewById(R.id.template_layout_personalizado));

        TextView textView = layout.findViewById(R.id.text);
        textView.setText("Ola Mundão");

        Toast toast = new Toast(this);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tag informação","onPause");
        Toast.makeText(this, "On Pause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("tag informação","onRestart");
        Toast.makeText(this, "On Restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tag informação","onStop");
        Toast.makeText(this, "On Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag informação","onDestroy");
        Toast.makeText(this, "On Destroy", Toast.LENGTH_LONG).show();
    }
}
