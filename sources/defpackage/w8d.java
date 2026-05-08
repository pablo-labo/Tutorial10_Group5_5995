package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class w8d implements g15.a {
    public final String a;
    public final a b;
    public final b c;

    public static final class a {
        public final String a;
        public final gbf b;

        public a(String str, gbf gbfVar) {
            this.a = str;
            this.b = gbfVar;
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
            return "TaxonomyConceptLanguage(__typename=" + this.a + ", taxonomyConceptWithName=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final gbf b;

        public b(String str, gbf gbfVar) {
            this.a = str;
            this.b = gbfVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TaxonomyConceptProficiency(__typename=" + this.a + ", taxonomyConceptWithName=" + this.b + ")";
        }
    }

    public w8d(String str, a aVar, b bVar) {
        this.a = str;
        this.b = aVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8d)) {
            return false;
        }
        w8d w8dVar = (w8d) obj;
        return this.a.equals(w8dVar.a) && wl7.b(this.b, w8dVar.b) && wl7.b(this.c, w8dVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "ResumeLanguage(id=" + this.a + ", taxonomyConceptLanguage=" + this.b + ", taxonomyConceptProficiency=" + this.c + ")";
    }
}
