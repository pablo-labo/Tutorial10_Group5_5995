package defpackage;

import android.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends LruCache<Integer, ga0> {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Integer num, ga0 ga0Var, ga0 ga0Var2) {
        num.intValue();
        ga0 ga0Var3 = ga0Var;
        ga0Var3.getClass();
        if (z) {
            ga0Var3.close();
        }
    }
}
