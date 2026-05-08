package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.navigation.e;
import defpackage.w7;

/* JADX INFO: loaded from: classes.dex */
public final class mca {
    public static final e a(Activity activity, int i) {
        View viewFindViewById;
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            viewFindViewById = w7.a.a(activity, i);
        } else {
            viewFindViewById = activity.findViewById(i);
            if (viewFindViewById == null) {
                l5.q("ID does not reference a View inside this Activity");
                return null;
            }
        }
        viewFindViewById.getClass();
        e eVar = (e) a7e.S(a7e.V(v6e.O(viewFindViewById, ca0.d), zx5.c));
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    public static final e b(View view) {
        view.getClass();
        e eVar = (e) a7e.S(a7e.V(v6e.O(view, ca0.d), zx5.c));
        if (eVar != null) {
            return eVar;
        }
        n6.d("View ", view, " does not have a NavController set");
        return null;
    }
}
