package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.f40;
import defpackage.f7g;
import defpackage.ka6;
import defpackage.kn8;
import defpackage.l5;
import defpackage.sp9;
import defpackage.t40;
import defpackage.tr1;
import defpackage.uod;
import defpackage.yge;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends ka6 {
    public static final Logger e = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean f = f7g.f;
    public g d;

    public static abstract class a extends CodedOutputStream {
        public final byte[] g;
        public final int h;
        public int i;

        public a(int i) {
            if (i < 0) {
                l5.q("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.g = bArr;
            this.h = bArr.length;
        }

        public final void s2(int i) {
            int i2 = this.i;
            int i3 = i2 + 1;
            this.i = i3;
            byte[] bArr = this.g;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.i = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.i = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.i = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void t2(long j) {
            int i = this.i;
            int i2 = i + 1;
            this.i = i2;
            byte[] bArr = this.g;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.i = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.i = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.i = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.i = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.i = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.i = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.i = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void u2(int i, int i2) {
            v2((i << 3) | i2);
        }

        public final void v2(int i) {
            boolean z = CodedOutputStream.f;
            byte[] bArr = this.g;
            if (z) {
                while (true) {
                    int i2 = i & (-128);
                    int i3 = this.i;
                    if (i2 == 0) {
                        this.i = i3 + 1;
                        f7g.j(bArr, i3, (byte) i);
                        return;
                    } else {
                        this.i = i3 + 1;
                        f7g.j(bArr, i3, (byte) ((i & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                        i >>>= 7;
                    }
                }
            } else {
                while (true) {
                    int i4 = i & (-128);
                    int i5 = this.i;
                    if (i4 == 0) {
                        this.i = i5 + 1;
                        bArr[i5] = (byte) i;
                        return;
                    } else {
                        this.i = i5 + 1;
                        bArr[i5] = (byte) ((i & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        i >>>= 7;
                    }
                }
            }
        }

        public final void w2(long j) {
            boolean z = CodedOutputStream.f;
            byte[] bArr = this.g;
            if (z) {
                while (true) {
                    long j2 = j & (-128);
                    int i = this.i;
                    if (j2 == 0) {
                        this.i = i + 1;
                        f7g.j(bArr, i, (byte) j);
                        return;
                    } else {
                        this.i = i + 1;
                        f7g.j(bArr, i, (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                        j >>>= 7;
                    }
                }
            } else {
                while (true) {
                    long j3 = j & (-128);
                    int i2 = this.i;
                    if (j3 == 0) {
                        this.i = i2 + 1;
                        bArr[i2] = (byte) j;
                        return;
                    } else {
                        this.i = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        j >>>= 7;
                    }
                }
            }
        }
    }

    public static class b extends CodedOutputStream {
        public final byte[] g;
        public final int h;
        public int i;

        public b(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                t40.q("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
                throw null;
            }
            this.g = bArr;
            this.i = 0;
            this.h = i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W1(byte b) throws OutOfSpaceException {
            try {
                byte[] bArr = this.g;
                int i = this.i;
                this.i = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X1(int i, boolean z) throws OutOfSpaceException {
            n2(i, 0);
            W1(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y1(int i, byte[] bArr) throws OutOfSpaceException {
            p2(i);
            s2(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z1(int i, tr1 tr1Var) throws OutOfSpaceException {
            n2(i, 2);
            a2(tr1Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void a2(tr1 tr1Var) throws OutOfSpaceException {
            p2(tr1Var.size());
            tr1Var.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b2(int i, int i2) throws OutOfSpaceException {
            n2(i, 5);
            c2(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c2(int i) throws OutOfSpaceException {
            try {
                byte[] bArr = this.g;
                int i2 = this.i;
                int i3 = i2 + 1;
                this.i = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.i = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.i = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.i = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void d2(int i, long j) throws OutOfSpaceException {
            n2(i, 1);
            e2(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void e2(long j) throws OutOfSpaceException {
            try {
                byte[] bArr = this.g;
                int i = this.i;
                int i2 = i + 1;
                this.i = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.i = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.i = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.i = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.i = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.i = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.i = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.i = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f2(int i, int i2) throws OutOfSpaceException {
            n2(i, 0);
            g2(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g2(int i) throws OutOfSpaceException {
            if (i >= 0) {
                p2(i);
            } else {
                r2(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void h2(int i, sp9 sp9Var, uod uodVar) throws OutOfSpaceException {
            n2(i, 2);
            p2(((androidx.datastore.preferences.protobuf.a) sp9Var).b(uodVar));
            uodVar.h(sp9Var, this.d);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i2(sp9 sp9Var) throws OutOfSpaceException {
            p2(sp9Var.e());
            sp9Var.g(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j2(int i, sp9 sp9Var) throws OutOfSpaceException {
            n2(1, 3);
            o2(2, i);
            n2(3, 2);
            i2(sp9Var);
            n2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k2(int i, tr1 tr1Var) throws OutOfSpaceException {
            n2(1, 3);
            o2(2, i);
            Z1(3, tr1Var);
            n2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l2(int i, String str) throws OutOfSpaceException {
            n2(i, 2);
            m2(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m2(String str) throws OutOfSpaceException {
            int i = this.i;
            try {
                int iT1 = CodedOutputStream.T1(str.length() * 3);
                int iT12 = CodedOutputStream.T1(str.length());
                int i2 = this.h;
                byte[] bArr = this.g;
                if (iT12 != iT1) {
                    p2(Utf8.b(str));
                    int i3 = this.i;
                    this.i = Utf8.a.b(str, bArr, i3, i2 - i3);
                    return;
                }
                int i4 = i + iT12;
                this.i = i4;
                int iB = Utf8.a.b(str, bArr, i4, i2 - i4);
                this.i = i;
                p2((iB - i) - iT12);
                this.i = iB;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.i = i;
                V1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n2(int i, int i2) throws OutOfSpaceException {
            p2((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o2(int i, int i2) throws OutOfSpaceException {
            n2(i, 0);
            p2(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p2(int i) throws OutOfSpaceException {
            boolean z = CodedOutputStream.f;
            int i2 = this.h;
            byte[] bArr = this.g;
            if (z && !f40.a()) {
                int i3 = this.i;
                if (i2 - i3 >= 5) {
                    if ((i & (-128)) == 0) {
                        this.i = i3 + 1;
                        f7g.j(bArr, i3, (byte) i);
                        return;
                    }
                    this.i = i3 + 1;
                    f7g.j(bArr, i3, (byte) (i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    int i4 = i >>> 7;
                    int i5 = i4 & (-128);
                    int i6 = this.i;
                    if (i5 == 0) {
                        this.i = i6 + 1;
                        f7g.j(bArr, i6, (byte) i4);
                        return;
                    }
                    this.i = i6 + 1;
                    f7g.j(bArr, i6, (byte) (i4 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    int i7 = i >>> 14;
                    int i8 = i7 & (-128);
                    int i9 = this.i;
                    if (i8 == 0) {
                        this.i = i9 + 1;
                        f7g.j(bArr, i9, (byte) i7);
                        return;
                    }
                    this.i = i9 + 1;
                    f7g.j(bArr, i9, (byte) (i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    int i10 = i >>> 21;
                    int i11 = i10 & (-128);
                    int i12 = this.i;
                    if (i11 == 0) {
                        this.i = i12 + 1;
                        f7g.j(bArr, i12, (byte) i10);
                        return;
                    }
                    this.i = i12 + 1;
                    f7g.j(bArr, i12, (byte) (i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    int i13 = this.i;
                    this.i = i13 + 1;
                    f7g.j(bArr, i13, (byte) (i >>> 28));
                    return;
                }
            }
            while (true) {
                int i14 = i & (-128);
                int i15 = this.i;
                if (i14 == 0) {
                    this.i = i15 + 1;
                    bArr[i15] = (byte) i;
                    return;
                } else {
                    try {
                        this.i = i15 + 1;
                        bArr[i15] = (byte) ((i & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(i2), 1), e);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(i2), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q2(int i, long j) throws OutOfSpaceException {
            n2(i, 0);
            r2(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r2(long j) throws OutOfSpaceException {
            boolean z = CodedOutputStream.f;
            int i = this.h;
            byte[] bArr = this.g;
            if (!z || i - this.i < 10) {
                while (true) {
                    long j2 = j & (-128);
                    int i2 = this.i;
                    if (j2 == 0) {
                        this.i = i2 + 1;
                        bArr[i2] = (byte) j;
                        return;
                    } else {
                        try {
                            this.i = i2 + 1;
                            bArr[i2] = (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(i), 1), e);
                        }
                    }
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(i), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                int i3 = this.i;
                if (j3 == 0) {
                    this.i = i3 + 1;
                    f7g.j(bArr, i3, (byte) j);
                    return;
                } else {
                    this.i = i3 + 1;
                    f7g.j(bArr, i3, (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j >>>= 7;
                }
            }
        }

        public final void s2(byte[] bArr, int i, int i2) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i, this.g, this.i, i2);
                this.i += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(i2)), e);
            }
        }

        @Override // defpackage.ka6
        public final void y1(int i, byte[] bArr, int i2) throws OutOfSpaceException {
            s2(bArr, i, i2);
        }
    }

    public static final class c extends a {
        public final yge.b j;

        public c(yge.b bVar, int i) {
            super(i);
            this.j = bVar;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W1(byte b) {
            if (this.i == this.h) {
                x2();
            }
            int i = this.i;
            this.i = i + 1;
            this.g[i] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X1(int i, boolean z) {
            y2(11);
            u2(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.i;
            this.i = i2 + 1;
            this.g[i2] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y1(int i, byte[] bArr) {
            p2(i);
            z2(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z1(int i, tr1 tr1Var) {
            n2(i, 2);
            a2(tr1Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void a2(tr1 tr1Var) {
            p2(tr1Var.size());
            tr1Var.i(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void b2(int i, int i2) {
            y2(14);
            u2(i, 5);
            s2(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c2(int i) {
            y2(4);
            s2(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void d2(int i, long j) {
            y2(18);
            u2(i, 1);
            t2(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void e2(long j) {
            y2(8);
            t2(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void f2(int i, int i2) {
            y2(20);
            u2(i, 0);
            if (i2 >= 0) {
                v2(i2);
            } else {
                w2(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void g2(int i) {
            if (i >= 0) {
                p2(i);
            } else {
                r2(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void h2(int i, sp9 sp9Var, uod uodVar) {
            n2(i, 2);
            p2(((androidx.datastore.preferences.protobuf.a) sp9Var).b(uodVar));
            uodVar.h(sp9Var, this.d);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i2(sp9 sp9Var) {
            p2(sp9Var.e());
            sp9Var.g(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j2(int i, sp9 sp9Var) {
            n2(1, 3);
            o2(2, i);
            n2(3, 2);
            i2(sp9Var);
            n2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k2(int i, tr1 tr1Var) {
            n2(1, 3);
            o2(2, i);
            Z1(3, tr1Var);
            n2(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void l2(int i, String str) throws OutOfSpaceException {
            n2(i, 2);
            m2(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m2(String str) throws OutOfSpaceException {
            try {
                int length = str.length() * 3;
                int iT1 = CodedOutputStream.T1(length);
                int i = iT1 + length;
                int i2 = this.h;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iB = Utf8.a.b(str, bArr, 0, length);
                    p2(iB);
                    z2(bArr, 0, iB);
                    return;
                }
                if (i > i2 - this.i) {
                    x2();
                }
                int iT12 = CodedOutputStream.T1(str.length());
                int i3 = this.i;
                byte[] bArr2 = this.g;
                try {
                    try {
                        if (iT12 == iT1) {
                            int i4 = i3 + iT12;
                            this.i = i4;
                            int iB2 = Utf8.a.b(str, bArr2, i4, i2 - i4);
                            this.i = i3;
                            v2((iB2 - i3) - iT12);
                            this.i = iB2;
                        } else {
                            int iB3 = Utf8.b(str);
                            v2(iB3);
                            this.i = Utf8.a.b(str, bArr2, this.i, iB3);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(e);
                    }
                } catch (Utf8.UnpairedSurrogateException e2) {
                    this.i = i3;
                    throw e2;
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                V1(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n2(int i, int i2) {
            p2((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o2(int i, int i2) {
            y2(20);
            u2(i, 0);
            v2(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p2(int i) {
            y2(5);
            v2(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void q2(int i, long j) {
            y2(20);
            u2(i, 0);
            w2(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r2(long j) {
            y2(10);
            w2(j);
        }

        public final void x2() {
            this.j.write(this.g, 0, this.i);
            this.i = 0;
        }

        @Override // defpackage.ka6
        public final void y1(int i, byte[] bArr, int i2) {
            z2(bArr, i, i2);
        }

        public final void y2(int i) {
            if (this.h - this.i < i) {
                x2();
            }
        }

        public final void z2(byte[] bArr, int i, int i2) {
            int i3 = this.i;
            int i4 = this.h;
            int i5 = i4 - i3;
            byte[] bArr2 = this.g;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.i += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.i = i4;
            x2();
            if (i7 > i4) {
                this.j.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.i = i7;
            }
        }
    }

    public static int J1(int i, tr1 tr1Var) {
        return K1(tr1Var) + R1(i);
    }

    public static int K1(tr1 tr1Var) {
        int size = tr1Var.size();
        return T1(size) + size;
    }

    public static int L1(int i) {
        return R1(i) + 4;
    }

    public static int M1(int i) {
        return R1(i) + 8;
    }

    @Deprecated
    public static int N1(int i, sp9 sp9Var, uod uodVar) {
        return ((androidx.datastore.preferences.protobuf.a) sp9Var).b(uodVar) + (R1(i) * 2);
    }

    public static int O1(int i) {
        if (i >= 0) {
            return T1(i);
        }
        return 10;
    }

    public static int P1(kn8 kn8Var) {
        int size = kn8Var.b != null ? kn8Var.b.size() : kn8Var.a != null ? kn8Var.a.e() : 0;
        return T1(size) + size;
    }

    public static int Q1(String str) {
        int length;
        try {
            length = Utf8.b(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(p.a).length;
        }
        return T1(length) + length;
    }

    public static int R1(int i) {
        return T1(i << 3);
    }

    public static int S1(int i, int i2) {
        return T1(i2) + R1(i);
    }

    public static int T1(int i) {
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

    public static int U1(long j) {
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

    public final void V1(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(p.a);
        try {
            p2(bytes.length);
            y1(0, bytes, bytes.length);
        } catch (OutOfSpaceException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new OutOfSpaceException(e3);
        }
    }

    public abstract void W1(byte b2);

    public abstract void X1(int i, boolean z);

    public abstract void Y1(int i, byte[] bArr);

    public abstract void Z1(int i, tr1 tr1Var);

    public abstract void a2(tr1 tr1Var);

    public abstract void b2(int i, int i2);

    public abstract void c2(int i);

    public abstract void d2(int i, long j);

    public abstract void e2(long j);

    public abstract void f2(int i, int i2);

    public abstract void g2(int i);

    public abstract void h2(int i, sp9 sp9Var, uod uodVar);

    public abstract void i2(sp9 sp9Var);

    public abstract void j2(int i, sp9 sp9Var);

    public abstract void k2(int i, tr1 tr1Var);

    public abstract void l2(int i, String str);

    public abstract void m2(String str);

    public abstract void n2(int i, int i2);

    public abstract void o2(int i, int i2);

    public abstract void p2(int i);

    public abstract void q2(int i, long j);

    public abstract void r2(long j);

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
