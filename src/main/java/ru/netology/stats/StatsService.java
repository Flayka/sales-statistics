package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int middleMonthSales(int[] sales) {
      StatsService service = new StatsService();
        int middlesale = service.sumAllSales(sales) / sales.length;
        return middlesale;
    }

    public int findMaxMonth(int[] sales) {
        int maxSale = sales[0];
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (maxSale <= sale) {
                maxSale = sale;
                monthMaxSale = i+1;
            }
        }
        return monthMaxSale;
    }

    public int findMinMonth(int[] sales) {
        int minSale = sales[0];
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (minSale >= sale) {
                minSale = sale;
                monthMinSale = i+1;
            }
        }
        return monthMinSale;
    }

    public int belowMiddleSale(int[] sales) {
        StatsService service = new StatsService();
        int belowMiddle = 0;
        for (int sale : sales) {
            if (service.middleMonthSales(sales) < sale)
            belowMiddle += 1;
        }
        return belowMiddle;
    }

    public int aboveMiddleSale(int[] sales) {
        StatsService service = new StatsService();
        int aboveMiddle = 0;
        for (int sale : sales) {
            if (service.middleMonthSales(sales) > sale)
                aboveMiddle += 1;
        }
        return aboveMiddle;
    }
}

