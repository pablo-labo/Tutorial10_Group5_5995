package com.fasterxml.jackson.core.io.doubleparser;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes2.dex */
final class JavaBigDecimalFromCharArray extends AbstractBigDecimalParser {
    public BigDecimal parseBigDecimalString(char[] cArr, int i, int i2) {
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
            int iCheckBounds = AbstractNumberParser.checkBounds(cArr.length, i7, i2);
            if (AbstractBigDecimalParser.hasManyDigits(i2)) {
                return parseBigDecimalStringWithManyDigits(cArr, i, i2);
            }
            char cCharAt = AbstractNumberParser.charAt(cArr, i7, iCheckBounds);
            boolean z3 = cCharAt == '-';
            if (z3 || cCharAt == '+') {
                i7++;
                cCharAt = AbstractNumberParser.charAt(cArr, i7, iCheckBounds);
                if (cCharAt == 0) {
                    throw new NumberFormatException("illegal syntax");
                }
            }
            char c = cCharAt;
            int i8 = i7;
            char c2 = c;
            int i9 = -1;
            int i10 = i8;
            long j3 = 0;
            boolean z4 = false;
            while (i10 < iCheckBounds) {
                c2 = cArr[i10];
                if (!FastDoubleSwar.isDigit(c2)) {
                    if (c2 != '.') {
                        break;
                    }
                    z4 |= i9 >= 0;
                    int i11 = i10;
                    while (i11 < iCheckBounds - 4 && (iTryToParseFourDigits = FastDoubleSwar.tryToParseFourDigits(cArr, i11 + 1)) >= 0) {
                        j3 = (j3 * 10000) + ((long) iTryToParseFourDigits);
                        i11 += 4;
                    }
                    int i12 = i10;
                    i10 = i11;
                    i9 = i12;
                } else {
                    j3 = ((j3 * 10) + ((long) c2)) - 48;
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
            if ((c2 | ' ') == 101) {
                int i13 = i10 + 1;
                char cCharAt2 = AbstractNumberParser.charAt(cArr, i13, iCheckBounds);
                boolean z5 = cCharAt2 == '-' ? z : false;
                if (z5 || cCharAt2 == '+') {
                    i13 = i10 + 2;
                    cCharAt2 = AbstractNumberParser.charAt(cArr, i13, iCheckBounds);
                }
                z4 |= !FastDoubleSwar.isDigit(cCharAt2);
                long j4 = 0;
                while (true) {
                    if (j4 < 2147483647L) {
                        i5 = i8;
                        z2 = z5;
                        j4 = ((j4 * 10) + ((long) cCharAt2)) - 48;
                    } else {
                        i5 = i8;
                        z2 = z5;
                    }
                    j2 = j4;
                    i13++;
                    cCharAt2 = AbstractNumberParser.charAt(cArr, i13, iCheckBounds);
                    if (!FastDoubleSwar.isDigit(cCharAt2)) {
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
                return valueOfBigDecimalString(cArr, i5, i3, i3 + 1, i10, z3, (int) j5);
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

    public BigDecimal parseBigDecimalStringWithManyDigits(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        long j;
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        long j2;
        int i9 = i;
        int i10 = i9 + i2;
        char cCharAt = AbstractNumberParser.charAt(cArr, i9, i10);
        boolean z4 = cCharAt == '-';
        if ((z4 || cCharAt == '+') && (cCharAt = AbstractNumberParser.charAt(cArr, (i9 = i9 + 1), i10)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int iMin = Math.min(i10 - 8, 1073741824);
        int i11 = i9;
        while (i11 < iMin && FastDoubleSwar.isEightZeroes(cArr, i11)) {
            i11 += 8;
        }
        while (i11 < i10 && cArr[i11] == '0') {
            i11++;
        }
        int i12 = i11;
        while (i12 < iMin && FastDoubleSwar.isEightDigits(cArr, i12)) {
            i12 += 8;
        }
        while (i12 < i10) {
            cCharAt = cArr[i12];
            if (!FastDoubleSwar.isDigit(cCharAt)) {
                break;
            }
            i12++;
        }
        if (cCharAt == '.') {
            int i13 = i12 + 1;
            while (i13 < iMin && FastDoubleSwar.isEightZeroes(cArr, i13)) {
                i13 += 8;
            }
            while (i13 < i10 && cArr[i13] == '0') {
                i13++;
            }
            int i14 = i13;
            while (i14 < iMin && FastDoubleSwar.isEightDigits(cArr, i14)) {
                i14 += 8;
            }
            while (i14 < i10) {
                cCharAt = cArr[i14];
                if (!FastDoubleSwar.isDigit(cCharAt)) {
                    break;
                }
                i14++;
            }
            i4 = i13;
            i3 = i12;
            i12 = i14;
        } else {
            i3 = -1;
            i4 = -1;
        }
        if (i3 < 0) {
            z = true;
            z2 = false;
            i5 = i12 - i11;
            i4 = i12;
            i3 = i4;
            j = 0;
        } else {
            z = true;
            j = (i3 - i12) + 1;
            z2 = false;
            i5 = i11 == i3 ? i12 - i4 : (i12 - i11) - 1;
        }
        if ((cCharAt | ' ') == 101) {
            int i15 = i12 + 1;
            char cCharAt2 = AbstractNumberParser.charAt(cArr, i15, i10);
            boolean z5 = cCharAt2 == '-' ? z : z2;
            if (z5 || cCharAt2 == '+') {
                i15 = i12 + 2;
                cCharAt2 = AbstractNumberParser.charAt(cArr, i15, i10);
            }
            z3 = !FastDoubleSwar.isDigit(cCharAt2);
            long j3 = 0;
            while (true) {
                if (j3 < 2147483647L) {
                    i8 = i10;
                    j3 = ((j3 * 10) + ((long) cCharAt2)) - 48;
                } else {
                    i8 = i10;
                }
                j2 = j3;
                i15++;
                i6 = i8;
                char cCharAt3 = AbstractNumberParser.charAt(cArr, i15, i6);
                if (!FastDoubleSwar.isDigit(cCharAt3)) {
                    break;
                }
                i10 = i6;
                cCharAt2 = cCharAt3;
                j3 = j2;
            }
            if (z5) {
                j2 = -j2;
            }
            j += j2;
            i7 = i15;
        } else {
            i6 = i10;
            i7 = i12;
            z3 = false;
            i12 = i6;
        }
        long j4 = j;
        AbstractBigDecimalParser.checkParsedBigDecimalBounds(z3 | ((i9 == i3 && i3 == i12) ? z : false), i7, i6, i5, j4);
        return valueOfBigDecimalString(cArr, i11, i3, i4, i12, z4, (int) j4);
    }

    public BigDecimal valueOfBigDecimalString(char[] cArr, int i, int i2, int i3, int i4, boolean z, int i5) {
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
            bigIntegerNegate = ParseDigitsTaskCharArray.parseDigitsRecursive(cArr, i, i2, navigableMapCreatePowersOfTenFloor16Map, DataOkHttpUploader.HTTP_BAD_REQUEST);
        } else {
            bigIntegerNegate = ParseDigitsTaskCharArray.parseDigitsIterative(cArr, i, i2);
        }
        if (i7 > 0) {
            if (i7 > 400) {
                if (navigableMapCreatePowersOfTenFloor16Map == null) {
                    navigableMapCreatePowersOfTenFloor16Map = FastIntegerMath.createPowersOfTenFloor16Map();
                }
                int i9 = i2 + 1;
                FastIntegerMath.fillPowersOfNFloor16Recursive(navigableMapCreatePowersOfTenFloor16Map, i9, i4);
                digitsIterative = ParseDigitsTaskCharArray.parseDigitsRecursive(cArr, i9, i4, navigableMapCreatePowersOfTenFloor16Map, DataOkHttpUploader.HTTP_BAD_REQUEST);
            } else {
                digitsIterative = ParseDigitsTaskCharArray.parseDigitsIterative(cArr, i2 + 1, i4);
            }
            bigIntegerNegate = bigIntegerNegate.signum() == 0 ? digitsIterative : FftMultiplier.multiply(bigIntegerNegate, FastIntegerMath.computePowerOfTen(navigableMapCreatePowersOfTenFloor16Map, i6)).add(digitsIterative);
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i5);
    }
}
