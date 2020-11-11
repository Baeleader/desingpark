package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle("회원가입");

        findViewById(R.id.registerButton).setOnClickListener(onClickListener);

        spinner = (Spinner) findViewById(R.id.majorSpinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.major, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.registerButton:
                    sighup();
                    break;
            }

        }
    };
    private void sighup(){
//        String email = ((EditText) findViewById(R.id.et_id)).getText().toString();
//        String password = ((EditText) findViewById(R.id.et_password)).getText().toString();
//        String passwordCheck = ((EditText) findViewById(R.id.et_passwordcheck)).getText().toString();
        startToast("회원가입에 성공하였습니다.");
        MoveMember();


    }

    private void startToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    private void MoveMember(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
