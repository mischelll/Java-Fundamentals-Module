package MidExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeizeTheFire {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine().replaceAll("#"," = ");
        String[] cells = line.split(" = ");
        int water = Integer.parseInt(in.nextLine());

        List<Integer> addedCells = new ArrayList<>();

        double effort = 0;
        int totalFire = 0;

        for (int i = 0; i< cells.length;i += 2){
            String type = cells[i];
            int range = Integer.valueOf(cells[i + 1]);

            if (type.equals("Low")){
                if ((range >= 1 && range <= 50) && water >= range){
                    water -= range;
                    effort += range * 0.25;
                    totalFire += range;
                    addedCells.add(range);
                }
            }else if (type.equals("Medium")){
                if ((range >= 51 && range <= 80) && water >= range){
                    water -= range;
                    effort += range * 0.25;
                    totalFire += range;
                    addedCells.add(range);
                }
            }else if (type.equals("High")){
                if ((range >= 81 && range <= 125) && water >= range){
                    water -= range;
                    effort += range * 0.25;
                    totalFire += range;
                    addedCells.add(range);
                }
            }
        }
        System.out.println("Cells:");
        for (int addedCell : addedCells) {
            System.out.printf("- %d\n",addedCell);
        }
        System.out.printf("Effort: %.2f\nTotal Fire: %d",effort,totalFire);


    }
}
