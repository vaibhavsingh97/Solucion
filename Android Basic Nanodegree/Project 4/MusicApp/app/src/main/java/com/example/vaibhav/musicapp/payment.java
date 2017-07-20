package com.example.vaibhav.musicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnLongClick;

public class payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ButterKnife.bind(this);
    }

    /**
     * On long press this function will show information to the user
     *
     * @return
     */
    @OnLongClick(R.id.PaymentScreen)
    public boolean onLongClick1() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(payment.this);
        alertDialogBuilder.setMessage(getString(R.string.payment_screen_summary));
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
