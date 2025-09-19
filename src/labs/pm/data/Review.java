package labs.pm.data;

import java.io.Serializable;

/**
 * @author $(USER)
 **/
public record Review(Rating rating, String comments) implements Comparable<Review>, Serializable {

    @Override
    public int compareTo(Review other) {
        return other.rating.ordinal() - this.rating.ordinal();
    }
}
