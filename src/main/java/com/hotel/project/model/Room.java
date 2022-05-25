package com.hotel.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {

    @Id@GeneratedValue
    private long id;
    private String type;
    private int sizePerson;
    private int roomNumber;

    public Room(long id, String type, int sizeperson, int roomNumber) {
        this.id = id;
        this.type = type;
        this.sizePerson = sizeperson;
        this.roomNumber = roomNumber;
    }

    public Room() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSizePerson() {
        return sizePerson;
    }

    public void setSizePerson(int sizePerson) {
        this.sizePerson = sizePerson;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
