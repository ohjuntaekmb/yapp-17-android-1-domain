public class Point {
    private final double lat;
    private final double lng;

    public Point(double lat, double lng) {
        validateLat(lat);
        validateLng(lng);
        this.lat = lat;
        this.lng = lng;
    }

    private void validateLat(double lat) {
        String latStr = String.valueOf(lat);
        String[] split = latStr.split("\\.");
        int length = split[1].length();

        if (length != 7) {
            throw new IllegalArgumentException("7자리의 소수점을 입력해주세요.");
        }
    }

    private void validateLng(double lng) {
        String lngStr = String.valueOf(lng);
        String[] split = lngStr.split("\\.");
        int length = split[1].length();

        if (length != 6) {
            throw new IllegalArgumentException("7자리의 소수점을 입력해주세요.");
        }
    }

    @Override public String toString() {
        return "Point{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
