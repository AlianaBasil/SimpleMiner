package ru.pacapps.sympleminer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MaterialButton button = findViewById(R.id.button_start);
        final MaterialButton button2 = findViewById(R.id.button_about);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                while (true) {
                    Intent intent = new Intent(MainActivity.this, Ebaka.class);
                    startActivity(intent);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new MaterialAlertDialogBuilder(MainActivity.this)
                        .setTitle(MainActivity.this.getString(R.string.about))
                        .setMessage(MainActivity.this.getString(R.string.about_text))
                        .setPositiveButton(MainActivity.this.getString(R.string.ok), null)
                        .show();
            }
        });
    }
}
