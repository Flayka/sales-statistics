package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSumAllSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMiddleMonthSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.middleMonthSales(sales);
                assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateFindMaxMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.findMaxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateFindMinMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.findMinMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBelowMiddleSale() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.belowMiddleSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveMiddleSale() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.aboveMiddleSale(sales);
        assertEquals(expected, actual);
    }
}