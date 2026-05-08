package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import defpackage.bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, m> b = new HashMap<>();
    public final HashMap<String, Bundle> c = new HashMap<>();
    public l d;

    public final void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            bg.n(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        m mVar = this.b.get(str);
        if (mVar != null) {
            return mVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (m mVar : this.b.values()) {
            if (mVar != null && (fragmentFindFragmentByWho = mVar.c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : this.b.values()) {
            if (mVar != null) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : this.b.values()) {
            if (mVar != null) {
                arrayList.add(mVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(m mVar) {
        Fragment fragment = mVar.c;
        String str = fragment.mWho;
        HashMap<String, m> map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, mVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            l lVar = this.d;
            if (z) {
                lVar.g(fragment);
            } else {
                lVar.k(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(m mVar) {
        Fragment fragment = mVar.c;
        if (fragment.mRetainInstance) {
            this.d.k(fragment);
        }
        String str = fragment.mWho;
        HashMap<String, m> map = this.b;
        if (map.get(str) == mVar && map.put(fragment.mWho, null) != null && FragmentManager.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap<String, Bundle> map = this.c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
