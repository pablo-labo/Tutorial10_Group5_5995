package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fh7 implements Iterator<Integer>, ze8 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
