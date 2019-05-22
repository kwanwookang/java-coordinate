package coord.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Points {
    private final List<Point> points;

    public Points(List<Point> points) {
        if (points.size() != new HashSet<>(points).size()) {
            throw new IllegalArgumentException("동일한 점은 입력할 수 없습니다.");
        }
        this.points = Collections.unmodifiableList(sortByDescYAscX(points));
    }

    private List<Point> sortByDescYAscX(List<Point> points) {
        points.sort((a, b) -> {
            if (a.y == b.y) {
                return a.x - b.x;
            }
            return b.y - a.y;
        });
        return points;
    }

    public int number() {
        return points.size();
    }

    public Point get(int index) {
        return points.get(index);
    }

    public List<Point> getPoints() {
        return points;
    }
}