package com.example.vaibhav.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.vaibhav.quizapp.R.id.CheckBox_1;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.Name)
    EditText mName;
    @BindView(R.id.Email)
    EditText mEmail;
    @BindView(R.id.RadioGroup1)
    RadioGroup mRadioGroup1;
    @BindView(R.id.RadioGroup2)
    RadioGroup mRadioGroup2;
    @BindView(R.id.RadioGroup3)
    RadioGroup mRadioGroup3;
    @BindView(R.id.EditTextQuestion4)
    EditText mEditTextQuestion4;
    @BindView(CheckBox_1)
    CheckBox mCheckBox1;
    @BindView(R.id.CheckBox_2)
    CheckBox mCheckBox2;
    @BindView(R.id.CheckBox_3)
    CheckBox mCheckBox3;
    @BindView(R.id.CheckBox_4)
    CheckBox mCheckBox4;
    @BindView(R.id.SubmitButton)
    Button mSubmit;
    @BindView(R.id.ResetButton)
    Button mReset;
    @BindView(R.id.ResultButton)
    Button mResult;
    private int score1, score2, score3, score4, score5, totalScore;
    private boolean checked1, checked2, checked3, checked5;
    private String answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mResult.setVisibility(View.GONE);
    }

    /**
     * @return name of person
     */
    private String getName() {
        String name = mName.getText().toString();
        return name;
    }

    /**
     * @return email Id of person
     */
    private String getEmail() {
        String email = mEmail.getText().toString();
        return email;
    }

    @OnClick({R.id.RadioButton1_1, R.id.RadioButton1_2, R.id.RadioButton1_3, R.id.RadioButton1_4})
    public void onCheckQuestion1(View view) {
        checked1 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.RadioButton1_1:
                score1 = 20;
                break;
            case R.id.RadioButton1_2:
                score1 = 0;
                break;
            case R.id.RadioButton1_3:
                score1 = 0;
                break;
            case R.id.RadioButton1_4:
                score1 = 0;
                break;
        }
    }

    @OnClick({R.id.RadioButton2_1, R.id.RadioButton2_2, R.id.RadioButton2_3, R.id.RadioButton2_4})
    public void onCheckQuestion2(View view) {
        checked2 = ((RadioButton) view).isChecked();
        switch ((view.getId())) {
            case R.id.RadioButton2_1:
                score2 = 0;
                break;
            case R.id.RadioButton2_2:
                score2 = 20;
                break;
            case R.id.RadioButton2_3:
                score2 = 0;
                break;
            case R.id.RadioButton2_4:
                score2 = 0;
                break;
        }
    }

    @OnClick({R.id.RadioButton3_1, R.id.RadioButton3_2, R.id.RadioButton3_3, R.id.RadioButton3_4})
    public void onCheckQuestion3(View view) {
        checked3 = ((RadioButton) view).isChecked();
        switch ((view.getId())) {
            case R.id.RadioButton3_1:
                score3 = 0;
                break;
            case R.id.RadioButton3_2:
                score3 = 20;
                break;
            case R.id.RadioButton3_3:
                score3 = 0;
                break;
            case R.id.RadioButton3_4:
                score3 = 0;
        }
    }

    @OnClick({CheckBox_1, R.id.CheckBox_2, R.id.CheckBox_3, R.id.CheckBox_4})
    public void onCheckQuestion5(View view) {
        checked5 = mCheckBox1.isChecked() || mCheckBox2.isChecked() || mCheckBox3.isChecked() || mCheckBox4.isChecked();
    }

    /**
     * This method returns total score in form of toast message when Submit button is triggered
     *
     * @param view
     */
    @OnClick(R.id.SubmitButton)
    public void onClickSubmit(View view) {
        answer4 = mEditTextQuestion4.getText().toString().toLowerCase();
        if (checked1 && checked2 && checked3 && !answer4.equals("") && checked5) {
            if (answer4.equals(getResources().getString(R.string.java))) {
                score4 = 20;
            } else {
                score4 = 0;
            }
            score5 = 0;
            if (mCheckBox1.isChecked()) {
                score5 += -10;
            }
            if (mCheckBox2.isChecked()) {
                score5 += 10;
            }
            if (mCheckBox3.isChecked()) {
                score5 += 10;
            }
            if (mCheckBox4.isChecked()) {
                score5 += 10;
            }
            if (score5 < 0) {
                score5 = 0;
            }
            totalScore = score1 + score2 + score3 + score4 + score5;
            String message = "Hey! " + getName() + ", " + getString(R.string.your_total_score_is) + totalScore + " \ud83d\ude01";
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            disable();
            mSubmit.setVisibility(View.GONE);
            mResult.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.warning2), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * this method triggers Get Result
     */
    @OnClick(R.id.ResultButton)
    public void onClickResult() {
        if (mName.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), getString(R.string.warning1) + " name " + getString(R.string.correctly), Toast.LENGTH_LONG).show();
        } else if (mEmail.getText().toString().equals("") && Patterns.EMAIL_ADDRESS.matcher(mEmail.getText().toString()).matches()) {
            Toast.makeText(getApplicationContext(), getString(R.string.warning1) + " email " + getString(R.string.correctly), Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), getString(R.string.warning1) + " email " + getString(R.string.correctly), Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), getString(R.string.warning1) + " email " + getString(R.string.correctly), Toast.LENGTH_LONG).show();
        } else {
            String message = "Hey! " + getName() + ", " + getString(R.string.your_total_score_is) + "\t" + totalScore;
            message += "\n" + getString(R.string.marks_scored_in_individual_question);
            message += "\n" + getString(R.string.title_question_1) + ": " + score1;
            message += "\n" + getString(R.string.title_question_2) + ": " + score2;
            message += "\n" + getString(R.string.title_question_3) + ": " + score3;
            message += "\n" + getString(R.string.title_question_4) + ": " + score4;
            message += "\n" + getString(R.string.title_question_5) + ": " + score5;

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + getEmail()));
            intent.putExtra(Intent.EXTRA_TEXT, message);
            intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.quiz_score));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }

    private void resetCheckBox() {
        mCheckBox1.setChecked(false);
        mCheckBox2.setChecked(false);
        mCheckBox3.setChecked(false);
        mCheckBox4.setChecked(false);
    }

    private void resetRadioGroups() {
        mRadioGroup1.clearCheck();
        mRadioGroup2.clearCheck();
        mRadioGroup3.clearCheck();
    }

    @OnClick(R.id.ResetButton)
    public void onClickReset() {
        mName.setText("");
        mEmail.setText("");
        mEditTextQuestion4.setText("");
        resetCheckBox();
        resetRadioGroups();
        mSubmit.setVisibility(View.VISIBLE);
        mResult.setVisibility(View.GONE);
        enable();
    }

    private void disable() {
        mName.setEnabled(false);
        mEmail.setEnabled(false);
        for (int i = 0; i < mRadioGroup1.getChildCount(); i++) {
            mRadioGroup1.getChildAt(i).setEnabled(false);
        }
        for (int i = 0; i < mRadioGroup2.getChildCount(); i++) {
            mRadioGroup2.getChildAt(i).setEnabled(false);
        }
        for (int i = 0; i < mRadioGroup3.getChildCount(); i++) {
            mRadioGroup3.getChildAt(i).setEnabled(false);
        }
        mEditTextQuestion4.setEnabled(false);
        mCheckBox1.setEnabled(false);
        mCheckBox2.setEnabled(false);
        mCheckBox3.setEnabled(false);
        mCheckBox4.setEnabled(false);
    }

    private void enable() {
        mName.setEnabled(true);
        mEmail.setEnabled(true);
        for (int i = 0; i < mRadioGroup1.getChildCount(); i++) {
            mRadioGroup1.getChildAt(i).setEnabled(true);
        }
        for (int i = 0; i < mRadioGroup2.getChildCount(); i++) {
            mRadioGroup2.getChildAt(i).setEnabled(true);
        }
        for (int i = 0; i < mRadioGroup3.getChildCount(); i++) {
            mRadioGroup3.getChildAt(i).setEnabled(true);
        }
        mEditTextQuestion4.setEnabled(true);
        mCheckBox1.setEnabled(true);
        mCheckBox2.setEnabled(true);
        mCheckBox3.setEnabled(true);
        mCheckBox4.setEnabled(true);
    }
}
