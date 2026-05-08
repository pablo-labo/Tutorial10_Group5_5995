package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.exoplayer.dash.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dye;
import defpackage.e47;
import defpackage.n6c;
import defpackage.w0a;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ps5 implements m55 {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.a P;
    public long A;
    public long B;
    public b C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public o55 I;
    public zpf[] J;
    public zpf[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final dye.a a;
    public final int b;
    public final List<androidx.media3.common.a> c;
    public final byte[] h;
    public final g4b i;
    public final qmf j;
    public final a2d o;
    public final zpf p;
    public final h00 q;
    public qyc r;
    public int s;
    public int t;
    public long u;
    public int v;
    public g4b w;
    public long x;
    public int y;
    public long z;
    public final d73 k = new d73();
    public final g4b l = new g4b(16);
    public final g4b e = new g4b(m8a.a);
    public final g4b f = new g4b(6);
    public final g4b g = new g4b();
    public final ArrayDeque<w0a.a> m = new ArrayDeque<>();
    public final ArrayDeque<a> n = new ArrayDeque<>();
    public final SparseArray<b> d = new SparseArray<>();

    public static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(int i, long j, boolean z) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    public static final class b {
        public final zpf a;
        public aqf d;
        public bq3 e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final androidx.media3.common.a j;
        public boolean m;
        public final vpf b = new vpf();
        public final g4b c = new g4b();
        public final g4b k = new g4b(1);
        public final g4b l = new g4b();

        public b(zpf zpfVar, aqf aqfVar, bq3 bq3Var, androidx.media3.common.a aVar) {
            this.a = zpfVar;
            this.d = aqfVar;
            this.e = bq3Var;
            this.j = aVar;
            this.d = aqfVar;
            this.e = bq3Var;
            zpfVar.d(aVar);
            e();
        }

        public final int a() {
            int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
            return b() != null ? 1073741824 | i : i;
        }

        public final upf b() {
            if (!this.m) {
                return null;
            }
            vpf vpfVar = this.b;
            bq3 bq3Var = vpfVar.a;
            String str = vjg.a;
            int i = bq3Var.a;
            upf upfVar = vpfVar.m;
            if (upfVar == null) {
                upfVar = this.d.a.l[i];
            }
            if (upfVar == null || !upfVar.a) {
                return null;
            }
            return upfVar;
        }

        public final boolean c() {
            this.f++;
            if (!this.m) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public final int d(int i, int i2) {
            g4b g4bVar;
            upf upfVarB = b();
            if (upfVarB == null) {
                return 0;
            }
            int length = upfVarB.d;
            vpf vpfVar = this.b;
            if (length != 0) {
                g4bVar = vpfVar.n;
            } else {
                byte[] bArr = upfVarB.e;
                String str = vjg.a;
                int length2 = bArr.length;
                g4b g4bVar2 = this.l;
                g4bVar2.H(length2, bArr);
                length = bArr.length;
                g4bVar = g4bVar2;
            }
            boolean z = vpfVar.k && vpfVar.l[this.f];
            boolean z2 = z || i2 != 0;
            g4b g4bVar3 = this.k;
            g4bVar3.a[0] = (byte) ((z2 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0) | length);
            g4bVar3.J(0);
            zpf zpfVar = this.a;
            zpfVar.b(g4bVar3, 1, 1);
            zpfVar.b(g4bVar, length, 1);
            if (!z2) {
                return length + 1;
            }
            g4b g4bVar4 = this.c;
            if (!z) {
                g4bVar4.G(8);
                byte[] bArr2 = g4bVar4.a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = 0;
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                zpfVar.b(g4bVar4, 8, 1);
                return length + 9;
            }
            g4b g4bVar5 = vpfVar.n;
            int iD = g4bVar5.D();
            g4bVar5.K(-2);
            int i3 = (iD * 6) + 2;
            if (i2 != 0) {
                g4bVar4.G(i3);
                byte[] bArr3 = g4bVar4.a;
                g4bVar5.h(0, bArr3, i3);
                int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i4 >> 8) & 255);
                bArr3[3] = (byte) (i4 & 255);
            } else {
                g4bVar4 = g4bVar5;
            }
            zpfVar.b(g4bVar4, i3, 1);
            return length + 1 + i3;
        }

        public final void e() {
            vpf vpfVar = this.b;
            vpfVar.d = 0;
            vpfVar.p = 0L;
            vpfVar.q = false;
            vpfVar.k = false;
            vpfVar.o = false;
            vpfVar.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.m = false;
        }
    }

    static {
        a.C0036a c0036a = new a.C0036a();
        c0036a.m = st9.p("application/x-emsg");
        P = new androidx.media3.common.a(c0036a);
    }

    public ps5(dye.a aVar, int i, qmf qmfVar, List list, d.c cVar) {
        this.a = aVar;
        this.b = i;
        this.j = qmfVar;
        this.c = Collections.unmodifiableList(list);
        this.p = cVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new g4b(bArr);
        e47.b bVar = e47.b;
        this.r = qyc.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = o55.n;
        this.J = new zpf[0];
        this.K = new zpf[0];
        this.o = new a2d(new g9(this, 4));
        this.q = new h00(2);
        this.N = -1L;
    }

    public static DrmInitData e(List<w0a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            w0a.b bVar = list.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.b.a;
                n6c.a aVarB = n6c.b(bArr);
                UUID uuid = aVarB == null ? null : aVarB.a;
                if (uuid == null) {
                    zkd.T("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void g(g4b g4bVar, int i, vpf vpfVar) throws ParserException {
        g4bVar.J(i + 8);
        int iJ = g4bVar.j();
        byte[] bArr = ll1.a;
        if ((iJ & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iJ & 2) != 0;
        int iB = g4bVar.B();
        if (iB == 0) {
            Arrays.fill(vpfVar.l, 0, vpfVar.e, false);
            return;
        }
        int i2 = vpfVar.e;
        g4b g4bVar2 = vpfVar.n;
        if (iB != i2) {
            StringBuilder sbG = o6.g(iB, "Senc sample count ", " is different from fragment sample count");
            sbG.append(vpfVar.e);
            throw ParserException.a(null, sbG.toString());
        }
        Arrays.fill(vpfVar.l, 0, iB, z);
        g4bVar2.G(g4bVar.a());
        vpfVar.k = true;
        vpfVar.o = true;
        g4bVar.h(0, g4bVar2.a, g4bVar2.c);
        g4bVar2.J(0);
        vpfVar.o = false;
    }

    public static Pair h(long j, g4b g4bVar) throws ParserException {
        long jC;
        long jC2;
        g4b g4bVar2 = g4bVar;
        g4bVar2.J(8);
        int iE = ll1.e(g4bVar2.j());
        g4bVar2.K(4);
        long jZ = g4bVar2.z();
        if (iE == 0) {
            jC = g4bVar2.z();
            jC2 = g4bVar2.z();
        } else {
            jC = g4bVar2.C();
            jC2 = g4bVar2.C();
        }
        long j2 = jC2 + j;
        String str = vjg.a;
        long jX = vjg.X(jC, 1000000L, jZ, RoundingMode.DOWN);
        g4bVar2.K(2);
        int iD = g4bVar2.D();
        int[] iArr = new int[iD];
        long[] jArr = new long[iD];
        long[] jArr2 = new long[iD];
        long[] jArr3 = new long[iD];
        long j3 = j2;
        long j4 = jX;
        int i = 0;
        while (i < iD) {
            int iJ = g4bVar2.j();
            if ((Integer.MIN_VALUE & iJ) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jZ2 = g4bVar2.z();
            iArr[i] = iJ & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jC += jZ2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jX2 = vjg.X(jC, 1000000L, jZ, RoundingMode.DOWN);
            jArr4[i] = jX2 - jArr5[i];
            g4bVar2.K(4);
            j3 += (long) iArr[i];
            i++;
            iD = iD;
            g4bVar2 = g4bVar;
            j4 = jX2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jX), new n42(iArr, jArr, jArr2, jArr3));
    }

    public final void a() {
        this.s = 0;
        this.v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e3, code lost:
    
        if (r32.E >= r32.D) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e5, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
    
        if (r2 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
    
        if (r32.K.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        if (r32.G != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f2, code lost:
    
        r2 = defpackage.m8a.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0202, code lost:
    
        if ((r4 + r2) > (r32.D - r32.E)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0207, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0208, code lost:
    
        r33.readFully(r15, r6, r4 + r2);
        r9.J(0);
        r19 = r9.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0215, code lost:
    
        if (r19 < 0) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0217, code lost:
    
        r32.F = r19 - r2;
        r13 = r32.e;
        r25 = r4;
        r13.J(0);
        r5.f(4, r13);
        r32.E += 4;
        r32.D += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0234, code lost:
    
        if (r32.K.length <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        if (r2 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0238, code lost:
    
        r13 = r15[4];
        r4 = r8.n;
        r20 = r6;
        r6 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0244, code lost:
    
        if (java.util.Objects.equals(r4, r12) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024a, code lost:
    
        if (defpackage.st9.c(r6, r12) == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0251, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0256, code lost:
    
        if ((r13 & 31) == 6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0258, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0260, code lost:
    
        if (java.util.Objects.equals(r8.n, r12) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0266, code lost:
    
        if (defpackage.st9.c(r6, r12) == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0270, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0273, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0275, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0277, code lost:
    
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027e, code lost:
    
        r32.H = r4;
        r5.f(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0288, code lost:
    
        if (r2 <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028c, code lost:
    
        if (r32.G != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0292, code lost:
    
        if (defpackage.m8a.c(r15, r2, r8) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0294, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0297, code lost:
    
        r34 = r12;
        r6 = r20;
        r2 = r22;
        r4 = r25;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02aa, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ab, code lost:
    
        r25 = r4;
        r20 = r6;
        r26 = r12;
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b5, code lost:
    
        if (r32.H == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b7, code lost:
    
        r4 = r32.g;
        r4.G(r2);
        r33.readFully(r4.a, 0, r32.F);
        r5.f(r32.F, r4);
        r2 = r32.F;
        r2 = defpackage.m8a.l(r4.c, r4.a);
        r4.J(0);
        r4.I(r2);
        r2 = r8.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02de, code lost:
    
        if (r2 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e2, code lost:
    
        if (r7.e == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e4, code lost:
    
        r7.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ea, code lost:
    
        if (r7.e == r2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ec, code lost:
    
        r7.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ef, code lost:
    
        r7.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fb, code lost:
    
        if ((r22.a() & 4) == 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02fd, code lost:
    
        r7.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0300, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0303, code lost:
    
        r2 = r5.c(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030a, code lost:
    
        r32.E += r2;
        r32.F -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0315, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0317, code lost:
    
        r2 = r32.E;
        r4 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031b, code lost:
    
        if (r2 >= r4) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031d, code lost:
    
        r32.E += r5.c(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0329, code lost:
    
        r1 = r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032f, code lost:
    
        if (r32.G != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0331, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0334, code lost:
    
        r28 = r1;
        r1 = r22.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033a, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033c, code lost:
    
        r31 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0341, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0343, code lost:
    
        r26 = r10;
        r5.a(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0354, code lost:
    
        if (r3.isEmpty() != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0356, code lost:
    
        r1 = r3.removeFirst();
        r32.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0367, code lost:
    
        if (r1.b == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0369, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x036b, code lost:
    
        if (r14 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x036d, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0371, code lost:
    
        r7 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0376, code lost:
    
        if (r5 >= r4) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0378, code lost:
    
        r2[r5].a(r7, 1, r1.c, r32.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x038a, code lost:
    
        if (r22.c() != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x038c, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x038f, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0394, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r5 = r2.a;
        r6 = r2.b;
        r12 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r32.s != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        if (r2.m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        r9 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        r32.D = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (java.util.Objects.equals(r9.n, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        if (java.util.Objects.equals(r9.n, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        if ((r4 & com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        r32.G = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (r2.f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r33.n(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        r3 = r6.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r3.K(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        if (r6.k == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        if (r6.l[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
    
        r3.K(r3.D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
    
        if (r2.d.a.h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        r32.D -= 8;
        r33.n(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016c, code lost:
    
        r4 = "audio/ac4".equals(r2.d.a.g.n);
        r9 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        if (r4 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017e, code lost:
    
        r32.E = r2.d(r9, 7);
        defpackage.o5.a(r32.D, r8);
        r5.f(7, r8);
        r32.E += 7;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        r4 = 0;
        r32.E = r2.d(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
    
        r32.D += r32.E;
        r32.s = 4;
        r32.F = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a8, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ae, code lost:
    
        if (r2.m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b0, code lost:
    
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b6, code lost:
    
        r34 = "video/hevc";
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ba, code lost:
    
        r15 = r6.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c1, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c3, code lost:
    
        r10 = r14.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c7, code lost:
    
        r4 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cb, code lost:
    
        if (r4 == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cd, code lost:
    
        r9 = r32.f;
        r15 = r9.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dd, code lost:
    
        r22 = r2;
     */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r33, defpackage.dhb r34) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 2290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps5.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        qyc qycVarN;
        tme tmeVarK0 = u63.k0(n55Var, true, false);
        if (tmeVarK0 != null) {
            qycVarN = e47.n(tmeVarK0);
        } else {
            e47.b bVar = e47.b;
            qycVarN = qyc.e;
        }
        this.r = qycVarN;
        return tmeVarK0 == null;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        SparseArray<b> sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).e();
        }
        this.n.clear();
        this.y = 0;
        this.o.d.clear();
        this.z = j2;
        this.m.clear();
        a();
    }

    @Override // defpackage.m55
    public final List i() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x07ed, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x07f0, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0703  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r54) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 2033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps5.j(long):void");
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            o55Var = new eye(o55Var, this.a);
        }
        this.I = o55Var;
        a();
        zpf[] zpfVarArr = new zpf[2];
        this.J = zpfVarArr;
        int i3 = 0;
        zpf zpfVar = this.p;
        if (zpfVar != null) {
            zpfVarArr[0] = zpfVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            zpfVarArr[i] = this.I.o(100, 5);
            i4 = 101;
            i++;
        }
        zpf[] zpfVarArr2 = (zpf[]) vjg.Q(i, this.J);
        this.J = zpfVarArr2;
        for (zpf zpfVar2 : zpfVarArr2) {
            zpfVar2.d(P);
        }
        List<androidx.media3.common.a> list = this.c;
        this.K = new zpf[list.size()];
        while (i3 < this.K.length) {
            zpf zpfVarO = this.I.o(i4, 3);
            zpfVarO.d(list.get(i3));
            this.K[i3] = zpfVarO;
            i3++;
            i4++;
        }
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
