package com.apress.spring6recipes.shop;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Cashier {
    private final MessageSource messageSource;

    public Cashier(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void checkout(ShoppingCart cart) throws IOException {
        var alert = messageSource.getMessage("alert.inventory.checkout",
                new Object[] { cart.getItems(), new Date() }, Locale.US);
        System.out.println(alert);
    }
}
