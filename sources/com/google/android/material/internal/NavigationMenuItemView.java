package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.epg;
import defpackage.g6d;
import defpackage.ip5;
import defpackage.prg;
import defpackage.qnf;
import defpackage.t6;
import defpackage.y5;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends ip5 implements k.a {
    public static final int[] x0 = {R.attr.state_checked};
    public int n0;
    public boolean o0;
    public boolean p0;
    public final CheckedTextView q0;
    public FrameLayout r0;
    public h s0;
    public ColorStateList t0;
    public boolean u0;
    public Drawable v0;
    public final a w0;

    public class a extends y5 {
        public a() {
        }

        @Override // defpackage.y5
        public final void d(t6 t6Var, View view) {
            this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
            t6Var.m(NavigationMenuItemView.this.p0);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.w0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.indeed.android.jobsearch.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.indeed.android.jobsearch.R.id.design_menu_item_text);
        this.q0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        epg.o(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.r0 == null) {
                this.r0 = (FrameLayout) ((ViewStub) findViewById(com.indeed.android.jobsearch.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.r0.removeAllViews();
            this.r0.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        StateListDrawable stateListDrawable;
        this.s0 = hVar;
        int i = hVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.indeed.android.jobsearch.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(x0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, prg> weakHashMap = epg.a;
            setBackground(stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.q);
        qnf.a(this, hVar.r);
        h hVar2 = this.s0;
        CharSequence charSequence = hVar2.e;
        CheckedTextView checkedTextView = this.q0;
        if (charSequence == null && hVar2.getIcon() == null && this.s0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.r0;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.r0.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.r0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.r0.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.s0;
        if (hVar != null && hVar.isCheckable() && this.s0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.p0 != z) {
            this.p0 = z;
            this.w0.h(this.q0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.q0.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.u0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.t0);
            }
            int i = this.n0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.o0) {
            if (this.v0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = g6d.a;
                Drawable drawable2 = resources.getDrawable(com.indeed.android.jobsearch.R.drawable.navigation_empty_icon, theme);
                this.v0 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.n0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.v0;
        }
        this.q0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.q0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.n0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        this.u0 = colorStateList != null;
        h hVar = this.s0;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.q0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.o0 = z;
    }

    public void setTextAppearance(int i) {
        this.q0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.q0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.q0.setText(charSequence);
    }
}
