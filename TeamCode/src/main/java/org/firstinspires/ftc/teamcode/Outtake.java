package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Outtake {
    DcMotorEx Outtaker;
    CRServo FlyWheel;

    public Outtake(HardwareMap hwMap){
        Outtaker = hwMap.get(DcMotorEx.class, "Outtaker");
        FlyWheel = hwMap.get(CRServo.class, "FlyWheel");

    }
    public void outtaking(){
        Outtaker.setPower(1);
        FlyWheel.setPower(1);
    }
    public void not_outtaking(){
        Outtaker.setPower(0);
        FlyWheel.setPower(0);
    }

}
