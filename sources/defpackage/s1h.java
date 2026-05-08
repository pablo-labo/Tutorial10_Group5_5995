package defpackage;

import defpackage.g15;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s1h implements g15.a {
    public final a a;
    public final c b;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("Lever(leverId=", this.a, ")");
        }
    }

    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            return akb.k("WorkArea(id=", this.a, ", label=", this.b, ")");
        }
    }

    public static final class c {
        public final String a;
        public final int b;
        public final ArrayList c;

        public c(int i, String str, ArrayList arrayList) {
            this.a = str;
            this.b = i;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b && this.c.equals(cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + w40.c(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sbH = w40.h(this.b, "WorkAreaSelection(label=", this.a, ", selectionLimit=", ", workAreas=");
            sbH.append(this.c);
            sbH.append(")");
            return sbH.toString();
        }
    }

    public s1h(a aVar, c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1h)) {
            return false;
        }
        s1h s1hVar = (s1h) obj;
        return this.a.equals(s1hVar.a) && this.b.equals(s1hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkAreasSelectionConfiguration(lever=" + this.a + ", workAreaSelection=" + this.b + ")";
    }
}
