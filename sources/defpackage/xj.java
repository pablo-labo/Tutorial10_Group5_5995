package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class xj {
    public final hva<a18> a;
    public final hva<String> b;
    public final hva<iq> c;
    public final String d;

    public xj() {
        throw null;
    }

    public xj(hva hvaVar, hva hvaVar2, String str) {
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = aVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) obj;
        return wl7.b(this.a, xjVar.a) && wl7.b(this.b, xjVar.b) && wl7.b(this.c, xjVar.c) && wl7.b(this.d, xjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("AddJobSeekerProfileCertificationInput(dateRange=", this.a, ", description=", this.b, ", taxonomyConceptTitle=");
        sbG.append(this.c);
        sbG.append(", title=");
        sbG.append(this.d);
        sbG.append(")");
        return sbG.toString();
    }
}
