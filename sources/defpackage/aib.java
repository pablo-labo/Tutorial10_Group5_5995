package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class aib {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<String> f;

    public aib(hva.c cVar, hva.c cVar2, hva.c cVar3, hva.c cVar4, int i) {
        hva<String> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva<String> hvaVar2 = (i & 2) != 0 ? hva.a.a : cVar2;
        hva<String> hvaVar3 = (i & 4) != 0 ? hva.a.a : cVar3;
        hva.a aVar = hva.a.a;
        hva<String> hvaVar4 = (i & 16) != 0 ? aVar : cVar4;
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        aVar.getClass();
        hvaVar4.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = hvaVar3;
        this.d = aVar;
        this.e = hvaVar4;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aib)) {
            return false;
        }
        aib aibVar = (aib) obj;
        return wl7.b(this.a, aibVar.a) && wl7.b(this.b, aibVar.b) && wl7.b(this.c, aibVar.c) && wl7.b(this.d, aibVar.d) && wl7.b(this.e, aibVar.e) && wl7.b(this.f, aibVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("PreOrPostApplyConversationScopeDataInput(candidateKey=", this.a, ", advertiserKey=", this.b, ", aggJobKey=");
        w40.o(sbG, this.c, ", jobseekerAccountKey=", this.d, ", eligibilityToken=");
        return uz.e(sbG, this.e, ", employerJobId=", this.f, ")");
    }

    public aib() {
        this(null, null, null, null, 63);
    }
}
