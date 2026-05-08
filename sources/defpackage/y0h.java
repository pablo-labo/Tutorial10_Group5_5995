package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;

/* JADX INFO: loaded from: classes3.dex */
public final class y0h {
    public final i88 a;
    public final f88 b;

    public static final class a {
        public final SavedJobsDto a;
        public final String b;

        public a(SavedJobsDto savedJobsDto, String str) {
            savedJobsDto.getClass();
            this.a = savedJobsDto;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1204948910;
        }

        public final String toString() {
            return "Params(savedJobsDto=" + this.a + ", tk=" + this.b + ", from=app-tracker-webapp)";
        }
    }

    public y0h(f88 f88Var, i88 i88Var) {
        this.a = i88Var;
        this.b = f88Var;
    }
}
