package com.example.vaibhav.reportcard;

import java.util.ArrayList;

import static android.R.attr.min;

/**
 * Created by vaibhav on 7/23/17.
 */

public class ReportCard {
    private static final int MinusOne = -1;
    private static final int zero = 0;
    private static final int one = 1;
    private static final int two = 2;
    private static final int three = 3;
    private static final int four = 4;
    private static final int five = 5;
    /* Storing student name in mStudentName */
    private String mStudentName;
    /* Storing university name in mUniversityName */
    private String mUniversityName;
    /* Storing year of study in mYear */
    private int mYear;
    /* Storing semster of the year in mSemester */
    private String mSemester;
    /* ArrayList storing Subject objects */
    private ArrayList<String> mSubjects = new ArrayList<>();
    /* ArrayList Storing Score objects */
    private ArrayList<Double> mScores = new ArrayList<>();
    /* Storing total score in mTotalScore */
    private double mTotalScore;
    /* Storing final score percentage in mFinalScorePercentage */
    private double mFinalScorePercentage;
    /* Storing letter grade in mLetterGrade */
    private String mLetterGrade;

    /**
     * This is the constructor which helps to create new ReportCard object
     *
     * @param studentName            is the name of student
     * @param universityName         is the name of university
     * @param year                   is the year of study
     * @param semester               is the semester of the year
     * @param physicsScore           is the score of Physics
     * @param chemistryScore         is the score of Chemistry
     * @param mathScore              is the score of Maths
     * @param englishScore           is the score of English
     * @param computerScienceScore   is the score of Computer Science
     * @param physicalEducationScore is the score of Physical Education
     */
    public ReportCard(String studentName, String universityName, int year, String semester,
                      double physicsScore, double chemistryScore, double mathScore, double englishScore,
                      double computerScienceScore, double physicalEducationScore) {

        this.mStudentName = studentName;
        this.mUniversityName = universityName;
        this.mYear = year;
        this.mSemester = semester;

        mSubjects.add(zero, "Physics");
        mSubjects.add(one, "Chemistry");
        mSubjects.add(two, "Math");
        mSubjects.add(three, "English");
        mSubjects.add(four, "Computer Science");
        mSubjects.add(five, "Physical Education");

        mScores.add(zero, physicsScore);
        mScores.add(one, chemistryScore);
        mScores.add(two, mathScore);
        mScores.add(three, englishScore);
        mScores.add(four, computerScienceScore);
        mScores.add(five, physicalEducationScore);
    }

    /**
     * Method to get the student name
     *
     * @return student name
     */
    public String getStudentName() {
        return mStudentName;
    }

    /**
     * Set the name of student
     *
     * @param name is the name of the student
     */
    public void setStudentName(String name) {
        this.mStudentName = name;
    }

    /**
     * Method to get the name of University
     *
     * @return university name
     */
    public String getUniversityName() {
        return mUniversityName;
    }

    /**
     * Method to set the name of university
     *
     * @param universityName is the name of university
     */
    public void setUniversityName(String universityName) {
        this.mUniversityName = universityName;
    }

    /**
     * Method to get the year details
     *
     * @return year of study
     */
    public int getYearDetails() {
        return mYear;
    }

    /**
     * Method to set the year
     *
     * @param year is the year of study
     */
    public void setYearDetails(int year) {
        if (year < zero) {
            this.mYear = mYear * MinusOne;
        } else {
            this.mYear = year;
        }
    }

    /**
     * Method to get the semester details
     *
     * @return semester of the year
     */
    public String getSemesterDetails() {
        return mSemester;
    }

    /**
     * Method to set the semester details
     *
     * @param semester is the semster of the year
     */
    public void setSemesterDetails(String semester) {
        this.mSemester = semester;
    }

    /**
     * Method to get the score of physics
     *
     * @return score of physics
     */
    public double getPhysicsScore() {
        return mScores.get(zero);
    }

    /**
     * Method to set the score of physics subject
     *
     * @param score is the score of physics subject
     */
    public void setPhysicsScore(double score) {
        if (score < zero) {
            mScores.set(zero, score * MinusOne);
        } else {
            mScores.set(zero, score);
        }
    }

