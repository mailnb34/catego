package com.example.utils;

public class HealthCare {
    public static com.example.utils.BMIStatus calculate_bmi(double height, double weight)
    {
        double BMI=weight/Math.pow(height,2);
        String des="";
        if (BMI<18.5){
            des="Gầy trơ xương";
        }
        else if(BMI<23)
        {
            des="Bình thường";
        }
        else
        {
            des="Máp";
        }
        com.example.utils.BMIStatus bmiStatus=new com.example.utils.BMIStatus(BMI,des);
        return bmiStatus;
    }
}
