
import kendaraan_1302213089.SepedaMotor_1302213089;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SepedaMotorTest {

    @Test
    public void testCekKapanHabisWithBensin() {
        SepedaMotor_1302213089 motor = new SepedaMotor_1302213089("merah");
        motor.isiTangkiFull_1302213089();
        String expectedHabis = LocalDateTime.now().plusHours(3).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String actualHabis = motor.cekKapanHabis_1302213089();
        Assertions.assertEquals(expectedHabis, actualHabis);
    }

    @Test
    public void testCekKapanHabisWithoutBensin() {
        SepedaMotor_1302213089 motor = new SepedaMotor_1302213089("merah");
        String expectedHabis = "";
        String actualHabis = motor.cekKapanHabis_1302213089();
        Assertions.assertEquals(expectedHabis, actualHabis);
    }
}