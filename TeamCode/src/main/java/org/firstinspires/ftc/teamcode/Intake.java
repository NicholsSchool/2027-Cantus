package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.gobilda.GoBildaPinpointDriver;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

 CRServo intakeleft;
 CRServo intakeright;
 public Intake(HardwareMap hwMap){
     intakeright = hwMap.get(CRServo.class, "intakeright");
     intakeleft = hwMap.get(CRServo.class, "intakeleft");

 }
 public void intaking(){
     intakeright.setPower(1);
     intakeleft.setPower(1);
 }
}
