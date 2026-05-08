package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class djd {
    public final cjd a;
    public final cjd b;
    public final cjd c;
    public final cjd d;

    public djd(cjd cjdVar, cjd cjdVar2, cjd cjdVar3, cjd cjdVar4) {
        this.a = cjdVar;
        this.b = cjdVar2;
        this.c = cjdVar3;
        this.d = cjdVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djd)) {
            return false;
        }
        djd djdVar = (djd) obj;
        return this.a == djdVar.a && this.b == djdVar.b && this.c == djdVar.c && this.d == djdVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewEdges(top=" + this.a + ", right=" + this.b + ", bottom=" + this.c + ", left=" + this.d + ")";
    }
}
