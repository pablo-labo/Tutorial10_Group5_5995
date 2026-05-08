package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class zyd {
    public final hva<Boolean> a;

    public zyd() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyd) && wl7.b(this.a, ((zyd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SegmentationRequestOptionsInput(useCrowtaxo=" + this.a + ")";
    }
}
