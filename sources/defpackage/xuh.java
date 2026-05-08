package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xuh implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ ivh c;

    public xuh(ivh ivhVar) {
        this.c = ivhVar;
        this.b = ivhVar.c();
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
