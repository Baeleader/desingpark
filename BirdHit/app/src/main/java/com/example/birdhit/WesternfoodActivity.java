package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WesternfoodActivity extends AppCompatActivity {

    TextView tv_westerntext;
    TextView txt_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_westernfood);
        setTitle("westernfood");
        findViewById(R.id.btn_koreafood).setOnClickListener(onClickListener);
        findViewById(R.id.btn_fastfood).setOnClickListener(onClickListener);
        findViewById(R.id.westernfood_porkcutlet).setOnClickListener(onClickListener);
        findViewById(R.id.westernfood_spaghetti).setOnClickListener(onClickListener);
        findViewById(R.id.btn_payment).setOnClickListener(onClickListener);

        tv_westerntext = findViewById(R.id.tv_westerntext);
        txt_payment = findViewById(R.id.txt_payment);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_koreafood:
                    Movekoreafood();
                    break;

                case R.id.btn_fastfood:
                    Movefastfood();
                    break;

                case R.id.westernfood_porkcutlet: // 버튼 클릭시 수량 체크하기
                    Getpork();
                    break;

                case R.id.westernfood_spaghetti:
                    Getspaghetti();
                    break;
                case R.id.btn_payment:
                    Movepayment();
                    break;
            }

        }
    };
    private void Movekoreafood(){
        Intent koreafood = new Intent(WesternfoodActivity.this, KoreafoodActivity.class);
        koreafood.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        WesternfoodActivity.this.startActivity(koreafood);
    }
    private void Movefastfood(){
        Intent fastfood = new Intent(WesternfoodActivity.this, FastfoodActivity.class);
        fastfood.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        WesternfoodActivity.this.startActivity(fastfood);
    }
    private void MoveHome(){
        Intent Home = new Intent(WesternfoodActivity.this, HomeActivity.class);
        Home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        WesternfoodActivity.this.startActivity(Home);
    }
    private void Getpork(){
        tv_westerntext.setText("돈까스                                    1");
        txt_payment.setText("5000KPI");
    }
    private void Getspaghetti(){
        tv_westerntext.setText("스파게티                                 1");
        txt_payment.setText("5000KPI");
    }
    private void Movepayment(){
        startToast("결제가 완료되었습니다.");
        Intent mainhome = new Intent(WesternfoodActivity.this, HomeActivity.class);
        mainhome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        WesternfoodActivity.this.startActivity(mainhome);
    }
    private void startToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    @Override // 뒤로 버튼 클릭 시 Home화면으로 이동
    public void onBackPressed() {
        MoveHome();
    }
}
