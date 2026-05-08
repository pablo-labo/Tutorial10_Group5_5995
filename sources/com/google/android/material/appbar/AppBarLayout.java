package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.indeed.android.jobsearch.R;
import defpackage.be0;
import defpackage.bfa;
import defpackage.epg;
import defpackage.ff9;
import defpackage.ie7;
import defpackage.jkf;
import defpackage.ka2;
import defpackage.l5;
import defpackage.lac;
import defpackage.lrg;
import defpackage.nsg;
import defpackage.pnb;
import defpackage.prg;
import defpackage.rzg;
import defpackage.sg6;
import defpackage.si0;
import defpackage.t6;
import defpackage.wg6;
import defpackage.ze9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public rzg V;
    public boolean W;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public int c;
    public boolean c0;
    public int d;
    public int d0;
    public boolean e;
    public WeakReference<View> e0;
    public int f;
    public ValueAnimator f0;
    public final ArrayList g0;
    public int[] h0;
    public Drawable i0;

    public static abstract class a {
    }

    public static class b extends a {
        public final Rect a = new Rect();
        public final Rect b = new Rect();
    }

    public static class c extends LinearLayout.LayoutParams {
        public int a;
        public b b;
        public Interpolator c;

        public c() {
            super(-1, -2);
            this.a = 1;
        }
    }

    public interface d {
        void a();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.g0 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = jkf.d(context3, attributeSet, nsg.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = jkf.d(context2, attributeSet, lac.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(0);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            setBackground(drawable);
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                ze9 ze9Var = new ze9();
                ze9Var.k(ColorStateList.valueOf(colorDrawable.getColor()));
                ze9Var.i(context2);
                setBackground(ze9Var);
            }
            if (typedArrayD2.hasValue(4)) {
                c(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                nsg.a(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayD2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
            }
            if (typedArrayD2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
            }
            this.c0 = typedArrayD2.getBoolean(5, false);
            this.d0 = typedArrayD2.getResourceId(6, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(7));
            typedArrayD2.recycle();
            epg.d.m(this, new si0(this));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.b);
        cVar.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(boolean z) {
        if (this.W || this.b0 == z) {
            return false;
        }
        this.b0 = z;
        refreshDrawableState();
        if (this.c0 && (getBackground() instanceof ze9)) {
            ze9 ze9Var = (ze9) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.f0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f0.setInterpolator(be0.a);
            this.f0.addUpdateListener(new com.google.android.material.appbar.a(this, ze9Var));
            this.f0.start();
        }
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.i0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.i0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i;
        if (this.e0 == null && (i = this.d0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.d0);
            }
            if (viewFindViewById != null) {
                this.e0 = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.e0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L60
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L5a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L36
            java.util.WeakHashMap<android.view.View, prg> r4 = defpackage.epg.a
            int r4 = r3.getMinimumHeight()
        L34:
            int r4 = r4 + r7
            goto L45
        L36:
            r4 = r6 & 2
            if (r4 == 0) goto L43
            java.util.WeakHashMap<android.view.View, prg> r4 = defpackage.epg.a
            int r4 = r3.getMinimumHeight()
            int r4 = r5 - r4
            goto L34
        L43:
            int r4 = r7 + r5
        L45:
            if (r0 != 0) goto L58
            java.util.WeakHashMap<android.view.View, prg> r6 = defpackage.epg.a
            boolean r3 = r3.getFitsSystemWindows()
            if (r3 == 0) goto L58
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L58:
            int r2 = r2 + r4
            goto L5d
        L5a:
            if (r2 <= 0) goto L5d
            goto L60
        L5d:
            int r0 = r0 + (-1)
            goto Le
        L60:
            int r0 = java.lang.Math.max(r1, r2)
            r9.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
            int i3 = cVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.d0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.i0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        rzg rzgVar = this.V;
        if (rzgVar != null) {
            return rzgVar.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = cVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
            if (i2 == 0) {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                if (childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
            }
            minimumHeight = topInset;
            if ((i3 & 2) != 0) {
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka2.G(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.h0 == null) {
            this.h0 = new int[4];
        }
        int[] iArr = this.h0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.a0;
        iArr[0] = z ? R.attr.state_liftable : -2130969747;
        iArr[1] = (z && this.b0) ? R.attr.state_lifted : -2130969748;
        iArr[2] = z ? R.attr.state_collapsible : -2130969745;
        iArr[3] = (z && this.b0) ? R.attr.state_collapsed : -2130969744;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.e0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.i0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.W) {
            return;
        }
        if (!this.c0) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((c) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.a0 != z2) {
            this.a0 = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = ie7.i(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ka2.E(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        c(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.c0 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.d0 = i;
        WeakReference<View> weakReference = this.e0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.W = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            l5.q("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.i0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.i0 = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.i0.setState(getDrawableState());
                }
                Drawable drawable3 = this.i0;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.i0.setVisible(getVisibility() == 0, false);
                this.i0.setCallback(this);
            }
            if (this.i0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(pnb.A(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        nsg.a(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.i0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i0;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends sg6<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public SavedState m;
        public WeakReference<View> n;

        public BaseBehavior() {
        }

        public static View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof bfa) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void G(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L5c
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r0 = (com.google.android.material.appbar.AppBarLayout.c) r0
                int r0 = r0.a
                r1 = r0 & 1
                if (r1 == 0) goto L5c
                java.util.WeakHashMap<android.view.View, prg> r1 = defpackage.epg.a
                int r1 = r4.getMinimumHeight()
                r3 = 1
                if (r9 <= 0) goto L4a
                r9 = r0 & 12
                if (r9 == 0) goto L4a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5c
                goto L5d
            L4a:
                r9 = r0 & 2
                if (r9 == 0) goto L5c
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5c
                goto L5d
            L5c:
                r3 = r2
            L5d:
                boolean r8 = r7.c0
                if (r8 == 0) goto L69
                android.view.View r8 = C(r6)
                boolean r3 = r7.e(r8)
            L69:
                boolean r8 = r7.d(r3)
                if (r10 != 0) goto La8
                if (r8 == 0) goto La7
                m54<android.view.View> r8 = r6.b
                jfe<T, java.util.ArrayList<T>> r8 = r8.b
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r6 = r6.d
                r6.clear()
                if (r8 == 0) goto L85
                r6.addAll(r8)
            L85:
                int r8 = r6.size()
            L89:
                if (r2 >= r8) goto La7
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r9.a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.f
                if (r6 == 0) goto La7
                goto La8
            La4:
                int r2 = r2 + 1
                goto L89
            La7:
                return
            La8:
                r7.jumpDrawablesToCurrentState()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(t() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iT = t();
            ValueAnimator valueAnimator = this.l;
            if (iT == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(be0.e);
                this.l.addUpdateListener(new com.google.android.material.appbar.b(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iT, i);
            this.l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void D(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.t()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r8 = r2.z(r3, r4, r5, r6, r7)
                r9 = 1
                r13[r9] = r8
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r8 = r4.c0
                if (r8 == 0) goto L37
                boolean r8 = r4.e(r11)
                r4.d(r8)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final void E(CoordinatorLayout coordinatorLayout, T t) {
            int iT = t();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i2 = -iT;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i3 = cVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        minimumHeight += t.getPaddingTop() + t.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap<View, prg> weakHashMap = epg.a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap<View, prg> weakHashMap2 = epg.a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iT < minimumHeight2) {
                            i4 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iT < (minimumHeight + i4) / 2) {
                        i4 = minimumHeight;
                    }
                    B(coordinatorLayout, t, ie7.i(i4, -t.getTotalScrollRange(), 0));
                }
            }
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t) {
            t6.a aVar = t6.a.k;
            epg.l(coordinatorLayout, aVar.a());
            epg.h(coordinatorLayout, 0);
            t6.a aVar2 = t6.a.l;
            epg.l(coordinatorLayout, aVar2.a());
            epg.h(coordinatorLayout, 0);
            View viewC = C(coordinatorLayout);
            if (viewC == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) viewC.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (t() != (-t.getTotalScrollRange()) && viewC.canScrollVertically(1)) {
                epg.m(coordinatorLayout, aVar, new com.google.android.material.appbar.d(t, false));
            }
            if (t() != 0) {
                if (!viewC.canScrollVertically(-1)) {
                    epg.m(coordinatorLayout, aVar2, new com.google.android.material.appbar.d(t, true));
                    return;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    epg.m(coordinatorLayout, aVar2, new com.google.android.material.appbar.c(this, coordinatorLayout, t, viewC, i));
                }
            }
        }

        @Override // defpackage.krg, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            B(coordinatorLayout, appBarLayout, i2);
                        } else {
                            A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            B(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.c) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else {
                View childAt = appBarLayout.getChildAt(savedState.d);
                int i3 = -childAt.getBottom();
                if (this.m.f) {
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.m.e) + i3;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f = 0;
            this.m = null;
            int i4 = ie7.i(s(), -appBarLayout.getTotalScrollRange(), 0);
            lrg lrgVar = this.a;
            if (lrgVar == null) {
                this.b = i4;
            } else if (lrgVar.d != i4) {
                lrgVar.d = i4;
                lrgVar.a();
            }
            G(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.a = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                appBarLayout.postInvalidateOnAnimation();
            }
            F(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.z(coordinatorLayout2, appBarLayout, t() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0) {
                baseBehavior.F(coordinatorLayout2, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.m = (SavedState) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.c = (-s()) >= appBarLayout.getTotalScrollRange();
                    savedState.d = i;
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    savedState.f = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.c0 || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.c0) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.n = new WeakReference<>(view2);
        }

        @Override // defpackage.krg
        public final int t() {
            return s() + this.j;
        }

        @Override // defpackage.sg6
        public final boolean v(View view) {
            WeakReference<View> weakReference = this.n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // defpackage.sg6
        public final int w(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // defpackage.sg6
        public final int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // defpackage.sg6
        public final void y(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            E(coordinatorLayout, appBarLayout);
            if (appBarLayout.c0) {
                appBarLayout.d(appBarLayout.e(C(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
        @Override // defpackage.sg6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                Method dump skipped, instruction units count: 399
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public boolean c;
            public int d;
            public float e;
            public boolean f;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readByte() != 0;
                this.d = parcel.readInt();
                this.e = parcel.readFloat();
                this.f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.d);
                parcel.writeFloat(this.e);
                parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
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
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class ScrollingViewBehavior extends wg6 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.C);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).j + this.e;
                if (this.f == 0) {
                    i = 0;
                } else {
                    float fW = w(view2);
                    int i2 = this.f;
                    i = ie7.i((int) (fW * i2), 0, i2);
                }
                int i3 = bottom - i;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                view.offsetTopAndBottom(i3);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.c0) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                epg.l(coordinatorLayout, t6.a.k.a());
                epg.h(coordinatorLayout, 0);
                epg.l(coordinatorLayout, t6.a.l.a());
                epg.h(coordinatorLayout, 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayListD = coordinatorLayout.d(view);
            int size = arrayListD.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListD.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.c(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.wg6
        public final AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.wg6
        public final float w(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
                int iT = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).t() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iT > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iT / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.wg6
        public final int x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior() {
        }
    }
}
