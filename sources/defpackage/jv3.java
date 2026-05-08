package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jv3 implements p4a<a> {
    public final hv3 a;

    public static final class a implements p4a.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.a.hashCode();
        }

        public final String toString() {
            return "Data(deleteJobSeekerProfileResumeLanguages=" + this.a + ")";
        }
    }

    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("DeleteJobSeekerProfileResumeLanguages(languageIds=", ")", this.a);
        }
    }

    public jv3(hv3 hv3Var) {
        this.a = hv3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        lv3 lv3Var = lv3.a;
        ha.g gVar = ha.a;
        return new ena(lv3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumeLanguages($input: DeleteJobSeekerProfileResumeLanguagesInput!) { deleteJobSeekerProfileResumeLanguages(input: $input) { languageIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = kv3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        iv3 iv3Var = iv3.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        iv3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv3) && this.a.equals(((jv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "b83b8d589191eaafefa8ab5eee86f8eb8fc372ecd6170b48e55fdc729c8b7e18";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumeLanguages";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumeLanguagesMutation(input=" + this.a + ")";
    }
}
