package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class tyd {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;

    public tyd() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyd)) {
            return false;
        }
        tyd tydVar = (tyd) obj;
        return wl7.b(this.a, tydVar.a) && wl7.b(this.b, tydVar.b) && wl7.b(this.c, tydVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return akb.l(v40.g("SegmentationJobDetailsContextInput(jobTitle=", this.a, ", jobDescription=", this.b, ", companyName="), this.c, ")");
    }
}
