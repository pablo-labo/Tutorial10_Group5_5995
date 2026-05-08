package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ls4 {
    public final int a;
    public final int b;
    public final boolean c;
    public final gu5<j6g> d;

    public ls4(int i, int i2, gu5 gu5Var, boolean z) {
        gu5Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = gu5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls4)) {
            return false;
        }
        ls4 ls4Var = (ls4) obj;
        return this.a == ls4Var.a && this.b == ls4Var.b && this.c == ls4Var.c && wl7.b(this.d, ls4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + w40.c(R.string.messaging_empty_state_cta_findjobs, ia.f(w40.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbF = uz.f("EmptyStateConfig(illustrationId=", this.a, ", textId=", this.b, ", showCtaButton=");
        sbF.append(this.c);
        sbF.append(", ctaButtonTextId=2131952610, onClickCtaButton=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
