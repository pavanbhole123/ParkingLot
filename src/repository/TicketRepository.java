package repository;

import Models.Gate;
import Models.Ticket;

import java.util.HashMap;
import Exception.TicketNotFound;
public class TicketRepository {
    private HashMap<Integer, Ticket>TicketHashMap;

    public TicketRepository() {
        TicketHashMap = new HashMap<>();
    }
    public Ticket get(int TicketId){
        Ticket ticket = TicketHashMap.get(TicketId);
        if (ticket == null){
            throw new TicketNotFound("ticket  for given ID not Found: " +TicketId);
        }
        return ticket;
    }
    public void put(Ticket ticket){
        TicketHashMap.put(ticket.getId(), ticket);
        System.out.println("gate Added Successfully");
    }
}
