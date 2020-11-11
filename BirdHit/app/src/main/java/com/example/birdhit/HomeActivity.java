package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private long time= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");

        findViewById(R.id.menu).setOnClickListener(onClickListener);
        findViewById(R.id.payment).setOnClickListener(onClickListener);
        findViewById(R.id.member).setOnClickListener(onClickListener);
        findViewById(R.id.community).setOnClickListener(onClickListener);


    }

    @Override // 뒤로 버튼 두번 클릭 시 종료
    public void onBackPressed() {
        if(System.currentTimeMillis()-time>=10000){
            time=System.currentTimeMillis();
            Toast.makeText(getApplicationContext(),"뒤로 버튼을 한번 더 누르면 로그인화면으로 돌아갑니다.",Toast.LENGTH_SHORT).show();
        }else if(System.currentTimeMillis()-time<10000){
            finish();
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.menu:
                    menu();
                    break;

                case R.id.payment:
                    payment();
                    break;

                case R.id.member:
                    member();
                    break;

                case R.id.community:
                    community();
                    break;
            }

        }
    };
    private void menu(){
        Intent menu = new Intent(HomeActivity.this, KoreafoodActivity.class);
        HomeActivity.this.startActivity(menu);
    }
    private void payment(){
        Intent payment = new Intent(HomeActivity.this, PaymentActivity.class);
        HomeActivity.this.startActivity(payment);
    }
    private void member(){
        Intent member = new Intent(HomeActivity.this, MemberActivity.class);
        HomeActivity.this.startActivity(member);
    }
    private void community(){
        Intent community = new Intent(HomeActivity.this, CommunityActivity.class);
        HomeActivity.this.startActivity(community);
    }
}