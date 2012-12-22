public class Username {
    static String newMember(String[] existingNames, String newName)
    {
        int number = 0;
        boolean b = false;
        String result = newName;
        do
        {
        for (int x=0; x<existingNames.length; x++)
        {
            b = false;
            if(existingNames[x].equals(result))
            {
                b = true;
                break;
            }  
        }
        if(b)
        {
            number++;
            result = newName + number;
        }
        }
        while(b);
        return result;
    }
    public static void main(String[] args)
    {
        
        String[] existingNames = {"gvI", "umf", "umf40", "vPl", "uQF", "umf29", "Ubo", "Leu", "umf46", "zKB", "umf9", "umf19", "XTS", "umf18", "eRC", "tXu", "umf", "NYm", "umf57", "fUz", "fgO", "umf17", "umf62", "umf33", "KTj", "umf63", "kSW", "Jed", "umf59", "umf39", "SvE", "umf54", "umf41", "ysr", "umf6", "umf52", "Wvo", "Xck", "PmI", "umf23", "wtn", "umf24", "UfC", "umf32", "umf21", "umf14", "umf61", "umf38", "etz", "mQL"};
        String newName = "umf";
        String duck = newMember(existingNames, newName);
        System.out.println(duck);
}
}