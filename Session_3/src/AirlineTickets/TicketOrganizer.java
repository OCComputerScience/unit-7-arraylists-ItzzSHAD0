package AirlineTickets;

import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }

    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }

    public void printPassengersByBoardingGroup()
    {
        for (int i = 1; i < 6; i++)
        {
            System.out.println("Boarding Group " + i + ":");

            int lowestSeat = Integer.MIN_VALUE;
            for (int j = 0; j < tickets.size(); j++)
            {
                if (tickets.get(j).getBoardingGroup() == i)
                {
                    System.out.println("Passenger " + j);
                }
            }
        }

    }

    public void canBoardTogether()
    {
        boolean multiBoarders = false;
        for (int i = 0; i < tickets.size() - 1; i += 2)
        {
            if (tickets.get(i).getBoardingGroup() == tickets.get(i + 1).getBoardingGroup() &&
                tickets.get(i).getRow() == tickets.get(i + 1).getRow())
            {
                multiBoarders = true;
                System.out.println("Passenger " + i + " can board with Passenger " + i + 1 + ".");
            }
        }

        if (!multiBoarders)
        {
            System.out.println("No Passengers can board together!");
        }
    }
}
