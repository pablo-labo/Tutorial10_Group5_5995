package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class d68 {
    public final f68 a;
    public final String b;
    public final double c;
    public final hva<h68> d;
    public final hva<c58> e;
    public final hva<Double> f;

    public d68() {
        throw null;
    }

    public d68(f68 f68Var, String str, double d) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = f68Var;
        this.b = str;
        this.c = d;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d68)) {
            return false;
        }
        d68 d68Var = (d68) obj;
        return this.a == d68Var.a && wl7.b(this.b, d68Var.b) && Double.compare(this.c, d68Var.c) == 0 && wl7.b(this.d, d68Var.d) && wl7.b(this.e, d68Var.e) && wl7.b(this.f, d68Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, (Double.hashCode(this.c) + akb.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31);
    }

    public final String toString() {
        return "JobSeekerProfileStructuredDataSalaryInput(salaryType=" + this.a + ", currency=" + this.b + ", amount=" + this.c + ", sentiment=" + this.d + ", source=" + this.e + ", collectionTime=" + this.f + ")";
    }
}
