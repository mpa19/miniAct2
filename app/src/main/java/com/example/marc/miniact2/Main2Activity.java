package com.example.marc.miniact2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv1 = findViewById(R.id.tv2);
        Bundle b = getIntent().getExtras();
        String palabra;
        
        if(getIntent().hasExtra("palabra")){
            palabra = b.getString("palabra");
        } else palabra = tv1.getText().toString();


        tv1.setText("");
        int repe = Integer.parseInt(b.getString("numero"));


        for(int i = 0; i < repe; i++){
            tv1.setText(tv1.getText() + palabra);
        }
    }


    public void back(View view){
        TextView tv1 = findViewById(R.id.tv2);
        Intent a = new Intent(this, MainActivity.class);
        a.putExtra("Frase",tv1.getText().toString());
        startActivity(a);

    }
}
