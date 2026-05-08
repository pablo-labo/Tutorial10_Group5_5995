package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class seg {
    public final String a;
    public final hva<Object> b;
    public final hva.c c;
    public final hva<String> d;
    public final hva<q68> e;

    public seg(String str, hva hvaVar, hva.c cVar, hva hvaVar2, hva hvaVar3) {
        str.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = cVar;
        this.d = hvaVar2;
        this.e = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof seg)) {
            return false;
        }
        seg segVar = (seg) obj;
        return wl7.b(this.a, segVar.a) && wl7.b(this.b, segVar.b) && this.c.equals(segVar.c) && wl7.b(this.d, segVar.d) && wl7.b(this.e, segVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, (this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileSkillInput(id=");
        sb.append(this.a);
        sb.append(", experience=");
        sb.append(this.b);
        sb.append(", taxonomyConceptTitle=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", timeUnit=");
        return akb.l(sb, this.e, ")");
    }
}
