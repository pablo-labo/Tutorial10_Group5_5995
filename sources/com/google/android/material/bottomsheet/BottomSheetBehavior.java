package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.indeed.android.jobsearch.R;
import defpackage.ck1;
import defpackage.dk1;
import defpackage.ece;
import defpackage.ek1;
import defpackage.epg;
import defpackage.gsg;
import defpackage.ie7;
import defpackage.l5;
import defpackage.lac;
import defpackage.prg;
import defpackage.t6;
import defpackage.tpg;
import defpackage.y5;
import defpackage.ye9;
import defpackage.ze9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public float A;
    public int B;
    public final float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public tpg H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference<V> O;
    public WeakReference<View> P;
    public final ArrayList<c> Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public HashMap V;
    public int W;
    public final b X;
    public final int a;
    public boolean b;
    public final float c;
    public int d;
    public boolean e;
    public int f;
    public final int g;
    public final boolean h;
    public ze9 i;
    public int j;
    public int k;
    public int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public int r;
    public int s;
    public ece t;
    public boolean u;
    public BottomSheetBehavior<V>.d v;
    public final ValueAnimator w;
    public int x;
    public int y;
    public int z;

    public final class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.J(this.a, this.b);
        }
    }

    public class b extends tpg.c {
        public b() {
        }

        @Override // tpg.c
        public final int a(View view, int i) {
            return view.getLeft();
        }

        @Override // tpg.c
        public final int b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return ie7.i(i, bottomSheetBehavior.A(), bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
        }

        @Override // tpg.c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B;
        }

        @Override // tpg.c
        public final void h(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.F) {
                    bottomSheetBehavior.I(1);
                }
            }
        }

        @Override // tpg.c
        public final void i(View view, int i, int i2) {
            BottomSheetBehavior.this.w(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
        @Override // tpg.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j(android.view.View r5, float r6, float r7) {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.j(android.view.View, float, float):void");
        }

        @Override // tpg.c
        public final boolean k(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.G;
            if (i2 == 1 || bottomSheetBehavior.U) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.S == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.P;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.O;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    public class d implements Runnable {
        public final View a;
        public boolean b;
        public int c;

        public d(View view, int i) {
            this.a = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            tpg tpgVar = bottomSheetBehavior.H;
            if (tpgVar == null || !tpgVar.g()) {
                bottomSheetBehavior.I(this.c);
            } else {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                this.a.postOnAnimation(this);
            }
            this.b = false;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new b();
        this.g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.e);
        this.h = typedArrayObtainStyledAttributes.hasValue(17);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        if (zHasValue) {
            v(context, attributeSet, zHasValue, ye9.b(context, typedArrayObtainStyledAttributes, 3));
        } else {
            v(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.w.addUpdateListener(new ck1(this));
        this.C = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            G(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            G(i);
        }
        F(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.m = typedArrayObtainStyledAttributes.getBoolean(12, false);
        D(typedArrayObtainStyledAttributes.getBoolean(6, true));
        this.E = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.F = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        E(typedArrayObtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            C(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            C(typedValuePeekValue2.data);
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(16, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View x(View view) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (epg.d.h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewX = x(viewGroup.getChildAt(i));
            if (viewX != null) {
                return viewX;
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> y(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            l5.q("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        l5.q("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int z(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int A() {
        if (this.b) {
            return this.y;
        }
        return Math.max(this.x, this.q ? 0 : this.s);
    }

    public final void B(c cVar) {
        this.Q.remove(cVar);
    }

    public final void C(int i) {
        if (i >= 0) {
            this.x = i;
        } else {
            l5.q("offset must be greater than or equal to 0");
        }
    }

    public final void D(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.O != null) {
            t();
        }
        I((this.b && this.G == 6) ? 3 : this.G);
        M();
    }

    public final void E(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            l5.q("ratio must be a float value between 0 and 1");
            return;
        }
        this.A = f;
        if (this.O != null) {
            this.z = (int) ((1.0f - f) * this.N);
        }
    }

    public final void F(boolean z) {
        if (this.D != z) {
            this.D = z;
            if (!z && this.G == 5) {
                H(4);
            }
            M();
        }
    }

    public final void G(int i) {
        boolean z = this.e;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.e = true;
            }
        } else {
            if (!z && this.d == i) {
                return;
            }
            this.e = false;
            this.d = Math.max(0, i);
        }
        P();
    }

    public final void H(int i) {
        if (i == this.G) {
            return;
        }
        if (this.O == null) {
            if (i == 4 || i == 3 || i == 6 || (this.D && i == 5)) {
                this.G = i;
                return;
            }
            return;
        }
        V v = this.O.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (v.isAttachedToWindow()) {
                v.post(new a(v, i));
                return;
            }
        }
        J(v, i);
    }

    public final void I(int i) {
        V v;
        if (this.G == i) {
            return;
        }
        this.G = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.D;
        }
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            O(true);
        } else if (i == 6 || i == 5 || i == 4) {
            O(false);
        }
        N(i);
        while (true) {
            ArrayList<c> arrayList = this.Q;
            if (i2 >= arrayList.size()) {
                M();
                return;
            } else {
                arrayList.get(i2).b(v, i);
                i2++;
            }
        }
    }

    public final void J(View view, int i) {
        int iA;
        int i2;
        if (i == 4) {
            iA = this.B;
        } else if (i == 6) {
            iA = this.z;
            if (this.b && iA <= (i2 = this.y)) {
                i = 3;
                iA = i2;
            }
        } else if (i == 3) {
            iA = A();
        } else {
            if (!this.D || i != 5) {
                Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
                return;
            }
            iA = this.N;
        }
        L(view, i, iA, false);
    }

    public final boolean K(View view, float f) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.B)) / ((float) u()) > 0.5f;
    }

    public final void L(View view, int i, int i2, boolean z) {
        tpg tpgVar = this.H;
        if (tpgVar == null || (!z ? tpgVar.s(view, view.getLeft(), i2) : tpgVar.q(view.getLeft(), i2))) {
            I(i);
            return;
        }
        I(2);
        N(i);
        if (this.v == null) {
            this.v = new d(view, i);
        }
        BottomSheetBehavior<V>.d dVar = this.v;
        if (dVar.b) {
            dVar.c = i;
            return;
        }
        dVar.c = i;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        view.postOnAnimation(dVar);
        this.v.b = true;
    }

    public final void M() {
        V v;
        int iA;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        epg.l(v, 524288);
        epg.h(v, 0);
        epg.l(v, 262144);
        epg.h(v, 0);
        epg.l(v, 1048576);
        epg.h(v, 0);
        int i = this.W;
        if (i != -1) {
            epg.l(v, i);
            epg.h(v, 0);
        }
        if (!this.b && this.G != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            ek1 ek1Var = new ek1(this, 6);
            ArrayList arrayListF = epg.f(v);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListF.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = epg.d;
                        if (i3 >= 32 || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListF.size(); i6++) {
                            z &= ((t6.a) arrayListF.get(i6)).a() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iA = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((t6.a) arrayListF.get(i2)).a).getLabel())) {
                        iA = ((t6.a) arrayListF.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                t6.a aVar = new t6.a(null, iA, string, ek1Var, null);
                y5 y5VarD = epg.d(v);
                if (y5VarD == null) {
                    y5VarD = new y5();
                }
                epg.o(v, y5VarD);
                epg.l(v, aVar.a());
                epg.f(v).add(aVar);
                epg.h(v, 0);
            }
            this.W = iA;
        }
        if (this.D && this.G != 5) {
            epg.m(v, t6.a.o, new ek1(this, 5));
        }
        int i7 = this.G;
        if (i7 == 3) {
            epg.m(v, t6.a.n, new ek1(this, this.b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            epg.m(v, t6.a.m, new ek1(this, this.b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            epg.m(v, t6.a.n, new ek1(this, 4));
            epg.m(v, t6.a.m, new ek1(this, 3));
        }
    }

    public final void N(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.u != z) {
            this.u = z;
            if (this.i == null || (valueAnimator = this.w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f, f);
            valueAnimator.start();
        }
    }

    public final void O(boolean z) {
        WeakReference<V> weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.V != null) {
                    return;
                } else {
                    this.V = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.O.get() && z) {
                    this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.V = null;
        }
    }

    public final void P() {
        V v;
        if (this.O != null) {
            t();
            if (this.G != 4 || (v = this.O.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.O = null;
        this.H = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.O = null;
        this.H = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        tpg tpgVar;
        if (!v.isShown() || !this.F) {
            this.I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.T = (int) motionEvent.getY();
            if (this.G != 2) {
                WeakReference<View> weakReference = this.P;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.l(view, x, this.T)) {
                    this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.U = true;
                }
            }
            this.I = this.S == -1 && !coordinatorLayout.l(v, x, this.T);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.U = false;
            this.S = -1;
            if (this.I) {
                this.I = false;
                return false;
            }
        }
        if (this.I || (tpgVar = this.H) == null || !tpgVar.r(motionEvent)) {
            WeakReference<View> weakReference2 = this.P;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.I || this.G == 1 || coordinatorLayout.l(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(this.T - motionEvent.getY()) <= this.H.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
        ze9 ze9Var;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.m || this.e) ? false : true;
            if (this.n || this.o || this.p || z) {
                gsg.a(v, new dk1(this, z));
            }
            this.O = new WeakReference<>(v);
            if (this.h && (ze9Var = this.i) != null) {
                v.setBackground(ze9Var);
            }
            ze9 ze9Var2 = this.i;
            if (ze9Var2 != null) {
                float fE = this.C;
                if (fE == -1.0f) {
                    fE = epg.d.e(v);
                }
                ze9Var2.j(fE);
                boolean z2 = this.G == 3;
                this.u = z2;
                ze9 ze9Var3 = this.i;
                float f = z2 ? 0.0f : 1.0f;
                ze9.b bVar = ze9Var3.a;
                if (bVar.i != f) {
                    bVar.i = f;
                    ze9Var3.e = true;
                    ze9Var3.invalidateSelf();
                }
            }
            M();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.H == null) {
            this.H = new tpg(coordinatorLayout.getContext(), coordinatorLayout, this.X);
        }
        int top = v.getTop();
        coordinatorLayout.q(v, i);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.L = height;
        int i2 = this.N;
        int i3 = i2 - height;
        int i4 = this.s;
        if (i3 < i4) {
            if (this.q) {
                this.L = i2;
            } else {
                this.L = i2 - i4;
            }
        }
        this.y = Math.max(0, i2 - this.L);
        this.z = (int) ((1.0f - this.A) * this.N);
        t();
        int i5 = this.G;
        if (i5 == 3) {
            v.offsetTopAndBottom(A());
        } else if (i5 == 6) {
            v.offsetTopAndBottom(this.z);
        } else if (this.D && i5 == 5) {
            v.offsetTopAndBottom(this.N);
        } else if (i5 == 4) {
            v.offsetTopAndBottom(this.B);
        } else if (i5 == 1 || i5 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.P = new WeakReference<>(x(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(z(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.j, marginLayoutParams.width), z(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.P;
        return (weakReference == null || view != weakReference.get() || this.G == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < A()) {
                int iA = top - A();
                iArr[1] = iA;
                int i5 = -iA;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                v.offsetTopAndBottom(i5);
                I(3);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                v.offsetTopAndBottom(-i2);
                I(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.B;
            if (i4 > i6 && !this.D) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap<View, prg> weakHashMap3 = epg.a;
                v.offsetTopAndBottom(i8);
                I(4);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, prg> weakHashMap4 = epg.a;
                v.offsetTopAndBottom(-i2);
                I(1);
            }
        }
        w(v.getTop());
        this.J = i2;
        this.K = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = savedState.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.D = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.E = savedState.V;
            }
        }
        int i2 = savedState.c;
        if (i2 == 1 || i2 == 2) {
            this.G = 4;
        } else {
            this.G = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.J = 0;
        this.K = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.G;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        tpg tpgVar = this.H;
        if (tpgVar != null && (this.F || i == 1)) {
            tpgVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.S = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (this.H != null && ((this.F || this.G == 1) && actionMasked == 2 && !this.I)) {
            float fAbs = Math.abs(this.T - motionEvent.getY());
            tpg tpgVar2 = this.H;
            if (fAbs > tpgVar2.b) {
                tpgVar2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.I;
    }

    public final void s(c cVar) {
        ArrayList<c> arrayList = this.Q;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    public final void t() {
        int iU = u();
        boolean z = this.b;
        int i = this.N;
        if (z) {
            this.B = Math.max(i - iU, this.y);
        } else {
            this.B = i - iU;
        }
    }

    public final int u() {
        int iMin;
        int i;
        int i2;
        if (this.e) {
            iMin = Math.min(Math.max(this.f, this.N - ((this.M * 9) / 16)), this.L);
            i = this.r;
        } else {
            if (!this.m && !this.n && (i2 = this.l) > 0) {
                return Math.max(this.d, i2 + this.g);
            }
            iMin = this.d;
            i = this.r;
        }
        return iMin + i;
    }

    public final void v(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.h) {
            this.t = ece.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
            ze9 ze9Var = new ze9(this.t);
            this.i = ze9Var;
            ze9Var.i(context);
            if (z && colorStateList != null) {
                this.i.k(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.i.setTint(typedValue.data);
        }
    }

    public final void w(int i) {
        float f;
        float fA;
        V v = this.O.get();
        if (v != null) {
            ArrayList<c> arrayList = this.Q;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.B;
            if (i > i2 || i2 == A()) {
                int i3 = this.B;
                f = i3 - i;
                fA = this.N - i3;
            } else {
                int i4 = this.B;
                f = i4 - i;
                fA = i4 - A();
            }
            float f2 = f / fA;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                arrayList.get(i5).a(v, f2);
            }
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean V;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.V = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.V ? 1 : 0);
        }

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.G;
            this.d = bottomSheetBehavior.d;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.D;
            this.V = bottomSheetBehavior.E;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new b();
    }
}
