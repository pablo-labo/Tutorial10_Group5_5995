package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zk {
    public final String a;
    public final hva<d18> b;
    public final hva<String> c;
    public final hva<String> d;

    public zk(hva hvaVar, hva hvaVar2, hva hvaVar3, String str) {
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
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return this.a.equals(zkVar.a) && wl7.b(this.b, zkVar.b) && wl7.b(this.c, zkVar.c) && wl7.b(this.d, zkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddJobSeekerProfilePublicationInput(title=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", description=");
        return uz.e(sb, this.c, ", url=", this.d, ")");
    }
}
