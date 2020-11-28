package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class KoreafoodActivity extends AppCompatActivity {

    TextView tv_koreatext;
    TextView txt_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreafood);

        setTitle("koreafood");


        findViewById(R.id.btn_fastfood).setOnClickListener(onClickListener);
        findViewById(R.id.btn_westernfood).setOnClickListener(onClickListener);
        findViewById(R.id.koreafood_bibimbab).setOnClickListener(onClickListener);
        findViewById(R.id.koreafood_kimchistew).setOnClickListener(onClickListener);
        findViewById(R.id.btn_payment).setOnClickListener(onClickListener);

        tv_koreatext = findViewById(R.id.tv_koreatext);
        txt_payment = findViewById(R.id.txt_payment);





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
                    Getbibimbab();
                    break;

                case R.id.koreafood_kimchistew:
                    Getkimchistew();
                    break;
                case R.id.btn_payment:
                    Movepayment();
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
        tv_koreatext.setText("비빔밥                                       1");
        txt_payment.setText("3500KPI");
    }
    private void Getkimchistew(){
        tv_koreatext.setText("김치찌개                                   1");
        txt_payment.setText("4000KPI");
    }
    private void Movepayment(){
        startToast("결제가 완료되었습니다.");
        Intent mainhome = new Intent(KoreafoodActivity.this, HomeActivity.class);
        mainhome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        KoreafoodActivity.this.startActivity(mainhome);
    }
    private void startToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
