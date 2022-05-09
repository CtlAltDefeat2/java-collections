# Gradeable Assignment

# History
In 2006 Amazon released a product called S3.  S3 stands for Simple Storage
Solution and it is a cloud based flat object store, it is NOT hierarchical.  
S3 contains buckets in which users can upload an "unlimited" amount of files to the cloud.  
Users are charged based on the size of the file and how many times they upload or download files 
from their S3 bucket(s).  In 2008 the price to store 1 GB (GibaByte) of data was roughly 
10 cents per GB.  Now it's as low as 1 cent per GB.

# Assignment
You will create an `S3BillingCalculator` that creates invoices for customers that
store their data in S3. 

To make our math easy, the pricing model for this assigment is the following:
- Storage: $0.10 per GB
- GET Requests: $0.50 cents per 1000 requests
- PUT Requests: $0.25 cents per 1000 requests

The constructor for the `S3BillingCalculator` takes three arguements:
- float: price per GB
- float: cost per 1000 put requests
- float: cost per 1000 get requests

The `S3BillingCalculator` implements the following interface:

```java
public interface S3Calculatable {

    void addStorageGB(int userId, int amount);

    void addPutRequests(int userId, int number);

    void addGetRequests(int userId, int number);

    Invoice calculateStorageCost(int userId);
}
```

Usage:
```java
var bc = new S3BillingCalculator(.10F, .25F, .50F);
bc.addStorageGB(1111, 1);
bc.addGetRequests(1111, 1000);
bc.addPutRequests(1111, 1000);

bc.addStorageGB(2222, 2);
bc.addGetRequests(2222, 2000);
bc.addPutRequests(2222, 2000);

var invoice1 = bc.calculateStorageCost(1111);
var invoice2 = bc.calculateStorageCost(2222);

System.out.println(invoice1);
System.out.println(invoice2);
```

Output:
```
UserId: 1111
Storage: $0.10
GET Requests: $0.50
PUT Requests: $0.25
Total Cost: $0.85

UserId: 2222
Storage: $0.20
GET Requests: $1.00
PUT Requests: $0.50
Total Cost: $1.70
```

