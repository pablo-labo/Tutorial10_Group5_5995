package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class na7<T> implements Iterable<ma7<? extends T>>, ze8 {
    public final gu5<Iterator<T>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public na7(gu5<? extends Iterator<? extends T>> gu5Var) {
        this.a = gu5Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<ma7<T>> iterator() {
        return new oa7(this.a.invoke());
    }
}
