package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mj3 {
    public final Function2<String, String, j6g> a;
    public final gu5<j6g> b;
    public final boolean c;
    public final String d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public mj3(Function2<? super String, ? super String, j6g> function2, gu5<j6g> gu5Var, boolean z, String str, String str2) {
        function2.getClass();
        gu5Var.getClass();
        this.a = function2;
        this.b = gu5Var;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj3)) {
            return false;
        }
        mj3 mj3Var = (mj3) obj;
        return wl7.b(this.a, mj3Var.a) && wl7.b(this.b, mj3Var.b) && this.c == mj3Var.c && wl7.b(this.d, mj3Var.d) && wl7.b(this.e, mj3Var.e);
    }

    public final int hashCode() {
        int iF = ia.f(w40.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeclineReasonDataState(onDeclineSubmit=");
        sb.append(this.a);
        sb.append(", onDismiss=");
        sb.append(this.b);
        sb.append(", isSubmissionInProgress=");
        k6.k(", inviteId=", this.d, ", jobKey=", sb, this.c);
        return l6.i(sb, this.e, ")");
    }
}
