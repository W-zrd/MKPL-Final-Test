import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pabrikan_1302210127.YamahaMoi_1302210127;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class YamahaMoiTest {

    @Test
    public void testCekKapanHabisWithBensin() {
        YamahaMoi_1302210127 moi = new YamahaMoi_1302210127("Hijau", "");
        moi.isiTangkiFull_1302213089();
        String expectedHabis = LocalDateTime.now().plusHours(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String actualHabis = moi.cekKapanHabis_1302213089();
        Assertions.assertEquals(expectedHabis, actualHabis);
    }

    @Test
    public void testCekKapanHabisWithoutBensin() {
        YamahaMoi_1302210127 moi = new YamahaMoi_1302210127("Hijau", "");
        String expectedHabis = "";
        String actualHabis = moi.cekKapanHabis_1302213089();
        Assertions.assertEquals(expectedHabis, actualHabis);
    }
}