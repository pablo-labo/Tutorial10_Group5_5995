package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ux6 {
    public final String a;
    public final zlg b;
    public final fv6 c;
    public final ar6 d;

    public ux6() {
        throw null;
    }

    public ux6(String str, zlg zlgVar, fv6 fv6Var, int i) {
        zlgVar = (i & 2) != 0 ? zlg.a : zlgVar;
        fv6Var = (i & 4) != 0 ? null : fv6Var;
        ar6 ar6Var = (i & 8) != 0 ? ar6.Filled : ar6.Stroke;
        str.getClass();
        this.a = str;
        this.b = zlgVar;
        this.c = fv6Var;
        this.d = ar6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux6)) {
            return false;
        }
        ux6 ux6Var = (ux6) obj;
        return wl7.b(this.a, ux6Var.a) && this.b == ux6Var.b && this.c == ux6Var.c && this.d == ux6Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        fv6 fv6Var = this.c;
        return (this.d.hashCode() + ((iHashCode + (fv6Var == null ? 0 : fv6Var.hashCode())) * 31)) * 923521;
    }

    public final String toString() {
        return "IdlSuggestListItem(label=" + this.a + ", variant=" + this.b + ", iconName=" + this.c + ", iconVariant=" + this.d + ", description=null, contentBefore=null, contentAfter=null, onClickAction=null)";
    }
}
