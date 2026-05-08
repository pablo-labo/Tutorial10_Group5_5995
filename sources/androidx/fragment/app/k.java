package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public final FragmentManager b;

    public static final class a {
        public final FragmentManager.k a;
        public final boolean b;

        public a(FragmentManager.k kVar, boolean z) {
            this.a = kVar;
            this.b = z;
        }
    }

    public k(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public final void a(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.a(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        g gVar = fragmentManager.v.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.b(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentAttached(fragmentManager, fragment, gVar);
            }
        }
    }

    public final void c(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.c(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void d(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.d(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void e(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.e(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentDetached(fragmentManager, fragment);
            }
        }
    }

    public final void f(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.f(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        g gVar = fragmentManager.v.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.g(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentPreAttached(fragmentManager, fragment, gVar);
            }
        }
    }

    public final void h(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.h(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void i(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.i(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentResumed(fragmentManager, fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.j(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void k(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.k(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentStarted(fragmentManager, fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.l(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentStopped(fragmentManager, fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.m(fragment, view, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    }

    public final void n(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().n.n(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }
    }
}
