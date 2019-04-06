package com.mig.donelistapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mig.donelistapp.model.DbHelper;

public class RegisterActivity extends AppCompatActivity {
    private Button reg;
    private EditText etName, etEmail, etPass;
    private DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DbHelper(this);
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);

        Button login = (Button) findViewById(R.id.btnReg);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        String nama = etName.getText().toString();
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();
        if (nama.isEmpty() && email.isEmpty() && pass.isEmpty()) {
            displayToast("Data tidak boleh ada yang kosong!");
        } else {
            db.addUser(nama, email, pass);
            displayToast("Selesai");
            finish();
        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
