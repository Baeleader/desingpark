package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KoreafoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreafood);

        setTitle("koreafood");

        findViewById(R.id.btn_fastfood).setOnClickListener(onClickListener);
        findViewById(R.id.btn_westernfood).setOnClickListener(onClickListener);
        findViewById(R.id.koreafood_bibimbab).setOnClickListener(onClickListener);
        findViewById(R.id.koreafood_kimchistew).setOnClickListener(onClickListener);


    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_fastfood:
                    Movefastfood();
                    break;

                case R.id.btn_westernfood:
                    Movewesternfood();
                    break;

                case R.id.koreafood_bibimbab: // 버튼 클릭시 수량 체크하기
                    break;

                case R.id.koreafood_kimchistew:
                    break;
            }

        }
    };
    private void Movefastfood(){
        Intent fastfood = new Intent(KoreafoodActivity.this, FastfoodActivity.class);
        fastfood.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        KoreafoodActivity.this.startActivity(fastfood);
    }
    private void Movewesternfood(){
        Intent westernfood = new Intent(KoreafoodActivity.this, WesternfoodActivity.class);
        westernfood.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        KoreafoodActivity.this.startActivity(westernfood);
    }

}
