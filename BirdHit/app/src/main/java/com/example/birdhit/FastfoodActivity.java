package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FastfoodActivity extends AppCompatActivity {

    TextView tv_fasttext;
    TextView txt_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);
        setTitle("fastfood");

        findViewById(R.id.btn_koreafood).setOnClickListener(onClickListener);
        findViewById(R.id.btn_westernfood).setOnClickListener(onClickListener);
        findViewById(R.id.fastfood_rakim).setOnClickListener(onClickListener);
        findViewById(R.id.fastfood_tteoksun).setOnClickListener(onClickListener);
        findViewById(R.id.btn_payment).setOnClickListener(onClickListener);

        tv_fasttext = findViewById(R.id.tv_fasttext);
        txt_payment = findViewById(R.id.txt_payment);

    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_koreafood:
                    Movekoreafood();
                    break;

                case R.id.btn_westernfood:
                    Movewesternfood();
                    break;

                case R.id.fastfood_rakim: // 버튼 클릭시 수량 체크하기
                    Getrakim();
                    break;

                case R.id.fastfood_tteoksun:
                    Gettteoksum();
                    break;
                case R.id.btn_payment:
                    Movepayment();
                    break;
            }

        }
    };
    private void Movekoreafood(){
        Intent koreafood = new Intent(FastfoodActivity.this, KoreafoodActivity.class);
        koreafood.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        FastfoodActivity.this.startActivity(koreafood);
    }
    private void Movewesternfood(){
        Intent westernfood = new Intent(FastfoodActivity.this, WesternfoodActivity.class);
        westernfood.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        FastfoodActivity.this.startActivity(westernfood);
    }
    private void MoveHome(){
        Intent Home = new Intent(FastfoodActivity.this, HomeActivity.class);
        Home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        FastfoodActivity.this.startActivity(Home);
    }
    private void Getrakim(){
        tv_fasttext.setText("라면과김밥                              1");
        txt_payment.setText("4500KPI");
    }
    private void Gettteoksum(){
        tv_fasttext.setText("떡볶이와순대                           1");
        txt_payment.setText("4000KPI");
    }
    private void Movepayment(){
        startToast("결제가 완료되었습니다.");
        Intent mainhome = new Intent(FastfoodActivity.this, HomeActivity.class);
        mainhome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        FastfoodActivity.this.startActivity(mainhome);
    }
    private void startToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    @Override // 뒤로 버튼 클릭 시 Home화면으로 이동
    public void onBackPressed() {
        MoveHome();
    }
}
