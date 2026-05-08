package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.l6;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int R0();

    public abstract String n1();

    public abstract long s0();

    public final String toString() {
        long jS0 = s0();
        int iR0 = R0();
        String strN1 = n1();
        int length = String.valueOf(jS0).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(iR0).length() + 3 + strN1.length());
        sb.append(jS0);
        sb.append("\t");
        sb.append(iR0);
        return l6.i(sb, "\t-1", strN1);
    }
}
