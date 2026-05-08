package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import defpackage.epg;
import defpackage.mrg;
import defpackage.prg;
import defpackage.r6;
import defpackage.t6;
import defpackage.w20;
import defpackage.y5;
import defpackage.z0b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] A0 = {R.attr.layout_gravity};
    public static final b B0 = new b();
    public Drawable V;
    public final float W;
    public final ArrayList<e> a;
    public final float a0;
    public final e b;
    public int b0;
    public final Rect c;
    public boolean c0;
    public Parcelable d;
    public boolean d0;
    public final Scroller e;
    public int e0;
    public int f;
    public boolean f0;
    public boolean g0;
    public final int h0;
    public int i0;
    public final int j0;
    public float k0;
    public float l0;
    public float m0;
    public int n0;
    public VelocityTracker o0;
    public final int p0;
    public final EdgeEffect q0;
    public final EdgeEffect r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public ArrayList v0;
    public i w0;
    public ArrayList x0;
    public final c y0;
    public int z0;

    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.a - eVar2.a;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager.this.setScrollState(0);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {
        public int a;
        public float b;
    }

    public static class f extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;

        public f() {
            super(-1, -1);
        }
    }

    public class g extends y5 {
        @Override // defpackage.y5
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(false);
            accessibilityEvent.getEventType();
        }

        @Override // defpackage.y5
        public final void d(t6 t6Var, View view) {
            this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
            t6Var.n(ViewPager.class.getName());
            t6Var.w(false);
        }

        @Override // defpackage.y5
        public final boolean g(View view, int i, Bundle bundle) {
            return super.g(view, i, bundle);
        }
    }

    public interface h {
        void a(ViewPager viewPager);
    }

    public interface i {
        void a(float f, int i);

        void b(int i);
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList<>();
        this.b = new e();
        this.c = new Rect();
        this.W = -3.4028235E38f;
        this.a0 = Float.MAX_VALUE;
        this.e0 = 1;
        this.n0 = -1;
        this.s0 = true;
        this.y0 = new c();
        this.z0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.e = new Scroller(context2, B0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.j0 = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.q0 = new EdgeEffect(context2);
        this.r0 = new EdgeEffect(context2);
        this.p0 = (int) (2.0f * f2);
        this.h0 = (int) (f2 * 16.0f);
        epg.o(this, new g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        epg.d.m(this, new mrg(this));
    }

    public static boolean b(int i2, int i3, int i4, View view, boolean z) {
        int i5;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i6 = i3 + scrollX;
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && b(i2, i6 - childAt.getLeft(), i5 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z || !view.canScrollHorizontally(-i2)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
        }
    }

    public final boolean a(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        boolean zRequestFocus = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.c;
            if (i2 == 17) {
                int i3 = d(rect, viewFindNextFocus).left;
                int i4 = d(rect, viewFindFocus).left;
                if (viewFindFocus == null || i3 < i4) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            } else if (i2 == 66) {
                int i5 = d(rect, viewFindNextFocus).left;
                int i6 = d(rect, viewFindFocus).left;
                if (viewFindFocus == null || i5 > i6) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
        } else if (i2 != 17) {
        }
        if (zRequestFocus) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zRequestFocus;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4).getVisibility() == 0) {
                    e();
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                e();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new f();
        }
        f fVar = (f) layoutParams;
        boolean z = fVar.a | (view.getClass().getAnnotation(d.class) != null);
        fVar.a = z;
        if (!this.c0) {
            super.addView(view, i2, layoutParams);
        } else if (z) {
            r6.g("Cannot add pager decor view during layout");
        } else {
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public final void c(boolean z) {
        int i2 = 0;
        boolean z2 = this.z0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.e;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        h(currX);
                    }
                }
            }
        }
        while (true) {
            ArrayList<e> arrayList = this.a;
            if (i2 >= arrayList.size()) {
                break;
            }
            arrayList.get(i2).getClass();
            i2++;
        }
        if (z2) {
            c cVar = this.y0;
            if (!z) {
                cVar.run();
            } else {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                postOnAnimation(cVar);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.e;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            c(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!h(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        postInvalidateOnAnimation();
    }

    public final Rect d(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L56
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L3c
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L45
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L3c
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.a(r4)
            goto L52
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L3c
            boolean r5 = r5.a(r1)
            goto L52
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L3e
        L3c:
            r5 = r2
            goto L52
        L3e:
            r6 = 66
            boolean r5 = r5.a(r6)
            goto L52
        L45:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4c
            goto L3c
        L4c:
            r6 = 17
            boolean r5 = r5.a(r6)
        L52:
            if (r5 == 0) goto L55
            goto L56
        L55:
            return r2
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                e();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.r0;
        EdgeEffect edgeEffect2 = this.q0;
        boolean zDraw = false;
        if (overScrollMode != 0) {
            edgeEffect2.finish();
            edgeEffect.finish();
        } else {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.W * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.a0 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.V;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        ArrayList<e> arrayList = this.a;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw null;
    }

    public final e f() {
        int i2 = 0;
        while (true) {
            ArrayList<e> arrayList = this.a;
            if (i2 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i2);
            if (eVar.a == 0) {
                return eVar;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.u0
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            androidx.viewpager.widget.ViewPager$i r14 = r11.w0
            if (r14 == 0) goto L73
            r14.a(r13, r12)
        L73:
            java.util.ArrayList r14 = r11.v0
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.v0
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$i r2 = (androidx.viewpager.widget.ViewPager.i) r2
            if (r2 == 0) goto L8a
            r2.a(r13, r12)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.t0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0);
        fVar.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }

    public z0b getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.e0;
    }

    public int getPageMargin() {
        return this.f;
    }

    public final boolean h(int i2) {
        int i3;
        ArrayList<e> arrayList = this.a;
        if (arrayList.size() == 0) {
            if (!this.s0) {
                this.t0 = false;
                g(0, 0.0f, 0);
                if (!this.t0) {
                    r6.g("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f / clientWidth : 0.0f;
        int i4 = -1;
        boolean z = true;
        float f3 = 0.0f;
        int i5 = 0;
        e eVar = null;
        while (i5 < arrayList.size()) {
            e eVar2 = arrayList.get(i5);
            if (!z && eVar2.a != (i3 = i4 + 1)) {
                e eVar3 = this.b;
                eVar3.b = f3 + 0.0f + f2;
                eVar3.a = i3;
                throw null;
            }
            f3 = eVar2.b;
            float f4 = f3 + 0.0f + f2;
            if (!z && scrollX < f3) {
                break;
            }
            if (scrollX < f4 || i5 == arrayList.size() - 1) {
                eVar = eVar2;
                break;
            }
            i4 = eVar2.a;
            i5++;
            z = false;
            eVar = eVar2;
        }
        int clientWidth2 = getClientWidth();
        int i6 = this.f;
        int i7 = clientWidth2 + i6;
        float f5 = clientWidth2;
        int i8 = eVar.a;
        float f6 = ((i2 / f5) - eVar.b) / (0.0f + (i6 / f5));
        this.t0 = false;
        g(i8, f6, (int) (i7 * f6));
        if (this.t0) {
            return true;
        }
        r6.g("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final void i(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.a.isEmpty()) {
            e eVarF = f();
            int iMin = (int) ((eVarF != null ? Math.min(eVarF.b, this.a0) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                c(false);
                scrollTo(iMin, getScrollY());
                return;
            }
            return;
        }
        Scroller scroller = this.e;
        if (!scroller.isFinished()) {
            scroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.y0);
        Scroller scroller = this.e;
        if (scroller != null && !scroller.isFinished()) {
            scroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f <= 0 || this.V == null) {
            return;
        }
        this.a.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r13.g0 != false) goto L84;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        f fVar;
        f fVar2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.i0 = Math.min(measuredWidth / 10, this.h0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.a) {
                int i7 = fVar2.b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z = true;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.b0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.c0 = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.a)) {
                fVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.b0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = 1;
            i5 = childCount;
            i3 = 0;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i5) {
            if (getChildAt(i3).getVisibility() == 0) {
                e();
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        this.d = savedState.d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = 0;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f;
            i(i2, i4, i6, i6);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.c0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(z0b z0bVar) {
        ArrayList arrayList = this.x0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.x0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((h) this.x0.get(i2)).a(this);
        }
    }

    public void setCurrentItem(int i2) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.e0) {
            this.e0 = i2;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.w0 = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f;
        this.f = i2;
        int width = getWidth();
        i(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.V = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.z0 == i2) {
            return;
        }
        this.z0 = i2;
        i iVar = this.w0;
        if (iVar != null) {
            iVar.b(i2);
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.v0.get(i3);
                if (iVar2 != null) {
                    iVar2.b(i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.V;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public final Parcelable d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return w20.k(sb, this.c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
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
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getDrawable(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f();
    }
}
