package com.facebook.hermes.intl;

import defpackage.wo7;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("BOOLEAN", 0);
            a = aVar;
            a aVar2 = new a("STRING", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static Object a(String str, Object obj, Object obj2, Double d, Object obj3) throws JSRangeErrorException {
        if (obj instanceof wo7.b) {
            return obj3;
        }
        if (!(obj instanceof Double)) {
            throw new JSRangeErrorException(str.concat(" value is invalid."));
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || dDoubleValue > d.doubleValue() || dDoubleValue < ((Double) obj2).doubleValue()) {
            throw new JSRangeErrorException(str.concat(" value is invalid."));
        }
        return obj;
    }

    public static Object b(Map map, String str, a aVar, Object obj, Object obj2) throws JSRangeErrorException {
        Object objA = wo7.a(map, str);
        if (objA instanceof wo7.b) {
            return obj2;
        }
        if (objA instanceof wo7.a) {
            objA = "";
        }
        if (aVar == a.a && !(objA instanceof Boolean)) {
            throw new JSRangeErrorException("Boolean option expected but not found");
        }
        if (aVar == a.b && !(objA instanceof String)) {
            throw new JSRangeErrorException("String option expected but not found");
        }
        if ((obj instanceof wo7.b) || Arrays.asList((Object[]) obj).contains(objA)) {
            return objA;
        }
        throw new JSRangeErrorException("String option expected but not found");
    }

    public static <T extends Enum<T>> T c(Class<T> cls, Object obj) {
        if (obj instanceof wo7.b) {
            return (T) Enum.valueOf(cls, "UNDEFINED");
        }
        if (obj instanceof wo7.a) {
            return null;
        }
        String str = (String) obj;
        if (str.equals("2-digit")) {
            return (T) Enum.valueOf(cls, "DIGIT2");
        }
        for (T t : cls.getEnumConstants()) {
            if (t.name().compareToIgnoreCase(str) == 0) {
                return t;
            }
        }
        return null;
    }
}
