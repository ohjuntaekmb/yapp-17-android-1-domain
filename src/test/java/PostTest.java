import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    @DisplayName("게시글 생성 테스트")
    void createTest() {
        Post post = new Post(new Point(27.0000001, 152.000001),
                "서울시 강낭구",
                null,
                "글내용",
                "서울특별시",
                LocalDate.now());

        assertNotNull(post);
    }

}