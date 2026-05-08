package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class mkd {
    public final String a;
    public final long b;
    public final boolean c;
    public final c78 d;
    public final b78 e;
    public final boolean f;

    public mkd(String str, long j, boolean z, c78 c78Var, b78 b78Var, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = c78Var;
        this.e = b78Var;
        this.f = z2;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("jobKey", this.a);
        bundle.putLong("applyTime", this.b);
        bundle.putBoolean("jobExpired", this.c);
        bundle.putBoolean("withdrawn", this.f);
        Bundle bundle2 = new Bundle();
        c78 c78Var = this.d;
        b78 b78Var = c78Var.a;
        if (b78Var != null) {
            bundle2.putBundle("candidateStatus", b78Var.a());
        }
        b78 b78Var2 = c78Var.b;
        if (b78Var2 != null) {
            bundle2.putBundle("selfReportedStatus", b78Var2.a());
        }
        b78 b78Var3 = c78Var.c;
        if (b78Var3 != null) {
            bundle2.putBundle("userJobStatus", b78Var3.a());
        }
        bundle.putBundle("statuses", bundle2);
        bundle.putBundle("applicationStatus", this.e.a());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkd)) {
            return false;
        }
        mkd mkdVar = (mkd) obj;
        return wl7.b(this.a, mkdVar.a) && this.b == mkdVar.b && this.c == mkdVar.c && this.d.equals(mkdVar.d) && this.e.equals(mkdVar.e) && this.f == mkdVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ia.f(ia.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "SavedJob(jobKey=" + this.a + ", applyTime=" + this.b + ", jobExpired=" + this.c + ", statuses=" + this.d + ", applicationStatus=" + this.e + ", withdrawn=" + this.f + ")";
    }
}
