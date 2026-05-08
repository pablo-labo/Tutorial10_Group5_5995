package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.fragment.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class sr5 implements FragmentManager.l {
    public final /* synthetic */ e.a a;
    public final /* synthetic */ a b;

    public sr5(e.a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void a(Fragment fragment, boolean z) {
        Object obj;
        Object objPrevious;
        a aVar = this.b;
        ArrayList arrayList = aVar.g;
        fragment.getClass();
        e.a aVar2 = this.a;
        ArrayList arrayListH1 = z92.h1((Collection) aVar2.e.a.getValue(), (Iterable) aVar2.f.a.getValue());
        ListIterator listIterator = arrayListH1.listIterator(arrayListH1.size());
        while (true) {
            obj = null;
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
        boolean z2 = z && arrayList.isEmpty() && fragment.isRemoving();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (wl7.b(((Pair) next).d(), fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z2 && a.n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + dVar);
        }
        boolean z3 = pair != null && ((Boolean) pair.e()).booleanValue();
        if (!z && !z3 && dVar == null) {
            h5.k(s6.d("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (dVar != null) {
            aVar.l(fragment, dVar, aVar2);
            if (z2) {
                if (a.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + dVar + " via system back");
                }
                aVar2.e(dVar, false);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void b(Fragment fragment, boolean z) {
        Object objPrevious;
        fragment.getClass();
        if (z) {
            e.a aVar = this.a;
            List list = (List) aVar.e.a.getValue();
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
            if (a.n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + dVar);
            }
            if (dVar != null) {
                aVar.f(dVar);
            }
        }
    }
}
