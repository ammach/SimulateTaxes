package com.ammach.simulatetaxes;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edit)
    EditText edit;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn)
    public void onClick() {
        Toast.makeText(this,edit.getText().toString(), Toast.LENGTH_SHORT).show();
        SharedPreferences.Editor editor = getSharedPreferences("taxesPref", CONTEXT_IGNORE_SECURITY).edit();
        editor.putString("adresse", edit.getText().toString());
        editor.commit();
    }
}
