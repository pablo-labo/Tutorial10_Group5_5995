package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class fag {
    public final String a;
    public final hva.c b;
    public final hva<zeg> c;

    public fag(String str, hva.c cVar, hva hvaVar) {
        str.getClass();
        hvaVar.getClass();
        this.a = str;
        this.b = cVar;
        this.c = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fag)) {
            return false;
        }
        fag fagVar = (fag) obj;
        return wl7.b(this.a, fagVar.a) && this.b.equals(fagVar.b) && wl7.b(this.c, fagVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileLanguageInput(id=");
        sb.append(this.a);
        sb.append(", taxonomyConceptLanguage=");
        sb.append(this.b);
        sb.append(", taxonomyConceptProficiency=");
        return akb.l(sb, this.c, ")");
    }
}
