package org.RestAssured_main.modules;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import org.RestAssured_main.pojos.request.Auth;
import org.RestAssured_main.pojos.request.Booking;
import org.RestAssured_main.pojos.request.Bookingdates;
import org.RestAssured_main.pojos.response.BookingResponse;
import org.RestAssured_main.pojos.response.TokenResponse;

public class PayloadManager {
    Gson gson;
    Faker faker;

    //Serialization -> Convert Java object to JSON String to use as payload
    public String createPayloadBookingAsString () {
        Booking booking = new Booking();
        booking.setFirstname("Sharvari");
        booking.setLastname("Mehta");
        booking.setTotalprice(1000);
        booking.setDepositpaid(true);
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("0101-01-24");
        bookingdates.setCheckout("0101-02-24");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        return jsonStringBooking;

    }
    // Convert the JSON String to Java Object so that we can verify response Body
    // DeSerialization
    public BookingResponse bookingResponseJava(String responseString) {
        gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
        return bookingResponse;
    }
    public String createPayloadBooking_Faker () {
        faker = new Faker();
        Booking booking = new Booking();
        booking.setFirstname(faker.name().firstName());
        booking.setLastname("Mehta");
        booking.setTotalprice(1000);
        booking.setDepositpaid(true);
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("0101-01-24");
        bookingdates.setCheckout("0101-02-24");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        return jsonStringBooking;

    }
    // Java Object -> JSON
    public String setAuthPayload(){
        Auth auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");
        gson = new Gson();
        String jsonPayloadString = gson.toJson(auth);
        System.out.println("Payload set to the -> " + jsonPayloadString);
        return jsonPayloadString;

    }
    // DeSer ( JSON String -> Java Object
    public String getTokenFromJSON(String tokenResponse){
        gson = new Gson();
        TokenResponse tokenResponse1 = gson.fromJson(tokenResponse, TokenResponse.class);
        return  tokenResponse1.getToken();
    }

    public String createPayloadBookingAsStringWrongBody() {
        Booking booking = new Booking();
        booking.setFirstname("会意; 會意");
        booking.setLastname("会意; 會意");
        booking.setTotalprice(112);
        booking.setDepositpaid(false);
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("5025-02-01");
        bookingdates.setCheckout("5025-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("会意; 會意");
        System.out.println(booking);

        gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        return jsonStringBooking;
    }

    public String fullUpdatePayloadAsString() {
        Booking booking = new Booking();
        booking.setFirstname("Sharvari");
        booking.setLastname("Mehta");
        booking.setTotalprice(1000);
        booking.setDepositpaid(true);
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-05");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
        return gson.toJson(booking);
    }
    public Booking getResponseFromJSON(String getResponse){
        gson = new Gson();
        Booking booking = gson.fromJson(getResponse, Booking.class);
        return booking;
    }
}