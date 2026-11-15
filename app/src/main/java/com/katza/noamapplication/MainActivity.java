package com.katza.noamapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnHistory;
    Button btnAnthem;
    Switch swButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        btnHistory = findViewById(R.id.btnHistory);
        btnHistory.setOnClickListener(this);

        btnAnthem = findViewById(R.id.btnAnthem);
        btnAnthem.setOnClickListener(this);

       // swButton=findViewById(R.id.swButton);


    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();

        if (viewId == R.id.btnHistory)
            Toast.makeText(this, "toBeContinued", Toast.LENGTH_SHORT).show();
        else if(viewId==R.id.btnAnthem)
            Toast.makeText(this, "the Tikvah", Toast.LENGTH_SHORT).show();
    }
}