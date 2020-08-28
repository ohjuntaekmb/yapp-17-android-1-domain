import java.time.LocalDate;
import java.util.List;

public class Post {
    private final Point point;
    private final String address;
    private final List<PostImage> postImage;
    private final String content;
    private final String city;
    private final LocalDate createDate;

    public Post(Point point, String address, List<PostImage> postImage, String content, String city, LocalDate createDate) {
        this.point = point;
        this.address = address;
        this.postImage = postImage;
        this.content = content;
        this.city = city;
        this.createDate = createDate;
    }
}
