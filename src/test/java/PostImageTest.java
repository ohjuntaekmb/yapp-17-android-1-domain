import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostImageTest {

    public static final String URL = "https://example.com/";

    @Test
    @DisplayName("사진 생성 테스트, 동등성 검사")
    void createTest() {
        PostImage postImage = new PostImage(URL + 1);
        PostImage postImage1 = new PostImage(URL + 1);

        assertEquals(postImage, postImage1);
    }
}