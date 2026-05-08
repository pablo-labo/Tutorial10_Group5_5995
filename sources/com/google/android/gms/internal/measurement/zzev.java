package com.google.android.gms.internal.measurement;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.duh;
import defpackage.fvh;
import defpackage.ka6;
import defpackage.l3i;
import defpackage.mzh;
import defpackage.qwh;
import defpackage.r8i;
import defpackage.t40;
import defpackage.w5i;
import defpackage.zth;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzev extends ka6 {
    public static final Logger e = Logger.getLogger(zzev.class.getName());
    public static final boolean f = r8i.f;
    public qwh d;

    public static class a extends zzev {
        public final byte[] g;
        public final int h;
        public int i;

        public a(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                t40.q("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
                throw null;
            }
            this.g = bArr;
            this.i = 0;
            this.h = i;
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void J1(byte b) throws zzb {
            try {
                byte[] bArr = this.g;
                int i = this.i;
                this.i = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void K1(int i) throws zzb {
            if (i >= 0) {
                U1(i);
            } else {
                S1(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void L1(int i, int i2) throws zzb {
            U1((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void M1(int i, long j) throws zzb {
            L1(i, 0);
            S1(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void N1(int i, String str) throws zzb {
            L1(i, 2);
            int i2 = this.i;
            try {
                int iJ2 = zzev.j2(str.length() * 3);
                int iJ22 = zzev.j2(str.length());
                byte[] bArr = this.g;
                if (iJ22 != iJ2) {
                    U1(com.google.android.gms.internal.measurement.a.a(str));
                    this.i = com.google.android.gms.internal.measurement.a.a.A1(str, bArr, this.i, l2());
                    return;
                }
                int i3 = i2 + iJ22;
                this.i = i3;
                int iA1 = com.google.android.gms.internal.measurement.a.a.A1(str, bArr, i3, l2());
                this.i = i2;
                U1((iA1 - i2) - iJ22);
                this.i = iA1;
            } catch (zzit e) {
                this.i = i2;
                zzev.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(mzh.a);
                try {
                    U1(bytes.length);
                    m2(bytes, 0, bytes.length);
                } catch (zzb e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new zzb(e3);
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void O1(int i, fvh fvhVar) throws zzb {
            L1(i, 2);
            U1(fvhVar.b());
            fvhVar.g(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void P1(int i, l3i l3iVar) throws zzb {
            L1(1, 3);
            Z1(2, i);
            L1(3, 2);
            U1(l3iVar.e());
            l3iVar.d(this);
            L1(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void Q1(int i, l3i l3iVar, w5i w5iVar) throws zzb {
            L1(i, 2);
            zth zthVar = (zth) l3iVar;
            int iH = zthVar.h();
            if (iH == -1) {
                iH = w5iVar.c(zthVar);
                zthVar.i(iH);
            }
            U1(iH);
            w5iVar.g(l3iVar, this.d);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void R1(int i, boolean z) throws zzb {
            L1(i, 0);
            J1(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void S1(long j) throws zzb {
            boolean z = zzev.f;
            byte[] bArr = this.g;
            if (!z || l2() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    int i = this.i;
                    if (j2 == 0) {
                        this.i = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            this.i = i + 1;
                            bArr[i] = (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
                        }
                    }
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                int i2 = this.i;
                if (j3 == 0) {
                    this.i = i2 + 1;
                    r8i.e(bArr, i2, (byte) j);
                    return;
                } else {
                    this.i = i2 + 1;
                    r8i.e(bArr, i2, (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void U1(int i) throws zzb {
            boolean z = zzev.f;
            byte[] bArr = this.g;
            if (!z || duh.a() || l2() < 5) {
                while (true) {
                    int i2 = i & (-128);
                    int i3 = this.i;
                    if (i2 == 0) {
                        this.i = i3 + 1;
                        bArr[i3] = (byte) i;
                        return;
                    } else {
                        try {
                            this.i = i3 + 1;
                            bArr[i3] = (byte) ((i & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            i >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
                        }
                    }
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
                }
            }
            int i4 = i & (-128);
            int i5 = this.i;
            if (i4 == 0) {
                this.i = i5 + 1;
                r8i.e(bArr, i5, (byte) i);
                return;
            }
            this.i = i5 + 1;
            r8i.e(bArr, i5, (byte) (i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            int i6 = i >>> 7;
            int i7 = i6 & (-128);
            int i8 = this.i;
            if (i7 == 0) {
                this.i = i8 + 1;
                r8i.e(bArr, i8, (byte) i6);
                return;
            }
            this.i = i8 + 1;
            r8i.e(bArr, i8, (byte) (i6 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            int i9 = i >>> 14;
            int i10 = i9 & (-128);
            int i11 = this.i;
            if (i10 == 0) {
                this.i = i11 + 1;
                r8i.e(bArr, i11, (byte) i9);
                return;
            }
            this.i = i11 + 1;
            r8i.e(bArr, i11, (byte) (i9 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            int i12 = i >>> 21;
            int i13 = i12 & (-128);
            int i14 = this.i;
            if (i13 == 0) {
                this.i = i14 + 1;
                r8i.e(bArr, i14, (byte) i12);
                return;
            }
            this.i = i14 + 1;
            r8i.e(bArr, i14, (byte) (i12 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            int i15 = this.i;
            this.i = i15 + 1;
            r8i.e(bArr, i15, (byte) (i >>> 28));
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void V1(int i, int i2) throws zzb {
            L1(i, 0);
            K1(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void W1(int i, fvh fvhVar) throws zzb {
            L1(1, 3);
            Z1(2, i);
            O1(3, fvhVar);
            L1(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void Z1(int i, int i2) throws zzb {
            L1(i, 0);
            U1(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void a2(int i, long j) throws zzb {
            L1(i, 1);
            b2(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void b2(long j) throws zzb {
            try {
                byte[] bArr = this.g;
                int i = this.i;
                int i2 = i + 1;
                this.i = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.i = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.i = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.i = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.i = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.i = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.i = i8;
                bArr[i7] = (byte) (j >> 48);
                this.i = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void c2(int i) throws zzb {
            try {
                byte[] bArr = this.g;
                int i2 = this.i;
                int i3 = i2 + 1;
                this.i = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.i = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.i = i5;
                bArr[i4] = (byte) (i >> 16);
                this.i = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzev
        public final void f2(int i, int i2) throws zzb {
            L1(i, 5);
            c2(i2);
        }

        public final int l2() {
            return this.h - this.i;
        }

        public final void m2(byte[] bArr, int i, int i2) throws zzb {
            try {
                System.arraycopy(bArr, i, this.g, this.i, i2);
                this.i += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(i2)), e);
            }
        }
    }

    public static int T1(String str) {
        int length;
        try {
            length = com.google.android.gms.internal.measurement.a.a(str);
        } catch (zzit unused) {
            length = str.getBytes(mzh.a).length;
        }
        return j2(length) + length;
    }

    public static int X1(int i, fvh fvhVar) {
        int iD2 = d2(i);
        int iB = fvhVar.b();
        return j2(iB) + iB + iD2;
    }

    @Deprecated
    public static int Y1(int i, l3i l3iVar, w5i w5iVar) {
        int iD2 = d2(i) << 1;
        zth zthVar = (zth) l3iVar;
        int iH = zthVar.h();
        if (iH == -1) {
            iH = w5iVar.c(zthVar);
            zthVar.i(iH);
        }
        return iD2 + iH;
    }

    public static int d2(int i) {
        return j2(i << 3);
    }

    public static int e2(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int g2(int i) {
        if (i >= 0) {
            return j2(i);
        }
        return 10;
    }

    public static int h2(int i) {
        return d2(i) + 8;
    }

    public static int i2(int i, int i2) {
        return j2(i2) + d2(i);
    }

    public static int j2(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int k2(int i) {
        return d2(i) + 4;
    }

    public abstract void J1(byte b);

    public abstract void K1(int i);

    public abstract void L1(int i, int i2);

    public abstract void M1(int i, long j);

    public abstract void N1(int i, String str);

    public abstract void O1(int i, fvh fvhVar);

    public abstract void P1(int i, l3i l3iVar);

    public abstract void Q1(int i, l3i l3iVar, w5i w5iVar);

    public abstract void R1(int i, boolean z);

    public abstract void S1(long j);

    public abstract void U1(int i);

    public abstract void V1(int i, int i2);

    public abstract void W1(int i, fvh fvhVar);

    public abstract void Z1(int i, int i2);

    public abstract void a2(int i, long j);

    public abstract void b2(long j);

    public abstract void c2(int i);

    public abstract void f2(int i, int i2);

    public static class zzb extends IOException {
        public zzb(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(str.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), indexOutOfBoundsException);
        }

        public zzb(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
