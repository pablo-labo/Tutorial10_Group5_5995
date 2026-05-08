package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.Violation;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cs5 {
    public static final a a = a.a;

    public static final class a {
        public static final a a;

        static {
            a aVar = new a();
            new LinkedHashMap();
            a = aVar;
        }
    }

    public static a a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(Violation violation) {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.getFragment().getClass().getName()), violation);
        }
    }
}
