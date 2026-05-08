package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eqb {
    public final boolean a;
    public final String b;
    public final fv6 c;
    public final gu5<j6g> d;

    public eqb(boolean z, String str, fv6 fv6Var, gu5<j6g> gu5Var) {
        str.getClass();
        fv6Var.getClass();
        gu5Var.getClass();
        this.a = z;
        this.b = str;
        this.c = fv6Var;
        this.d = gu5Var;
    }

    public final gu5<j6g> a() {
        return this.d;
    }

    public final fv6 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqb)) {
            return false;
        }
        eqb eqbVar = (eqb) obj;
        return this.a == eqbVar.a && wl7.b(this.b, eqbVar.b) && this.c == eqbVar.c && wl7.b(this.d, eqbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + akb.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ProfileFeedbackToastState(isPresented=" + this.a + ", text=" + this.b + ", iconName=" + this.c + ", dismissRequested=" + this.d + ")";
    }

    public eqb() {
        this(0);
    }

    public /* synthetic */ eqb(int i) {
        this(false, "", fv6.C1, new k7(13));
    }
}
