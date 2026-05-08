package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nz5 extends gr6 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public nz5(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nz5.class != obj.getClass()) {
            return false;
        }
        nz5 nz5Var = (nz5) obj;
        return Objects.equals(this.b, nz5Var.b) && this.c.equals(nz5Var.c) && this.d.equals(nz5Var.d) && Arrays.equals(this.e, nz5Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + akb.d(akb.d((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.gr6
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
