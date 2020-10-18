package com.greatwideweb.helpers;

import org.junit.Assert;
import org.junit.Test;


import static com.greatwideweb.helpers.Base64Util.BASE_64_UTIL;

public class Base64UtilUnitTest {
    private String TEST_STRING ="https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";

    @Test
    public void ensureBase64HelperReturnsExpected() {
        String s = BASE_64_UTIL.encodeBase64(TEST_STRING);
        Assert.assertEquals(BASE_64_UTIL.decodeBase64(s), TEST_STRING);
    }
}
