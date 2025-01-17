package c18_static.travleplan;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class TrabelPlan {
    // 필드 선언
    private String destination;
    private String depatureDate;
    private String returnDate;
    private int numberOfTravelers;
    private String hotelName;
    private String flightNumber;
}
