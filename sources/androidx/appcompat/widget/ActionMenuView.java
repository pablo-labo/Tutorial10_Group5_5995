package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import defpackage.isg;
import defpackage.mo9;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f.b, k {
    public f h0;
    public Context i0;
    public int j0;
    public boolean k0;
    public ActionMenuPresenter l0;
    public e.c m0;
    public f.a n0;
    public boolean o0;
    public int p0;
    public final int q0;
    public final int r0;
    public e s0;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final void c(f fVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(f fVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {

        @ViewDebug.ExportedProperty
        public boolean a;

        @ViewDebug.ExportedProperty
        public int b;

        @ViewDebug.ExportedProperty
        public int c;

        @ViewDebug.ExportedProperty
        public boolean d;

        @ViewDebug.ExportedProperty
        public boolean e;
        public boolean f;
    }

    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean l(f fVar, MenuItem menuItem) {
            boolean zOnMenuItemSelected;
            e eVar = ActionMenuView.this.s0;
            if (eVar != null) {
                Toolbar toolbar = Toolbar.this;
                Iterator<mo9> it = toolbar.y0.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Toolbar.h hVar = toolbar.A0;
                        zOnMenuItemSelected = hVar != null ? androidx.appcompat.app.e.this.b.onMenuItemSelected(0, menuItem) : false;
                    } else if (it.next().c(menuItem)) {
                        zOnMenuItemSelected = true;
                        break;
                    }
                }
                if (zOnMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void q(f fVar) {
            f.a aVar = ActionMenuView.this.n0;
            if (aVar != null) {
                aVar.q(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.q0 = (int) (56.0f * f);
        this.r0 = (int) (f * 4.0f);
        this.i0 = context;
        this.j0 = 0;
    }

    public static c j() {
        c cVar = new c(-2, -2);
        cVar.a = false;
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    public static c k(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar = new c(cVar2);
            cVar.a = cVar2.a;
        } else {
            cVar = new c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void a(f fVar) {
        this.h0 = fVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean b(h hVar) {
        return this.h0.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.h0 == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.h0 = fVar;
            fVar.e = new d();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.l0 = actionMenuPresenter;
            actionMenuPresenter.b0 = true;
            actionMenuPresenter.c0 = true;
            j.a bVar = this.m0;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter.e = bVar;
            this.h0.b(actionMenuPresenter, this.i0);
            ActionMenuPresenter actionMenuPresenter2 = this.l0;
            actionMenuPresenter2.W = this;
            this.h0 = actionMenuPresenter2.c;
        }
        return this.h0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.l0;
        ActionMenuPresenter.d dVar = actionMenuPresenter.Y;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.a0) {
            return actionMenuPresenter.Z;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.j0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.l0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.j(false);
            if (this.l0.m()) {
                this.l0.b();
                this.l0.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.l0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = actionMenuPresenter.j0;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.o0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = isg.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        f fVar;
        boolean z = this.o0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.o0 = z2;
        if (z != z2) {
            this.p0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.o0 && (fVar = this.h0) != null && size != this.p0) {
            this.p0 = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.o0 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                c cVar = (c) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.q0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.r0;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f = false;
                cVar2.c = 0;
                cVar2.b = 0;
                cVar2.d = false;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = 0;
                cVar2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = cVar2.a ? 1 : i10;
                c cVar3 = (c) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                cVar3.d = !cVar3.a && z6;
                cVar3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (cVar2.d) {
                    i15++;
                }
                if (cVar2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                c cVar4 = (c) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (cVar4.d) {
                    int i28 = cVar4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                c cVar5 = (c) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && cVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    cVar5.b += r11;
                    cVar5.f = r11;
                    i23--;
                } else if (cVar5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((c) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.c = i32;
                        cVar6.f = true;
                        if (i33 == 0 && !cVar6.e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (cVar6.a) {
                        cVar6.c = i32;
                        cVar6.f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.b * i22) + cVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.l0.g0 = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.s0 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.l0;
        ActionMenuPresenter.d dVar = actionMenuPresenter.Y;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.a0 = true;
            actionMenuPresenter.Z = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.k0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            if (i == 0) {
                this.i0 = getContext();
            } else {
                this.i0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.l0 = actionMenuPresenter;
        actionMenuPresenter.W = this;
        this.h0 = actionMenuPresenter.c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
