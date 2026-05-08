package defpackage;

import com.facebook.react.uimanager.d;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.a;
import e4g.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public class loc implements koc<loc> {
    public static final b6h m0;
    public ArrayList<loc> V;
    public loc W;
    public rjc X;
    public boolean Y;
    public int a;
    public loc a0;
    public String b;
    public ArrayList<loc> b0;
    public int c;
    public int c0;
    public mkf d;
    public int d0;
    public boolean e;
    public int e0;
    public int f0;
    public final float[] h0;
    public final a j0;
    public Integer k0;
    public Integer l0;
    public boolean f = true;
    public int Z = 0;
    public final boolean[] i0 = new boolean[9];
    public final coe g0 = new coe(0.0f);

    static {
        Lazy lazy = ypc.a;
        Object value = ypc.a.getValue();
        value.getClass();
        m0 = (b6h) value;
    }

    public loc() {
        float[] fArr = new float[9];
        this.h0 = fArr;
        if (E()) {
            this.j0 = null;
            return;
        }
        a aVar = (a) ((e72) o6h.a.getValue()).acquire();
        a aVar2 = aVar;
        if (aVar == null) {
            b6h b6hVar = m0;
            n6h n6hVar = new n6h(YogaNative.jni_YGNodeNewWithConfigJNI(((c6h) b6hVar).a));
            n6hVar.b = b6hVar;
            aVar2 = n6hVar;
        }
        this.j0 = aVar2;
        aVar2.A(this);
        Arrays.fill(fArr, Float.NaN);
    }

    @Override // defpackage.koc
    public final int A(koc kocVar) {
        loc locVar = (loc) kocVar;
        int iY = 0;
        for (int i = 0; i < g(); i++) {
            loc locVarA = a(i);
            if (locVar == locVarA) {
                return iY;
            }
            iY += locVarA.Y();
        }
        throw new RuntimeException("Child " + locVar.a + " was not a child of " + this.a);
    }

    @Override // defpackage.koc
    public final int B() {
        return this.a;
    }

    @Override // defpackage.koc
    public final void C() {
        ArrayList<loc> arrayList = this.b0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            ArrayList<loc> arrayList2 = this.b0;
            if (size < 0) {
                arrayList2.clear();
                return;
            }
            arrayList2.get(size).a0 = null;
        }
    }

    @Override // defpackage.koc
    public final void D() {
        Q(Float.NaN, Float.NaN);
    }

    @Override // defpackage.koc
    public boolean E() {
        return this instanceof unc;
    }

    @Override // defpackage.koc
    public final void F(rjc rjcVar) {
        this.X = rjcVar;
    }

    @Override // defpackage.koc
    public final void G(float f) {
        this.j0.j0(f);
    }

    @Override // defpackage.koc
    public final int H() {
        return this.e0;
    }

    @Override // defpackage.koc
    public void I(iaa iaaVar) {
    }

    @Override // defpackage.koc
    public final boolean J(koc kocVar) {
        loc locVar = (loc) kocVar;
        for (loc locVar2 = this.W; locVar2 != null; locVar2 = locVar2.W) {
            if (locVar2 == locVar) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.koc
    public final mkf K() {
        mkf mkfVar = this.d;
        hh1.n(mkfVar);
        return mkfVar;
    }

    @Override // defpackage.koc
    public final t9a L() {
        return (E() || this.Y) ? t9a.c : this instanceof mpc ? t9a.b : t9a.a;
    }

    @Override // defpackage.koc
    public final int M() {
        hh1.l(this.c != 0);
        return this.c;
    }

    @Override // defpackage.koc
    public final boolean O(float f, float f2) {
        if (!Z()) {
            return false;
        }
        a aVar = this.j0;
        float fK = aVar.k();
        float fL = aVar.l();
        float f3 = f + fK;
        int iRound = Math.round(f3);
        float f4 = f2 + fL;
        int iRound2 = Math.round(f4);
        return (Math.round(fK) == this.c0 && Math.round(fL) == this.d0 && Math.round(aVar.j() + f3) - iRound == this.e0 && Math.round(aVar.h() + f4) - iRound2 == this.f0) ? false : true;
    }

    @Override // defpackage.koc
    public final boolean P() {
        return this.e;
    }

    @Override // defpackage.koc
    public final void Q(float f, float f2) {
        this.j0.d(f, f2);
    }

    @Override // defpackage.koc
    public final void R(koc kocVar, int i) {
        loc locVar = (loc) kocVar;
        if (this.V == null) {
            this.V = new ArrayList<>(4);
        }
        this.V.add(i, locVar);
        locVar.W = this;
        a aVar = this.j0;
        if (aVar != null && !a0()) {
            a aVar2 = locVar.j0;
            if (aVar2 == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + locVar.toString() + "' to a '" + toString() + "')");
            }
            aVar.c(aVar2, i);
        }
        b0();
        int iY = locVar.Y();
        this.Z += iY;
        j0(iY);
    }

    @Override // defpackage.koc
    public final loc S() {
        rjc rjcVar = this.X;
        return rjcVar != null ? rjcVar : this.a0;
    }

    @Override // defpackage.koc
    public final loc T() {
        return this.a0;
    }

    @Override // defpackage.koc
    public final boolean U() {
        return this.Y;
    }

    @Override // defpackage.koc
    public final void V(noc nocVar) {
        HashMap map = d.a;
        d.e eVarD = d.d(getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = nocVar.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            eVarD.a(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.koc
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final loc a(int i) {
        ArrayList<loc> arrayList = this.V;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException(bg.d(i, "Index ", " out of bounds: node has no children"));
    }

    public final float X(int i) {
        return this.j0.i(g6h.a(i));
    }

    public final int Y() {
        t9a t9aVarL = L();
        if (t9aVarL == t9a.c) {
            return this.Z;
        }
        if (t9aVarL == t9a.b) {
            return this.Z + 1;
        }
        return 1;
    }

    public final boolean Z() {
        a aVar = this.j0;
        return aVar != null && aVar.n();
    }

    public boolean a0() {
        return this.j0.p();
    }

    @Override // defpackage.koc
    public final void b() {
        a aVar;
        this.f = false;
        if (!Z() || (aVar = this.j0) == null) {
            return;
        }
        aVar.q();
    }

    public void b0() {
        if (this.f) {
            return;
        }
        this.f = true;
        loc locVar = this.W;
        if (locVar != null) {
            locVar.b0();
        }
    }

    @Override // defpackage.koc
    public final void c(koc kocVar, int i) {
        loc locVar = (loc) kocVar;
        hh1.l(L() == t9a.a);
        hh1.l(locVar.L() != t9a.c);
        if (this.b0 == null) {
            this.b0 = new ArrayList<>(4);
        }
        this.b0.add(i, locVar);
        locVar.a0 = this;
    }

    public void c0(e4g e4gVar) {
    }

    @Override // defpackage.koc
    public final void d(float f) {
        this.j0.M(f);
    }

    public final void d0(a6h a6hVar) {
        this.j0.u(a6hVar);
    }

    @Override // defpackage.koc
    public final void dispose() {
        a aVar = this.j0;
        if (aVar != null) {
            aVar.t();
            ((e72) o6h.a.getValue()).a(aVar);
        }
    }

    @Override // defpackage.koc
    public final void e(int i, int i2) {
        this.k0 = Integer.valueOf(i);
        this.l0 = Integer.valueOf(i2);
    }

    public final void e0(a6h a6hVar) {
        this.j0.v(a6hVar);
    }

    @Override // defpackage.koc
    public final boolean f() {
        if (this.f || Z()) {
            return true;
        }
        a aVar = this.j0;
        return aVar != null && aVar.o();
    }

    public final void f0(a6h a6hVar) {
        this.j0.w(a6hVar);
    }

    @Override // defpackage.koc
    public final int g() {
        ArrayList<loc> arrayList = this.V;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void g0(i6h i6hVar) {
        this.j0.H(i6hVar);
    }

    @Override // defpackage.koc
    public final Integer getHeightMeasureSpec() {
        return this.l0;
    }

    @Override // defpackage.koc
    public final e6h getLayoutDirection() {
        return this.j0.g();
    }

    @Override // defpackage.koc
    public final loc getParent() {
        return this.W;
    }

    @Override // defpackage.koc
    public final Integer getWidthMeasureSpec() {
        return this.k0;
    }

    @Override // defpackage.koc
    public final void h() {
        if (g() == 0) {
            return;
        }
        int iY = 0;
        for (int iG = g() - 1; iG >= 0; iG--) {
            a aVar = this.j0;
            if (aVar != null && !a0()) {
                aVar.r(iG);
            }
            loc locVarA = a(iG);
            locVarA.W = null;
            iY += locVarA.Y();
            locVarA.dispose();
        }
        ArrayList<loc> arrayList = this.V;
        hh1.n(arrayList);
        arrayList.clear();
        b0();
        this.Z -= iY;
        j0(-iY);
    }

    public final void h0(k6h k6hVar) {
        this.j0.Q(k6hVar);
    }

    @Override // defpackage.koc
    public final int i() {
        ArrayList<loc> arrayList = this.b0;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void i0(float f, int i) {
        this.j0.R(g6h.a(i), f);
    }

    @Override // defpackage.koc
    public final void j(int i) {
        this.c = i;
    }

    public final void j0(int i) {
        t9a t9aVarL = L();
        t9a t9aVar = t9a.a;
        if (t9aVarL != t9aVar) {
            for (loc locVar = this.W; locVar != null; locVar = locVar.W) {
                locVar.Z += i;
                if (locVar.L() == t9aVar) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.koc
    public void k(mkf mkfVar) {
        this.d = mkfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0() {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto L99
            coe r2 = r6.g0
            com.facebook.yoga.a r3 = r6.j0
            float[] r4 = r6.h0
            if (r0 == 0) goto L57
            r5 = 2
            if (r0 == r5) goto L57
            r5 = 4
            if (r0 == r5) goto L57
            r5 = 5
            if (r0 != r5) goto L17
            goto L57
        L17:
            r5 = 1
            if (r0 == r5) goto L32
            r5 = 3
            if (r0 != r5) goto L1e
            goto L32
        L1e:
            r1 = r4[r0]
            boolean r1 = defpackage.dmc.m(r1)
            if (r1 == 0) goto L7c
            g6h r1 = defpackage.g6h.a(r0)
            float[] r2 = r2.b
            r2 = r2[r0]
            r3.e0(r1, r2)
            goto L95
        L32:
            r5 = r4[r0]
            boolean r5 = defpackage.dmc.m(r5)
            if (r5 == 0) goto L7c
            r5 = 7
            r5 = r4[r5]
            boolean r5 = defpackage.dmc.m(r5)
            if (r5 == 0) goto L7c
            r1 = r4[r1]
            boolean r1 = defpackage.dmc.m(r1)
            if (r1 == 0) goto L7c
            g6h r1 = defpackage.g6h.a(r0)
            float[] r2 = r2.b
            r2 = r2[r0]
            r3.e0(r1, r2)
            goto L95
        L57:
            r5 = r4[r0]
            boolean r5 = defpackage.dmc.m(r5)
            if (r5 == 0) goto L7c
            r5 = 6
            r5 = r4[r5]
            boolean r5 = defpackage.dmc.m(r5)
            if (r5 == 0) goto L7c
            r1 = r4[r1]
            boolean r1 = defpackage.dmc.m(r1)
            if (r1 == 0) goto L7c
            g6h r1 = defpackage.g6h.a(r0)
            float[] r2 = r2.b
            r2 = r2[r0]
            r3.e0(r1, r2)
            goto L95
        L7c:
            boolean[] r1 = r6.i0
            boolean r1 = r1[r0]
            if (r1 == 0) goto L8c
            g6h r1 = defpackage.g6h.a(r0)
            r2 = r4[r0]
            r3.f0(r1, r2)
            goto L95
        L8c:
            g6h r1 = defpackage.g6h.a(r0)
            r2 = r4[r0]
            r3.e0(r1, r2)
        L95:
            int r0 = r0 + 1
            goto L1
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loc.k0():void");
    }

    @Override // defpackage.koc
    public final int l() {
        return this.d0;
    }

    @Override // defpackage.koc
    public void m(Object obj) {
    }

    @Override // defpackage.koc
    public final String n() {
        String str = this.b;
        hh1.n(str);
        return str;
    }

    @Override // defpackage.koc
    public final void o(int i) {
        this.a = i;
    }

    @Override // defpackage.koc
    public final float p() {
        return this.j0.l();
    }

    @Override // defpackage.koc
    public final int q() {
        return this.c0;
    }

    @Override // defpackage.koc
    public void r(float f, int i) {
        this.h0[i] = f;
        this.i0[i] = false;
        k0();
    }

    @Override // defpackage.koc
    public final float s() {
        return this.j0.k();
    }

    @Override // defpackage.koc
    public final void t(boolean z) {
        hh1.m(this.W == null, "Must remove from no opt parent first");
        hh1.m(this.a0 == null, "Must remove from native parent first");
        hh1.m(i() == 0, "Must remove all native children first");
        this.Y = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(" ");
        return w20.k(sb, this.a, "]");
    }

    @Override // defpackage.koc
    public final int u() {
        return this.f0;
    }

    @Override // defpackage.koc
    public final loc v(int i) {
        ArrayList<loc> arrayList = this.V;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException(bg.d(i, "Index ", " out of bounds: node has no children"));
        }
        loc locVarRemove = arrayList.remove(i);
        locVarRemove.W = null;
        a aVar = this.j0;
        if (aVar != null && !a0()) {
            aVar.r(i);
        }
        b0();
        int iY = locVarRemove.Y();
        this.Z -= iY;
        j0(-iY);
        return locVarRemove;
    }

    @Override // defpackage.koc
    public final void w() {
        if (!E()) {
            this.j0.e();
            return;
        }
        loc locVar = this.W;
        if (locVar != null) {
            locVar.w();
        }
    }

    @Override // defpackage.koc
    public final void x(String str) {
        this.b = str;
    }

    @Override // defpackage.koc
    public final void y(float f, float f2, e4g e4gVar, iaa iaaVar) {
        if (this.f) {
            c0(e4gVar);
        }
        if (Z()) {
            a aVar = this.j0;
            float fK = aVar.k();
            float fL = aVar.l();
            float f3 = f + fK;
            int iRound = Math.round(f3);
            float f4 = f2 + fL;
            int iRound2 = Math.round(f4);
            int iRound3 = Math.round(aVar.j() + f3);
            int iRound4 = Math.round(aVar.h() + f4);
            int iRound5 = Math.round(fK);
            int iRound6 = Math.round(fL);
            int i = iRound3 - iRound;
            int i2 = iRound4 - iRound2;
            boolean z = (iRound5 == this.c0 && iRound6 == this.d0 && i == this.e0 && i2 == this.f0) ? false : true;
            this.c0 = iRound5;
            this.d0 = iRound6;
            this.e0 = i;
            this.f0 = i2;
            if (z) {
                if (iaaVar != null) {
                    iaaVar.d(this);
                } else {
                    e4gVar.h.add(e4gVar.new s(this.W.a, this.a, iRound5, iRound6, i, i2, aVar.g()));
                }
            }
        }
    }

    @Override // defpackage.koc
    public ArrayList z() {
        if (this instanceof gpc) {
            return null;
        }
        return this.V;
    }
}
