package ru.aston.gamezo_ag.task1;

import java.math.BigDecimal;

public class Selling extends Computer{

    private final BigDecimal discountSelling = BigDecimal.valueOf(1);

    public Selling(Manufacturer manufacturer, String model, BigDecimal price, User user) {
        super(manufacturer, model, price, user);
    }

    public BigDecimal getDiscount() {
        BigDecimal discount = getPrice().multiply(discountSelling);
        if (getManufacturer() == Manufacturer.HP) {
            return setPrice(discount.multiply(BigDecimal.valueOf(0.90)));
        }
        return discount;
    }
}
