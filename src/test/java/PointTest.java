import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PointTest {

    @Test
    @DisplayName("위도는 소수점 7자리를, 경도는 소수점 6자리를 가진다.")
    void latTest() {
        double lat = 1.0000001;
        double lng = 1.000001;
        Point point = new Point(lat, lng);
        assertNotNull(point);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0000000, 1.00001, 1.00000001})
    @DisplayName("위도가 소수점 7자리가 아니면 예외가 발생한다")
    void validateLatTest(double lat) {
        double lng = 1.000001; // 6자리 숫자
        assertThrows(IllegalArgumentException.class, () -> new Point(lat, lng));
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0000000, 1.00001, 1.00000001})
    @DisplayName("경도가 소수점 6자리가 아니면 예외가 발생한다")
    void validateLngTest(double lng) {
        double lat = 1.0000001; // 7자리 숫자
        assertThrows(IllegalArgumentException.class, () -> new Point(lat, lng));
    }

}
