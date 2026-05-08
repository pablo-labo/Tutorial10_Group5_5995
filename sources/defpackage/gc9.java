package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.h;
import defpackage.dqf;
import defpackage.e47;
import defpackage.hr3;
import defpackage.j3;
import defpackage.ka;
import defpackage.p35;
import defpackage.wqf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class gc9 extends fqf {

    public static final class a {
        public final int a;
        public final int[] b;
        public final xpf[] c;
        public final int[] d;
        public final int[][][] e;
        public final xpf f;

        public a(int[] iArr, xpf[] xpfVarArr, int[] iArr2, int[][][] iArr3, xpf xpfVar) {
            this.b = iArr;
            this.c = xpfVarArr;
            this.e = iArr3;
            this.d = iArr2;
            this.f = xpfVar;
            this.a = iArr.length;
        }
    }

    @Override // defpackage.fqf
    public final void c(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v55, types: [wpf] */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [hr3$c] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r14v36, types: [p35$a] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p35$a[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r6v64, types: [p35$a] */
    /* JADX WARN: Type inference failed for: r8v21, types: [p35$a] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.fqf
    public final gqf e(l[] lVarArr, xpf xpfVar, h.b bVar, emf emfVar) throws Throwable {
        final hr3.d dVar;
        int i;
        final ?? r5;
        final String str;
        Pair pairM;
        Throwable th;
        Pair pairM2;
        Object languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        ?? M;
        long j;
        int[][][] iArr;
        qyc qycVarF;
        boolean z;
        qyc qycVarN;
        int i2;
        int[] iArr2;
        int i3;
        int[][][] iArr3;
        int i4;
        Throwable th2;
        int i5;
        int[] iArr4;
        Object aVar;
        int[][] iArr5;
        int[] iArr6;
        Context context;
        int[] iArr7;
        xpf xpfVar2 = xpfVar;
        int i6 = 1;
        int[] iArr8 = new int[lVarArr.length + 1];
        int length = lVarArr.length + 1;
        wpf[][] wpfVarArr = new wpf[length][];
        int[][][] iArr9 = new int[lVarArr.length + 1][][];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = xpfVar2.a;
            wpfVarArr[i7] = new wpf[i8];
            iArr9[i7] = new int[i8][];
        }
        int length2 = lVarArr.length;
        final int[] iArr10 = new int[length2];
        for (int i9 = 0; i9 < length2; i9++) {
            iArr10[i9] = lVarArr[i9].y();
        }
        int i10 = 0;
        while (i10 < xpfVar2.a) {
            wpf wpfVarA = xpfVar2.a(i10);
            int i11 = wpfVarA.c == 5 ? i6 : 0;
            int length3 = lVarArr.length;
            int i12 = i6;
            int i13 = 0;
            int i14 = 0;
            while (i13 < lVarArr.length) {
                l lVar = lVarArr[i13];
                int i15 = i6;
                int iMax = 0;
                for (int i16 = 0; i16 < wpfVarA.a; i16++) {
                    iMax = Math.max(iMax, lVar.a(wpfVarA.d[i16]) & 7);
                }
                int i17 = iArr8[i13] == 0 ? i15 : 0;
                if (iMax > i14 || (iMax == i14 && i11 != 0 && i12 == 0 && i17 != 0)) {
                    i12 = i17;
                    i14 = iMax;
                    length3 = i13;
                }
                i13++;
                i6 = i15;
            }
            int i18 = i6;
            if (length3 == lVarArr.length) {
                iArr7 = new int[wpfVarA.a];
            } else {
                l lVar2 = lVarArr[length3];
                int[] iArr11 = new int[wpfVarA.a];
                for (int i19 = 0; i19 < wpfVarA.a; i19++) {
                    iArr11[i19] = lVar2.a(wpfVarA.d[i19]);
                }
                iArr7 = iArr11;
            }
            int i20 = iArr8[length3];
            wpfVarArr[length3][i20] = wpfVarA;
            iArr9[length3][i20] = iArr7;
            iArr8[length3] = i20 + 1;
            i10++;
            xpfVar2 = xpfVar;
            i6 = i18;
        }
        int i21 = i6;
        int i22 = 0;
        xpf[] xpfVarArr = new xpf[lVarArr.length];
        String[] strArr = new String[lVarArr.length];
        int[] iArr12 = new int[lVarArr.length];
        for (int i23 = 0; i23 < lVarArr.length; i23++) {
            int i24 = iArr8[i23];
            xpfVarArr[i23] = new xpf((wpf[]) vjg.Q(i24, wpfVarArr[i23]));
            iArr9[i23] = (int[][]) vjg.Q(i24, iArr9[i23]);
            strArr[i23] = lVarArr[i23].getName();
            iArr12[i23] = ((b) lVarArr[i23]).b;
        }
        a aVar2 = new a(iArr12, xpfVarArr, iArr10, iArr9, new xpf((wpf[]) vjg.Q(iArr8[lVarArr.length], wpfVarArr[lVarArr.length])));
        final hr3 hr3Var = (hr3) this;
        synchronized (hr3Var.c) {
            hr3Var.g = Thread.currentThread();
            dVar = hr3Var.f;
        }
        if (hr3Var.j == null && (context = hr3Var.d) != null) {
            hr3Var.j = Boolean.valueOf(vjg.M(context));
        }
        if (dVar.s0 && Build.VERSION.SDK_INT >= 32 && hr3Var.h == null) {
            hr3Var.h = new hr3.f(hr3Var.d, hr3Var, hr3Var.j);
        }
        int i25 = aVar2.a;
        Context context2 = hr3Var.d;
        ?? r4 = new p35.a[i25];
        int i26 = 0;
        while (true) {
            i = 2;
            if (i26 >= aVar2.a) {
                r5 = 0;
                break;
            }
            if (2 == iArr12[i26] && xpfVarArr[i26].a > 0) {
                r5 = i21;
                break;
            }
            i26++;
        }
        Pair pairM3 = hr3.m(i21, aVar2, iArr9, new hr3.h.a() { // from class: er3
            @Override // hr3.h.a
            public final qyc g(int i27, wpf wpfVar, int[] iArr13) {
                hr3 hr3Var2 = hr3Var;
                hr3Var2.getClass();
                hr3.d dVar2 = dVar;
                gr3 gr3Var = new gr3(hr3Var2, dVar2);
                int i28 = iArr10[i27];
                e47.b bVar2 = e47.b;
                e47.a aVar3 = new e47.a();
                for (int i29 = 0; i29 < wpfVar.a; i29++) {
                    aVar3.c(new hr3.a(i27, wpfVar, i29, dVar2, iArr13[i29], r5, gr3Var, i28));
                }
                return aVar3.f();
            }
        }, new y33(i21));
        if (pairM3 != null) {
            r4[((Integer) pairM3.second).intValue()] = (p35.a) pairM3.first;
        }
        if (pairM3 == null) {
            str = null;
        } else {
            p35.a aVar3 = (p35.a) pairM3.first;
            str = aVar3.a.d[aVar3.b[0]].d;
        }
        dqf.a aVar4 = dVar.u;
        if (aVar4.a == 2) {
            pairM = null;
        } else {
            final Point pointW = (!dVar.k || context2 == null) ? null : vjg.w(context2);
            pairM = hr3.m(2, aVar2, iArr9, new hr3.h.a() { // from class: dr3
                /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
                @Override // hr3.h.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final defpackage.qyc g(int r17, defpackage.wpf r18, int[] r19) {
                    /*
                        r16 = this;
                        r0 = r16
                        r3 = r18
                        int[] r1 = r3
                        r8 = r1[r17]
                        hr3$d r5 = r1
                        android.graphics.Point r1 = r4
                        if (r1 == 0) goto L11
                        int r2 = r1.x
                        goto L13
                    L11:
                        int r2 = r5.i
                    L13:
                        if (r1 == 0) goto L18
                        int r1 = r1.y
                        goto L1a
                    L18:
                        int r1 = r5.j
                    L1a:
                        boolean r4 = r5.l
                        r10 = 2147483647(0x7fffffff, float:NaN)
                        if (r2 == r10) goto L84
                        if (r1 != r10) goto L25
                        goto L84
                    L25:
                        r7 = r10
                        r6 = 0
                    L27:
                        int r9 = r3.a
                        if (r6 >= r9) goto L82
                        androidx.media3.common.a[] r9 = r3.d
                        r9 = r9[r6]
                        int r13 = r9.u
                        int r14 = r9.v
                        if (r13 <= 0) goto L7c
                        if (r14 <= 0) goto L7c
                        if (r4 == 0) goto L48
                        if (r13 <= r14) goto L3d
                        r15 = 1
                        goto L3e
                    L3d:
                        r15 = 0
                    L3e:
                        if (r2 <= r1) goto L42
                        r11 = 1
                        goto L43
                    L42:
                        r11 = 0
                    L43:
                        if (r15 == r11) goto L48
                        r15 = r1
                        r11 = r2
                        goto L4a
                    L48:
                        r11 = r1
                        r15 = r2
                    L4a:
                        int r12 = r13 * r11
                        int r10 = r14 * r15
                        if (r12 < r10) goto L5a
                        android.graphics.Point r11 = new android.graphics.Point
                        int r10 = defpackage.vjg.f(r10, r13)
                        r11.<init>(r15, r10)
                        goto L64
                    L5a:
                        android.graphics.Point r10 = new android.graphics.Point
                        int r12 = defpackage.vjg.f(r12, r14)
                        r10.<init>(r12, r11)
                        r11 = r10
                    L64:
                        int r9 = r9.u
                        int r10 = r9 * r14
                        int r12 = r11.x
                        float r12 = (float) r12
                        r13 = 1065017672(0x3f7ae148, float:0.98)
                        float r12 = r12 * r13
                        int r12 = (int) r12
                        if (r9 < r12) goto L7c
                        int r9 = r11.y
                        float r9 = (float) r9
                        float r9 = r9 * r13
                        int r9 = (int) r9
                        if (r14 < r9) goto L7c
                        if (r10 >= r7) goto L7c
                        r7 = r10
                    L7c:
                        int r6 = r6 + 1
                        r10 = 2147483647(0x7fffffff, float:NaN)
                        goto L27
                    L82:
                        r10 = r7
                        goto L87
                    L84:
                        r10 = 2147483647(0x7fffffff, float:NaN)
                    L87:
                        e47$a r11 = new e47$a
                        r11.<init>()
                        r4 = 0
                    L8d:
                        int r1 = r3.a
                        if (r4 >= r1) goto Lc3
                        androidx.media3.common.a[] r1 = r3.d
                        r1 = r1[r4]
                        int r2 = r1.u
                        r6 = -1
                        if (r2 == r6) goto La4
                        int r1 = r1.v
                        if (r1 != r6) goto L9f
                        goto La4
                    L9f:
                        int r2 = r2 * r1
                    La0:
                        r12 = 2147483647(0x7fffffff, float:NaN)
                        goto La6
                    La4:
                        r2 = r6
                        goto La0
                    La6:
                        if (r10 == r12) goto Laf
                        if (r2 == r6) goto Lad
                        if (r2 > r10) goto Lad
                        goto Laf
                    Lad:
                        r9 = 0
                        goto Lb0
                    Laf:
                        r9 = 1
                    Lb0:
                        hr3$i r1 = new hr3$i
                        r6 = r19[r4]
                        java.lang.String r7 = r2
                        r2 = r17
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                        r11.c(r1)
                        int r4 = r4 + 1
                        r3 = r18
                        goto L8d
                    Lc3:
                        qyc r0 = r11.f()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dr3.g(int, wpf, int[]):qyc");
                }
            }, new v23(1));
        }
        int i27 = 4;
        if ((dVar.A || pairM == null) && aVar4.a != 2) {
            th = null;
            pairM2 = hr3.m(4, aVar2, iArr9, new r91(dVar), new cr3());
        } else {
            th = null;
            pairM2 = null;
        }
        if (pairM2 != null) {
            r4[((Integer) pairM2.second).intValue()] = (p35.a) pairM2.first;
        } else if (pairM != null) {
            r4[((Integer) pairM.second).intValue()] = (p35.a) pairM.first;
        }
        int i28 = 3;
        if (aVar4.a == 2) {
            M = th;
        } else {
            if (!dVar.x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = th;
            } else {
                String str2 = vjg.a;
                languageTag = locale.toLanguageTag();
            }
            M = hr3.m(3, aVar2, iArr9, new fr3(dVar, str, languageTag), new c90(1));
        }
        if (M != 0) {
            r4[((Integer) ((Pair) M).second).intValue()] = (p35.a) ((Pair) M).first;
        }
        int i29 = 0;
        while (i29 < i25) {
            int i30 = iArr12[i29];
            if (i30 == i || i30 == 1 || i30 == i28 || i30 == i27) {
                i5 = i29;
                iArr4 = iArr12;
            } else {
                xpf xpfVar3 = xpfVarArr[i29];
                int[][] iArr13 = iArr9[i29];
                if (aVar4.a == i) {
                    i5 = i29;
                    iArr4 = iArr12;
                } else {
                    Throwable th3 = th;
                    ?? r17 = th3;
                    int i31 = i22;
                    int i32 = i31;
                    ?? r10 = th3;
                    while (i31 < xpfVar3.a) {
                        wpf wpfVarA2 = xpfVar3.a(i31);
                        int[] iArr14 = iArr13[i31];
                        int i33 = i29;
                        ?? r12 = r17;
                        int i34 = i32;
                        ?? r16 = r10;
                        int i35 = i22;
                        while (i35 < wpfVarA2.a) {
                            xpf xpfVar4 = xpfVar3;
                            if (l.d(iArr14[i35], dVar.t0)) {
                                iArr5 = iArr13;
                                hr3.c cVar = new hr3.c(wpfVarA2.d[i35], iArr14[i35]);
                                if (r12 != 0) {
                                    iArr6 = iArr12;
                                    if (id2.a.c(cVar.b, r12.b).c(cVar.a, r12.a).e() > 0) {
                                    }
                                } else {
                                    iArr6 = iArr12;
                                }
                                r12 = cVar;
                                i34 = i35;
                                r16 = wpfVarA2;
                            } else {
                                iArr5 = iArr13;
                                iArr6 = iArr12;
                            }
                            i35++;
                            xpfVar3 = xpfVar4;
                            iArr13 = iArr5;
                            iArr12 = iArr6;
                            r12 = r12;
                            r16 = r16;
                        }
                        i31++;
                        r10 = r16;
                        i32 = i34;
                        i29 = i33;
                        r17 = r12;
                    }
                    i5 = i29;
                    iArr4 = iArr12;
                    if (r10 != 0) {
                        aVar = new p35.a(i22, r10, new int[]{i32});
                    }
                    r4[i5] = aVar;
                }
                aVar = th;
                r4[i5] = aVar;
            }
            i29 = i5 + 1;
            iArr12 = iArr4;
            i22 = 0;
            i28 = 3;
            i = 2;
            i27 = 4;
        }
        int i36 = aVar2.a;
        xpf[] xpfVarArr2 = aVar2.c;
        HashMap map = new HashMap();
        for (int i37 = 0; i37 < i36; i37++) {
            hr3.h(xpfVarArr2[i37], dVar, map);
        }
        hr3.h(aVar2.f, dVar, map);
        for (int i38 = 0; i38 < i36; i38++) {
            cqf cqfVar = (cqf) map.get(Integer.valueOf(aVar2.b[i38]));
            if (cqfVar != null) {
                wpf wpfVar = cqfVar.a;
                e47<Integer> e47Var = cqfVar.b;
                r4[i38] = (e47Var.isEmpty() || xpfVarArr2[i38].b(wpfVar) == -1) ? th : new p35.a(0, wpfVar, bm7.P1(e47Var));
            }
        }
        int i39 = aVar2.a;
        for (int i40 = 0; i40 < i39; i40++) {
            xpf xpfVar5 = aVar2.c[i40];
            Map<xpf, hr3.e> map2 = dVar.v0.get(i40);
            if (map2 != null && map2.containsKey(xpfVar5)) {
                Map<xpf, hr3.e> map3 = dVar.v0.get(i40);
                if ((map3 != null ? (hr3.e) map3.get(xpfVar5) : th) != null) {
                    throw th;
                }
                r4[i40] = th;
            }
        }
        for (int i41 = 0; i41 < i25; i41++) {
            int i42 = aVar2.b[i41];
            if (dVar.w0.get(i41) || dVar.E.contains(Integer.valueOf(i42))) {
                r4[i41] = th;
            }
        }
        ka.b bVar2 = hr3Var.e;
        k81 k81Var = hr3Var.b;
        ka2.r(k81Var);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i43 = 0;
        while (i43 < r4.length) {
            ?? r6 = r4[i43];
            if (r6 == 0 || r6.b.length <= 1) {
                th2 = th;
                arrayList.add(th2);
            } else {
                e47.b bVar3 = e47.b;
                e47.a aVar5 = new e47.a();
                aVar5.c(new ka.a(0L, 0L));
                arrayList.add(aVar5);
                th2 = th;
            }
            i43++;
            th = th2;
        }
        int length4 = r4.length;
        long[][] jArr = new long[length4][];
        int i44 = 0;
        while (true) {
            j = -1;
            if (i44 >= r4.length) {
                break;
            }
            ?? r14 = r4[i44];
            if (r14 == 0) {
                jArr[i44] = new long[0];
                i4 = i44;
            } else {
                int[] iArr15 = r14.b;
                jArr[i44] = new long[iArr15.length];
                int i45 = 0;
                while (i45 < iArr15.length) {
                    int i46 = i44;
                    long j2 = r14.a.d[iArr15[i45]].j;
                    long[] jArr2 = jArr[i46];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i45] = j2;
                    i45++;
                    i44 = i46;
                }
                i4 = i44;
                Arrays.sort(jArr[i4]);
            }
            i44 = i4 + 1;
        }
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i47 = 0; i47 < length4; i47++) {
            long[] jArr4 = jArr[i47];
            jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        ka.t(arrayList, jArr3);
        kaa kaaVar = kaa.a;
        kaaVar.getClass();
        wg2.o(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(kaaVar);
        e2a e2aVar = new e2a();
        f2a f2aVar = new f2a(treeMap);
        f2aVar.f = e2aVar;
        int i48 = 0;
        loop19: while (true) {
            if (i48 < length4) {
                long[] jArr5 = jArr[i48];
                long j3 = j;
                if (jArr5.length <= 1) {
                    i2 = length4;
                    iArr2 = iArr16;
                    i3 = i48;
                    iArr3 = iArr9;
                } else {
                    int length5 = jArr5.length;
                    double[] dArr = new double[length5];
                    i2 = length4;
                    int i49 = 0;
                    while (true) {
                        long[] jArr6 = jArr[i48];
                        iArr2 = iArr16;
                        double dLog = 0.0d;
                        if (i49 >= jArr6.length) {
                            break;
                        }
                        int i50 = i48;
                        int[][][] iArr17 = iArr9;
                        long j4 = jArr6[i49];
                        if (j4 != j3) {
                            dLog = Math.log(j4);
                        }
                        dArr[i49] = dLog;
                        i49++;
                        iArr9 = iArr17;
                        iArr16 = iArr2;
                        i48 = i50;
                    }
                    i3 = i48;
                    int[][][] iArr18 = iArr9;
                    int i51 = length5 - 1;
                    double d = dArr[i51] - dArr[0];
                    int i52 = 0;
                    while (i52 < i51) {
                        double d2 = dArr[i52];
                        int i53 = i52 + 1;
                        Object objValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i53]) * 0.5d) - dArr[0]) / d);
                        Integer numValueOf = Integer.valueOf(i3);
                        iArr = iArr18;
                        Collection collection = (Collection) f2aVar.d.get(objValueOf);
                        if (collection == null) {
                            Collection collectionC = f2aVar.c();
                            if (!collectionC.add(numValueOf)) {
                                g7.l("New Collection violated the Collection spec");
                                qycVarF = null;
                                break loop19;
                            }
                            f2aVar.e++;
                            f2aVar.d.put((K) objValueOf, (Collection<V>) collectionC);
                        } else if (collection.add(numValueOf)) {
                            f2aVar.e++;
                        }
                        i52 = i53;
                        iArr18 = iArr;
                    }
                    iArr3 = iArr18;
                }
                i48 = i3 + 1;
                length4 = i2;
                j = j3;
                iArr16 = iArr2;
                iArr9 = iArr3;
            } else {
                int[] iArr19 = iArr16;
                iArr = iArr9;
                Collection aVar6 = f2aVar.b;
                if (aVar6 == null) {
                    aVar6 = new j3.a(f2aVar);
                    f2aVar.b = aVar6;
                }
                e47 e47VarJ = e47.j(aVar6);
                for (int i54 = 0; i54 < e47VarJ.size(); i54++) {
                    int iIntValue = ((Integer) e47VarJ.get(i54)).intValue();
                    int i55 = iArr19[iIntValue] + 1;
                    iArr19[iIntValue] = i55;
                    jArr3[iIntValue] = jArr[iIntValue][i55];
                    ka.t(arrayList, jArr3);
                }
                for (int i56 = 0; i56 < r4.length; i56++) {
                    if (arrayList.get(i56) != null) {
                        jArr3[i56] = jArr3[i56] * 2;
                    }
                }
                ka.t(arrayList, jArr3);
                e47.a aVar7 = new e47.a();
                for (int i57 = 0; i57 < arrayList.size(); i57++) {
                    e47.a aVar8 = (e47.a) arrayList.get(i57);
                    aVar7.c(aVar8 == null ? qyc.e : aVar8.f());
                }
                qycVarF = aVar7.f();
            }
        }
        p35[] p35VarArr = new p35[r4.length];
        for (int i58 = 0; i58 < r4.length; i58++) {
            ?? r8 = r4[i58];
            if (r8 != 0) {
                int[] iArr20 = r8.b;
                if (iArr20.length != 0) {
                    int length6 = iArr20.length;
                    wpf wpfVar2 = r8.a;
                    p35VarArr[i58] = length6 == 1 ? new sg5(wpfVar2, new int[]{iArr20[0]}) : new ka(wpfVar2, iArr20, k81Var, (e47) qycVarF.get(i58));
                }
            }
        }
        w1d[] w1dVarArr = new w1d[i25];
        for (int i59 = 0; i59 < i25; i59++) {
            w1dVarArr[i59] = (dVar.w0.get(i59) || dVar.E.contains(Integer.valueOf(aVar2.b[i59])) || (aVar2.b[i59] != -2 && p35VarArr[i59] == null)) ? null : w1d.c;
        }
        if (dVar.u.a != 0) {
            int i60 = 0;
            int i61 = -1;
            int i62 = 0;
            while (true) {
                if (i62 < aVar2.a) {
                    int i63 = aVar2.b[i62];
                    p35 p35Var = p35VarArr[i62];
                    if (i63 != 1 && p35Var != null) {
                        break;
                    }
                    if (i63 == 1 && p35Var != null && p35Var.length() == 1) {
                        if (hr3.l(dVar, iArr[i62][aVar2.c[i62].b(p35Var.m())][p35Var.f(0)], p35Var.q())) {
                            i60++;
                            i61 = i62;
                        }
                    }
                    i62++;
                } else if (i60 == 1) {
                    int i64 = dVar.u.b ? 1 : 2;
                    w1d w1dVar = w1dVarArr[i61];
                    w1dVarArr[i61] = new w1d(i64, w1dVar != null && w1dVar.b);
                }
            }
        }
        Pair pairCreate = Pair.create(w1dVarArr, p35VarArr);
        bqf[] bqfVarArr = (bqf[]) pairCreate.second;
        List[] listArr = new List[bqfVarArr.length];
        for (int i65 = 0; i65 < bqfVarArr.length; i65++) {
            bqf bqfVar = bqfVarArr[i65];
            if (bqfVar != null) {
                qycVarN = e47.n(bqfVar);
            } else {
                e47.b bVar4 = e47.b;
                qycVarN = qyc.e;
            }
            listArr[i65] = qycVarN;
        }
        e47.a aVar9 = new e47.a();
        int i66 = 0;
        while (true) {
            int i67 = aVar2.a;
            xpf[] xpfVarArr3 = aVar2.c;
            if (i66 >= i67) {
                break;
            }
            xpf xpfVar6 = xpfVarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < xpfVar6.a) {
                wpf wpfVarA3 = xpfVar6.a(i68);
                int i69 = xpfVarArr3[i66].a(i68).a;
                int[] iArr21 = new int[i69];
                int i70 = 0;
                for (int i71 = 0; i71 < i69; i71++) {
                    if ((aVar2.e[i66][i68][i71] & 7) == 4) {
                        iArr21[i70] = i71;
                        i70++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr21, i70);
                List[] listArr2 = listArr;
                int iMin = 16;
                int i72 = 0;
                boolean z2 = false;
                int i73 = 0;
                String str3 = null;
                while (i72 < iArrCopyOf.length) {
                    String str4 = xpfVarArr3[i66].a(i68).d[iArrCopyOf[i72]].n;
                    int i74 = i73 + 1;
                    if (i73 == 0) {
                        str3 = str4;
                    } else {
                        z2 = (!Objects.equals(str3, str4)) | z2;
                    }
                    iMin = Math.min(iMin, aVar2.e[i66][i68][i72] & 24);
                    i72++;
                    i73 = i74;
                }
                if (z2) {
                    iMin = Math.min(iMin, aVar2.d[i66]);
                }
                boolean z3 = iMin != 0;
                int i75 = wpfVarA3.a;
                int[] iArr22 = new int[i75];
                boolean[] zArr = new boolean[i75];
                for (int i76 = 0; i76 < wpfVarA3.a; i76++) {
                    iArr22[i76] = aVar2.e[i66][i68][i76] & 7;
                    int i77 = 0;
                    while (true) {
                        if (i77 >= list.size()) {
                            z = false;
                            break;
                        }
                        bqf bqfVar2 = (bqf) list.get(i77);
                        if (bqfVar2.m().equals(wpfVarA3) && bqfVar2.k(i76) != -1) {
                            z = true;
                            break;
                        }
                        i77++;
                    }
                    zArr[i76] = z;
                }
                aVar9.c(new wqf.a(wpfVarA3, z3, iArr22, zArr));
                i68++;
                listArr = listArr2;
            }
            i66++;
        }
        xpf xpfVar7 = aVar2.f;
        for (int i78 = 0; i78 < xpfVar7.a; i78++) {
            wpf wpfVarA4 = xpfVar7.a(i78);
            int[] iArr23 = new int[wpfVarA4.a];
            Arrays.fill(iArr23, 0);
            aVar9.c(new wqf.a(wpfVarA4, false, iArr23, new boolean[wpfVarA4.a]));
        }
        return new gqf((w1d[]) pairCreate.first, (p35[]) pairCreate.second, new wqf(aVar9.f()), aVar2);
    }
}
