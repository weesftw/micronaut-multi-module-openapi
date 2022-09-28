package com.weesftw;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.tags.Tag;

public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
