package defpackage;

import defpackage.le0;

/* JADX INFO: loaded from: classes.dex */
public final class l3b implements le0.a {
    public final int a;
    public final int b;
    public final long c;
    public final nhf d;
    public final acb e;
    public final fx8 f;
    public final int g;
    public final int h;
    public final wif i;

    public l3b(int i, int i2, long j, nhf nhfVar, acb acbVar, fx8 fx8Var, int i3, int i4, wif wifVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = nhfVar;
        this.e = acbVar;
        this.f = fx8Var;
        this.g = i3;
        this.h = i4;
        this.i = wifVar;
        if (bkf.a(j, bkf.c) || bkf.c(j) >= 0.0f) {
            return;
        }
        be7.c("lineHeight can't be negative (" + bkf.c(j) + ')');
    }

    public final l3b a(l3b l3bVar) {
        return l3bVar == null ? this : m3b.a(this, l3bVar.a, l3bVar.b, l3bVar.c, l3bVar.d, l3bVar.e, l3bVar.f, l3bVar.g, l3bVar.h, l3bVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3b)) {
            return false;
        }
        l3b l3bVar = (l3b) obj;
        return this.a == l3bVar.a && this.b == l3bVar.b && bkf.a(this.c, l3bVar.c) && wl7.b(this.d, l3bVar.d) && wl7.b(this.e, l3bVar.e) && wl7.b(this.f, l3bVar.f) && this.g == l3bVar.g && this.h == l3bVar.h && wl7.b(this.i, l3bVar.i);
    }

    public final int hashCode() {
        int iC = w40.c(this.b, Integer.hashCode(this.a) * 31, 31);
        ckf[] ckfVarArr = bkf.b;
        int iD = ia.d(iC, 31, this.c);
        nhf nhfVar = this.d;
        int iHashCode = (iD + (nhfVar != null ? nhfVar.hashCode() : 0)) * 31;
        acb acbVar = this.e;
        int iHashCode2 = (iHashCode + (acbVar != null ? acbVar.hashCode() : 0)) * 31;
        fx8 fx8Var = this.f;
        int iC2 = w40.c(this.h, w40.c(this.g, (iHashCode2 + (fx8Var != null ? fx8Var.hashCode() : 0)) * 31, 31), 31);
        wif wifVar = this.i;
        return iC2 + (wifVar != null ? wifVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) dcf.a(this.a)) + ", textDirection=" + ((Object) sdf.a(this.b)) + ", lineHeight=" + ((Object) bkf.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) bx8.a(this.g)) + ", hyphens=" + ((Object) zm6.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
