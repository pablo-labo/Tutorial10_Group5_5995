package com.fasterxml.jackson.core.io.doubleparser;

/* JADX INFO: loaded from: classes2.dex */
public class JavaDoubleParser {
    private static final JavaDoubleBitsFromByteArray BYTE_ARRAY_PARSER = new JavaDoubleBitsFromByteArray();
    private static final JavaDoubleBitsFromCharArray CHAR_ARRAY_PARSER = new JavaDoubleBitsFromCharArray();
    private static final JavaDoubleBitsFromCharSequence CHAR_SEQUENCE_PARSER = new JavaDoubleBitsFromCharSequence();

    public static double parseDouble(CharSequence charSequence, int i, int i2) {
        return Double.longBitsToDouble(CHAR_SEQUENCE_PARSER.parseFloatingPointLiteral(charSequence, i, i2));
    }

    public static double parseDouble(CharSequence charSequence) {
        return parseDouble(charSequence, 0, charSequence.length());
    }
}
