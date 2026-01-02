# Products Average Price — Java Streams Exercise

## 📌 Problem Description
This program reads a list of products from a `.csv` file, where each line contains a product name and its price.  
The goal is to calculate the **average price of all products** and then display the **names of the products whose price is below the average**, sorted in **descending order**.


## 💡 Solution Overview

### 1. File Reading
- The file is read line by line using `BufferedReader`
- Each line is split by comma (`name,price`)
- The data is stored in a `List<Product>`

### 2. Average Price Calculation (Stream Pipeline)
- A stream is created from the product list
- `map` transforms each `Product` into its price
- `reduce` is used to sum all prices
- The sum is divided by the total number of products to obtain the average price

### 3. Filtering and Sorting Product Names
- A new stream is created from the product list
- `filter` selects only products with price below the average
- `map` extracts only the product names
- `sorted` orders the names in descending order using a case-insensitive comparator
- `toList` collects the result into a list

### 4. Output
- The average price is printed to the console
- Each product name below the average is printed on a new line


## 🧠 Concepts Practiced
- File I/O (`BufferedReader`, `FileReader`)
- Java Streams and pipeline processing
- `map`, `filter`, `reduce`, `sorted`
- Lambda expressions and `Comparator`
- Collecting stream results with `toList()`
