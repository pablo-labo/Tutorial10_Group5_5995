package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ou3 implements p4a<a> {
    public final mu3 a;

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
            return "Data(deleteJobSeekerProfileResumeAwards=" + this.a + ")";
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
            return m6.g("DeleteJobSeekerProfileResumeAwards(awardIds=", ")", this.a);
        }
    }

    public ou3(mu3 mu3Var) {
        this.a = mu3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        qu3 qu3Var = qu3.a;
        ha.g gVar = ha.a;
        return new ena(qu3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumeAwards($input: DeleteJobSeekerProfileResumeAwardsInput!) { deleteJobSeekerProfileResumeAwards(input: $input) { awardIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = pu3.b;
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
        nu3.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou3) && this.a.equals(((ou3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "bfbbdf6af6587305df85a31cda3dc9fe4269937206b41cbb06f7e18d1115ac15";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumeAwards";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumeAwardsMutation(input=" + this.a + ")";
    }
}
