package ee.nagel.coin_api;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CurrencyCheck {
    Currency dollar = new Currency("USD", "€", 94.7398, "United States Dollar", 126.5235);
    Currency pound = new Currency("GBP", "£", 79.2495, "British Pound Sterling", 79.2495);
    Currency euro = new Currency("EUR", "€", 94.7398, "Euro", 94.7398);

    ApiResponse apiResponse;

    public CurrencyCheck(ApiResponse apiResponse) {
        this.apiResponse = apiResponse;
        apiResponse.ad();
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
    }

    private Boolean inputCheck(String input) {
        if (input.equals(dollar.getCode())) {
            System.out.println("This is USD!");
        } else if (input.equals(pound.getCode())) {
            System.out.println("This s GBP!");
        } else if (input.equals(euro.getCode())) {
            System.out.println("This is EUR!");
        } else {
            //System.out.println("Wrong code. Please try again(EUR/ USD/ GBP).");
            return false;
        }
        return true;
    }
}





