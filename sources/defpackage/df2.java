package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class df2 {
    public final hva<qe2> a;
    public final hva<qe2> b;
    public final hva<qe2> c;
    public final hva<qe2> d;
    public final hva<qe2> e;
    public final hva<qe2> f;
    public final hva<qe2> g;
    public final hva<qe2> h;
    public final hva<qe2> i;
    public final hva<qe2> j;

    public df2() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        this.j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2)) {
            return false;
        }
        df2 df2Var = (df2) obj;
        return wl7.b(this.a, df2Var.a) && wl7.b(this.b, df2Var.b) && wl7.b(this.c, df2Var.c) && wl7.b(this.d, df2Var.d) && wl7.b(this.e, df2Var.e) && wl7.b(this.f, df2Var.f) && wl7.b(this.g, df2Var.g) && wl7.b(this.h, df2Var.h) && wl7.b(this.i, df2Var.i) && wl7.b(this.j, df2Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + b0.e(this.i, b0.e(this.h, b0.e(this.g, b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("CompleteButtonParametersJobStandardFieldResumeFieldsInput(gender=", this.a, ", dateOfBirth=", this.b, ", location=");
        w40.o(sbG, this.c, ", workExperiences=", this.d, ", educations=");
        w40.o(sbG, this.e, ", skills=", this.f, ", languages=");
        w40.o(sbG, this.g, ", certifications=", this.h, ", namePronunciation=");
        return uz.e(sbG, this.i, ", phone=", this.j, ")");
    }
}
