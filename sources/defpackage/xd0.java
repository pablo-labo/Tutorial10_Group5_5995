package defpackage;

import androidx.compose.runtime.r;
import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class xd0<T, V extends ge0> {
    public final lvf<T, V> a;
    public final T b;
    public final long c;
    public final gu5<j6g> d;
    public final g4a e;
    public V f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final g4a i = r.f(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public xd0(Object obj, lvf lvfVar, ge0 ge0Var, long j, Object obj2, long j2, gu5 gu5Var) {
        this.a = lvfVar;
        this.b = obj2;
        this.c = j2;
        this.d = gu5Var;
        this.e = r.f(obj);
        this.f = (V) ewa.o(ge0Var);
        this.g = j;
    }

    public final void a() {
        ((gme) this.i).setValue(Boolean.FALSE);
        this.d.invoke();
    }
}
