package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class lc3 extends tc3 {
    public final long b;
    public final long c;
    public String d = null;
    public String e;

    public lc3(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.tc3
    public final String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[32];
        hh1.w(this.b, bArr, 0, 16);
        hh1.w(this.c, bArr, 16, 16);
        String str2 = new String(bArr, StandardCharsets.US_ASCII);
        this.d = str2;
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3)) {
            return false;
        }
        lc3 lc3Var = (lc3) obj;
        return this.b == lc3Var.b && this.c == lc3Var.c;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        return (int) ((j2 ^ j3) ^ (j3 >>> 32));
    }

    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.c);
        this.e = unsignedString;
        return unsignedString;
    }
}
