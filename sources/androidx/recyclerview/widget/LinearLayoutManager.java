package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import defpackage.l5;
import defpackage.m6;
import defpackage.p6;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;
    public int p;
    public c q;
    public s r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public SavedState z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;
        public boolean c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public static class a {
        public s a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            c();
        }

        public final void a() {
            boolean z = this.d;
            s sVar = this.a;
            this.c = z ? sVar.g() : sVar.k();
        }

        public final void b(View view, int i) {
            s sVar = this.a;
            int iL = Integer.MIN_VALUE == sVar.b ? 0 : sVar.l() - sVar.b;
            if (iL >= 0) {
                boolean z = this.d;
                s sVar2 = this.a;
                if (z) {
                    int iB = sVar2.b(view);
                    s sVar3 = this.a;
                    this.c = (Integer.MIN_VALUE != sVar3.b ? sVar3.l() - sVar3.b : 0) + iB;
                } else {
                    this.c = sVar2.e(view);
                }
                this.b = i;
                return;
            }
            this.b = i;
            boolean z2 = this.d;
            s sVar4 = this.a;
            if (!z2) {
                int iE = sVar4.e(view);
                int iK = iE - this.a.k();
                this.c = iE;
                if (iK > 0) {
                    int iG = (this.a.g() - Math.min(0, (this.a.g() - iL) - this.a.b(view))) - (this.a.c(view) + iE);
                    if (iG < 0) {
                        this.c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (sVar4.g() - iL) - this.a.b(view);
            this.c = this.a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.c - this.a.c(view);
                int iK2 = this.a.k();
                int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.c = Math.min(iG2, -iMin) + this.c;
                }
            }
        }

        public final void c() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return m6.i(sb, this.e, '}');
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public List<RecyclerView.b0> k;
        public boolean l;

        public final void a(View view) {
            int iB;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.a.h() && (iB = (nVar.a.b() - this.d) * this.e) >= 0 && iB < i) {
                    view2 = view3;
                    if (iB == 0) {
                        break;
                    } else {
                        i = iB;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.n) view2.getLayoutParams()).a.b();
            }
        }

        public final View b(RecyclerView.t tVar) {
            List<RecyclerView.b0> list = this.k;
            if (list == null) {
                View view = tVar.k(this.d, Long.MAX_VALUE).a;
                this.d += this.e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.k.get(i).a;
                RecyclerView.n nVar = (RecyclerView.n) view2.getLayoutParams();
                if (!nVar.a.h() && this.d == nVar.a.b()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.m.c cVarF = RecyclerView.m.F(context, attributeSet, i, i2);
        Z0(cVarF.a);
        boolean z = cVarF.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            k0();
        }
        a1(cVarF.d);
    }

    public void A0(RecyclerView.x xVar, c cVar, m.b bVar) {
        int i = cVar.d;
        if (i < 0 || i >= xVar.b()) {
            return;
        }
        bVar.a(i, Math.max(0, cVar.g));
    }

    public final int B0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        F0();
        s sVar = this.r;
        boolean z = !this.w;
        return y.a(xVar, sVar, I0(z), H0(z), this, this.w);
    }

    public final int C0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        F0();
        s sVar = this.r;
        boolean z = !this.w;
        return y.b(xVar, sVar, I0(z), H0(z), this, this.w, this.u);
    }

    public final int D0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        F0();
        s sVar = this.r;
        boolean z = !this.w;
        return y.c(xVar, sVar, I0(z), H0(z), this, this.w);
    }

    public final int E0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && S0()) ? -1 : 1 : (this.p != 1 && S0()) ? 1 : -1;
    }

    public final void F0() {
        if (this.q == null) {
            c cVar = new c();
            cVar.a = true;
            cVar.h = 0;
            cVar.i = 0;
            cVar.k = null;
            this.q = cVar;
        }
    }

    public final int G0(RecyclerView.t tVar, c cVar, RecyclerView.x xVar, boolean z) {
        int i;
        int i2 = cVar.c;
        int i3 = cVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.g = i3 + i2;
            }
            V0(tVar, cVar);
        }
        int i4 = cVar.c + cVar.h;
        while (true) {
            if ((!cVar.l && i4 <= 0) || (i = cVar.d) < 0 || i >= xVar.b()) {
                break;
            }
            b bVar = this.B;
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            T0(tVar, xVar, cVar, bVar);
            if (!bVar.b) {
                int i5 = cVar.b;
                int i6 = bVar.a;
                cVar.b = (cVar.f * i6) + i5;
                if (!bVar.c || cVar.k != null || !xVar.g) {
                    cVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.g = i8 + i9;
                    }
                    V0(tVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.c;
    }

    public final View H0(boolean z) {
        return this.u ? M0(0, v(), z, true) : M0(v() - 1, -1, z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean I() {
        return true;
    }

    public final View I0(boolean z) {
        return this.u ? M0(v() - 1, -1, z, true) : M0(0, v(), z, true);
    }

    public final int J0() {
        View viewM0 = M0(0, v(), false, true);
        if (viewM0 == null) {
            return -1;
        }
        return RecyclerView.m.E(viewM0);
    }

    public final int K0() {
        View viewM0 = M0(v() - 1, -1, false, true);
        if (viewM0 == null) {
            return -1;
        }
        return RecyclerView.m.E(viewM0);
    }

    public final View L0(int i, int i2) {
        int i3;
        int i4;
        F0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    public final View M0(int i, int i2, boolean z, boolean z2) {
        F0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View N0(androidx.recyclerview.widget.RecyclerView.t r17, androidx.recyclerview.widget.RecyclerView.x r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.F0()
            int r1 = r0.v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.s r7 = r0.r
            int r7 = r7.k()
            androidx.recyclerview.widget.s r8 = r0.r
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = androidx.recyclerview.widget.RecyclerView.m.E(r12)
            androidx.recyclerview.widget.s r14 = r0.r
            int r14 = r14.e(r12)
            androidx.recyclerview.widget.s r15 = r0.r
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r13 = (androidx.recyclerview.widget.RecyclerView.n) r13
            androidx.recyclerview.widget.RecyclerView$b0 r13 = r13.a
            boolean r13 = r13.h()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.N0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void O(RecyclerView recyclerView) {
    }

    public final int O0(int i, RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -Y0(-iG2, tVar, xVar);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(iG);
        return iG + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public View P(View view, int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        int iE0;
        X0();
        if (v() != 0 && (iE0 = E0(i)) != Integer.MIN_VALUE) {
            F0();
            b1(iE0, (int) (this.r.l() * 0.33333334f), false, xVar);
            c cVar = this.q;
            cVar.g = Integer.MIN_VALUE;
            cVar.a = false;
            G0(tVar, cVar, xVar, true);
            boolean z = this.u;
            View viewL0 = iE0 == -1 ? z ? L0(v() - 1, -1) : L0(0, v()) : z ? L0(0, v()) : L0(v() - 1, -1);
            View viewR0 = iE0 == -1 ? R0() : Q0();
            if (!viewR0.hasFocusable()) {
                return viewL0;
            }
            if (viewL0 != null) {
                return viewR0;
            }
        }
        return null;
    }

    public final int P0(int i, RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -Y0(iK2, tVar, xVar);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-iK);
        return i2 - iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void Q(AccessibilityEvent accessibilityEvent) {
        super.Q(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(J0());
            accessibilityEvent.setToIndex(K0());
        }
    }

    public final View Q0() {
        return u(this.u ? 0 : v() - 1);
    }

    public final View R0() {
        return u(this.u ? v() - 1 : 0);
    }

    public final boolean S0() {
        return z() == 1;
    }

    public void T0(RecyclerView.t tVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i;
        int iD;
        int i2;
        int iD2;
        View viewB = cVar.b(tVar);
        if (viewB == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) viewB.getLayoutParams();
        List<RecyclerView.b0> list = cVar.k;
        boolean z = this.u;
        int i3 = cVar.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) viewB.getLayoutParams();
        Rect rectN = this.b.N(viewB);
        int i4 = rectN.left + rectN.right;
        int i5 = rectN.top + rectN.bottom;
        int iW = RecyclerView.m.w(this.n, this.l, C() + B() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + i4, d(), ((ViewGroup.MarginLayoutParams) nVar2).width);
        int iW2 = RecyclerView.m.w(this.o, this.m, A() + D() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + i5, e(), ((ViewGroup.MarginLayoutParams) nVar2).height);
        if (t0(viewB, iW, iW2, nVar2)) {
            viewB.measure(iW, iW2);
        }
        bVar.a = this.r.c(viewB);
        if (this.p == 1) {
            if (S0()) {
                iD2 = this.n - C();
                iD = iD2 - this.r.d(viewB);
            } else {
                int iB = B();
                iD2 = this.r.d(viewB) + iB;
                iD = iB;
            }
            int i6 = cVar.f;
            i2 = cVar.b;
            int i7 = bVar.a;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int iD3 = D();
            int iD4 = this.r.d(viewB) + iD3;
            int i9 = cVar.f;
            int i10 = cVar.b;
            int i11 = bVar.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iD2 = i10;
                i2 = iD3;
                i = iD4;
                iD = i12;
            } else {
                int i13 = i10 + i11;
                i = iD4;
                iD = i10;
                i2 = iD3;
                iD2 = i13;
            }
        }
        RecyclerView.m.K(viewB, iD, i2, iD2, i);
        if (nVar.a.h() || nVar.a.k()) {
            bVar.c = true;
        }
        bVar.d = viewB.hasFocusable();
    }

    public void U0(RecyclerView.t tVar, RecyclerView.x xVar, a aVar, int i) {
    }

    public final void V0(RecyclerView.t tVar, c cVar) {
        if (!cVar.a || cVar.l) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.e(viewU) < iF || this.r.n(viewU) < iF) {
                        W0(tVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.e(viewU2) < iF || this.r.n(viewU2) < iF) {
                    W0(tVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.b(viewU3) > i6 || this.r.m(viewU3) > i6) {
                    W0(tVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.b(viewU4) > i6 || this.r.m(viewU4) > i6) {
                W0(tVar, i8, i9);
                return;
            }
        }
    }

    public final void W0(RecyclerView.t tVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewU = u(i);
                i0(i);
                tVar.h(viewU);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewU2 = u(i3);
            i0(i3);
            tVar.h(viewU2);
        }
    }

    public final void X0() {
        if (this.p == 1 || !S0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Y0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (v() != 0 && i != 0) {
            F0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            b1(i2, iAbs, true, xVar);
            c cVar = this.q;
            int iG0 = G0(tVar, cVar, xVar, false) + cVar.g;
            if (iG0 >= 0) {
                if (iAbs > iG0) {
                    i = i2 * iG0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018a  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z(androidx.recyclerview.widget.RecyclerView.t r18, androidx.recyclerview.widget.RecyclerView.x r19) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.Z(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            l5.q(p6.c(i, "invalid orientation:"));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            s sVarA = s.a(this, i);
            this.r = sVarA;
            this.A.a = sVarA;
            this.p = i;
            k0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    @SuppressLint({"UnknownNullness"})
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.m.E(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void a0(RecyclerView.x xVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public void a1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        k0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.z = savedState;
            if (this.x != -1) {
                savedState.a = -1;
            }
            k0();
        }
    }

    public final void b1(int i, int i2, boolean z, RecyclerView.x xVar) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(xVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        c cVar = this.q;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = this.r.h() + i3;
            View viewQ0 = Q0();
            c cVar2 = this.q;
            cVar2.e = this.u ? -1 : 1;
            int iE = RecyclerView.m.E(viewQ0);
            c cVar3 = this.q;
            cVar2.d = iE + cVar3.e;
            cVar3.b = this.r.b(viewQ0);
            iK = this.r.b(viewQ0) - this.r.g();
        } else {
            View viewR0 = R0();
            c cVar4 = this.q;
            cVar4.h = this.r.k() + cVar4.h;
            c cVar5 = this.q;
            cVar5.e = this.u ? 1 : -1;
            int iE2 = RecyclerView.m.E(viewR0);
            c cVar6 = this.q;
            cVar5.d = iE2 + cVar6.e;
            cVar6.b = this.r.e(viewR0);
            iK = (-this.r.e(viewR0)) + this.r.k();
        }
        c cVar7 = this.q;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - iK;
        }
        cVar7.g = iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final Parcelable c0() {
        SavedState savedState = this.z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.c = savedState.c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (v() <= 0) {
            savedState3.a = -1;
            return savedState3;
        }
        F0();
        boolean z = this.s ^ this.u;
        savedState3.c = z;
        if (z) {
            View viewQ0 = Q0();
            savedState3.b = this.r.g() - this.r.b(viewQ0);
            savedState3.a = RecyclerView.m.E(viewQ0);
            return savedState3;
        }
        View viewR0 = R0();
        savedState3.a = RecyclerView.m.E(viewR0);
        savedState3.b = this.r.e(viewR0) - this.r.k();
        return savedState3;
    }

    public final void c1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        c cVar = this.q;
        cVar.e = this.u ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d() {
        return this.p == 0;
    }

    public final void d1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        c cVar = this.q;
        cVar.d = i;
        cVar.e = this.u ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void h(int i, int i2, RecyclerView.x xVar, m.b bVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        F0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, xVar);
        A0(xVar, this.q, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void i(int i, m.b bVar) {
        boolean z;
        int i2;
        SavedState savedState = this.z;
        if (savedState == null || (i2 = savedState.a) < 0) {
            X0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            bVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final int j(RecyclerView.x xVar) {
        return B0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int k(RecyclerView.x xVar) {
        return C0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int l(RecyclerView.x xVar) {
        return D0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int l0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.p == 1) {
            return 0;
        }
        return Y0(i, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final int m(RecyclerView.x xVar) {
        return B0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void m0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.a = -1;
        }
        k0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int n(RecyclerView.x xVar) {
        return C0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int n0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.p == 0) {
            return 0;
        }
        return Y0(i, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public int o(RecyclerView.x xVar) {
        return D0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iE = i - RecyclerView.m.E(u(0));
        if (iE >= 0 && iE < iV) {
            View viewU = u(iE);
            if (RecyclerView.m.E(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.n r() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean u0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void w0(RecyclerView recyclerView, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i;
        x0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean y0() {
        return this.z == null && this.s == this.v;
    }

    public void z0(RecyclerView.x xVar, int[] iArr) {
        int i;
        int iL = xVar.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        Z0(i);
        c(null);
        if (this.t) {
            this.t = false;
            k0();
        }
    }

    public LinearLayoutManager() {
        this(1);
    }
}
