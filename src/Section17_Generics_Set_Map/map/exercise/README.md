📘 Vote Counting System (Map Exercise)

📌 Problem Description

In this exercise, we are given an input file containing election vote data.
Each line represents a candidate and the number of votes received in that entry.

The same candidate may appear multiple times in the file.

The goal is to compute the **total number of votes per candidate**, accumulating votes instead of overwriting them.

---

💡 Solution

The solution uses the Java `Map` interface, where:

* The **key** represents the candidate name
* The **value** represents the total number of votes accumulated

For each line read from the file:

* If the candidate already exists in the map, the new votes are added to the current total
* If the candidate does not exist, it is added to the map with the initial vote count

```java
if (votes.containsKey(name)) {
    votes.put(name, votes.get(name) + count);
} else {
    votes.put(name, count);
}
```

---

✅ Why HashMap?

* Order is not required
* Faster average performance (`O(1)`)
* Ideal for aggregation and counting problems

`LinkedHashMap` is not necessary here since we do not need to preserve insertion order.
