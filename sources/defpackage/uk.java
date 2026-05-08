package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uk {
    public final hva<a18> a;
    public final hva<List<String>> b;
    public final hva<p38> c;
    public final hva<iq> d;
    public final hva<k38> e;
    public final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public uk(hva<a18> hvaVar, hva<? extends List<String>> hvaVar2, hva<p38> hvaVar3, hva<iq> hvaVar4, hva<? extends k38> hvaVar5, String str) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = hvaVar3;
        this.d = hvaVar4;
        this.e = hvaVar5;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return false;
        }
        uk ukVar = (uk) obj;
        return wl7.b(this.a, ukVar.a) && wl7.b(this.b, ukVar.b) && wl7.b(this.c, ukVar.c) && wl7.b(this.d, ukVar.d) && wl7.b(this.e, ukVar.e) && this.f.equals(ukVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("AddJobSeekerProfileLicenseInput(dateRange=", this.a, ", endorsements=", this.b, ", location=");
        w40.o(sbG, this.c, ", taxonomyConceptTitle=", this.d, ", type=");
        sbG.append(this.e);
        sbG.append(", title=");
        sbG.append(this.f);
        sbG.append(")");
        return sbG.toString();
    }
}
