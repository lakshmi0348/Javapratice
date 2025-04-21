package JavaFeatures;

public class Switch {
    public static void main(String[] args) throws Exception
    {
        String date ="sat";
        String time ="";
        time= switch (date)
        {
            case "sat" ,"sun" ->
                "6am";

            case "wed ,thurs"->
                "5am";

            default->
               "6.30am";
        };
        System.out.println(time);
    }
}
