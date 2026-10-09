package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

 CRServo intake_left;
 CRServo intake_right;
 CRServo FlyWheel;
 DcMotorEx Intaker;
 public Intake(HardwareMap hwMap){
     intake_right = hwMap.get(CRServo.class, "R Paddle");
     intake_left = hwMap.get(CRServo.class, "L Paddle");
     Intaker = hwMap.get(DcMotorEx.class, "Intake");
     FlyWheel = hwMap.get(CRServo.class, "Aggetator");
 }
 public void intaking(){
     intake_right.setPower(1);
     intake_left.setPower(1);
     Intaker.setPower(1);
     FlyWheel.setPower(1);
 }
    public void not_intaking(){
        intake_right.setPower(0);
        intake_left.setPower(0);
        Intaker.setPower(0);
        FlyWheel.setPower(0);
    }
}
