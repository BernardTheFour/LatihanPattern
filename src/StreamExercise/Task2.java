package StreamExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public Task2() {
        List<Invoice> invoices = InitData();

        List<Invoice> oracleAndTrainingInvoices;
        List<Integer> ids, firstFiveIds;
        
        // answer
        oracleAndTrainingInvoices = invoices.stream()
                .filter(invoice -> invoice.getCustomer() == Invoice.Customer.ORACLE)
                .filter(invoice -> invoice.getTitle().contains("Training"))
                .sorted(Comparator.comparingDouble(Invoice::getAmount))
                .collect(Collectors.toList());

        // answer
        ids =  oracleAndTrainingInvoices.stream()
                .map(invoice -> invoice.getId())
                .collect(Collectors.toList());

        // answer
        firstFiveIds = ids.stream()
                .limit(5)
                .collect(Collectors.toList());

        // print
        for (Invoice inv : oracleAndTrainingInvoices) {
            System.out.println(inv.toString());
        }
        System.out.println(ids);
        System.out.println(firstFiveIds);
    }

    List<Invoice> InitData() {
        List<Invoice> list = new ArrayList<>();
        Invoice inv;

        // produce dummy data
        for (int i = 0; i < 50; i++) {
            inv = new Invoice(i, Invoice.Customer.ORACLE, "Training", 1 + new Random().nextInt(40));
            list.add(inv);
        }

        return list;
    }
}
