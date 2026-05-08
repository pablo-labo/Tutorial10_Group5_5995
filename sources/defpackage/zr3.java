package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zr3 {
    public final List<Object> a;
    public final String b;

    public zr3(List<? extends Object> list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr3)) {
            return false;
        }
        zr3 zr3Var = (zr3) obj;
        return wl7.b(this.a, zr3Var.a) && wl7.b(this.b, zr3Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb.append(this.a);
        sb.append(", label=");
        return w40.f(sb, this.b, ')');
    }
}
