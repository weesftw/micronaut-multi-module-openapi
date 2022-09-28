package com.weesftw;

import io.micronaut.http.annotation.*;

@Controller("/multipleModuleB")
public class MultipleModuleBController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}