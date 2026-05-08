package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gzd {
    public final hva<List<bzd>> a;
    public final hva<List<String>> b;
    public final yyd c;
    public final hva<List<tyd>> d;
    public final hva<List<String>> e;
    public final hva<List<String>> f;
    public final hva<List<String>> g;

    public gzd() {
        throw null;
    }

    public gzd(hva.c cVar, hva.c cVar2, yyd yydVar) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = cVar;
        this.b = cVar2;
        this.c = yydVar;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzd)) {
            return false;
        }
        gzd gzdVar = (gzd) obj;
        return wl7.b(this.a, gzdVar.a) && wl7.b(this.b, gzdVar.b) && wl7.b(this.c, gzdVar.c) && wl7.b(this.d, gzdVar.d) && wl7.b(this.e, gzdVar.e) && wl7.b(this.f, gzdVar.f) && wl7.b(this.g, gzdVar.g);
    }

    public final int hashCode() {
        int iE = b0.e(this.b, this.a.hashCode() * 31, 31);
        this.c.getClass();
        return this.g.hashCode() + b0.e(this.f, b0.e(this.e, b0.e(this.d, (87499 + iE) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("SegmentationTargetingContextInput(searchContext=", this.a, ", occupations=", this.b, ", market=");
        sbG.append(this.c);
        sbG.append(", jobDetails=");
        sbG.append(this.d);
        sbG.append(", workAreas=");
        w40.o(sbG, this.e, ", administrativeDivisions=", this.f, ", canonicalTitles=");
        return akb.l(sbG, this.g, ")");
    }
}
