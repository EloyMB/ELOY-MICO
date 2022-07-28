package com.ironhack.main;

import com.ironhack.classes.Account;
import com.ironhack.classes.Country;
import com.ironhack.classes.User;
import com.ironhack.enums.Hold;
import com.ironhack.enums.Status;

import java.math.BigDecimal;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

       // User ivan = new User(0, "Iván");

        // System.out.println(ivan.getStatus());+

        // ivan.setStatus.Status.OFFLINE;
        //System.out.println(ivan.getStatus());

        //Account account1 = new Account("Eloy", "Barcelona", BigDecimal.valueOf(10320.30), "1231231231F");

        // account1.setHold(Hold.LITIGATION_HOLD);
        // System.out.println(account1.getHold());

        // HASHMAP

        HashMap<String, String> countries1 = new HashMap<>();
        countries1.put("spain", "madrid");
        countries1.put("united_kingdom", "london");
        countries1.put("france", "paris");

        System.out.println(countries1.get("france"));

        HashMap<String, Country> countries = new HashMap<>();
        Country spain = new Country("Spain", "Madrid", 47350000);
        countries.put("spain", spain);
        Country uk = new Country("United Kingdom", "London", 67220000);
        countries.put("united_kingdom", uk);
        Country france = new Country("France", "Paris", 67390000);
        countries.put("france", france);

        System.out.println(countries.get("spain"));

        HashMap<String, Account> account = new HashMap<>();

        Account account1 = new Account("Eloy", "Barcelona", new BigDecimal("10320.30"), "1231231231F");

        account.put(account1.getAccountNumber(), account1);

        System.out.println(account.get("1231231231F"));
    }


}
