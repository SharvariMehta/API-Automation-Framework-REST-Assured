package org.RestAssured_test.tests.tests.sample;

import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegration_sample {

    @Test(description = "TC#INT1 - Step 1 : Verify that booking can be Created", groups = "qa", priority = 1)
    @Owner("SharvariMehta")
    public void testCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test(description = "TC#INT1 - Step 2 : Verify the Booking by Booking ID", groups = "qa", priority = 2)
    @Owner("SharvariMehta")
    public void verifyCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test(description = "TC#INT1 - Step 3 : Verify that booking can be updated", groups = "qa", priority = 2)
    @Owner("SharvariMehta")
    public void updateCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test(description = "TC#INT1 - Step 4 : Verify that booking can be Deleted", groups = "qa", priority = 2)
    @Owner("SharvariMehta")
    public void deleteCreateBooking() {
        Assert.assertTrue(true);
    }
}
