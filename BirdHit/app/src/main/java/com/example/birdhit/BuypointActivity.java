package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BuypointActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buypoint);

        setTitle("포인트구매");

        findViewById(R.id.btn_buykpi).setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_buykpi:
                    BuyPoint();
                    break;

            }

        }
    };
    private void BuyPoint(){
        Intent point = new Intent(BuypointActivity.this, HomeActivity.class);
        point.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Toast.makeText(getApplicationContext(),"KPI구매에 완료하였습니다.",Toast.LENGTH_SHORT).show();
        BuypointActivity.this.startActivity(point);
    }
}
