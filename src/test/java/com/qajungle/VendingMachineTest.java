package com.qajungle;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

public class VendingMachineTest {

    private VendingMachine vm;

    @Before
    public void initialize(){
        this.vm = new VendingMachine(10,5,4);
    }

    @Test
    public void buy_correct_quantity_of_products(){
        assertEquals(5, vm.buyProduct(ProductCode.P1, 5));
        assertEquals(1, vm.buyProduct(ProductCode.P2, 4));
        assertEquals(0, vm.buyProduct(ProductCode.P3, 4));
    }

    @Test(expected = InvalidParameterException.class)
    public void buy_incorrect_quantity_of_products(){
        vm.buyProduct(ProductCode.P1, 12);
        vm.buyProduct(ProductCode.P2, 6);
        vm.buyProduct(ProductCode.P3, 5);
    }

    @Test(expected = InvalidParameterException.class)
    public void buy_incorrect_products(){
        vm.buyProduct(ProductCode.P4, 12);
    }

}
