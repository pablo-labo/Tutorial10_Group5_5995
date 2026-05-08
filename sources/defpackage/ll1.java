package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.w0a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ll1 {
    public static final byte[] a;

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public static final class b {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final g4b f;
        public final g4b g;
        public int h;
        public int i;

        public b(g4b g4bVar, g4b g4bVar2, boolean z) throws ParserException {
            this.g = g4bVar;
            this.f = g4bVar2;
            this.e = z;
            g4bVar2.J(12);
            this.a = g4bVar2.B();
            g4bVar.J(12);
            this.i = g4bVar.B();
            ewa.k("first_chunk must be 1", g4bVar.j() == 1);
            this.b = -1;
        }

        public final boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            boolean z = this.e;
            g4b g4bVar = this.f;
            this.d = z ? g4bVar.C() : g4bVar.z();
            if (this.b == this.h) {
                g4b g4bVar2 = this.g;
                this.c = g4bVar2.B();
                g4bVar2.K(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? g4bVar2.B() - 1 : -1;
            }
            return true;
        }
    }

    public static final class c {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public c(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    public static final class d {
        public final f a;

        public d(f fVar) {
            this.a = fVar;
        }
    }

    public interface e {
        int a();

        int b();

        int c();
    }

    public static final class f {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public f(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    public static final class g {
        public final upf[] a;
        public androidx.media3.common.a b;
        public int c;
        public int d = 0;

        public g(int i) {
            this.a = new upf[i];
        }
    }

    public static final class h implements e {
        public final int a;
        public final int b;
        public final g4b c;

        public h(w0a.b bVar, androidx.media3.common.a aVar) {
            g4b g4bVar = bVar.b;
            this.c = g4bVar;
            g4bVar.J(12);
            int iB = g4bVar.B();
            if ("audio/raw".equals(aVar.n)) {
                int iT = vjg.t(aVar.H) * aVar.F;
                if (iB == 0 || iB % iT != 0) {
                    zkd.T("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iT + ", stsz sample size: " + iB);
                    iB = iT;
                }
            }
            this.a = iB == 0 ? -1 : iB;
            this.b = g4bVar.B();
        }

        @Override // ll1.e
        public final int a() {
            int i = this.a;
            return i == -1 ? this.c.B() : i;
        }

        @Override // ll1.e
        public final int b() {
            return this.a;
        }

        @Override // ll1.e
        public final int c() {
            return this.b;
        }
    }

    public static final class i implements e {
        public final g4b a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public i(w0a.b bVar) {
            g4b g4bVar = bVar.b;
            this.a = g4bVar;
            g4bVar.J(12);
            this.c = g4bVar.B() & 255;
            this.b = g4bVar.B();
        }

        @Override // ll1.e
        public final int a() {
            g4b g4bVar = this.a;
            int i = this.c;
            if (i == 8) {
                return g4bVar.x();
            }
            if (i == 16) {
                return g4bVar.D();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int iX = g4bVar.x();
            this.e = iX;
            return (iX & 240) >> 4;
        }

        @Override // ll1.e
        public final int b() {
            return -1;
        }

        @Override // ll1.e
        public final int c() {
            return this.b;
        }
    }

    public static final class j {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public j(int i, int i2, int i3, int i4, int i5, long j) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static final class k {
        public final d a;

        public k(d dVar) {
            this.a = dVar;
        }
    }

    static {
        String str = vjg.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(g4b g4bVar) {
        int i2 = g4bVar.b;
        g4bVar.K(4);
        if (g4bVar.j() != 1751411826) {
            i2 += 4;
        }
        g4bVar.J(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09f1 A[LOOP:15: B:491:0x09f1->B:623:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x082e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:617:? A[LOOP:12: B:479:0x09b8->B:617:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:619:? A[LOOP:13: B:483:0x09d2->B:619:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:621:? A[LOOP:14: B:486:0x09da->B:621:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.g4b r48, int r49, int r50, int r51, int r52, java.lang.String r53, boolean r54, androidx.media3.common.DrmInitData r55, ll1.g r56, int r57) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 3226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll1.b(g4b, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, ll1$g, int):void");
    }

    public static c c(int i2, g4b g4bVar) {
        g4bVar.J(i2 + 12);
        g4bVar.K(1);
        d(g4bVar);
        g4bVar.K(2);
        int iX = g4bVar.x();
        if ((iX & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            g4bVar.K(2);
        }
        if ((iX & 64) != 0) {
            g4bVar.K(g4bVar.x());
        }
        if ((iX & 32) != 0) {
            g4bVar.K(2);
        }
        g4bVar.K(1);
        d(g4bVar);
        String strF = st9.f(g4bVar.x());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new c(strF, null, -1L, -1L);
        }
        g4bVar.K(4);
        long jZ = g4bVar.z();
        long jZ2 = g4bVar.z();
        g4bVar.K(1);
        int iD = d(g4bVar);
        long j2 = jZ2;
        byte[] bArr = new byte[iD];
        g4bVar.h(0, bArr, iD);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new c(strF, bArr, j2, jZ > 0 ? jZ : -1L);
    }

    public static int d(g4b g4bVar) {
        int iX = g4bVar.x();
        int i2 = iX & 127;
        while ((iX & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iX = g4bVar.x();
            i2 = (i2 << 7) | (iX & 127);
        }
        return i2;
    }

    public static int e(int i2) {
        return (i2 >> 24) & 255;
    }

    public static js9 f(w0a.a aVar) {
        uf9 uf9Var;
        w0a.b bVarC = aVar.c(1751411826);
        w0a.b bVarC2 = aVar.c(1801812339);
        w0a.b bVarC3 = aVar.c(1768715124);
        if (bVarC != null && bVarC2 != null && bVarC3 != null) {
            g4b g4bVar = bVarC.b;
            g4bVar.J(16);
            if (g4bVar.j() == 1835299937) {
                g4b g4bVar2 = bVarC2.b;
                g4bVar2.J(12);
                int iJ = g4bVar2.j();
                String[] strArr = new String[iJ];
                for (int i2 = 0; i2 < iJ; i2++) {
                    int iJ2 = g4bVar2.j();
                    g4bVar2.K(4);
                    strArr[i2] = g4bVar2.v(iJ2 - 8, StandardCharsets.UTF_8);
                }
                g4b g4bVar3 = bVarC3.b;
                g4bVar3.J(8);
                ArrayList arrayList = new ArrayList();
                while (g4bVar3.a() > 8) {
                    int i3 = g4bVar3.b;
                    int iJ3 = g4bVar3.j();
                    int iJ4 = g4bVar3.j() - 1;
                    if (iJ4 < 0 || iJ4 >= iJ) {
                        g7.j(iJ4, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[iJ4];
                        int i4 = i3 + iJ3;
                        while (true) {
                            int i5 = g4bVar3.b;
                            if (i5 >= i4) {
                                uf9Var = null;
                                break;
                            }
                            int iJ5 = g4bVar3.j();
                            if (g4bVar3.j() == 1684108385) {
                                int iJ6 = g4bVar3.j();
                                int iJ7 = g4bVar3.j();
                                int i6 = iJ5 - 16;
                                byte[] bArr = new byte[i6];
                                g4bVar3.h(0, bArr, i6);
                                uf9Var = new uf9(str, bArr, iJ7, iJ6);
                                break;
                            }
                            g4bVar3.J(i5 + iJ5);
                        }
                        if (uf9Var != null) {
                            arrayList.add(uf9Var);
                        }
                    }
                    g4bVar3.J(i3 + iJ3);
                }
                if (!arrayList.isEmpty()) {
                    return new js9(arrayList);
                }
            }
        }
        return null;
    }

    public static z0a g(g4b g4bVar) {
        long jR;
        long jR2;
        g4bVar.J(8);
        if (e(g4bVar.j()) == 0) {
            jR = g4bVar.z();
            jR2 = g4bVar.z();
        } else {
            jR = g4bVar.r();
            jR2 = g4bVar.r();
        }
        return new z0a(jR, jR2, g4bVar.z());
    }

    public static Pair<Integer, upf> h(g4b g4bVar, int i2, int i3) throws ParserException {
        Integer num;
        upf upfVar;
        Pair<Integer, upf> pairCreate;
        int i4;
        int i5;
        Integer num2;
        boolean z;
        int i6 = g4bVar.b;
        while (i6 - i2 < i3) {
            g4bVar.J(i6);
            int iJ = g4bVar.j();
            ewa.k("childAtomSize must be positive", iJ > 0);
            if (g4bVar.j() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer numValueOf = null;
                String strV = null;
                while (i7 - i6 < iJ) {
                    g4bVar.J(i7);
                    int iJ2 = g4bVar.j();
                    int iJ3 = g4bVar.j();
                    if (iJ3 == 1718775137) {
                        numValueOf = Integer.valueOf(g4bVar.j());
                    } else if (iJ3 == 1935894637) {
                        g4bVar.K(4);
                        strV = g4bVar.v(4, StandardCharsets.UTF_8);
                    } else if (iJ3 == 1935894633) {
                        i9 = i7;
                        i8 = iJ2;
                    }
                    i7 += iJ2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strV) || "cbc1".equals(strV) || "cens".equals(strV) || "cbcs".equals(strV)) {
                    ewa.k("frma atom is mandatory", numValueOf != null);
                    ewa.k("schi atom is mandatory", i9 != -1);
                    int i10 = i9 + 8;
                    while (true) {
                        if (i10 - i9 >= i8) {
                            num = numValueOf;
                            upfVar = null;
                            break;
                        }
                        g4bVar.J(i10);
                        int iJ4 = g4bVar.j();
                        if (g4bVar.j() == 1952804451) {
                            int iE = e(g4bVar.j());
                            g4bVar.K(1);
                            if (iE == 0) {
                                g4bVar.K(1);
                                i5 = 0;
                                i4 = 0;
                            } else {
                                int iX = g4bVar.x();
                                i4 = iX & 15;
                                i5 = (iX & 240) >> 4;
                            }
                            if (g4bVar.x() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iX2 = g4bVar.x();
                            byte[] bArr2 = new byte[16];
                            g4bVar.h(0, bArr2, 16);
                            if (z && iX2 == 0) {
                                int iX3 = g4bVar.x();
                                byte[] bArr3 = new byte[iX3];
                                g4bVar.h(0, bArr3, iX3);
                                bArr = bArr3;
                            }
                            num = num2;
                            upfVar = new upf(z, strV, iX2, bArr2, i5, i4, bArr);
                        } else {
                            i10 += iJ4;
                        }
                    }
                    ewa.k("tenc atom is mandatory", upfVar != null);
                    String str = vjg.a;
                    pairCreate = Pair.create(num, upfVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i6 += iJ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x081f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ll1.g i(defpackage.g4b r66, ll1.j r67, java.lang.String r68, androidx.media3.common.DrmInitData r69, boolean r70) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 3445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll1.i(g4b, ll1$j, java.lang.String, androidx.media3.common.DrmInitData, boolean):ll1$g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        r26 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0617 A[ADDED_TO_REGION, LOOP:15: B:264:0x0617->B:268:0x0621, LOOP_START, PHI: r28
  0x0617: PHI (r28v9 int) = (r28v7 int), (r28v10 int) binds: [B:263:0x0615, B:268:0x0621] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0966 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList j(w0a.a r59, defpackage.kw5 r60, long r61, androidx.media3.common.DrmInitData r63, boolean r64, boolean r65, defpackage.ru5 r66) {
        /*
            Method dump skipped, instruction units count: 2417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll1.j(w0a$a, kw5, long, androidx.media3.common.DrmInitData, boolean, boolean, ru5):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
    
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c5, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cc, code lost:
    
        if (r0 != 6516084) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ce, code lost:
    
        r0 = r1.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d9, code lost:
    
        if (r1.j() != 1684108385) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01db, code lost:
    
        r1.K(8);
        r0 = r1.t(r0 - 16);
        r8 = new defpackage.jc2("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f0, code lost:
    
        defpackage.zkd.T("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.w0a.a(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0201, code lost:
    
        if (r0 == 7233901) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0206, code lost:
    
        if (r0 != 7631467) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020d, code lost:
    
        if (r0 == 6516589) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0212, code lost:
    
        if (r0 != 7828084) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0218, code lost:
    
        if (r0 != 6578553) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021a, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0224, code lost:
    
        if (r0 != 4280916) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0226, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0230, code lost:
    
        if (r0 != 7630703) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0232, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023c, code lost:
    
        if (r0 != 6384738) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r1.J(r7);
        r7 = r7 + r13;
        r1.K(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023e, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0249, code lost:
    
        if (r0 != 7108978) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024b, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0256, code lost:
    
        if (r0 != 6776174) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0258, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0261, code lost:
    
        if (r0 != 6779504) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0263, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026b, code lost:
    
        defpackage.zkd.u("MetadataUtil", "Skipped unknown metadata entry: ".concat(defpackage.w0a.a(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0276, code lost:
    
        r1.J(r15);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027b, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0283, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x028b, code lost:
    
        if (r8 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028d, code lost:
    
        r6.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0290, code lost:
    
        r3 = r17;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0297, code lost:
    
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x029a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r13 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x029b, code lost:
    
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a1, code lost:
    
        if (r6.isEmpty() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a5, code lost:
    
        r12 = new defpackage.js9(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r15 = r1.j() + r13;
        r13 = r1.j();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        r0 = defpackage.jr6.a(defpackage.ts9.d(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        r8 = new defpackage.ohf("TCON", r12, defpackage.e47.n(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        defpackage.zkd.T("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r1.J(r15);
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r8 = defpackage.ts9.c(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r8 = defpackage.ts9.c(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        r8 = defpackage.ts9.e(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        r8 = defpackage.ts9.e(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        r8 = defpackage.ts9.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
    
        r8 = defpackage.ts9.e(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0135, code lost:
    
        r8 = defpackage.ts9.e(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0142, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        r8 = defpackage.ts9.f(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        if (r13 != 757935405) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0160, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        if (r13 >= r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        r14 = r1.j();
        r12 = r1.j();
        r17 = r3;
        r1.K(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0175, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0177, code lost:
    
        r0 = r1.t(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0181, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        r8 = r1.t(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018d, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018f, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0191, code lost:
    
        r1.K(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0196, code lost:
    
        r3 = r17 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019a, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019c, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019e, code lost:
    
        if (r8 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a1, code lost:
    
        if (r9 != (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a4, code lost:
    
        r1.J(r9);
        r1.K(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b7, code lost:
    
        r8 = new defpackage.si7(r0, r8, r1.t(r10 - 16));
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.js9 k(w0a.b r18) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll1.k(w0a$b):js9");
    }
}
