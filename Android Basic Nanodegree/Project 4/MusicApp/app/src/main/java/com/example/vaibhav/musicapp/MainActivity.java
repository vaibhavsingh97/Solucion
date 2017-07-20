package com.example.vaibhav.musicapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.BannerProfileName)
    TextView mNameTextView;
    @BindView(R.id.PauseButton)
    ImageView mPauseButton;
    @BindView(R.id.PlayButton)
    ImageView mPlayButton;
    @BindView(R.id.AlbumName1)
    TextView mAlbumName1;
    @BindView(R.id.AlbumName2)
    TextView mAlbumName2;
    @BindView(R.id.AlbumName3)
    TextView mAlbumName3;
    @BindView(R.id.AlbumName4)
    TextView mAlbumName4;
    @BindView(R.id.AlbumTotalSongs1)
    TextView mAlbumTotalSongs1;
    @BindView(R.id.AlbumTotalSongs2)
    TextView mAlbumTotalSongs2;
    @BindView(R.id.AlbumTotalSongs3)
    TextView mAlbumTotalSongs3;
    @BindView(R.id.AlbumTotalSongs4)
    TextView mAlbumTotalSongs4;

    private String fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Intent intent = getIntent();
            fullName = intent.getStringExtra("full_name");
            String[] splittedText = fullName.split("\\s+");
            Toast.makeText(getApplicationContext(), getString(R.string.hi_exclamation) + " " + splittedText[0] + ", " + getString(R.string.welcome_to_the_app), Toast.LENGTH_LONG).show();
            mNameTextView.setText(fullName);
        }
    }

    @OnClick(R.id.PlayButton)
    public void onPlayClick(View v) {
        v.setVisibility(View.GONE);
        mPauseButton.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.PauseButton)
    public void onPauseClick(View v) {
        v.setVisibility(View.GONE);
        mPlayButton.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.Album1)
    public void onAlbum1Click() {
        Intent intent = new Intent(MainActivity.this, SongList.class);
        intent.putExtra("album_name", mAlbumName1.getText().toString());
        intent.putExtra("album_total_songs", mAlbumTotalSongs1.getText().toString());
        startActivity(intent);
    }

    @OnClick(R.id.Album2)
    public void onAlbum2Click() {
        Intent intent = new Intent(MainActivity.this, SongList.class);
        intent.putExtra("album_name", mAlbumName2.getText().toString());
        intent.putExtra("album_total_songs", mAlbumTotalSongs2.getText().toString());
        startActivity(intent);
    }

    @OnClick(R.id.Album3)
    public void onAlbum3Click() {
        Intent intent = new Intent(MainActivity.this, SongList.class);
        intent.putExtra("album_name", mAlbumName3.getText().toString());
        intent.putExtra("album_total_songs", mAlbumTotalSongs3.getText().toString());
        startActivity(intent);
    }

    @OnClick(R.id.Album4)
    public void onAlbum4Click() {
        Intent intent = new Intent(MainActivity.this, SongList.class);
        intent.putExtra("album_name", mAlbumName4.getText().toString());
        intent.putExtra("album_total_songs", mAlbumTotalSongs3.getText().toString());
        startActivity(intent);
    }

    @OnLongClick(R.id.MainScreen)
    public boolean onLongClick() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage(getString(R.string.main_screen_summary));
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

    @OnLongClick(R.id.BottomBar)
    public boolean onLongClick1() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage(getString(R.string.main_screen_summary));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;

            case R.id.action_search:
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
