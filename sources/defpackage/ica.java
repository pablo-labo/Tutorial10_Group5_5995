package defpackage;

import defpackage.yda;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ica {
    public final String a;
    public final List<yda.d> b;
    public final List<yda.b> c;
    public final List<yda.f> d;
    public final List<yda.j> e;
    public final List<yda.i> f;

    public ica(String str, List<yda.d> list, List<yda.b> list2, List<yda.f> list3, List<yda.j> list4, List<yda.i> list5) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ica)) {
            return false;
        }
        ica icaVar = (ica) obj;
        return wl7.b(this.a, icaVar.a) && this.b.equals(icaVar.b) && this.c.equals(icaVar.c) && this.d.equals(icaVar.d) && this.e.equals(icaVar.e) && this.f.equals(icaVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ia.g(this.e, ia.g(this.d, ia.g(this.c, ia.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavMenuResponse(locale=");
        sb.append(this.a);
        sb.append(", hamburgerMenuList=");
        sb.append(this.b);
        sb.append(", categorizedHamburgerMenuList=");
        l6.q(sb, this.c, ", navBarLeftItems=", this.d, ", navBarRightItems=");
        sb.append(this.e);
        sb.append(", countries=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
