package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void shouldCalculateSquare() {
        SQRService service = new SQRService();

        //входные данные
        int underLimit = 200;
        int overLimit = 300;
        int expected = 3;

        // метод
        int actual = service.calculateSquare(underLimit,overLimit);

        assertEquals( expected, actual);
    }

    @Test
    void shouldCalculateSquareUnderLimit() {
        SQRService service = new SQRService();

        //входные данные
        int underLimit = 10;
        int overLimit = 99;
        int expected = 0;

        // метод
        int actual = service.calculateSquare(underLimit,overLimit);

        assertEquals( expected, actual);
    }

    @Test
    void shouldCalculateSquareOverLimit() {
        SQRService service = new SQRService();

        //входные данные
        int underLimit = 100;
        int overLimit = 1000;
        int expected = 22;

        // метод
        int actual = service.calculateSquare(underLimit,overLimit);

        assertEquals( expected, actual);
    }
}