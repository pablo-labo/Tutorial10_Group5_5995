package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class crh implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ prh c;

    public crh(prh prhVar) {
        this.c = prhVar;
        this.b = prhVar.c();
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
            return Byte.valueOf(this.c.b(i));
        }
        k20.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
