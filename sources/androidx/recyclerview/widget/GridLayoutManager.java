package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import defpackage.epg;
import defpackage.l5;
import defpackage.p6;
import defpackage.prg;
import defpackage.t6;
import defpackage.uz;
import defpackage.w20;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final a K;
    public final Rect L;

    public static final class a extends c {
    }

    public static class b extends RecyclerView.n {
        public int e;
        public int f;

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public static int a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }

        public final void b() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        l1(RecyclerView.m.F(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(RecyclerView.x xVar, LinearLayoutManager.c cVar, m.b bVar) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = cVar.d) >= 0 && i < xVar.b() && i2 > 0; i3++) {
            bVar.a(cVar.d, Math.max(0, cVar.g));
            this.K.getClass();
            i2--;
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int G(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.p == 0) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return h1(xVar.b() - 1, tVar, xVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(RecyclerView.t tVar, RecyclerView.x xVar, boolean z, boolean z2) {
        int i;
        int iV;
        int iV2 = v();
        int i2 = 1;
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
        }
        int iB = xVar.b();
        F0();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iE = RecyclerView.m.E(viewU);
            if (iE >= 0 && iE < iB && i1(iE, tVar, xVar) == 0) {
                if (((RecyclerView.n) viewU.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013d, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013f, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0140, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View P(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.P(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R(RecyclerView.t tVar, RecyclerView.x xVar, t6 t6Var) {
        super.R(tVar, xVar, t6Var);
        t6Var.n(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void T(RecyclerView.t tVar, RecyclerView.x xVar, View view, t6 t6Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            S(t6Var, view);
            return;
        }
        b bVar = (b) layoutParams;
        int iH1 = h1(bVar.a.b(), tVar, xVar);
        int i = this.p;
        int i2 = bVar.e;
        int i3 = bVar.f;
        if (i == 0) {
            t6Var.q(t6.f.a(i2, i3, iH1, false, 1));
        } else {
            t6Var.q(t6.f.a(iH1, 1, i2, false, i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void T0(RecyclerView.t tVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int iD;
        int iD2;
        int iB;
        int iW;
        int iW2;
        ?? r12;
        int i4;
        View viewB;
        int iJ = this.r.j();
        boolean z = iJ != 1073741824;
        int i5 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            m1();
        }
        boolean z2 = cVar.e == 1;
        int iI1 = this.F;
        if (!z2) {
            iI1 = i1(cVar.d, tVar, xVar) + j1(cVar.d, tVar, xVar);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = cVar.d) >= 0 && i4 < xVar.b() && iI1 > 0) {
            int i7 = cVar.d;
            int iJ1 = j1(i7, tVar, xVar);
            if (iJ1 > this.F) {
                l5.q(w20.k(uz.f("Item at position ", i7, " requires ", iJ1, " spans but GridLayoutManager has only "), this.F, " spans."));
                return;
            }
            iI1 -= iJ1;
            if (iI1 < 0 || (viewB = cVar.b(tVar)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            bVar.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            b bVar2 = (b) view.getLayoutParams();
            int iJ12 = j1(RecyclerView.m.E(view), tVar, xVar);
            bVar2.f = iJ12;
            bVar2.e = i8;
            i8 += iJ12;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (cVar.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.N(view2));
            }
            k1(view2, iJ, r12);
            int iC = this.r.c(view2);
            if (iC > i9) {
                i9 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z) {
            e1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                k1(view3, 1073741824, true);
                int iC2 = this.r.c(view3);
                if (iC2 > i9) {
                    i9 = iC2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.c(view4) != i9) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iG1 = g1(bVar3.e, bVar3.f);
                if (this.p == 1) {
                    iW2 = RecyclerView.m.w(iG1, 1073741824, i14, false, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iW = RecyclerView.m.w(iG1, 1073741824, i13, false, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (v0(view4, iW2, iW, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        bVar.a = i9;
        int i15 = this.p;
        int i16 = cVar.f;
        int iD3 = cVar.b;
        if (i15 != 1) {
            if (i16 == -1) {
                iB = iD3 - i9;
                iD2 = 0;
                iD = iD3;
            } else {
                iD = iD3 + i9;
                iD2 = 0;
                iB = iD3;
            }
            iD3 = iD2;
        } else if (i16 == -1) {
            iD2 = iD3 - i9;
            iB = 0;
            iD = 0;
        } else {
            iD = 0;
            iD2 = iD3;
            iD3 += i9;
            iB = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.p != 1) {
                iD2 = D() + this.G[bVar4.e];
                iD3 = this.r.d(view5) + iD2;
            } else if (S0()) {
                int iB2 = B() + this.G[this.F - bVar4.e];
                iD = iB2;
                iB = iB2 - this.r.d(view5);
            } else {
                iB = B() + this.G[bVar4.e];
                iD = this.r.d(view5) + iB;
            }
            RecyclerView.m.K(view5, iB, iD2, iD, iD3);
            if (bVar4.a.h() || bVar4.a.k()) {
                bVar.c = true;
            }
            bVar.d = view5.hasFocusable() | bVar.d;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(RecyclerView.t tVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i) {
        m1();
        if (xVar.b() > 0 && !xVar.g) {
            boolean z = i == 1;
            int iI1 = i1(aVar.b, tVar, xVar);
            if (z) {
                while (iI1 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    iI1 = i1(i3, tVar, xVar);
                }
            } else {
                int iB = xVar.b() - 1;
                int i4 = aVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iI12 = i1(i5, tVar, xVar);
                    if (iI12 <= iI1) {
                        break;
                    }
                    i4 = i5;
                    iI1 = iI12;
                }
                aVar.b = i4;
            }
        }
        f1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V() {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i, int i2) {
        a aVar = this.K;
        aVar.b();
        aVar.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void Z(RecyclerView.t tVar, RecyclerView.x xVar) {
        boolean z = xVar.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                b bVar = (b) u(i).getLayoutParams();
                int iB = bVar.a.b();
                sparseIntArray2.put(iB, bVar.f);
                sparseIntArray.put(iB, bVar.e);
            }
        }
        super.Z(tVar, xVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void a0(RecyclerView.x xVar) {
        super.a0(xVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z) {
        if (z) {
            defpackage.b0.u("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.a1(false);
        }
    }

    public final void e1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    public final void f1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int g1(int i, int i2) {
        if (this.p != 1 || !S0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int h1(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        boolean z = xVar.g;
        a aVar = this.K;
        if (!z) {
            int i2 = this.F;
            aVar.getClass();
            return c.a(i, i2);
        }
        int iB = tVar.b(i);
        if (iB != -1) {
            int i3 = this.F;
            aVar.getClass();
            return c.a(iB, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        boolean z = xVar.g;
        a aVar = this.K;
        if (!z) {
            int i2 = this.F;
            aVar.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = tVar.b(i);
        if (iB != -1) {
            int i4 = this.F;
            aVar.getClass();
            return iB % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        boolean z = xVar.g;
        a aVar = this.K;
        if (!z) {
            aVar.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (tVar.b(i) != -1) {
            aVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.x xVar) {
        return C0(xVar);
    }

    public final void k1(View view, int i, boolean z) {
        int iW;
        int iW2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iG1 = g1(bVar.e, bVar.f);
        if (this.p == 1) {
            iW2 = RecyclerView.m.w(iG1, i, i3, false, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = RecyclerView.m.w(this.r.l(), this.m, i2, true, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int iW3 = RecyclerView.m.w(iG1, i, i2, false, ((ViewGroup.MarginLayoutParams) bVar).height);
            int iW4 = RecyclerView.m.w(this.r.l(), this.l, i3, true, ((ViewGroup.MarginLayoutParams) bVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z ? v0(view, iW2, iW, nVar) : t0(view, iW2, iW, nVar)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.x xVar) {
        return D0(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int l0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        m1();
        f1();
        return super.l0(i, tVar, xVar);
    }

    public final void l1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            l5.q(p6.c(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.F = i;
        this.K.b();
        k0();
    }

    public final void m1() {
        int iA;
        int iD;
        if (this.p == 1) {
            iA = this.n - C();
            iD = B();
        } else {
            iA = this.o - A();
            iD = D();
        }
        e1(iA - iD);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.x xVar) {
        return C0(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int n0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        m1();
        f1();
        return super.n0(i, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.x xVar) {
        return D0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.q0(rect, i, i2);
        }
        int iC = C() + B();
        int iA = A() + D();
        if (this.p == 1) {
            int iHeight = rect.height() + iA;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            iG2 = RecyclerView.m.g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = RecyclerView.m.g(i, iArr[iArr.length - 1] + iC, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iC;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            iG = RecyclerView.m.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = RecyclerView.m.g(i2, iArr2[iArr2.length - 1] + iA, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return this.p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.e = -1;
        bVar.f = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.e = -1;
            bVar.f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.e = -1;
        bVar2.f = 0;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int x(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.p == 1) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return h1(xVar.b() - 1, tVar, xVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean y0() {
        return this.z == null && !this.E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        l1(i);
    }
}
