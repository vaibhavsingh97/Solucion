package com.example.vaibhav.reportcard;

import java.util.ArrayList;

/**
 * Created by vaibhav on 7/23/17.
 */

public class ReportCard {
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

        mSubjects.add(0, "Physics");
        mSubjects.add(1, "Chemistry");
        mSubjects.add(2, "Math");
        mSubjects.add(3, "English");
        mSubjects.add(4, "Computer Science");
        mSubjects.add(5, "Physical Education");

        mScores.add(0, physicsScore);
        mScores.add(1, chemistryScore);
        mScores.add(2, mathScore);
        mScores.add(3, englishScore);
        mScores.add(4, computerScienceScore);
        mScores.add(5, physicalEducationScore);
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
        this.mYear = year;
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
        return mScores.get(0);
    }

    /**
     * Method to set the score of physics subject
     *
     * @param score is the score of physics subject
     */
    public void setPhysicsScore(double score) {
        mScores.set(0, score);
    }

    /**
     * Method to get the  score of Chemistry subject
     *
     * @return score of chemistry subject
     */
    public double getChemistryScore() {
        return mScores.get(1);
    }

    /**
     * Method to set the  score of Chemistry subject
     *
     * @param score is the score of Chemistry subject
     */
    public void setChemistryScore(double score) {
        mScores.set(1, score);
    }

    /**
     * Method to get the  score of Math subject
     *
     * @return score of the math subject
     */
    public double getMathScore() {
        return mScores.get(2);
    }

    /**
     * Method to set the  score of Math subject
     *
     * @param score is the score of Math subject
     */
    public void setMathScore(double score) {
        mScores.set(2, score);
    }

    /**
     * Method to get the  score of English subject
     *
     * @return score of English Subject
     */
    public double getEnglishScore() {
        return mScores.get(3);
    }

    /**
     * Method to set the  score of Chemistry subject
     *
     * @param score is the score of English Subject
     */
    public void setEnglishScore(double score) {
        mScores.set(3, score);
    }

    /**
     * Method to get the  score of Computer Science subject
     *
     * @return the score of Computer Science subject
     */
    public double getComputerScienceScore() {
        return mScores.get(4);
    }

    /**
     * Method to set the score of Computer Science subject
     *
     * @param score of Computer science subject
     */
    public void setComputerScienceScore(double score) {
        mScores.set(4, score);
    }

    /**
     * Method to get the  score of Physical Education subject
     *
     * @return score of Physical Education Subject
     */
    public double getPhysicalEducationScore() {
        return mScores.get(5);
    }

    /**
     * Methid to set the score of Physical Education subject
     *
     * @param score is the score of Physical Education subject
     */
    public void setPhysicalEducationScore(double score) {
        mScores.set(5, score);
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
