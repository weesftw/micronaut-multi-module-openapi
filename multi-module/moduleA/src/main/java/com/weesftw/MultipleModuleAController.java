package com.weesftw;

import io.micronaut.http.annotation.*;

@Controller("/multipleModuleA")
public class MultipleModuleAController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}