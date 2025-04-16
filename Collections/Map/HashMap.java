package Collections.Map;

public class HashMap {
    public static void main(String[] args)
    {
        java.util.HashMap<Integer,String> M= new java.util.HashMap<>();
        M.put(1,"Bhagya");
        M.put(2,"Lakshmi");
        M.put(3,"Durga");
        System.out.println(M.get(2));
        System.out.println(M.remove(3));
        System.out.println(M.containsKey(3));
        System.out.println(M.containsValue("Lakshmi"));
        System.out.println(M.size());
        System.out.println(M.keySet());
        System.out.println(M.values());
        System.out.println(M.entrySet());
        for(Integer key : M.keySet())
        {
            System.out.println(key +" " +M.get(key));
        }



    }
}
