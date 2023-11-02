package model;

public class Reviews {

    long appointment_id;
    String text_reviews;          //текстовые обзоры
    double rating;



    public long getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(long appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getText_reviews() {
        return text_reviews;
    }

    public void setText_reviews(String text_reviews) {
        this.text_reviews = text_reviews;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
