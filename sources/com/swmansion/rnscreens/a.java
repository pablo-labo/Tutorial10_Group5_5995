package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.c;
import defpackage.dee;
import defpackage.dmc;
import defpackage.iee;
import defpackage.k20;
import defpackage.knc;
import defpackage.mkf;
import defpackage.nf7;
import defpackage.pqd;
import defpackage.r6;
import defpackage.sqd;
import defpackage.sy3;
import defpackage.u63;
import defpackage.ug6;
import defpackage.ur5;
import defpackage.x55;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class a extends x55 implements c.a, ur5 {
    public com.swmansion.rnscreens.b V;
    public EnumC0194a W;
    public boolean a0;
    public d b0;
    public b c0;
    public c d0;
    public final mkf e;
    public Integer e0;
    public sqd f;
    public String f0;
    public Boolean g0;
    public boolean h0;
    public boolean i0;
    public float j0;
    public boolean k0;
    public List<Double> l0;
    public int m0;
    public int n0;
    public boolean o0;
    public float p0;
    public boolean q0;
    public pqd r0;
    public String s0;
    public Boolean t0;
    public Boolean u0;
    public Integer v0;
    public Integer w0;
    public Boolean x0;
    public Boolean y0;
    public boolean z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.a$a, reason: collision with other inner class name */
    public static final class EnumC0194a {
        public static final EnumC0194a a;
        public static final EnumC0194a b;
        public static final EnumC0194a c;
        public static final /* synthetic */ EnumC0194a[] d;

        static {
            EnumC0194a enumC0194a = new EnumC0194a("INACTIVE", 0);
            a = enumC0194a;
            EnumC0194a enumC0194a2 = new EnumC0194a("TRANSITIONING_OR_BELOW_TOP", 1);
            b = enumC0194a2;
            EnumC0194a enumC0194a3 = new EnumC0194a("ON_TOP", 2);
            c = enumC0194a3;
            d = new EnumC0194a[]{enumC0194a, enumC0194a2, enumC0194a3};
        }

        public EnumC0194a() {
            throw null;
        }

        public static EnumC0194a valueOf(String str) {
            return (EnumC0194a) Enum.valueOf(EnumC0194a.class, str);
        }

        public static EnumC0194a[] values() {
            return (EnumC0194a[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("PUSH", 0);
            a = bVar;
            b bVar2 = new b("POP", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c V;
        public static final c W;
        public static final c X;
        public static final /* synthetic */ c[] Y;
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;

        static {
            c cVar = new c("DEFAULT", 0);
            a = cVar;
            c cVar2 = new c("NONE", 1);
            b = cVar2;
            c cVar3 = new c("FADE", 2);
            c = cVar3;
            c cVar4 = new c("SLIDE_FROM_BOTTOM", 3);
            d = cVar4;
            c cVar5 = new c("SLIDE_FROM_RIGHT", 4);
            e = cVar5;
            c cVar6 = new c("SLIDE_FROM_LEFT", 5);
            f = cVar6;
            c cVar7 = new c("FADE_FROM_BOTTOM", 6);
            V = cVar7;
            c cVar8 = new c("IOS_FROM_RIGHT", 7);
            W = cVar8;
            c cVar9 = new c("IOS_FROM_LEFT", 8);
            X = cVar9;
            Y = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) Y.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final /* synthetic */ d[] e;

        static {
            d dVar = new d("PUSH", 0);
            a = dVar;
            d dVar2 = new d("MODAL", 1);
            b = dVar2;
            d dVar3 = new d("TRANSPARENT_MODAL", 2);
            c = dVar3;
            d dVar4 = new d("FORM_SHEET", 3);
            d = dVar4;
            e = new d[]{dVar, dVar2, dVar3, dVar4};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final e V;
        public static final e W;
        public static final e X;
        public static final /* synthetic */ e[] Y;
        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        public static final e e;
        public static final e f;

        static {
            e eVar = new e("ORIENTATION", 0);
            a = eVar;
            e eVar2 = new e("COLOR", 1);
            b = eVar2;
            e eVar3 = new e("STYLE", 2);
            c = eVar3;
            e eVar4 = new e("TRANSLUCENT", 3);
            d = eVar4;
            e eVar5 = new e("HIDDEN", 4);
            e = eVar5;
            e eVar6 = new e("ANIMATED", 5);
            f = eVar6;
            e eVar7 = new e("NAVIGATION_BAR_COLOR", 6);
            V = eVar7;
            e eVar8 = new e("NAVIGATION_BAR_TRANSLUCENT", 7);
            W = eVar8;
            e eVar9 = new e("NAVIGATION_BAR_HIDDEN", 8);
            X = eVar9;
            Y = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) Y.clone();
        }
    }

    public a(mkf mkfVar) {
        super(mkfVar);
        this.e = mkfVar;
        this.b0 = d.a;
        this.c0 = b.b;
        this.d0 = c.a;
        this.k0 = true;
        this.l0 = u63.d0(Double.valueOf(1.0d));
        this.m0 = -1;
        this.o0 = true;
        this.p0 = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.z0 = true;
    }

    public static void c(ViewGroup viewGroup) {
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                k20.o();
                return;
            }
            viewGroup.endViewTransition(childAt);
            if (childAt instanceof f) {
                c(((f) childAt).getToolbar());
            }
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt);
            }
            i = i2;
        }
    }

    public static boolean d(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && d((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    @sy3
    public static /* synthetic */ void getNavigationBarColor$annotations() {
    }

    @sy3
    public static /* synthetic */ void getStatusBarColor$annotations() {
    }

    @Override // com.swmansion.rnscreens.c.a
    public final void a(int i, int i2) {
        BottomSheetBehavior<a> sheetBehavior;
        int i3 = i2 - i;
        if (iee.b(this) && iee.a(this) && (sheetBehavior = getSheetBehavior()) != null) {
            sheetBehavior.E = true;
            sheetBehavior.D(true);
            sheetBehavior.H(3);
            sheetBehavior.k = i3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        sparseArray.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        sparseArray.getClass();
    }

    public final void e(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((viewGroup instanceof SwipeRefreshLayout) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof f) {
                    e(((f) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    e((ViewGroup) childAt);
                }
            }
        }
    }

    public final EnumC0194a getActivityState() {
        return this.W;
    }

    @Override // defpackage.ur5
    public Fragment getAssociatedFragment() {
        return getFragment();
    }

    public final com.swmansion.rnscreens.b getContainer() {
        return this.V;
    }

    public final com.swmansion.rnscreens.c getContentWrapper() {
        Object next;
        knc kncVar = new knc(this, 1);
        while (true) {
            if (!kncVar.hasNext()) {
                next = null;
                break;
            }
            next = kncVar.next();
            if (((View) next) instanceof com.swmansion.rnscreens.c) {
                break;
            }
        }
        if (next instanceof com.swmansion.rnscreens.c) {
            return (com.swmansion.rnscreens.c) next;
        }
        return null;
    }

    public final pqd getFooter() {
        return this.r0;
    }

    public final Fragment getFragment() {
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            return sqdVar.g();
        }
        return null;
    }

    public final sqd getFragmentWrapper() {
        return this.f;
    }

    public final f getHeaderConfig() {
        Object next;
        knc kncVar = new knc(this, 1);
        while (true) {
            if (!kncVar.hasNext()) {
                next = null;
                break;
            }
            next = kncVar.next();
            if (((View) next) instanceof f) {
                break;
            }
        }
        if (next instanceof f) {
            return (f) next;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.z0;
    }

    public final Integer getNavigationBarColor() {
        return this.w0;
    }

    public final mkf getReactContext() {
        return this.e;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return dmc.e(this.e, getId());
    }

    public final b getReplaceAnimation() {
        return this.c0;
    }

    public final String getScreenId() {
        return this.f0;
    }

    public final Integer getScreenOrientation() {
        return this.e0;
    }

    public final BottomSheetBehavior<a> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c cVar = fVar != null ? fVar.a : null;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.o0;
    }

    public final float getSheetCornerRadius() {
        return this.j0;
    }

    public final List<Double> getSheetDetents() {
        return this.l0;
    }

    public final float getSheetElevation() {
        return this.p0;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.k0;
    }

    public final int getSheetInitialDetentIndex() {
        return this.n0;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.m0;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.q0;
    }

    public final c getStackAnimation() {
        return this.d0;
    }

    public final d getStackPresentation() {
        return this.b0;
    }

    public final Integer getStatusBarColor() {
        return this.v0;
    }

    public final String getStatusBarStyle() {
        return this.s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Fragment fragment;
        dee deeVar;
        super.onAttachedToWindow();
        if (!iee.b(this) || (fragment = getFragment()) == null || (deeVar = ((com.swmansion.rnscreens.e) fragment).f0) == null) {
            return;
        }
        nf7 nf7Var = nf7.a;
        nf7.b.add(deeVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && (this.V instanceof com.swmansion.rnscreens.d) && !iee.b(this)) {
            b(i3 - i, i4 - i2, i2);
            Context context = getContext();
            context.getClass();
            ReactContext reactContext = (ReactContext) context;
            int iG = dmc.g(reactContext);
            EventDispatcher eventDispatcherE = dmc.e(reactContext, getId());
            if (eventDispatcherE != null) {
                eventDispatcherE.a(new ug6(iG, getId(), i2));
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (iee.b(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActivityState(EnumC0194a enumC0194a) {
        enumC0194a.getClass();
        EnumC0194a enumC0194a2 = this.W;
        if (enumC0194a == enumC0194a2) {
            return;
        }
        if ((this.V instanceof com.swmansion.rnscreens.d) && enumC0194a2 != null && enumC0194a.compareTo(enumC0194a2) < 0) {
            r6.g("[RNScreens] activityState can only progress in NativeStack");
            return;
        }
        this.W = enumC0194a;
        com.swmansion.rnscreens.b bVar = this.V;
        if (bVar != null) {
            bVar.d = true;
            bVar.g();
        }
    }

    public final void setBeingRemoved(boolean z) {
        this.h0 = z;
    }

    public final void setContainer(com.swmansion.rnscreens.b bVar) {
        this.V = bVar;
    }

    public final void setFooter(pqd pqdVar) {
        BottomSheetBehavior<a> sheetBehavior;
        if (pqdVar == null && this.r0 != null) {
            BottomSheetBehavior<a> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                pqd pqdVar2 = this.r0;
                pqdVar2.getClass();
                if (pqdVar2.f) {
                    sheetBehavior2.B(pqdVar2.V);
                    pqdVar2.f = false;
                }
            }
        } else if (pqdVar != null && (sheetBehavior = getSheetBehavior()) != null) {
            pqdVar.k(sheetBehavior);
        }
        this.r0 = pqdVar;
    }

    public final void setFragmentWrapper(sqd sqdVar) {
        this.f = sqdVar;
    }

    public final void setGestureEnabled(boolean z) {
    }

    @Override // android.view.View
    public final void setLayerType(int i, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z) {
        this.z0 = z;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            h.c = true;
        }
        this.w0 = num;
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            h.f(this, sqdVar.f());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            h.c = true;
        }
        this.y0 = bool;
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            h.g(this, sqdVar.f());
        }
    }

    public final void setNavigationBarTranslucent(Boolean bool) {
        if (bool != null) {
            h.c = true;
        }
        this.x0 = bool;
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            h.h(this, sqdVar.f());
        }
    }

    public final void setReplaceAnimation(b bVar) {
        bVar.getClass();
        this.c0 = bVar;
    }

    public final void setScreenId(String str) {
        this.f0 = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setScreenOrientation(String str) {
        Activity activityF;
        Integer screenOrientation;
        if (str == null) {
            this.e0 = null;
            return;
        }
        int i = 1;
        h.a = true;
        int iIntValue = -1;
        switch (str.hashCode()) {
            case -1894896954:
                i = !str.equals("portrait_down") ? -1 : 9;
                break;
            case 96673:
                i = !str.equals("all") ? -1 : 10;
                break;
            case 729267099:
                i = !str.equals("portrait") ? -1 : 7;
                break;
            case 1430647483:
                i = !str.equals("landscape") ? -1 : 6;
                break;
            case 1651658175:
                if (!str.equals("portrait_up")) {
                    i = -1;
                }
                break;
            case 1730732811:
                i = !str.equals("landscape_left") ? -1 : 8;
                break;
            case 2118770584:
                i = !str.equals("landscape_right") ? -1 : 0;
                break;
            default:
                i = -1;
                break;
        }
        this.e0 = Integer.valueOf(i);
        sqd sqdVar = this.f;
        if (sqdVar == null || (activityF = sqdVar.f()) == null) {
            return;
        }
        a aVarC = h.c(this, e.a);
        if (aVarC != null && (screenOrientation = aVarC.getScreenOrientation()) != null) {
            iIntValue = screenOrientation.intValue();
        }
        activityF.setRequestedOrientation(iIntValue);
    }

    public final void setSheetClosesOnTouchOutside(boolean z) {
        this.o0 = z;
    }

    public final void setSheetCornerRadius(float f) {
        if (this.j0 == f) {
            return;
        }
        this.j0 = f;
        this.i0 = true;
    }

    public final void setSheetDetents(List<Double> list) {
        list.getClass();
        this.l0 = list;
    }

    public final void setSheetElevation(float f) {
        this.p0 = f;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z) {
        this.k0 = z;
    }

    public final void setSheetGrabberVisible(boolean z) {
    }

    public final void setSheetInitialDetentIndex(int i) {
        this.n0 = i;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i) {
        this.m0 = i;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z) {
        this.q0 = z;
    }

    public final void setStackAnimation(c cVar) {
        cVar.getClass();
        this.d0 = cVar;
    }

    public final void setStackPresentation(d dVar) {
        dVar.getClass();
        this.b0 = dVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.g0 = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            h.b = true;
        }
        this.v0 = num;
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            h.d(this, sqdVar.f(), sqdVar.w());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            h.b = true;
        }
        this.t0 = bool;
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            h.e(this, sqdVar.f());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            h.b = true;
        }
        this.s0 = str;
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            h.i(this, sqdVar.f(), sqdVar.w());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            h.b = true;
        }
        this.u0 = bool;
        sqd sqdVar = this.f;
        if (sqdVar != null) {
            h.j(this, sqdVar.f(), sqdVar.w());
        }
    }

    public final void setTransitioning(boolean z) {
        if (this.a0 == z) {
            return;
        }
        this.a0 = z;
        boolean zD = d(this);
        if (!zD || getLayerType() == 2) {
            super.setLayerType((!z || zD) ? 0 : 2, null);
        }
    }
}
