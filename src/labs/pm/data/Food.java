package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author $(USER)
 **/
public class Food extends Product{

    private LocalDate bestBefore;

    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }
}
