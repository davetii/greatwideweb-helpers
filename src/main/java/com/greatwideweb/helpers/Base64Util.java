package com.greatwideweb.helpers;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {

    private Base64Util() { }
    Base64 base64 = new Base64(true);
    public static final Base64Util BASE_64_UTIL = new Base64Util();
    public String encodeBase64(String s) {
        return new String(base64.encode(s.getBytes()));
    }

    public String decodeBase64(String s) {
        return new String(base64.decode(s.getBytes()));
    }
}
