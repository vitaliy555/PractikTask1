package com.practik.task1.dao;

import com.practik.task1.dto.Auditorium;
import com.practik.task1.dto.Event;

import java.util.Date;
import java.util.List;

public class EventService {
    public Event create(){
        return null;
    };
    public void remove(Event event){};
    public void getByName(String name){};
    public List<Event> getAll(){
        return null;
    };
//    public List<Event> getForDateRange(from,to){};
//    public void getNextEvents(to){};

    /**
     * assign auditorium for event for specific date
     * @param event
     * @param auditorium
     * @param date
     */
    public void assignAuditorium(Event event, Auditorium auditorium, Date date){};



//    create - should create Event with name, air dates and times, base price for tickets, rating (high, mid, low)
//    remove, getByName, getAll
//    getForDateRange(from, to) - returns events for specified date range (OPTIONAL)
//    getNextEvents(to) - returns events from now till the ‘to’ date (OPTIONAL)
//    assignAuditorium(event, auditorium, date) - assign auditorium for event for specific date
}
