package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.d;
import com.indeed.android.jobsearch.R;
import defpackage.cj1;
import defpackage.coc;
import defpackage.doc;
import defpackage.eg9;
import defpackage.epg;
import defpackage.fxa;
import defpackage.hh1;
import defpackage.hnc;
import defpackage.hra;
import defpackage.ie7;
import defpackage.joc;
import defpackage.jpf;
import defpackage.kjc;
import defpackage.l6;
import defpackage.mkf;
import defpackage.msb;
import defpackage.nn2;
import defpackage.o6;
import defpackage.ou8;
import defpackage.prg;
import defpackage.pu8;
import defpackage.qeb;
import defpackage.s55;
import defpackage.v71;
import defpackage.vse;
import defpackage.web;
import defpackage.wjc;
import defpackage.wmg;
import defpackage.xjc;
import defpackage.zi1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends ScrollView implements wjc, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, kjc, hnc, d.c, d.e, d.a, d.b, d.InterfaceC0142d {
    public static Field B0 = null;
    public static boolean C0 = false;
    public int A0;
    public Rect V;
    public fxa W;
    public final hra a;
    public boolean a0;
    public final OverScroller b;
    public boolean b0;
    public final wmg c;
    public coc c0;
    public final Rect d;
    public boolean d0;
    public final Rect e;
    public boolean e0;
    public boolean f;
    public boolean f0;
    public ColorDrawable g0;
    public int h0;
    public boolean i0;
    public int j0;
    public List<Integer> k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public View o0;
    public ReadableMap p0;
    public int q0;
    public int r0;
    public vse s0;
    public final d.h t0;
    public final ObjectAnimator u0;
    public qeb v0;
    public long w0;
    public int x0;
    public a y0;
    public int z0;

    public c(mkf mkfVar) {
        super(mkfVar);
        this.a = new hra();
        this.c = new wmg();
        this.d = new Rect();
        this.e = new Rect();
        this.W = fxa.d;
        this.b0 = false;
        this.e0 = true;
        this.h0 = 0;
        this.i0 = false;
        this.j0 = 0;
        this.l0 = true;
        this.m0 = true;
        this.n0 = 0;
        this.p0 = null;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = null;
        this.t0 = new d.h();
        this.u0 = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.v0 = qeb.e;
        this.w0 = 0L;
        this.x0 = 0;
        this.y0 = null;
        this.z0 = 0;
        this.A0 = 0;
        this.b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        epg.o(this, new doc());
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.o0;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private int getSnapInterval() {
        int i = this.j0;
        return i != 0 ? i : getHeight();
    }

    @Override // com.facebook.react.views.scroll.d.InterfaceC0142d
    public final void a(int i, int i2) {
        scrollTo(i, i2);
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = overScroller.getCurrY();
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        overScroller.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(getScrollX(), (overScroller.getCurrX() - currY) + i2);
            return;
        }
        this.b.fling(getScrollX(), i2, 0, (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalY() - overScroller.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    @Override // com.facebook.react.views.scroll.d.InterfaceC0142d
    public final void b(int i, int i2) {
        d.k(this, i, i2);
        if (i()) {
            this.q0 = -1;
            this.r0 = -1;
        } else {
            this.q0 = i;
            this.r0 = i2;
        }
    }

    @Override // defpackage.kjc
    public final boolean c(View view) {
        Rect rect = this.d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        view.getDrawingRect(rect);
        return iComputeScrollDeltaToGetChildRectOnScreen != 0 && Math.abs(iComputeScrollDeltaToGetChildRectOnScreen) < rect.width();
    }

    @Override // com.facebook.react.views.scroll.d.a
    public final void d(int i, int i2) {
        ObjectAnimator objectAnimator = this.u0;
        objectAnimator.cancel();
        int iF = d.f(getContext());
        objectAnimator.setDuration(iF).setIntValues(i, i2);
        objectAnimator.start();
        if (this.f0) {
            d.c(this, g.e, 0.0f, iF > 0 ? (i2 - i) / iF : 0);
            getFlingAnimator().addListener(new joc(this));
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        qeb qebVar = this.v0;
        qeb.a.getClass();
        if (qeb.a.b(qebVar)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.h0 != 0) {
            View contentView = getContentView();
            if (this.g0 != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.g0.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.g0.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public final void e() {
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.e0 || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void f(int i) {
        int iFloor;
        int iMin;
        int iIntValue;
        int iIntValue2;
        int top;
        int top2;
        int height;
        OverScroller overScroller;
        int scrollY = i;
        if (getChildCount() <= 0) {
            return;
        }
        int i2 = 1;
        if (this.j0 == 0 && this.k0 == null && this.n0 == 0) {
            double snapInterval = getSnapInterval();
            double dG = d.g(this, getScrollY(), getReactScrollViewScrollState().a.y, scrollY);
            double dJ = j(i);
            double d = dG / snapInterval;
            int iFloor2 = (int) Math.floor(d);
            int iCeil = (int) Math.ceil(d);
            int iRound = (int) Math.round(d);
            int iRound2 = (int) Math.round(dJ / snapInterval);
            if (scrollY > 0 && iCeil == iFloor2) {
                iCeil++;
            } else if (scrollY < 0 && iFloor2 == iCeil) {
                iFloor2--;
            }
            if (scrollY > 0 && iRound < iCeil && iRound2 > iFloor2) {
                iRound = iCeil;
            } else if (scrollY < 0 && iRound > iFloor2 && iRound2 < iCeil) {
                iRound = iFloor2;
            }
            double d2 = ((double) iRound) * snapInterval;
            if (d2 != dG) {
                this.f = true;
                b(getScrollX(), (int) d2);
                return;
            }
            return;
        }
        boolean z = getFlingAnimator() != this.u0;
        int maxScrollY = getMaxScrollY();
        int iJ = j(i);
        if (this.i0) {
            iJ = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.k0;
        if (list != null) {
            iIntValue2 = list.get(0).intValue();
            List<Integer> list2 = this.k0;
            iIntValue = list2.get(list2.size() - 1).intValue();
            iMin = maxScrollY;
            iFloor = 0;
            for (int i3 = 0; i3 < this.k0.size(); i3++) {
                int iIntValue3 = this.k0.get(i3).intValue();
                if (iIntValue3 <= iJ && iJ - iIntValue3 < iJ - iFloor) {
                    iFloor = iIntValue3;
                }
                if (iIntValue3 >= iJ && iIntValue3 - iJ < iMin - iJ) {
                    iMin = iIntValue3;
                }
            }
        } else {
            int i4 = this.n0;
            if (i4 != 0) {
                int i5 = this.j0;
                if (i5 > 0) {
                    double d3 = ((double) iJ) / ((double) i5);
                    double dFloor = Math.floor(d3);
                    int i6 = this.j0;
                    iFloor = Math.max(g(i4, (int) (dFloor * ((double) i6)), i6, height2), 0);
                    int i7 = this.n0;
                    double dCeil = Math.ceil(d3);
                    int i8 = this.j0;
                    iMin = Math.min(g(i7, (int) (dCeil * ((double) i8)), i8, height2), maxScrollY);
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i9 = iMin2;
                    int i10 = 0;
                    int i11 = 0;
                    int iMax = 0;
                    while (i10 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i10);
                        int i12 = this.n0;
                        if (i12 != i2) {
                            if (i12 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else if (i12 != 3) {
                                o6.i(this.n0, "Invalid SnapToAlignment value: ");
                                return;
                            } else {
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= iJ && iJ - top < iJ - i11) {
                            i11 = top;
                        }
                        if (top >= iJ && top - iJ < i9 - iJ) {
                            i9 = top;
                        }
                        iMin2 = Math.min(iMin2, top);
                        iMax = Math.max(iMax, top);
                        i10++;
                        i2 = 1;
                    }
                    int iMax2 = Math.max(i11, iMin2);
                    iMin = Math.min(i9, iMax);
                    iFloor = iMax2;
                }
            } else {
                double snapInterval2 = getSnapInterval();
                double d4 = ((double) iJ) / snapInterval2;
                iFloor = (int) (Math.floor(d4) * snapInterval2);
                iMin = Math.min((int) (Math.ceil(d4) * snapInterval2), maxScrollY);
            }
            iIntValue = maxScrollY;
            iIntValue2 = 0;
        }
        int i13 = iJ - iFloor;
        int i14 = iMin - iJ;
        int i15 = Math.abs(i13) < Math.abs(i14) ? iFloor : iMin;
        if (this.m0 || iJ < iIntValue) {
            if (this.l0 || iJ > iIntValue2) {
                if (scrollY > 0) {
                    if (!z) {
                        scrollY += (int) (((double) i14) * 10.0d);
                    }
                    iJ = iMin;
                } else if (scrollY < 0) {
                    if (!z) {
                        scrollY -= (int) (((double) i13) * 10.0d);
                    }
                    iJ = iFloor;
                } else {
                    iJ = i15;
                }
            } else if (getScrollY() > iIntValue2) {
                iJ = iIntValue2;
            }
        } else if (getScrollY() < iIntValue) {
            iJ = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iJ), maxScrollY);
        if (z || (overScroller = this.b) == null) {
            b(getScrollX(), iMin3);
            return;
        }
        this.f = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin3 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin3, iMin3, 0, (iMin3 == 0 || iMin3 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        if (Build.VERSION.SDK_INT == 28) {
            float fSignum = Math.signum(this.a.d);
            if (fSignum == 0.0f) {
                fSignum = Math.signum(i);
            }
            i = (int) (Math.abs(i) * fSignum);
        }
        int i2 = i;
        if (this.b0) {
            f(i2);
        } else if (this.b != null) {
            this.b.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            postInvalidateOnAnimation();
        } else {
            super.fling(i2);
        }
        h(0, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewD;
        View viewFocusSearch = super.focusSearch(view, i);
        return (!ie7.g0.enableCustomFocusSearchOnClippedElementsAndroid() || !(viewFocusSearch == null || findViewById(viewFocusSearch.getId()) == null) || (viewD = d.d(this, view, i)) == null) ? viewFocusSearch : viewD;
    }

    public final int g(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            i5 = (i4 - i3) / 2;
        } else {
            if (i != 3) {
                o6.i(this.n0, "Invalid SnapToAlignment value: ");
                return 0;
            }
            i5 = i4 - i3;
        }
        return i2 - i5;
    }

    @Override // android.widget.ScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return this.A0 / Math.max(this.z0, this.A0);
    }

    @Override // defpackage.wjc
    public final void getClippingRect(Rect rect) {
        Rect rect2 = this.V;
        hh1.n(rect2);
        rect.set(rect2);
    }

    public int getFadingEdgeLengthEnd() {
        return this.A0;
    }

    public int getFadingEdgeLengthStart() {
        return this.z0;
    }

    @Override // com.facebook.react.views.scroll.d.a
    public ValueAnimator getFlingAnimator() {
        return this.u0;
    }

    @Override // com.facebook.react.views.scroll.d.b
    public long getLastScrollDispatchTime() {
        return this.w0;
    }

    public OverScroller getOverScrollerFromParent() {
        if (!C0) {
            C0 = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                B0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                s55.n("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = B0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    s55.n("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e) {
                l6.p("Failed to get mScroller from ScrollView!", e);
            }
        }
        return overScroller;
    }

    @Override // defpackage.gnc
    public String getOverflow() {
        int iOrdinal = this.W.ordinal();
        if (iOrdinal == 0) {
            return "visible";
        }
        if (iOrdinal == 1) {
            return "hidden";
        }
        if (iOrdinal != 2) {
            return null;
        }
        return "scroll";
    }

    @Override // defpackage.hnc
    public Rect getOverflowInset() {
        return this.e;
    }

    public qeb getPointerEvents() {
        return this.v0;
    }

    @Override // com.facebook.react.views.scroll.d.c
    public d.h getReactScrollViewScrollState() {
        return this.t0;
    }

    @Override // defpackage.wjc
    /* JADX INFO: renamed from: getRemoveClippedSubviews */
    public boolean get_removeClippedSubviews() {
        return this.d0;
    }

    @Override // defpackage.kjc
    public boolean getScrollEnabled() {
        return this.e0;
    }

    @Override // com.facebook.react.views.scroll.d.b
    public int getScrollEventThrottle() {
        return this.x0;
    }

    @Override // com.facebook.react.views.scroll.d.e
    public vse getStateWrapper() {
        return this.s0;
    }

    @Override // android.widget.ScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return this.z0 / Math.max(this.z0, this.A0);
    }

    public final void h(int i, int i2) {
        if (this.c0 != null) {
            return;
        }
        if (this.f0) {
            d.c(this, g.e, i, i2);
        }
        this.f = false;
        coc cocVar = new coc(this);
        this.c0 = cocVar;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        postOnAnimationDelayed(cocVar, 20L);
    }

    public final boolean i() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    public final int j(int i) {
        return getFlingAnimator() == this.u0 ? d.j(this, 0, i, 0, getMaxScrollY()).y : d.g(this, getScrollY(), getReactScrollViewScrollState().a.y, i) + d.j(this, 0, i, 0, getMaxScrollY()).y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d0) {
            updateClippingRect(null);
        }
        a aVar = this.y0;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.o0 = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.o0;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.o0 = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.y0;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.W != fxa.b) {
            v71.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e0) {
            qeb qebVar = this.v0;
            qeb.a.getClass();
            if (!qeb.a.b(qebVar)) {
                return true;
            }
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    web.t(this, motionEvent);
                    d.c(this, g.b, 0.0f, 0.0f);
                    this.a0 = true;
                    getFlingAnimator().cancel();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                s55.o("ReactNative", "Error intercepting touch event.", e);
                return false;
            }
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i()) {
            int scrollX = this.q0;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.r0;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        d.b(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.o0 == null) {
            return;
        }
        a aVar = this.y0;
        if (aVar != null && msb.e(aVar.a.getId()) != 2) {
            aVar.e();
        }
        if (isShown() && i()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
        d.a(this);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        eg9.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.b;
        if (overScroller != null && this.o0 != null && !overScroller.isFinished() && overScroller.getCurrY() != overScroller.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            overScroller.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        hra hraVar = this.a;
        Trace.beginSection(jpf.g("ReactScrollView.onScrollChanged"));
        try {
            super.onScrollChanged(i, i2, i3, i4);
            this.f = true;
            if (hraVar.a(i, i2)) {
                if (this.d0) {
                    updateClippingRect(null);
                }
                float f = hraVar.c;
                float f2 = hraVar.d;
                CopyOnWriteArrayList<WeakReference<d.i>> copyOnWriteArrayList = d.a;
                d.m(this, getScrollX(), getScrollY());
                d.c(this, g.d, f, f2);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.d0) {
            updateClippingRect(null);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        coc cocVar;
        if (this.e0) {
            qeb qebVar = this.v0;
            qeb.a.getClass();
            if (qeb.a.a(qebVar)) {
                wmg wmgVar = this.c;
                wmgVar.a(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 && this.a0) {
                    d.l(this);
                    float f = wmgVar.b;
                    float f2 = wmgVar.c;
                    d.c(this, g.c, f, f2);
                    web.s(this, motionEvent);
                    this.a0 = false;
                    h(Math.round(f), Math.round(f2));
                }
                if (actionMasked == 0 && (cocVar = this.c0) != null) {
                    removeCallbacks(cocVar);
                    this.c0 = null;
                    getFlingAnimator().cancel();
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            Rect rect = new Rect();
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        d.l(this);
        if (i()) {
            this.q0 = -1;
            this.r0 = -1;
        } else {
            this.q0 = i;
            this.r0 = i2;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        v71.j(this, Integer.valueOf(i));
    }

    public void setBorderRadius(float f) {
        v71.m(this, zi1.values()[0], Float.isNaN(f) ? null : new ou8(nn2.C(f), pu8.a));
    }

    public void setBorderStyle(String str) {
        cj1 cj1VarA;
        if (str == null) {
            cj1VarA = null;
        } else {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(str);
        }
        v71.n(this, cj1VarA);
    }

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.p0;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.p0 = readableMap;
            if (readableMap != null) {
                scrollTo((int) nn2.G((float) (readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d)), (int) nn2.G((float) (readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d)));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDecelerationRate(float f) {
        getReactScrollViewScrollState().f = f;
        OverScroller overScroller = this.b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.i0 = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.h0) {
            this.h0 = i;
            this.g0 = new ColorDrawable(this.h0);
        }
    }

    public void setFadingEdgeLengthEnd(int i) {
        this.A0 = i;
        invalidate();
    }

    public void setFadingEdgeLengthStart(int i) {
        this.z0 = i;
        invalidate();
    }

    @Override // com.facebook.react.views.scroll.d.b
    public void setLastScrollDispatchTime(long j) {
        this.w0 = j;
    }

    public void setMaintainVisibleContentPosition(a.C0141a c0141a) {
        a aVar;
        if (c0141a != null && this.y0 == null) {
            a aVar2 = new a(this, false);
            this.y0 = aVar2;
            aVar2.c();
        } else if (c0141a == null && (aVar = this.y0) != null) {
            aVar.d();
            this.y0 = null;
        }
        a aVar3 = this.y0;
        if (aVar3 != null) {
            aVar3.c = c0141a;
        }
    }

    public void setOverflow(String str) {
        fxa fxaVar = fxa.d;
        if (str == null) {
            this.W = fxaVar;
        } else {
            fxa.a.getClass();
            fxa fxaVarA = fxa.a.a(str);
            if (fxaVarA != null) {
                fxaVar = fxaVarA;
            }
            this.W = fxaVar;
        }
        invalidate();
    }

    @Override // defpackage.hnc
    public final void setOverflowInset(int i, int i2, int i3, int i4) {
        this.e.set(i, i2, i3, i4);
    }

    public void setPagingEnabled(boolean z) {
        this.b0 = z;
    }

    public void setPointerEvents(qeb qebVar) {
        this.v0 = qebVar;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.V == null) {
            this.V = new Rect();
        }
        this.d0 = z;
        updateClippingRect(null);
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i) {
        int childCount = getChildCount();
        hh1.m(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setTranslationY(i);
            }
            setPadding(0, 0, 0, i);
        }
        getReactScrollViewScrollState().b = i;
        d.e(this);
        setRemoveClippedSubviews(this.d0);
    }

    public void setScrollEnabled(boolean z) {
        this.e0 = z;
    }

    public void setScrollEventThrottle(int i) {
        this.x0 = i;
    }

    public void setScrollPerfTag(String str) {
    }

    public void setSendMomentumEvents(boolean z) {
        this.f0 = z;
    }

    public void setSnapInterval(int i) {
        this.j0 = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.k0 = list;
    }

    public void setSnapToAlignment(int i) {
        this.n0 = i;
    }

    public void setSnapToEnd(boolean z) {
        this.m0 = z;
    }

    public void setSnapToStart(boolean z) {
        this.l0 = z;
    }

    public void setStateWrapper(vse vseVar) {
        this.s0 = vseVar;
    }

    @Override // defpackage.wjc
    public final void updateClippingRect(Set<Integer> set) {
        if (this.d0) {
            Trace.beginSection(jpf.g("ReactScrollView.updateClippingRect"));
            try {
                hh1.n(this.V);
                xjc.a(this, this.V);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof wjc) {
                    ((wjc) contentView).updateClippingRect(set);
                }
            } finally {
                Trace.endSection();
            }
        }
    }
}
