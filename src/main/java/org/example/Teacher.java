package org.example;

//import static com.sun.tools.javac.tree.TreeInfo.name;

public class Teacher {
    // You'll need to implement this class:

    // Add private fields for name and className
    private static String name;
    private static String className;

    // Add a constructor that takes a name and className and initializes the corresponding fields
    public Teacher(String name, String className) {
        Teacher.name = name;
        Teacher.className = className;
    }
    // Add getter methods for name and className
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    // Add setter methods for name and className
    public void setName(String name) {
        Teacher.name = name;
    }

    public void setClassName(String className) {
        Teacher.className = className;
    }

    // Add a toString method that returns the teacher's name and className in the following format:
    // name (className)
    public static void teacherCard(String[] args) {
        String totalTeacher = name(className);
    }
}
