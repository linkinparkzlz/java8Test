package com.zou.jk8;

public class Studen {

    private String name;

    private int score;

    public Studen(String name, int score) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    //根据分数进行排序

    public static int compareStudentByScore(Studen studen1, Studen studen2) {

        return studen1.score - studen2.getScore();
    }

    //根据ASCII码
    public static int compareStudentByName(Studen studen1, Studen studen2) {
        return studen1.getName().compareTo(studen2.getName());
    }


    //使用的方式是当前的和传进去的比较
    public int compareByScore(Studen studen) {

        return this.getScore() - studen.getScore();
    }

    //
    public int compareByName(Studen studen) {
        return this.getName().compareToIgnoreCase(studen.getName());
    }


}















