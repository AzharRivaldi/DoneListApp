package com.mig.donelistapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mig.donelistapp.model.MySharedPref;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton ok;
    EditText et;
    TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        ok = (FloatingActionButton) findViewById(R.id.ok);
        nama = (TextView) findViewById(R.id.aktivitas);
        nama.setText("Aktivitas : " + MySharedPref.setAktivitas(MainActivity.this, ""));
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tnama = et.getText().toString();
                MySharedPref.getAktivitas(MainActivity.this, tnama);
                nama.setText("Aktivitas : " + tnama);

            }
        });
    }
}
