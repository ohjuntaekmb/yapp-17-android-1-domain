import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    private static final double LAT = 27.0000001;
    private static final double LNG = 152.000001;
    private static final String ADDRESS = "서울시 강남구";
    private static final String CONTENT = "글내용";
    private static final String CITY = "서울특별시";
    private static final LocalDate CREATE_DATE = LocalDate.now();

    public static final String POST_IMAGE_URL = "https://example.com/";

    @Test
    @DisplayName("게시글 생성 테스트")
    void createTest() {
        Post post = new Post(new Point(LAT, LNG),
                ADDRESS,
                CONTENT,
                CITY,
                CREATE_DATE);

        assertNotNull(post);
    }

    @Test
    @DisplayName("게시글에 여러 개의 사진을 달 수 있다.")
    void createWithPostImageTest() {
        Post post = Post.create(LAT, LNG, ADDRESS, CONTENT, CITY, CREATE_DATE);

        PostImage postImage = new PostImage(POST_IMAGE_URL + 1);
        PostImage postImage1 = new PostImage(POST_IMAGE_URL + 2);

        List<PostImage> postImages = Arrays.asList(postImage, postImage1);
        List<PostImage> saveImages = post.saveImages(postImages);

        assertEquals(postImages, saveImages);
    }

}