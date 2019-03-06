package com.example.marc.miniact2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = findViewById(R.id.tv1);
        Bundle parametros = this.getIntent().getExtras();
        if(parametros != null){
            String datos = parametros.getString("Frase");
            tv1.setText(datos);
        }
    }

    public void send(View view){
        Intent a = new Intent(this, Main2Activity.class);
        EditText ed1 = findViewById(R.id.ed1);
        EditText ed2 = findViewById(R.id.ed2);
        if(ed2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            getString(R.string.toast), Toast.LENGTH_SHORT).show();

        }else {
            if(!ed1.getText().toString().isEmpty()) a.putExtra("palabra", ed1.getText().toString());

            a.putExtra("numero", ed2.getText().toString());
            startActivity(a);
            finish();
        }



    }
}
