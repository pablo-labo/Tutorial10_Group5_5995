package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.n;
import androidx.fragment.app.FragmentManager.o;
import androidx.fragment.app.FragmentManager.p;
import androidx.fragment.app.i;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.fragment.a;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import defpackage.aq1;
import defpackage.brg;
import defpackage.ev5;
import defpackage.fwc;
import defpackage.goa;
import defpackage.gu5;
import defpackage.hrg;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.kv8;
import defpackage.l5;
import defpackage.mj8;
import defpackage.mr5;
import defpackage.or5;
import defpackage.p63;
import defpackage.pd7;
import defpackage.pr5;
import defpackage.qd7;
import defpackage.qr5;
import defpackage.r6;
import defpackage.sr5;
import defpackage.tr5;
import defpackage.u63;
import defpackage.uv8;
import defpackage.vac;
import defpackage.vu5;
import defpackage.w92;
import defpackage.wl7;
import defpackage.y92;
import defpackage.yd8;
import defpackage.z92;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@s.b("fragment")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/a;", "Landroidx/navigation/s;", "Landroidx/navigation/fragment/a$b;", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a extends s<b> {
    public final Context c;
    public final FragmentManager d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final mr5 h = new uv8() { // from class: mr5
        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            if (aVar == kv8.a.ON_DESTROY) {
                Fragment fragment = (Fragment) zv8Var;
                a aVar2 = this.a;
                Object obj = null;
                for (Object obj2 : (Iterable) aVar2.b().f.a.getValue()) {
                    if (wl7.b(((d) obj2).f, fragment.getTag())) {
                        obj = obj2;
                    }
                }
                d dVar = (d) obj;
                if (dVar != null) {
                    if (a.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + dVar + " due to fragment " + zv8Var + " lifecycle reaching DESTROYED");
                    }
                    aVar2.b().b(dVar);
                }
            }
        }
    };
    public final c i = new c();

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/a$a;", "Lbrg;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0072a extends brg {
        public WeakReference<gu5<j6g>> b;

        @Override // defpackage.brg
        public final void f() {
            WeakReference<gu5<j6g>> weakReference = this.b;
            if (weakReference == null) {
                wl7.g("completeTransition");
                throw null;
            }
            gu5<j6g> gu5Var = weakReference.get();
            if (gu5Var != null) {
                gu5Var.invoke();
            }
        }
    }

    public static class b extends k {
        public String a0;

        public b() {
            throw null;
        }

        @Override // androidx.navigation.k
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof b) && super.equals(obj) && wl7.b(this.a0, ((b) obj).a0);
        }

        @Override // androidx.navigation.k
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.a0;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.k
        public final void i(Context context, AttributeSet attributeSet) {
            context.getClass();
            super.i(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, vac.b);
            typedArrayObtainAttributes.getClass();
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.a0 = string;
            }
            j6g j6gVar = j6g.a;
            typedArrayObtainAttributes.recycle();
        }

        public final String l() {
            String str = this.a0;
            if (str != null) {
                str.getClass();
                return str;
            }
            r6.g("Fragment class was not set");
            return null;
        }

        @Override // androidx.navigation.k
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.a0;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    public static final class c extends mj8 implements Function1<androidx.navigation.d, uv8> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final uv8 invoke(androidx.navigation.d dVar) {
            final androidx.navigation.d dVar2 = dVar;
            dVar2.getClass();
            final a aVar = a.this;
            return new uv8() { // from class: rr5
                @Override // defpackage.uv8
                public final void G(zv8 zv8Var, kv8.a aVar2) {
                    a aVar3 = aVar;
                    aVar3.getClass();
                    d dVar3 = dVar2;
                    dVar3.getClass();
                    if (aVar2 == kv8.a.ON_RESUME && ((List) aVar3.b().e.a.getValue()).contains(dVar3)) {
                        if (a.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + dVar3 + " due to fragment " + zv8Var + " view lifecycle reaching RESUMED");
                        }
                        aVar3.b().b(dVar3);
                    }
                    if (aVar2 == kv8.a.ON_DESTROY) {
                        if (a.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + dVar3 + " due to fragment " + zv8Var + " view lifecycle reaching DESTROYED");
                        }
                        aVar3.b().b(dVar3);
                    }
                }
            };
        }
    }

    public static final class d extends mj8 implements Function1<Pair<? extends String, ? extends Boolean>, String> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Pair<? extends String, ? extends Boolean> pair) {
            Pair<? extends String, ? extends Boolean> pair2 = pair;
            pair2.getClass();
            return pair2.d();
        }
    }

    public static final class e implements goa, ev5 {
        public final /* synthetic */ qr5 a;

        public e(qr5 qr5Var) {
            this.a = qr5Var;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        @Override // defpackage.goa
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof goa) && (obj instanceof ev5)) {
                return this.a == ((ev5) obj).c();
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [mr5] */
    public a(Context context, FragmentManager fragmentManager, int i) {
        this.c = context;
        this.d = fragmentManager;
        this.e = i;
    }

    public static void k(a aVar, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = aVar.g;
        if (z2) {
            w92.B0(arrayList, new or5(str));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // androidx.navigation.s
    public final k a() {
        return new b(this);
    }

    @Override // androidx.navigation.s
    public final void d(List list, p pVar) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.O()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.navigation.d dVar = (androidx.navigation.d) it.next();
            boolean zIsEmpty = ((List) b().e.a.getValue()).isEmpty();
            if (pVar == null || zIsEmpty || !pVar.b || !this.f.remove(dVar.f)) {
                androidx.fragment.app.a aVarM = m(dVar, pVar);
                String str = dVar.f;
                if (!zIsEmpty) {
                    androidx.navigation.d dVar2 = (androidx.navigation.d) z92.Z0((List) b().e.a.getValue());
                    if (dVar2 != null) {
                        k(this, dVar2.f, 6);
                    }
                    k(this, str, 6);
                    aVarM.c(str);
                }
                aVarM.h(false);
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + dVar);
                }
                b().h(dVar);
            } else {
                fragmentManager.v(fragmentManager.new o(dVar.f), false);
                b().h(dVar);
            }
        }
    }

    @Override // androidx.navigation.s
    public final void e(final e.a aVar) {
        this.a = aVar;
        this.b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        tr5 tr5Var = new tr5() { // from class: nr5
            @Override // defpackage.tr5
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                Object objPrevious;
                fragmentManager.getClass();
                e.a aVar2 = aVar;
                List list = (List) aVar2.e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (wl7.b(((d) objPrevious).f, fragment.getTag())) {
                            break;
                        }
                    }
                }
                d dVar = (d) objPrevious;
                boolean zN = a.n();
                a aVar3 = this;
                if (zN) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + dVar + " to FragmentManager " + aVar3.d);
                }
                if (dVar != null) {
                    fragment.getViewLifecycleOwnerLiveData().e(fragment, new a.e(new qr5(aVar3, fragment, dVar)));
                    fragment.getLifecycle().a(aVar3.h);
                    aVar3.l(fragment, dVar, aVar2);
                }
            }
        };
        FragmentManager fragmentManager = this.d;
        fragmentManager.o.add(tr5Var);
        sr5 sr5Var = new sr5(aVar, this);
        if (fragmentManager.m == null) {
            fragmentManager.m = new ArrayList<>();
        }
        fragmentManager.m.add(sr5Var);
    }

    @Override // androidx.navigation.s
    public final void f(androidx.navigation.d dVar) {
        String str = dVar.f;
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.O()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a aVarM = m(dVar, null);
        List list = (List) b().e.a.getValue();
        if (list.size() > 1) {
            androidx.navigation.d dVar2 = (androidx.navigation.d) z92.R0(list.size() - 2, list);
            if (dVar2 != null) {
                k(this, dVar2.f, 6);
            }
            k(this, str, 4);
            fragmentManager.v(fragmentManager.new n(str, -1), false);
            k(this, str, 2);
            aVarM.c(str);
        }
        aVarM.h(false);
        b().c(dVar);
    }

    @Override // androidx.navigation.s
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            w92.w0(linkedHashSet, stringArrayList);
        }
    }

    @Override // androidx.navigation.s
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return aq1.a(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.navigation.s
    public final void i(androidx.navigation.d dVar, boolean z) {
        int i;
        dVar.getClass();
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.O()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(dVar);
        List listSubList = list.subList(iIndexOf, list.size());
        androidx.navigation.d dVar2 = (androidx.navigation.d) z92.O0(list);
        androidx.navigation.d dVar3 = (androidx.navigation.d) z92.R0(iIndexOf - 1, list);
        if (dVar3 != null) {
            k(this, dVar3.f, 6);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    k(this, ((androidx.navigation.d) it2.next()).f, 4);
                }
                if (z) {
                    for (androidx.navigation.d dVar4 : z92.i1(list2)) {
                        if (wl7.b(dVar4, dVar2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + dVar4);
                        } else {
                            fragmentManager.v(fragmentManager.new p(dVar4.f), false);
                            this.f.add(dVar4.f);
                        }
                    }
                } else {
                    fragmentManager.v(fragmentManager.new n(dVar.f, -1), false);
                }
                if (n()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + dVar + " with savedState " + z);
                }
                b().e(dVar, z);
                return;
            }
            Object next = it.next();
            androidx.navigation.d dVar5 = (androidx.navigation.d) next;
            y92 y92VarG0 = z92.G0(this.g);
            d dVar6 = d.a;
            dVar6.getClass();
            String str = dVar5.f;
            Iterator<Object> it3 = y92VarG0.iterator();
            int i2 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i = -1;
                    break;
                }
                String strInvoke = dVar6.invoke(it3.next());
                if (i2 < 0) {
                    u63.o0();
                    throw null;
                }
                if (wl7.b(str, strInvoke)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if ((i >= 0) || !wl7.b(dVar5.f, dVar2.f)) {
                arrayList.add(next);
            }
        }
    }

    public final void l(Fragment fragment, androidx.navigation.d dVar, e.a aVar) {
        fragment.getClass();
        irg viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        qd7 qd7Var = new qd7();
        iwc iwcVar = fwc.a;
        qd7Var.a(iwcVar.b(C0072a.class), androidx.navigation.fragment.b.a);
        pd7 pd7VarB = qd7Var.b();
        p63.a aVar2 = p63.a.b;
        aVar2.getClass();
        hrg hrgVar = new hrg(viewModelStore, pd7VarB, aVar2);
        yd8 yd8VarB = iwcVar.b(C0072a.class);
        String strP = yd8VarB.p();
        if (strP == null) {
            l5.q("Local and anonymous classes can not be ViewModels");
        } else {
            ((C0072a) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP))).b = new WeakReference<>(new pr5(dVar, aVar, this, fragment));
        }
    }

    public final androidx.fragment.app.a m(androidx.navigation.d dVar, androidx.navigation.p pVar) {
        k kVar = dVar.b;
        kVar.getClass();
        Bundle bundleA = dVar.a();
        String strL = ((b) kVar).l();
        char cCharAt = strL.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            strL = context.getPackageName() + strL;
        }
        FragmentManager fragmentManager = this.d;
        i iVarH = fragmentManager.H();
        context.getClassLoader();
        Fragment fragmentA = iVarH.a(strL);
        fragmentA.getClass();
        fragmentA.setArguments(bundleA);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i = pVar != null ? pVar.f : -1;
        int i2 = pVar != null ? pVar.g : -1;
        int i3 = pVar != null ? pVar.h : -1;
        int i4 = pVar != null ? pVar.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            aVar.f(i, i2, i3, i4 != -1 ? i4 : 0);
        }
        aVar.e(this.e, fragmentA, dVar.f);
        aVar.n(fragmentA);
        aVar.p = true;
        return aVar;
    }
}
