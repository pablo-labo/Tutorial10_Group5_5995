package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class pp {
    public final hva<Object> a;
    public final hva<iq> b;
    public final String c;
    public final hva<q68> d;

    public pp(hva hvaVar, hva hvaVar2, hva hvaVar3, String str) {
        hvaVar.getClass();
        hvaVar2.getClass();
        str.getClass();
        hvaVar3.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = str;
        this.d = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp)) {
            return false;
        }
        pp ppVar = (pp) obj;
        return wl7.b(this.a, ppVar.a) && wl7.b(this.b, ppVar.b) && wl7.b(this.c, ppVar.c) && wl7.b(this.d, ppVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + akb.d(b0.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("AddJobSeekerProfileSkillInput(experience=", this.a, ", taxonomyConceptTitle=", this.b, ", text=");
        sbG.append(this.c);
        sbG.append(", timeUnit=");
        sbG.append(this.d);
        sbG.append(")");
        return sbG.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pp(hva.c cVar, String str) {
        hva.a aVar = hva.a.a;
        this(aVar, cVar, aVar, str);
    }
}
