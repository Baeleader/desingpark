package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class KoreafoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreafood);

        setTitle("koreafood");

        // 빈 데이터 리스트 생성
        final ArrayList<String> items = new ArrayList<String>();

        // ArrayAdapter 생성, 아이템 View를 선택(Single choic)가능하도록 만듦.
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, items);

        // Listview 생성 및 adapter 지정.
        final ListView listview = (ListView) findViewById(R.id.list_payment);
        listview.setAdapter(adapter);


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

                case R.id.koreafood_bibimbab: // 버튼 클릭시 장바구니 아이템 담기
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
    private void Getbibimbab(){

    }

}
