package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o52 {
    public final o8a a;
    public final u4c b;
    public final xf1 c;
    public final qne d;

    public o52(o8a o8aVar, u4c u4cVar, xf1 xf1Var, qne qneVar) {
        o8aVar.getClass();
        u4cVar.getClass();
        xf1Var.getClass();
        qneVar.getClass();
        this.a = o8aVar;
        this.b = u4cVar;
        this.c = xf1Var;
        this.d = qneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o52)) {
            return false;
        }
        o52 o52Var = (o52) obj;
        return wl7.b(this.a, o52Var.a) && wl7.b(this.b, o52Var.b) && wl7.b(this.c, o52Var.c) && wl7.b(this.d, o52Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
