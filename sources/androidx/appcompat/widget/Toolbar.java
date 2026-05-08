package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import com.indeed.android.jobsearch.R;
import defpackage.co9;
import defpackage.do9;
import defpackage.epg;
import defpackage.g92;
import defpackage.gk3;
import defpackage.ihd;
import defpackage.isg;
import defpackage.mo9;
import defpackage.oze;
import defpackage.pnb;
import defpackage.qa0;
import defpackage.qnf;
import defpackage.umf;
import defpackage.wac;
import defpackage.z84;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements co9 {
    public h A0;
    public final a B0;
    public androidx.appcompat.widget.c C0;
    public ActionMenuPresenter D0;
    public f E0;
    public e.c F0;
    public e.d G0;
    public boolean H0;
    public OnBackInvokedCallback I0;
    public OnBackInvokedDispatcher J0;
    public boolean K0;
    public final b L0;
    public final CharSequence V;
    public AppCompatImageButton W;
    public ActionMenuView a;
    public View a0;
    public AppCompatTextView b;
    public Context b0;
    public AppCompatTextView c;
    public int c0;
    public AppCompatImageButton d;
    public int d0;
    public AppCompatImageView e;
    public int e0;
    public final Drawable f;
    public final int f0;
    public final int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public ihd l0;
    public int m0;
    public int n0;
    public final int o0;
    public CharSequence p0;
    public CharSequence q0;
    public ColorStateList r0;
    public ColorStateList s0;
    public boolean t0;
    public boolean u0;
    public final ArrayList<View> v0;
    public final ArrayList<View> w0;
    public final int[] x0;
    public final do9 y0;
    public ArrayList<MenuItem> z0;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.w();
        }
    }

    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean l(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void q(androidx.appcompat.view.menu.f fVar) {
            Toolbar toolbar = Toolbar.this;
            ActionMenuPresenter actionMenuPresenter = toolbar.a.l0;
            if (actionMenuPresenter == null || !actionMenuPresenter.m()) {
                Iterator<mo9> it = toolbar.y0.b.iterator();
                while (it.hasNext()) {
                    it.next().b(fVar);
                }
            }
            e.d dVar = toolbar.G0;
            if (dVar != null) {
                dVar.q(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = Toolbar.this.E0;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.b;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: nnf
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements j {
        public androidx.appcompat.view.menu.f a;
        public androidx.appcompat.view.menu.h b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.a0;
            if (callback instanceof g92) {
                ((g92) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.a0);
            toolbar.removeView(toolbar.W);
            toolbar.a0 = null;
            ArrayList<View> arrayList = toolbar.w0;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.b = null;
            toolbar.requestLayout();
            hVar.C = false;
            hVar.n.p(false);
            toolbar.x();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean g(m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable h() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean i(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.d();
            ViewParent parent = toolbar.W.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.W);
                }
                toolbar.addView(toolbar.W);
            }
            View actionView = hVar.getActionView();
            toolbar.a0 = actionView;
            this.b = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.a0);
                }
                g gVarI = Toolbar.i();
                gVarI.a = (toolbar.f0 & 112) | 8388611;
                gVarI.b = 2;
                toolbar.a0.setLayoutParams(gVarI);
                toolbar.addView(toolbar.a0);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                    toolbar.removeViewAt(childCount);
                    toolbar.w0.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.n.p(false);
            KeyEvent.Callback callback = toolbar.a0;
            if (callback instanceof g92) {
                ((g92) callback).onActionViewExpanded();
            }
            toolbar.x();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void j(boolean z) {
            if (this.b != null) {
                androidx.appcompat.view.menu.f fVar = this.a;
                if (fVar != null) {
                    int size = fVar.f.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.getItem(i) == this.b) {
                            return;
                        }
                    }
                }
                e(this.b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean k() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void l(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.a;
            if (fVar2 != null && (hVar = this.b) != null) {
                fVar2.d(hVar);
            }
            this.a = fVar;
        }
    }

    public static class g extends a.C0006a {
        public int b;

        public g(int i) {
            super(-2, i);
            this.b = 0;
            this.a = 8388627;
        }
    }

    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.o0 = 8388627;
        this.v0 = new ArrayList<>();
        this.w0 = new ArrayList<>();
        this.x0 = new int[2];
        this.y0 = new do9(new z84(this, 10));
        this.z0 = new ArrayList<>();
        this.B0 = new a();
        this.L0 = new b();
        Context context2 = getContext();
        int[] iArr = wac.y;
        umf umfVarE = umf.e(context2, attributeSet, iArr, R.attr.toolbarStyle);
        epg.n(this, context, iArr, attributeSet, umfVarE.b, R.attr.toolbarStyle);
        TypedArray typedArray = umfVarE.b;
        this.d0 = typedArray.getResourceId(28, 0);
        this.e0 = typedArray.getResourceId(19, 0);
        this.o0 = typedArray.getInteger(0, 8388627);
        this.f0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.k0 = dimensionPixelOffset;
        this.j0 = dimensionPixelOffset;
        this.i0 = dimensionPixelOffset;
        this.h0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.h0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.i0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.j0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.k0 = dimensionPixelOffset5;
        }
        this.g0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        e();
        ihd ihdVar = this.l0;
        ihdVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            ihdVar.e = dimensionPixelSize;
            ihdVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            ihdVar.f = dimensionPixelSize2;
            ihdVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            ihdVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.m0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.n0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = umfVarE.b(4);
        this.V = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.b0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableB = umfVarE.b(16);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = umfVarE.b(11);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(umfVarE.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(umfVarE.a(20));
        }
        if (typedArray.hasValue(14)) {
            o(typedArray.getResourceId(14, 0));
        }
        umfVarE.f();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new oze(getContext());
    }

    public static g i() {
        return new g(-2);
    }

    public static g j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            g gVar2 = new g(gVar);
            gVar2.b = 0;
            gVar2.b = gVar.b;
            return gVar2;
        }
        if (layoutParams instanceof a.C0006a) {
            g gVar3 = new g((a.C0006a) layoutParams);
            gVar3.b = 0;
            return gVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            g gVar4 = new g(layoutParams);
            gVar4.b = 0;
            return gVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        g gVar5 = new g(marginLayoutParams);
        gVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) gVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return gVar5;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && v(childAt)) {
                    int i3 = gVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && v(childAt2)) {
                int i5 = gVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // defpackage.co9
    public final void b(mo9 mo9Var) {
        do9 do9Var = this.y0;
        do9Var.b.add(mo9Var);
        do9Var.a.run();
    }

    public final void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarI = layoutParams == null ? i() : !checkLayoutParams(layoutParams) ? j(layoutParams) : (g) layoutParams;
        gVarI.b = 1;
        if (!z || this.a0 == null) {
            addView(view, gVarI);
        } else {
            view.setLayoutParams(gVarI);
            this.w0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        if (this.W == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.W = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f);
            this.W.setContentDescription(this.V);
            g gVarI = i();
            gVarI.a = (this.f0 & 112) | 8388611;
            gVarI.b = 2;
            this.W.setLayoutParams(gVarI);
            this.W.setOnClickListener(new d());
        }
    }

    public final void e() {
        if (this.l0 == null) {
            ihd ihdVar = new ihd();
            ihdVar.a = 0;
            ihdVar.b = 0;
            ihdVar.c = Integer.MIN_VALUE;
            ihdVar.d = Integer.MIN_VALUE;
            ihdVar.e = 0;
            ihdVar.f = 0;
            ihdVar.g = false;
            ihdVar.h = false;
            this.l0 = ihdVar;
        }
    }

    public final void f() {
        g();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.h0 == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.E0 == null) {
                this.E0 = new f();
            }
            this.a.setExpandedActionViewsExclusive(true);
            fVar.b(this.E0, this.b0);
            x();
        }
    }

    public final void g() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.c0);
            this.a.setOnMenuItemClickListener(this.B0);
            ActionMenuView actionMenuView2 = this.a;
            e.c cVar = this.F0;
            c cVar2 = new c();
            actionMenuView2.m0 = cVar;
            actionMenuView2.n0 = cVar2;
            g gVarI = i();
            gVarI.a = (this.f0 & 112) | 8388613;
            this.a.setLayoutParams(gVarI);
            c(this.a, false);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wac.b);
        gVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.b = 0;
        return gVar;
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.W;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.W;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ihd ihdVar = this.l0;
        if (ihdVar != null) {
            return ihdVar.g ? ihdVar.a : ihdVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.n0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ihd ihdVar = this.l0;
        if (ihdVar != null) {
            return ihdVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        ihd ihdVar = this.l0;
        if (ihdVar != null) {
            return ihdVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        ihd ihdVar = this.l0;
        if (ihdVar != null) {
            return ihdVar.g ? ihdVar.b : ihdVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.m0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (fVar = actionMenuView.h0) == null || !fVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.n0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.m0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        f();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.D0;
    }

    public Drawable getOverflowIcon() {
        f();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.b0;
    }

    public int getPopupTheme() {
        return this.c0;
    }

    public CharSequence getSubtitle() {
        return this.q0;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.p0;
    }

    public int getTitleMarginBottom() {
        return this.k0;
    }

    public int getTitleMarginEnd() {
        return this.i0;
    }

    public int getTitleMarginStart() {
        return this.h0;
    }

    public int getTitleMarginTop() {
        return this.j0;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public gk3 getWrapper() {
        if (this.C0 == null) {
            this.C0 = new androidx.appcompat.widget.c(this, true);
        }
        return this.C0;
    }

    public final void h() {
        if (this.d == null) {
            this.d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVarI = i();
            gVarI.a = (this.f0 & 112) | 8388611;
            this.d.setLayoutParams(gVarI);
        }
    }

    public final int k(View view, int i) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = gVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.o0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    @Override // defpackage.co9
    public final void m(mo9 mo9Var) {
        do9 do9Var = this.y0;
        do9Var.b.remove(mo9Var);
        if (((do9.a) do9Var.c.remove(mo9Var)) != null) {
            throw null;
        }
        do9Var.a.run();
    }

    public final void o(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.L0);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.u0 = false;
        }
        if (!this.u0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.u0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.u0 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b2;
        byte b3;
        int iL;
        int iMax;
        int iCombineMeasuredStates;
        int iL2;
        int iN;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = isg.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b3 = true;
            b2 = 0;
        } else {
            b2 = 1;
            b3 = false;
        }
        if (v(this.d)) {
            u(this.d, i, 0, i2, this.g0);
            iL = l(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, n(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iL = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (v(this.W)) {
            u(this.W, i, 0, i2, this.g0);
            iL = l(this.W) + this.W.getMeasuredWidth();
            iMax = Math.max(iMax, n(this.W) + this.W.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.W.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iL);
        int iMax4 = Math.max(0, currentContentInsetStart - iL);
        byte b4 = b3;
        int[] iArr = this.x0;
        iArr[b4 == true ? 1 : 0] = iMax4;
        if (v(this.a)) {
            u(this.a, i, iMax3, i2, this.g0);
            iL2 = l(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, n(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iL2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iL2);
        iArr[b2] = Math.max(0, currentContentInsetEnd - iL2);
        if (v(this.a0)) {
            iMax5 += t(this.a0, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, n(this.a0) + this.a0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a0.getMeasuredState());
        }
        if (v(this.e)) {
            iMax5 += t(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, n(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((g) childAt.getLayoutParams()).b == 0 && v(childAt)) {
                iMax5 += t(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, n(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.j0 + this.k0;
        int i7 = this.h0 + this.i0;
        if (v(this.b)) {
            t(this.b, i, i5 + i7, i2, i6, iArr);
            int iL3 = l(this.b) + this.b.getMeasuredWidth();
            iN = n(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iL3;
        } else {
            iN = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (v(this.c)) {
            iMax2 = Math.max(iMax2, t(this.c, i, i5 + i7, i2, i6 + iN, iArr));
            iN += n(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iN);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.H0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        ActionMenuView actionMenuView = this.a;
        androidx.appcompat.view.menu.f fVar = actionMenuView != null ? actionMenuView.h0 : null;
        int i = savedState.c;
        if (i != 0 && this.E0 != null && fVar != null && (menuItemFindItem = fVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.d) {
            b bVar = this.L0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        e();
        ihd ihdVar = this.l0;
        boolean z = i == 1;
        if (z == ihdVar.g) {
            return;
        }
        ihdVar.g = z;
        if (!ihdVar.h) {
            ihdVar.a = ihdVar.e;
            ihdVar.b = ihdVar.f;
            return;
        }
        if (z) {
            int i2 = ihdVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = ihdVar.e;
            }
            ihdVar.a = i2;
            int i3 = ihdVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = ihdVar.f;
            }
            ihdVar.b = i3;
            return;
        }
        int i4 = ihdVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = ihdVar.e;
        }
        ihdVar.a = i4;
        int i5 = ihdVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = ihdVar.f;
        }
        ihdVar.b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ActionMenuPresenter actionMenuPresenter;
        androidx.appcompat.view.menu.h hVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.E0;
        if (fVar != null && (hVar = fVar.b) != null) {
            savedState.c = hVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        savedState.d = (actionMenuView == null || (actionMenuPresenter = actionMenuView.l0) == null || !actionMenuPresenter.m()) ? false : true;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t0 = false;
        }
        if (!this.t0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.t0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.t0 = false;
        return true;
    }

    public final void p() {
        Iterator<MenuItem> it = this.z0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<mo9> it2 = this.y0.b.iterator();
        while (it2.hasNext()) {
            it2.next().d(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.z0 = currentMenuItems2;
    }

    public final boolean q(View view) {
        return view.getParent() == this || this.w0.contains(view);
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iK = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iK, iMax + measuredWidth, view.getMeasuredHeight() + iK);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + iMax;
    }

    public final int s(View view, int i, int i2, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iK = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iK, iMax, view.getMeasuredHeight() + iK);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.K0 != z) {
            this.K0 = z;
            x();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        AppCompatImageButton appCompatImageButton = this.W;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            this.W.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.W;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.H0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.n0) {
            this.n0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.m0) {
            this.m0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.e;
        if (drawable != null) {
            if (appCompatImageView == null) {
                this.e = new AppCompatImageView(getContext(), null);
            }
            if (!q(this.e)) {
                c(this.e, true);
            }
        } else if (appCompatImageView != null && q(appCompatImageView)) {
            removeView(this.e);
            this.w0.remove(this.e);
        }
        AppCompatImageView appCompatImageView2 = this.e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        AppCompatImageButton appCompatImageButton = this.d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            qnf.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!q(this.d)) {
                c(this.d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.d;
            if (appCompatImageButton != null && q(appCompatImageButton)) {
                removeView(this.d);
                this.w0.remove(this.d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        h();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.A0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        f();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.c0 != i) {
            this.c0 = i;
            if (i == 0) {
                this.b0 = getContext();
            } else {
                this.b0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.c;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.e0;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.s0;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!q(this.c)) {
                c(this.c, true);
            }
        } else if (appCompatTextView != null && q(appCompatTextView)) {
            removeView(this.c);
            this.w0.remove(this.c);
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.q0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.s0 = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.b;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.d0;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.r0;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!q(this.b)) {
                c(this.b, true);
            }
        } else if (appCompatTextView != null && q(appCompatTextView)) {
            removeView(this.b);
            this.w0.remove(this.b);
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.p0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.k0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.h0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void u(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean w() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.l0) == null || !actionMenuPresenter.n()) ? false : true;
    }

    public final void x() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            f fVar = this.E0;
            boolean z = (fVar == null || fVar.b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.K0) ? false : true;
            if (z && this.J0 == null) {
                if (this.I0 == null) {
                    this.I0 = e.b(new qa0(this, 8));
                }
                e.c(onBackInvokedDispatcherA, this.I0);
                this.J0 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.J0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.I0);
            this.J0 = null;
        }
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

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(pnb.A(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(pnb.A(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(pnb.A(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
