package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class wth implements Closeable {
    public final InputStream a;
    public tth b;
    public final byte[] c = new byte[8];
    public final qq2 d = new qq2(9);

    public wth(InputStream inputStream) {
        this.a = inputStream;
    }

    public final long G() throws IOException {
        tth tthVar = this.b;
        byte b = tthVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int i = this.a.read();
            if (i != -1) {
                this.b = null;
                return ((long) i) & 255;
            }
            k20.n();
            return 0L;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            Q(2, bArr);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b == 26) {
            Q(4, bArr);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b != 27) {
            r40.h(k20.l("invalid additional information ", b, (tthVar.a >> 5) & 7, " for major type "));
            return 0L;
        }
        Q(8, bArr);
        return (((long) bArr[7]) & 255) | ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void N() {
        s();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        r6.g(p6.c(b, "expected definite length but found "));
    }

    public final void P(byte b) {
        s();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        r6.g(k20.l("expected major type ", (b >> 5) & 7, (b2 >> 5) & 7, " but found "));
    }

    public final void Q(int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.a.read(bArr, i2, i - i2);
            if (i3 == -1) {
                k20.n();
                return;
            }
            i2 += i3;
        }
        this.b = null;
    }

    public final byte[] W() {
        N();
        long jG = G();
        if (jG < 0 || jG > 2147483647L) {
            b0.u("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.a.available() < jG) {
            k20.n();
            return null;
        }
        int i = (int) jG;
        byte[] bArr = new byte[i];
        Q(i, bArr);
        return bArr;
    }

    public final long a() {
        P((byte) -128);
        N();
        long jG = G();
        if (jG < 0) {
            b0.u("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (jG > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(jG));
        }
        return jG;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        this.d.f();
    }

    public final long h() {
        boolean z;
        s();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                r6.g(p6.c((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long jG = G();
        if (jG >= 0) {
            return z ? jG : ~jG;
        }
        b0.u("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long p() {
        P((byte) -96);
        N();
        long jG = G();
        if (jG < 0 || jG > 4611686018427387903L) {
            b0.u("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (jG > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(jG + jG));
        }
        return jG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.tth s() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wth.s():tth");
    }

    public final boolean v() {
        P((byte) -32);
        if (this.b.b > 24) {
            r6.g("expected simple value");
            return false;
        }
        int iG = (int) G();
        if (iG == 20) {
            return false;
        }
        if (iG == 21) {
            return true;
        }
        r6.g("expected FALSE or TRUE");
        return false;
    }
}
