package com.swmansion.rnscreens;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.g;
import defpackage.ac3;
import defpackage.dmc;
import defpackage.l5;
import defpackage.m6;
import defpackage.mkf;
import defpackage.nn2;
import defpackage.qeb;
import defpackage.qg6;
import defpackage.qpc;
import defpackage.r6;
import defpackage.reb;
import defpackage.rnc;
import defpackage.sqd;
import defpackage.tg6;
import defpackage.v55;
import defpackage.wi0;
import defpackage.wl7;
import defpackage.zh3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends v55 implements rnc {
    public static final /* synthetic */ int u0 = 0;
    public final ArrayList<g> V;
    public final ac3 W;
    public boolean a0;
    public boolean b0;
    public String c0;
    public int d0;
    public String e0;
    public final reb f;
    public String f0;
    public float g0;
    public int h0;
    public Integer i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public boolean p0;
    public final int q0;
    public final int r0;
    public final zh3 s0;
    public boolean t0;

    public static final class a {
        public static TextView a(Toolbar toolbar) {
            toolbar.getClass();
            int childCount = toolbar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = toolbar.getChildAt(i);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }
    }

    public f(mkf mkfVar) {
        mkfVar.getClass();
        reb rebVar = new reb();
        super(mkfVar);
        this.f = rebVar;
        this.V = new ArrayList<>(3);
        this.n0 = true;
        this.s0 = new zh3(this, 2);
        setVisibility(8);
        ac3 ac3Var = new ac3(mkfVar, this);
        this.W = ac3Var;
        this.q0 = ac3Var.getContentInsetStart();
        this.r0 = ac3Var.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (mkfVar.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            ac3Var.setBackgroundColor(typedValue.data);
        }
        ac3Var.setClipChildren(false);
    }

    public static void a(f fVar) {
        e screenFragment = fVar.getScreenFragment();
        if (screenFragment != null) {
            d screenStack = fVar.getScreenStack();
            if (screenStack == null || !wl7.b(screenStack.getRootScreen(), screenFragment.l())) {
                if (screenFragment.l().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.I();
                    return;
                } else {
                    screenFragment.D();
                    return;
                }
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof e) {
                e eVar = (e) parentFragment;
                if (eVar.l().getNativeBackButtonDismissalEnabled()) {
                    eVar.I();
                } else {
                    eVar.D();
                }
            }
        }
    }

    private final com.swmansion.rnscreens.a getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof com.swmansion.rnscreens.a) {
            return (com.swmansion.rnscreens.a) parent;
        }
        return null;
    }

    private final d getScreenStack() {
        com.swmansion.rnscreens.a screen = getScreen();
        b container = screen != null ? screen.getContainer() : null;
        if (container instanceof d) {
            return (d) container;
        }
        return null;
    }

    public final void b() {
        com.swmansion.rnscreens.a screen;
        if (getParent() == null || this.l0 || (screen = getScreen()) == null || screen.h0) {
            return;
        }
        c();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        Drawable navigationIcon;
        boolean z;
        boolean z2;
        e screenFragment;
        e screenFragment2;
        Toolbar toolbar;
        ReactContext reactContextW;
        d screenStack = getScreenStack();
        boolean z3 = screenStack == null || wl7.b(screenStack.getTopScreen(), getParent());
        if (this.p0 && z3 && !this.l0) {
            e screenFragment3 = getScreenFragment();
            wi0 wi0Var = (wi0) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (wi0Var == null) {
                return;
            }
            String str = this.f0;
            ac3 ac3Var = this.W;
            if (str != null) {
                if (str.equals("rtl")) {
                    ac3Var.setLayoutDirection(1);
                } else if (wl7.b(this.f0, "ltr")) {
                    ac3Var.setLayoutDirection(0);
                }
            }
            com.swmansion.rnscreens.a screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    context.getClass();
                    reactContextW = (ReactContext) context;
                } else {
                    sqd fragmentWrapper = screen.getFragmentWrapper();
                    reactContextW = fragmentWrapper != null ? fragmentWrapper.w() : null;
                }
                h.k(screen, wi0Var, reactContextW);
            }
            if (this.a0) {
                if (ac3Var.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                AppBarLayout appBarLayout = screenFragment2.W;
                if (appBarLayout != null && (toolbar = screenFragment2.X) != null && toolbar.getParent() == appBarLayout) {
                    appBarLayout.removeView(toolbar);
                }
                screenFragment2.X = null;
                return;
            }
            if (ac3Var.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                AppBarLayout appBarLayout2 = screenFragment.W;
                if (appBarLayout2 != null) {
                    appBarLayout2.addView(ac3Var);
                }
                AppBarLayout.c cVar = new AppBarLayout.c();
                cVar.a = 0;
                ac3Var.setLayoutParams(cVar);
                screenFragment.X = ac3Var;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) wi0Var.w();
            Object obj = appCompatDelegateImpl.Y;
            if (obj instanceof Activity) {
                appCompatDelegateImpl.H();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.d0;
                if (aVar instanceof androidx.appcompat.app.f) {
                    r6.g("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                    return;
                }
                appCompatDelegateImpl.e0 = null;
                if (aVar != null) {
                    aVar.h();
                }
                appCompatDelegateImpl.d0 = null;
                androidx.appcompat.app.e eVar = new androidx.appcompat.app.e(ac3Var, ((Activity) obj).getTitle(), appCompatDelegateImpl.b0);
                appCompatDelegateImpl.d0 = eVar;
                appCompatDelegateImpl.b0.b = eVar.c;
                ac3Var.setBackInvokedCallbackEnabled(true);
                appCompatDelegateImpl.g();
            }
            androidx.appcompat.app.a aVarY = wi0Var.y();
            if (aVarY == null) {
                l5.q("Required value was null.");
                return;
            }
            e screenFragment4 = getScreenFragment();
            aVarY.n((screenFragment4 == null || !screenFragment4.H() || this.j0) ? false : true);
            aVarY.t(this.c0);
            if (TextUtils.isEmpty(this.c0)) {
                this.t0 = true;
            }
            f fVar = ac3Var.M0;
            ac3Var.setContentInsetStartWithNavigation(fVar.getPreferredContentInsetStartWithNavigation());
            int preferredContentInsetStart = fVar.getPreferredContentInsetStart();
            int preferredContentInsetEnd = fVar.getPreferredContentInsetEnd();
            ac3Var.e();
            ac3Var.l0.a(preferredContentInsetStart, preferredContentInsetEnd);
            ac3Var.setNavigationOnClickListener(this.s0);
            e screenFragment5 = getScreenFragment();
            if (screenFragment5 != null && screenFragment5.Y != (z2 = this.k0)) {
                AppBarLayout appBarLayout3 = screenFragment5.W;
                if (appBarLayout3 != null) {
                    appBarLayout3.setElevation(z2 ? 0.0f : nn2.G(4.0f));
                }
                AppBarLayout appBarLayout4 = screenFragment5.W;
                if (appBarLayout4 != null) {
                    appBarLayout4.setStateListAnimator(null);
                }
                screenFragment5.Y = z2;
            }
            e screenFragment6 = getScreenFragment();
            if (screenFragment6 != null && screenFragment6.Z != (z = this.b0)) {
                ViewGroup.LayoutParams layoutParams = screenFragment6.l().getLayoutParams();
                layoutParams.getClass();
                ((CoordinatorLayout.f) layoutParams).b(z ? null : new AppBarLayout.ScrollingViewBehavior());
                screenFragment6.Z = z;
            }
            TextView textViewA = a.a(ac3Var);
            int i = this.d0;
            if (i != 0) {
                ac3Var.setTitleTextColor(i);
            }
            if (textViewA != null) {
                String str2 = this.e0;
                if (str2 != null || this.h0 > 0) {
                    int i2 = this.h0;
                    AssetManager assets = getContext().getAssets();
                    assets.getClass();
                    textViewA.setTypeface(qpc.a(null, 0, i2, str2, assets));
                }
                float f = this.g0;
                if (f > 0.0f) {
                    textViewA.setTextSize(f);
                }
            }
            Integer num = this.i0;
            if (num != null) {
                ac3Var.setBackgroundColor(num.intValue());
            }
            if (this.o0 != 0 && (navigationIcon = ac3Var.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.o0, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = ac3Var.getChildCount() - 1; -1 < childCount; childCount--) {
                if (ac3Var.getChildAt(childCount) instanceof g) {
                    ac3Var.removeViewAt(childCount);
                }
            }
            ArrayList<g> arrayList = this.V;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = arrayList.get(i3);
                gVar.getClass();
                g gVar2 = gVar;
                g.a type = gVar2.getType();
                if (type == g.a.d) {
                    View childAt = gVar2.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        m6.m("Back button header config view should have Image as first child");
                        return;
                    }
                    aVarY.q(imageView.getDrawable());
                } else {
                    Toolbar.g gVar3 = new Toolbar.g(-1);
                    int iOrdinal = type.ordinal();
                    if (iOrdinal == 0) {
                        if (!this.m0) {
                            ac3Var.setNavigationIcon((Drawable) null);
                        }
                        ac3Var.setTitle((CharSequence) null);
                        gVar3.a = 8388611;
                    } else if (iOrdinal == 1) {
                        ((ViewGroup.MarginLayoutParams) gVar3).width = -1;
                        gVar3.a = 1;
                        ac3Var.setTitle((CharSequence) null);
                    } else if (iOrdinal == 2) {
                        gVar3.a = 8388613;
                    }
                    gVar2.setLayoutParams(gVar3);
                    ac3Var.addView(gVar2);
                }
            }
        }
    }

    public final int getConfigSubviewsCount() {
        return this.V.size();
    }

    @Override // defpackage.rnc
    public qeb getPointerEvents() {
        return this.f.a;
    }

    public final int getPreferredContentInsetEnd() {
        return this.q0;
    }

    public final int getPreferredContentInsetStart() {
        return this.q0;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.t0) {
            return 0;
        }
        return this.r0;
    }

    public final e getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof com.swmansion.rnscreens.a)) {
            return null;
        }
        Fragment fragment = ((com.swmansion.rnscreens.a) parent).getFragment();
        if (fragment instanceof e) {
            return (e) fragment;
        }
        return null;
    }

    public final ac3 getToolbar() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p0 = true;
        int iH = dmc.h(this);
        Context context = getContext();
        context.getClass();
        EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new qg6(iH, getId(), 0));
        }
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p0 = false;
        int iH = dmc.h(this);
        Context context = getContext();
        context.getClass();
        EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new tg6(iH, getId(), 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setBackButtonInCustomView(boolean z) {
        this.m0 = z;
    }

    public final void setBackgroundColor(Integer num) {
        this.i0 = num;
    }

    public final void setDirection(String str) {
        this.f0 = str;
    }

    public final void setHeaderHidden(boolean z) {
        this.a0 = z;
    }

    public final void setHeaderTranslucent(boolean z) {
        this.b0 = z;
    }

    public final void setHidden(boolean z) {
        this.a0 = z;
    }

    public final void setHideBackButton(boolean z) {
        this.j0 = z;
    }

    public final void setHideShadow(boolean z) {
        this.k0 = z;
    }

    public final void setTintColor(int i) {
        this.o0 = i;
    }

    public final void setTitle(String str) {
        this.c0 = str;
    }

    public final void setTitleColor(int i) {
        this.d0 = i;
    }

    public final void setTitleEmpty(boolean z) {
        this.t0 = z;
    }

    public final void setTitleFontFamily(String str) {
        this.e0 = str;
    }

    public final void setTitleFontSize(float f) {
        this.g0 = f;
    }

    public final void setTitleFontWeight(String str) {
        this.h0 = qpc.d(str);
    }

    public final void setTopInsetEnabled(boolean z) {
        this.n0 = z;
    }

    public final void setTranslucent(boolean z) {
        this.b0 = z;
    }
}
