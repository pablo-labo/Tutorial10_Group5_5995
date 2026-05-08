package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cod {
    public final String a;
    public final dod b;
    public final String c;
    public final String d;
    public final e95 e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public cod(String str, dod dodVar, String str2, String str3, e95 e95Var, String str4, String str5, boolean z, boolean z2, boolean z3) {
        str2.getClass();
        str3.getClass();
        e95Var.getClass();
        str4.getClass();
        str5.getClass();
        this.a = str;
        this.b = dodVar;
        this.c = str2;
        this.d = str3;
        this.e = e95Var;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cod)) {
            return false;
        }
        cod codVar = (cod) obj;
        return this.a.equals(codVar.a) && this.b.equals(codVar.b) && wl7.b(this.c, codVar.c) && wl7.b(this.d, codVar.d) && this.e == codVar.e && wl7.b(this.f, codVar.f) && wl7.b(this.g, codVar.g) && this.h == codVar.h && this.i == codVar.i && this.j == codVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ia.f(ia.f(akb.d(akb.d((this.e.hashCode() + akb.d(akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduleApplyUnboundFormField(placeholder=");
        sb.append(this.a);
        sb.append(", response=");
        sb.append(this.b);
        sb.append(", id=");
        ia.r(sb, this.c, ", fieldName=", this.d, ", fieldType=");
        sb.append(this.e);
        sb.append(", classification=");
        sb.append(this.f);
        sb.append(", label=");
        akb.q(this.g, ", required=", ", disabled=", sb, this.h);
        sb.append(this.i);
        sb.append(", readonly=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
