package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qc9 implements p4a<a> {
    public final pc9 a;

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
            return "Data(markAutoMergeReviewed=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final ArrayList b;

        public b(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
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
            return "MarkAutoMergeReviewed(resumeId=" + this.a + ", tags=" + this.b + ")";
        }
    }

    public qc9(pc9 pc9Var) {
        this.a = pc9Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        sc9 sc9Var = sc9.a;
        ha.g gVar = ha.a;
        return new ena(sc9Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation MarkAutoMergeReviewed($input: MarkAutoMergeReviewedInput!) { markAutoMergeReviewed(input: $input) { resumeId tags } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = rc9.b;
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
        return (obj instanceof qc9) && this.a.equals(((qc9) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "3f4f05fa336e659b70fec7590a6f0e1f7521f906dbbb039a05786ef2aede0149";
    }

    @Override // defpackage.pua
    public final String name() {
        return "MarkAutoMergeReviewed";
    }

    public final String toString() {
        return "MarkAutoMergeReviewedMutation(input=" + this.a + ")";
    }
}
