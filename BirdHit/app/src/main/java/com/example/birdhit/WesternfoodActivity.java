package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WesternfoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_westernfood);
        setTitle("westernfood");
        findViewById(R.id.btn_koreafood).setOnClickListener(onClickListener);
        findViewById(R.id.btn_fastfood).setOnClickListener(onClickListener);
        findViewById(R.id.westernfood_porkcutlet).setOnClickListener(onClickListener);
        findViewById(R.id.westernfood_spaghetti).setOnClickListener(onClickListener);
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
                    break;

                case R.id.westernfood_spaghetti:
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
    @Override // 뒤로 버튼 클릭 시 Home화면으로 이동
    public void onBackPressed() {
        MoveHome();
    }
}
