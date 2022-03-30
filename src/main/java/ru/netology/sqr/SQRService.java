package ru.netology.sqr;

public class SQRService {
    public int calculateSquare (int underLimit, int overLimit) {
       int counter = 0;
        for ( int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (underLimit <= sqr && sqr <= overLimit) {
                counter++;
            }
        }
        return counter;
    }
}
