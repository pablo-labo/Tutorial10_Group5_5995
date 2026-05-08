package androidx.appcompat.app;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import defpackage.epg;
import defpackage.gk3;
import defpackage.i7;
import defpackage.oie;
import defpackage.oze;
import defpackage.prg;
import defpackage.qrg;
import defpackage.r6;
import defpackage.srg;
import defpackage.wac;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public gk3 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public d i;
    public d j;
    public AppCompatDelegateImpl.d k;
    public boolean l;
    public final ArrayList<a.b> m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public qrg s;
    public boolean t;
    public boolean u;
    public final a v;
    public final b w;
    public final c x;

    public class a extends oie {
        public a() {
        }

        @Override // defpackage.rrg
        public final void c() {
            View view;
            f fVar = f.this;
            if (fVar.o && (view = fVar.g) != null) {
                view.setTranslationY(0.0f);
                fVar.d.setTranslationY(0.0f);
            }
            fVar.d.setVisibility(8);
            fVar.d.setTransitioning(false);
            fVar.s = null;
            AppCompatDelegateImpl.d dVar = fVar.k;
            if (dVar != null) {
                dVar.a(fVar.j);
                fVar.j = null;
                fVar.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = fVar.c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                epg.c.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends oie {
        public b() {
        }

        @Override // defpackage.rrg
        public final void c() {
            f fVar = f.this;
            fVar.s = null;
            fVar.d.requestLayout();
        }
    }

    public class c implements srg {
        public c() {
        }
    }

    public class d extends i7 implements f.a {
        public WeakReference<View> V;
        public final /* synthetic */ f W;
        public final Context d;
        public final androidx.appcompat.view.menu.f e;
        public AppCompatDelegateImpl.d f;

        public d(f fVar, Context context, AppCompatDelegateImpl.d dVar) {
            super(0);
            this.W = fVar;
            this.d = context;
            this.f = dVar;
            androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
            fVar2.l = 1;
            this.e = fVar2;
            fVar2.e = this;
        }

        @Override // defpackage.i7
        public final void T() {
            f fVar = this.W;
            if (fVar.i != this) {
                return;
            }
            if (fVar.p) {
                fVar.j = this;
                fVar.k = this.f;
            } else {
                this.f.a(this);
            }
            this.f = null;
            fVar.w(false);
            ActionBarContextView actionBarContextView = fVar.f;
            if (actionBarContextView.c0 == null) {
                actionBarContextView.h();
            }
            fVar.c.setHideOnContentScrollEnabled(fVar.u);
            fVar.i = null;
        }

        @Override // defpackage.i7
        public final View U() {
            WeakReference<View> weakReference = this.V;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.i7
        public final androidx.appcompat.view.menu.f W() {
            return this.e;
        }

        @Override // defpackage.i7
        public final MenuInflater X() {
            return new oze(this.d);
        }

        @Override // defpackage.i7
        public final CharSequence Y() {
            return this.W.f.getSubtitle();
        }

        @Override // defpackage.i7
        public final CharSequence a0() {
            return this.W.f.getTitle();
        }

        @Override // defpackage.i7
        public final void b0() {
            if (this.W.i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.e;
            fVar.w();
            try {
                this.f.b(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // defpackage.i7
        public final boolean c0() {
            return this.W.f.k0;
        }

        @Override // defpackage.i7
        public final void g0(View view) {
            this.W.f.setCustomView(view);
            this.V = new WeakReference<>(view);
        }

        @Override // defpackage.i7
        public final void h0(int i) {
            i0(this.W.a.getResources().getString(i));
        }

        @Override // defpackage.i7
        public final void i0(CharSequence charSequence) {
            this.W.f.setSubtitle(charSequence);
        }

        @Override // defpackage.i7
        public final void j0(int i) {
            k0(this.W.a.getResources().getString(i));
        }

        @Override // defpackage.i7
        public final void k0(CharSequence charSequence) {
            this.W.f.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean l(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            AppCompatDelegateImpl.d dVar = this.f;
            if (dVar != null) {
                return dVar.a.b(this, menuItem);
            }
            return false;
        }

        @Override // defpackage.i7
        public final void l0(boolean z) {
            this.b = z;
            this.W.f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void q(androidx.appcompat.view.menu.f fVar) {
            if (this.f == null) {
                return;
            }
            b0();
            ActionMenuPresenter actionMenuPresenter = this.W.f.d;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.n();
            }
        }
    }

    public f(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a();
        this.w = new b();
        this.x = new c();
        View decorView = activity.getWindow().getDecorView();
        x(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.a
    public final boolean b() {
        gk3 gk3Var = this.e;
        if (gk3Var == null || !gk3Var.h()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList<a.b> arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // androidx.appcompat.app.a
    public final int d() {
        return this.e.q();
    }

    @Override // androidx.appcompat.app.a
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.indeed.android.jobsearch.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.a
    public final void g() {
        y(this.a.getResources().getBoolean(com.indeed.android.jobsearch.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.a
    public final boolean i(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.e) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public final void l(ColorDrawable colorDrawable) {
        this.d.setPrimaryBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.a
    public final void m(boolean z2) {
        if (this.h) {
            return;
        }
        n(z2);
    }

    @Override // androidx.appcompat.app.a
    public final void n(boolean z2) {
        int i = z2 ? 4 : 0;
        int iQ = this.e.q();
        this.h = true;
        this.e.i((i & 4) | (iQ & (-5)));
    }

    @Override // androidx.appcompat.app.a
    public final void o() {
        this.e.i(this.e.q() & (-3));
    }

    @Override // androidx.appcompat.app.a
    public final void p(float f) {
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.k(actionBarContainer, f);
    }

    @Override // androidx.appcompat.app.a
    public final void q(Drawable drawable) {
        this.e.s(drawable);
    }

    @Override // androidx.appcompat.app.a
    public final void r(boolean z2) {
        this.e.getClass();
    }

    @Override // androidx.appcompat.app.a
    public final void s(boolean z2) {
        qrg qrgVar;
        this.t = z2;
        if (z2 || (qrgVar = this.s) == null) {
            return;
        }
        qrgVar.a();
    }

    @Override // androidx.appcompat.app.a
    public final void t(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public final void u(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public final i7 v(AppCompatDelegateImpl.d dVar) {
        d dVar2 = this.i;
        if (dVar2 != null) {
            dVar2.T();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar3 = new d(this, this.f.getContext(), dVar);
        androidx.appcompat.view.menu.f fVar = dVar3.e;
        fVar.w();
        try {
            if (!dVar3.f.a.c(dVar3, fVar)) {
                return null;
            }
            this.i = dVar3;
            dVar3.b0();
            this.f.f(dVar3);
            w(true);
            return dVar3;
        } finally {
            fVar.v();
        }
    }

    public final void w(boolean z2) {
        prg prgVarE;
        prg prgVarE2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                z(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            z(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        gk3 gk3Var = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                gk3Var.p(4);
                this.f.setVisibility(0);
                return;
            } else {
                gk3Var.p(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            prgVarE = gk3Var.j(4, 100L);
            prgVarE2 = this.f.e(0, 200L);
        } else {
            prg prgVarJ = gk3Var.j(0, 200L);
            prgVarE = this.f.e(8, 100L);
            prgVarE2 = prgVarJ;
        }
        qrg qrgVar = new qrg();
        ArrayList<prg> arrayList = qrgVar.a;
        arrayList.add(prgVarE);
        View view = prgVarE.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = prgVarE2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(prgVarE2);
        qrgVar.b();
    }

    public final void x(View view) {
        gk3 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.indeed.android.jobsearch.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.indeed.android.jobsearch.R.id.action_bar);
        if (callbackFindViewById instanceof gk3) {
            wrapper = (gk3) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.indeed.android.jobsearch.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.indeed.android.jobsearch.R.id.action_bar_container);
        this.d = actionBarContainer;
        gk3 gk3Var = this.e;
        if (gk3Var == null || this.f == null || actionBarContainer == null) {
            r6.g(f.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        this.a = gk3Var.getContext();
        boolean z2 = (this.e.q() & 4) != 0;
        if (z2) {
            this.h = true;
        }
        Context context = this.a;
        r(context.getApplicationInfo().targetSdkVersion < 14 || z2);
        y(context.getResources().getBoolean(com.indeed.android.jobsearch.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, wac.a, com.indeed.android.jobsearch.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.V) {
                r6.g("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            p(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void y(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            this.e.n();
        } else {
            this.e.n();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        this.e.l(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void z(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final c cVar = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                qrg qrgVar = this.s;
                if (qrgVar != null) {
                    qrgVar.a();
                }
                int i = this.n;
                a aVar = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    aVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                qrg qrgVar2 = new qrg();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                prg prgVarA = epg.a(this.d);
                prgVarA.e(f);
                final View view2 = prgVarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: org
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) androidx.appcompat.app.f.this.d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = qrgVar2.e;
                ArrayList<prg> arrayList = qrgVar2.a;
                if (!z5) {
                    arrayList.add(prgVarA);
                }
                if (this.o && view != null) {
                    prg prgVarA2 = epg.a(view);
                    prgVarA2.e(f);
                    if (!qrgVar2.e) {
                        arrayList.add(prgVarA2);
                    }
                }
                boolean z6 = qrgVar2.e;
                if (!z6) {
                    qrgVar2.c = y;
                }
                if (!z6) {
                    qrgVar2.b = 250L;
                }
                if (!z6) {
                    qrgVar2.d = aVar;
                }
                this.s = qrgVar2;
                qrgVar2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        qrg qrgVar3 = this.s;
        if (qrgVar3 != null) {
            qrgVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        b bVar = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            qrg qrgVar4 = new qrg();
            prg prgVarA3 = epg.a(this.d);
            prgVarA3.e(0.0f);
            final View view3 = prgVarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: org
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) androidx.appcompat.app.f.this.d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = qrgVar4.e;
            ArrayList<prg> arrayList2 = qrgVar4.a;
            if (!z7) {
                arrayList2.add(prgVarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                prg prgVarA4 = epg.a(view);
                prgVarA4.e(0.0f);
                if (!qrgVar4.e) {
                    arrayList2.add(prgVarA4);
                }
            }
            boolean z8 = qrgVar4.e;
            if (!z8) {
                qrgVar4.c = z;
            }
            if (!z8) {
                qrgVar4.b = 250L;
            }
            if (!z8) {
                qrgVar4.d = bVar;
            }
            this.s = qrgVar4;
            qrgVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.c.c(actionBarOverlayLayout);
        }
    }

    public f(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a();
        this.w = new b();
        this.x = new c();
        x(dialog.getWindow().getDecorView());
    }
}
