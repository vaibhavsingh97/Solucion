package com.example.vaibhav.musicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class welcome_screen_1 extends AppCompatActivity {
    @BindView(R.id.NameEditTextView)
    EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen_1);
        ButterKnife.bind(this);
    }

    /**
     * This is a setOnClickListnerMethod which performs intent and passes information to next screen
     */
    @OnClick(R.id.Continue_button)
    public void onClick() {
        String full_name = mNameEditText.getText().toString().trim();
        if (full_name.isEmpty()) {
            Toast.makeText(getApplicationContext(), getString(R.string.please_enter_your_name), Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(welcome_screen_1.this, welcome_screen_2.class);
            intent.putExtra(getString(R.string.full_name), full_name);
            startActivity(intent);
        }
    }

    /**
     * On long press this function will show information to the user
     *
     * @return
     */
    @OnLongClick(R.id.welcomeScreen_1)
    public boolean onLongClick() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(welcome_screen_1.this);
        alertDialogBuilder.setMessage(getString(R.string.welcome_screen_1_summary));
        alertDialogBuilder.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        return true;
    }

}
