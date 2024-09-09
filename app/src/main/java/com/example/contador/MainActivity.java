package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.bntClique);
        text = findViewById(R.id.txtClique);
        text.setText("Quantas vezes você consegue clicar?");
        button.setText("Começar");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                text.setText("Você clicou " + i  + " vezes");
                button.setText("Clique!");
            }
        });
    }
}