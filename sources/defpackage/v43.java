package defpackage;

import com.indeed.android.myjobs.data.model.CancelOrRescheduleUrlParams;

/* JADX INFO: loaded from: classes3.dex */
public final class v43 {
    public final d88 a;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return l5.m("InterviewLinkResult(url=", this.a, ")");
        }
    }

    public static final class b {
        public final CancelOrRescheduleUrlParams a;

        public b(CancelOrRescheduleUrlParams cancelOrRescheduleUrlParams) {
            this.a = cancelOrRescheduleUrlParams;
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
            return "Params(input=" + this.a + ")";
        }
    }

    public v43(d88 d88Var) {
        this.a = d88Var;
    }
}
