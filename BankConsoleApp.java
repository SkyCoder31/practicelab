import java.util.HashMap;
import java.util.Scanner;
 
public class BankConsoleApp {
    public static HashMap<String, Double> accountDetails = new HashMap<>();
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
 
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
 
            switch (choice) {
                // complete the implementation here and call below given function repectively
                case 1:
                    System.out.print("Enter the account number to check balance : ");
                    String accNo = scanner.nextLine();
                    System.out.println("Balance : " + getAccountBalance(accNo));
                    break;
                case 2:
                    System.out.print("Enter the source account number: ");
                    String src = scanner.nextLine();
                    System.out.print("Enter the destination account number : ");
                    String dest = scanner.nextLine();
 
                    System.out.println("Enter the amount to transfer : ");
                    double ammount = scanner.nextDouble();
                    performFundTransfer(src, dest, ammount);
 
                    break;
                case 3:
                    System.out.print("enter the account number : ");
                    String accNo3 = scanner.nextLine();
                    System.out.println(convertToUpperCase(accNo3));
                    break;
                case 4:
                    System.out.print("enter the account number : ");
                    String accNo4 = scanner.nextLine();
                    System.out.println(convertToLowerCase(accNo4));
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
 
            }
 
        } while (choice != 5);
 
        scanner.close();
    }
 
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Account Balance Inquiry");
        System.out.println("2. Fund Transfer");
        System.out.println("3. Convert Account Details to Upper Case");
        System.out.println("4. Convert Account Details to Lower Case");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
 
    public static double getAccountBalance(String accountNumber) {
        // retrun account balance.
        // return 0.0 if account not found
        return accountDetails.getOrDefault(accountNumber, 0.0);
    }
 
    public static boolean performFundTransfer(String sourceAccount, String destinationAccount, double amount) {
        // perform fund transfer
        // if(!accountDetails.keySet().contains(sourceAccount)) return false;
        // if(!accountDetails.keySet().contains(destinationAccount)) return false;
 
        // double srcBalance = getAccountBalance(sourceAccount);
        // double destBalance = getAccountBalance(destinationAccount);
 
        // if(srcBalance < amount) return false;
 
        // srcBalance -= amount;
        // destBalance += amount;
 
        // accountDetails.put(sourceAccount, srcBalance);
        // accountDetails.put(destinationAccount, destBalance);
 
        // return true;
        double srcBalance;
        double destBalance;
        if(accountDetails.keySet().contains(sourceAccount) && accountDetails.keySet().contains(destinationAccount)){
            srcBalance = getAccountBalance(sourceAccount);
            destBalance = getAccountBalance(destinationAccount);
            
        }
        else return false;
        if(srcBalance>amount){
            srcBalance-=amount;
            destBalance+=amount;
            accountDetails.put(sourceAccount, srcBalance);
            accountDetails.put(destinationAccount, destBalance);
            return true;
        }
            else
            return false;

        }

 
    public static String convertToUpperCase(String accountDetailsInput) {
        // convert to upper case
        return accountDetailsInput.toUpperCase();
    }
 
    public static String convertToLowerCase(String accountDetailsInputToLower) {
        // convert to lower case
        return accountDetailsInputToLower.toLowerCase();
    }
}
