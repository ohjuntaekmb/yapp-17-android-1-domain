import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostImageTest {

    public static final String URL = "https://example.com/1";

    @Test
    @DisplayName("사진 생성 테스트")
    void createTest() {
        PostImage postImage = new PostImage(URL);
        assertNotNull(postImage);
    }

}