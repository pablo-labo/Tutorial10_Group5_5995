package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vrf {
    public final le0 a;
    public final roa b;

    public vrf(le0 le0Var, roa roaVar) {
        this.a = le0Var;
        this.b = roaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrf)) {
            return false;
        }
        vrf vrfVar = (vrf) obj;
        return wl7.b(this.a, vrfVar.a) && this.b.equals(vrfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
