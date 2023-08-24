package Controller;

import Models.ResponseCode;
import Models.Ticket;
import dto.IssueTicketData;
import dto.ResponseTicketData;
import Exception.InvalidDataException;
import Services.TicketService;
public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public ResponseTicketData getTicket(IssueTicketData issueTicketData){
        ResponseTicketData responseTicketData = new ResponseTicketData();
        Ticket ticket;
        try {
            if(issueTicketData.getGateId()==0||issueTicketData.getType()==null&&issueTicketData.getVehicleNUmber()==null){
                throw new InvalidDataException("data is not correct ");
            }
            ticket = ticketService.getTicket(issueTicketData.getType(),
                    issueTicketData.getVehicleNUmber(),
                    issueTicketData.getColor(),
                    issueTicketData.getMake(),
                    issueTicketData.getGateId());
        }
        catch (Exception e){
            responseTicketData.setResponseCode(ResponseCode.FAILURE);
            responseTicketData.setFailureReason(e.getMessage());
        }
        return responseTicketData;
    }
}
