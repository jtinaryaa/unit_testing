package com.unit.test.demo.spring_boot_unit_test_demo.utility;

import java.util.Objects;

public class DemoUtility {

    public int add(int a, int b) {
        return a + b;
    }

    public Object checkNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        return null;
    }
}
