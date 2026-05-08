package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateSet;

/* JADX INFO: loaded from: classes.dex */
public final class rme {
    public static final Object a = new Object();

    public static final <T> boolean a(tse<T> tseVar, int i, o9b<? extends T> o9bVar) {
        boolean z;
        synchronized (a) {
            int i2 = tseVar.d;
            if (i2 == i) {
                tseVar.c = o9bVar;
                z = true;
                tseVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final <T> tse<T> b(SnapshotStateSet<T> snapshotStateSet) {
        tse tseVar = snapshotStateSet.a;
        tseVar.getClass();
        return (tse) ame.s(tseVar, snapshotStateSet);
    }
}
