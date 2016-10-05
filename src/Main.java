import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> newList  = new ArrayList<Integer>();
            ArrayList<Integer> newList1  = new ArrayList<Integer>();
            ArrayList<Integer> newList2  = new ArrayList<Integer>();
            ArrayList<Integer> newList3 = new ArrayList<Integer>();
            for (int i = 0; i < 20; i++)
            {
                newList.add(Integer.parseInt(reader.readLine()));
            }
            for (int a : newList){
                if (a % 3 == 0){
                    newList1.add(a);
                }
                else if (a % 2 == 0){
                    newList2.add(a);
                }
                else {
                    newList3.add(a);
                }
            }

        }

    public static void printList(List<Integer> list) {



    }
    }

