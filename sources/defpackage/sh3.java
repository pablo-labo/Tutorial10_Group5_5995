package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sh3 {
    public final String a;
    public final String b;
    public final List<rh3> c;

    /* JADX WARN: Multi-variable type inference failed */
    public sh3(String str, String str2, List<? extends rh3> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh3)) {
            return false;
        }
        sh3 sh3Var = (sh3) obj;
        return this.a.equals(sh3Var.a) && this.b.equals(sh3Var.b) && this.c.equals(sh3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return g7.i(u40.f("DebugFormSection(title=", this.a, ", sectionType=", this.b, ", actions="), this.c, ")");
    }
}
