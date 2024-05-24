import java.util.ArrayList;
import java.io.*;


public class DataSet {
    ArrayList<Double> sequence = new ArrayList<>();
    DataSet(String filename) {
        try {
            BufferedReader f = new BufferedReader(new FileReader(filename));
            String s;
            while ((s = f.readLine()) != null){
                String arr[] = s.split(" ");
                if(!s.startsWith("#")){
                    sequence.add(Double.parseDouble(arr[0]));
            }
        }

        } catch (Throwable e) {
            System.out.println("Read error.");
        }
    }
    void add (double x) {
        sequence.add(x);
    }

    int size() {
        return sequence.size();
    }
    double get(int i) {
        return sequence.get(i);
    }
    public String toString() {
        return sequence.toString();
    }
    double average(){
        double total=0;
        int counter=0;
        for (Double double1 : sequence) {
            total +=double1;
            counter++;
        }
        return total/counter;
    }
}