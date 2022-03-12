package com.company;

public class MatrixMultiplier
{
    public static void printMultiplyMatrix(double[][] m1, double[][] m2)
    {
        double[][] result = new double[m1.length][m2[0].length];
        System.out.println("  Name  |  Row  |   Column  |   Result  ");
        System.out.println("--------|-------|-----------|-----------");

        if (m1[0].length == m2.length)
        {
            for (int i = 0; i < m1.length; i++)
            {
                for (int j = 0; j < m2[0].length; j++)
                {
                    for (int k = 0; k < m2.length; k++)
                    {
                        result[i][j] += m1[i][k] * m2[k][j];

                    }
                    System.out.println(" Matrix |  ["+i+"]  |    ["+j+"]    |    " + result[i][j]);
                }
            }
        }
    }
}
