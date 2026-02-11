public class Chickens02 {
    public static void main(String[] args) {
    
        int numEggs;
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit;

        // Monday, Tuesday, Wednesday
        numEggs = 100;
        numEggs += 121;
        numEggs += 117;

        // single egg profit = $0.18
        dailyAverage = numEggs / 3.0;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18;

        

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
