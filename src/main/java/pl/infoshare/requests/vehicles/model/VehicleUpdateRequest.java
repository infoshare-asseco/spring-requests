package pl.infoshare.requests.vehicles.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class VehicleUpdateRequest {
    private final LocalDate lastReview;
    private final BigDecimal lastReviewMileage;

    public VehicleUpdateRequest(LocalDate lastReview, BigDecimal lastReviewMileage) {
        this.lastReview = lastReview;
        this.lastReviewMileage = lastReviewMileage;
    }

    public LocalDate getLastReview() {
        return lastReview;
    }

    public BigDecimal getLastReviewMileage() {
        return lastReviewMileage;
    }

    @Override
    public String toString() {
        return "VehicleUpdateRequest{" +
                "lastReview=" + lastReview +
                ", lastReviewMileage=" + lastReviewMileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleUpdateRequest that = (VehicleUpdateRequest) o;
        return Objects.equals(lastReview, that.lastReview) && Objects.equals(lastReviewMileage, that.lastReviewMileage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastReview, lastReviewMileage);
    }
}
