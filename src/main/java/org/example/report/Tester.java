package org.example.report;

public class Tester {
    public static void main(String[] args) {
        Report report = new FianceReport();
        report.print();
        Report okreport = new Report() {
            @Override
            public void print() {
                System.out.println("someReport");
            }
        };



    }
}
