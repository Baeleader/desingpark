package com.example.birdhit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.birdhit.adapters.PostAdapter;
import com.example.birdhit.models.Post;

import java.util.ArrayList;
import java.util.List;

public class CommunityActivity extends AppCompatActivity {

    private RecyclerView mPostRecyclerView;

    private PostAdapter mAdapter;
    private List<Post> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        setTitle("커뮤니티");

        mPostRecyclerView = findViewById(R.id.main_recyclerview);

        mDatas = new ArrayList<>();
        mDatas.add(new Post(null, "title", "contents"));
        mDatas.add(new Post(null, "title", "contents"));
        mDatas.add(new Post(null, "title", "contents"));

        mAdapter = new PostAdapter(mDatas);
        mPostRecyclerView.setAdapter(mAdapter);

        findViewById(R.id.main_post_edit).setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.main_post_edit:
                    MovePost();
                    break;

            }
        }
    };

    private void MovePost(){
        Intent movepost = new Intent(CommunityActivity.this, PostActivity.class);
        movepost.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        CommunityActivity.this.startActivity(movepost);
    }

}
