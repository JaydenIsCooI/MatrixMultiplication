package com.company;

public class Main extends MatrixMultiplier {

    public static void main(String[] args) {

        double[][] m1 = new double[3][2];
        double[][] m2 = new double[2][4];

        m1[0][0] = 2;     m1[0][1] = 5;
        m1[1][0] = 4.5;   m1[1][1] = 6.5;
        m1[2][0] = 8;     m1[2][1] = 2;

        m2[0][0] = 3.5;   m2[0][1] = 4;     m2[0][2] = 7.5;     m2[0][3] = 3;
        m2[1][0] = 8;     m2[1][1] = 1.5;   m2[1][2] = 8.5;     m2[1][3] = 9;

        printMultiplyMatrix(m1, m2);
    }
}