package com.example.birdhit;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        setTitle("구매내역");

    }
}
