package defpackage;

import defpackage.oj9;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 extends gr6 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public yg0(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // js9.a
    public final void b(oj9.a aVar) {
        aVar.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yg0.class != obj.getClass()) {
            return false;
        }
        yg0 yg0Var = (yg0) obj;
        return this.d == yg0Var.d && this.b.equals(yg0Var.b) && Objects.equals(this.c, yg0Var.c) && Arrays.equals(this.e, yg0Var.e);
    }

    public final int hashCode() {
        int iD = akb.d((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.gr6
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
