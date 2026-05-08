package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class h58 {
    public final String a;
    public final h68 b;
    public final hva<c58> c;
    public final hva<String> d;
    public final hva<Double> e;

    public h58() {
        throw null;
    }

    public h58(hva.c cVar, String str) {
        h68 h68Var = h68.c;
        hva.a aVar = hva.a.a;
        str.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = h68Var;
        this.c = cVar;
        this.d = aVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h58)) {
            return false;
        }
        h58 h58Var = (h58) obj;
        return wl7.b(this.a, h58Var.a) && this.b == h58Var.b && wl7.b(this.c, h58Var.c) && wl7.b(this.d, h58Var.d) && wl7.b(this.e, h58Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JobSeekerProfileStructuredDataJobTitleInput(jobTitle=");
        sb.append(this.a);
        sb.append(", sentiment=");
        sb.append(this.b);
        sb.append(", source=");
        w40.o(sb, this.c, ", normalizedValue=", this.d, ", collectionTime=");
        return akb.l(sb, this.e, ")");
    }
}
