package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class bzd {
    public final hva<String> a;
    public final hva<String> b;

    public bzd() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzd)) {
            return false;
        }
        bzd bzdVar = (bzd) obj;
        return wl7.b(this.a, bzdVar.a) && wl7.b(this.b, bzdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SegmentationSearchContextInput(queryWhat=" + this.a + ", queryLocation=" + this.b + ")";
    }
}
