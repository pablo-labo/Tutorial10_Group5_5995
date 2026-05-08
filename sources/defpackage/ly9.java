package defpackage;

import defpackage.ky9;

/* JADX INFO: loaded from: classes.dex */
public final class ly9 {
    public static final ky9 a(v03 v03Var) {
        ky9 ky9Var = (ky9) v03Var.h1(ky9.a.a);
        if (ky9Var != null) {
            return ky9Var;
        }
        r6.g("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }
}
