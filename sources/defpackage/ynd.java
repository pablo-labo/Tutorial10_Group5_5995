package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ynd {
    public final List<tnd> a;
    public final znd b;
    public final String c;
    public final String d;
    public final e95 e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ynd(List<tnd> list, znd zndVar, String str, String str2, e95 e95Var, String str3, String str4, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        e95Var.getClass();
        str3.getClass();
        str4.getClass();
        this.a = list;
        this.b = zndVar;
        this.c = str;
        this.d = str2;
        this.e = e95Var;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynd)) {
            return false;
        }
        ynd yndVar = (ynd) obj;
        return this.a.equals(yndVar.a) && this.b.equals(yndVar.b) && wl7.b(this.c, yndVar.c) && wl7.b(this.d, yndVar.d) && this.e == yndVar.e && wl7.b(this.f, yndVar.f) && wl7.b(this.g, yndVar.g) && this.h == yndVar.h && this.i == yndVar.i && this.j == yndVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ia.f(ia.f(akb.d(akb.d((this.e.hashCode() + akb.d(akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduleApplyOptionsFormField(options=");
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
