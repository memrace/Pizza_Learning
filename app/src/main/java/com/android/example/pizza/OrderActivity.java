package com.android.example.pizza;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);



    }


    public void onClickButton(View view) {
        startSnackbar();
    }


    private void startSnackbar() {
        String text = "Hello, im snack-snack!";
        int duration = Snackbar.LENGTH_SHORT;
        CoordinatorLayout coordinator = findViewById(R.id.coordinator);
        Snackbar snackbar = Snackbar.make(coordinator,text,duration);
        snackbar.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code

                Toast toast = Toast.makeText(OrderActivity.this, "Undone!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        snackbar.show();
    }
}