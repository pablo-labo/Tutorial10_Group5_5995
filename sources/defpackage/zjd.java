package defpackage;

import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zjd {
    public final f88 a;

    public static final class a {
        public final List<InvitedJobDto> a;

        public a(List<InvitedJobDto> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return g7.h("Params(invitedJobs=", ")", this.a);
        }
    }

    public zjd(f88 f88Var) {
        this.a = f88Var;
    }
}
