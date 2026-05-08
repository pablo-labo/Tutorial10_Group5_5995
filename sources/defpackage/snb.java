package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class snb extends gr6 {
    public final String b;
    public final byte[] c;

    public snb(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || snb.class != obj.getClass()) {
            return false;
        }
        snb snbVar = (snb) obj;
        return this.b.equals(snbVar.b) && Arrays.equals(this.c, snbVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + akb.d(527, 31, this.b);
    }

    @Override // defpackage.gr6
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
