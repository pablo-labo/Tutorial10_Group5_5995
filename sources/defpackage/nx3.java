package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nx3 implements p4a<a> {
    public final mx3 a;

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
            return "Data(deleteResumeBundle=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return l5.m("DeleteResumeBundle(resumeId=", this.a, ")");
        }
    }

    public nx3(mx3 mx3Var) {
        this.a = mx3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        px3 px3Var = px3.a;
        ha.g gVar = ha.a;
        return new ena(px3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteResumeBundle($input: DeleteResumeBundleInput!) { deleteResumeBundle(input: $input) { resumeId } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = ox3.b;
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
        hc8Var.u0("resumeId");
        ha.a.b(hc8Var, lb3Var, this.a.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx3) && this.a.equals(((nx3) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "ddd7468b46c2943ce9d5c6dc96a81ff5d65579474f59c2498c297485098cc387";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteResumeBundle";
    }

    public final String toString() {
        return "DeleteResumeBundleMutation(input=" + this.a + ")";
    }
}
