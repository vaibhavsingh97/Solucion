package com.example.vaibhav.musicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class about_the_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_app);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.OpenSource)
    public void onClick() {
        startActivity(new Intent(about_the_app.this, open_source.class));
    }

    @OnClick(R.id.DeveloperName)
    public void onTextClick() {
        String url = getString(R.string.personal_website_link);
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    @OnLongClick(R.id.AboutTheAppScreen)
    public boolean onLongClick() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(about_the_app.this);
        alertDialogBuilder.setMessage(getString(R.string.about_the_app_summary));
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

    @OnLongClick(R.id.OpenSource)
    public boolean onLongClick1() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(about_the_app.this);
        alertDialogBuilder.setMessage(getString(R.string.about_the_app_summary));
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
