package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dzd {
    public final gzd a;
    public final List<wyd> b;
    public final hva<zyd> c;

    public dzd() {
        throw null;
    }

    public dzd(gzd gzdVar, List list) {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        this.a = gzdVar;
        this.b = list;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzd)) {
            return false;
        }
        dzd dzdVar = (dzd) obj;
        return wl7.b(this.a, dzdVar.a) && wl7.b(this.b, dzdVar.b) && wl7.b(this.c, dzdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ia.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentationTargetedLeverExperimentsInput(segmentTargetingContextInput=");
        sb.append(this.a);
        sb.append(", leverExperimentInput=");
        sb.append(this.b);
        sb.append(", requestOptions=");
        return akb.l(sb, this.c, ")");
    }
}
