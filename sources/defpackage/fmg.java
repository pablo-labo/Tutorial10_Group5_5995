package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fmg extends hmg implements Iterable<hmg>, ze8 {
    public final float V;
    public final float W;
    public final List<i6b> X;
    public final List<hmg> Y;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public static final class a implements Iterator<hmg>, ze8 {
        public final Iterator<hmg> a;

        public a(fmg fmgVar) {
            this.a = fmgVar.Y.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final hmg next() {
            return this.a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fmg(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends i6b> list, List<? extends hmg> list2) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.V = f6;
        this.W = f7;
        this.X = list;
        this.Y = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof fmg)) {
            fmg fmgVar = (fmg) obj;
            return wl7.b(this.a, fmgVar.a) && this.b == fmgVar.b && this.c == fmgVar.c && this.d == fmgVar.d && this.e == fmgVar.e && this.f == fmgVar.f && this.V == fmgVar.V && this.W == fmgVar.W && wl7.b(this.X, fmgVar.X) && wl7.b(this.Y, fmgVar.Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.Y.hashCode() + ia.g(this.X, k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(k6.c(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.V, 31), this.W, 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<hmg> iterator() {
        return new a(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fmg() {
        int i = gmg.a;
        zr4 zr4Var = zr4.a;
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, zr4Var, zr4Var);
    }
}
