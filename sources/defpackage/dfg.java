package defpackage;

import com.indeed.android.myjobs.data.model.UpdateJobsStatusUsecase;
import defpackage.ude;

/* JADX INFO: loaded from: classes3.dex */
public final class dfg {
    public final i88 a;
    public final f88 b;

    public static final class a {
        public final UpdateJobsStatusUsecase a;
        public final String b;
        public final String c;
        public final ude.a d;

        public a(UpdateJobsStatusUsecase updateJobsStatusUsecase, String str, String str2, ude.a aVar) {
            str.getClass();
            this.a = updateJobsStatusUsecase;
            this.b = str;
            this.c = str2;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b) && this.c.equals(aVar.c) && wl7.b(this.d, aVar.d);
        }

        public final int hashCode() {
            int iD = akb.d(akb.d(((this.a.hashCode() * 31) + 1204948910) * 31, 31, this.b), 31, this.c);
            ude.a aVar = this.d;
            return iD + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "Params(body=" + this.a + ", from=app-tracker-webapp, jobKey=" + this.b + ", tk=" + this.c + ", moveOperation=" + this.d + ")";
        }
    }

    public dfg(f88 f88Var, i88 i88Var) {
        this.a = i88Var;
        this.b = f88Var;
    }
}
