package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class arh implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Iterable d;

    public arh(uqh uqhVar) {
        this.a = 0;
        this.d = uqhVar;
        this.b = Array.getLength(uqhVar.a);
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c < this.b) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterable iterable = this.d;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    k20.p();
                } else {
                    Object obj = ((uqh) iterable).a;
                    int i2 = this.c;
                    this.c = i2 + 1;
                }
                break;
            default:
                int i3 = this.b;
                if (i3 >= this.c) {
                    k20.p();
                } else {
                    this.b = i3 + 1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public arh(fvh fvhVar) {
        this.a = 1;
        this.d = fvhVar;
        this.b = 0;
        this.c = fvhVar.b();
    }
}
