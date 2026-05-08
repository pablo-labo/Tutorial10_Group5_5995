package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import defpackage.epg;
import defpackage.ia;
import defpackage.l5;
import defpackage.prg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public final LazySpanLookup B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;
    public final int p;
    public final d[] q;
    public final s r;
    public final s s;
    public final int t;
    public int u;
    public final n v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public static class LazySpanLookup {
        public int[] a;
        public ArrayList b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int a;
            public int b;
            public int[] c;
            public boolean d;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.a = parcel.readInt();
                    fullSpanItem.b = parcel.readInt();
                    fullSpanItem.d = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        fullSpanItem.c = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.c);
                }
            }
        }

        public final void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public final void b(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.a;
                if (i4 >= i) {
                    fullSpanItem.a = i4 + i2;
                }
            }
        }

        public final void d(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.a = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public ArrayList V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                int i = parcel.readInt();
                savedState.c = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    savedState.d = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                savedState.e = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    savedState.f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.W = parcel.readInt() == 1;
                savedState.X = parcel.readInt() == 1;
                savedState.Y = parcel.readInt() == 1;
                savedState.V = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
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
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.W ? 1 : 0);
            parcel.writeInt(this.X ? 1 : 0);
            parcel.writeInt(this.Y ? 1 : 0);
            parcel.writeList(this.V);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.z0();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.n {
        public d e;
    }

    public class d {
        public final ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public d(int i) {
            this.e = i;
        }

        public final void a() {
            View view = (View) ia.k(1, this.a);
            c cVar = (c) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.r.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.w ? e(r1.size() - 1, -1) : e(0, this.a.size());
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.w ? e(0, this.a.size()) : e(r1.size() - 1, -1);
        }

        public final int e(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.r.k();
            int iG = staggeredGridLayoutManager.r.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int iE = staggeredGridLayoutManager.r.e(view);
                int iB = staggeredGridLayoutManager.r.b(view);
                boolean z = iE <= iG;
                boolean z2 = iB >= iK;
                if (z && z2 && (iE < iK || iB > iG)) {
                    return RecyclerView.m.E(view);
                }
                i += i3;
            }
            return -1;
        }

        public final int f(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        public final View g(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            ArrayList<View> arrayList = this.a;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.w && RecyclerView.m.E(view2) >= i) || ((!staggeredGridLayoutManager.w && RecyclerView.m.E(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && RecyclerView.m.E(view3) <= i) || ((!staggeredGridLayoutManager.w && RecyclerView.m.E(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int h(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            ArrayList<View> arrayList = this.a;
            if (arrayList.size() == 0) {
                return i;
            }
            View view = arrayList.get(0);
            c cVar = (c) view.getLayoutParams();
            this.b = StaggeredGridLayoutManager.this.r.e(view);
            cVar.getClass();
            return this.b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.B = lazySpanLookup;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.m.c cVarF = RecyclerView.m.F(context, attributeSet, i, i2);
        int i3 = cVarF.a;
        if (i3 != 0 && i3 != 1) {
            l5.q("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            s sVar = this.r;
            this.r = this.s;
            this.s = sVar;
            k0();
        }
        int i4 = cVarF.b;
        c(null);
        if (i4 != this.p) {
            lazySpanLookup.a();
            k0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new d[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new d(i5);
            }
            k0();
        }
        boolean z = cVarF.c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.W != z) {
            savedState.W = z;
        }
        this.w = z;
        k0();
        n nVar = new n();
        nVar.a = true;
        nVar.f = 0;
        nVar.g = 0;
        this.v = nVar;
        this.r = s.a(this, this.t);
        this.s = s.a(this, 1 - this.t);
    }

    public static int Z0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int A0(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return y.b(xVar, this.r, D0(z), C0(z), this, this.I, this.x);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int B0(RecyclerView.t tVar, n nVar, RecyclerView.x xVar) {
        d[] dVarArr;
        BitSet bitSet;
        int i;
        d[] dVarArr2;
        d dVar;
        ?? r5;
        int iH;
        int iC;
        int iC2;
        int iG;
        BitSet bitSet2;
        int i2;
        int i3;
        RecyclerView.t tVar2 = tVar;
        BitSet bitSet3 = this.y;
        int i4 = this.p;
        bitSet3.set(0, i4, true);
        n nVar2 = this.v;
        int i5 = nVar2.i ? nVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar.e == 1 ? nVar.g + nVar.b : nVar.f - nVar.b;
        int i6 = nVar.e;
        int i7 = 0;
        while (true) {
            dVarArr = this.q;
            if (i7 >= i4) {
                break;
            }
            if (!dVarArr[i7].a.isEmpty()) {
                Y0(dVarArr[i7], i6, i5);
            }
            i7++;
        }
        boolean z = this.x;
        s sVar = this.r;
        int iG2 = z ? sVar.g() : sVar.k();
        boolean z2 = false;
        while (true) {
            int i8 = nVar.c;
            if (i8 < 0 || i8 >= xVar.b() || (!nVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View view = tVar2.k(nVar.c, Long.MAX_VALUE).a;
            nVar.c += nVar.d;
            c cVar = (c) view.getLayoutParams();
            int iB = cVar.a.b();
            LazySpanLookup lazySpanLookup = this.B;
            int[] iArr = lazySpanLookup.a;
            int i9 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i9 == -1) {
                if (P0(nVar.e)) {
                    i = i4;
                    i3 = i4 - 1;
                    i4 = -1;
                    i2 = -1;
                } else {
                    i = i4;
                    i2 = 1;
                    i3 = 0;
                }
                d dVar2 = null;
                int i10 = i2;
                if (nVar.e == 1) {
                    int iK = sVar.k();
                    dVarArr2 = dVarArr;
                    int i11 = i3;
                    int i12 = Integer.MAX_VALUE;
                    while (i11 != i4) {
                        int i13 = i11;
                        d dVar3 = dVarArr2[i13];
                        BitSet bitSet4 = bitSet3;
                        int iF = dVar3.f(iK);
                        if (iF < i12) {
                            i12 = iF;
                            dVar2 = dVar3;
                        }
                        i11 = i13 + i10;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    dVarArr2 = dVarArr;
                    int iG3 = sVar.g();
                    int i14 = i3;
                    int i15 = Integer.MIN_VALUE;
                    while (i14 != i4) {
                        d dVar4 = dVarArr2[i14];
                        int i16 = i4;
                        int iH2 = dVar4.h(iG3);
                        if (iH2 > i15) {
                            i15 = iH2;
                            dVar2 = dVar4;
                        }
                        i14 += i10;
                        i4 = i16;
                    }
                }
                dVar = dVar2;
                lazySpanLookup.b(iB);
                lazySpanLookup.a[iB] = dVar.e;
            } else {
                bitSet = bitSet3;
                i = i4;
                dVarArr2 = dVarArr;
                dVar = dVarArr2[i9];
            }
            cVar.e = dVar;
            if (nVar.e == 1) {
                r5 = 0;
                b(view, -1, false);
            } else {
                r5 = 0;
                b(view, 0, false);
            }
            int i17 = this.t;
            if (i17 == 1) {
                N0(view, RecyclerView.m.w(this.u, this.l, r5, r5, ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.m.w(this.o, this.m, A() + D(), true, ((ViewGroup.MarginLayoutParams) cVar).height));
            } else {
                N0(view, RecyclerView.m.w(this.n, this.l, C() + B(), true, ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.m.w(this.u, this.m, 0, false, ((ViewGroup.MarginLayoutParams) cVar).height));
            }
            if (nVar.e == 1) {
                iC = dVar.f(iG2);
                iH = sVar.c(view) + iC;
            } else {
                iH = dVar.h(iG2);
                iC = iH - sVar.c(view);
            }
            int i18 = nVar.e;
            d dVar5 = cVar.e;
            if (i18 == 1) {
                dVar5.getClass();
                c cVar2 = (c) view.getLayoutParams();
                cVar2.e = dVar5;
                ArrayList<View> arrayList = dVar5.a;
                arrayList.add(view);
                dVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    dVar5.b = Integer.MIN_VALUE;
                }
                if (cVar2.a.h() || cVar2.a.k()) {
                    dVar5.d = StaggeredGridLayoutManager.this.r.c(view) + dVar5.d;
                }
            } else {
                dVar5.getClass();
                c cVar3 = (c) view.getLayoutParams();
                cVar3.e = dVar5;
                ArrayList<View> arrayList2 = dVar5.a;
                arrayList2.add(0, view);
                dVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    dVar5.c = Integer.MIN_VALUE;
                }
                if (cVar3.a.h() || cVar3.a.k()) {
                    dVar5.d = StaggeredGridLayoutManager.this.r.c(view) + dVar5.d;
                }
            }
            boolean zM0 = M0();
            s sVar2 = this.s;
            if (zM0 && i17 == 1) {
                iG = sVar2.g() - (((i - 1) - dVar.e) * this.u);
                iC2 = iG - sVar2.c(view);
            } else {
                int iK2 = (dVar.e * this.u) + sVar2.k();
                int iC3 = sVar2.c(view) + iK2;
                iC2 = iK2;
                iG = iC3;
            }
            z2 = true;
            if (i17 == 1) {
                RecyclerView.m.K(view, iC2, iC, iG, iH);
            } else {
                RecyclerView.m.K(view, iC, iC2, iH, iG);
            }
            Y0(dVar, nVar2.e, i5);
            tVar2 = tVar;
            R0(tVar2, nVar2);
            if (nVar2.h && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(dVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i4 = i;
            dVarArr = dVarArr2;
        }
        if (!z2) {
            R0(tVar2, nVar2);
        }
        int iK3 = nVar2.e == -1 ? sVar.k() - J0(sVar.k()) : I0(sVar.g()) - sVar.g();
        if (iK3 > 0) {
            return Math.min(nVar.b, iK3);
        }
        return 0;
    }

    public final View C0(boolean z) {
        s sVar = this.r;
        int iK = sVar.k();
        int iG = sVar.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = sVar.e(viewU);
            int iB = sVar.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View D0(boolean z) {
        s sVar = this.r;
        int iK = sVar.k();
        int iG = sVar.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = sVar.e(viewU);
            if (sVar.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void E0(RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int iG;
        int iI0 = I0(Integer.MIN_VALUE);
        if (iI0 != Integer.MIN_VALUE && (iG = this.r.g() - iI0) > 0) {
            int i = iG - (-V0(-iG, tVar, xVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void F0(RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int iK;
        int iJ0 = J0(Integer.MAX_VALUE);
        if (iJ0 != Integer.MAX_VALUE && (iK = iJ0 - this.r.k()) > 0) {
            int iV0 = iK - V0(iK, tVar, xVar);
            if (!z || iV0 <= 0) {
                return;
            }
            this.r.o(-iV0);
        }
    }

    public final int G0() {
        if (v() == 0) {
            return 0;
        }
        return RecyclerView.m.E(u(0));
    }

    public final int H0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return RecyclerView.m.E(u(iV - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean I() {
        return this.C != 0;
    }

    public final int I0(int i) {
        int iF = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iF2 = this.q[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int J0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.x
            if (r0 == 0) goto L9
            int r0 = r10.H0()
            goto Ld
        L9:
            int r0 = r10.G0()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1b
            if (r11 >= r12) goto L17
            int r2 = r12 + 1
        L15:
            r3 = r11
            goto L1e
        L17:
            int r2 = r11 + 1
            r3 = r12
            goto L1e
        L1b:
            int r2 = r11 + r12
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r10.B
            int[] r5 = r4.a
            r6 = 1
            if (r5 != 0) goto L27
            goto L97
        L27:
            int r5 = r5.length
            if (r3 < r5) goto L2c
            goto L97
        L2c:
            java.util.ArrayList r5 = r4.b
            r7 = -1
            if (r5 != 0) goto L33
        L31:
            r5 = r7
            goto L80
        L33:
            if (r5 != 0) goto L36
            goto L4d
        L36:
            int r5 = r5.size()
            int r5 = r5 - r6
        L3b:
            if (r5 < 0) goto L4d
            java.util.ArrayList r8 = r4.b
            java.lang.Object r8 = r8.get(r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r8
            int r9 = r8.a
            if (r9 != r3) goto L4a
            goto L4e
        L4a:
            int r5 = r5 + (-1)
            goto L3b
        L4d:
            r8 = 0
        L4e:
            if (r8 == 0) goto L55
            java.util.ArrayList r5 = r4.b
            r5.remove(r8)
        L55:
            java.util.ArrayList r5 = r4.b
            int r5 = r5.size()
            r8 = 0
        L5c:
            if (r8 >= r5) goto L6e
            java.util.ArrayList r9 = r4.b
            java.lang.Object r9 = r9.get(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r9
            int r9 = r9.a
            if (r9 < r3) goto L6b
            goto L6f
        L6b:
            int r8 = r8 + 1
            goto L5c
        L6e:
            r8 = r7
        L6f:
            if (r8 == r7) goto L31
            java.util.ArrayList r5 = r4.b
            java.lang.Object r5 = r5.get(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r5
            java.util.ArrayList r9 = r4.b
            r9.remove(r8)
            int r5 = r5.a
        L80:
            int[] r8 = r4.a
            if (r5 != r7) goto L8c
            int r5 = r8.length
            java.util.Arrays.fill(r8, r3, r5, r7)
            int[] r5 = r4.a
            int r5 = r5.length
            goto L97
        L8c:
            int r5 = r5 + r6
            int r8 = r8.length
            int r5 = java.lang.Math.min(r5, r8)
            int[] r8 = r4.a
            java.util.Arrays.fill(r8, r3, r5, r7)
        L97:
            if (r13 == r6) goto Laa
            r5 = 2
            if (r13 == r5) goto La6
            if (r13 == r1) goto L9f
            goto Lad
        L9f:
            r4.d(r11, r6)
            r4.c(r12, r6)
            goto Lad
        La6:
            r4.d(r11, r12)
            goto Lad
        Laa:
            r4.c(r11, r12)
        Lad:
            if (r2 > r0) goto Lb0
            goto Lc2
        Lb0:
            boolean r11 = r10.x
            if (r11 == 0) goto Lb9
            int r11 = r10.G0()
            goto Lbd
        Lb9:
            int r11 = r10.H0()
        Lbd:
            if (r3 > r11) goto Lc2
            r10.k0()
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void L(int i) {
        super.L(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            d dVar = this.q[i2];
            int i3 = dVar.b;
            if (i3 != Integer.MIN_VALUE) {
                dVar.b = i3 + i;
            }
            int i4 = dVar.c;
            if (i4 != Integer.MIN_VALUE) {
                dVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View L0() {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.L0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void M(int i) {
        super.M(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            d dVar = this.q[i2];
            int i3 = dVar.b;
            if (i3 != Integer.MIN_VALUE) {
                dVar.b = i3 + i;
            }
            int i4 = dVar.c;
            if (i4 != Integer.MIN_VALUE) {
                dVar.c = i4 + i;
            }
        }
    }

    public final boolean M0() {
        return z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void N() {
        this.B.a();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    public final void N0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        c cVar = (c) view.getLayoutParams();
        int iZ0 = Z0(i, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iZ02 = Z0(i2, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (t0(view, iZ0, iZ02, cVar)) {
            view.measure(iZ0, iZ02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void O(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(androidx.recyclerview.widget.RecyclerView.t r18, androidx.recyclerview.widget.RecyclerView.x r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 1025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View P(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.t r11, androidx.recyclerview.widget.RecyclerView.x r12) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final boolean P0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Q(AccessibilityEvent accessibilityEvent) {
        super.Q(accessibilityEvent);
        if (v() > 0) {
            View viewD0 = D0(false);
            View viewC0 = C0(false);
            if (viewD0 == null || viewC0 == null) {
                return;
            }
            int iE = RecyclerView.m.E(viewD0);
            int iE2 = RecyclerView.m.E(viewC0);
            if (iE < iE2) {
                accessibilityEvent.setFromIndex(iE);
                accessibilityEvent.setToIndex(iE2);
            } else {
                accessibilityEvent.setFromIndex(iE2);
                accessibilityEvent.setToIndex(iE);
            }
        }
    }

    public final void Q0(int i, RecyclerView.x xVar) {
        int iG0;
        int i2;
        if (i > 0) {
            iG0 = H0();
            i2 = 1;
        } else {
            iG0 = G0();
            i2 = -1;
        }
        n nVar = this.v;
        nVar.a = true;
        X0(iG0, xVar);
        W0(i2);
        nVar.c = iG0 + nVar.d;
        nVar.b = Math.abs(i);
    }

    public final void R0(RecyclerView.t tVar, n nVar) {
        if (!nVar.a || nVar.i) {
            return;
        }
        int i = nVar.b;
        int i2 = nVar.e;
        if (i == 0) {
            if (i2 == -1) {
                S0(tVar, nVar.g);
                return;
            } else {
                T0(tVar, nVar.f);
                return;
            }
        }
        int i3 = this.p;
        d[] dVarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = nVar.f;
            int iH = dVarArr[0].h(i5);
            while (i4 < i3) {
                int iH2 = dVarArr[i4].h(i5);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i4++;
            }
            int i6 = i5 - iH;
            int iMin = nVar.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, nVar.b);
            }
            S0(tVar, iMin);
            return;
        }
        int i7 = nVar.g;
        int iF = dVarArr[0].f(i7);
        while (i4 < i3) {
            int iF2 = dVarArr[i4].f(i7);
            if (iF2 < iF) {
                iF = iF2;
            }
            i4++;
        }
        int i8 = iF - nVar.g;
        int iMin2 = nVar.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, nVar.b);
        }
        T0(tVar, iMin2);
    }

    public final void S0(RecyclerView.t tVar, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            s sVar = this.r;
            if (sVar.e(viewU) < i || sVar.n(viewU) < i) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.e.a.size() == 1) {
                return;
            }
            d dVar = cVar.e;
            ArrayList<View> arrayList = dVar.a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.e = null;
            if (cVar2.a.h() || cVar2.a.k()) {
                dVar.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            if (size == 1) {
                dVar.b = Integer.MIN_VALUE;
            }
            dVar.c = Integer.MIN_VALUE;
            h0(viewU, tVar);
        }
    }

    public final void T0(RecyclerView.t tVar, int i) {
        while (v() > 0) {
            View viewU = u(0);
            s sVar = this.r;
            if (sVar.b(viewU) > i || sVar.m(viewU) > i) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            cVar.getClass();
            if (cVar.e.a.size() == 1) {
                return;
            }
            d dVar = cVar.e;
            ArrayList<View> arrayList = dVar.a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.e = null;
            if (arrayList.size() == 0) {
                dVar.c = Integer.MIN_VALUE;
            }
            if (cVar2.a.h() || cVar2.a.k()) {
                dVar.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            dVar.b = Integer.MIN_VALUE;
            h0(viewU, tVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U(int i, int i2) {
        K0(i, i2, 1);
    }

    public final void U0() {
        if (this.t == 1 || !M0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V() {
        this.B.a();
        k0();
    }

    public final int V0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        Q0(i, xVar);
        n nVar = this.v;
        int iB0 = B0(tVar, nVar, xVar);
        if (nVar.b >= iB0) {
            i = i < 0 ? -iB0 : iB0;
        }
        this.r.o(-i);
        this.D = this.x;
        nVar.b = 0;
        R0(tVar, nVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W(int i, int i2) {
        K0(i, i2, 8);
    }

    public final void W0(int i) {
        n nVar = this.v;
        nVar.e = i;
        nVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X(int i, int i2) {
        K0(i, i2, 2);
    }

    public final void X0(int i, RecyclerView.x xVar) {
        int iL;
        int iL2;
        int i2;
        n nVar = this.v;
        boolean z = false;
        nVar.b = 0;
        nVar.c = i;
        o oVar = this.e;
        s sVar = this.r;
        if (oVar == null || !oVar.e || (i2 = xVar.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iL = sVar.l();
                iL2 = 0;
            } else {
                iL2 = sVar.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.W) {
            nVar.g = sVar.f() + iL;
            nVar.f = -iL2;
        } else {
            nVar.f = sVar.k() - iL2;
            nVar.g = sVar.g() + iL;
        }
        nVar.h = false;
        nVar.a = true;
        if (sVar.i() == 0 && sVar.f() == 0) {
            z = true;
        }
        nVar.i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(int i, int i2) {
        K0(i, i2, 4);
    }

    public final void Y0(d dVar, int i, int i2) {
        int i3 = dVar.d;
        int i4 = dVar.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = dVar.c;
            if (i5 == Integer.MIN_VALUE) {
                dVar.a();
                i5 = dVar.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = dVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = dVar.a.get(0);
            c cVar = (c) view.getLayoutParams();
            dVar.b = StaggeredGridLayoutManager.this.r.e(view);
            cVar.getClass();
            i6 = dVar.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z(RecyclerView.t tVar, RecyclerView.x xVar) {
        O0(tVar, xVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.G0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.t
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0(RecyclerView.x xVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.z != -1) {
                savedState.a = -1;
                savedState.b = -1;
                savedState.d = null;
                savedState.c = 0;
                savedState.e = 0;
                savedState.f = null;
                savedState.V = null;
            }
            k0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable c0() {
        int iH;
        int iK;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.c = savedState.c;
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.d = savedState.d;
            savedState2.e = savedState.e;
            savedState2.f = savedState.f;
            savedState2.W = savedState.W;
            savedState2.X = savedState.X;
            savedState2.Y = savedState.Y;
            savedState2.V = savedState.V;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.W = this.w;
        savedState3.X = this.D;
        savedState3.Y = this.E;
        LazySpanLookup lazySpanLookup = this.B;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.a) == null) {
            savedState3.e = 0;
        } else {
            savedState3.f = iArr;
            savedState3.e = iArr.length;
            savedState3.V = lazySpanLookup.b;
        }
        if (v() <= 0) {
            savedState3.a = -1;
            savedState3.b = -1;
            savedState3.c = 0;
            return savedState3;
        }
        savedState3.a = this.D ? H0() : G0();
        View viewC0 = this.x ? C0(true) : D0(true);
        savedState3.b = viewC0 != null ? RecyclerView.m.E(viewC0) : -1;
        int i = this.p;
        savedState3.c = i;
        savedState3.d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.D;
            s sVar = this.r;
            d[] dVarArr = this.q;
            if (z) {
                iH = dVarArr[i2].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = sVar.g();
                    iH -= iK;
                }
            } else {
                iH = dVarArr[i2].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = sVar.k();
                    iH -= iK;
                }
            }
            savedState3.d[i2] = iH;
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean d() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d0(int i) {
        if (i == 0) {
            z0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void h(int i, int i2, RecyclerView.x xVar, m.b bVar) {
        n nVar;
        int iF;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        Q0(i, xVar);
        int[] iArr = this.J;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            nVar = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = nVar.d;
            d[] dVarArr = this.q;
            if (i6 == -1) {
                int i7 = nVar.f;
                iF = i7 - dVarArr[i4].h(i7);
            } else {
                iF = dVarArr[i4].f(nVar.g) - nVar.g;
            }
            if (iF >= 0) {
                this.J[i5] = iF;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = nVar.c;
            if (i9 < 0 || i9 >= xVar.b()) {
                return;
            }
            bVar.a(nVar.c, this.J[i8]);
            nVar.c += nVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int j(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return y.a(xVar, this.r, D0(z), C0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.x xVar) {
        return A0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return y.c(xVar, this.r, D0(z), C0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        return V0(i, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return y.a(xVar, this.r, D0(z), C0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void m0(int i) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.a != i) {
            savedState.d = null;
            savedState.c = 0;
            savedState.a = -1;
            savedState.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        k0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.x xVar) {
        return A0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
        return V0(i, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.x xVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return y.c(xVar, this.r, D0(z), C0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        int iC = C() + B();
        int iA = A() + D();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + iA;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            iG2 = RecyclerView.m.g(i2, iHeight, recyclerView.getMinimumHeight());
            iG = RecyclerView.m.g(i, (this.u * i4) + iC, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iC;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            iG = RecyclerView.m.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = RecyclerView.m.g(i2, (this.u * i4) + iA, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n r() {
        return this.t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void w0(RecyclerView recyclerView, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i;
        x0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean y0() {
        return this.F == null;
    }

    public final boolean z0() {
        int iG0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iG0 = H0();
                G0();
            } else {
                iG0 = G0();
                H0();
            }
            if (iG0 == 0 && L0() != null) {
                this.B.a();
                this.f = true;
                k0();
                return true;
            }
        }
        return false;
    }
}
