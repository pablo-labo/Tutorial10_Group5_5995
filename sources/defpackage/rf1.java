package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rf1 extends gr6 {
    public final byte[] b;

    public rf1(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rf1.class != obj.getClass()) {
            return false;
        }
        rf1 rf1Var = (rf1) obj;
        return this.a.equals(rf1Var.a) && Arrays.equals(this.b, rf1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + akb.d(527, 31, this.a);
    }
}
