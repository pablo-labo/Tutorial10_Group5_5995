package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.stateful.ExtendableSavedState;
import com.indeed.android.jobsearch.R;
import defpackage.cde;
import defpackage.ctg;
import defpackage.dz3;
import defpackage.ece;
import defpackage.epg;
import defpackage.gj1;
import defpackage.jj1;
import defpackage.l5;
import defpackage.lac;
import defpackage.li5;
import defpackage.pj0;
import defpackage.prg;
import defpackage.s35;
import defpackage.wz9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class FloatingActionButton extends ctg implements s35, cde, CoordinatorLayout.b {
    public int V;
    public int W;
    public boolean a0;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class b<T extends FloatingActionButton> implements d.a {
        @Override // com.google.android.material.floatingactionbutton.d.a
        public final void a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        return null;
    }

    @Override // defpackage.s35
    public final boolean a() {
        throw null;
    }

    public final void b() {
        d impl = getImpl();
        if (impl.m == null) {
            impl.m = new ArrayList<>();
        }
        impl.m.add(null);
    }

    public final void c(jj1 jj1Var) {
        d impl = getImpl();
        if (impl.l == null) {
            impl.l = new ArrayList<>();
        }
        impl.l.add(jj1Var);
    }

    public final void d() {
        d impl = getImpl();
        b bVar = new b();
        if (impl.n == null) {
            impl.n = new ArrayList<>();
        }
        impl.n.add(bVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d impl = getImpl();
        getDrawableState();
        impl.getClass();
    }

    public final int e(int i) {
        int i2 = this.W;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? e(1) : e(0);
    }

    public final void f(gj1 gj1Var, boolean z) {
        d impl = getImpl();
        if (gj1Var != null) {
            new com.google.android.material.floatingactionbutton.a(this, gj1Var);
        }
        impl.getClass();
        throw null;
    }

    public final boolean g() {
        getImpl().getClass();
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        ((li5) getImpl()).getClass();
        throw null;
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().d;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().e;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.W;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public wz9 getHideMotionSpec() {
        return getImpl().h;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public ece getShapeAppearanceModel() {
        ece eceVar = getImpl().a;
        eceVar.getClass();
        return eceVar;
    }

    public wz9 getShowMotionSpec() {
        return getImpl().g;
    }

    public int getSize() {
        return this.V;
    }

    public int getSizeDimension() {
        return e(this.V);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.a0;
    }

    public final boolean h() {
        getImpl().getClass();
        throw null;
    }

    public final void i() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(pj0.c(colorForState, mode));
    }

    public final void j(gj1.a aVar, boolean z) {
        d impl = getImpl();
        if (aVar != null) {
            new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        impl.getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        getSizeDimension();
        getImpl().f();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a);
        extendableSavedState.c.get("expandableWidgetHelper").getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(parcelableOnSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (isLaidOut()) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        d impl = getImpl();
        if (impl.c != f) {
            impl.c = f;
            impl.d(f, impl.d, impl.e);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.d != f) {
            impl.d = f;
            impl.d(impl.c, f, impl.e);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.e != f) {
            impl.e = f;
            impl.d(impl.c, impl.d, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            l5.q("Custom size must be non-negative");
        } else if (i != this.W) {
            this.W = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().b) {
            getImpl().b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(wz9 wz9Var) {
        getImpl().h = wz9Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(wz9.a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() == drawable) {
            return;
        }
        super.setImageDrawable(drawable);
        d impl = getImpl();
        float f = impl.i;
        impl.i = f;
        impl.a(f, null);
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setMaxImageSize(int i) {
        d impl = getImpl();
        if (impl.j == i) {
            return;
        }
        impl.j = i;
        float f = impl.i;
        impl.i = f;
        impl.a(f, null);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<d.a> arrayList = getImpl().n;
        if (arrayList != null) {
            Iterator<d.a> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<d.a> arrayList = getImpl().n;
        if (arrayList != null) {
            Iterator<d.a> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        d impl = getImpl();
        impl.getClass();
        impl.f();
        throw null;
    }

    @Override // defpackage.cde
    public void setShapeAppearanceModel(ece eceVar) {
        getImpl().a = eceVar;
    }

    public void setShowMotionSpec(wz9 wz9Var) {
        getImpl().g = wz9Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(wz9.a(getContext(), i));
    }

    public void setSize(int i) {
        this.W = 0;
        if (i != this.V) {
            this.V = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            i();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            i();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().e();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().e();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().e();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a0 == z) {
            return;
        }
        this.a0 = z;
        ((li5) getImpl()).f();
        throw null;
    }

    @Override // defpackage.ctg, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.k);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListD = coordinatorLayout.d(floatingActionButton);
            int size = arrayListD.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListD.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.b || fVar.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            dz3.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.f(null, false);
                return true;
            }
            floatingActionButton.j(null, false);
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.b || fVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.f(null, false);
                return true;
            }
            floatingActionButton.j(null, false);
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }
}
