package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zn1 implements to1, ro1, Cloneable, ByteChannel {
    public lyd a;
    public long b;

    public static final class c implements Closeable {
        public zn1 a;
        public boolean b;
        public lyd c;
        public byte[] e;
        public long d = -1;
        public int f = -1;
        public int V = -1;

        public final void a(long j) {
            zn1 zn1Var = this.a;
            if (zn1Var == null) {
                r6.g("not attached to a buffer");
                return;
            }
            if (!this.b) {
                r6.g("resizeBuffer() only permitted for read/write buffers");
                return;
            }
            long j2 = zn1Var.b;
            if (j <= j2) {
                if (j < 0) {
                    h5.k(r6.c(j, "newSize < 0: "));
                    return;
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    lyd lydVar = zn1Var.a;
                    lydVar.getClass();
                    lyd lydVar2 = lydVar.g;
                    lydVar2.getClass();
                    int i = lydVar2.c;
                    long j4 = i - lydVar2.b;
                    if (j4 > j3) {
                        lydVar2.c = i - ((int) j3);
                        break;
                    } else {
                        zn1Var.a = lydVar2.a();
                        qyd.a(lydVar2);
                        j3 -= j4;
                    }
                }
                this.c = null;
                this.d = j;
                this.e = null;
                this.f = -1;
                this.V = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    lyd lydVarM0 = zn1Var.m0(i2);
                    int iMin = (int) Math.min(j5, 8192 - lydVarM0.c);
                    int i3 = lydVarM0.c + iMin;
                    lydVarM0.c = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.c = lydVarM0;
                        this.d = j2;
                        this.e = lydVarM0.a;
                        this.f = i3 - iMin;
                        this.V = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            zn1Var.b = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.a == null) {
                r6.g("not attached to a buffer");
                return;
            }
            this.a = null;
            this.c = null;
            this.d = -1L;
            this.e = null;
            this.f = -1;
            this.V = -1;
        }

        public final int h(long j) {
            zn1 zn1Var = this.a;
            if (zn1Var == null) {
                r6.g("not attached to a buffer");
                return 0;
            }
            if (j >= -1) {
                long j2 = zn1Var.b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.c = null;
                        this.d = j;
                        this.e = null;
                        this.f = -1;
                        this.V = -1;
                        return -1;
                    }
                    lyd lydVar = zn1Var.a;
                    lyd lydVar2 = this.c;
                    long j3 = 0;
                    if (lydVar2 != null) {
                        long j4 = this.d - ((long) (this.f - lydVar2.b));
                        if (j4 > j) {
                            lydVar2 = lydVar;
                            lydVar = lydVar2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        lydVar2 = lydVar;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            lydVar2.getClass();
                            long j5 = ((long) (lydVar2.c - lydVar2.b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            lydVar2 = lydVar2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            lydVar.getClass();
                            lydVar = lydVar.g;
                            lydVar.getClass();
                            j2 -= (long) (lydVar.c - lydVar.b);
                        }
                        lydVar2 = lydVar;
                        j3 = j2;
                    }
                    if (this.b) {
                        lydVar2.getClass();
                        if (lydVar2.d) {
                            byte[] bArr = lydVar2.a;
                            lyd lydVar3 = new lyd(Arrays.copyOf(bArr, bArr.length), lydVar2.b, lydVar2.c, false, true);
                            if (zn1Var.a == lydVar2) {
                                zn1Var.a = lydVar3;
                            }
                            lydVar2.b(lydVar3);
                            lyd lydVar4 = lydVar3.g;
                            lydVar4.getClass();
                            lydVar4.a();
                            lydVar2 = lydVar3;
                        }
                    }
                    this.c = lydVar2;
                    this.d = j;
                    lydVar2.getClass();
                    this.e = lydVar2.a;
                    int i = lydVar2.b + ((int) (j - j3));
                    this.f = i;
                    int i2 = lydVar2.c;
                    this.V = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbI = w40.i(j, "offset=", " > size=");
            sbI.append(zn1Var.b);
            throw new ArrayIndexOutOfBoundsException(sbI.toString());
        }
    }

    @Override // defpackage.to1
    public final boolean B(long j, vr1 vr1Var) {
        vr1Var.getClass();
        int iH = vr1Var.h();
        if (j >= 0 && iH >= 0 && this.b - j >= iH && vr1Var.h() >= iH) {
            for (int i = 0; i < iH; i++) {
                if (P(((long) i) + j) == vr1Var.r(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void B0(long j) {
        boolean z;
        if (j == 0) {
            r0(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Q0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        lyd lydVarM0 = m0(i);
        byte[] bArr = lydVarM0.a;
        int i2 = lydVarM0.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = defpackage.c.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        lydVarM0.c += i;
        this.b += (long) i;
    }

    @Override // defpackage.to1
    public final void C0(zn1 zn1Var, long j) throws EOFException {
        zn1Var.getClass();
        long j2 = this.b;
        if (j2 >= j) {
            zn1Var.I1(this, j);
        } else {
            zn1Var.I1(this, j2);
            k20.n();
        }
    }

    @Override // defpackage.to1
    public final int E0(pva pvaVar) throws EOFException {
        pvaVar.getClass();
        int iC = defpackage.c.c(this, pvaVar, false);
        if (iC == -1) {
            return -1;
        }
        skip(pvaVar.a[iC].h());
        return iC;
    }

    public final void G(zn1 zn1Var, long j, long j2) {
        zn1Var.getClass();
        long j3 = j;
        k.b(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        zn1Var.b += j2;
        lyd lydVar = this.a;
        while (true) {
            lydVar.getClass();
            long j4 = lydVar.c - lydVar.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            lydVar = lydVar.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            lydVar.getClass();
            lyd lydVarC = lydVar.c();
            int i = lydVarC.b + ((int) j3);
            lydVarC.b = i;
            lydVarC.c = Math.min(i + ((int) j5), lydVarC.c);
            lyd lydVar2 = zn1Var.a;
            if (lydVar2 == null) {
                lydVarC.g = lydVarC;
                lydVarC.f = lydVarC;
                zn1Var.a = lydVarC;
            } else {
                lyd lydVar3 = lydVar2.g;
                lydVar3.getClass();
                lydVar3.b(lydVarC);
            }
            j5 -= (long) (lydVarC.c - lydVarC.b);
            lydVar = lydVar.f;
            j3 = 0;
        }
    }

    @Override // defpackage.ro1
    public final ro1 H() {
        return this;
    }

    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) {
        lyd lydVarB;
        zn1Var.getClass();
        if (zn1Var == this) {
            l5.q("source == this");
            return;
        }
        k.b(zn1Var.b, 0L, j);
        while (j > 0) {
            lyd lydVar = zn1Var.a;
            lydVar.getClass();
            int i = lydVar.c;
            lyd lydVar2 = zn1Var.a;
            lydVar2.getClass();
            long j2 = i - lydVar2.b;
            int i2 = 0;
            if (j < j2) {
                lyd lydVar3 = this.a;
                lyd lydVar4 = lydVar3 != null ? lydVar3.g : null;
                if (lydVar4 != null && lydVar4.e) {
                    if ((((long) lydVar4.c) + j) - ((long) (lydVar4.d ? 0 : lydVar4.b)) <= 8192) {
                        lyd lydVar5 = zn1Var.a;
                        lydVar5.getClass();
                        lydVar5.d(lydVar4, (int) j);
                        zn1Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                lyd lydVar6 = zn1Var.a;
                lydVar6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > lydVar6.c - lydVar6.b) {
                    l5.q("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    lydVarB = lydVar6.c();
                } else {
                    lydVarB = qyd.b();
                    byte[] bArr = lydVar6.a;
                    byte[] bArr2 = lydVarB.a;
                    int i4 = lydVar6.b;
                    pyd.g(0, i4, i4 + i3, bArr, bArr2);
                }
                lydVarB.c = lydVarB.b + i3;
                lydVar6.b += i3;
                lyd lydVar7 = lydVar6.g;
                lydVar7.getClass();
                lydVar7.b(lydVarB);
                zn1Var.a = lydVarB;
            }
            lyd lydVar8 = zn1Var.a;
            lydVar8.getClass();
            long j3 = lydVar8.c - lydVar8.b;
            zn1Var.a = lydVar8.a();
            lyd lydVar9 = this.a;
            if (lydVar9 == null) {
                this.a = lydVar8;
                lydVar8.g = lydVar8;
                lydVar8.f = lydVar8;
            } else {
                lyd lydVar10 = lydVar9.g;
                lydVar10.getClass();
                lydVar10.b(lydVar8);
                lyd lydVar11 = lydVar8.g;
                if (lydVar11 == lydVar8) {
                    r6.g("cannot compact");
                    return;
                }
                lydVar11.getClass();
                if (lydVar11.e) {
                    int i5 = lydVar8.c - lydVar8.b;
                    lyd lydVar12 = lydVar8.g;
                    lydVar12.getClass();
                    int i6 = 8192 - lydVar12.c;
                    lyd lydVar13 = lydVar8.g;
                    lydVar13.getClass();
                    if (!lydVar13.d) {
                        lyd lydVar14 = lydVar8.g;
                        lydVar14.getClass();
                        i2 = lydVar14.b;
                    }
                    if (i5 <= i6 + i2) {
                        lyd lydVar15 = lydVar8.g;
                        lydVar15.getClass();
                        lydVar8.d(lydVar15, i5);
                        lydVar8.a();
                        qyd.a(lydVar8);
                    }
                }
            }
            zn1Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.to1
    public final vr1 J0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            h5.k(r6.c(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            k20.n();
            return null;
        }
        if (j < 4096) {
            return new vr1(l0(j));
        }
        vr1 vr1VarK0 = k0((int) j);
        skip(j);
        return vr1VarK0;
    }

    public final void K0(long j) {
        if (j == 0) {
            r0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        lyd lydVarM0 = m0(i);
        byte[] bArr = lydVarM0.a;
        int i2 = lydVarM0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = defpackage.c.a[(int) (15 & j)];
            j >>>= 4;
        }
        lydVarM0.c += i;
        this.b += (long) i;
    }

    public final void L0(int i) {
        lyd lydVarM0 = m0(4);
        byte[] bArr = lydVarM0.a;
        int i2 = lydVarM0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        lydVarM0.c = i2 + 4;
        this.b += 4;
    }

    public final void N0(int i) {
        lyd lydVarM0 = m0(2);
        byte[] bArr = lydVarM0.a;
        int i2 = lydVarM0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        lydVarM0.c = i2 + 2;
        this.b += 2;
    }

    public final byte P(long j) {
        k.b(this.b, j, 1L);
        lyd lydVar = this.a;
        lydVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                lydVar = lydVar.g;
                lydVar.getClass();
                j2 -= (long) (lydVar.c - lydVar.b);
            }
            return lydVar.a[(int) ((((long) lydVar.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = lydVar.c;
            int i2 = lydVar.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return lydVar.a[(int) ((((long) i2) + j) - j3)];
            }
            lydVar = lydVar.f;
            lydVar.getClass();
            j3 = j4;
        }
    }

    public final void P0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            h5.k(p6.c(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            h5.k(k20.l("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            s40.g(str.length(), o6.g(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                lyd lydVarM0 = m0(1);
                byte[] bArr = lydVarM0.a;
                int i3 = lydVarM0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = lydVarM0.c;
                int i6 = (i3 + i) - i5;
                lydVarM0.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    lyd lydVarM02 = m0(2);
                    byte[] bArr2 = lydVarM02.a;
                    int i7 = lydVarM02.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    lydVarM02.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    lyd lydVarM03 = m0(3);
                    byte[] bArr3 = lydVarM03.a;
                    int i8 = lydVarM03.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    lydVarM03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        r0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        lyd lydVarM04 = m0(4);
                        byte[] bArr4 = lydVarM04.a;
                        int i11 = lydVarM04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        lydVarM04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // defpackage.to1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long P1() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            lyd r6 = r14.a
            r6.getClass()
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            zn1 r14 = new zn1
            r14.<init>()
            r14.K0(r4)
            r14.r0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.z1()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = defpackage.k.d(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r14.<init>(r0)
            throw r14
        L79:
            if (r8 != r9) goto L85
            lyd r7 = r6.a()
            r14.a = r7
            defpackage.qyd.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            lyd r6 = r14.a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b = r1
            return r4
        L94:
            defpackage.k20.n()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn1.P1():long");
    }

    public final long Q(byte b2, long j, long j2) {
        lyd lydVar;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            o6.p(sb, " fromIndex=", j, " toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (lydVar = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                lydVar = lydVar.g;
                lydVar.getClass();
                j4 -= (long) (lydVar.c - lydVar.b);
            }
            while (j4 < j2) {
                byte[] bArr = lydVar.a;
                int iMin = (int) Math.min(lydVar.c, (((long) lydVar.b) + j2) - j4);
                for (int i = (int) ((((long) lydVar.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - lydVar.b)) + j4;
                    }
                }
                j4 += (long) (lydVar.c - lydVar.b);
                lydVar = lydVar.f;
                lydVar.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (lydVar.c - lydVar.b)) + j3;
            if (j5 > j) {
                break;
            }
            lydVar = lydVar.f;
            lydVar.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = lydVar.a;
            int iMin2 = (int) Math.min(lydVar.c, (((long) lydVar.b) + j2) - j3);
            for (int i2 = (int) ((((long) lydVar.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b2) {
                    return ((long) (i2 - lydVar.b)) + j3;
                }
            }
            j3 += (long) (lydVar.c - lydVar.b);
            lydVar = lydVar.f;
            lydVar.getClass();
            j = j3;
        }
        return -1L;
    }

    public final void Q0(String str) {
        str.getClass();
        P0(0, str.length(), str);
    }

    @Override // defpackage.to1
    public final String S(long j) throws EOFException {
        if (j < 0) {
            h5.k(r6.c(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jQ = Q((byte) 10, 0L, j2);
        if (jQ != -1) {
            return defpackage.c.b(this, jQ);
        }
        if (j2 < this.b && P(j2 - 1) == 13 && P(j2) == 10) {
            return defpackage.c.b(this, j2);
        }
        zn1 zn1Var = new zn1();
        G(zn1Var, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + zn1Var.J0(zn1Var.b).m() + (char) 8230);
    }

    @Override // defpackage.to1
    public final byte[] S0() {
        return l0(this.b);
    }

    public final long W(long j, vr1 vr1Var) {
        vr1Var.getClass();
        long j2 = 0;
        if (vr1Var.h() <= 0) {
            l5.q("bytes is empty");
            return 0L;
        }
        if (j < 0) {
            h5.k(r6.c(j, "fromIndex < 0: "));
            return 0L;
        }
        lyd lydVar = this.a;
        if (lydVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                lydVar = lydVar.g;
                lydVar.getClass();
                j3 -= (long) (lydVar.c - lydVar.b);
            }
            byte[] bArrP = vr1Var.p();
            byte b2 = bArrP[0];
            int iH = vr1Var.h();
            long j4 = (this.b - ((long) iH)) + 1;
            while (j3 < j4) {
                byte[] bArr = lydVar.a;
                int iMin = (int) Math.min(lydVar.c, (((long) lydVar.b) + j4) - j3);
                for (int i = (int) ((((long) lydVar.b) + j) - j3); i < iMin; i++) {
                    if (bArr[i] == b2 && defpackage.c.a(lydVar, i + 1, bArrP, iH)) {
                        return ((long) (i - lydVar.b)) + j3;
                    }
                }
                j3 += (long) (lydVar.c - lydVar.b);
                lydVar = lydVar.f;
                lydVar.getClass();
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (lydVar.c - lydVar.b)) + j2;
            if (j5 > j) {
                break;
            }
            lydVar = lydVar.f;
            lydVar.getClass();
            j2 = j5;
        }
        byte[] bArrP2 = vr1Var.p();
        byte b3 = bArrP2[0];
        int iH2 = vr1Var.h();
        long j6 = (this.b - ((long) iH2)) + 1;
        while (j2 < j6) {
            byte[] bArr2 = lydVar.a;
            int iMin2 = (int) Math.min(lydVar.c, (((long) lydVar.b) + j6) - j2);
            for (int i2 = (int) ((((long) lydVar.b) + j) - j2); i2 < iMin2; i2++) {
                if (bArr2[i2] == b3 && defpackage.c.a(lydVar, i2 + 1, bArrP2, iH2)) {
                    return ((long) (i2 - lydVar.b)) + j2;
                }
            }
            j2 += (long) (lydVar.c - lydVar.b);
            lydVar = lydVar.f;
            lydVar.getClass();
            j = j2;
        }
        return -1L;
    }

    @Override // defpackage.to1
    public final boolean W0() {
        return this.b == 0;
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 Y(String str) {
        Q0(str);
        return this;
    }

    @Override // defpackage.to1
    public final long Z(vr1 vr1Var) {
        vr1Var.getClass();
        return b0(0L, vr1Var);
    }

    @Override // defpackage.ro1
    public final long a1(pne pneVar) {
        pneVar.getClass();
        long j = 0;
        while (true) {
            long jF1 = pneVar.f1(this, 8192L);
            if (jF1 == -1) {
                return j;
            }
            j += jF1;
        }
    }

    public final long b0(long j, vr1 vr1Var) {
        vr1Var.getClass();
        long j2 = 0;
        if (j < 0) {
            h5.k(r6.c(j, "fromIndex < 0: "));
            return 0L;
        }
        lyd lydVar = this.a;
        if (lydVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                lydVar = lydVar.g;
                lydVar.getClass();
                j3 -= (long) (lydVar.c - lydVar.b);
            }
            if (vr1Var.h() == 2) {
                byte bR = vr1Var.r(0);
                byte bR2 = vr1Var.r(1);
                while (j3 < this.b) {
                    byte[] bArr = lydVar.a;
                    int i = lydVar.c;
                    for (int i2 = (int) ((((long) lydVar.b) + j) - j3); i2 < i; i2++) {
                        byte b2 = bArr[i2];
                        if (b2 == bR || b2 == bR2) {
                            return ((long) (i2 - lydVar.b)) + j3;
                        }
                    }
                    j3 += (long) (lydVar.c - lydVar.b);
                    lydVar = lydVar.f;
                    lydVar.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrP = vr1Var.p();
                while (j3 < this.b) {
                    byte[] bArr2 = lydVar.a;
                    int i3 = lydVar.c;
                    for (int i4 = (int) ((((long) lydVar.b) + j) - j3); i4 < i3; i4++) {
                        byte b3 = bArr2[i4];
                        for (byte b4 : bArrP) {
                            if (b3 == b4) {
                                return ((long) (i4 - lydVar.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (lydVar.c - lydVar.b);
                    lydVar = lydVar.f;
                    lydVar.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (lydVar.c - lydVar.b)) + j2;
            if (j4 > j) {
                break;
            }
            lydVar = lydVar.f;
            lydVar.getClass();
            j2 = j4;
        }
        if (vr1Var.h() == 2) {
            byte bR3 = vr1Var.r(0);
            byte bR4 = vr1Var.r(1);
            while (j2 < this.b) {
                byte[] bArr3 = lydVar.a;
                int i5 = lydVar.c;
                for (int i6 = (int) ((((long) lydVar.b) + j) - j2); i6 < i5; i6++) {
                    byte b5 = bArr3[i6];
                    if (b5 == bR3 || b5 == bR4) {
                        return ((long) (i6 - lydVar.b)) + j2;
                    }
                }
                j2 += (long) (lydVar.c - lydVar.b);
                lydVar = lydVar.f;
                lydVar.getClass();
                j = j2;
            }
        } else {
            byte[] bArrP2 = vr1Var.p();
            while (j2 < this.b) {
                byte[] bArr4 = lydVar.a;
                int i7 = lydVar.c;
                for (int i8 = (int) ((((long) lydVar.b) + j) - j2); i8 < i7; i8++) {
                    byte b6 = bArr4[i8];
                    for (byte b7 : bArrP2) {
                        if (b6 == b7) {
                            return ((long) (i8 - lydVar.b)) + j2;
                        }
                    }
                }
                j2 += (long) (lydVar.c - lydVar.b);
                lydVar = lydVar.f;
                lydVar.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.fie
    public final void close() {
    }

    public final c d0(c cVar) {
        cVar.getClass();
        byte[] bArr = defpackage.c.a;
        if (cVar == k.a) {
            cVar = new c();
        }
        if (cVar.a != null) {
            r6.g("already attached to a buffer");
            return null;
        }
        cVar.a = this;
        cVar.b = true;
        return cVar;
    }

    public final void d1(int i) {
        if (i < 128) {
            r0(i);
            return;
        }
        if (i < 2048) {
            lyd lydVarM0 = m0(2);
            byte[] bArr = lydVarM0.a;
            int i2 = lydVarM0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            lydVarM0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            r0(63);
            return;
        }
        if (i < 65536) {
            lyd lydVarM02 = m0(3);
            byte[] bArr2 = lydVarM02.a;
            int i3 = lydVarM02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            bArr2[i3 + 2] = (byte) ((i & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            lydVarM02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            l5.q("Unexpected code point: 0x".concat(k.e(i)));
            return;
        }
        lyd lydVarM03 = m0(4);
        byte[] bArr3 = lydVarM03.a;
        int i4 = lydVarM03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        bArr3[i4 + 3] = (byte) ((i & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        lydVarM03.c = i4 + 4;
        this.b += 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        long j = this.b;
        zn1 zn1Var = (zn1) obj;
        if (j != zn1Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        lyd lydVar2 = zn1Var.a;
        lydVar2.getClass();
        int i = lydVar.b;
        int i2 = lydVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(lydVar.c - i, lydVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (lydVar.a[i] != lydVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == lydVar.c) {
                lydVar = lydVar.f;
                lydVar.getClass();
                i = lydVar.b;
            }
            if (i2 == lydVar2.c) {
                lydVar2 = lydVar2.f;
                lydVar2.getClass();
                i2 = lydVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.to1
    public final zn1 f() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r0 = new defpackage.zn1();
        r0.B0(r8);
        r0.r0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r0.z1()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f0() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn1.f0():long");
    }

    @Override // defpackage.pne
    public final long f1(zn1 zn1Var, long j) {
        zn1Var.getClass();
        if (j < 0) {
            h5.k(r6.c(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        zn1Var.I1(this, j);
        return j;
    }

    @Override // defpackage.ro1, defpackage.fie, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.pne
    public final kmf g() {
        return kmf.d;
    }

    public final void h() throws EOFException {
        skip(this.b);
    }

    public final String h0(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            h5.k(r6.c(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            k20.n();
            return null;
        }
        if (j == 0) {
            return "";
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        int i = lydVar.b;
        if (((long) i) + j > lydVar.c) {
            return new String(l0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(lydVar.a, i, i2, charset);
        int i3 = lydVar.b + i2;
        lydVar.b = i3;
        this.b -= j;
        if (i3 == lydVar.c) {
            this.a = lydVar.a();
            qyd.a(lydVar);
        }
        return str;
    }

    public final int hashCode() {
        lyd lydVar = this.a;
        if (lydVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = lydVar.c;
            for (int i3 = lydVar.b; i3 < i2; i3++) {
                i = (i * 31) + lydVar.a[i3];
            }
            lydVar = lydVar.f;
            lydVar.getClass();
        } while (lydVar != this.a);
        return i;
    }

    @Override // defpackage.to1
    public final String i0() {
        return S(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int j0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            k20.n();
            return 0;
        }
        byte bP = P(0L);
        if ((bP & 128) == 0) {
            i = bP & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bP & 224) == 192) {
            i = bP & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bP & 240) == 224) {
            i = bP & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bP & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bP & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbG = o6.g(i2, "size < ", ": ");
            sbG.append(this.b);
            sbG.append(" (to read code point prefixed 0x");
            sbG.append(k.d(bP));
            sbG.append(')');
            throw new EOFException(sbG.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bP2 = P(j2);
            if ((bP2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bP2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final vr1 k0(int i) {
        if (i == 0) {
            return vr1.c;
        }
        k.b(this.b, 0L, i);
        lyd lydVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            lydVar.getClass();
            int i5 = lydVar.c;
            int i6 = lydVar.b;
            if (i5 == i6) {
                g7.l("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            lydVar = lydVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        lyd lydVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            lydVar2.getClass();
            bArr[i7] = lydVar2.a;
            i2 += lydVar2.c - lydVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = lydVar2.b;
            lydVar2.d = true;
            i7++;
            lydVar2 = lydVar2.f;
        }
        return new kzd(bArr, iArr);
    }

    @Override // defpackage.to1
    public final long k1(fie fieVar) {
        long j = this.b;
        if (j > 0) {
            fieVar.I1(this, j);
        }
        return j;
    }

    @Override // defpackage.to1
    public final byte[] l0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            h5.k(r6.c(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            k20.n();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final lyd m0(int i) {
        if (i < 1 || i > 8192) {
            l5.q("unexpected capacity");
            return null;
        }
        lyd lydVar = this.a;
        if (lydVar == null) {
            lyd lydVarB = qyd.b();
            this.a = lydVarB;
            lydVarB.g = lydVarB;
            lydVarB.f = lydVarB;
            return lydVarB;
        }
        lyd lydVar2 = lydVar.g;
        lydVar2.getClass();
        if (lydVar2.c + i <= 8192 && lydVar2.e) {
            return lydVar2;
        }
        lyd lydVarB2 = qyd.b();
        lydVar2.b(lydVarB2);
        return lydVarB2;
    }

    @Override // defpackage.to1
    public final String m1(Charset charset) {
        return h0(this.b, charset);
    }

    @Override // defpackage.to1
    public final short n0() throws EOFException {
        short s = readShort();
        c cVar = k.a;
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final void o0(vr1 vr1Var) {
        vr1Var.getClass();
        vr1Var.B(this, vr1Var.h());
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final zn1 clone() {
        zn1 zn1Var = new zn1();
        if (this.b == 0) {
            return zn1Var;
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        lyd lydVarC = lydVar.c();
        zn1Var.a = lydVarC;
        lydVarC.g = lydVarC;
        lydVarC.f = lydVarC;
        for (lyd lydVar2 = lydVar.f; lydVar2 != lydVar; lydVar2 = lydVar2.f) {
            lyd lydVar3 = lydVarC.g;
            lydVar3.getClass();
            lydVar2.getClass();
            lydVar3.b(lydVar2.c());
        }
        zn1Var.b = this.b;
        return zn1Var;
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 p0(int i, byte[] bArr, int i2) {
        write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.to1
    public final uqc peek() {
        return new uqc(new o7b(this));
    }

    @Override // defpackage.to1
    public final long q0() throws EOFException {
        long j = readLong();
        c cVar = k.a;
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 q1(long j) {
        K0(j);
        return this;
    }

    public final void r0(int i) {
        lyd lydVarM0 = m0(1);
        byte[] bArr = lydVarM0.a;
        int i2 = lydVarM0.c;
        lydVarM0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        k.b(bArr.length, i, i2);
        lyd lydVar = this.a;
        if (lydVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, lydVar.c - lydVar.b);
        byte[] bArr2 = lydVar.a;
        int i3 = lydVar.b;
        pyd.g(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = lydVar.b + iMin;
        lydVar.b = i4;
        this.b -= (long) iMin;
        if (i4 == lydVar.c) {
            this.a = lydVar.a();
            qyd.a(lydVar);
        }
        return iMin;
    }

    @Override // defpackage.to1
    public final byte readByte() throws EOFException {
        if (this.b == 0) {
            k20.n();
            return (byte) 0;
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        int i = lydVar.b;
        int i2 = lydVar.c;
        int i3 = i + 1;
        byte b2 = lydVar.a[i];
        this.b--;
        if (i3 != i2) {
            lydVar.b = i3;
            return b2;
        }
        this.a = lydVar.a();
        qyd.a(lydVar);
        return b2;
    }

    @Override // defpackage.to1
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                k20.n();
                return;
            }
            i += i2;
        }
    }

    @Override // defpackage.to1
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            k20.n();
            return 0;
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        int i = lydVar.b;
        int i2 = lydVar.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = lydVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            lydVar.b = i5;
            return i6;
        }
        this.a = lydVar.a();
        qyd.a(lydVar);
        return i6;
    }

    @Override // defpackage.to1
    public final long readLong() throws EOFException {
        if (this.b < 8) {
            k20.n();
            return 0L;
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        int i = lydVar.b;
        int i2 = lydVar.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = lydVar.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.b -= 8;
        if (i4 != i2) {
            lydVar.b = i4;
            return j2;
        }
        this.a = lydVar.a();
        qyd.a(lydVar);
        return j2;
    }

    @Override // defpackage.to1
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            k20.n();
            return (short) 0;
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        int i = lydVar.b;
        int i2 = lydVar.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = lydVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = lydVar.a();
            qyd.a(lydVar);
        } else {
            lydVar.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.to1
    public final boolean request(long j) {
        return this.b >= j;
    }

    @Override // defpackage.to1
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            lyd lydVar = this.a;
            if (lydVar == null) {
                k20.n();
                return;
            }
            int iMin = (int) Math.min(j, lydVar.c - lydVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = lydVar.b + iMin;
            lydVar.b = i;
            if (i == lydVar.c) {
                this.a = lydVar.a();
                qyd.a(lydVar);
            }
        }
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return k0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final long v() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        lyd lydVar = this.a;
        lydVar.getClass();
        lyd lydVar2 = lydVar.g;
        lydVar2.getClass();
        int i = lydVar2.c;
        return (i >= 8192 || !lydVar2.e) ? j : j - ((long) (i - lydVar2.b));
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 v0(vr1 vr1Var) {
        o0(vr1Var);
        return this;
    }

    @Override // defpackage.ro1
    public final OutputStream w() {
        return new b();
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        k.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            lyd lydVarM0 = m0(1);
            int iMin = Math.min(i3 - i, 8192 - lydVarM0.c);
            int i4 = i + iMin;
            pyd.g(lydVarM0.c, i, i4, bArr, lydVarM0.a);
            lydVarM0.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 writeByte(int i) {
        r0(i);
        return this;
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 writeInt(int i) {
        L0(i);
        return this;
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 writeShort(int i) {
        N0(i);
        return this;
    }

    @Override // defpackage.to1
    public final InputStream x() {
        return new a();
    }

    @Override // defpackage.to1
    public final void x0(long j) throws EOFException {
        if (this.b >= j) {
            return;
        }
        k20.n();
    }

    @Override // defpackage.to1
    public final int x1() {
        return k.c(readInt());
    }

    @Override // defpackage.ro1
    public final /* bridge */ /* synthetic */ ro1 z0(long j) {
        B0(j);
        return this;
    }

    @Override // defpackage.to1
    public final String z1() {
        return h0(this.b, a32.b);
    }

    public static final class b extends OutputStream {
        public b() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public final String toString() {
            return zn1.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            bArr.getClass();
            zn1.this.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            zn1.this.r0(i);
        }
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(zn1.this.b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            zn1 zn1Var = zn1.this;
            if (zn1Var.b > 0) {
                return zn1Var.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return zn1.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            return zn1.this.read(bArr, i, i2);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            lyd lydVarM0 = m0(1);
            int iMin = Math.min(i, 8192 - lydVarM0.c);
            byteBuffer.get(lydVarM0.a, lydVarM0.c, iMin);
            i -= iMin;
            lydVarM0.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.ro1
    public final ro1 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        lyd lydVar = this.a;
        if (lydVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), lydVar.c - lydVar.b);
        byteBuffer.put(lydVar.a, lydVar.b, iMin);
        int i = lydVar.b + iMin;
        lydVar.b = i;
        this.b -= (long) iMin;
        if (i == lydVar.c) {
            this.a = lydVar.a();
            qyd.a(lydVar);
        }
        return iMin;
    }
}
