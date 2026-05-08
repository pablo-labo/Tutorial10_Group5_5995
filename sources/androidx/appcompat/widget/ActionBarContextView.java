package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.i0;
import defpackage.i7;
import defpackage.isg;
import defpackage.pnb;
import defpackage.r6;
import defpackage.wac;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends i0 {
    public CharSequence a0;
    public CharSequence b0;
    public View c0;
    public View d0;
    public View e0;
    public LinearLayout f0;
    public TextView g0;
    public TextView h0;
    public final int i0;
    public final int j0;
    public boolean k0;
    public final int l0;

    public class a implements View.OnClickListener {
        public final /* synthetic */ i7 a;

        public a(i7 i7Var) {
            this.a = i7Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.T();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wac.d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : pnb.A(context, resourceId));
        this.i0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.j0 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.l0 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(i7 i7Var) {
        View view = this.c0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.l0, (ViewGroup) this, false);
            this.c0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.c0);
        }
        View viewFindViewById = this.c0.findViewById(R.id.action_mode_close_button);
        this.d0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(i7Var));
        f fVarW = i7Var.W();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = actionMenuPresenter.j0;
            if (aVar != null && aVar.b()) {
                aVar.i.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.d = actionMenuPresenter2;
        actionMenuPresenter2.b0 = true;
        actionMenuPresenter2.c0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVarW.b(this.d, this.b);
        ActionMenuPresenter actionMenuPresenter3 = this.d;
        k kVar = actionMenuPresenter3.W;
        if (kVar == null) {
            k kVar2 = (k) actionMenuPresenter3.d.inflate(actionMenuPresenter3.f, (ViewGroup) this, false);
            actionMenuPresenter3.W = kVar2;
            kVar2.a(actionMenuPresenter3.c);
            actionMenuPresenter3.j(true);
        }
        k kVar3 = actionMenuPresenter3.W;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void g() {
        if (this.f0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f0 = linearLayout;
            this.g0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.h0 = (TextView) this.f0.findViewById(R.id.action_bar_subtitle);
            int i = this.i0;
            if (i != 0) {
                this.g0.setTextAppearance(getContext(), i);
            }
            int i2 = this.j0;
            if (i2 != 0) {
                this.h0.setTextAppearance(getContext(), i2);
            }
        }
        this.g0.setText(this.a0);
        this.h0.setText(this.b0);
        boolean zIsEmpty = TextUtils.isEmpty(this.a0);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.b0);
        this.h0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f0.getParent() == null) {
            addView(this.f0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.i0
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.i0
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.b0;
    }

    public CharSequence getTitle() {
        return this.a0;
    }

    public final void h() {
        removeAllViews();
        this.e0 = null;
        this.c = null;
        this.d = null;
        View view = this.d0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = this.d.j0;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = isg.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.c0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c0.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iD = i0.d(i7, paddingTop, paddingTop2, this.c0, z3) + i7;
            paddingRight = z3 ? iD - i6 : iD + i6;
        }
        LinearLayout linearLayout = this.f0;
        if (linearLayout != null && this.e0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += i0.d(paddingRight, paddingTop, paddingTop2, this.f0, z3);
        }
        View view2 = this.e0;
        if (view2 != null) {
            i0.d(paddingRight, paddingTop, paddingTop2, view2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            i0.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            r6.g(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            r6.g(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.c0;
        if (view != null) {
            int iC = i0.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c0.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = i0.c(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f0;
        if (linearLayout != null && this.e0 == null) {
            if (this.k0) {
                this.f0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = i0.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.e0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.e0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // defpackage.i0
    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.e0;
        if (view2 != null) {
            removeView(view2);
        }
        this.e0 = view;
        if (view != null && (linearLayout = this.f0) != null) {
            removeView(linearLayout);
            this.f0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b0 = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.a0 = charSequence;
        g();
        epg.p(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.k0) {
            requestLayout();
        }
        this.k0 = z;
    }

    @Override // defpackage.i0, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
