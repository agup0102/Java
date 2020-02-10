import java.util.List;
/**
 * Write a description of class EventHall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventHall
{
    
private List<Hall> halls;

public EventHall(List<Hall> halls)
{
this.halls=halls;
}

public List<Hall> gethalls() 
    {
        return halls;
    }

     public void addhalls(Hall hall)
    {
        halls.add(hall);
    }
    public void sethalls(List<Hall> halls)
    {
        this.halls = halls;
    }
}