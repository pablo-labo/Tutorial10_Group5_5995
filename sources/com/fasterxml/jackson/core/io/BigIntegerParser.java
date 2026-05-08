package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.JavaBigIntegerParser;
import defpackage.akb;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class BigIntegerParser {
    public static BigInteger parseWithFastParser(String str) {
        try {
            return JavaBigIntegerParser.parseBigInteger(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000).concat(" [truncated]");
            }
            StringBuilder sbM = akb.m("Value \"", str, "\" can not be represented as `java.math.BigInteger`, reason: ");
            sbM.append(e.getMessage());
            throw new NumberFormatException(sbM.toString());
        }
    }
}
