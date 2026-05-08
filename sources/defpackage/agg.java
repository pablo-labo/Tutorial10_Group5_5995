package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class agg implements p4a<a> {
    public final zfg a;

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
            return bVar.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerProfileMutations=" + this.a + ")";
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
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "JobSeekerProfileMutations(updateSourcingElection=" + this.a + ")";
        }
    }

    public static final class c {
        public final r48 a;

        public c(r48 r48Var) {
            this.a = r48Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateSourcingElection(sourcingElection=" + this.a + ")";
        }
    }

    public agg(zfg zfgVar) {
        zfgVar.getClass();
        this.a = zfgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        cgg cggVar = cgg.a;
        ha.g gVar = ha.a;
        return new ena(cggVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateSourcingElection($input: UpdateSourcingElectionInput!) { jobSeekerProfileMutations { updateSourcingElection(input: $input) { sourcingElection } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = bgg.c;
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
        zfg zfgVar = this.a;
        zfgVar.getClass();
        hc8Var.u0("sourcingElection");
        hc8Var.T0(zfgVar.a.a());
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agg) && wl7.b(this.a, ((agg) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "47be3afdbcb98a9ff0ce9e27c14199bcacfc4c35d06ff8d64ed2945577bd5b4e";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateSourcingElection";
    }

    public final String toString() {
        return "UpdateSourcingElectionMutation(input=" + this.a + ")";
    }
}
