package org.example;
public class App {
        public static void main(String[] args) {
            Tester.printStaticInfo();
            Tester tester = new Tester("kk2s", "lll", 5, "London is a capital of the Great britan", 5000.0);
            tester.printInfo(true);
        }
    }
