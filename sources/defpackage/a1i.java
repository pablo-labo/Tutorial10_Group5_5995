package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a1i implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ h0i c;

    public a1i(h0i h0iVar) {
        this.c = h0iVar;
        this.b = h0iVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.g(i));
        }
        k20.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
