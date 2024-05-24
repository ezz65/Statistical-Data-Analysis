
public class Main {
    public static void main(String[] args) {
                
        DataSet DataSet1 = new DataSet ("lab08-covid-deaths.dat");
        DataSet DataSet2 = new DataSet ("lab08-covid-vaccinated.dat");
        System.out.println(DataSet1);
        System.out.println("The average is: "+ DataSet1.average());
        System.out.println(DataSet2);
        System.out.println("The average is: "+ DataSet2.average());
        System.out.println("The Pearson's correlation coefficient is equal to: "+ Statistics.pcc(DataSet1,DataSet2));

    }
}
