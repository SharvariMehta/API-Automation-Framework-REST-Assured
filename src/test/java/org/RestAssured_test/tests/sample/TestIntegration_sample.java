package org.RestAssured_test.tests.sample;

import jdk.jfr.Description;
import org.testng.*;
import org.testng.annotations.Test;

public class TestIntegration_sample {

    @Description("TC#INT1 - Step 1 : Verify that booking can be Created")
    @Test(groups = "qa", priority = 1)
    public void testCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Description("TC#INT1 - Step 2 : Verify Booking by Booking ID")
    public void verifyCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Description("TC#INT1 - Step 3 : Verify that booking can be updated")
    public void updateCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Description("TC#INT1 - Step 4 : Verify that booking can be Deleted")
    public void deleteCreateBooking() {
        Assert.assertTrue(true);
    }
}
