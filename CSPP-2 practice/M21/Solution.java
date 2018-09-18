/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
class Solution {
    Solution(){
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        FitByte fb = new FitByte();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Food":
                    String[] c1 = tokens[1].split(",");
                    fb.addLog(new FoodLog(c1[0], Integer.parseInt(c1[1]),c1[2], c1[3]));
                break;

                case "Water":
                    String[] c2 = tokens[1].split(",");
                    fb.addLog(new WaterLog(Integer.parseInt(c2[0]),c2[1], c2[2]));
                break;

                case "PhyActivity":
                    String[] c3 = tokens[1].split(",");
                    fb.addLog(new PhysicalActivityLog(c3[0], c3[1], c3[2], c3[3], c3[4]));
                break;

                case "Weight":
                    String[] c4 = tokens[1].split(",");
                    fb.addLog(new Weight(c4[0], c4[1], c4[2], c4[3]));
                break;

                case "Sleep":
                    String[] c5 = tokens[1].split(",");
                    fb.addLog(new Sleep(c5[0], c5[1], c5[2]));
                break;

                case"Foodlog":
                    fb.printFoodLog();
                    System.out.println();
                    break;
                case"Waterlog":
                    fb.printWaterLog();
                    System.out.println();
                    break;
                case"Weightlog":
                    fb.printWeightLog();
                    System.out.println();
                    break;
                case"PhysicalActivitylog":
                    fb.printPhysicalActivity();
                    System.out.println();
                    break;
                case"Sleeplog":
                    fb.printSleep();
                    System.out.println();
                    break;
                case"Summary":
                    fb.displaySummary();
                    break;
                default:
                break;
            }
        }
    }
}
