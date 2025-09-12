package org.RestAssured_main.pojos.response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.RestAssured_main.pojos.request.Booking;

public class BookingResponse {

    @SerializedName("bookingid")
    @Expose
    private Booking booking;
    public Booking getBooking() {
        return booking;
    }
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @SerializedName("booking")
    @Expose
    private Integer bookingid;
    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }
}

