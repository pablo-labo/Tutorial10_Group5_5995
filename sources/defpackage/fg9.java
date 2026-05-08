package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class fg9 {
    public static final int a(float f, m6h m6hVar) {
        int iOrdinal = m6hVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
    }
}
