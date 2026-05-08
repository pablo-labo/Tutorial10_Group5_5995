package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hn3 implements n55 {
    public final te3 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        jj9.a("media3.extractor");
    }

    public hn3(te3 te3Var, long j, long j2) {
        this.b = te3Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.n55
    public final boolean c(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        r(iMin);
        int iQ = iMin;
        while (iQ < i && iQ != -1) {
            byte[] bArr = this.a;
            iQ = q(bArr, -iQ, Math.min(i, bArr.length + iQ), iQ, z);
        }
        if (iQ != -1) {
            this.d += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.n55
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!o(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.n55
    public final void f() {
        this.f = 0;
    }

    @Override // defpackage.n55
    public final boolean g(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            r(iMin);
        }
        int iQ = iMin;
        while (iQ < i2 && iQ != -1) {
            iQ = q(bArr, i, i2, iQ, z);
        }
        if (iQ != -1) {
            this.d += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.n55
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.n55
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.n55
    public final void h(int i, byte[] bArr, int i2) {
        d(bArr, i, i2, false);
    }

    @Override // defpackage.n55
    public final long j() {
        return this.d + ((long) this.f);
    }

    @Override // defpackage.n55
    public final void k(int i) throws EOFException, InterruptedIOException {
        o(i, false);
    }

    @Override // defpackage.n55
    public final int l(int i, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        hn3 hn3Var;
        int iMin;
        p(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            hn3Var = this;
            iMin = hn3Var.q(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hn3Var.g += iMin;
        } else {
            hn3Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(hn3Var.e, hn3Var.f, bArr, i, iMin);
        hn3Var.f += iMin;
        return iMin;
    }

    @Override // defpackage.n55
    public final int m(int i) throws EOFException, InterruptedIOException {
        hn3 hn3Var;
        int iMin = Math.min(this.g, i);
        r(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            hn3Var = this;
            iMin = hn3Var.q(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            hn3Var = this;
        }
        if (iMin != -1) {
            hn3Var.d += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.n55
    public final void n(int i) throws EOFException, InterruptedIOException {
        c(i, false);
    }

    public final boolean o(int i, boolean z) throws EOFException, InterruptedIOException {
        p(i);
        int iQ = this.g - this.f;
        while (iQ < i) {
            hn3 hn3Var = this;
            int i2 = i;
            boolean z2 = z;
            iQ = hn3Var.q(this.e, this.f, i2, iQ, z2);
            if (iQ == -1) {
                return false;
            }
            hn3Var.g = hn3Var.f + iQ;
            this = hn3Var;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void p(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, vjg.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int q(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        k20.n();
        return 0;
    }

    public final void r(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        hn3 hn3Var;
        int i3 = this.g;
        int iQ = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            r(iMin);
            iQ = iMin;
        }
        if (iQ == 0) {
            hn3Var = this;
            iQ = hn3Var.q(bArr, i, i2, 0, true);
        } else {
            hn3Var = this;
        }
        if (iQ != -1) {
            hn3Var.d += (long) iQ;
        }
        return iQ;
    }

    @Override // defpackage.n55
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        g(bArr, i, i2, false);
    }
}
