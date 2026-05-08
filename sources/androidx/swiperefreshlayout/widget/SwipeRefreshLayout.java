package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import defpackage.a52;
import defpackage.bfa;
import defpackage.cfa;
import defpackage.dfa;
import defpackage.efa;
import defpackage.epg;
import defpackage.ffa;
import defpackage.iac;
import defpackage.mkf;
import defpackage.n1f;
import defpackage.o1f;
import defpackage.p1f;
import defpackage.prg;
import defpackage.ra6;
import defpackage.soc;
import defpackage.t42;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements efa, dfa, bfa {
    public static final int[] D0 = {R.attr.enabled};
    public final a A0;
    public final c B0;
    public final d C0;
    public final ffa V;
    public final cfa W;
    public View a;
    public final int[] a0;
    public f b;
    public final int[] b0;
    public boolean c;
    public final int[] c0;
    public final int d;
    public boolean d0;
    public float e;
    public final int e0;
    public float f;
    public int f0;
    public float g0;
    public float h0;
    public boolean i0;
    public int j0;
    public final DecelerateInterpolator k0;
    public final t42 l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final a52 r0;
    public n1f s0;
    public o1f t0;
    public p1f u0;
    public p1f v0;
    public boolean w0;
    public int x0;
    public boolean y0;
    public boolean z0;

    public class a implements Animation.AnimationListener {
        public final /* synthetic */ soc a;

        public a(soc socVar) {
            this.a = socVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            soc socVar = this.a;
            if (!socVar.c) {
                socVar.f();
                return;
            }
            socVar.r0.setAlpha(255);
            socVar.r0.start();
            if (socVar.w0 && (fVar = socVar.b) != null) {
                ra6 ra6Var = (ra6) fVar;
                SwipeRefreshLayoutManager.addEventEmitters$lambda$0((mkf) ra6Var.a, (soc) ra6Var.b);
            }
            socVar.f0 = socVar.l0.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            o1f o1fVar = new o1f(swipeRefreshLayout);
            swipeRefreshLayout.t0 = o1fVar;
            o1fVar.setDuration(150L);
            t42 t42Var = swipeRefreshLayout.l0;
            t42Var.a = null;
            t42Var.clearAnimation();
            swipeRefreshLayout.l0.startAnimation(swipeRefreshLayout.t0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class c extends Animation {
        public final /* synthetic */ soc a;

        public c(soc socVar) {
            this.a = socVar;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            soc socVar = this.a;
            boolean z = socVar.y0;
            int iAbs = socVar.p0;
            if (!z) {
                iAbs -= Math.abs(socVar.o0);
            }
            socVar.setTargetOffsetTopAndBottom((socVar.n0 + ((int) ((iAbs - r3) * f))) - socVar.l0.getTop());
            a52 a52Var = socVar.r0;
            float f2 = 1.0f - f;
            a52.a aVar = a52Var.a;
            if (f2 != aVar.p) {
                aVar.p = f2;
            }
            a52Var.invalidateSelf();
        }
    }

    public class d extends Animation {
        public final /* synthetic */ soc a;

        public d(soc socVar) {
            this.a = socVar;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            this.a.e(f);
        }
    }

    public interface e {
    }

    public interface f {
    }

    public SwipeRefreshLayout(mkf mkfVar) {
        super(mkfVar, null);
        this.c = false;
        this.e = -1.0f;
        this.a0 = new int[2];
        this.b0 = new int[2];
        this.c0 = new int[2];
        this.j0 = -1;
        this.m0 = -1;
        soc socVar = (soc) this;
        this.A0 = new a(socVar);
        this.B0 = new c(socVar);
        this.C0 = new d(socVar);
        this.d = ViewConfiguration.get(mkfVar).getScaledTouchSlop();
        this.e0 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.k0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.x0 = (int) (displayMetrics.density * 40.0f);
        t42 t42Var = new t42(getContext());
        float f2 = t42Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = t42Var.getContext().obtainStyledAttributes(iac.a);
        t42Var.b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.k(t42Var, f2 * 4.0f);
        shapeDrawable.getPaint().setColor(t42Var.b);
        t42Var.setBackground(shapeDrawable);
        this.l0 = t42Var;
        a52 a52Var = new a52(getContext());
        this.r0 = a52Var;
        a52Var.c(1);
        this.l0.setImageDrawable(this.r0);
        this.l0.setVisibility(8);
        addView(this.l0);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.p0 = i;
        this.e = i;
        this.V = new ffa();
        this.W = new cfa(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.x0;
        this.f0 = i2;
        this.o0 = i2;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = mkfVar.obtainStyledAttributes((AttributeSet) null, D0);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.l0.getBackground().setAlpha(i);
        this.r0.setAlpha(i);
    }

    public boolean a() {
        View view = this.a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.l0)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f2) {
        if (f2 > this.e) {
            g(true, true);
            return;
        }
        this.c = false;
        a52 a52Var = this.r0;
        a52.a aVar = a52Var.a;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        a52Var.invalidateSelf();
        b bVar = new b();
        this.n0 = this.f0;
        d dVar = this.C0;
        dVar.reset();
        dVar.setDuration(200L);
        dVar.setInterpolator(this.k0);
        t42 t42Var = this.l0;
        t42Var.a = bVar;
        t42Var.clearAnimation();
        t42Var.startAnimation(dVar);
        a52.a aVar2 = a52Var.a;
        if (aVar2.n) {
            aVar2.n = false;
        }
        a52Var.invalidateSelf();
    }

    public final void d(float f2) {
        float f3;
        p1f p1fVar;
        p1f p1fVar2;
        a52 a52Var = this.r0;
        a52.a aVar = a52Var.a;
        if (!aVar.n) {
            aVar.n = true;
        }
        a52Var.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f2 / this.e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.e;
        int i = this.q0;
        if (i > 0) {
            f3 = i;
        } else {
            boolean z = this.y0;
            int i2 = this.p0;
            if (z) {
                i2 -= this.o0;
            }
            f3 = i2;
        }
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i3 = this.o0 + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        t42 t42Var = this.l0;
        if (t42Var.getVisibility() != 0) {
            t42Var.setVisibility(0);
        }
        t42Var.setScaleX(1.0f);
        t42Var.setScaleY(1.0f);
        if (f2 < this.e) {
            if (a52Var.a.t > 76 && ((p1fVar2 = this.u0) == null || !p1fVar2.hasStarted() || p1fVar2.hasEnded())) {
                p1f p1fVar3 = new p1f(this, a52Var.a.t, 76);
                p1fVar3.setDuration(300L);
                t42Var.a = null;
                t42Var.clearAnimation();
                t42Var.startAnimation(p1fVar3);
                this.u0 = p1fVar3;
            }
        } else if (a52Var.a.t < 255 && ((p1fVar = this.v0) == null || !p1fVar.hasStarted() || p1fVar.hasEnded())) {
            p1f p1fVar4 = new p1f(this, a52Var.a.t, 255);
            p1fVar4.setDuration(300L);
            t42Var.a = null;
            t42Var.clearAnimation();
            t42Var.startAnimation(p1fVar4);
            this.v0 = p1fVar4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        a52.a aVar2 = a52Var.a;
        aVar2.e = 0.0f;
        aVar2.f = fMin2;
        a52Var.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        a52.a aVar3 = a52Var.a;
        if (fMin3 != aVar3.p) {
            aVar3.p = fMin3;
        }
        a52Var.invalidateSelf();
        a52Var.a.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        a52Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.f0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.W.a(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.W.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.W.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.W.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e(float f2) {
        setTargetOffsetTopAndBottom((this.n0 + ((int) ((this.o0 - r0) * f2))) - this.l0.getTop());
    }

    public final void f() {
        this.l0.clearAnimation();
        this.r0.stop();
        this.l0.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.o0 - this.f0);
        this.f0 = this.l0.getTop();
    }

    public final void g(boolean z, boolean z2) {
        if (this.c != z) {
            this.w0 = z2;
            b();
            this.c = z;
            t42 t42Var = this.l0;
            a aVar = this.A0;
            if (!z) {
                o1f o1fVar = new o1f(this);
                this.t0 = o1fVar;
                o1fVar.setDuration(150L);
                t42Var.a = aVar;
                t42Var.clearAnimation();
                t42Var.startAnimation(this.t0);
                return;
            }
            this.n0 = this.f0;
            c cVar = this.B0;
            cVar.reset();
            cVar.setDuration(200L);
            cVar.setInterpolator(this.k0);
            if (aVar != null) {
                t42Var.a = aVar;
            }
            t42Var.clearAnimation();
            t42Var.startAnimation(cVar);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.m0;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ffa ffaVar = this.V;
        return ffaVar.b | ffaVar.a;
    }

    public int getProgressCircleDiameter() {
        return this.x0;
    }

    public int getProgressViewEndOffset() {
        return this.p0;
    }

    public int getProgressViewStartOffset() {
        return this.o0;
    }

    public final void h(float f2) {
        float f3 = this.h0;
        float f4 = f2 - f3;
        float f5 = this.d;
        if (f4 <= f5 || this.i0) {
            return;
        }
        this.g0 = f3 + f5;
        this.i0 = true;
        this.r0.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.W.f(0);
    }

    @Override // defpackage.dfa
    public final void i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.W.d;
    }

    @Override // defpackage.dfa
    public final void j(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.dfa
    public final void k(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.efa
    public final void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.W.d(i, i2, i3, i4, this.b0, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? this.b0[1] + i4 : i7) >= 0 || a()) {
            return;
        }
        float fAbs = this.f + Math.abs(r12);
        this.f = fAbs;
        d(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // defpackage.dfa
    public final void n(View view, int i, int i2, int i3, int i4, int i5) {
        m(view, i, i2, i3, i4, i5, this.c0);
    }

    @Override // defpackage.dfa
    public final boolean o(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.b()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.a()
            if (r1 != 0) goto L88
            boolean r1 = r5.c
            if (r1 != 0) goto L88
            boolean r1 = r5.d0
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.j0
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.j0 = r6
            goto L85
        L44:
            int r0 = r5.j0
            if (r0 != r3) goto L50
            java.lang.String r5 = "SwipeRefreshLayout"
            java.lang.String r6 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r6)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            goto L88
        L57:
            float r6 = r6.getY(r0)
            r5.h(r6)
            goto L85
        L5f:
            r5.i0 = r2
            r5.j0 = r3
            goto L85
        L64:
            int r0 = r5.o0
            t42 r1 = r5.l0
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r5.setTargetOffsetTopAndBottom(r0)
            int r0 = r6.getPointerId(r2)
            r5.j0 = r0
            r5.i0 = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            goto L88
        L7f:
            float r6 = r6.getY(r0)
            r5.h0 = r6
        L85:
            boolean r5 = r5.i0
            return r5
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.l0.getMeasuredWidth();
        int measuredHeight2 = this.l0.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f0;
        this.l0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.l0.measure(View.MeasureSpec.makeMeasureSpec(this.x0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.x0, 1073741824));
        this.m0 = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.l0) {
                this.m0 = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return this.W.a(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.W.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f2 = this.f;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f = 0.0f;
                } else {
                    this.f = f2 - f3;
                    iArr[1] = i2;
                }
                d(this.f);
            }
        }
        if (this.y0 && i2 > 0 && this.f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.l0.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.a0;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m(view, i, i2, i3, i4, 0, this.c0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.V.a = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.d0 = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.V.a = 0;
        this.d0 = false;
        float f2 = this.f;
        if (f2 > 0.0f) {
            c(f2);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.d0) {
            if (actionMasked == 0) {
                this.j0 = motionEvent.getPointerId(0);
                this.i0 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.j0);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.i0) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.g0) * 0.5f;
                    this.i0 = false;
                    c(y);
                }
                this.j0 = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.j0);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                h(y2);
                if (this.i0) {
                    float f2 = (y2 - this.g0) * 0.5f;
                    if (f2 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        d(f2);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.j0) {
                            this.j0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.j0 = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.z0 && (view = this.a) != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (!epg.d.h(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f2) {
        this.l0.setScaleX(f2);
        this.l0.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        a52 a52Var = this.r0;
        a52.a aVar = a52Var.a;
        aVar.i = iArr;
        aVar.a(0);
        aVar.a(0);
        a52Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.z0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        cfa cfaVar = this.W;
        if (cfaVar.d) {
            ViewGroup viewGroup = cfaVar.c;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.o(viewGroup);
        }
        cfaVar.d = z;
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }

    public void setOnRefreshListener(f fVar) {
        this.b = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.l0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.c == z) {
            g(z, false);
            return;
        }
        this.c = z;
        boolean z2 = this.y0;
        int i = this.p0;
        if (!z2) {
            i += this.o0;
        }
        setTargetOffsetTopAndBottom(i - this.f0);
        this.w0 = false;
        t42 t42Var = this.l0;
        t42Var.setVisibility(0);
        this.r0.setAlpha(255);
        n1f n1fVar = new n1f(this);
        this.s0 = n1fVar;
        n1fVar.setDuration(this.e0);
        a aVar = this.A0;
        if (aVar != null) {
            t42Var.a = aVar;
        }
        t42Var.clearAnimation();
        t42Var.startAnimation(this.s0);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.x0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.x0 = (int) (displayMetrics.density * 40.0f);
            }
            this.l0.setImageDrawable(null);
            this.r0.c(i);
            this.l0.setImageDrawable(this.r0);
        }
    }

    public void setSlingshotDistance(int i) {
        this.q0 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        t42 t42Var = this.l0;
        t42Var.bringToFront();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        t42Var.offsetTopAndBottom(i);
        this.f0 = t42Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.W.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.W.h(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }
    }
}
