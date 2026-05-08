package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class esg {
    public static View a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final dld b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            dld dldVar = tag instanceof dld ? (dld) tag : null;
            if (dldVar != null) {
                return dldVar;
            }
            Object objL = u63.L(view);
            view = objL instanceof View ? (View) objL : null;
        }
        return null;
    }
}
