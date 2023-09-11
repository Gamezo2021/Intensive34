package ru.aston.gamezo_ag.task1;


import java.math.BigDecimal;

public class Buying extends Computer {

    private BigDecimal discountBuying = BigDecimal.valueOf(1);


        super(manufacturer, model, price, user);
    }
    public BigDecimal getDiscount() {
        BigDecimal discount = getPrice().multiply(discountBuying);
        if (getManufacturer() == Manufacturer.LENOVO) {

        }
        return discount;
    }
}

