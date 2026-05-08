package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.JavaBigDecimalParser;
import defpackage.l5;
import defpackage.t40;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class BigDecimalParser {
    private static String _getValueDesc(String str) {
        int length = str.length();
        return length <= 1000 ? l5.m("\"", str, "\"") : String.format("\"%s\" (truncated to %d chars (from %d))", str.substring(0, 1000), 1000, Integer.valueOf(length));
    }

    private static NumberFormatException _parseFailure(Exception exc, String str) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException(t40.l("Value ", _getValueDesc(str), " can not be deserialized as `java.math.BigDecimal`, reason: ", message));
    }

    public static BigDecimal parse(char[] cArr, int i, int i2) {
        try {
            return i2 < 500 ? new BigDecimal(cArr, i, i2) : JavaBigDecimalParser.parseBigDecimal(cArr, i, i2);
        } catch (ArithmeticException e) {
            e = e;
            throw _parseFailure(e, new String(cArr, i, i2));
        } catch (NumberFormatException e2) {
            e = e2;
            throw _parseFailure(e, new String(cArr, i, i2));
        }
    }

    public static BigDecimal parseWithFastParser(String str) {
        try {
            return JavaBigDecimalParser.parseBigDecimal(str);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, str);
        }
    }

    public static BigDecimal parse(String str) {
        return parse(str.toCharArray());
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }
}
