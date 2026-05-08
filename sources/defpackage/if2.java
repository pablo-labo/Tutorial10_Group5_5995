package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class if2 {
    public final hva<cf2> a;
    public final hva<pe2> b;
    public final hva<pe2> c;
    public final hva<pe2> d;
    public final hva<ef2> e;

    public if2() {
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
        if (!(obj instanceof if2)) {
            return false;
        }
        if2 if2Var = (if2) obj;
        return wl7.b(this.a, if2Var.a) && wl7.b(this.b, if2Var.b) && wl7.b(this.c, if2Var.c) && wl7.b(this.d, if2Var.d) && wl7.b(this.e, if2Var.e);
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
