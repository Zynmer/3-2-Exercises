public class Chickens01 {
    public static void main(String[] args) {
        
        int totalEggs;
        int eggsPerChicken;
        int chickenCount;

        eggsPerChicken = 5;
        chickenCount = 3;

        totalEggs = countEggs(eggsPerChicken, chickenCount);
        ++chickenCount;
        totalEggs += countEggs(eggsPerChicken, chickenCount);
        chickenCount /= 2;
        totalEggs += countEggs(eggsPerChicken, chickenCount);

        System.out.printf("First Scenario = %d%n", totalEggs);

        eggsPerChicken = 4; 
        chickenCount = 8;

        totalEggs = countEggs(eggsPerChicken, chickenCount);
        ++chickenCount;
        totalEggs += countEggs(eggsPerChicken, chickenCount);
        chickenCount /= 2;
        totalEggs += countEggs(eggsPerChicken, chickenCount);

        System.out.printf("Second Scenario = %d%n", totalEggs);

    }
    
    public static int countEggs(int eggsPerChicken, int chickenCount) {

        return eggsPerChicken * chickenCount;
        
    }
}
