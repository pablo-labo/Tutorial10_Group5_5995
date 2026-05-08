package defpackage;

import androidx.fragment.app.Fragment;
import com.datadog.android.rum.tracking.ComponentPredicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cg3 {
    public static final List<String> a = u63.Z("com.swmansion.rnscreens");
    public static final List<String> b = u63.Z("RN");
    public static final List<String> c = u63.Z("ReactNative");
    public static final a d = new a();

    public static final class a implements ComponentPredicate<Fragment> {
        @Override // com.datadog.android.rum.tracking.ComponentPredicate
        public final boolean accept(Fragment fragment) {
            boolean z;
            boolean z2;
            boolean z3;
            Fragment fragment2 = fragment;
            fragment2.getClass();
            String canonicalName = fragment2.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = "";
            }
            String simpleName = fragment2.getClass().getSimpleName();
            List<String> list = cg3.a;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (wve.K(canonicalName, (String) it.next(), false)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            List<String> list2 = cg3.b;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z2 = false;
            } else {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (wve.K(simpleName, (String) it2.next(), false)) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            List<String> list3 = cg3.c;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z3 = false;
            } else {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (zve.L(simpleName, (String) it3.next(), false)) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            }
            return (z || z2 || z3) ? false : true;
        }

        @Override // com.datadog.android.rum.tracking.ComponentPredicate
        public final String getViewName(Fragment fragment) {
            fragment.getClass();
            return null;
        }
    }
}
