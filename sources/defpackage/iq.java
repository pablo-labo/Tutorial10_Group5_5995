package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iq {
    public final String a;
    public final String b;
    public final hva<String> c;
    public final hva<List<o48>> d;
    public final hva<List<y08>> e;

    public iq() {
        throw null;
    }

    public iq(String str, String str2) {
        hva.a aVar = hva.a.a;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return wl7.b(this.a, iqVar.a) && wl7.b(this.b, iqVar.b) && wl7.b(this.c, iqVar.c) && wl7.b(this.d, iqVar.d) && wl7.b(this.e, iqVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AddJobSeekerProfileTaxonomyConceptInput(label=", this.a, ", suid=", this.b, ", type=");
        w40.o(sbF, this.c, ", sectionIds=", this.d, ", context=");
        return akb.l(sbF, this.e, ")");
    }
}
