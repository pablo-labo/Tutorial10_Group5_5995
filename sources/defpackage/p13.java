package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class p13 {
    public final o13 a;
    public final o13 b;
    public final o13 c;

    public p13(o13 o13Var, o13 o13Var2, o13 o13Var3) {
        this.a = o13Var;
        this.b = o13Var2;
        this.c = o13Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p13)) {
            return false;
        }
        p13 p13Var = (p13) obj;
        return this.a.equals(p13Var.a) && this.b.equals(p13Var.b) && this.c.equals(p13Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.c.a), Long.valueOf(this.b.a), Long.valueOf(this.a.a));
    }
}
