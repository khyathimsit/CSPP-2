/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
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
        ShoppingCart sc = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Item":
                String[] c1 = tokens[1].split(",");
                sc.addToCatalog(new Item(c1[0],
                    Integer.parseInt(c1[1]), Float.parseFloat(c1[2])));
                //sc.addToCatalog(it);
                break;

                case "catalog":
                    sc.showCatalog();
                break;

                case "add":
                    String[] c2 = tokens[1].split(",");
                    sc.addToCart(new Item(c2[0],
                        Integer.parseInt(c2[1]), 0.0f));
                    //sc.addToCart(it);
                break;

                case "remove":
                    String[] c3 = tokens[1].split(",");
                    sc.removeFromCart(new Item(c3[0],
                        Integer.parseInt(c3[1]), 0.0f));
                    //sc.remove(it);
                break;
                case "show":
                    sc.showCart();
                break;
                case "totalAmount":
                    System.out.println("totalAmount: " + sc.getTotalAmount());
                break;
                case "payableAmount":
                    System.out.println("Payable amount: " + sc.
                        getPayableAmount());
                break;
                case "print":
                    sc.printInvoice();
                break;
                case "coupon":
                    sc.applyCoupon(tokens[1]);
                break;
                default:
                break;
            }

        }
    }
}
