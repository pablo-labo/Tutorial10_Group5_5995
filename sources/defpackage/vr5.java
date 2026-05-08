package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.cp6;
import defpackage.fyb;
import defpackage.kv8;
import defpackage.ot0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class vr5 extends RecyclerView.e<ns5> implements wse {
    public final kv8 d;
    public final FragmentManager e;
    public final r59<Fragment> f;
    public final r59<Fragment.SavedState> g;
    public final r59<Integer> h;
    public d i;
    public final c j;
    public boolean k;
    public boolean l;

    public class a implements uv8 {
        public final /* synthetic */ ns5 a;

        public a(ns5 ns5Var) {
            this.a = ns5Var;
        }

        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            vr5 vr5Var = vr5.this;
            if (vr5Var.e.O()) {
                return;
            }
            zv8Var.getLifecycle().c(this);
            ns5 ns5Var = this.a;
            FrameLayout frameLayout = (FrameLayout) ns5Var.a;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (frameLayout.isAttachedToWindow()) {
                vr5Var.r(ns5Var);
            }
        }
    }

    public static abstract class b extends RecyclerView.g {
        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i) {
            a();
        }
    }

    public static class c {
        public CopyOnWriteArrayList a;

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e.b) it.next()).getClass();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.a);
            }
            return arrayList;
        }
    }

    public class d {
        public zr5 a;
        public as5 b;
        public bs5 c;
        public ViewPager2 d;
        public long e = -1;

        public d() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            bg.n(parent, "Expected ViewPager2 instance. Got: ");
            return null;
        }

        public final void b(boolean z) {
            int currentItem;
            Fragment fragmentD;
            vr5 vr5Var = vr5.this;
            c cVar = vr5Var.j;
            r59<Fragment> r59Var = vr5Var.f;
            FragmentManager fragmentManager = vr5Var.e;
            if (fragmentManager.O() || this.d.getScrollState() != 0 || r59Var.f() || vr5Var.c() == 0 || (currentItem = this.d.getCurrentItem()) >= vr5Var.c()) {
                return;
            }
            long j = currentItem;
            if ((j != this.e || z) && (fragmentD = r59Var.d(j)) != null && fragmentD.isAdded()) {
                this.e = j;
                fragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                ArrayList<List> arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i = 0; i < r59Var.j(); i++) {
                    long jG = r59Var.g(i);
                    Fragment fragmentK = r59Var.k(i);
                    if (fragmentK.isAdded()) {
                        if (jG != this.e) {
                            aVar.m(fragmentK, kv8.b.d);
                            arrayList.add(cVar.a());
                        } else {
                            fragment = fragmentK;
                        }
                        fragmentK.setMenuVisibility(jG == this.e);
                    }
                }
                if (fragment != null) {
                    aVar.m(fragment, kv8.b.e);
                    arrayList.add(cVar.a());
                }
                if (aVar.a.isEmpty()) {
                    return;
                }
                aVar.i();
                Collections.reverse(arrayList);
                for (List list : arrayList) {
                    cVar.getClass();
                    c.b(list);
                }
            }
        }
    }

    public static abstract class e {
        public static final a a = new a();

        public class a implements b {
        }

        public interface b {
        }
    }

    public vr5(IanMainFragment ianMainFragment) {
        FragmentManager childFragmentManager = ianMainFragment.getChildFragmentManager();
        kv8 lifecycle = ianMainFragment.getLifecycle();
        this.f = new r59<>();
        this.g = new r59<>();
        this.h = new r59<>();
        c cVar = new c();
        cVar.a = new CopyOnWriteArrayList();
        this.j = cVar;
        this.k = false;
        this.l = false;
        this.e = childFragmentManager;
        this.d = lifecycle;
        if (this.a.a()) {
            r6.g("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.b = true;
    }

    public static void n(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            r6.g("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // defpackage.wse
    public final Bundle a() {
        r59<Fragment> r59Var = this.f;
        int iJ = r59Var.j();
        r59<Fragment.SavedState> r59Var2 = this.g;
        Bundle bundle = new Bundle(r59Var2.j() + iJ);
        for (int i = 0; i < r59Var.j(); i++) {
            long jG = r59Var.g(i);
            Fragment fragmentD = r59Var.d(jG);
            if (fragmentD != null && fragmentD.isAdded()) {
                this.e.U(bundle, r6.c(jG, "f#"), fragmentD);
            }
        }
        for (int i2 = 0; i2 < r59Var2.j(); i2++) {
            long jG2 = r59Var2.g(i2);
            if (o(jG2)) {
                bundle.putParcelable(r6.c(jG2, "s#"), r59Var2.d(jG2));
            }
        }
        return bundle;
    }

    @Override // defpackage.wse
    public final void b(Parcelable parcelable) {
        r59<Fragment.SavedState> r59Var = this.g;
        if (r59Var.f()) {
            r59<Fragment> r59Var2 = this.f;
            if (r59Var2.f()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long j = Long.parseLong(str.substring(2));
                        FragmentManager fragmentManager = this.e;
                        fragmentManager.getClass();
                        String string = bundle.getString(str);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment fragmentB = fragmentManager.c.b(string);
                            if (fragmentB == null) {
                                fragmentManager.h0(new IllegalStateException(t40.l("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                            fragment = fragmentB;
                        }
                        r59Var2.h(fragment, j);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            l5.q("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long j2 = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (o(j2)) {
                            r59Var.h(savedState, j2);
                        }
                    }
                }
                if (r59Var2.f()) {
                    return;
                }
                this.l = true;
                this.k = true;
                p();
                Handler handler = new Handler(Looper.getMainLooper());
                xr5 xr5Var = new xr5(this, 0);
                this.d.a(new yr5(handler, xr5Var));
                handler.postDelayed(xr5Var, 10000L);
                return;
            }
        }
        r6.g("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long d(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void f(RecyclerView recyclerView) {
        if (this.i != null) {
            o6.h();
            return;
        }
        d dVar = new d();
        this.i = dVar;
        dVar.d = d.a(recyclerView);
        zr5 zr5Var = new zr5(dVar);
        dVar.a = zr5Var;
        dVar.d.c.a.add(zr5Var);
        as5 as5Var = new as5(dVar);
        dVar.b = as5Var;
        this.a.registerObserver(as5Var);
        bs5 bs5Var = new bs5(dVar);
        dVar.c = bs5Var;
        this.d.a(bs5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.b0 b0Var, int i) {
        Fragment qj6Var;
        Fragment aVar;
        ns5 ns5Var = (ns5) b0Var;
        long j = ns5Var.e;
        FrameLayout frameLayout = (FrameLayout) ns5Var.a;
        int id = frameLayout.getId();
        Long lQ = q(id);
        r59<Integer> r59Var = this.h;
        if (lQ != null && lQ.longValue() != j) {
            s(lQ.longValue());
            r59Var.i(lQ.longValue());
        }
        r59Var.h(Integer.valueOf(id), j);
        long j2 = i;
        r59<Fragment> r59Var2 = this.f;
        if (r59Var2.e(j2) < 0) {
            dd4 dd4Var = dd4.a;
            boolean zF = dd4.f();
            IanInitialState ianInitialState = ((cp6.a) this).m;
            if (zF) {
                List<xj1> list = dd4.g() ? ep6.b : ep6.a;
                if (i < 0 || i >= list.size()) {
                    throw new ArrayIndexOutOfBoundsException(p6.c(i, "position="));
                }
                xj1 xj1Var = list.get(i);
                Function1<IanInitialState, Fragment> function1 = ep6.c.get(xj1Var);
                if (function1 == null) {
                    v40.n(xj1Var, "Expected a generator for ");
                    return;
                }
                qj6Var = function1.invoke(ianInitialState);
            } else {
                switch (i) {
                    case 0:
                        boolean z = pyd.h0;
                        xj1 xj1Var2 = xj1.b;
                        if (z && !u63.a0(-1, 0, 1, 2).contains(Integer.valueOf(((kr7) cr8.p(kr7.class)).e("rnhp_parent_test").a))) {
                            qj6Var = new ej6();
                            Bundle bundle = new Bundle();
                            if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1Var2) {
                                bundle.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                            }
                            qj6Var.setArguments(bundle);
                        } else {
                            qj6Var = new qj6();
                            Bundle bundle2 = new Bundle();
                            if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1Var2) {
                                bundle2.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                            }
                            qj6Var.setArguments(bundle2);
                        }
                        break;
                    case 1:
                        boolean zN = ygg.n();
                        xj1 xj1Var3 = xj1.c;
                        if (zN) {
                            String initialUrl = (ianInitialState == null || ianInitialState.getInitialTab() != xj1Var3) ? null : ianInitialState.getInitialUrl();
                            ArrayList arrayList = lz2.a;
                            lz2.d("IanMainController", "Creating RN MyJobs fragment, initialUrl=" + initialUrl, false, null);
                            zo6 zo6Var = zo6.a;
                            zo6Var.getClass();
                            String strC = zo6Var.c(xj1Var3);
                            aVar = new com.indeed.android.rnmyjobs.a();
                            Bundle bundleE = l6.e("arg_myjobs_url", strC);
                            if (initialUrl != null) {
                                bundleE.putString("arg_initial_url", initialUrl);
                            }
                            aVar.setArguments(bundleE);
                            qj6Var = aVar;
                        } else if (!i6a.j()) {
                            ArrayList arrayList2 = lz2.a;
                            lz2.d("IanMainController", "Creating Web MyJobs fragment", false, null);
                            qj6Var = new b8a();
                            Bundle bundle3 = new Bundle();
                            if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1Var3) {
                                bundle3.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                            }
                            qj6Var.setArguments(bundle3);
                        } else {
                            ArrayList arrayList3 = lz2.a;
                            lz2.d("IanMainController", "Creating Native MyJobs fragment", false, null);
                            zo6 zo6Var2 = zo6.a;
                            zo6Var2.getClass();
                            String strC2 = zo6Var2.c(xj1Var3);
                            i5a i5aVar = new i5a();
                            Bundle bundleE2 = l6.e("KEY_HOME_URL", strC2);
                            if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1Var3) {
                                bundleE2.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                            }
                            i5aVar.setArguments(bundleE2);
                            qj6Var = i5aVar;
                        }
                        break;
                    case 2:
                        if (!((h2g) cr8.p(h2g.class)).h()) {
                            qj6Var = new Fragment();
                        } else if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.W && ianInitialState.getInitialUrl() != null) {
                            String initialUrl2 = ianInitialState.getInitialUrl();
                            xac xacVar = new xac();
                            if (initialUrl2 != null) {
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("initialUrl", initialUrl2);
                                xacVar.setArguments(bundle4);
                            }
                            qj6Var = xacVar;
                        } else {
                            qj6Var = new xac();
                        }
                        break;
                    case 3:
                        xj1 xj1Var4 = xj1.d;
                        String initialUrl3 = (ianInitialState == null || ianInitialState.getInitialTab() != xj1Var4) ? null : ianInitialState.getInitialUrl();
                        int i2 = ((kr7) cr8.p(kr7.class)).e("droid_rn_messaging").a;
                        if (pyd.h0 && i2 >= 1) {
                            boolean z2 = w8c.c;
                            String strA = dd4Var.a();
                            aVar = new hed();
                            aVar.setArguments(aq1.a(new Pair("initialUrl", initialUrl3), new Pair("underQaAutomation", Boolean.valueOf(z2)), new Pair("proctorGroups", strA)));
                        } else if (dd4.i()) {
                            vg vgVar = new vg(17);
                            rx9 rx9Var = new rx9(0);
                            vgVar.invoke(rx9Var);
                            mh2.o(rx9Var);
                            String strA2 = dd4Var.a();
                            boolean z3 = w8c.c;
                            aVar = new dr9();
                            aVar.setArguments(aq1.a(new Pair("initialUrl", initialUrl3), new Pair("proctorLoggingString", strA2), new Pair("underQaAutomation", Boolean.valueOf(z3))));
                        } else {
                            aVar = new bq9();
                            Bundle bundle5 = new Bundle();
                            if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1Var4) {
                                bundle5.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                            }
                            aVar.setArguments(bundle5);
                        }
                        qj6Var = aVar;
                        break;
                    case 4:
                        ((kq7) cr8.p(kq7.class)).e("Profile", "IsNativeProfileInitialized", false);
                        bu8 bu8Var = bu8.a;
                        if (!bu8Var.i() || !dd4.j() || ((((kr7) cr8.p(kr7.class)).e("jsj_crowtaxo_holdout_tst").a != 1 || ((kr7) cr8.p(kr7.class)).e("droid_rich_profile_tst").a < 2) && !c0h.E())) {
                            ArrayList arrayList4 = lz2.a;
                            lz2.d("IanMainController", "User not logged in or Native Profile test inactive, initializing webview profile", false, null);
                            int i3 = fyb.n0;
                            qj6Var = fyb.a.a(ianInitialState);
                        } else if (!((Boolean) bu8.H0.a(bu8.b[45], bu8Var)).booleanValue()) {
                            ArrayList arrayList5 = lz2.a;
                            lz2.d("IanMainController", "Native Profile test active, but user has not data merged, initializing webview profile", false, null);
                            int i4 = fyb.n0;
                            qj6Var = fyb.a.a(ianInitialState);
                        } else {
                            ArrayList arrayList6 = lz2.a;
                            lz2.d("IanMainController", "Data merged user, initializing Native Profile", false, null);
                            ((kq7) cr8.p(kq7.class)).e("Profile", "IsNativeProfileInitialized", true);
                            qj6Var = new crb();
                        }
                        break;
                    case 5:
                        qj6Var = new fma();
                        break;
                    case 6:
                        if (!((h2g) cr8.p(h2g.class)).a()) {
                            qj6Var = new Fragment();
                        } else {
                            qj6Var = new mud();
                            Bundle bundle6 = new Bundle();
                            if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.V) {
                                bundle6.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                            }
                            qj6Var.setArguments(bundle6);
                        }
                        break;
                    default:
                        throw new ArrayIndexOutOfBoundsException(p6.c(i, "position="));
                }
            }
            qj6Var.setInitialSavedState(this.g.d(j2));
            r59Var2.h(qj6Var, j2);
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (frameLayout.isAttachedToWindow()) {
            r(ns5Var);
        }
        p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        int i2 = ns5.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, prg> weakHashMap = epg.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new ns5(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void i(RecyclerView recyclerView) {
        d dVar = this.i;
        dVar.getClass();
        ViewPager2 viewPager2A = d.a(recyclerView);
        viewPager2A.c.a.remove(dVar.a);
        vr5 vr5Var = vr5.this;
        vr5Var.a.unregisterObserver(dVar.b);
        vr5Var.d.c(dVar.c);
        dVar.d = null;
        this.i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final /* bridge */ /* synthetic */ boolean j(RecyclerView.b0 b0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void k(RecyclerView.b0 b0Var) {
        r((ns5) b0Var);
        p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void m(RecyclerView.b0 b0Var) {
        Long lQ = q(((FrameLayout) ((ns5) b0Var).a).getId());
        if (lQ != null) {
            s(lQ.longValue());
            this.h.i(lQ.longValue());
        }
    }

    public final boolean o(long j) {
        return j >= 0 && j < ((long) c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        r59<Fragment> r59Var;
        r59<Integer> r59Var2;
        Fragment fragmentD;
        View view;
        if (!this.l || this.e.O()) {
            return;
        }
        ot0 ot0Var = new ot0(0);
        int i = 0;
        while (true) {
            r59Var = this.f;
            int iJ = r59Var.j();
            r59Var2 = this.h;
            if (i >= iJ) {
                break;
            }
            long jG = r59Var.g(i);
            if (!o(jG)) {
                ot0Var.add(Long.valueOf(jG));
                r59Var2.i(jG);
            }
            i++;
        }
        if (!this.k) {
            this.l = false;
            for (int i2 = 0; i2 < r59Var.j(); i2++) {
                long jG2 = r59Var.g(i2);
                if (r59Var2.e(jG2) < 0 && ((fragmentD = r59Var.d(jG2)) == null || (view = fragmentD.getView()) == null || view.getParent() == null)) {
                    ot0Var.add(Long.valueOf(jG2));
                }
            }
        }
        ot0.a aVar = new ot0.a();
        while (aVar.hasNext()) {
            s(((Long) aVar.next()).longValue());
        }
    }

    public final Long q(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            r59<Integer> r59Var = this.h;
            if (i2 >= r59Var.j()) {
                return lValueOf;
            }
            if (r59Var.k(i2).intValue() == i) {
                if (lValueOf != null) {
                    r6.g("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(r59Var.g(i2));
            }
            i2++;
        }
    }

    public final void r(ns5 ns5Var) {
        Fragment fragmentD = this.f.d(ns5Var.e);
        if (fragmentD == null) {
            r6.g("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ns5Var.a;
        View view = fragmentD.getView();
        if (!fragmentD.isAdded() && view != null) {
            r6.g("Design assumption violated.");
            return;
        }
        boolean zIsAdded = fragmentD.isAdded();
        FragmentManager fragmentManager = this.e;
        if (zIsAdded && view == null) {
            fragmentManager.n.a.add(new k.a(new wr5(this, fragmentD, frameLayout), false));
            return;
        }
        if (fragmentD.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                n(view, frameLayout);
                return;
            }
            return;
        }
        if (fragmentD.isAdded()) {
            n(view, frameLayout);
            return;
        }
        if (fragmentManager.O()) {
            if (fragmentManager.I) {
                return;
            }
            this.d.a(new a(ns5Var));
            return;
        }
        fragmentManager.n.a.add(new k.a(new wr5(this, fragmentD, frameLayout), false));
        c cVar = this.j;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            arrayList.add(e.a);
        }
        try {
            fragmentD.setMenuVisibility(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.d(0, fragmentD, "f" + ns5Var.e, 1);
            aVar.m(fragmentD, kv8.b.d);
            aVar.i();
            this.i.b(false);
        } finally {
            c.b(arrayList);
        }
    }

    public final void s(long j) {
        ViewParent parent;
        r59<Fragment> r59Var = this.f;
        Fragment fragmentD = r59Var.d(j);
        if (fragmentD == null) {
            return;
        }
        if (fragmentD.getView() != null && (parent = fragmentD.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zO = o(j);
        r59<Fragment.SavedState> r59Var2 = this.g;
        if (!zO) {
            r59Var2.i(j);
        }
        if (!fragmentD.isAdded()) {
            r59Var.i(j);
            return;
        }
        FragmentManager fragmentManager = this.e;
        if (fragmentManager.O()) {
            this.l = true;
            return;
        }
        boolean zIsAdded = fragmentD.isAdded();
        e.a aVar = e.a;
        c cVar = this.j;
        if (zIsAdded && o(j)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(aVar);
            }
            Fragment.SavedState savedStateZ = fragmentManager.Z(fragmentD);
            c.b(arrayList);
            r59Var2.h(savedStateZ, j);
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cVar.a.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).getClass();
            arrayList2.add(aVar);
        }
        try {
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
            aVar2.l(fragmentD);
            aVar2.i();
            r59Var.i(j);
        } finally {
            c.b(arrayList2);
        }
    }
}
