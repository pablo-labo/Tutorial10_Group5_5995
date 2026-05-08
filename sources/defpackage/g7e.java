package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g7e implements Iterator, ze8 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final Object c;

    public g7e(uv4 uv4Var) {
        this.c = uv4Var;
        this.b = uv4Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b < ((lz5) this.c).getLength()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                uv4 uv4Var = (uv4) obj;
                int i2 = uv4Var.c;
                int i3 = this.b;
                this.b = i3 - 1;
                return uv4Var.e[i2 - i3];
            default:
                int i4 = this.b;
                this.b = i4 + 1;
                return ((lz5) obj).get(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g7e(lz5 lz5Var) {
        lz5Var.getClass();
        this.c = lz5Var;
    }
}
