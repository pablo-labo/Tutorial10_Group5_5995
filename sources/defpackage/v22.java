package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class v22 implements Iterable<Character>, ze8 {
    public final char a;
    public final char b;
    public final int c = 1;

    static {
        new v22((char) 1, (char) 0);
    }

    public v22(char c, char c2) {
        this.a = c;
        this.b = (char) ojh.o(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v22)) {
            return false;
        }
        if (isEmpty() && ((v22) obj).isEmpty()) {
            return true;
        }
        v22 v22Var = (v22) obj;
        return this.a == v22Var.a && this.b == v22Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        return wl7.c(this.a, this.b) > 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new u22(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
