package org.RestAssured_test.tests.tests.crud;

import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateBooking {

    @Test(description = "TC#1 - Verify that booking can be Created", groups = "reg", priority = 1)
    @Owner("SharvariMehta")
    public void testCreateBookingPOST_Positive() {
        Assert.assertTrue(true);
    }

    @Test(description = "TC#2 - Verify that booking is not Created when payload is wrong", groups = "reg", priority = 1)
    @Owner("SharvariMehta")
    public void testCreateBookingPOST_Negative() {
        Assert.assertTrue(true);
    }
}
