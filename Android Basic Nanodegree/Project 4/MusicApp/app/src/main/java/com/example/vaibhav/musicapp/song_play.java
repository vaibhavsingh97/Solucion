package com.example.vaibhav.musicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnLongClick;

public class song_play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);
        ButterKnife.bind(this);
    }

    /**
     * On long press this function will show information to the user
     *
     * @return
     */
    @OnLongClick(R.id.PlayingScreen1)
    public boolean onLongClick1() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(song_play.this);
        alertDialogBuilder.setMessage(getString(R.string.playing_screen_summary));
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

    /**
     * On long press this function will show information to the user
     *
     * @return
     */
    @OnLongClick(R.id.PlayingScreen2)
    public boolean onLongClick2() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(song_play.this);
        alertDialogBuilder.setMessage(getString(R.string.playing_screen_summary));
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
