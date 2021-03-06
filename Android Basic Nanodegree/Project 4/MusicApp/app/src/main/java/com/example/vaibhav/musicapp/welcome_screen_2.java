package com.example.vaibhav.musicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class welcome_screen_2 extends AppCompatActivity {
    @BindView(R.id.NameTextView)
    TextView mNameTextView;
    @BindView(R.id.UsernameEditTextView)
    EditText mUsernameEditTextView;
    private String firstName, fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen_2);
        ButterKnife.bind(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Intent intent = getIntent();
            fullName = intent.getStringExtra(getString(R.string.full_name));
            String[] splittedText = fullName.split("\\s+");
            firstName = splittedText[0];
            Toast.makeText(getApplicationContext(), getString(R.string.hi_exclamation) + " " + splittedText[0] + ", " + getString(R.string.please_enter_your_username), Toast.LENGTH_LONG).show();
            mNameTextView.setText(splittedText[0]);
        }
    }

    /**
     * This is a setOnClickListnerMethod which performs intent and passes information to next screen
     */
    @OnClick(R.id.Continue_button)
    public void onClick() {
        String musername = mUsernameEditTextView.getText().toString().trim().toLowerCase();
        if (musername.equals(firstName.toLowerCase())) {
            Intent intent = new Intent(welcome_screen_2.this, welcome_screen_3.class);
            intent.putExtra(getString(R.string.full_name), fullName);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.please_enter_correct_username), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * On long press this function will show information to the user
     *
     * @return
     */
    @OnLongClick(R.id.welcomeScreen_2)
    public boolean onLongClick() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(welcome_screen_2.this);
        alertDialogBuilder.setMessage(getString(R.string.welcome_screen_2_summary));
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
