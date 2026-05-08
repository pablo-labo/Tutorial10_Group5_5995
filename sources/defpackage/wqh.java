package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class wqh {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(wqh.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = tqh.a;
        }
        a = comparator;
    }
}
