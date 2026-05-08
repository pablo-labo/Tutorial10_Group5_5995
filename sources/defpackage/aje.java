package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aje {
    public final String a;
    public final String b;
    public final List<zie> c;

    public aje(String str, String str2, List<zie> list) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aje)) {
            return false;
        }
        aje ajeVar = (aje) obj;
        return wl7.b(this.a, ajeVar.a) && this.b.equals(ajeVar.b) && this.c.equals(ajeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return g7.i(u40.f("SkillSet(suid=", this.a, ", label=", this.b, ", skills="), this.c, ")");
    }
}
