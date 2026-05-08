package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dqb {
    public final x73 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ dqb(int i) {
        this(new x73(null, null), true, false, "", "", false);
    }

    public static dqb a(dqb dqbVar, x73 x73Var, boolean z, boolean z2, String str, String str2, boolean z3, int i) {
        if ((i & 1) != 0) {
            x73Var = dqbVar.a;
        }
        x73 x73Var2 = x73Var;
        if ((i & 2) != 0) {
            z = dqbVar.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = dqbVar.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            str = dqbVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = dqbVar.e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            z3 = dqbVar.f;
        }
        dqbVar.getClass();
        x73Var2.getClass();
        str3.getClass();
        str4.getClass();
        return new dqb(x73Var2, z4, z5, str3, str4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqb)) {
            return false;
        }
        dqb dqbVar = (dqb) obj;
        return wl7.b(this.a, dqbVar.a) && this.b == dqbVar.b && this.c == dqbVar.c && wl7.b(this.d, dqbVar.d) && wl7.b(this.e, dqbVar.e) && this.f == dqbVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + akb.d(akb.d(ia.f(ia.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCrowTaxoSkillsState(crowTaxoSkillModel=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", hasError=");
        k6.k(", selectedItemId=", this.d, ", selectedItemLabel=", sb, this.c);
        sb.append(this.e);
        sb.append(", isReady=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public dqb(x73 x73Var, boolean z, boolean z2, String str, String str2, boolean z3) {
        this.a = x73Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = z3;
    }

    public dqb() {
        this(0);
    }
}
