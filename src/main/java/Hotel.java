import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }
    public int getBedroomCount(){
        return this.bedrooms.size();
    }
    public int getConferenceCount(){
        return this.conferenceRooms.size();
    }
    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }
    public void addConference(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

}
