package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {


    DcMotorEx right;
    DcMotorEx left;

    public Drivetrain(HardwareMap hwMap){
        right = hwMap.get(DcMotorEx.class, "right");
        //left = hwMap.get(DcMotorEx.class, "left");
        left = hwMap.get(DcMotorEx.class,"left");
    }

    public void drive(double left_power,double right_power ){

        left.setPower(left_power);
        right.setPower(right_power);


    }
}
