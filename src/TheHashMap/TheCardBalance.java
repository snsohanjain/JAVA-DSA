package TheHashMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class TheCardBalance {
    public static void main(String[] args) {
        Map<String,Integer> driver = new HashMap<>();
        driver.put("sohan",100);
        driver.put("jayanth",550);
        driver.put("manoj",1000);

        // driver want to withdraw his money
        // sohan wants 50
        String driverName = "jayanth";
        int withdraw = 100;
        int isDriverAvailableBalance = 0;
        boolean isDriverIsPresent = false;

        try{
            isDriverIsPresent = driver.containsKey(driverName);
        }catch (NullPointerException e){
            System.out.println("Not Found " + e);
        }
        try{
            isDriverAvailableBalance = driver.get(driverName);
        }catch ( NullPointerException e){
            System.out.println("Not found " + e);
        }

        if(isDriverIsPresent && isDriverAvailableBalance >= withdraw){
           driver.put("sohan", isDriverAvailableBalance - withdraw);
            System.out.println("Withdrawn successfully");
        }
        else if(!isDriverIsPresent){
            System.out.println("Driver Name Not Found");
        }
        else {
            System.out.println("Insufficient Balance");
        }
        System.out.println(driver);

    }
    static class Student {
        private String name;
        private Long number;

        public Student(String name, Long number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getNumber() {
            return number;
        }

        public void setNumber(Long number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    '}';
        }
    }

}
