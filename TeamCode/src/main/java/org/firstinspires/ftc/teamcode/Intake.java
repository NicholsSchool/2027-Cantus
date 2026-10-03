package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.gobilda.GoBildaPinpointDriver;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

 CRServo intakeleft;
 CRServo intakeright;
 DcMotorEx Intaker;
 public Intake(HardwareMap hwMap){
     intakeright = hwMap.get(CRServo.class, "intakeright");
     intakeleft = hwMap.get(CRServo.class, "intakeleft");
     Intaker = hwMap.get(DcMotorEx.class, "Intaker");

 }
 public void intaking(){
     intakeright.setPower(1);
     intakeleft.setPower(1);
     Intaker.setPower(1);
 }
    public void not_intaking(){
        intakeright.setPower(0);
        intakeleft.setPower(0);
        Intaker.setPower(0);
    }
}
