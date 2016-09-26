package com.techelevator;

public class Airplane {

	private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats = 0;
    private int totalCoachSeats;
    private int bookedCoachSeats = 0;

    /**
     * Creates a new airplane 
     * @param totalFirstClassSeats Total number of first class seats that can be booked
     * @param totalCoachSeats Total number of coach seats that can be booked
     */
    public Airplane(int totalFirstClassSeats, int totalCoachSeats) {
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;            
    }

    public Airplane(String planeNumber, int totalFirstClassSeats, int bookedFirstClassSeats, int totalCoachSeats,
			int bookedCoachSeats) {
		super();
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.bookedFirstClassSeats = bookedFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		this.bookedCoachSeats = bookedCoachSeats;
	}

	/**
     * 6-Character Plane Number 
     * @return planeNumber
     */
    public String getPlaneNumber() {
        return planeNumber;            
    }

    /**
     * Number of already booked first class seats 
     * @return bookedFirstClassSeats
     */
    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;            
    }

    /**
     * Available number of first class seats 
     * @return availableFirstClassSeats
     */
    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    /**
     * Total number of first class seats 
     * @return totalFirstClassSeats
     */
    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;        
    }

    /**
     * Number of already booked coach seats 
     * @return bookedCoachSeats
     */
    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    /**
     * Available number of coach seats 
     * @return availableCoachSeats
     */
    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

    /**
     * Total number of coach seats 
     * @return totalCoachSeats
     */
    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    /**
     * Reserves a first class or coach seat. Algorithm checks for reservation possiblity before making reservation. 
     * @param firstClass True if the reservation is for first class, false for coach
     * @param totalNumberOfSeats Total number of seats to reserve
     * @return True if reservation was successful, false otherwise
     */
    public boolean reserve(boolean firstClass, int totalNumberOfSeats) {       
        if (firstClass) {
            if (totalNumberOfSeats > getAvailableFirstClassSeats()) {
                return false;
            } else {
            	bookedFirstClassSeats += totalNumberOfSeats;
            }
            
        }
        else {
        	
           
            if (totalNumberOfSeats > getAvailableCoachSeats()) {
                return false;
            } else {
            	 bookedCoachSeats += totalNumberOfSeats;
            }
        }
        return true;
    }
    

}
