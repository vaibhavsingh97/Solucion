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
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class SongList extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @BindView(R.id.BannerAlbumName)
    TextView mAlbumName;
    @BindView(R.id.BannerAlbumTotalSongs)
    TextView mAlbumTotalSongs;
    @BindView(R.id.PauseButton)
    ImageView mPauseButton;
    @BindView(R.id.PlayButton)
    ImageView mPlayButton;
    @BindView(R.id.SongTime1)
    TextView mSongTimeTextView1;
    @BindView(R.id.SongTime2)
    TextView mSongTimeTextView2;
    @BindView(R.id.SongTime3)
    TextView mSongTimeTextView3;
    @BindView(R.id.SongTime4)
    TextView mSongTimeTextView4;
    @BindView(R.id.SongTime5)
    TextView mSongTimeTextView5;
    @BindView(R.id.SongTime6)
    TextView mSongTimeTextView6;

    private String albumName, albumTotalSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        ButterKnife.bind(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Intent intent = getIntent();
            albumName = intent.getStringExtra("album_name");
            albumTotalSongs = intent.getStringExtra("album_total_songs");
            mAlbumName.setText(albumName);
            mAlbumTotalSongs.setText(albumTotalSongs);
        }
        mSongTimeTextView1.setText(randomTime());
        mSongTimeTextView2.setText(randomTime());
        mSongTimeTextView3.setText(randomTime());
        mSongTimeTextView4.setText(randomTime());
        mSongTimeTextView5.setText(randomTime());
        mSongTimeTextView6.setText(randomTime());
    }

    public String randomTime() {
        Random random = new Random();
        int minutes = random.nextInt(10 - 1) + 1;
        int seconds = random.nextInt(60 - 10) + 10;
        return String.valueOf(minutes) + ":" + String.valueOf(seconds);
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

    @OnClick(R.id.Play)
    public void onPlay() {
        startActivity(new Intent(SongList.this, song_play.class));
    }

    @OnLongClick(R.id.SongListScreen)
    public boolean onLongClick() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SongList.this);
        alertDialogBuilder.setMessage(getString(R.string.song_list_screen_summary));
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
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SongList.this);
        alertDialogBuilder.setMessage(getString(R.string.song_list_screen_summary));
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

    @OnClick(R.id.MoreSettings1)
    public void showMenu1(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.song_settings_list);
        popup.show();
    }

    @OnClick(R.id.MoreSettings2)
    public void showMenu2(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.song_settings_list);
        popup.show();
    }

    @OnClick(R.id.MoreSettings3)
    public void showMenu3(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.song_settings_list);
        popup.show();
    }

    @OnClick(R.id.MoreSettings4)
    public void showMenu4(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.song_settings_list);
        popup.show();
    }

    @OnClick(R.id.MoreSettings5)
    public void showMenu5(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.song_settings_list);
        popup.show();
    }

    @OnClick(R.id.MoreSettings6)
    public void showMenu6(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.song_settings_list);
        popup.show();
    }

    @OnClick(R.id.Song_1)
    public void onPlaySong1() {
        startActivity(new Intent(SongList.this, song_play.class));
    }

    @OnClick(R.id.Song_2)
    public void onPlaySong2() {
        startActivity(new Intent(SongList.this, song_play.class));
    }

    @OnClick(R.id.Song_1)
    public void onPlaySong3() {
        startActivity(new Intent(SongList.this, song_play.class));
    }

    @OnClick(R.id.Song_1)
    public void onPlaySong4() {
        startActivity(new Intent(SongList.this, song_play.class));
    }

    @OnClick(R.id.Song_1)
    public void onPlaySong5() {
        startActivity(new Intent(SongList.this, song_play.class));
    }

    @OnClick(R.id.Song_1)
    public void onPlaySong6() {
        startActivity(new Intent(SongList.this, song_play.class));
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
            case R.id.home:
                onBackPressed();
                return true;

            case R.id.action_settings:
                startActivity(new Intent(SongList.this, about_the_app.class));
                return true;

            case R.id.action_payment:
                startActivity(new Intent(SongList.this, payment.class));
                return true;

            case R.id.action_search:
                Toast.makeText(getApplicationContext(), getString(R.string.you_have_selected) + " " + getString(R.string.search_button), Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.one:
                Toast.makeText(getApplicationContext(), getString(R.string.you_have_selected) + " " + getString(R.string.play), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.two:
                Toast.makeText(getApplicationContext(), getString(R.string.you_have_selected) + " " + getString(R.string.play_next), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.three:
                Toast.makeText(getApplicationContext(), getString(R.string.you_have_selected) + " " + getString(R.string.add_to_queue), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.four:
                Toast.makeText(getApplicationContext(), getString(R.string.you_have_selected) + " " + getString(R.string.add_to_playlist), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.five:
                Toast.makeText(getApplicationContext(), getString(R.string.you_have_selected) + " " + getString(R.string.use_as_ringtone), Toast.LENGTH_SHORT).show();
                return true;

            case R.id.six:
                Toast.makeText(getApplicationContext(), getString(R.string.you_have_selected) + " " + getString(R.string.delete), Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}

