package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private long time= 0;

    EditText et_id, et_password;
    Button btn_login, btn_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("로그인");

        et_id = findViewById(R.id.et_id);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        TextView registerButton = (TextView) findViewById(R.id.btn_register);


        findViewById(R.id.btn_register).setOnClickListener(onClickListener);
        findViewById(R.id.btn_login).setOnClickListener(onClickListener);
    }

    @Override // 뒤로 버튼 두번 클릭 시 종료
    public void onBackPressed() {
        if(System.currentTimeMillis()-time>=10000){
            time=System.currentTimeMillis();
            Toast.makeText(getApplicationContext(),"뒤로 버튼을 한번 더 누르면 종료합니다.",Toast.LENGTH_SHORT).show();
        }else if(System.currentTimeMillis()-time<10000){
            finish();
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id.btn_login: // 로그인 버튼 클릭시
                            login();
                            break;
                        case R.id.btn_register: // 회원가입 클릭시
                            register();
                            break;
                    }
        }
    };

    private void login(){
//        String email = ((EditText) findViewById(R.id.et_id)).getText().toString();
//        String password = ((EditText) findViewById(R.id.et_password)).getText().toString();

        Intent loginintent = new Intent(MainActivity.this, HomeActivity.class);
        loginintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        MainActivity.this.startActivity(loginintent);

    }


    private void register(){
        Intent registerintent = new Intent(MainActivity.this, RegisterActivity.class);
        MainActivity.this.startActivity(registerintent);
    }

}
