package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class aca {
    public final String a;
    public final String b;
    public final ArrayList c;

    public aca(String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca)) {
            return false;
        }
        aca acaVar = (aca) obj;
        return wl7.b(this.a, acaVar.a) && this.b.equals(acaVar.b) && this.c.equals(acaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("NavMenuItemCategory(id=", this.a, ", label=", this.b, ", items=");
        sbF.append(this.c);
        sbF.append(")");
        return sbF.toString();
    }
}
