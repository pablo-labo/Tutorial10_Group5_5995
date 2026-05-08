package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zi0 implements xi0 {
    public final CopyOnWriteArrayList<rpa> a = new CopyOnWriteArrayList<>();
    public WeakReference<wi0> b = new WeakReference<>(null);

    public final void a(rpa rpaVar) {
        this.a.add(rpaVar);
        wi0 wi0Var = this.b.get();
        if (wi0Var != null) {
            wi0Var.runOnUiThread(new n60(1, rpaVar, wi0Var));
        }
    }

    @Override // defpackage.xi0
    public final void b(rpa rpaVar) {
        this.a.remove(rpaVar);
    }
}
