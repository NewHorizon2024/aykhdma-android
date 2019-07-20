package com.mostathmer.aykhdma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mostathmer.aykhdma.ui.activity.NewAccount;
import com.mostathmer.aykhdma.ui.activity.Verification;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText editTextMobileLogin = findViewById(R.id.tv_mobile);
        Button button = findViewById(R.id.bt_login);

        editTextMobileLogin.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;
                if (i == EditorInfo.IME_ACTION_SEND) {
                    sendMessage();
                    handled = true;
                }
                return handled;
            }
        });
        Button buttonRgister = findViewById(R.id.bt_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Verification.class);
                startActivity(intent);
            }
        });

        buttonRgister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegister = new Intent(Login.this, NewAccount.class);
                startActivity(intentRegister);
            }
        });
    }

    private void sendMessage() {

    }

}

