package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wt implements p4a<b> {
    public final ut a;

    public static final class a {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
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
            return "AddOrUpdateResumeFileSuggestion(resumeFileSuggestion=" + this.a + ")";
        }
    }

    public static final class b implements p4a.a {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "Data(resumeFileSuggestionMutations=" + this.a + ")";
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
        public final a a;

        public d(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.a.hashCode();
        }

        public final String toString() {
            return "ResumeFileSuggestionMutations(addOrUpdateResumeFileSuggestion=" + this.a + ")";
        }
    }

    public wt(ut utVar) {
        this.a = utVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        zt ztVar = zt.a;
        ha.g gVar = ha.a;
        return new ena(ztVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddOrUpdateResumeFileSuggestion($input: AddOrUpdateResumeFileSuggestionInput!) { resumeFileSuggestionMutations { addOrUpdateResumeFileSuggestion(input: $input) { resumeFileSuggestion { resumeFileId clientName status } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = xt.d;
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
        vt.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt) && this.a.equals(((wt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "825f7c7b104d9db3659e8514fb8e4437b3a23fa252c7c7c31f2217d9de4efd7d";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddOrUpdateResumeFileSuggestion";
    }

    public final String toString() {
        return "AddOrUpdateResumeFileSuggestionMutation(input=" + this.a + ")";
    }
}
