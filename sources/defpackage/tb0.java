package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tb0 extends ViewGroup {
    public final HashMap<pb0, pm8> a;
    public final HashMap<pm8, pb0> b;

    public tb0(Context context) {
        super(context);
        setClipChildren(false);
        this.a = new HashMap<>();
        this.b = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<pb0, pm8> getHolderToLayoutNode() {
        return this.a;
    }

    public final HashMap<pm8, pb0> getLayoutNodeToHolder() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (pb0 pb0Var : this.a.keySet()) {
            pb0Var.layout(pb0Var.getLeft(), pb0Var.getTop(), pb0Var.getRight(), pb0Var.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            ae7.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            ae7.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (pb0 pb0Var : this.a.keySet()) {
            int i4 = pb0Var.m0;
            if (i4 != Integer.MIN_VALUE && (i3 = pb0Var.n0) != Integer.MIN_VALUE) {
                pb0Var.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            pm8 pm8Var = this.a.get(childAt);
            if (childAt.isLayoutRequested() && pm8Var != null) {
                pm8.j0(pm8Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
