📘 Unique Students per Course (Set Exercise)
📌 Problem Description

In this exercise, we are given data from three different courses (A, B and C).
Each course has a list of student codes, and the same student may be enrolled in more than one course.

The goal is to count how many unique students are enrolled across all courses, without counting duplicates.

💡 Solution

The solution uses the Java Set interface because it does not allow duplicate elements.

Each course is represented by a HashSet<Integer>, and the final result is obtained by creating a new set that represents the union of all courses using addAll().

Set<Integer> totalStudents = new HashSet<>(courseA);
totalStudents.addAll(courseB);
totalStudents.addAll(courseC);


The total number of unique students is given by totalStudents.size().

✅ Why HashSet?

Order is not required

Fast performance

Automatically enforces uniqueness