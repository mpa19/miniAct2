package com.example.marc.miniact2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
        String palabra = b.getString("palabra");
        int repe = Integer.parseInt(b.getString("numero"));

        TextView tv1 = findViewById(R.id.tv2);
        for(int i = 0; i < repe; i++){
            tv1.setText(tv1.getText() + palabra);
        }
    }

    public void back(View view){
        finish();

    }
}
