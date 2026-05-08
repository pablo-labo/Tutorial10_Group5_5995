package defpackage;

import defpackage.le0;
import defpackage.pn5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kif {
    public final le0 a;
    public final tjf b;
    public final List<le0.c<sab>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final iy3 g;
    public final vl8 h;
    public final pn5.a i;
    public final long j;

    public kif(le0 le0Var, tjf tjfVar, List list, int i, boolean z, int i2, iy3 iy3Var, vl8 vl8Var, pn5.a aVar, long j) {
        this.a = le0Var;
        this.b = tjfVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = iy3Var;
        this.h = vl8Var;
        this.i = aVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kif)) {
            return false;
        }
        kif kifVar = (kif) obj;
        return wl7.b(this.a, kifVar.a) && wl7.b(this.b, kifVar.b) && wl7.b(this.c, kifVar.c) && this.d == kifVar.d && this.e == kifVar.e && this.f == kifVar.f && wl7.b(this.g, kifVar.g) && this.h == kifVar.h && wl7.b(this.i, kifVar.i) && iq2.b(this.j, kifVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + w40.c(this.f, ia.f((ia.g(this.c, t40.c(this.a.hashCode() * 31, 31, this.b), 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) iq2.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
