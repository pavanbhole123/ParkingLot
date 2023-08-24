package dto;

import Models.Ticket;
import  Models.ResponseCode;
public class ResponseTicketData {
    private Ticket ticket;
    private ResponseCode responseCode;
    private String FailureReason;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public String getFailureReason() {
        return FailureReason;
    }

    public void setFailureReason(String failureReason) {
        FailureReason = failureReason;
    }
}
