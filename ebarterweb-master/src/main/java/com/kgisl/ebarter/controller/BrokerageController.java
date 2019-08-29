package com.kgisl.ebarter.controller;

import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Properties;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgisl.ebarter.model.Brokerage;

/**
 * TradeCalc
 */
public class BrokerageController extends HttpServlet {
    private static final String filename = "application.properties";
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Properties prop = new Properties();
        InputStream input = null;
        input = BrokerageController.class.getClassLoader().getResourceAsStream(filename);
        prop.load(input);

        double gst = Double.parseDouble(prop.getProperty("gst"));
        double stt = Double.parseDouble(prop.getProperty("stt"));
        double brkg = Double.parseDouble(prop.getProperty("brokerage"));
        ReadCsv.TradecsvtoBean("D:\\Meena\\java\\eBarter-master\\src\\main\\resources\\Trade.csv");
        List<Brokerage> tradeList = new ArrayList<Brokerage>();

        // tradeList.add(new Brokerage(1, "ucccode1", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(2, "ucccode2", LocalDate.of(2019, 5, 23),
        // "scrip", 'S', 1500L, 250D));
        // tradeList.add(new Brokerage(3, "ucccode1", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(4, "ucccode3", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(5, "ucccode2", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(6, "ucccode1", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(7, "ucccode3", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(8, "ucccode3", LocalDate.of(2019, 5, 23),
        // "scrip", 'S', 1500L, 250D));
        // tradeList.add(new Brokerage(9, "ucccode1", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(10, "ucccode1", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));
        // tradeList.add(new Brokerage(10, "ucccode1", LocalDate.of(2019, 5, 23),
        // "scrip", 'B', 1500L, 250D));

        tradeList.add(new Brokerage(1, "ucccode2", LocalDate.of(2019, 5, 23), "CIPLA", 'S', 1500, 558.9));
        tradeList.add(new Brokerage(2, "ucccode2", LocalDate.of(2019, 5, 23), "HDFC", 'S', 45, 1977.50));
        tradeList.add(new Brokerage(3, "ucccode1", LocalDate.of(2019, 5, 23), "LT", 'B', 2525, 1350.50));
        tradeList.add(new Brokerage(4, "ucccode3", LocalDate.of(2019, 5, 23), "MARUTI", 'B', 150, 6608.15));
        tradeList.add(new Brokerage(5, "ucccode2", LocalDate.of(2019, 5, 23), "ONGC", 'B', 225, 163.65));
        tradeList.add(new Brokerage(6, "ucccode1", LocalDate.of(2019, 5, 23), "GAIL", 'B', 335, 349.4));
        tradeList.add(new Brokerage(7, "ucccode3", LocalDate.of(2019, 5, 23), "CIPLA", 'B', 420, 551.5));
        tradeList.add(new Brokerage(8, "ucccode3", LocalDate.of(2019, 5, 23), "GAIL", 'S', 515, 341.5));
        tradeList.add(new Brokerage(9, "ucccode1", LocalDate.of(2019, 5, 23), "GAIL", 'B', 1005, 343));
        tradeList.add(new Brokerage(10, "ucccode1", LocalDate.of(2019, 5, 23), "HDFC", 'B', 780, 1978.60));

        HashSet<Brokerage> brokerageList = new HashSet<Brokerage>();
        brokerageList.addAll(tradeList);

        tradeList.forEach(System.out::println);

        // brokerageList.forEach(f -> f.setAmount(f.getQuantity() * f.getPrice()));

        // double brkg = 0.0125;
        // double gst = 0.18;
        // double stt = 0.00017;
        brokerageList.forEach(f -> {
            f.setAmount(f.getQuantity() * f.getPrice());
            f.setBrokerage(f.getAmount() * brkg);
            // System.out.println(f.getBrokerage() + "*" + gst + "->" + (f.getBrokerage() *
            // gst));
            f.setGst(f.getBrokerage() * gst);
            f.setSt(f.getAmount() * stt);
            if (f.getTradetype() == 'B') {
                f.setNetamount(f.getBrokerage() + f.getGst() + f.getSt() + f.getAmount());
            } else {
                f.setNetamount(f.getAmount() - (f.getBrokerage() + f.getGst() + f.getSt()));
            }
        });

        brokerageList.forEach(System.out::println);

        // Answers
        System.out.println("\nTop Buy scrip in a month by Netamount");
        Predicate<Brokerage> pre = x -> x.getTradetype() == 'B';
        List<Brokerage> ll = tradeList.stream().filter(pre).collect(Collectors.toList());
        ll.stream().max(Comparator.comparing(y -> y.getNetamount())).ifPresent(p -> System.out.println("" + p));

        System.out.println("\nTop Sell scrip in a month by Netamount");
        Predicate<Brokerage> pre1 = x -> x.getTradetype() == 'S';
        List<Brokerage> l1 = tradeList.stream().filter(pre1).collect(Collectors.toList());
        l1.stream().max(Comparator.comparing(y -> y.getNetamount())).ifPresent(p -> System.out.println("" + p));

        System.out.println("\nTop Turnover scrip ");
        tradeList.stream().max(Comparator.comparing(y -> y.getAmount())).ifPresent(p -> System.out.println("" + p));

        System.out.println("\nLow Turnover scrip ");
        tradeList.stream().min(Comparator.comparing(y -> y.getAmount())).ifPresent(p -> System.out.println("" + p));

        System.out.println("\nNet pay for each person for given date ");

        System.out.println("\nTotal Brokerage for a day ");
        double sum1 = tradeList.stream().mapToDouble(Brokerage::getBrokerage).sum();
        System.out.println(sum1);

        System.out.println("\nHighest Brokerage collection ");
        tradeList.stream().max(Comparator.comparing(y -> y.getBrokerage())).ifPresent(p -> System.out.println("" + p));

        System.out.println("\nAvg Buy price per scrip");
        OptionalDouble sum2 = ll.stream().mapToDouble(Brokerage::getPrice).average();
        System.out.println(sum2);

        // System.out.println(ta);
        System.out.println("\nAvg Sell price per scrip");
        OptionalDouble sum3 = l1.stream().mapToDouble(Brokerage::getPrice).average();
        System.out.println(sum3);

        System.out.println("\nTotal Brokerage for a person");

        System.out.println("\nHighest Brokerage paid on wich date by a person");
        tradeList.stream().max(Comparator.comparing(y -> y.getBrokerage())).map(Brokerage::getTradedate)
                .ifPresent(p -> System.out.println("" + p));

        System.out.println("\nCurrent holding for a person / day");

        System.out.println("\nWho is holding highest share ");
        tradeList.stream().max(Comparator.comparing(y -> y.getQuantity())).ifPresent(p -> System.out.println("" + p));

        System.out.println("\nWho is doing tranaction on every day");
    }

}