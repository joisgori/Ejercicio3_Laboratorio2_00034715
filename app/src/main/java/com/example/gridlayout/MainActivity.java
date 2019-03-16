package com.example.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout Li;

    private TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Busco según referencias de ids...
        Li = findViewById(R.id.LinearColor);
        t1 = findViewById(R.id.P1);
        t2 = findViewById(R.id.P2);
        t3 = findViewById(R.id.P3);

        //Defindo sus eventos
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // t1.setBackgroundColor(getResources().getColor(R.color.RojoOscuro));
            }
        });
    }
}
