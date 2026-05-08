package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.modules.core.a;
import com.swmansion.rnscreens.a;
import defpackage.j6g;
import defpackage.l5;
import defpackage.mkf;
import defpackage.r6;
import defpackage.rqd;
import defpackage.sqd;
import defpackage.ur5;
import defpackage.v40;
import defpackage.wnc;
import defpackage.z84;
import defpackage.z92;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b extends ViewGroup {
    public sqd V;
    public final ArrayList<sqd> a;
    public FragmentManager b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final a f;

    public static final class a implements Choreographer.FrameCallback {
        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            b bVar = b.this;
            bVar.e = false;
            bVar.measure(View.MeasureSpec.makeMeasureSpec(bVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(bVar.getHeight(), 1073741824));
            bVar.layout(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
        }
    }

    public b(Context context) {
        super(context);
        this.a = new ArrayList<>();
        this.f = new a();
    }

    private final void setFragmentManager(FragmentManager fragmentManager) {
        this.b = fragmentManager;
        this.d = true;
        g();
    }

    public sqd a(com.swmansion.rnscreens.a aVar) {
        aVar.getClass();
        return new rqd(aVar);
    }

    public final androidx.fragment.app.a b() {
        FragmentManager fragmentManager = this.b;
        if (fragmentManager == null) {
            l5.q("fragment manager is null when creating transaction");
            return null;
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.p = true;
        return aVar;
    }

    public boolean c(sqd sqdVar) {
        return z92.I0(this.a, sqdVar);
    }

    public void d() {
        sqd fragmentWrapper;
        com.swmansion.rnscreens.a topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.p();
    }

    public final void e() {
        this.d = true;
        Context context = getContext();
        context.getClass();
        ((mkf) context).a.runOnUiQueueThread(new z84(this, 9));
    }

    public void f() {
        a.EnumC0194a enumC0194a;
        androidx.fragment.app.a aVarB = b();
        FragmentManager fragmentManager = this.b;
        if (fragmentManager == null) {
            l5.q("fragment manager is null when performing update in ScreenContainer");
            return;
        }
        HashSet hashSet = new HashSet(fragmentManager.c.f());
        ArrayList<sqd> arrayList = this.a;
        Iterator<sqd> it = arrayList.iterator();
        it.getClass();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0194a = a.EnumC0194a.a;
            if (!zHasNext) {
                break;
            }
            sqd next = it.next();
            next.getClass();
            sqd sqdVar = next;
            if (sqdVar.l().getActivityState() == enumC0194a && sqdVar.g().isAdded()) {
                aVarB.l(sqdVar.g());
            }
            hashSet.remove(sqdVar.g());
        }
        boolean z = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof rqd) && ((rqd) fragment).l().getContainer() == null) {
                    aVarB.l(fragment);
                }
            }
        }
        boolean z2 = getTopScreen() == null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<sqd> it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            sqd next2 = it2.next();
            next2.getClass();
            sqd sqdVar2 = next2;
            a.EnumC0194a activityState = sqdVar2.l().getActivityState();
            if (activityState != enumC0194a && !sqdVar2.g().isAdded()) {
                aVarB.d(getId(), sqdVar2.g(), null, 1);
                z = true;
            } else if (activityState != enumC0194a && z) {
                aVarB.l(sqdVar2.g());
                arrayList2.add(sqdVar2);
            }
            sqdVar2.l().setTransitioning(z2);
        }
        Iterator it3 = arrayList2.iterator();
        it3.getClass();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            next3.getClass();
            aVarB.d(getId(), ((sqd) next3).g(), null, 1);
        }
        aVarB.j();
    }

    public final void g() {
        FragmentManager fragmentManager;
        if (!this.d || !this.c || (fragmentManager = this.b) == null || fragmentManager.I) {
            return;
        }
        this.d = false;
        f();
        d();
    }

    public final int getScreenCount() {
        return this.a.size();
    }

    public com.swmansion.rnscreens.a getTopScreen() {
        sqd next;
        Iterator<sqd> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.l().getActivityState() == a.EnumC0194a.c) {
                break;
            }
        }
        sqd sqdVar = next;
        if (sqdVar != null) {
            return sqdVar.l();
        }
        return null;
    }

    public void h() {
        ArrayList<sqd> arrayList = this.a;
        Iterator<sqd> it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            sqd next = it.next();
            next.getClass();
            next.l().setContainer(null);
        }
        arrayList.clear();
        e();
    }

    public void i(int i) {
        ArrayList<sqd> arrayList = this.a;
        arrayList.get(i).l().setContainer(null);
        arrayList.remove(i);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        boolean z2;
        FragmentManager fragmentManagerU;
        j6g j6gVar;
        super.onAttachedToWindow();
        this.c = true;
        ViewParent parent = this;
        while (true) {
            z = parent instanceof wnc;
            if (z || (parent instanceof ur5) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            parent.getClass();
        }
        if (parent instanceof com.swmansion.rnscreens.a) {
            sqd fragmentWrapper = ((com.swmansion.rnscreens.a) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.V = fragmentWrapper;
                fragmentWrapper.o(this);
                FragmentManager childFragmentManager = fragmentWrapper.g().getChildFragmentManager();
                childFragmentManager.getClass();
                setFragmentManager(childFragmentManager);
                j6gVar = j6g.a;
            } else {
                j6gVar = null;
            }
            if (j6gVar != null) {
                return;
            }
            r6.g("Parent Screen does not have its Fragment attached");
            return;
        }
        if (parent instanceof ur5) {
            Fragment associatedFragment = ((ur5) parent).getAssociatedFragment();
            if (associatedFragment == null) {
                v40.o("[RNScreens] Parent ", parent, " returned nullish fragment");
                return;
            }
            FragmentManager childFragmentManager2 = associatedFragment.getChildFragmentManager();
            childFragmentManager2.getClass();
            setFragmentManager(childFragmentManager2);
            return;
        }
        if (!z) {
            r6.g("ScreenContainer is not attached under ReactRootView");
            return;
        }
        wnc wncVar = (wnc) parent;
        Context context = wncVar.getContext();
        while (true) {
            z2 = context instanceof androidx.fragment.app.g;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (!z2) {
            r6.g("In order to use RNScreens components your app's activity need to extend ReactActivity");
            return;
        }
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) context;
        if (gVar.u().c.f().isEmpty()) {
            fragmentManagerU = gVar.u();
            fragmentManagerU.getClass();
        } else {
            try {
                fragmentManagerU = FragmentManager.B(wncVar).getChildFragmentManager();
                fragmentManagerU.getClass();
            } catch (IllegalStateException unused) {
                fragmentManagerU = gVar.u();
                fragmentManagerU.getClass();
            }
        }
        setFragmentManager(fragmentManagerU);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.b;
        if (fragmentManager != null && !fragmentManager.I) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            boolean z = false;
            for (Fragment fragment : fragmentManager.c.f()) {
                if ((fragment instanceof rqd) && ((rqd) fragment).l().getContainer() == this) {
                    aVar.l(fragment);
                    z = true;
                }
            }
            if (z) {
                aVar.j();
            }
            fragmentManager.x(true);
            fragmentManager.F();
        }
        sqd sqdVar = this.V;
        if (sqdVar != null) {
            sqdVar.t(this);
        }
        this.V = null;
        super.onDetachedFromWindow();
        this.c = false;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            removeViewAt(childCount);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        a aVar;
        super.requestLayout();
        if (this.e || (aVar = this.f) == null) {
            return;
        }
        this.e = true;
        com.facebook.react.modules.core.a aVar2 = com.facebook.react.modules.core.a.f;
        if (aVar2 != null) {
            aVar2.b(a.EnumC0132a.b, aVar);
        } else {
            r6.g("ReactChoreographer needs to be initialized.");
        }
    }
}
