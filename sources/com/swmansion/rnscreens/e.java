package com.swmansion.rnscreens;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.g;
import defpackage.b54;
import defpackage.br3;
import defpackage.dee;
import defpackage.dmc;
import defpackage.e55;
import defpackage.ece;
import defpackage.epg;
import defpackage.eqd;
import defpackage.he;
import defpackage.hgd;
import defpackage.hh2;
import defpackage.hzh;
import defpackage.ie7;
import defpackage.iee;
import defpackage.ird;
import defpackage.k0;
import defpackage.k1;
import defpackage.ka2;
import defpackage.mkf;
import defpackage.nf4;
import defpackage.nn2;
import defpackage.nzg;
import defpackage.or;
import defpackage.qb3;
import defpackage.ql5;
import defpackage.r6;
import defpackage.rqd;
import defpackage.rzg;
import defpackage.v71;
import defpackage.wl7;
import defpackage.wqd;
import defpackage.y44;
import defpackage.ze9;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/swmansion/rnscreens/e;", "Lrqd;", "Lwqd;", "<init>", "()V", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends rqd implements wqd {
    public static final /* synthetic */ int g0 = 0;
    public AppBarLayout W;
    public Toolbar X;
    public boolean Y;
    public boolean Z;
    public View a0;
    public qb3 b0;
    public k1 c0;
    public ird d0;
    public b54 e0;
    public dee f0;

    public static final class a extends nzg.b {
        @Override // nzg.b
        public final rzg d(rzg rzgVar, List<nzg> list) {
            rzgVar.getClass();
            list.getClass();
            return rzgVar;
        }
    }

    public e() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public final boolean H() {
        b container = l().getContainer();
        if (!(container instanceof d)) {
            r6.g("ScreenStackFragment added into a non-stack container");
            return false;
        }
        if (!wl7.b(((d) container).getRootScreen(), l())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof e) {
            return ((e) parentFragment).H();
        }
        return false;
    }

    public final void I() {
        b container = l().getContainer();
        if (!(container instanceof d)) {
            r6.g("ScreenStackFragment added into a non-stack container");
            return;
        }
        d dVar = (d) container;
        dVar.a0.add(this);
        dVar.d = true;
        dVar.g();
    }

    public final void J() {
        if (isRemoving() && isDetached()) {
            return;
        }
        mkf reactContext = l().getReactContext();
        int iG = dmc.g(reactContext);
        EventDispatcher eventDispatcherE = dmc.e(reactContext, l().getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new ql5(iG, l().getId(), 1));
        }
    }

    public final b54 K(boolean z) {
        b54 b54Var = this.e0;
        if (b54Var == null || z) {
            if (b54Var != null) {
                BottomSheetBehavior<com.swmansion.rnscreens.a> sheetBehavior = l().getSheetBehavior();
                b54.a aVar = b54Var.c;
                if (aVar != null && sheetBehavior != null) {
                    sheetBehavior.B(aVar);
                }
            }
            this.e0 = new b54(l().getReactContext(), l());
        }
        b54 b54Var2 = this.e0;
        b54Var2.getClass();
        return b54Var2;
    }

    public final void L(Menu menu) {
        menu.clear();
        f headerConfig = l().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig == null || configSubviewsCount <= 0) {
            return;
        }
        for (int i = 0; i < configSubviewsCount; i++) {
            g gVar = headerConfig.V.get(i);
            gVar.getClass();
            if (gVar.getType() == g.a.e) {
                Context context = getContext();
                if (this.b0 == null && context != null) {
                    qb3 qb3Var = new qb3(context, this);
                    this.b0 = qb3Var;
                    k1 k1Var = this.c0;
                    if (k1Var != null) {
                        k1Var.invoke(qb3Var);
                    }
                }
                MenuItem menuItemAdd = menu.add("");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(this.b0);
                return;
            }
        }
    }

    @Override // defpackage.rqd, defpackage.sqd
    public final boolean b() {
        int iOrdinal = l().b0.ordinal();
        return iOrdinal == 2 || iOrdinal == 3;
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        if (!iee.b(l())) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        final b54 b54VarK = K(false);
        int i3 = 2;
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, b54VarK.b);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tqd
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                    if (f != null) {
                        b54VarK.a.setAlpha(f.floatValue());
                    }
                }
            });
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new e55(new or(this, 20), new he(16)), Float.valueOf(l().getHeight()), Float.valueOf(0.0f));
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uqd
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                    if (f != null) {
                        this.a.l().setTranslationY(f.floatValue());
                    }
                }
            });
            AnimatorSet.Builder builderPlay = l().getSheetInitialDetentIndex() > l().getSheetLargestUndimmedDetentIndex() ? animatorSet.play(valueAnimatorOfObject) : null;
            if (builderPlay != null) {
                builderPlay.with(valueAnimatorOfFloat);
            }
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(b54VarK.a.getAlpha(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vqd
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                    if (f != null) {
                        b54VarK.a.setAlpha(f.floatValue());
                    }
                }
            });
            if (this.d0 == null) {
                wl7.g("coordinatorLayout");
                throw null;
            }
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, r1.getBottom() - l().getTop());
            valueAnimatorOfFloat3.addUpdateListener(new br3(this, i3));
            animatorSet.play(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
        }
        animatorSet.addListener(new eqd(this, new hzh(l()), z ? eqd.a.a : eqd.a.b));
        return animatorSet;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        L(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // defpackage.rqd, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer numValueOf;
        ColorStateList colorStateList;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.d0 = new ird(contextRequireContext, this);
        com.swmansion.rnscreens.a aVarL = l();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.b(iee.b(l()) ? new BottomSheetBehavior() : this.Z ? null : new AppBarLayout.ScrollingViewBehavior());
        aVarL.setLayoutParams(fVar);
        ird irdVar = this.d0;
        if (irdVar == null) {
            wl7.g("coordinatorLayout");
            throw null;
        }
        com.swmansion.rnscreens.a aVarL2 = l();
        hh2.B(aVarL2);
        irdVar.addView(aVarL2);
        if (iee.b(l())) {
            l().setClipToOutline(true);
            com.swmansion.rnscreens.a aVarL3 = l();
            float fG = nn2.G(aVarL3.getSheetCornerRadius());
            new hgd();
            new hgd();
            hgd hgdVar = new hgd();
            hgd hgdVar2 = new hgd();
            k0 k0Var = new k0(0.0f);
            k0 k0Var2 = new k0(0.0f);
            nf4 nf4Var = new nf4();
            nf4 nf4Var2 = new nf4();
            nf4 nf4Var3 = new nf4();
            nf4 nf4Var4 = new nf4();
            ie7 ie7VarU = ka2.u(0);
            k0 k0Var3 = new k0(fG);
            ie7 ie7VarU2 = ka2.u(0);
            k0 k0Var4 = new k0(fG);
            ece eceVar = new ece();
            eceVar.a = ie7VarU;
            eceVar.b = ie7VarU2;
            eceVar.c = hgdVar;
            eceVar.d = hgdVar2;
            eceVar.e = k0Var3;
            eceVar.f = k0Var4;
            eceVar.g = k0Var;
            eceVar.h = k0Var2;
            eceVar.i = nf4Var;
            eceVar.j = nf4Var2;
            eceVar.k = nf4Var3;
            eceVar.l = nf4Var4;
            ze9 ze9Var = new ze9(eceVar);
            Drawable background = aVarL3.getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                numValueOf = Integer.valueOf(colorDrawable.getColor());
            } else {
                Drawable background2 = aVarL3.getBackground();
                ze9 ze9Var2 = background2 instanceof ze9 ? (ze9) background2 : null;
                numValueOf = (ze9Var2 == null || (colorStateList = ze9Var2.a.e) == null) ? null : Integer.valueOf(colorStateList.getDefaultColor());
            }
            if (numValueOf == null) {
                c contentWrapper = aVarL3.getContentWrapper();
                numValueOf = contentWrapper == null ? null : v71.g(contentWrapper);
            }
            ze9Var.setTint(numValueOf != null ? numValueOf.intValue() : 0);
            aVarL3.setBackground(ze9Var);
            l().setElevation(l().getSheetElevation());
            if (this.f0 == null) {
                this.f0 = new dee(l());
            }
            dee deeVar = this.f0;
            deeVar.getClass();
            BottomSheetBehavior<com.swmansion.rnscreens.a> sheetBehavior = l().getSheetBehavior();
            sheetBehavior.getClass();
            dee.a(deeVar, sheetBehavior, null, 6);
            b54 b54VarK = K(true);
            float f = b54VarK.b;
            y44 y44Var = b54VarK.a;
            com.swmansion.rnscreens.a aVarL4 = l();
            ird irdVar2 = this.d0;
            if (irdVar2 == null) {
                wl7.g("coordinatorLayout");
                throw null;
            }
            irdVar2.addView(y44Var, 0);
            if (aVarL4.getSheetInitialDetentIndex() > aVarL4.getSheetLargestUndimmedDetentIndex()) {
                y44Var.setAlpha(f);
            } else {
                y44Var.setAlpha(0.0f);
            }
            com.swmansion.rnscreens.a aVarL5 = l();
            BottomSheetBehavior<com.swmansion.rnscreens.a> sheetBehavior2 = l().getSheetBehavior();
            sheetBehavior2.getClass();
            b54.a aVar = new b54.a(aVarL5, y44Var, f);
            b54VarK.c = aVar;
            sheetBehavior2.s(aVar);
            b container = l().getContainer();
            container.getClass();
            ird irdVar3 = this.d0;
            if (irdVar3 == null) {
                wl7.g("coordinatorLayout");
                throw null;
            }
            irdVar3.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            ird irdVar4 = this.d0;
            if (irdVar4 == null) {
                wl7.g("coordinatorLayout");
                throw null;
            }
            irdVar4.layout(0, 0, container.getWidth(), container.getHeight());
            epg.q(l(), new a(0));
        } else {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context, null);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.c());
            } else {
                appBarLayout = null;
            }
            this.W = appBarLayout;
            ird irdVar5 = this.d0;
            if (irdVar5 == null) {
                wl7.g("coordinatorLayout");
                throw null;
            }
            irdVar5.addView(appBarLayout);
            if (this.Y && (appBarLayout3 = this.W) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.X;
            if (toolbar != null && (appBarLayout2 = this.W) != null) {
                hh2.B(toolbar);
                appBarLayout2.addView(toolbar);
            }
            setHasOptionsMenu(true);
        }
        ird irdVar6 = this.d0;
        if (irdVar6 != null) {
            return irdVar6;
        }
        wl7.g("coordinatorLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        f headerConfig;
        menu.getClass();
        int iOrdinal = l().b0.ordinal();
        if ((iOrdinal != 2 && iOrdinal != 3) || ((headerConfig = l().getHeaderConfig()) != null && !headerConfig.a0)) {
            L(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        View view = this.a0;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        PackageManager packageManager;
        Context context = getContext();
        if (context != null && (packageManager = context.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
            View viewL = l();
            while (true) {
                if (viewL == null) {
                    viewL = null;
                    break;
                } else if (viewL.isFocused()) {
                    break;
                } else {
                    viewL = viewL instanceof ViewGroup ? ((ViewGroup) viewL).getFocusedChild() : null;
                }
            }
            this.a0 = viewL;
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
    }

    @Override // defpackage.rqd, defpackage.sqd
    public final void p() {
        super.p();
        f headerConfig = l().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.c();
        }
    }
}
