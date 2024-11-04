import java.util.Date;
import java.sql.Time;

public class Ticket {
    private String source;
    private String destination;
    private Date dateOfJourney;
    private Time time;
    private String busNo;
    private String seatNo;

    public Ticket(String source, String destination, Date dateOfJourney, Time time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }

}
