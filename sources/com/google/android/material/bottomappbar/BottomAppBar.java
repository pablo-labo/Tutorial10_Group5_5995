package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.fj1;
import defpackage.gj1;
import defpackage.gsg;
import defpackage.hj1;
import defpackage.ij1;
import defpackage.jj1;
import defpackage.ka2;
import defpackage.kj1;
import defpackage.l5;
import defpackage.prg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int T0 = 0;
    public Integer M0;
    public AnimatorSet N0;
    public AnimatorSet O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public boolean S0;

    public class a implements Runnable {
        public final /* synthetic */ ActionMenuView a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        public a(ActionMenuView actionMenuView, int i, boolean z) {
            this.a = actionMenuView;
            this.b = i;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.b;
            boolean z = this.c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.a.setTranslationX(bottomAppBar.z(r3, i, z));
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return A(this.P0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().c;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private kj1 getTopEdgeTreatment() {
        throw null;
    }

    public final float A(int i) {
        boolean zC = gsg.c(this);
        if (i == 1) {
            return (getMeasuredWidth() / 2) * (zC ? -1 : 1);
        }
        return 0.0f;
    }

    public final void B() {
        kj1 topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        y();
        if (!this.S0) {
            throw null;
        }
        View viewY = y();
        FloatingActionButton floatingActionButton = viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null;
        if (floatingActionButton == null) {
            throw null;
        }
        floatingActionButton.h();
        throw null;
    }

    public final void C(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        a aVar = new a(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c;
    }

    public int getFabAlignmentMode() {
        return this.P0;
    }

    public int getFabAnimationMode() {
        return this.Q0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().a;
    }

    public boolean getHideOnScroll() {
        return this.R0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka2.F(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.O0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.N0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            B();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.O0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        View viewY = y();
        FloatingActionButton floatingActionButton = viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null;
        if (floatingActionButton == null || !floatingActionButton.h()) {
            C(actionMenuView, 0, false, false);
        } else {
            C(actionMenuView, this.P0, this.S0, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        this.P0 = savedState.c;
        this.S0 = savedState.d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.P0;
        savedState.d = this.S0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            kj1 topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.c = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            l5.q("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        boolean z = this.S0;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.O0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            View viewY = y();
            FloatingActionButton floatingActionButton = viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null;
            if (floatingActionButton == null || !floatingActionButton.h()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - z(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.addListener(new ij1(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.O0 = animatorSet3;
            animatorSet3.addListener(new hj1(this));
            this.O0.start();
        }
        if (this.P0 != i && isLaidOut()) {
            AnimatorSet animatorSet4 = this.N0;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.Q0 == 1) {
                View viewY2 = y();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewY2 instanceof FloatingActionButton ? (FloatingActionButton) viewY2 : null, "translationX", A(i));
                objectAnimatorOfFloat3.setDuration(300L);
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewY3 = y();
                FloatingActionButton floatingActionButton2 = viewY3 instanceof FloatingActionButton ? (FloatingActionButton) viewY3 : null;
                if (floatingActionButton2 != null && !floatingActionButton2.g()) {
                    floatingActionButton2.f(new gj1(this, i), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            this.N0 = animatorSet5;
            animatorSet5.addListener(new fj1(this));
            this.N0.start();
        }
        this.P0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.Q0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().d) {
            return;
        }
        getTopEdgeTreatment().d = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().b = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().a = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.R0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.M0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.M0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final View y() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        ArrayList<View> arrayList = coordinatorLayout.b.b.get(this);
        ArrayList<View> arrayList2 = coordinatorLayout.d;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        for (View view : arrayList2) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int z(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean zC = gsg.c(this);
        int measuredWidth = zC ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = zC ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - (zC ? actionMenuView.getRight() : actionMenuView.getLeft());
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        return null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect d;
        public WeakReference<BottomAppBar> e;
        public final a f;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                if (behavior.e.get() == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                } else {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.d.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
            }
        }

        public Behavior() {
            this.f = new a();
            this.d = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.e = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.T0;
            View viewY = bottomAppBar.y();
            if (viewY != null) {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                if (!viewY.isLaidOut()) {
                    ((CoordinatorLayout.f) viewY.getLayoutParams()).d = 49;
                    if (viewY instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewY;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f);
                        floatingActionButton.b();
                        floatingActionButton.c(new jj1());
                        floatingActionButton.d();
                    }
                    bottomAppBar.B();
                    throw null;
                }
            }
            coordinatorLayout.q(bottomAppBar, i);
            super.h(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = new a();
            this.d = new Rect();
        }
    }
}
