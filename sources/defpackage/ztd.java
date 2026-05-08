package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.n;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.cd4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ztd {
    public static void a(FragmentManager fragmentManager, jt7 jt7Var, String str, kt7 kt7Var) {
        SearchType searchType;
        fragmentManager.getClass();
        jt7Var.getClass();
        if (fragmentManager.D("SearchOverlayFragment") != null) {
            ArrayList arrayList = lz2.a;
            lz2.h("SearchOverlayFragment", "Tried to show search overlay, but fragment already exists. args=" + jt7Var + ", origin=" + str, null, 12);
            return;
        }
        a aVar = new a(fragmentManager);
        web.E(fragmentManager, aVar, "SearchOverlayFragment", null);
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.T0) == cd4.p2.c.getValue()) {
            aVar.f(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, 0, 0);
        } else {
            aVar.f(R.anim.catalyst_slide_up, R.anim.catalyst_slide_down, 0, 0);
        }
        aVar.c("SearchOverlayFragment");
        it7 it7Var = jt7Var.a;
        it7Var.getClass();
        int iOrdinal = it7Var.ordinal();
        if (iOrdinal == 0) {
            searchType = SearchType.b;
        } else {
            if (iOrdinal != 1) {
                l.g();
                return;
            }
            searchType = SearchType.c;
        }
        String str2 = jt7Var.b;
        String str3 = jt7Var.c;
        SearchOverlayFragment searchOverlayFragment = new SearchOverlayFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_SEARCH_TYPE", searchType);
        if (str2 != null) {
            bundle.putString("KEY_INITIAL_WHAT", str2);
        }
        if (str3 != null) {
            bundle.putString("KEY_INITIAL_WHERE", str3);
        }
        if (str != null) {
            bundle.putString("KEY_ORIGIN", str);
        }
        searchOverlayFragment.setArguments(bundle);
        searchOverlayFragment.a = kt7Var;
        aVar.d(R.id.app_container, searchOverlayFragment, "SearchOverlayFragment", 1);
        aVar.h(false);
    }

    public static void b(lr5 lr5Var) {
        Fragment fragmentD = lr5Var.D("SearchOverlayFragment");
        if (fragmentD == null) {
            ArrayList arrayList = lz2.a;
            lz2.d("SearchOverlayFragment", "tryCloseSearchOverlay -> Tried to close SearchOverlayFragment, but couldn't find an instance of it.", false, null);
            return;
        }
        a aVar = new a(lr5Var);
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.T0) == cd4.p2.c.getValue()) {
            aVar.f(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, 0, 0);
        } else {
            aVar.f(R.anim.catalyst_slide_up, R.anim.catalyst_slide_down, 0, 0);
        }
        aVar.l(fragmentD);
        aVar.h(true);
        try {
            lr5Var.v(new FragmentManager.n("SearchOverlayFragment", -1), false);
        } catch (IllegalStateException unused) {
            ArrayList arrayList2 = lz2.a;
            lz2.d("SearchOverlayFragment", "tryCloseSearchOverlay -> trying to close SearchOverlayFragment, but in an invalid state. Skipping.", false, null);
        }
        n nVar = lr5Var.c;
        List<Fragment> listF = nVar.f();
        listF.getClass();
        if (!listF.isEmpty()) {
            Iterator<Fragment> it = nVar.f().iterator();
            while (it.hasNext()) {
                View view = it.next().getView();
                if (view != null) {
                    view.setImportantForAccessibility(1);
                }
            }
        }
        ArrayList arrayList3 = lz2.a;
        lz2.d("SearchOverlayFragment", "tryCloseSearchOverlay -> closed SearchOverlayFragment", false, null);
    }
}
