package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ede {
    public final p03 a;
    public final p03 b;
    public final p03 c;

    public ede(int i) {
        this(ggd.a(4.0f), ggd.a(4.0f), ggd.a(0.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ede)) {
            return false;
        }
        ede edeVar = (ede) obj;
        return wl7.b(this.a, edeVar.a) && wl7.b(this.b, edeVar.b) && wl7.b(this.c, edeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public ede(p03 p03Var, p03 p03Var2, p03 p03Var3) {
        this.a = p03Var;
        this.b = p03Var2;
        this.c = p03Var3;
    }

    public ede() {
        this(0);
    }
}
