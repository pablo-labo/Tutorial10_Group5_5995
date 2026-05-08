package defpackage;

import android.view.View;
import defpackage.ry3;
import defpackage.wp2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class gq2 {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final wp2 I;
    public final wp2 J;
    public final wp2 K;
    public final wp2 L;
    public final wp2 M;
    public final wp2 N;
    public final wp2 O;
    public final wp2 P;
    public final wp2[] Q;
    public final ArrayList<wp2> R;
    public final boolean[] S;
    public final a[] T;
    public gq2 U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int a0;
    public uz1 b;
    public int b0;
    public uz1 c;
    public int c0;
    public int d0;
    public float e0;
    public float f0;
    public View g0;
    public int h0;
    public String i0;
    public boolean j;
    public int j0;
    public boolean k;
    public int k0;
    public boolean l;
    public final float[] l0;
    public boolean m;
    public final gq2[] m0;
    public int n;
    public final gq2[] n0;
    public int o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public final int[] s;
    public int t;
    public int u;
    public float v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean a = false;
    public bk6 d = null;
    public kng e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("FIXED", 0);
            a = aVar;
            a aVar2 = new a("WRAP_CONTENT", 1);
            b = aVar2;
            a aVar3 = new a("MATCH_CONSTRAINT", 2);
            c = aVar3;
            a aVar4 = new a("MATCH_PARENT", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public gq2() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = 0;
        this.u = 0;
        this.v = 1.0f;
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = -1;
        this.A = 1.0f;
        this.B = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.C = 0.0f;
        this.D = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        wp2 wp2Var = new wp2(this, wp2.a.a);
        this.I = wp2Var;
        wp2 wp2Var2 = new wp2(this, wp2.a.b);
        this.J = wp2Var2;
        wp2 wp2Var3 = new wp2(this, wp2.a.c);
        this.K = wp2Var3;
        wp2 wp2Var4 = new wp2(this, wp2.a.d);
        this.L = wp2Var4;
        wp2 wp2Var5 = new wp2(this, wp2.a.e);
        this.M = wp2Var5;
        wp2 wp2Var6 = new wp2(this, wp2.a.V);
        this.N = wp2Var6;
        wp2 wp2Var7 = new wp2(this, wp2.a.W);
        this.O = wp2Var7;
        wp2 wp2Var8 = new wp2(this, wp2.a.f);
        this.P = wp2Var8;
        this.Q = new wp2[]{wp2Var, wp2Var3, wp2Var2, wp2Var4, wp2Var5, wp2Var8};
        ArrayList<wp2> arrayList = new ArrayList<>();
        this.R = arrayList;
        this.S = new boolean[2];
        a aVar = a.a;
        this.T = new a[]{aVar, aVar};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        this.h0 = 0;
        this.i0 = null;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = new float[]{-1.0f, -1.0f};
        this.m0 = new gq2[]{null, null};
        this.n0 = new gq2[]{null, null};
        this.o0 = -1;
        this.p0 = -1;
        arrayList.add(wp2Var);
        arrayList.add(wp2Var2);
        arrayList.add(wp2Var3);
        arrayList.add(wp2Var4);
        arrayList.add(wp2Var6);
        arrayList.add(wp2Var7);
        arrayList.add(wp2Var8);
        arrayList.add(wp2Var5);
    }

    public final void A(int i, int i2) {
        if (this.j) {
            return;
        }
        this.I.i(i);
        this.K.i(i2);
        this.Z = i;
        this.V = i2 - i;
        this.j = true;
    }

    public final void B(int i, int i2) {
        if (this.k) {
            return;
        }
        this.J.i(i);
        this.L.i(i2);
        this.a0 = i;
        this.W = i2 - i;
        if (this.D) {
            this.M.i(i + this.b0);
        }
        this.k = true;
    }

    public final void C(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public final void D(a aVar) {
        this.T[0] = aVar;
    }

    public final void E(a aVar) {
        this.T[1] = aVar;
    }

    public final void F(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public void G(boolean z, boolean z2) {
        int i;
        int i2;
        bk6 bk6Var = this.d;
        boolean z3 = z & bk6Var.g;
        kng kngVar = this.e;
        boolean z4 = z2 & kngVar.g;
        int i3 = bk6Var.h.g;
        int i4 = kngVar.h.g;
        int i5 = bk6Var.i.g;
        int i6 = kngVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Z = i3;
        }
        if (z4) {
            this.a0 = i4;
        }
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        a aVar = a.a;
        a[] aVarArr = this.T;
        if (z3) {
            if (aVarArr[0] == aVar && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i10 = this.c0;
            if (i8 < i10) {
                this.V = i10;
            }
        }
        if (z4) {
            if (aVarArr[1] == aVar && i9 < (i = this.W)) {
                i9 = i;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
    }

    public void H(ox8 ox8Var, boolean z) {
        int i;
        int i2;
        kng kngVar;
        bk6 bk6Var;
        ox8Var.getClass();
        int iN = ox8.n(this.I);
        int iN2 = ox8.n(this.J);
        int iN3 = ox8.n(this.K);
        int iN4 = ox8.n(this.L);
        if (z && (bk6Var = this.d) != null) {
            ry3 ry3Var = bk6Var.h;
            if (ry3Var.j) {
                ry3 ry3Var2 = bk6Var.i;
                if (ry3Var2.j) {
                    iN = ry3Var.g;
                    iN3 = ry3Var2.g;
                }
            }
        }
        if (z && (kngVar = this.e) != null) {
            ry3 ry3Var3 = kngVar.h;
            if (ry3Var3.j) {
                ry3 ry3Var4 = kngVar.i;
                if (ry3Var4.j) {
                    iN2 = ry3Var3.g;
                    iN4 = ry3Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.Z = iN;
        this.a0 = iN2;
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        a[] aVarArr = this.T;
        a aVar = aVarArr[0];
        a aVar2 = a.a;
        if (aVar == aVar2 && i4 < (i2 = this.V)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.W)) {
            i5 = i;
        }
        this.V = i4;
        this.W = i5;
        int i6 = this.d0;
        if (i5 < i6) {
            this.W = i6;
        }
        int i7 = this.c0;
        if (i4 < i7) {
            this.V = i7;
        }
        int i8 = this.u;
        a aVar3 = a.c;
        if (i8 > 0 && aVar == aVar3) {
            this.V = Math.min(this.V, i8);
        }
        int i9 = this.x;
        if (i9 > 0 && aVarArr[1] == aVar3) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.V;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a(hq2 hq2Var, ox8 ox8Var, HashSet<gq2> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            eva.a(hq2Var, ox8Var, this);
            hashSet.remove(this);
            b(ox8Var, hq2Var.N(64));
        }
        if (i == 0) {
            HashSet<wp2> hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator<wp2> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.a(hq2Var, ox8Var, hashSet, i, true);
                }
            }
            HashSet<wp2> hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator<wp2> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.a(hq2Var, ox8Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<wp2> hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator<wp2> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.a(hq2Var, ox8Var, hashSet, i, true);
            }
        }
        HashSet<wp2> hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator<wp2> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.a(hq2Var, ox8Var, hashSet, i, true);
            }
        }
        HashSet<wp2> hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator<wp2> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.a(hq2Var, ox8Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r26v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r61v0, types: [gq2] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.ox8 r62, boolean r63) {
        /*
            Method dump skipped, instruction units count: 1946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq2.b(ox8, boolean):void");
    }

    public boolean c() {
        return this.h0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x048e A[PHI: r0
  0x048e: PHI (r0v16 int) = (r0v15 int), (r0v20 int), (r0v20 int), (r0v20 int) binds: [B:280:0x047e, B:282:0x0484, B:283:0x0486, B:285:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.ox8 r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.mne r35, defpackage.mne r36, gq2.a r37, boolean r38, defpackage.wp2 r39, defpackage.wp2 r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq2.d(ox8, boolean, boolean, boolean, boolean, mne, mne, gq2$a, boolean, wp2, wp2, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(ox8 ox8Var) {
        ox8Var.k(this.I);
        ox8Var.k(this.J);
        ox8Var.k(this.K);
        ox8Var.k(this.L);
        if (this.b0 > 0) {
            ox8Var.k(this.M);
        }
    }

    public final void f() {
        if (this.d == null) {
            bk6 bk6Var = new bk6(this);
            bk6Var.h.e = ry3.a.d;
            bk6Var.i.e = ry3.a.e;
            bk6Var.f = 0;
            this.d = bk6Var;
        }
        if (this.e == null) {
            kng kngVar = new kng(this);
            ry3 ry3Var = new ry3(kngVar);
            kngVar.k = ry3Var;
            kngVar.l = null;
            kngVar.h.e = ry3.a.f;
            kngVar.i.e = ry3.a.V;
            ry3Var.e = ry3.a.W;
            kngVar.f = 1;
            this.e = kngVar;
        }
    }

    public wp2 g(wp2.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                g7.l(aVar.name());
                return null;
        }
    }

    public final a h(int i) {
        a[] aVarArr = this.T;
        if (i == 0) {
            return aVarArr[0];
        }
        if (i == 1) {
            return aVarArr[1];
        }
        return null;
    }

    public final int i() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final gq2 j(int i) {
        wp2 wp2Var;
        wp2 wp2Var2;
        if (i != 0) {
            if (i == 1 && (wp2Var2 = (wp2Var = this.L).f) != null && wp2Var2.f == wp2Var) {
                return wp2Var2.d;
            }
            return null;
        }
        wp2 wp2Var3 = this.K;
        wp2 wp2Var4 = wp2Var3.f;
        if (wp2Var4 == null || wp2Var4.f != wp2Var3) {
            return null;
        }
        return wp2Var4.d;
    }

    public final gq2 k(int i) {
        wp2 wp2Var;
        wp2 wp2Var2;
        if (i != 0) {
            if (i == 1 && (wp2Var2 = (wp2Var = this.J).f) != null && wp2Var2.f == wp2Var) {
                return wp2Var2.d;
            }
            return null;
        }
        wp2 wp2Var3 = this.I;
        wp2 wp2Var4 = wp2Var3.f;
        if (wp2Var4 == null || wp2Var4.f != wp2Var3) {
            return null;
        }
        return wp2Var4.d;
    }

    public final int l() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final int m() {
        gq2 gq2Var = this.U;
        return (gq2Var == null || !(gq2Var instanceof hq2)) ? this.Z : ((hq2) gq2Var).x0 + this.Z;
    }

    public final int n() {
        gq2 gq2Var = this.U;
        return (gq2Var == null || !(gq2Var instanceof hq2)) ? this.a0 : ((hq2) gq2Var).y0 + this.a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            wp2 r5 = r4.I
            wp2 r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            wp2 r4 = r4.K
            wp2 r4 = r4.f
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            wp2 r5 = r4.J
            wp2 r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            wp2 r3 = r4.L
            wp2 r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            wp2 r4 = r4.M
            wp2 r4 = r4.f
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq2.o(int):boolean");
    }

    public final boolean p(int i, int i2) {
        wp2 wp2Var;
        wp2 wp2Var2;
        wp2 wp2Var3;
        wp2 wp2Var4;
        if (i == 0) {
            wp2 wp2Var5 = this.I;
            wp2 wp2Var6 = wp2Var5.f;
            if (wp2Var6 == null || !wp2Var6.c || (wp2Var4 = (wp2Var3 = this.K).f) == null || !wp2Var4.c) {
                return false;
            }
            return (wp2Var4.c() - wp2Var3.d()) - (wp2Var5.d() + wp2Var5.f.c()) >= i2;
        }
        wp2 wp2Var7 = this.J;
        wp2 wp2Var8 = wp2Var7.f;
        if (wp2Var8 == null || !wp2Var8.c || (wp2Var2 = (wp2Var = this.L).f) == null || !wp2Var2.c) {
            return false;
        }
        return (wp2Var2.c() - wp2Var.d()) - (wp2Var7.d() + wp2Var7.f.c()) >= i2;
    }

    public final void q(wp2.a aVar, gq2 gq2Var, wp2.a aVar2, int i, int i2) {
        g(aVar).a(gq2Var.g(aVar2), i, i2);
    }

    public final boolean r(int i) {
        wp2 wp2Var;
        wp2 wp2Var2;
        int i2 = i * 2;
        wp2[] wp2VarArr = this.Q;
        wp2 wp2Var3 = wp2VarArr[i2];
        wp2 wp2Var4 = wp2Var3.f;
        return (wp2Var4 == null || wp2Var4.f == wp2Var3 || (wp2Var2 = (wp2Var = wp2VarArr[i2 + 1]).f) == null || wp2Var2.f != wp2Var) ? false : true;
    }

    public final boolean s() {
        wp2 wp2Var = this.I;
        wp2 wp2Var2 = wp2Var.f;
        if (wp2Var2 != null && wp2Var2.f == wp2Var) {
            return true;
        }
        wp2 wp2Var3 = this.K;
        wp2 wp2Var4 = wp2Var3.f;
        return wp2Var4 != null && wp2Var4.f == wp2Var3;
    }

    public final boolean t() {
        wp2 wp2Var = this.J;
        wp2 wp2Var2 = wp2Var.f;
        if (wp2Var2 != null && wp2Var2.f == wp2Var) {
            return true;
        }
        wp2 wp2Var3 = this.L;
        wp2 wp2Var4 = wp2Var3.f;
        return wp2Var4 != null && wp2Var4.f == wp2Var3;
    }

    public String toString() {
        StringBuilder sbG = q6.g("");
        sbG.append(this.i0 != null ? l6.i(new StringBuilder("id: "), this.i0, " ") : "");
        sbG.append("(");
        sbG.append(this.Z);
        sbG.append(", ");
        sbG.append(this.a0);
        sbG.append(") - (");
        sbG.append(this.V);
        sbG.append(" x ");
        return w20.k(sbG, this.W, ")");
    }

    public final boolean u() {
        return this.g && this.h0 != 8;
    }

    public boolean v() {
        if (this.j) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean w() {
        if (this.k) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public void x() {
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.P.g();
        this.U = null;
        this.C = 0.0f;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        a[] aVarArr = this.T;
        a aVar = a.a;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.g0 = null;
        this.h0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        float[] fArr = this.l0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.n = -1;
        this.o = -1;
        int[] iArr = this.B;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.q = 0;
        this.r = 0;
        this.v = 1.0f;
        this.y = 1.0f;
        this.u = Integer.MAX_VALUE;
        this.x = Integer.MAX_VALUE;
        this.t = 0;
        this.w = 0;
        this.z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.s;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void y() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        ArrayList<wp2> arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wp2 wp2Var = arrayList.get(i);
            wp2Var.c = false;
            wp2Var.b = 0;
        }
    }

    public void z(us1 us1Var) {
        this.I.h();
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.P.h();
        this.N.h();
        this.O.h();
    }
}
