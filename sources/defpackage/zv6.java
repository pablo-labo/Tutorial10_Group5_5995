package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zv6 {
    public final String a;
    public final boolean b;

    public zv6(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv6)) {
            return false;
        }
        zv6 zv6Var = (zv6) obj;
        return wl7.b(this.a, zv6Var.a) && this.b == zv6Var.b;
    }

    public final int hashCode() {
        return ia.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "IdlRadioSelectorItemData(label=" + this.a + ", isSelected=" + this.b + ", explainerText=null)";
    }
}
