package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FastfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);
        setTitle("fastfood");

        findViewById(R.id.btn_koreafood).setOnClickListener(onClickListener);
        findViewById(R.id.btn_westernfood).setOnClickListener(onClickListener);
        findViewById(R.id.fastfood_rakim).setOnClickListener(onClickListener);
        findViewById(R.id.fastfood_tteoksun).setOnClickListener(onClickListener);
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
                    break;

                case R.id.fastfood_tteoksun:
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
}
