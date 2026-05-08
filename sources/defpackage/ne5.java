package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ne5 implements c9c<a> {
    public final le5 a;

    public static final class a implements c9c.a {
        public final d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "Data(resumeFileSuggestionQueries=" + this.a + ")";
        }
    }

    public static final class b {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public final String toString() {
            return "FindResumeFileSuggestions(resumeFileSuggestion=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final u8d c;

        public c(String str, String str2, u8d u8dVar) {
            this.a = str;
            this.b = str2;
            this.c = u8dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("ResumeFileSuggestion(resumeFileId=", this.a, ", clientName=", this.b, ", status=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class d {
        public final b a;

        public d(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "ResumeFileSuggestionQueries(findResumeFileSuggestions=" + this.a + ")";
        }
    }

    public ne5(le5 le5Var) {
        this.a = le5Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        pe5 pe5Var = pe5.a;
        ha.g gVar = ha.a;
        return new ena(pe5Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query FindResumeFileSuggestions($input: FindResumeFileSuggestionsInput!) { resumeFileSuggestionQueries { findResumeFileSuggestions(input: $input) { resumeFileSuggestion { resumeFileId clientName status } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = oe5.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        hc8Var.u0("resumeFileId");
        ha.a.b(hc8Var, lb3Var, this.a.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne5) && this.a.equals(((ne5) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "44f5d4d228623afe4cf19049149bab4a939ef6cd89e79c9a470c95cf3951a6bf";
    }

    @Override // defpackage.pua
    public final String name() {
        return "FindResumeFileSuggestions";
    }

    public final String toString() {
        return "FindResumeFileSuggestionsQuery(input=" + this.a + ")";
    }
}
