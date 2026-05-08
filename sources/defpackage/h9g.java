package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h9g {
    public final String a;
    public final hva<a18> b;
    public final hva<String> c;
    public final hva<String> d;

    public h9g(hva hvaVar, hva hvaVar2, hva hvaVar3, String str) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9g)) {
            return false;
        }
        h9g h9gVar = (h9g) obj;
        return this.a.equals(h9gVar.a) && wl7.b(this.b, h9gVar.b) && wl7.b(this.c, h9gVar.c) && wl7.b(this.d, h9gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileAssociationInput(id=");
        sb.append(this.a);
        sb.append(", dateRange=");
        sb.append(this.b);
        sb.append(", description=");
        return uz.e(sb, this.c, ", title=", this.d, ")");
    }
}
