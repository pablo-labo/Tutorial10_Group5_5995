package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k43 implements p4a<c> {
    public final f43 a;

    public static final class a {
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
            return "ApplyUrl(createApplyUrlFullParams=" + this.a + ")";
        }
    }

    public static final class b {
        public final Object a;
        public final String b;

        public b(Object obj, String str) {
            this.a = obj;
            this.b = str;
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
            return "CreateApplyUrlFullParams(url=" + this.a + ", iaUid=" + this.b + ")";
        }
    }

    public static final class c implements p4a.a {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Data(applyUrl=" + this.a + ")";
        }
    }

    public k43(f43 f43Var) {
        this.a = f43Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        r43 r43Var = r43.a;
        ha.g gVar = ha.a;
        return new ena(r43Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation CreateApplyUrlFullParams($input: CreateApplyUrlFullParamsInput!) { applyUrl { createApplyUrlFullParams(input: $input) { url iaUid } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = r4a.a;
        snaVar.getClass();
        List<vd2> list = l43.c;
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
        h43.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k43) && this.a.equals(((k43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "25db242fb17b972b7636c20e85631b57e4e17141e585cd64f0e103deb54afb40";
    }

    @Override // defpackage.pua
    public final String name() {
        return "CreateApplyUrlFullParams";
    }

    public final String toString() {
        return "CreateApplyUrlFullParamsMutation(input=" + this.a + ")";
    }
}
