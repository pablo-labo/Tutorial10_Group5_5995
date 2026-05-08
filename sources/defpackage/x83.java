package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class x83 {
    public final hva<m9c> a;

    public x83(hva<m9c> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x83) && wl7.b(this.a, ((x83) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CurrentJobSeekerResponsivenessQueryInput(timeWindow=" + this.a + ")";
    }

    public x83() {
        this(hva.a.a);
    }
}
