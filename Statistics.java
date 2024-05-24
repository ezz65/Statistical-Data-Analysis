public class Statistics {
    static double pcc(DataSet d1, DataSet d2){
        double sx = 0.0;
        double sy = 0.0;
        double sxx = 0.0;
        double syy = 0.0;
        double sxy = 0.0;
        
        int n = d1.size();
        for(int i = 0; i < n; ++i) {
            double x = d1.get(i);
            double y = d2.get(i);
      
            sx += x;
            sy += y;
            sxx += x * x;
            syy += y * y;
            sxy += x * y;
          }

    double cov = sxy / n - sx * sy / n / n;
    double sigmax = Math.sqrt(sxx / n -  sx * sx / n / n);
    double sigmay = Math.sqrt(syy / n -  sy * sy / n / n);

    return cov / sigmax / sigmay; 
    }
}
