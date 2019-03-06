package com.example.marc.miniact2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText ed1;
    EditText ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
    }

    public void send(View view){
        Intent a = new Intent(this, Main2Activity.class);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        if(ed2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.toast), Toast.LENGTH_SHORT).show();

        }else {
            if(!ed1.getText().toString().isEmpty()) a.putExtra("palabra", ed1.getText().toString());

            a.putExtra("numero", ed2.getText().toString());
            startActivityForResult(a,2);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == 2){
            if(resultCode == RESULT_OK){
                ed1.getText().clear();
                ed2.getText().clear();
                tv1.setText(data.getStringExtra("Frase"));
            }
        }
    }
}
