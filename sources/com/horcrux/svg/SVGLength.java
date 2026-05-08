package com.horcrux.svg;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class SVGLength {
    public final double a;
    public final UnitType b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i = length - 1;
        if (length == 0 || strTrim.equals(Fonts.Font.STYLE_NORMAL)) {
            this.b = UnitType.UNKNOWN;
            this.a = 0.0d;
            return;
        }
        if (strTrim.codePointAt(i) == 37) {
            this.b = UnitType.PERCENTAGE;
            this.a = Double.valueOf(strTrim.substring(0, i)).doubleValue();
            return;
        }
        int i2 = length - 2;
        if (i2 <= 0) {
            this.b = UnitType.NUMBER;
            this.a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        switch (strTrim.substring(i2)) {
            case "cm":
                this.b = UnitType.CM;
                length = i2;
                break;
            case "em":
                this.b = UnitType.EMS;
                length = i2;
                break;
            case "ex":
                this.b = UnitType.EXS;
                length = i2;
                break;
            case "in":
                this.b = UnitType.IN;
                length = i2;
                break;
            case "mm":
                this.b = UnitType.MM;
                length = i2;
                break;
            case "pc":
                this.b = UnitType.PC;
                length = i2;
                break;
            case "pt":
                this.b = UnitType.PT;
                length = i2;
                break;
            case "px":
                this.b = UnitType.NUMBER;
                length = i2;
                break;
            default:
                this.b = UnitType.NUMBER;
                break;
        }
        this.a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
    }

    public static ArrayList<SVGLength> a(Dynamic dynamic) {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i2 = 0;
        if (i == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(strArrSplit.length);
            int length = strArrSplit.length;
            while (i2 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i2]));
                i2++;
            }
            return arrayList2;
        }
        if (i != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
        while (i2 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i2)));
            i2++;
        }
        return arrayList3;
    }

    public static SVGLength b(Dynamic dynamic) {
        int i = a.a[dynamic.getType().ordinal()];
        return i != 1 ? i != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    public static String c(Dynamic dynamic) {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i != 2) {
            return null;
        }
        return dynamic.asString();
    }

    public SVGLength(double d) {
        this.a = d;
        this.b = UnitType.NUMBER;
    }

    public SVGLength() {
        this.a = 0.0d;
        this.b = UnitType.UNKNOWN;
    }
}
