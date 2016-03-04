
public class Month {
    private int monthNumber;

    public Month() throws InvalidMonth {
        this(1);
    }
    public Month(int monthNumber) throws InvalidMonth {
        if(monthNumber < 1 || monthNumber > 12)
        {
            throw new InvalidMonth(monthNumber);
        }
        else
        {
            this.monthNumber = monthNumber;
        }
    }
    public Month(String month) throws InvalidStringMonth {

        switch (month)
        {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "Augest":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;

            default:
                throw new InvalidStringMonth(month);
        }
    }
    public void setMonthNumber(int monthNumber)
    {
        if(monthNumber < 1 || monthNumber > 12)
        {
            this.monthNumber = 1;
        }
        else
        {
            this.monthNumber = monthNumber;
        }
    }
    public int getMonthNumber()
    {
        return monthNumber;
    }
    public String getMonthName()
    {
        String name = "";
        switch (monthNumber)
        {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name =  "July";
                break;
            case 8:
                name = "Augest";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;

        }
        return name;
    }
    public String toString()
    {
        return "Month name : " + getMonthName() + " and number " + getMonthNumber();
    }

    public boolean equals(Month month)
    {
        if(monthNumber == month.monthNumber)
            return true;
        else
            return false;
    }

    public boolean greaterThan(Month month)
    {
        if(monthNumber > month.monthNumber)
            return true;
        else return false;
    }
    public boolean lessThan(Month month)
    {
        if(monthNumber < month.monthNumber)
        {
            return true;
        }
        else return false;
    }


}
