package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dde {
    public final p03 a;
    public final p03 b;
    public final p03 c;
    public final p03 d;
    public final p03 e;

    public dde(int i) {
        fgd fgdVar = kce.a;
        fgd fgdVar2 = kce.b;
        fgd fgdVar3 = kce.c;
        fgd fgdVar4 = kce.d;
        fgd fgdVar5 = kce.e;
        this.a = fgdVar;
        this.b = fgdVar2;
        this.c = fgdVar3;
        this.d = fgdVar4;
        this.e = fgdVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dde)) {
            return false;
        }
        dde ddeVar = (dde) obj;
        return wl7.b(this.a, ddeVar.a) && wl7.b(this.b, ddeVar.b) && wl7.b(this.c, ddeVar.c) && wl7.b(this.d, ddeVar.d) && wl7.b(this.e, ddeVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }

    public dde() {
        this(0);
    }
}
