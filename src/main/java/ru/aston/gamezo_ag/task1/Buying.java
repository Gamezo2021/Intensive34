package ru.aston.gamezo_ag.task1;

import ru.aston.gamezo_ag.task1.Exception.PriceSettingException;

import java.math.BigDecimal;

public class Buying extends Computer {

    private BigDecimal discountBuying = BigDecimal.valueOf(1);

    public Buying(Manufacturer manufacturer, String model, BigDecimal price, User user) throws PriceSettingException {
        super(manufacturer, model, price, user);
    }
    public BigDecimal getDiscount() {
        BigDecimal discount = getPrice().multiply(discountBuying);
        if (getManufacturer() == Manufacturer.LENOVO) {
            return setPrice(discount.multiply(BigDecimal.valueOf(0.9)));
        }
        return discount;
    }
}

