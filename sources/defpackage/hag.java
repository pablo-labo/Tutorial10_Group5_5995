package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hag {
    public final String a;
    public final hva<a18> b;
    public final hva<List<String>> c;
    public final hva<p38> d;
    public final hva<xeg> e;
    public final hva<k38> f;
    public final hva<String> g;

    /* JADX WARN: Multi-variable type inference failed */
    public hag(String str, hva<a18> hvaVar, hva<? extends List<String>> hvaVar2, hva<p38> hvaVar3, hva<xeg> hvaVar4, hva<? extends k38> hvaVar5, hva<String> hvaVar6) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        hvaVar6.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = hvaVar4;
        this.f = hvaVar5;
        this.g = hvaVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hag)) {
            return false;
        }
        hag hagVar = (hag) obj;
        return this.a.equals(hagVar.a) && wl7.b(this.b, hagVar.b) && wl7.b(this.c, hagVar.c) && wl7.b(this.d, hagVar.d) && wl7.b(this.e, hagVar.e) && wl7.b(this.f, hagVar.f) && wl7.b(this.g, hagVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileLicenseInput(id=");
        sb.append(this.a);
        sb.append(", dateRange=");
        sb.append(this.b);
        sb.append(", endorsements=");
        w40.o(sb, this.c, ", location=", this.d, ", taxonomyConceptTitle=");
        w40.o(sb, this.e, ", type=", this.f, ", title=");
        return akb.l(sb, this.g, ")");
    }
}
