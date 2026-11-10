REPORT ABOUT CAMPUS SHOP INVENTORY MANAGEMENT SYSTEM
 Introduction
This Java application helps a campus shop attendant record products, view their details, update prices and stock, and prevent invalid data.
 Classes
Product:
represents one item sold in the shop and has five private attributes: productId, productName, productCategory, unitPrice and quantityInStock.
Main: It creates the objects, displays them, updates them and tests validation in the console.
 Objects
Five Product objects are created in Main: Exercise Book, Pens, Printing Paper, Flash Disk and Scientific Calculator. Each has its own values. Changing one, such as the flash disk price, does not affect the others, which shows that objects keep independent data.
 Encapsulation
All attributes are private. Other classes can only reach them through public getters and setters.
 Getters
Each attribute has a getter, for example getUnitPrice() and getQuantityInStock(). Main uses them to print the inventory table.
 Setters and Validation
Each attribute has a setter. The validation rules are:
Price cannot be negative.
Stock quantity cannot be negative.
ID must be greater than zero.
Name and category cannot be empty.
Invalid values throw an IllegalArgumentException. Main catches it and prints an error message, and the old value stays unchanged.
 Demonstration
 Display all five products.
 Update the flash disk price (35000 → 32000).
 Update the blue pen stock (300 → 250).
 Display the updated table.
 Try a negative price and negative stock to show the error messages.
The program meets the requirements: classes, objects, encapsulation, getters, setters and validation.
