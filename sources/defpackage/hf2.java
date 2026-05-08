package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class hf2 {
    public final hva<bf2> a;
    public final hva<qe2> b;
    public final hva<qe2> c;
    public final hva<qe2> d;
    public final hva<df2> e;

    public hf2() {
        hva.a aVar = hva.a.a;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf2)) {
            return false;
        }
        hf2 hf2Var = (hf2) obj;
        return wl7.b(this.a, hf2Var.a) && wl7.b(this.b, hf2Var.b) && wl7.b(this.c, hf2Var.c) && wl7.b(this.d, hf2Var.d) && wl7.b(this.e, hf2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("CompleteButtonParametersJobStandardFieldsInput(name=", this.a, ", resume=", this.b, ", coverLetter=");
        w40.o(sbG, this.c, ", phone=", this.d, ", resumeFields=");
        return akb.l(sbG, this.e, ")");
    }
}
