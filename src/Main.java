import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException
    {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> newList  = new ArrayList<Integer>();
            ArrayList<Integer> newList1  = new ArrayList<Integer>();
            ArrayList<Integer> newList2  = new ArrayList<Integer>();
            ArrayList<Integer> newList3 = new ArrayList<Integer>();
            for (int i = 1; i < 21; i++)
            {
                newList.add(Integer.parseInt(reader.readLine()));
            }
            for (int b : newList)
            {
                    if (b % 3 == 0 && b % 2 == 0)
                    {
                        newList1.add(b);
                        newList2.add(b);
                    }
                    else if  (b % 3 == 0)
                    {
                        newList1.add(b);
                    }
                    else if (b % 2 == 0)
                    {
                        newList2.add(b);
                    }
                    else
                    {
                        newList3.add(b);
                    }
            }

                printList(newList1);
                printList(newList2);
                printList(newList3);
    }

    public static void printList(List<Integer> list)
    {
        for (int v : list)
        System.out.println(v);
    }
}

