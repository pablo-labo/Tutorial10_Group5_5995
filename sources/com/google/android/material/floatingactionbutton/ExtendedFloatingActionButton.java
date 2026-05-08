package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.dz3;
import defpackage.epg;
import defpackage.lac;
import defpackage.prg;
import defpackage.wz9;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int k0 = 0;

    public static class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    public static class b extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    public static class c extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, prg> weakHashMap = epg.a;
            view2.setPaddingRelative(iIntValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    public static class d extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a(Float.class, "width");
        new b(Float.class, "height");
        new c(Float.class, "paddingStart");
        new d(Float.class, "paddingEnd");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public wz9 getExtendMotionSpec() {
        throw null;
    }

    public wz9 getHideMotionSpec() {
        throw null;
    }

    public wz9 getShowMotionSpec() {
        throw null;
    }

    public wz9 getShrinkMotionSpec() {
        throw null;
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(wz9 wz9Var) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(wz9.a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(wz9 wz9Var) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(wz9.a(getContext(), i));
    }

    public void setShowMotionSpec(wz9 wz9Var) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(wz9.a(getContext(), i));
    }

    public void setShrinkMotionSpec(wz9 wz9Var) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(wz9.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.j);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListD = coordinatorLayout.d(extendedFloatingActionButton);
            int size = arrayListD.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListD.get(i2);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || fVar.f != appBarLayout.getId()) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            dz3.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (z2) {
                    int i = ExtendedFloatingActionButton.k0;
                    throw null;
                }
                int i2 = ExtendedFloatingActionButton.k0;
                throw null;
            }
            if (z2) {
                int i3 = ExtendedFloatingActionButton.k0;
                throw null;
            }
            int i4 = ExtendedFloatingActionButton.k0;
            throw null;
        }

        public final boolean t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || fVar.f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (z2) {
                    int i = ExtendedFloatingActionButton.k0;
                    throw null;
                }
                int i2 = ExtendedFloatingActionButton.k0;
                throw null;
            }
            if (z2) {
                int i3 = ExtendedFloatingActionButton.k0;
                throw null;
            }
            int i4 = ExtendedFloatingActionButton.k0;
            throw null;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }
}
