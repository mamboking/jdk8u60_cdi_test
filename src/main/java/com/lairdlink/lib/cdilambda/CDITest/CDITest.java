package com.lairdlink.lib.cdilambda.CDITest;

import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;

@RequestScoped
public class CDITest {

    public void foo(@Observes String someString) {
        List<String> strList = Arrays.asList("s1", "s2", "s3");
        final int a = 0;
        final int b = 1;

        strList.forEach((s) -> { System.out.printf("%s - %d - %d - %s\n", someString, a, b, s); });
    }
}

