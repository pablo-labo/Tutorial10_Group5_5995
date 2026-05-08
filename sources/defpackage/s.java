package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends w {
    public final byte[] a;

    public s(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
    }

    @Override // defpackage.w
    public final boolean b(w wVar) {
        if (wVar instanceof s) {
            return st0.a(this.a, ((s) wVar).a);
        }
        return false;
    }

    @Override // defpackage.w
    public final void c(v vVar) throws IOException {
        vVar.g(2);
        byte[] bArr = this.a;
        vVar.h(bArr.length);
        ((ByteArrayOutputStream) vVar.a).write(bArr);
    }

    @Override // defpackage.w
    public final int d() {
        byte[] bArr = this.a;
        return oue.a(bArr.length) + 1 + bArr.length;
    }

    @Override // defpackage.w, defpackage.t
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    public final String toString() {
        return new BigInteger(this.a).toString();
    }

    public s(BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
    }
}
