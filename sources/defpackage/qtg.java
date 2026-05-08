package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import defpackage.nue;
import defpackage.rtg;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public final class qtg extends nue {
    public a n;
    public int o;
    public boolean p;
    public rtg.c q;
    public rtg.a r;

    public static final class a {
        public final rtg.c a;
        public final rtg.a b;
        public final byte[] c;
        public final rtg.b[] d;
        public final int e;

        public a(rtg.c cVar, rtg.a aVar, byte[] bArr, rtg.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    @Override // defpackage.nue
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        rtg.c cVar = this.q;
        this.o = cVar != null ? cVar.e : 0;
    }

    @Override // defpackage.nue
    public final long b(g4b g4bVar) {
        byte b = g4bVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        a aVar = this.n;
        ka2.r(aVar);
        boolean z = aVar.d[(b >> 1) & (255 >>> (8 - aVar.e))].a;
        rtg.c cVar = aVar.a;
        int i = !z ? cVar.e : cVar.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = g4bVar.a;
        int length = bArr.length;
        int i2 = g4bVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            g4bVar.H(bArrCopyOf.length, bArrCopyOf);
        } else {
            g4bVar.I(i2);
        }
        byte[] bArr2 = g4bVar.a;
        int i3 = g4bVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.nue
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(g4b g4bVar, long j, nue.a aVar) throws ParserException {
        a aVar2;
        rtg.c cVar;
        long jFloor;
        if (this.n != null) {
            aVar.a.getClass();
            return false;
        }
        rtg.c cVar2 = this.q;
        int i = 4;
        if (cVar2 == null) {
            rtg.c(1, g4bVar, false);
            g4bVar.p();
            int iX = g4bVar.x();
            int iP = g4bVar.p();
            int iL = g4bVar.l();
            int i2 = iL <= 0 ? -1 : iL;
            int iL2 = g4bVar.l();
            int i3 = iL2 <= 0 ? -1 : iL2;
            g4bVar.l();
            int iX2 = g4bVar.x();
            int iPow = (int) Math.pow(2.0d, iX2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iX2 & 240) >> 4);
            g4bVar.x();
            this.q = new rtg.c(iX, iP, i2, i3, iPow, iPow2, Arrays.copyOf(g4bVar.a, g4bVar.c));
        } else {
            rtg.a aVar3 = this.r;
            if (aVar3 == null) {
                this.r = rtg.b(g4bVar, true, true);
            } else {
                int i4 = g4bVar.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(g4bVar.a, 0, bArr, 0, i4);
                int i5 = cVar2.a;
                int i6 = 5;
                rtg.c(5, g4bVar, false);
                int iX3 = g4bVar.x() + 1;
                ntg ntgVar = new ntg(g4bVar.a);
                int i7 = 8;
                ntgVar.c(g4bVar.b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = i7;
                    int i10 = 16;
                    if (i8 >= iX3) {
                        rtg.c cVar3 = cVar2;
                        int i11 = 6;
                        int iB = ntgVar.b(6) + 1;
                        for (int i12 = 0; i12 < iB; i12++) {
                            if (ntgVar.b(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i13 = 1;
                        int iB2 = ntgVar.b(6) + 1;
                        int i14 = 0;
                        while (true) {
                            int i15 = 3;
                            if (i14 < iB2) {
                                int iB3 = ntgVar.b(i10);
                                if (iB3 == 0) {
                                    int i16 = i9;
                                    ntgVar.c(i16);
                                    ntgVar.c(16);
                                    ntgVar.c(16);
                                    ntgVar.c(6);
                                    ntgVar.c(i16);
                                    int iB4 = ntgVar.b(4) + 1;
                                    int i17 = 0;
                                    while (i17 < iB4) {
                                        ntgVar.c(i16);
                                        i17++;
                                        i16 = 8;
                                    }
                                } else {
                                    if (iB3 != i13) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + iB3);
                                    }
                                    int iB5 = ntgVar.b(5);
                                    int[] iArr = new int[iB5];
                                    int i18 = -1;
                                    for (int i19 = 0; i19 < iB5; i19++) {
                                        int iB6 = ntgVar.b(4);
                                        iArr[i19] = iB6;
                                        if (iB6 > i18) {
                                            i18 = iB6;
                                        }
                                    }
                                    int i20 = i18 + 1;
                                    int[] iArr2 = new int[i20];
                                    int i21 = 0;
                                    while (i21 < i20) {
                                        iArr2[i21] = ntgVar.b(i15) + 1;
                                        int iB7 = ntgVar.b(2);
                                        int i22 = i9;
                                        if (iB7 > 0) {
                                            ntgVar.c(i22);
                                        }
                                        int i23 = i20;
                                        int i24 = 0;
                                        for (int i25 = 1; i24 < (i25 << iB7); i25 = 1) {
                                            ntgVar.c(i22);
                                            i24++;
                                            i22 = 8;
                                        }
                                        i21++;
                                        i20 = i23;
                                        i9 = 8;
                                        i15 = 3;
                                    }
                                    ntgVar.c(2);
                                    int iB8 = ntgVar.b(4);
                                    int i26 = 0;
                                    int i27 = 0;
                                    for (int i28 = 0; i28 < iB5; i28++) {
                                        i26 += iArr2[iArr[i28]];
                                        while (i27 < i26) {
                                            ntgVar.c(iB8);
                                            i27++;
                                        }
                                    }
                                }
                                i14++;
                                i9 = 8;
                                i11 = 6;
                                i13 = 1;
                                i10 = 16;
                            } else {
                                int iB9 = ntgVar.b(i11) + 1;
                                int i29 = 0;
                                while (i29 < iB9) {
                                    if (ntgVar.b(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    ntgVar.c(24);
                                    ntgVar.c(24);
                                    ntgVar.c(24);
                                    int iB10 = ntgVar.b(i11) + 1;
                                    int i30 = 8;
                                    ntgVar.c(8);
                                    int[] iArr3 = new int[iB10];
                                    for (int i31 = 0; i31 < iB10; i31++) {
                                        iArr3[i31] = ((ntgVar.a() ? ntgVar.b(5) : 0) * 8) + ntgVar.b(3);
                                    }
                                    int i32 = 0;
                                    while (i32 < iB10) {
                                        int i33 = 0;
                                        while (i33 < i30) {
                                            if ((iArr3[i32] & (1 << i33)) != 0) {
                                                ntgVar.c(i30);
                                            }
                                            i33++;
                                            i30 = 8;
                                        }
                                        i32++;
                                        i30 = 8;
                                    }
                                    i29++;
                                    i11 = 6;
                                }
                                int iB11 = ntgVar.b(i11) + 1;
                                for (int i34 = 0; i34 < iB11; i34++) {
                                    int iB12 = ntgVar.b(16);
                                    if (iB12 != 0) {
                                        zkd.w("VorbisUtil", "mapping type other than 0 not supported: " + iB12);
                                    } else {
                                        int iB13 = ntgVar.a() ? ntgVar.b(4) + 1 : 1;
                                        if (ntgVar.a()) {
                                            int iB14 = ntgVar.b(8) + 1;
                                            for (int i35 = 0; i35 < iB14; i35++) {
                                                int i36 = i5 - 1;
                                                int i37 = 0;
                                                for (int i38 = i36; i38 > 0; i38 >>>= 1) {
                                                    i37++;
                                                }
                                                ntgVar.c(i37);
                                                int i39 = 0;
                                                while (i36 > 0) {
                                                    i39++;
                                                    i36 >>>= 1;
                                                }
                                                ntgVar.c(i39);
                                            }
                                        }
                                        if (ntgVar.b(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iB13 > 1) {
                                            for (int i40 = 0; i40 < i5; i40++) {
                                                ntgVar.c(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < iB13; i41++) {
                                            ntgVar.c(8);
                                            ntgVar.c(8);
                                            ntgVar.c(8);
                                        }
                                    }
                                }
                                int iB15 = ntgVar.b(6);
                                int i42 = iB15 + 1;
                                rtg.b[] bVarArr = new rtg.b[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    boolean zA = ntgVar.a();
                                    ntgVar.b(16);
                                    ntgVar.b(16);
                                    ntgVar.b(8);
                                    bVarArr[i43] = new rtg.b(zA);
                                }
                                if (!ntgVar.a()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i44 = 0;
                                while (iB15 > 0) {
                                    i44++;
                                    iB15 >>>= 1;
                                }
                                aVar2 = new a(cVar3, aVar3, bArr, bVarArr, i44);
                            }
                        }
                    } else {
                        if (ntgVar.b(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((ntgVar.c * 8) + ntgVar.d));
                        }
                        int iB16 = ntgVar.b(16);
                        int iB17 = ntgVar.b(24);
                        if (ntgVar.a()) {
                            ntgVar.c(i6);
                            int iB18 = 0;
                            while (iB18 < iB17) {
                                int i45 = 0;
                                for (int i46 = iB17 - iB18; i46 > 0; i46 >>>= 1) {
                                    i45++;
                                }
                                iB18 += ntgVar.b(i45);
                            }
                        } else {
                            boolean zA2 = ntgVar.a();
                            for (int i47 = 0; i47 < iB17; i47++) {
                                if (!zA2) {
                                    ntgVar.c(i6);
                                } else if (ntgVar.a()) {
                                    ntgVar.c(i6);
                                }
                            }
                        }
                        int iB19 = ntgVar.b(i);
                        if (iB19 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + iB19);
                        }
                        if (iB19 == 1 || iB19 == 2) {
                            ntgVar.c(32);
                            ntgVar.c(32);
                            int iB20 = ntgVar.b(i) + 1;
                            ntgVar.c(1);
                            if (iB19 != 1) {
                                cVar = cVar2;
                                jFloor = ((long) iB16) * ((long) iB17);
                            } else if (iB16 != 0) {
                                cVar = cVar2;
                                jFloor = (long) Math.floor(Math.pow(iB17, 1.0d / ((double) iB16)));
                            } else {
                                cVar = cVar2;
                                jFloor = 0;
                            }
                            ntgVar.c((int) (jFloor * ((long) iB20)));
                        } else {
                            cVar = cVar2;
                        }
                        i8++;
                        i7 = i9;
                        cVar2 = cVar;
                        i = 4;
                        i6 = 5;
                    }
                }
            }
        }
        aVar2 = null;
        this.n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        rtg.c cVar4 = aVar2.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar4.g);
        arrayList.add(aVar2.c);
        js9 js9VarA = rtg.a(e47.k(aVar2.b.a));
        a.C0036a c0036a = new a.C0036a();
        c0036a.l = st9.p("audio/ogg");
        c0036a.m = st9.p("audio/vorbis");
        c0036a.h = cVar4.d;
        c0036a.i = cVar4.c;
        c0036a.E = cVar4.a;
        c0036a.F = cVar4.b;
        c0036a.p = arrayList;
        c0036a.k = js9VarA;
        aVar.a = new androidx.media3.common.a(c0036a);
        return true;
    }

    @Override // defpackage.nue
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
