package av01;

import util.FileIO;

import java.util.concurrent.atomic.AtomicInteger;

public class Day01 {


    public static Integer getFuelt (Integer mass) {
        int r = mass / 3;
        return r - 2;
    }

    public static void main(String[] args) {

        // first
        int result = FileIO.getFileAsList("src/main/java/av01/input.txt").stream()
                .mapToInt(s -> getFuelt(Integer.valueOf(s)))
                .sum();
        System.out.println("First result() = " + result);

        //Second
        AtomicInteger fuelNeeded = new AtomicInteger();
        FileIO.getFileAsList("src/main/java/av01/input.txt").stream()
                .mapToInt(Integer::valueOf)
                .forEach(value ->  {
                    int fuel = getFuelt(value);
                    int fuel2 = getFuelt(fuel);
                    while (fuel2 > 0) {
                        fuel += fuel2;
                        fuel2 = getFuelt(fuel2);
                    }
                    fuelNeeded.addAndGet(fuel);

                });
        System.out.println("second fuelNeeded() = " + fuelNeeded);
    }
}
