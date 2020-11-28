package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PostActivity extends AppCompatActivity {

    private EditText mTitle, mContents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        setTitle("타이틀");

        mTitle = findViewById(R.id.post_title_edit);
        mContents = findViewById(R.id.post_contents_edit);

        findViewById(R.id.post_save_button).setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.post_save_button:
                    Movesave();
                    break;
            }
        }
    };

    private void Movesave(){
        startToast("새로운 게시글이 저장되었습니다.");
        Intent movesave = new Intent(PostActivity.this, CommunityActivity.class);
        movesave.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PostActivity.this.startActivity(movesave);
    }
    private void startToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
