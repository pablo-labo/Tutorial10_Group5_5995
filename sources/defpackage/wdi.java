package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wdi implements Iterator<String> {
    public Iterator<String> a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
