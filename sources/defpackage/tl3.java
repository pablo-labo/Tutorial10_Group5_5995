package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class tl3 {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final wfb a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new wfb(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, a, -1);
    }
}
