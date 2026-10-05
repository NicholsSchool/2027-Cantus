package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Outtake {
    DcMotorEx Outaker;
    CRServo FlyWheel;

    public Outtake(HardwareMap hwMap){
        Outaker = hwMap.get(DcMotorEx.class, "Outaker");
        FlyWheel = hwMap.get(CRServo.class, "FlyWheel");

    }
    public void outaking(){
        Outaker.setPower(1);

    }
    public void not_outaking(){
        Outaker.setPower(0);

    }
    public void flywheel(){
        FlyWheel.setPower(1);

    }
    public void flywheel_off(){
        FlyWheel.setPower(0);

    }


}
