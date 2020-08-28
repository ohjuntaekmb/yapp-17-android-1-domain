package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private final Point point;
    private final String address;
    private final String content;
    private final String city;
    private final LocalDate createDate;

    private List<PostImage> postImages;

    Post(Point point, String address, String content, String city, LocalDate createDate) {
        this.point = point;
        this.address = address;
        this.postImages = new ArrayList<>();
        this.content = content;
        this.city = city;
        this.createDate = createDate;
    }

    public static Post create(double lat, double lng, String address, String content, String city, LocalDate createDate) {
        return new Post(new Point(lat, lng),address, content, city, createDate);
    }

    public List<PostImage> saveImages(List<PostImage> postImages) {
        this.postImages = postImages;
        return this.postImages;
    }

    @Override public String toString() {
        return "domain.Post{" +
                "point=" + point +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", city='" + city + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
