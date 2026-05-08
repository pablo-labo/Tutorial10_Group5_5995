package androidx.fragment.app;

import android.util.Log;
import defpackage.brg;
import defpackage.grg;
import defpackage.irg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends brg {
    public static final a W = new a();
    public final boolean e;
    public final HashMap<String, Fragment> b = new HashMap<>();
    public final HashMap<String, l> c = new HashMap<>();
    public final HashMap<String, irg> d = new HashMap<>();
    public boolean f = false;
    public boolean V = false;

    public class a implements grg.c {
        @Override // grg.c
        public final <T extends brg> T c(Class<T> cls) {
            return new l(true);
        }
    }

    public l(boolean z) {
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.b.equals(lVar.b) && this.c.equals(lVar.c) && this.d.equals(lVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.brg
    public final void f() {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void g(Fragment fragment) {
        if (this.V) {
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap<String, Fragment> map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void h(Fragment fragment, boolean z) {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        j(fragment.mWho, z);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final void i(String str, boolean z) {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        j(str, z);
    }

    public final void j(String str, boolean z) {
        HashMap<String, l> map = this.c;
        l lVar = map.get(str);
        if (lVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lVar.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lVar.i((String) it.next(), true);
                }
            }
            lVar.f();
            map.remove(str);
        }
        HashMap<String, irg> map2 = this.d;
        irg irgVar = map2.get(str);
        if (irgVar != null) {
            irgVar.a();
            map2.remove(str);
        }
    }

    public final void k(Fragment fragment) {
        if (this.V) {
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(fragment.mWho) == null || !FragmentManager.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
