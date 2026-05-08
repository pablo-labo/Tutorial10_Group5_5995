package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class zp3 {
    public final k89 a;
    public final y03 b;
    public final y03 c;
    public final y03 d;
    public final oka e;
    public final eib f;
    public final Bitmap.Config g;
    public final boolean h;
    public final vt1 i;
    public final vt1 j;
    public final vt1 k;

    public zp3(int i) {
        eq3 eq3Var = a74.a;
        k89 k89VarJ1 = m89.a.J1();
        no3 no3Var = no3.c;
        Bitmap.Config config = m.b;
        this.a = k89VarJ1;
        this.b = no3Var;
        this.c = no3Var;
        this.d = no3Var;
        this.e = oka.a;
        this.f = eib.a;
        this.g = config;
        this.h = true;
        vt1 vt1Var = vt1.a;
        this.i = vt1Var;
        this.j = vt1Var;
        this.k = vt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp3)) {
            return false;
        }
        zp3 zp3Var = (zp3) obj;
        return wl7.b(this.a, zp3Var.a) && wl7.b(this.b, zp3Var.b) && wl7.b(this.c, zp3Var.c) && wl7.b(this.d, zp3Var.d) && wl7.b(this.e, zp3Var.e) && this.f == zp3Var.f && this.g == zp3Var.g && this.h == zp3Var.h && this.i == zp3Var.i && this.j == zp3Var.j && this.k == zp3Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.e.getClass();
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ia.f(ia.f((this.g.hashCode() + ((this.f.hashCode() + ((oka.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.h), 923521, false)) * 31)) * 31);
    }
}
