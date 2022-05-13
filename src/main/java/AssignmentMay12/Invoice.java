package AssignmentMay12;

import java.text.NumberFormat;
public class Invoice {
    private final S3BillingCalculatorObject s3BCObject;
    private final int userId;
    private final NumberFormat floatToCurrency = NumberFormat.getCurrencyInstance();
    public Invoice(int userId, S3BillingCalculatorObject s3BCObject) {
        this.userId = userId;
        this.s3BCObject = s3BCObject;
    }

    @Override
    public String toString() {
        String output = "";
        float total;

        output += "UserId: " + userId + "\n";
        output += "Storage: " + floatToCurrency.format(s3BCObject.getStoragePrice()) + "\n";
        output += "GET Requests: " + floatToCurrency.format(s3BCObject.getGetRequestsPrice()) + "\n";
        output += "PUT Requests: " + floatToCurrency.format(s3BCObject.getPutRequestsPrice()) + "\n";
        total = s3BCObject.getStoragePrice() + s3BCObject.getGetRequestsPrice() + s3BCObject.getPutRequestsPrice();
        output += "Total Cost: " + floatToCurrency.format(total) + "\n\n";

        return output;
    }
}