    /**
     * Method to get the  score of Chemistry subject
     *
     * @return score of chemistry subject
     */
    public double getChemistryScore() {
        return mScores.get(one);
    }

    /**
     * Method to set the  score of Chemistry subject
     *
     * @param score is the score of Chemistry subject
     */
    public void setChemistryScore(double score) {
        if (score < zero) {
            mScores.set(one, score * MinusOne);
        } else {
            mScores.set(one, score);
        }
    }

    /**
     * Method to get the  score of Math subject
     *
     * @return score of the math subject
     */
    public double getMathScore() {
        return mScores.get(two);
    }

    /**
     * Method to set the  score of Math subject
     *
     * @param score is the score of Math subject
     */
    public void setMathScore(double score) {
        if (score < zero) {
            mScores.set(two, score * MinusOne);
        } else {
            mScores.set(two, score);
        }
    }

    /**
     * Method to get the  score of English subject
     *
     * @return score of English Subject
     */
    public double getEnglishScore() {
        return mScores.get(three);
    }

    /**
     * Method to set the  score of Chemistry subject
     *
     * @param score is the score of English Subject
     */
    public void setEnglishScore(double score) {
        if (score < zero) {
            mScores.set(three, score * MinusOne);
        } else {
            mScores.set(three, score);
        }
    }

    /**
     * Method to get the  score of Computer Science subject
     *
     * @return the score of Computer Science subject
     */
    public double getComputerScienceScore() {
        return mScores.get(four);
    }

    /**
     * Method to set the score of Computer Science subject
     *
     * @param score of Computer science subject
     */
    public void setComputerScienceScore(double score) {
        if (score < zero) {
            mScores.set(four, score * MinusOne);
        } else {
            mScores.set(four, score);
        }
    }

    /**
     * Method to get the  score of Physical Education subject
     *
     * @return score of Physical Education Subject
     */
    public double getPhysicalEducationScore() {
        return mScores.get(five);
    }

    /**
     * Methid to set the score of Physical Education subject
     *
     * @param score is the score of Physical Education subject
     */
    public void setPhysicalEducationScore(double score) {
        if (score < zero) {
            mScores.set(five, score * MinusOne);
        } else {
            mScores.set(five, score);
        }
    }

    /**
     * Method to get the total score
     *
     * @return total score
     */
    public double getTotalScore() {
        mTotalScore = 0.0;
        for (int i = 0; i < mScores.size(); i++) {
            mTotalScore += mScores.get(i);
        }
        return mTotalScore;
    }

    /**
     * Method to get the Final Score scored in all the subject
     *
     * @return final score
     */
    public double getFinalScore() {
        Double mFinalScore = 0.0;
        for (int i = 0; i < mScores.size(); i++) {
            mFinalScore += mScores.get(i);
        }
        mFinalScore /= mScores.size();
        return mFinalScore;
    }

    /**
     * Method to get the final percentage
     *
     * @return percentage
     */
    public double getFinalScorePercentage() {
        mFinalScorePercentage = mTotalScore / (mScores.size() * 100);
        return mFinalScorePercentage;
    }

    /**
     * Method to get the final grade
     *
     * @return final grade
     */
    public String finalGrade() {
        if (mFinalScorePercentage > 79 && mFinalScorePercentage < 101) {
            mLetterGrade = "A";
        } else if (mFinalScorePercentage > 69 && mFinalScorePercentage < 80) {
            mLetterGrade = "B";
        } else if (mFinalScorePercentage > 59 && mFinalScorePercentage < 70) {
            mLetterGrade = "C";
        } else if (mFinalScorePercentage > 49 && mFinalScorePercentage < 60) {
            mLetterGrade = "D";
        } else if (mFinalScorePercentage > 39 && mFinalScorePercentage < 50) {
            mLetterGrade = "E";
        } else {
            mLetterGrade = "F";
        }
        return mLetterGrade;
    }

    /**
     * @return the report card  by using toString method and a String builder
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String mReport = "";
        for (int i = 0; i < mScores.size(); i++) {
            Double scores = mScores.get(i);
            String subjects = mSubjects.get(i);
            mReport += subjects + ":" + scores + "\n";
        }
        mReport += "Final Grade" + mLetterGrade;
        builder.append(mReport);
        return builder.toString();
    }
}
