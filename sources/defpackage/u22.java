package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class u22 implements Iterator, ze8 {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public u22(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = false;
        if (i <= 0 ? wl7.c(c, c2) >= 0 : wl7.c(c, c2) <= 0) {
            z = true;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    public final char a() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                k20.p();
                return (char) 0;
            }
            this.c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
