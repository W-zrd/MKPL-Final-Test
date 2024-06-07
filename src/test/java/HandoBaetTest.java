import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pabrikan_1302210127.HandoBaet_1302210127;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HandoBaetTest {

    @Test
    // TEST IF FAILED
    public void testJalanWithBensin() {
        HandoBaet_1302210127 baet = new HandoBaet_1302210127("Hijau", "");
        baet.isiTangkiFull_1302213089();
        String expectedHabis = LocalDateTime.now().plusHours(4).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String actualHabis = baet.cekKapanHabis_1302213089();
        Assertions.assertEquals(expectedHabis, actualHabis); 
    }
}