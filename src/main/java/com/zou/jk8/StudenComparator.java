package com.zou.jk8;

public class StudenComparator {

    public int compareStudentByScore(Studen studen1, Studen studen2) {

        return studen1.getScore() - studen2.getScore();
    }

    public int compareStudentByName(Studen studen1, Studen studen2) {
        return studen1.getName().compareToIgnoreCase(studen2.getName());

    }




}


































