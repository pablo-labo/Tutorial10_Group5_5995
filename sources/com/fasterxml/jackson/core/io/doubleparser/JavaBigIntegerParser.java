package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class JavaBigIntegerParser {
    private static final JavaBigIntegerFromByteArray BYTE_ARRAY_PARSER = new JavaBigIntegerFromByteArray();
    private static final JavaBigIntegerFromCharArray CHAR_ARRAY_PARSER = new JavaBigIntegerFromCharArray();
    private static final JavaBigIntegerFromCharSequence CHAR_SEQUENCE_PARSER = new JavaBigIntegerFromCharSequence();

    public static BigInteger parseBigInteger(CharSequence charSequence) {
        return CHAR_SEQUENCE_PARSER.parseBigIntegerString(charSequence, 0, charSequence.length(), 10);
    }
}
