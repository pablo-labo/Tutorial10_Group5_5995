package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Trace;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.d;
import com.indeed.android.jobsearch.R;
import defpackage.cj1;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends HorizontalScrollView implements wjc, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, kjc, hnc, d.c, d.e, d.a, d.b, d.InterfaceC0142d {
    public static Field C0 = null;
    public static boolean D0 = false;
    public int A0;
    public final Rect B0;
    public Rect V;
    public fxa W;
    public int a;
    public boolean a0;
    public final hra b;
    public boolean b0;
    public final OverScroller c;
    public a c0;
    public final wmg d;
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
    public boolean o0;
    public int p0;
    public int q0;
    public vse r0;
    public final d.h s0;
    public final ObjectAnimator t0;
    public qeb u0;
    public long v0;
    public int w0;
    public View x0;
    public com.facebook.react.views.scroll.a y0;
    public int z0;

    public class a implements Runnable {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NativeAnimatedModule nativeAnimatedModule;
            b bVar = b.this;
            if (bVar.f) {
                bVar.f = false;
                this.b = 0;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                bVar.postOnAnimationDelayed(this, 20L);
                return;
            }
            d.l(bVar);
            int i = this.b + 1;
            this.b = i;
            if (i < 3) {
                if (bVar.b0 && !this.a) {
                    this.a = true;
                    bVar.g(0);
                }
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                bVar.postOnAnimationDelayed(this, 20L);
                return;
            }
            bVar.c0 = null;
            if (bVar.f0) {
                d.c(bVar, g.f, 0.0f, 0.0f);
            }
            ReactContext reactContext = (ReactContext) bVar.getContext();
            if (reactContext == null || (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) == null) {
                return;
            }
            nativeAnimatedModule.userDrivenScrollEnded(bVar.getId());
        }
    }

    public b(mkf mkfVar) {
        super(mkfVar);
        this.a = Integer.MIN_VALUE;
        this.b = new hra();
        this.d = new wmg();
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
        this.o0 = false;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = null;
        this.t0 = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.u0 = qeb.e;
        this.v0 = 0L;
        this.w0 = 0;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new Rect();
        epg.o(this, new doc());
        this.c = getOverScrollerFromParent();
        this.s0 = new d.h();
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
    }

    public static HorizontalScrollView e(View view, MotionEvent motionEvent, boolean z) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z && (view instanceof HorizontalScrollView)) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (epg.d.h(view) && (view instanceof b) && ((b) view).e0) {
                return (HorizontalScrollView) view;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            HorizontalScrollView horizontalScrollViewE = e(viewGroup.getChildAt(i), motionEvent, false);
            if (horizontalScrollViewE != null) {
                return horizontalScrollViewE;
            }
            i++;
        }
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!D0) {
            D0 = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                C0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                s55.n("b", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = C0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    s55.n("b", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e) {
                l6.p("Failed to get mScroller from HorizontalScrollView!", e);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.j0;
        return i != 0 ? i : getWidth();
    }

    @Override // com.facebook.react.views.scroll.d.InterfaceC0142d
    public final void a(int i, int i2) {
        scrollTo(i, i2);
        l(i, Integer.MAX_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (!this.b0 || this.o0) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i, i2);
        for (View view : arrayList2) {
            if (i(view) == 0 || c(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean arrowScroll(int i) {
        if (!this.b0) {
            return super.arrowScroll(i);
        }
        boolean z = true;
        this.o0 = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                m(i);
            } else {
                if (i(viewFindNextFocus) != 0) {
                    int i2 = i(viewFindNextFocus);
                    Rect rect = this.B0;
                    viewFindNextFocus.getDrawingRect(rect);
                    if (i2 == 0 || Math.abs(i2) >= rect.width() / 2) {
                        m(i);
                    }
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z = false;
        }
        this.o0 = false;
        return z;
    }

    @Override // com.facebook.react.views.scroll.d.InterfaceC0142d
    public final void b(int i, int i2) {
        d.k(this, i, i2);
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            this.p0 = i;
            this.q0 = i2;
        } else {
            this.p0 = -1;
            this.q0 = -1;
        }
    }

    @Override // defpackage.kjc
    public final boolean c(View view) {
        int i = i(view);
        Rect rect = this.B0;
        view.getDrawingRect(rect);
        return i != 0 && Math.abs(i) < rect.width();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.e0 && super.canScrollHorizontally(i);
    }

    @Override // com.facebook.react.views.scroll.d.a
    public final void d(int i, int i2) {
        ObjectAnimator objectAnimator = this.t0;
        objectAnimator.cancel();
        int iF = d.f(getContext());
        objectAnimator.setDuration(iF).setIntValues(i, i2);
        objectAnimator.start();
        if (this.f0) {
            d.c(this, g.e, iF > 0 ? (i2 - i) / iF : 0, 0.0f);
            getFlingAnimator().addListener(new joc(this));
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        qeb qebVar = this.u0;
        qeb.a.getClass();
        if (qeb.a.b(qebVar)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.h0 != 0) {
            View contentView = getContentView();
            if (this.g0 != null && contentView != null && contentView.getRight() < getWidth()) {
                this.g0.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.g0.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.e0 || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void f() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        if (Build.VERSION.SDK_INT == 28) {
            i = (int) (Math.signum(this.b.c) * Math.abs(i));
        }
        int i2 = i;
        if (this.b0) {
            g(i2);
        } else if (this.c != null) {
            int width = getWidth();
            WeakHashMap<View, prg> weakHashMap = epg.a;
            this.c.fling(getScrollX(), getScrollY(), i2, 0, 0, Integer.MAX_VALUE, 0, 0, ((width - getPaddingStart()) - getPaddingEnd()) / 2, 0);
            postInvalidateOnAnimation();
        } else {
            super.fling(i2);
        }
        j(i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewD;
        View viewFocusSearch = super.focusSearch(view, i);
        return (!ie7.g0.enableCustomFocusSearchOnClippedElementsAndroid() || !(viewFocusSearch == null || findViewById(viewFocusSearch.getId()) == null) || (viewD = d.d(this, view, i)) == null) ? viewFocusSearch : viewD;
    }

    public final void g(int i) {
        int iMin;
        int iIntValue;
        int iMax;
        int iIntValue2;
        OverScroller overScroller;
        int scrollX = i;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.j0 == 0 && this.k0 == null && this.n0 == 0) {
            double snapInterval = getSnapInterval();
            double dG = d.g(this, getScrollX(), getReactScrollViewScrollState().a.x, scrollX);
            double dK = k(i);
            double d = dG / snapInterval;
            int iFloor = (int) Math.floor(d);
            int iCeil = (int) Math.ceil(d);
            int iRound = (int) Math.round(d);
            int iRound2 = (int) Math.round(dK / snapInterval);
            if (scrollX > 0 && iCeil == iFloor) {
                iCeil++;
            } else if (scrollX < 0 && iFloor == iCeil) {
                iFloor--;
            }
            if (scrollX > 0 && iRound < iCeil && iRound2 > iFloor) {
                iRound = iCeil;
            } else if (scrollX < 0 && iRound > iFloor && iRound2 < iCeil) {
                iRound = iFloor;
            }
            double d2 = ((double) iRound) * snapInterval;
            if (d2 != dG) {
                this.f = true;
                b((int) d2, getScrollY());
                return;
            }
            return;
        }
        boolean z = getFlingAnimator() != this.t0;
        int iMax2 = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iK = k(i);
        if (this.i0) {
            iK = getScrollX();
        }
        int width = getWidth();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int paddingStart = (width - getPaddingStart()) - getPaddingEnd();
        if (getLayoutDirection() == 1) {
            iK = iMax2 - iK;
            scrollX = -scrollX;
        }
        List<Integer> list = this.k0;
        if (list == null || list.isEmpty()) {
            int i2 = this.n0;
            if (i2 != 0) {
                int i3 = this.j0;
                if (i3 > 0) {
                    double d3 = ((double) iK) / ((double) i3);
                    double dFloor = Math.floor(d3);
                    int i4 = this.j0;
                    int iMax3 = Math.max(h(i2, (int) (dFloor * ((double) i4)), i4, paddingStart), 0);
                    int i5 = this.n0;
                    double dCeil = Math.ceil(d3);
                    int i6 = this.j0;
                    iMin = Math.min(h(i5, (int) (dCeil * ((double) i6)), i6, paddingStart), iMax2);
                    iIntValue = iMax2;
                    iMax = iMax3;
                    iIntValue2 = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax2;
                    int i7 = iMin2;
                    int i8 = 0;
                    int iMax4 = 0;
                    for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                        View childAt = viewGroup.getChildAt(i9);
                        int iH = h(this.n0, childAt.getLeft(), childAt.getWidth(), paddingStart);
                        if (iH <= iK && iK - iH < iK - i8) {
                            i8 = iH;
                        }
                        if (iH >= iK && iH - iK < i7 - iK) {
                            i7 = iH;
                        }
                        iMin2 = Math.min(iMin2, iH);
                        iMax4 = Math.max(iMax4, iH);
                    }
                    iMax = Math.max(i8, iMin2);
                    iMin = Math.min(i7, iMax4);
                    iIntValue = iMax2;
                }
            } else {
                double snapInterval2 = getSnapInterval();
                double d4 = ((double) iK) / snapInterval2;
                int iFloor2 = (int) (Math.floor(d4) * snapInterval2);
                iMin = Math.min((int) (Math.ceil(d4) * snapInterval2), iMax2);
                iIntValue = iMax2;
                iMax = iFloor2;
            }
            iIntValue2 = 0;
        } else {
            iIntValue2 = this.k0.get(0).intValue();
            List<Integer> list2 = this.k0;
            iIntValue = list2.get(list2.size() - 1).intValue();
            iMin = iMax2;
            iMax = 0;
            for (int i10 = 0; i10 < this.k0.size(); i10++) {
                int iIntValue3 = this.k0.get(i10).intValue();
                if (iIntValue3 <= iK && iK - iIntValue3 < iK - iMax) {
                    iMax = iIntValue3;
                }
                if (iIntValue3 >= iK && iIntValue3 - iK < iMin - iK) {
                    iMin = iIntValue3;
                }
            }
        }
        int i11 = iK - iMax;
        int i12 = iMin - iK;
        int i13 = Math.abs(i11) < Math.abs(i12) ? iMax : iMin;
        int scrollX2 = getScrollX();
        if (getLayoutDirection() == 1) {
            scrollX2 = iMax2 - scrollX2;
        }
        if (this.m0 || iK < iIntValue) {
            if (this.l0 || iK > iIntValue2) {
                if (scrollX > 0) {
                    if (!z) {
                        scrollX += (int) (((double) i12) * 10.0d);
                    }
                    iK = iMin;
                } else if (scrollX < 0) {
                    if (!z) {
                        scrollX -= (int) (((double) i11) * 10.0d);
                    }
                    iK = iMax;
                } else {
                    iK = i13;
                }
            } else if (scrollX2 > iIntValue2) {
                iK = iIntValue2;
            }
        } else if (scrollX2 < iIntValue) {
            iK = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iK), iMax2);
        if (getLayoutDirection() == 1) {
            iMin3 = iMax2 - iMin3;
            scrollX = -scrollX;
        }
        int i14 = iMin3;
        if (z || (overScroller = this.c) == null) {
            b(i14, getScrollY());
            return;
        }
        this.f = true;
        int scrollX3 = getScrollX();
        int scrollY = getScrollY();
        if (scrollX == 0) {
            scrollX = i14 - getScrollX();
        }
        overScroller.fling(scrollX3, scrollY, scrollX, 0, i14, i14, 0, 0, (i14 == 0 || i14 == iMax2) ? paddingStart / 2 : 0, 0);
        postInvalidateOnAnimation();
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
        return this.t0;
    }

    @Override // com.facebook.react.views.scroll.d.b
    public long getLastScrollDispatchTime() {
        return this.v0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.A0 : this.z0) / Math.max(this.z0, this.A0);
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
        return this.u0;
    }

    @Override // com.facebook.react.views.scroll.d.c
    public d.h getReactScrollViewScrollState() {
        return this.s0;
    }

    @Override // defpackage.wjc
    /* JADX INFO: renamed from: getRemoveClippedSubviews */
    public boolean get_removeClippedSubviews() {
        return this.d0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.z0 : this.A0) / Math.max(this.z0, this.A0);
    }

    @Override // defpackage.kjc
    public boolean getScrollEnabled() {
        return this.e0;
    }

    @Override // com.facebook.react.views.scroll.d.b
    public int getScrollEventThrottle() {
        return this.w0;
    }

    @Override // com.facebook.react.views.scroll.d.e
    public vse getStateWrapper() {
        return this.r0;
    }

    public final int h(int i, int i2, int i3, int i4) {
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

    public final int i(View view) {
        Rect rect = this.B0;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return computeScrollDeltaToGetChildRectOnScreen(rect);
    }

    public final void j(int i, int i2) {
        if (this.c0 != null) {
            return;
        }
        if (this.f0) {
            d.c(this, g.e, i, i2);
        }
        this.f = false;
        a aVar = new a();
        this.c0 = aVar;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        postOnAnimationDelayed(aVar, 20L);
    }

    public final int k(int i) {
        return getFlingAnimator() == this.t0 ? d.j(this, i, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x : d.g(this, getScrollX(), getReactScrollViewScrollState().a.x, i) + d.j(this, i, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    public final void l(int i, int i2) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = overScroller.getCurrX();
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        overScroller.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo((overScroller.getCurrX() - currX) + i, getScrollY());
            return;
        }
        this.c.fling(i, getScrollY(), (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalX() - overScroller.getStartX())), 0, 0, i2, 0, 0);
    }

    public final void m(int i) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i == 17 ? i2 - 1 : i2 + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        b(i3 * width, getScrollY());
        j(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d0) {
            updateClippingRect(null);
        }
        com.facebook.react.views.scroll.a aVar = this.y0;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.x0 = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.x0;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.x0 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.a aVar = this.y0;
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e0 && (motionEvent.getAction() != 0 || e(this, motionEvent, true) == null)) {
            qeb qebVar = this.u0;
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OverScroller overScroller;
        int i5 = this.a;
        if (i5 != Integer.MIN_VALUE && (overScroller = this.c) != null && i5 != overScroller.getFinalX() && !overScroller.isFinished()) {
            overScroller.startScroll(this.a, overScroller.getFinalY(), 0, 0);
            overScroller.forceFinished(true);
            this.a = Integer.MIN_VALUE;
        }
        View contentView = getContentView();
        if (contentView != null && contentView.getWidth() != 0 && contentView.getHeight() != 0) {
            int scrollX = this.p0;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.q0;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        d.b(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.x0 == null) {
            return;
        }
        if (view.getLayoutDirection() == 1) {
            if (getFlingAnimator().isRunning()) {
                getFlingAnimator().end();
            }
            int i9 = i3 - i;
            int scrollX = i9 - (i7 - getScrollX());
            scrollTo(scrollX, getScrollY());
            l(scrollX, i9 - getWidth());
        } else {
            com.facebook.react.views.scroll.a aVar = this.y0;
            if (aVar != null && msb.e(aVar.a.getId()) != 2) {
                aVar.e();
            }
        }
        d.a(this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OverScroller overScroller;
        eg9.a(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z || (overScroller = this.c) == null) {
            return;
        }
        this.a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int iMax;
        OverScroller overScroller = this.c;
        if (overScroller != null && !overScroller.isFinished() && overScroller.getCurrX() != overScroller.getFinalX() && i >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            overScroller.abortAnimation();
            i = iMax;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        hra hraVar = this.b;
        Trace.beginSection(jpf.g("ReactHorizontalScrollView.onScrollChanged"));
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

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.d0) {
            updateClippingRect(null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.e0) {
            qeb qebVar = this.u0;
            qeb.a.getClass();
            if (qeb.a.a(qebVar)) {
                wmg wmgVar = this.d;
                wmgVar.a(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1 && this.a0) {
                    d.l(this);
                    float f = wmgVar.b;
                    float f2 = wmgVar.c;
                    d.c(this, g.c, f, f2);
                    web.s(this, motionEvent);
                    this.a0 = false;
                    j(Math.round(f), Math.round(f2));
                }
                if (actionMasked == 0 && (aVar = this.c0) != null) {
                    removeCallbacks(aVar);
                    this.c0 = null;
                    getFlingAnimator().cancel();
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean pageScroll(int i) {
        boolean zPageScroll = super.pageScroll(i);
        if (this.b0 && zPageScroll) {
            j(0, 0);
        }
        return zPageScroll;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        int i;
        if (view2 != null && !this.b0 && (i = i(view2)) != 0) {
            scrollBy(i, 0);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        d.l(this);
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            this.p0 = i;
            this.q0 = i2;
        } else {
            this.p0 = -1;
            this.q0 = -1;
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

    public void setDecelerationRate(float f) {
        getReactScrollViewScrollState().f = f;
        OverScroller overScroller = this.c;
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
        this.v0 = j;
    }

    public void setMaintainVisibleContentPosition(a.C0141a c0141a) {
        com.facebook.react.views.scroll.a aVar;
        if (c0141a != null && this.y0 == null) {
            com.facebook.react.views.scroll.a aVar2 = new com.facebook.react.views.scroll.a(this, true);
            this.y0 = aVar2;
            aVar2.c();
        } else if (c0141a == null && (aVar = this.y0) != null) {
            aVar.d();
            this.y0 = null;
        }
        com.facebook.react.views.scroll.a aVar3 = this.y0;
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
        this.u0 = qebVar;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.V == null) {
            this.V = new Rect();
        }
        this.d0 = z;
        updateClippingRect(null);
    }

    public void setScrollEnabled(boolean z) {
        this.e0 = z;
    }

    public void setScrollEventThrottle(int i) {
        this.w0 = i;
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
        this.r0 = vseVar;
    }

    @Override // defpackage.wjc
    public final void updateClippingRect(Set<Integer> set) {
        if (this.d0) {
            Trace.beginSection(jpf.g("ReactHorizontalScrollView.updateClippingRect"));
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
