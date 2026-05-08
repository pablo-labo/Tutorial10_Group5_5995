package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class qye {
    public final hva<tye> a;
    public final hva<wye> b;

    public qye(hva.c cVar, hva.c cVar2, int i) {
        hva<tye> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva<wye> hvaVar2 = (i & 2) != 0 ? hva.a.a : cVar2;
        hvaVar.getClass();
        hvaVar2.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qye)) {
            return false;
        }
        qye qyeVar = (qye) obj;
        return wl7.b(this.a, qyeVar.a) && wl7.b(this.b, qyeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedMessageGenerationOptionInput(newGenerationInput=" + this.a + ", rewriteInput=" + this.b + ")";
    }

    public qye() {
        this(null, null, 3);
    }
}
