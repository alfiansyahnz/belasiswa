package com.ujuy.ahfizh.belasiswa.activity.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ujuy.ahfizh.belasiswa.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText username, password, email;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.edtUsername);
        password = (EditText) findViewById(R.id.edtPass);
        email = (EditText) findViewById(R.id.edtEmail);
        register = (Button) findViewById(R.id.btnDaftarPage);

        onClickRegister();
    }

    // HOW TO HANDLE WHEN BUTTON CLICK
    private void onClickRegister(){
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Register Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
