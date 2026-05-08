package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class up {
    public final String a;
    public final hva<String> b;
    public final i68 c;
    public final hva<d58> d;
    public final hva<Double> e;

    public up() {
        throw null;
    }

    public up(hva.c cVar, String str) {
        i68 i68Var = i68.c;
        hva.a aVar = hva.a.a;
        str.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = aVar;
        this.c = i68Var;
        this.d = cVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return wl7.b(this.a, upVar.a) && wl7.b(this.b, upVar.b) && this.c == upVar.c && wl7.b(this.d, upVar.d) && wl7.b(this.e, upVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, (this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddJobSeekerProfileStructuredDataPreferenceAttributeInput(suid=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", sentiment=");
        sb.append(this.c);
        sb.append(", source=");
        sb.append(this.d);
        sb.append(", collectionTime=");
        return akb.l(sb, this.e, ")");
    }
}
