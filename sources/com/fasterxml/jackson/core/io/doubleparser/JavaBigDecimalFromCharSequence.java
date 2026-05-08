package com.fasterxml.jackson.core.io.doubleparser;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes2.dex */
final class JavaBigDecimalFromCharSequence extends AbstractBigDecimalParser {
    public BigDecimal parseBigDecimalString(CharSequence charSequence, int i, int i2) {
        boolean z;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        long j2;
        int iTryToParseFourDigits;
        int i7 = i;
        try {
            int iCheckBounds = AbstractNumberParser.checkBounds(charSequence.length(), i7, i2);
            if (AbstractBigDecimalParser.hasManyDigits(i2)) {
                return parseBigDecimalStringWithManyDigits(charSequence, i, i2);
            }
            char cCharAt = AbstractNumberParser.charAt(charSequence, i7, iCheckBounds);
            boolean z3 = cCharAt == '-';
            if (z3 || cCharAt == '+') {
                i7++;
                cCharAt = AbstractNumberParser.charAt(charSequence, i7, iCheckBounds);
                if (cCharAt == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
            }
            char c = cCharAt;
            int i8 = i7;
            char cCharAt2 = c;
            int i9 = -1;
            int i10 = i8;
            long j3 = 0;
            boolean z4 = false;
            while (i10 < iCheckBounds) {
                cCharAt2 = charSequence.charAt(i10);
                if (!FastDoubleSwar.isDigit(cCharAt2)) {
                    if (cCharAt2 != '.') {
                        break;
                    }
                    z4 |= i9 >= 0;
                    int i11 = i10;
                    while (i11 < iCheckBounds - 4 && (iTryToParseFourDigits = FastDoubleSwar.tryToParseFourDigits(charSequence, i11 + 1)) >= 0) {
                        j3 = (j3 * 10000) + ((long) iTryToParseFourDigits);
                        i11 += 4;
                    }
                    int i12 = i10;
                    i10 = i11;
                    i9 = i12;
                } else {
                    j3 = ((j3 * 10) + ((long) cCharAt2)) - 48;
                }
                i10++;
            }
            if (i9 < 0) {
                i4 = i10 - i8;
                z = true;
                i3 = i10;
                j = 0;
            } else {
                z = true;
                j = (i9 - i10) + 1;
                i3 = i9;
                i4 = (i10 - i8) - 1;
            }
            if ((cCharAt2 | ' ') == 101) {
                int i13 = i10 + 1;
                char cCharAt3 = AbstractNumberParser.charAt(charSequence, i13, iCheckBounds);
                boolean z5 = cCharAt3 == '-' ? z : false;
                if (z5 || cCharAt3 == '+') {
                    i13 = i10 + 2;
                    cCharAt3 = AbstractNumberParser.charAt(charSequence, i13, iCheckBounds);
                }
                z4 |= !FastDoubleSwar.isDigit(cCharAt3);
                long j4 = 0;
                while (true) {
                    if (j4 < 2147483647L) {
                        i5 = i8;
                        z2 = z5;
                        j4 = ((j4 * 10) + ((long) cCharAt3)) - 48;
                    } else {
                        i5 = i8;
                        z2 = z5;
                    }
                    j2 = j4;
                    i13++;
                    cCharAt3 = AbstractNumberParser.charAt(charSequence, i13, iCheckBounds);
                    if (!FastDoubleSwar.isDigit(cCharAt3)) {
                        break;
                    }
                    j4 = j2;
                    i8 = i5;
                    z5 = z2;
                }
                if (z2) {
                    j2 = -j2;
                }
                j += j2;
                i6 = i13;
            } else {
                i5 = i8;
                i6 = i10;
                i10 = iCheckBounds;
            }
            if (i4 != 0) {
                z = false;
            }
            long j5 = j;
            int i14 = i4;
            AbstractBigDecimalParser.checkParsedBigDecimalBounds(z4 | z, i6, iCheckBounds, i14, j5);
            if (i14 >= 19) {
                return valueOfBigDecimalString(charSequence, i5, i3, i3 + 1, i10, z3, (int) j5);
            }
            if (z3) {
                j3 = -j3;
            }
            return new BigDecimal(j3).scaleByPowerOfTen((int) j5);
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException("value exceeds limits");
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public BigDecimal parseBigDecimalStringWithManyDigits(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        long j;
        boolean z2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        long j2;
        int i10 = i;
        int i11 = i10 + i2;
        char cCharAt = AbstractNumberParser.charAt(charSequence, i10, i11);
        boolean z4 = cCharAt == '-';
        if ((z4 || cCharAt == '+') && (cCharAt = AbstractNumberParser.charAt(charSequence, (i10 = i10 + 1), i11)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int i12 = i10;
        while (true) {
            i3 = i11 - 8;
            if (i12 >= i3 || !FastDoubleSwar.isEightZeroes(charSequence, i12)) {
                break;
            }
            i12 += 8;
        }
        while (i12 < i11 && charSequence.charAt(i12) == '0') {
            i12++;
        }
        int i13 = i12;
        while (i13 < i3 && FastDoubleSwar.isEightDigits(charSequence, i13)) {
            i13 += 8;
        }
        while (i13 < i11) {
            cCharAt = charSequence.charAt(i13);
            if (!FastDoubleSwar.isDigit(cCharAt)) {
                break;
            }
            i13++;
        }
        if (cCharAt == '.') {
            int i14 = i13 + 1;
            while (i14 < i3 && FastDoubleSwar.isEightZeroes(charSequence, i14)) {
                i14 += 8;
            }
            while (i14 < i11 && charSequence.charAt(i14) == '0') {
                i14++;
            }
            int i15 = i14;
            while (i15 < i3 && FastDoubleSwar.isEightDigits(charSequence, i15)) {
                i15 += 8;
            }
            while (i15 < i11) {
                cCharAt = charSequence.charAt(i15);
                if (!FastDoubleSwar.isDigit(cCharAt)) {
                    break;
                }
                i15++;
            }
            i5 = i14;
            i4 = i13;
            i13 = i15;
        } else {
            i4 = -1;
            i5 = -1;
        }
        if (i4 < 0) {
            z = true;
            z2 = false;
            i6 = i13 - i12;
            i5 = i13;
            i4 = i5;
            j = 0;
        } else {
            z = true;
            j = (i4 - i13) + 1;
            z2 = false;
            i6 = i12 == i4 ? i13 - i5 : (i13 - i12) - 1;
        }
        if ((cCharAt | ' ') == 101) {
            int i16 = i13 + 1;
            char cCharAt2 = AbstractNumberParser.charAt(charSequence, i16, i11);
            boolean z5 = cCharAt2 == '-' ? z : z2;
            if (z5 || cCharAt2 == '+') {
                i16 = i13 + 2;
                cCharAt2 = AbstractNumberParser.charAt(charSequence, i16, i11);
            }
            z3 = !FastDoubleSwar.isDigit(cCharAt2);
            long j3 = 0;
            while (true) {
                if (j3 < 2147483647L) {
                    i9 = i11;
                    j3 = ((j3 * 10) + ((long) cCharAt2)) - 48;
                } else {
                    i9 = i11;
                }
                j2 = j3;
                i16++;
                i7 = i9;
                char cCharAt3 = AbstractNumberParser.charAt(charSequence, i16, i7);
                if (!FastDoubleSwar.isDigit(cCharAt3)) {
                    break;
                }
                i11 = i7;
                cCharAt2 = cCharAt3;
                j3 = j2;
            }
            if (z5) {
                j2 = -j2;
            }
            j += j2;
            i8 = i16;
        } else {
            i7 = i11;
            i8 = i13;
            z3 = false;
            i13 = i7;
        }
        long j4 = j;
        AbstractBigDecimalParser.checkParsedBigDecimalBounds(z3 | ((i10 == i4 && i4 == i13) ? z : false), i8, i7, i6, j4);
        return valueOfBigDecimalString(charSequence, i12, i4, i5, i13, z4, (int) j4);
    }

    public BigDecimal valueOfBigDecimalString(CharSequence charSequence, int i, int i2, int i3, int i4, boolean z, int i5) {
        BigInteger bigIntegerNegate;
        BigInteger digitsIterative;
        int i6 = (i4 - i2) - 1;
        int i7 = i4 - i3;
        int i8 = i2 - i;
        NavigableMap<Integer, BigInteger> navigableMapCreatePowersOfTenFloor16Map = null;
        if (i8 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i8 > 400) {
            navigableMapCreatePowersOfTenFloor16Map = FastIntegerMath.createPowersOfTenFloor16Map();
            FastIntegerMath.fillPowersOfNFloor16Recursive(navigableMapCreatePowersOfTenFloor16Map, i, i2);
            bigIntegerNegate = ParseDigitsTaskCharSequence.parseDigitsRecursive(charSequence, i, i2, navigableMapCreatePowersOfTenFloor16Map, DataOkHttpUploader.HTTP_BAD_REQUEST);
        } else {
            bigIntegerNegate = ParseDigitsTaskCharSequence.parseDigitsIterative(charSequence, i, i2);
        }
        if (i6 > 0) {
            if (i7 > 400) {
                if (navigableMapCreatePowersOfTenFloor16Map == null) {
                    navigableMapCreatePowersOfTenFloor16Map = FastIntegerMath.createPowersOfTenFloor16Map();
                }
                FastIntegerMath.fillPowersOfNFloor16Recursive(navigableMapCreatePowersOfTenFloor16Map, i3, i4);
                digitsIterative = ParseDigitsTaskCharSequence.parseDigitsRecursive(charSequence, i3, i4, navigableMapCreatePowersOfTenFloor16Map, DataOkHttpUploader.HTTP_BAD_REQUEST);
            } else {
                digitsIterative = ParseDigitsTaskCharSequence.parseDigitsIterative(charSequence, i3, i4);
            }
            bigIntegerNegate = bigIntegerNegate.signum() == 0 ? digitsIterative : FftMultiplier.multiply(bigIntegerNegate, FastIntegerMath.computePowerOfTen(navigableMapCreatePowersOfTenFloor16Map, i6)).add(digitsIterative);
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i5);
    }
}
