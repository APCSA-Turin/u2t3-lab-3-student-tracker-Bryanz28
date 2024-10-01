package com.example.project;

public class Student {
    // instance variables for 
    String firstName;

    String lastName;

    int gradYear;

    int scoreCount = 0;

    double highestScore=0.0;

    double accumulatedTestScores=0.0;


    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        this.firstName=firstName;
        this.lastName=lastName;
        this.gradYear=gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return scoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
       gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!

        accumulatedTestScores=   accumulatedTestScores + newTestScore;
        scoreCount++;
        if (newTestScore>highestScore) {
            highestScore = newTestScore;
        }

    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        if (averageTestScore()>=65) {
            return true;
        } else {
            return false;
        }
        
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return accumulatedTestScores/scoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: "+firstName+" "+lastName );
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + accumulatedTestScores);
        System.out.println("Average Test Score: "+ averageTestScore());
        System.out.println("Highest Test Score: "+ highestScore);
        System.out.println("Is passing: "+ isPassing());
    }
 }
 