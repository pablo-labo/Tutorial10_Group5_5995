package defpackage;

import defpackage.lf0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nf0 implements lf0 {
    public final List<af0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public nf0(List<? extends af0> list) {
        this.a = list;
    }

    @Override // defpackage.lf0
    public final boolean P0(mq5 mq5Var) {
        return lf0.b.b(this, mq5Var);
    }

    @Override // defpackage.lf0
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<af0> iterator() {
        return this.a.iterator();
    }

    @Override // defpackage.lf0
    public final af0 p(mq5 mq5Var) {
        return lf0.b.a(this, mq5Var);
    }

    public final String toString() {
        return this.a.toString();
    }
}
