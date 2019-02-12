package com.company.romz;

class Converter {

    private double tmpRes = .0;
    private Interaction runAgain = new Interaction();

    private static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

    void FarToCel(int temp)
    {
        tmpRes = ((((double)(temp))-32)*5)/9;
        double finalCel = arrondi( tmpRes , 2);
        System.out.println(temp + " degrés Farenheit sont egal à " + finalCel + " degrés Celsius.");
        runAgain.RunAgain();
    }
    void CelToFar(int temp)
    {
        tmpRes = (9 / 5)*(double)(temp)*5;
        double finalFar = arrondi(tmpRes , 2);
        System.out.println(temp + " degrés Celsius sont egal à " + finalFar + "Degrés Farenheit.");
        runAgain.RunAgain();
    }

}
