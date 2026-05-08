package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f52 implements p4a<b> {
    public final d52 a;

    public static final class a {
        public final Object a;

        public a(Object obj) {
            this.a = obj;
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
            return v40.e(this.a, "ClaimJobSeekerSlug(slug=", ")");
        }
    }

    public static final class b implements p4a.a {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.a.hashCode();
        }

        public final String toString() {
            return "Data(claimJobSeekerSlug=" + this.a + ")";
        }
    }

    public f52(d52 d52Var) {
        this.a = d52Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        i52 i52Var = i52.a;
        ha.g gVar = ha.a;
        return new ena(i52Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation ClaimJobSeekerSlug($input: ClaimJobSeekerSlugInput!) { claimJobSeekerSlug(input: $input) { slug } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = g52.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        e52 e52Var = e52.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        e52Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f52) && this.a.equals(((f52) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "25afeef684d52f3cfb33914be81d95627d6386314aaa74f6b4caf9a365c577d6";
    }

    @Override // defpackage.pua
    public final String name() {
        return "ClaimJobSeekerSlug";
    }

    public final String toString() {
        return "ClaimJobSeekerSlugMutation(input=" + this.a + ")";
    }
}
