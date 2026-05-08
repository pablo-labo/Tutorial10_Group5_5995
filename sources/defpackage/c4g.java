package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c4g {
    public final sof a;
    public final List<raa> b;
    public final List<raa> c;
    public final da2 d;
    public final boolean e;

    public c4g() {
        throw null;
    }

    public /* synthetic */ c4g(sof sofVar, List list, List list2, int i) {
        this((i & 1) != 0 ? null : sofVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, null, (i & 16) != 0);
    }

    public static c4g a(c4g c4gVar, sof sofVar, List list, List list2, da2 da2Var, int i) {
        if ((i & 1) != 0) {
            sofVar = c4gVar.a;
        }
        sof sofVar2 = sofVar;
        if ((i & 2) != 0) {
            list = c4gVar.b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = c4gVar.c;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            da2Var = c4gVar.d;
        }
        boolean z = c4gVar.e;
        c4gVar.getClass();
        return new c4g(sofVar2, list3, list4, da2Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4g)) {
            return false;
        }
        c4g c4gVar = (c4g) obj;
        return wl7.b(this.a, c4gVar.a) && wl7.b(this.b, c4gVar.b) && wl7.b(this.c, c4gVar.c) && wl7.b(this.d, c4gVar.d) && this.e == c4gVar.e;
    }

    public final int hashCode() {
        sof sofVar = this.a;
        int iHashCode = (sofVar == null ? 0 : sofVar.hashCode()) * 31;
        List<raa> list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<raa> list2 = this.c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        da2 da2Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (da2Var != null ? Long.hashCode(da2Var.a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UIPTopNavBarState(titleBlock=");
        sb.append(this.a);
        sb.append(", leadingItems=");
        sb.append(this.b);
        sb.append(", trailingItems=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", animated=");
        return z3.o(sb, this.e, ")");
    }

    public c4g(sof sofVar, List list, List list2, da2 da2Var, boolean z) {
        this.a = sofVar;
        this.b = list;
        this.c = list2;
        this.d = da2Var;
        this.e = z;
    }
}
