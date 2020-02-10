
/**
 * Write a description of class EventHall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hall
{
    
    private int hallId;
    private String hallName;
    private String hallAddress;
    private String hallType;
    private boolean availibility;
    private float hallPrice;
    

    /**
     * Constructor for objects of class EventHall
     */
    public Hall(int hallId,String hallName,String hallAddress, String hallType,boolean availibity,float hallPrice)
    {
        // initialise instance variables
        this.hallId=hallId;
        this.hallName=hallName;
        this.hallAddress=hallAddress;
        this.hallType=hallType;
        this.availibility=availibility;
        this.hallPrice=hallPrice;
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
        public int gethallId() 
    {
        return hallId;
    }

    public void sethallId(int hallId)
    {
        this.hallId = hallId;
    }
     public String gethallName() 
    {
        return hallName;
    }

    public void sethallName(String hallName)
    {
        this.hallName = hallName;
    }
    
         public String gethallAddress() 
    {
        return hallAddress;
    }

    public void sethallAddress(String hallAddress)
    {
        this.hallAddress = hallAddress;
    }
    
    
         public String gethallType() 
    {
        return hallType;
    }

    public void sethallType(String hallType)
    {
        this.hallType = hallType;
    }
    
    
      public boolean getavailibility() 
    {
        return availibility;
    }

    public void setavailibility(boolean availibility)
    {
        this.availibility = availibility;
    }
    
          public float gethallPrice() 
    {
        return hallPrice;
    }

    public void sethallPrice(float hallPrice)
    {
        this.hallPrice = hallPrice;
    }
}
