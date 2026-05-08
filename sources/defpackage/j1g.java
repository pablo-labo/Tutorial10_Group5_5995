package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.indeed.android.jobsearch.R;
import defpackage.xh8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j1g implements i1g, xh8 {
    @Override // defpackage.i1g
    public final void a(FragmentManager fragmentManager, w0g w0gVar) {
        fragmentManager.getClass();
        w0gVar.getClass();
        w0gVar.K(new a(fragmentManager), w0gVar.getClass().getSimpleName());
    }

    @Override // defpackage.i1g
    public final void b(FragmentManager fragmentManager, l1g l1gVar) {
        String simpleName = l1gVar.getClass().getSimpleName();
        ArrayList arrayList = lz2.a;
        lz2.d("UIPFragmentImpl", "class name = ".concat(simpleName), false, null);
        web.D(fragmentManager, simpleName);
    }

    @Override // defpackage.i1g
    public final void c(FragmentManager fragmentManager, String str) {
        web.D(fragmentManager, str);
    }

    @Override // defpackage.i1g
    public final void e(FragmentManager fragmentManager, l1g l1gVar) {
        fragmentManager.getClass();
        String simpleName = l1gVar.getClass().getSimpleName();
        ArrayList arrayList = lz2.a;
        lz2.d("UIPFragmentImpl", "class name = ".concat(simpleName), false, null);
        a aVar = new a(fragmentManager);
        web.E(fragmentManager, aVar, simpleName, 4);
        aVar.d(R.id.app_container, l1gVar, simpleName, 1);
        aVar.h(true);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
