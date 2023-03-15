package com.example.practica_1_u2_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaración de referencias de objetos
    CheckBox cb11, cb22, cb33;
    RadioButton rb11, rb22, rb33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb11 = (CheckBox) findViewById(R.id.cb1);
        cb22 = (CheckBox) findViewById(R.id.cb2);
        cb33 = (CheckBox) findViewById(R.id.cb3);
        rb11 = (RadioButton) findViewById(R.id.rb1);
        rb22 = (RadioButton) findViewById(R.id.rb2);
        rb33 = (RadioButton) findViewById(R.id.rb3);
    }
    public void bt1(View view) {
        if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked() && rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, ChBox3, RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked() && rb11.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, ChBox3, RButton1, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked() && rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, ChBox3, RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, ChBox3, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked() && rb11.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, ChBox3, RButton1", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, ChBox3, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, ChBox3, RButton3", Toast.LENGTH_SHORT).show();

        } else if (cb11.isChecked() && cb22.isChecked() && rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && rb11.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, RButton1", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox2, RButton3", Toast.LENGTH_SHORT).show();

        } else if (cb11.isChecked() && cb33.isChecked() && rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox3, RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb33.isChecked() && rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox3, RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb33.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox3, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb33.isChecked() && rb11.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox3, RButton1", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb33.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox3, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb33.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, ChBox3, RButton3", Toast.LENGTH_SHORT).show();

        } else if (cb22.isChecked() && cb33.isChecked() && rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, ChBox3, RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && cb33.isChecked() && rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, ChBox3, RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && cb33.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, ChBox3, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && cb33.isChecked() && rb11.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, ChBox3, RButton1", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && cb33.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, ChBox3, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && cb33.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, ChBox3, RButton3", Toast.LENGTH_SHORT).show();

        } else if (cb11.isChecked()  && rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked()  && rb11.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, RButton1, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked()  && rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && rb11.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, RButton1", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox1, RButton3", Toast.LENGTH_SHORT).show();

        } else if (cb22.isChecked()  && rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked()  && rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked()  && rb11.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, RButton1, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && rb11.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, RButton1", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox2, RButton3", Toast.LENGTH_SHORT).show();

        } else if (cb33.isChecked()  && rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox3, RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb33.isChecked()  && rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox3, RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb33.isChecked()  && rb11.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox3, RButton1, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb33.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox3, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (cb33.isChecked() && rb11.isChecked()) {
            Toast.makeText(this, "Selected: ChBox3, RButton1", Toast.LENGTH_SHORT).show();
        } else if (cb33.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Selected: ChBox3, RButton2", Toast.LENGTH_SHORT).show();
        } else if (cb33.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Selected: ChBox3, RButton3", Toast.LENGTH_SHORT).show();

        } else if (rb11.isChecked() && rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Select: RButton1, RButton2, RButton3", Toast.LENGTH_SHORT).show();
        } else if (rb11.isChecked() && rb22.isChecked()) {
            Toast.makeText(this, "Select: RButton1, RButton2", Toast.LENGTH_SHORT).show();
        } else if (rb11.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Select: RButton1, RButton3", Toast.LENGTH_SHORT).show();
        } else if (rb22.isChecked() && rb33.isChecked()) {
            Toast.makeText(this, "Select: RButton2, RButton3", Toast.LENGTH_SHORT).show();

        } else if (cb11.isChecked() && cb22.isChecked() && cb33.isChecked()) {
            Toast.makeText(this, "Select: ChBox1, ChBox2, ChBox3", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb22.isChecked()) {
            Toast.makeText(this, "Select: ChBox1, ChBox2", Toast.LENGTH_SHORT).show();
        } else if (cb11.isChecked() && cb33.isChecked()) {
            Toast.makeText(this, "Select: ChBox1, ChBox3", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked() && cb33.isChecked()) {
            Toast.makeText(this, "Select: ChBox2, ChBox3", Toast.LENGTH_SHORT).show();

        } else if (cb11.isChecked()) {
            Toast.makeText(this, "Select: ChBox1", Toast.LENGTH_SHORT).show();
        } else if (cb22.isChecked()) {
            Toast.makeText(this, "Select: ChBox2", Toast.LENGTH_SHORT).show();
        } else if (cb33.isChecked()) {
            Toast.makeText(this, "Select: ChBox3", Toast.LENGTH_SHORT).show();
        } else if (rb11.isChecked()) {
            Toast.makeText(this, "Selected: RButton1", Toast.LENGTH_SHORT).show();
        } else if (rb22.isChecked()) {
            Toast.makeText(this, "Selected: RButton2", Toast.LENGTH_SHORT).show();
        } else if (rb33.isChecked()) {
            Toast.makeText(this, "Selected: RButton3", Toast.LENGTH_SHORT).show();

        }

    }
}