package defpackage;

import com.indeed.android.jobsearch.R;
import defpackage.ude;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ggg {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ude.a f;
    public final Function1<ude.a, j6g> g;
    public final gu5<j6g> h;
    public final gu5<j6g> i;
    public final gu5<j6g> j;

    public /* synthetic */ ggg(boolean z, int i, int i2, ude.a aVar, int i3) {
        this(z, (i3 & 2) != 0 ? R.string.any_updates_since_you_applied : i, (i3 & 4) != 0 ? R.string.i_m_interviewing : i2, R.string.i_have_another_update, R.string.i_did_nt_apply, (i3 & 32) != 0 ? null : aVar, new dc(24), new oz0(17), new zr0(14), new as0(16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggg)) {
            return false;
        }
        ggg gggVar = (ggg) obj;
        return this.a == gggVar.a && this.b == gggVar.b && this.c == gggVar.c && this.d == gggVar.d && this.e == gggVar.e && wl7.b(this.f, gggVar.f) && wl7.b(this.g, gggVar.g) && wl7.b(this.h, gggVar.h) && wl7.b(this.i, gggVar.i) && wl7.b(this.j, gggVar.j);
    }

    public final int hashCode() {
        int iC = w40.c(this.e, w40.c(this.d, w40.c(this.c, w40.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31);
        ude.a aVar = this.f;
        return this.j.hashCode() + w40.d(w40.d((this.g.hashCode() + ((iC + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateStatusSuggestionBubbleData(shouldShowSuggestionBubble=");
        sb.append(this.a);
        sb.append(", titleText=");
        sb.append(this.b);
        sb.append(", primaryCtaText=");
        uz.i(sb, this.c, ", secondaryCtaText=", this.d, ", footerCtaText=");
        sb.append(this.e);
        sb.append(", moveJobOperations=");
        sb.append(this.f);
        sb.append(", onPrimaryCtaClick=");
        sb.append(this.g);
        sb.append(", onPromptClose=");
        sb.append(this.h);
        sb.append(", onSecondaryCtaClick=");
        sb.append(this.i);
        sb.append(", onFooterCtaClick=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ggg(boolean z, int i, int i2, int i3, int i4, ude.a aVar, Function1<? super ude.a, j6g> function1, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, gu5<j6g> gu5Var3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = aVar;
        this.g = function1;
        this.h = gu5Var;
        this.i = gu5Var2;
        this.j = gu5Var3;
    }
}
