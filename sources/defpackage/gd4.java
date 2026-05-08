package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gd4<T> implements r6e<T>, ld4<T> {
    public final r6e<T> a;
    public final int b;

    public static final class a implements Iterator<T>, ze8 {
        public final Iterator<T> a;
        public int b;

        public a(gd4<T> gd4Var) {
            this.a = gd4Var.a.iterator();
            this.b = gd4Var.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.b;
                it = this.a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.b;
                it = this.a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gd4(r6e<? extends T> r6eVar, int i) {
        r6eVar.getClass();
        this.a = r6eVar;
        this.b = i;
        if (i >= 0) {
            return;
        }
        h5.k(bg.c(JwtParser.SEPARATOR_CHAR, i, "count must be non-negative, but was "));
        throw null;
    }

    @Override // defpackage.ld4
    public final r6e<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new gd4(this, i) : new gd4(this.a, i2);
    }

    @Override // defpackage.r6e
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
