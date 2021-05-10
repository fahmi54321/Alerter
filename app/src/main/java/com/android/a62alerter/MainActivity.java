package com.android.a62alerter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class MainActivity extends AppCompatActivity {

    Button btn_background,btn_icon,btn_duration,btn_more_text,btn_without_title,btn_on_click,btn_visibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_background = findViewById(R.id.btn_background_color);
        btn_icon = findViewById(R.id.btn_icon);
        btn_duration = findViewById(R.id.btn_duration);
        btn_more_text = findViewById(R.id.btn_more_text);
        btn_without_title = findViewById(R.id.btn_without_title);
        btn_on_click = findViewById(R.id.btn_on_click);
        btn_visibility = findViewById(R.id.btn_visibility);

        btn_background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with background")
                        .setText("This is alerter")
                        .setBackgroundColor(R.color.alerter_default_success_background)
                        .show();
            }
        });

        btn_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with icon")
                        .setText("This is alerter")
                        .setIcon(R.drawable.ic_alert)
                        .show();
            }
        });

        btn_duration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with duration")
                        .setText("This is alerter")
                        .setDuration(5000)
                        .show();
            }
        });

        btn_more_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter more text")
                        .setText("This is alerter This is alerter This is alerter This is alerter This is alerter This is alerter This is alerter This is alerter")
                        .show();
            }
        });
        btn_without_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setText("This is alerter")
                        .show();
            }
        });

        btn_on_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter onClick")
                        .setText("This is alerter")
                        .setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        btn_visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter Visibility")
                        .setText("This is alerter")
                        .setOnHideListener(new OnHideAlertListener() {
                            @Override
                            public void onHide() {
                                Toast.makeText(MainActivity.this, "Hide alert", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setOnShowListener(new OnShowAlertListener() {
                            @Override
                            public void onShow() {
                                Toast.makeText(MainActivity.this, "Show alert", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

    }
}