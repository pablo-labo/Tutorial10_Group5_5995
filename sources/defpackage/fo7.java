package defpackage;

import defpackage.ude;

/* JADX INFO: loaded from: classes3.dex */
public final class fo7 {
    public final int a;
    public final String b;
    public final int c;
    public final ude.a d;
    public final ude.c e;

    public fo7(int i, String str, int i2, ude.a aVar, ude.c cVar, int i3) {
        aVar = (i3 & 8) != 0 ? null : aVar;
        cVar = (i3 & 16) != 0 ? null : cVar;
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = aVar;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo7)) {
            return false;
        }
        fo7 fo7Var = (fo7) obj;
        return this.a == fo7Var.a && this.b.equals(fo7Var.b) && this.c == fo7Var.c && wl7.b(this.d, fo7Var.d) && wl7.b(this.e, fo7Var.e);
    }

    public final int hashCode() {
        int iC = w40.c(this.c, akb.d(Integer.hashCode(this.a) * 31, 31, this.b), 31);
        ude.a aVar = this.d;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ude.c cVar = this.e;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = m6.j(this.a, "ItemDetail(id=", ", text=", this.b, ", icon=");
        sbJ.append(this.c);
        sbJ.append(", moveJobOperations=");
        sbJ.append(this.d);
        sbJ.append(", sharedViewEvent=");
        sbJ.append(this.e);
        sbJ.append(")");
        return sbJ.toString();
    }
}
