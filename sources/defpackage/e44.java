package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import androidx.fragment.app.i;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;
import androidx.navigation.p;
import androidx.navigation.s;
import defpackage.kv8;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@s.b("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Le44;", "Landroidx/navigation/s;", "Le44$a;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e44 extends s<a> {
    public final Context c;
    public final FragmentManager d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final b f = new b();
    public final LinkedHashMap g = new LinkedHashMap();

    public static class a extends k implements ui5 {
        public String a0;

        public a() {
            throw null;
        }

        @Override // androidx.navigation.k
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof a) && super.equals(obj) && wl7.b(this.a0, ((a) obj).a0);
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
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, vac.a);
            typedArrayObtainAttributes.getClass();
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.a0 = string;
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String l() {
            String str = this.a0;
            if (str != null) {
                str.getClass();
                return str;
            }
            r6.g("DialogFragment class was not set");
            return null;
        }
    }

    public static final class b implements uv8 {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[kv8.a.values().length];
                try {
                    iArr[kv8.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kv8.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kv8.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[kv8.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public b() {
        }

        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            int iNextIndex;
            int i = a.a[aVar.ordinal()];
            e44 e44Var = e44.this;
            if (i == 1) {
                f fVar = (f) zv8Var;
                Iterable iterable = (Iterable) e44Var.b().e.a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (wl7.b(((d) it.next()).f, fVar.getTag())) {
                            return;
                        }
                    }
                }
                fVar.D();
                return;
            }
            Object obj = null;
            if (i == 2) {
                f fVar2 = (f) zv8Var;
                for (Object obj2 : (Iterable) e44Var.b().f.a.getValue()) {
                    if (wl7.b(((d) obj2).f, fVar2.getTag())) {
                        obj = obj2;
                    }
                }
                d dVar = (d) obj;
                if (dVar != null) {
                    e44Var.b().b(dVar);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                f fVar3 = (f) zv8Var;
                for (Object obj3 : (Iterable) e44Var.b().f.a.getValue()) {
                    if (wl7.b(((d) obj3).f, fVar3.getTag())) {
                        obj = obj3;
                    }
                }
                d dVar2 = (d) obj;
                if (dVar2 != null) {
                    e44Var.b().b(dVar2);
                }
                fVar3.getLifecycle().c(this);
                return;
            }
            f fVar4 = (f) zv8Var;
            if (fVar4.I().isShowing()) {
                return;
            }
            List list = (List) e44Var.b().e.a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (wl7.b(((d) listIterator.previous()).f, fVar4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            d dVar3 = (d) z92.R0(iNextIndex, list);
            if (!wl7.b(z92.Z0(list), dVar3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + fVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (dVar3 != null) {
                e44Var.l(iNextIndex, dVar3, false);
            }
        }
    }

    public e44(Context context, FragmentManager fragmentManager) {
        this.c = context;
        this.d = fragmentManager;
    }

    @Override // androidx.navigation.s
    public final k a() {
        return new a(this);
    }

    @Override // androidx.navigation.s
    public final void d(List list, p pVar) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            k(dVar).L(fragmentManager, dVar.f);
            d dVar2 = (d) z92.Z0((List) b().e.a.getValue());
            boolean zI0 = z92.I0((Iterable) b().f.a.getValue(), dVar2);
            b().h(dVar);
            if (dVar2 != null && !zI0) {
                b().b(dVar2);
            }
        }
    }

    @Override // androidx.navigation.s
    public final void e(e.a aVar) {
        kv8 lifecycle;
        this.a = aVar;
        this.b = true;
        Iterator it = ((List) aVar.e.a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FragmentManager fragmentManager = this.d;
            if (!zHasNext) {
                fragmentManager.o.add(new tr5() { // from class: d44
                    @Override // defpackage.tr5
                    public final void a(FragmentManager fragmentManager2, Fragment fragment) {
                        fragmentManager2.getClass();
                        e44 e44Var = this.a;
                        LinkedHashSet linkedHashSet = e44Var.e;
                        if (pxf.a(linkedHashSet).remove(fragment.getTag())) {
                            fragment.getLifecycle().a(e44Var.f);
                        }
                        LinkedHashMap linkedHashMap = e44Var.g;
                        pxf.b(linkedHashMap).remove(fragment.getTag());
                    }
                });
                return;
            }
            d dVar = (d) it.next();
            f fVar = (f) fragmentManager.D(dVar.f);
            if (fVar == null || (lifecycle = fVar.getLifecycle()) == null) {
                this.e.add(dVar.f);
            } else {
                lifecycle.a(this.f);
            }
        }
    }

    @Override // androidx.navigation.s
    public final void f(d dVar) {
        String str = dVar.f;
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        f fVar = (f) this.g.get(str);
        if (fVar == null) {
            Fragment fragmentD = fragmentManager.D(str);
            fVar = fragmentD instanceof f ? (f) fragmentD : null;
        }
        if (fVar != null) {
            fVar.getLifecycle().c(this.f);
            fVar.D();
        }
        k(dVar).L(fragmentManager, str);
        nea neaVarB = b();
        List list = (List) neaVarB.e.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            d dVar2 = (d) listIterator.previous();
            if (wl7.b(dVar2.f, str)) {
                gse gseVar = neaVarB.c;
                gseVar.m(null, bbe.p(bbe.p((Set) gseVar.getValue(), dVar2), dVar));
                neaVarB.c(dVar);
                return;
            }
        }
        s6.j("List contains no element matching the predicate.");
    }

    @Override // androidx.navigation.s
    public final void i(d dVar, boolean z) {
        dVar.getClass();
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(dVar);
        Iterator it = z92.i1(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentD = fragmentManager.D(((d) it.next()).f);
            if (fragmentD != null) {
                ((f) fragmentD).D();
            }
        }
        l(iIndexOf, dVar, z);
    }

    public final f k(d dVar) {
        k kVar = dVar.b;
        kVar.getClass();
        a aVar = (a) kVar;
        String strL = aVar.l();
        char cCharAt = strL.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            strL = context.getPackageName() + strL;
        }
        i iVarH = this.d.H();
        context.getClassLoader();
        Fragment fragmentA = iVarH.a(strL);
        fragmentA.getClass();
        if (!f.class.isAssignableFrom(fragmentA.getClass())) {
            o6.m("Dialog destination ", aVar.l(), " is not an instance of DialogFragment");
            return null;
        }
        f fVar = (f) fragmentA;
        fVar.setArguments(dVar.a());
        fVar.getLifecycle().a(this.f);
        this.g.put(dVar.f, fVar);
        return fVar;
    }

    public final void l(int i, d dVar, boolean z) {
        d dVar2 = (d) z92.R0(i - 1, (List) b().e.a.getValue());
        boolean zI0 = z92.I0((Iterable) b().f.a.getValue(), dVar2);
        b().e(dVar, z);
        if (dVar2 == null || zI0) {
            return;
        }
        b().b(dVar2);
    }
}
