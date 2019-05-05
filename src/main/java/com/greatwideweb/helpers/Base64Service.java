package com.greatwideweb.helpers;


import org.apache.commons.codec.binary.Base64;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.greatwideweb.helpers.Base64Util.BASE_64_UTIL;

@RestController
public class Base64Service {

    @RequestMapping("/encodeBase64")
    public String encodeBase64(@RequestParam(value="in", defaultValue="") String s) {
        return BASE_64_UTIL.encodeBase64(s);
    }

    @RequestMapping("/decodeBase64")
    public String decodeBase64(@RequestParam(value="in", defaultValue="") String s) {
        return BASE_64_UTIL.decodeBase64(s);
    }



}
