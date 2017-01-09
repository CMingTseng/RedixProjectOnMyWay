package com.onmyway.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.onmyway.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    TextView txtInform;
    TextView btnSignIn;
    EditText edtPhoneNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);
        txtInform = (TextView) findViewById(R.id.txt_loginform_inform);
        btnSignIn = (TextView) findViewById(R.id.btn_loginform_signup);
        edtPhoneNum = (EditText) findViewById(R.id.edt_loginform_phonenum);
        btnSignIn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_loginform_signup:

                if (edtPhoneNum.getText().equals("113"))
                {

                }
                else
                {
                    txtInform.setVisibility(View.VISIBLE);
                }
        }
    }
}
