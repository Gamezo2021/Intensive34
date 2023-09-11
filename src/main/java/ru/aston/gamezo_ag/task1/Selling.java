package ru.aston.gamezo_ag.task1;

import ru.aston.gamezo_ag.task1.Exception.PriceSettingException;

import java.math.BigDecimal;

public class Selling extends Computer{

    private final BigDecimal discountSelling = BigDecimal.valueOf(1);

    public Selling(Manufacturer manufacturer, String model, BigDecimal price, User user) throws PriceSettingException {
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
