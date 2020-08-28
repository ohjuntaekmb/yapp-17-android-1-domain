package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static domain.PostTest.*;

class PostsTest {

    @Test
    @DisplayName("저장된 글의 정보를 전체 조회할 때, 각각 글의 위도, 경도, 이미지url 정보가 조회된다.")
    void getAllPosts() {
        Post post1 = Post.create(LAT, LNG, ADDRESS, CONTENT, CITY, CREATE_DATE);
        Post post2 = Post.create(LAT, LNG, ADDRESS, CONTENT, CITY, CREATE_DATE);
        Posts posts = new Posts(Arrays.asList(post1, post2));

//        assertThat(posts.)
    }

}