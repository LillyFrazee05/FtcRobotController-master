package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MainRobot {

    public DcMotor FL = null;
    public DcMotor FR = null;
    public DcMotor BL = null;
    public DcMotor BR = null;
    public DcMotor JH1 = null;
    public DcMotor JH2 = null;
    public CRServo WC = null;

    HardwareMap hwMap = null;

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;

        FL = hwMap.get(DcMotor.class, "frontLeft");
        FR = hwMap.get(DcMotor.class, "frontRight");
        BL = hwMap.get(DcMotor.class,"backLeft");
        BR = hwMap.get(DcMotor.class,"backRight");
        JH1 = hwMap.get(DcMotor.class,"jHopper1");
        JH2 = hwMap.get(DcMotor.class,"jHopper2");
        WC = hwMap.get(CRServo. class,"wobbleClaw");

        FL.setDirection(DcMotor.Direction.REVERSE);
        FR.setDirection(DcMotor.Direction.REVERSE);
        BL.setDirection(DcMotor.Direction.FORWARD);
        BR.setDirection(DcMotor.Direction.FORWARD);

        FL.setPower(0);
        FR.setPower(0);
        BL.setPower(0);
        BR.setPower(0);
        JH1.setPower(0);
        JH2.setPower(0);
        WC.setPower(0);
    }
}
