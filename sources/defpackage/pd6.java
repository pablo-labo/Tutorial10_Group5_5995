package defpackage;

import androidx.compose.runtime.m;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pd6 implements Iterator<Object>, ze8 {
    public final m a;
    public final int b;
    public int c;
    public final int d;

    public pd6(m mVar, int i, int i2) {
        this.a = mVar;
        this.b = i2;
        this.c = i;
        this.d = mVar.W;
        if (mVar.V) {
            gke.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m mVar = this.a;
        int i = mVar.W;
        int i2 = this.d;
        if (i != i2) {
            gke.e();
        }
        int i3 = this.c;
        this.c = mVar.a[(i3 * 5) + 3] + i3;
        return new fke(mVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
