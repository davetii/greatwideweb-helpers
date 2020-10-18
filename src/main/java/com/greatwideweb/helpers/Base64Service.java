package com.greatwideweb.helpers;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;

import static com.greatwideweb.helpers.Base64Util.BASE_64_UTIL;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.isEmpty;

@RestController
public class Base64Service {


    @Value( "${app.u}" )
    private String u;

    @RequestMapping("/base64encode")
    public String encodeBase64(HttpServletRequest request, @RequestParam(value="v", defaultValue="") String v) {
        if (isEmpty(v)) { return EMPTY; }
        System.out.println(request.getRemoteAddr());
        return BASE_64_UTIL.encodeBase64(v);
    }

    @RequestMapping("/base64decode")
    public String decodeBase64(HttpServletRequest request, @RequestParam(value="v", defaultValue="") String v) {
        if (isEmpty(v)) { return EMPTY; }
        System.out.println(request.getRemoteAddr());
        return BASE_64_UTIL.decodeBase64(v);
    }

    @RequestMapping("/ping")
    public String ping() {
        //return DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT).format(new Date());
        return u;
    }



}
