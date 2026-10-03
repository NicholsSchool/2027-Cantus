package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Outtake {
    DcMotorEx outtaker;

    public Outtake(HardwareMap hwMap){
        outtaker = hwMap.get(DcMotorEx.class, "outtaker");

    }
    public void outtaking(){
        outtaker.setPower(1);
    }
}
