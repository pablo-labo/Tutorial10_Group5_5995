package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.f;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.gk3;
import defpackage.oie;
import defpackage.onf;
import defpackage.pnb;
import defpackage.prg;
import defpackage.umf;
import defpackage.wac;

/* JADX INFO: loaded from: classes.dex */
public final class c implements gk3 {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public ActionMenuPresenter m;
    public final int n;
    public final Drawable o;

    public class a extends oie {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // defpackage.oie, defpackage.rrg
        public final void a() {
            this.a = true;
        }

        @Override // defpackage.oie, defpackage.rrg
        public final void b() {
            c.this.a.setVisibility(0);
        }

        @Override // defpackage.rrg
        public final void c() {
            if (this.a) {
                return;
            }
            c.this.a.setVisibility(this.b);
        }
    }

    public c(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        umf umfVarE = umf.e(toolbar.getContext(), null, wac.a, R.attr.actionBarStyle);
        TypedArray typedArray = umfVarE.b;
        int i = 15;
        this.o = umfVarE.b(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = umfVarE.b(20);
            if (drawableB != null) {
                this.e = drawableB;
                u();
            }
            Drawable drawableB2 = umfVarE.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                s(drawable);
            }
            i(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                i(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.e();
                toolbar.l0.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.d0 = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.e0 = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        umfVarE.f();
        if (R.string.abc_action_bar_up_description != this.n) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.n;
                this.j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                t();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new onf(this));
    }

    @Override // defpackage.gk3
    public final boolean a() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.k0;
    }

    @Override // defpackage.gk3
    public final boolean b() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.l0) == null || !actionMenuPresenter.b()) ? false : true;
    }

    @Override // defpackage.gk3
    public final boolean c() {
        return this.a.w();
    }

    @Override // defpackage.gk3
    public final void collapseActionView() {
        Toolbar.f fVar = this.a.E0;
        h hVar = fVar == null ? null : fVar.b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // defpackage.gk3
    public final void d(Menu menu, j.a aVar) {
        ActionMenuPresenter actionMenuPresenter = this.m;
        Toolbar toolbar = this.a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.m = actionMenuPresenter2;
            actionMenuPresenter2.X = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.m;
        actionMenuPresenter3.e = aVar;
        f fVar = (f) menu;
        if (fVar == null && toolbar.a == null) {
            return;
        }
        toolbar.g();
        f fVar2 = toolbar.a.h0;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.r(toolbar.D0);
            fVar2.r(toolbar.E0);
        }
        if (toolbar.E0 == null) {
            toolbar.E0 = toolbar.new f();
        }
        actionMenuPresenter3.g0 = true;
        Context context = toolbar.b0;
        if (fVar != null) {
            fVar.b(actionMenuPresenter3, context);
            fVar.b(toolbar.E0, toolbar.b0);
        } else {
            actionMenuPresenter3.l(context, null);
            toolbar.E0.l(toolbar.b0, null);
            actionMenuPresenter3.j(true);
            toolbar.E0.j(true);
        }
        toolbar.a.setPopupTheme(toolbar.c0);
        toolbar.a.setPresenter(actionMenuPresenter3);
        toolbar.D0 = actionMenuPresenter3;
        toolbar.x();
    }

    @Override // defpackage.gk3
    public final boolean e() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.l0) == null || !actionMenuPresenter.m()) ? false : true;
    }

    @Override // defpackage.gk3
    public final void f() {
        this.l = true;
    }

    @Override // defpackage.gk3
    public final boolean g() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.l0) == null) {
            return false;
        }
        return actionMenuPresenter.k0 != null || actionMenuPresenter.m();
    }

    @Override // defpackage.gk3
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.gk3
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.gk3
    public final boolean h() {
        Toolbar.f fVar = this.a.E0;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    @Override // defpackage.gk3
    public final void i(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    t();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                u();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // defpackage.gk3
    public final prg j(int i, long j) {
        prg prgVarA = epg.a(this.a);
        prgVarA.a(i == 0 ? 1.0f : 0.0f);
        prgVarA.c(j);
        prgVarA.d(new a(i));
        return prgVarA;
    }

    @Override // defpackage.gk3
    public final void k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.gk3
    public final void l(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // defpackage.gk3
    public final void m() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.l0) == null) {
            return;
        }
        actionMenuPresenter.b();
        ActionMenuPresenter.a aVar = actionMenuPresenter.j0;
        if (aVar == null || !aVar.b()) {
            return;
        }
        aVar.i.dismiss();
    }

    @Override // defpackage.gk3
    public final void n() {
    }

    @Override // defpackage.gk3
    public final void o(int i) {
        this.e = i != 0 ? pnb.A(this.a.getContext(), i) : null;
        u();
    }

    @Override // defpackage.gk3
    public final void p(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.gk3
    public final int q() {
        return this.b;
    }

    @Override // defpackage.gk3
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.gk3
    public final void s(Drawable drawable) {
        this.f = drawable;
        int i = this.b & 4;
        Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // defpackage.gk3
    public final void setIcon(int i) {
        setIcon(i != 0 ? pnb.A(this.a.getContext(), i) : null);
    }

    @Override // defpackage.gk3
    public final void setTitle(CharSequence charSequence) {
        this.g = true;
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                epg.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.gk3
    public final void setWindowCallback(Window.Callback callback) {
        this.k = callback;
    }

    @Override // defpackage.gk3
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.g) {
            return;
        }
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                epg.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void t() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void u() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }

    @Override // defpackage.gk3
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        u();
    }
}
