package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class w11 extends d43 {
    public final v11 a;
    public final String b;
    public final File c;

    public w11(v11 v11Var, String str, File file) {
        this.a = v11Var;
        if (str == null) {
            ja.k("Null sessionId");
            throw null;
        }
        this.b = str;
        if (file != null) {
            this.c = file;
        } else {
            ja.k("Null reportFile");
            throw null;
        }
    }

    @Override // defpackage.d43
    public final v33 a() {
        return this.a;
    }

    @Override // defpackage.d43
    public final File b() {
        return this.c;
    }

    @Override // defpackage.d43
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d43)) {
            return false;
        }
        d43 d43Var = (d43) obj;
        return this.a.equals(d43Var.a()) && this.b.equals(d43Var.c()) && this.c.equals(d43Var.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
