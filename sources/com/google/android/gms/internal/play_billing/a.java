package com.google.android.gms.internal.play_billing;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ezh;
import defpackage.f2i;
import defpackage.i3i;
import defpackage.ivh;
import defpackage.k20;
import defpackage.l5;
import defpackage.pth;
import defpackage.t5i;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    public final byte[] d;
    public final int e;
    public int f;

    public a(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            l5.q(k20.l("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void d(byte b) throws zzen {
        int i;
        int i2 = this.f;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.d[i2] = b;
            this.f = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new zzen(i2, this.e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void e(int i, boolean z) throws zzen {
        s(i << 3);
        d(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void f(int i, ivh ivhVar) throws zzen {
        s((i << 3) | 2);
        s(ivhVar.c());
        ivhVar.f(this);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void g(int i, int i2) throws zzen {
        s((i << 3) | 5);
        h(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void h(int i) throws zzen {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(i2, this.e, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void i(int i, long j) throws zzen {
        s((i << 3) | 1);
        j(j);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void j(long j) throws zzen {
        int i = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(i, this.e, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void k(int i, int i2) throws zzen {
        s(i << 3);
        l(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void l(int i) throws zzen {
        if (i >= 0) {
            s(i);
        } else {
            u(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void m(int i, f2i f2iVar, i3i i3iVar) throws zzen {
        s((i << 3) | 2);
        s(((pth) f2iVar).a(i3iVar));
        i3iVar.a(f2iVar, this.a);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void n(int i, f2i f2iVar) throws zzen {
        s(11);
        r(2, i);
        s(26);
        s(f2iVar.zzj());
        f2iVar.d(this);
        s(12);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void o(int i, ivh ivhVar) throws zzen {
        s(11);
        r(2, i);
        f(3, ivhVar);
        s(12);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void p(int i, String str) throws zzen {
        s((i << 3) | 2);
        int i2 = this.f;
        try {
            int iB = b.b(str.length() * 3);
            int iB2 = b.b(str.length());
            int i3 = this.e;
            byte[] bArr = this.d;
            if (iB2 != iB) {
                s(c.b(str));
                int i4 = this.f;
                this.f = c.a(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + iB2;
                this.f = i5;
                int iA = c.a(str, bArr, i5, i3 - i5);
                this.f = i2;
                s((iA - i2) - iB2);
                this.f = iA;
            }
        } catch (zzhq e) {
            this.f = i2;
            b.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(ezh.a);
            try {
                int length = bytes.length;
                s(length);
                v(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzen(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzen(e3);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void q(int i, int i2) throws zzen {
        s((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void r(int i, int i2) throws zzen {
        s(i << 3);
        s(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void s(int i) throws zzen {
        int i2;
        int i3 = this.f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzen(i2, this.e, 1, e);
                }
            }
            throw new zzen(i2, this.e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void t(int i, long j) throws zzen {
        s(i << 3);
        u(j);
    }

    @Override // com.google.android.gms.internal.play_billing.b
    public final void u(long j) throws zzen {
        int i;
        int i2 = this.f;
        boolean z = b.c;
        byte[] bArr = this.d;
        int i3 = this.e;
        if (!z || i3 - i2 < 10) {
            int i4 = i2;
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i5 = i4 + 1;
                try {
                    bArr[i4] = (byte) (((int) j2) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    j2 >>>= 7;
                    i4 = i5;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i5;
                    throw new zzen(i, i3, 1, e);
                }
            }
            i = i4 + 1;
            try {
                bArr[i4] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzen(i, i3, 1, e);
            }
        } else {
            int i6 = i2;
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                t5i.c.h(bArr, t5i.f + i6, (byte) (((int) j3) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j3 >>>= 7;
                i6++;
            }
            i = i6 + 1;
            t5i.c.h(bArr, t5i.f + ((long) i6), (byte) j3);
        }
        this.f = i;
    }

    public final void v(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i);
            this.f += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(this.f, this.e, i, e);
        }
    }
}
