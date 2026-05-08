package defpackage;

import android.os.Bundle;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class g86 implements oec {
    public final e9a a;
    public final String b;
    public final String c;
    public final String d;

    public g86(e9a e9aVar, String str, String str2, String str3) {
        str2.getClass();
        this.a = e9aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g86)) {
            return false;
        }
        g86 g86Var = (g86) obj;
        return this.a.equals(g86Var.a) && this.b.equals(g86Var.b) && wl7.b(this.c, g86Var.c) && wl7.b(this.d, g86Var.d);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // defpackage.oec
    public final Bundle toBundle() {
        return aq1.a(new Pair("nativeContext", this.a.toBundle()), new Pair("onCompleteCallbackId", this.b), new Pair("jobKey", this.c), new Pair("from", this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GhostwriterOnboardingRNProps(nativeContext=");
        sb.append(this.a);
        sb.append(", onCompleteCallbackId=");
        sb.append(this.b);
        sb.append(", jobKey=");
        return z3.n(sb, this.c, ", from=", this.d, ")");
    }
}
