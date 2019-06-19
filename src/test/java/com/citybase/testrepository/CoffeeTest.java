package com.citybase.testrepository;

import com.citybase.testrepository.model.Coffee;
import org.junit.Test;

public class CoffeeTest {

    @Test
    public void coffeeTest(){
                Coffee latte = new Coffee.Builder()
                .cream(true)
                .sugar(false)
                .size(Coffee.Size.GRANDE)
                .build();
        System.out.println(latte);
    }
}
