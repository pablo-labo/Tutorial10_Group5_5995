package com.horcrux.svg;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;
import defpackage.w40;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            a = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double a(SVGLength sVGLength, double d, double d2, double d3) {
        double d4;
        if (sVGLength == null) {
            return 0.0d;
        }
        SVGLength.UnitType unitType = sVGLength.b;
        double d5 = sVGLength.a;
        switch (a.a[unitType.ordinal()]) {
            case 1:
            case 2:
                d3 = 1.0d;
                return w40.b(d5, d3, d2, 0.0d);
            case 3:
                d4 = (d5 / 100.0d) * d;
                return d4 + 0.0d;
            case 4:
                return w40.b(d5, d3, d2, 0.0d);
            case 5:
                d3 /= 2.0d;
                return w40.b(d5, d3, d2, 0.0d);
            case 6:
                d3 = 35.43307d;
                return w40.b(d5, d3, d2, 0.0d);
            case 7:
                d3 = 3.543307d;
                return w40.b(d5, d3, d2, 0.0d);
            case 8:
                d3 = 90.0d;
                return w40.b(d5, d3, d2, 0.0d);
            case DatadogLogGenerator.CRASH /* 9 */:
                d3 = 1.25d;
                return w40.b(d5, d3, d2, 0.0d);
            case 10:
                d3 = 15.0d;
                return w40.b(d5, d3, d2, 0.0d);
            default:
                d4 = d5 * d2;
                return d4 + 0.0d;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double b(String str, double d, double d2, double d3) {
        double dDoubleValue;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i = length - 1;
        if (length == 0 || strTrim.equals(Fonts.Font.STYLE_NORMAL)) {
            return 0.0d;
        }
        if (strTrim.codePointAt(i) == 37) {
            return (Double.valueOf(strTrim.substring(0, i)).doubleValue() / 100.0d) * d;
        }
        int i2 = length - 2;
        if (i2 > 0) {
            switch (strTrim.substring(i2)) {
                case "cm":
                    d3 = 35.43307d;
                    length = i2;
                    break;
                case "em":
                    length = i2;
                    break;
                case "in":
                    d3 = 90.0d;
                    length = i2;
                    break;
                case "mm":
                    d3 = 3.543307d;
                    length = i2;
                    break;
                case "pc":
                    d3 = 15.0d;
                    length = i2;
                    break;
                case "pt":
                    d3 = 1.25d;
                    length = i2;
                    break;
                case "px":
                    length = i2;
                    d3 = 1.0d;
                    break;
                default:
                    d3 = 1.0d;
                    break;
            }
            dDoubleValue = Double.valueOf(strTrim.substring(0, length)).doubleValue() * d3;
        } else {
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        return dDoubleValue * d2;
    }

    public static int c(ReadableArray readableArray, float[] fArr, float f) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f;
        return 6;
    }
}
