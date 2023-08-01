package Model;

import Controller.iGetModel;

public class Calculator implements iGetModel {

    private double[] result = new double[] { 0, 0 };
    private ComplexNumber arg1, arg2;

    public void setArg1(String value) {
        arg1 = new ComplexNumber(value);
    }


    public void setArg2(String value) {
        arg2 = new ComplexNumber(value);
    }


    public ComplexNumber getArg1() {
        return arg1;
    }

    
    public ComplexNumber getArg2() {
        return arg2;
    }

    
    public double[] divide() {
        result[0] = ((arg1.getRealPart()) * (arg2.getRealPart())
                + (arg1.getImagineryPart()) * (arg2.getImagineryPart()))
                / ((arg2.getRealPart() * arg2.getRealPart()) + (arg2.getImagineryPart() * arg2.getImagineryPart()));

        result[1] = ((arg2.getRealPart()) * (arg1.getImagineryPart())
                - (arg1.getRealPart()) * (arg2.getImagineryPart()))
                / ((arg2.getRealPart() * arg2.getRealPart()) + (arg2.getImagineryPart() * arg2.getImagineryPart()));

        return result;
    }

    
    public double[] multiply() {
        result[0] = (arg1.getRealPart()) * (arg2.getRealPart()) - (arg1.getImagineryPart()) * (arg2.getImagineryPart());
        result[1] = (arg1.getRealPart()) * (arg2.getImagineryPart()) + (arg1.getImagineryPart()) * (arg2.getRealPart());

        return result;
    }

    
    public double[] sum() {
        result[0] = arg1.getRealPart() + arg2.getRealPart();
        result[1] = arg1.getImagineryPart() + arg2.getImagineryPart();

        return result;
    }

     
    public double[] deduct() {
        result[0] = arg1.getRealPart() - arg2.getRealPart();
        result[1] = arg1.getImagineryPart() - arg2.getImagineryPart();

        return result;
    }

}