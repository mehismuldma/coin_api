package ee.nagel.coin_api;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CurrencyCheck {
    String dollar = "USD";
  String pound = "GBP";
  String euro = "EUR";

    ApiResponse apiResponse;

    public CurrencyCheck(ApiResponse apiResponse) {
        this.apiResponse = apiResponse;

    }

    public void request() {
        System.out.println("Enter currency code(EUR/ USD/ GBP):");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        System.out.println(input);

        if (inputCheck(input)) {
            System.out.println("Thank you!");
        } else {
            System.out.println("Wrong code. Please try again(EUR/ USD/ GBP):");
            sc = new Scanner(System.in);
            input = sc.nextLine().toUpperCase();
            System.out.println(input);
        }
        apiResponse.ad(input);
    }

    private Boolean inputCheck(String input) {
        if (input.equals(dollar)) {
            System.out.println("This is USD!");
        } else if (input.equals(pound)) {
            System.out.println("This s GBP!");
        } else if (input.equals(euro)) {
            System.out.println("This is EUR!");
        } else {
            //System.out.println("Wrong code. Please try again(EUR/ USD/ GBP).");
            return false;
        }
        return true;
    }
}





