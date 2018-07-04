package com.haieros.recyclerlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initView();
        initView();
        initView();
    }

    private void initView() {
        Button swip_Refresh_View = findViewById(R.id.swip_Refresh_View);
        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SwipRefreshActivity.class);
                startActivity(intent);
            }
        };
        swip_Refresh_View.setOnClickListener(l);
        int i = 10;
    }
}
