package com.example.vaibhav.musicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class welcome_screen_1 extends AppCompatActivity {
    @BindView(R.id.NameEditTextView)
    EditText mNameEditText;
    @BindView(R.id.welcomeScreen_1)
    View mContentView;
    @BindView(R.id.summaryTextView)
    TextView mSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen_1);
        ButterKnife.bind(this);
        mContentView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(welcome_screen_1.this);
                alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(getApplicationContext(), "You clicked yes button", Toast.LENGTH_LONG).show();
                            }
                        });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
            }
        });
    }

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

}
