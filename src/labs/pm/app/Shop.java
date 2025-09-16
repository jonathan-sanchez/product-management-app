/*
 * Copyright (c) 2024.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package labs.pm.app;

import labs.pm.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Locale;

/**
 * {@code Shop} class represents an application that manages Products
 * @version 4.0
 * @author $(Jonathan)
 */
public class Shop {

    public static void main(String[] args) {
        //ProductManager (pm)
        ProductManager pm = new ProductManager("en-GB");

        //P1
        //create product, review it, print report
        pm.parseProduct("D,101,Tea,1.99,0,2021-09-21");
        pm.printProductReport(101);
        pm.parseReview("101,4,Nice hot cup of tea");
        pm.parseReview("101,2,Rather weak tea");
        pm.parseReview("101,4,Fine tea");
        pm.parseReview("101,4,Good tea");
        pm.parseReview("101,5,Perfect tea");
        pm.parseReview("101,3,Just add some lemon");
        pm.printProductReport(101);

        //P2
        pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.reviewProduct(102, Rating.THREE_STAR, "Coffee was ok");
        pm.reviewProduct(102, Rating.ONE_STAR, "Where is the milk?!");
        pm.reviewProduct(102, Rating.FIVE_STAR, "It's perfect with just ten spoons of sugar!");
//        pm.changeLocale("ru-RU");
//        pm.printProductReport(102);

        //P3
        pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now().plusDays(2));
        pm.reviewProduct(103, Rating.FIVE_STAR, "Very Nice Cake");
        pm.reviewProduct(103, Rating.FOUR_STAR, "Good, but I expected more chocolate");
        pm.reviewProduct(103, Rating.FIVE_STAR, "This cake is perfect!");
//        pm.printProductReport(103);

        //P4
        pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), Rating.NOT_RATED, LocalDate.now());
        pm.reviewProduct(104, Rating.THREE_STAR, "Just another cookie");
        pm.reviewProduct(104, Rating.THREE_STAR, "Ok");
//        pm.printProductReport(104);

        //P5
        pm.createProduct(105, "Hot chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.reviewProduct(105, Rating.FOUR_STAR, "Tasty!");
        pm.reviewProduct(105, Rating.FOUR_STAR, "Not bad at all");
//        pm.printProductReport(105);

        //P6
        pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now().plusDays(3));
        pm.reviewProduct(106, Rating.TWO_STAR, "Too sweet");
        pm.reviewProduct(106, Rating.THREE_STAR, "Better than cookie");
        pm.reviewProduct(106, Rating.TWO_STAR, "Too bitter");
        pm.reviewProduct(106, Rating.ONE_STAR, "I dont get it!");
//        pm.printProductReport(106);

//        pm.printProducts(p->p.getPrice().floatValue() < 2, (p1, p2) -> p2.getRating().ordinal()-p1.getRating().ordinal());
//
//        pm.getDiscounts().forEach((rating,discounts)->System.out.println(rating+": "+discounts));

//        pm.printProducts((p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
//        pm.printProducts((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));

//        Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
//        Comparator<Product> priceSorter = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());

//        pm.printProducts(ratingSorter.thenComparing(priceSorter));
//        pm.printProducts(ratingSorter.thenComparing(priceSorter).reversed());
    }
}