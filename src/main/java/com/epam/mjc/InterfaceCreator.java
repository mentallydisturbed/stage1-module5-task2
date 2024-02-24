package com.epam.mjc;


import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> res = new ArrayList<>();
            for (Integer i : list) {
                res.add(i / divider);
            }
            return res;
        };
    }


}
