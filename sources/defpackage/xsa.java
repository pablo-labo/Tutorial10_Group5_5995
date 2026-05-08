package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class xsa {
    public final String a;
    public final hva.c b;

    public xsa(hva.c cVar, String str) {
        zsa zsaVar = zsa.JOBSEEKER;
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsa)) {
            return false;
        }
        xsa xsaVar = (xsa) obj;
        zsa zsaVar = zsa.JOBSEEKER;
        return this.a.equals(xsaVar.a) && this.b.equals(xsaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + akb.d(zsa.EMPLOYER.hashCode() * 31, 31, this.a);
    }

    public final String toString() {
        return "OnlineStatusAccountInput(accountType=" + zsa.EMPLOYER + ", accountKey=" + this.a + ", advertiserKey=" + this.b + ")";
    }
}
