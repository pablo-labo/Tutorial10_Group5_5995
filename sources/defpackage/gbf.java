package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class gbf implements g15.a {
    public final String a;
    public final a b;

    public static final class a {
        public final String a;
        public final xaf b;

        public a(String str, xaf xafVar) {
            this.a = str;
            this.b = xafVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TaxonomyConceptName(__typename=" + this.a + ", taxonomyConcept=" + this.b + ")";
        }
    }

    public gbf(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbf)) {
            return false;
        }
        gbf gbfVar = (gbf) obj;
        return wl7.b(this.a, gbfVar.a) && wl7.b(this.b, gbfVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "TaxonomyConceptWithName(name=" + this.a + ", taxonomyConceptName=" + this.b + ")";
    }
}
