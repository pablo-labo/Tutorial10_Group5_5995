package defpackage;

import androidx.compose.runtime.m;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xne implements fm2, Iterable<Object>, ze8 {
    public final m a;
    public final int b;
    public final qd6 c;
    public final uyc d;

    public xne(m mVar, int i, qd6 qd6Var, uyc uycVar) {
        this.a = mVar;
        this.b = i;
        this.c = qd6Var;
        this.d = uycVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new wne(this.a, this.b, this.c, this.d);
    }
}
