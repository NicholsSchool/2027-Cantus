package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "Tank Drive")
public class Teleop extends OpMode{

    Drivetrain drivetrain;
    Intake intake;
    Outtake outtake;

    @Override
    public void init() {
        drivetrain = new Drivetrain(hardwareMap);
        intake = new Intake(hardwareMap);
        outtake = new Outtake(hardwareMap);
    }

    @Override
    public void loop() {
        drivetrain.drive(gamepad1.left_stick_y, gamepad1.right_stick_y);

        if(gamepad1.right_trigger_pressed){
            intake.intaking();
        }else{
            intake.not_intaking();
        }
        if(gamepad1.x){
            outtake.outaking();
        }else{
            outtake.not_outaking();
        }
        if(gamepad1.y){
            outtake.flywheel();
        }else{
            outtake.flywheel_off();
        }
    }
}
