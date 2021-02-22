package com.greatwideweb.helpers;



import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger log = LoggerFactory.getLogger(Base64Service.class);

    @RequestMapping("/base64encode")
    public String encodeBase64(HttpServletRequest request, @RequestParam(value="v", defaultValue="") String v) {
        if (isEmpty(v)) { return EMPTY; }
        log.info("request address: " + request.getRemoteAddr());
        return BASE_64_UTIL.encodeBase64(v);
    }

    @RequestMapping("/base64decode")
    public String decodeBase64(HttpServletRequest request, @RequestParam(value="v", defaultValue="") String v) {
        if (isEmpty(v)) { return EMPTY; }
        log.info("request address: " + request.getRemoteAddr());
        return BASE_64_UTIL.decodeBase64(v);
    }

    @RequestMapping("/ping")
    public String ping(HttpServletRequest request) {
        log.info("request address: " + request.getRemoteAddr());
        return DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT).format(new Date());
    }



}
