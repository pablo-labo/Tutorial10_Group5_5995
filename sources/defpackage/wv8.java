package defpackage;

import defpackage.kv8;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wv8 implements lv8, yv8 {
    public final HashSet a = new HashSet();
    public final kv8 b;

    public wv8(aw8 aw8Var) {
        this.b = aw8Var;
        aw8Var.a(this);
    }

    @Override // defpackage.lv8
    public final void c(xv8 xv8Var) {
        this.a.add(xv8Var);
        kv8 kv8Var = this.b;
        if (kv8Var.b() == kv8.b.a) {
            xv8Var.onDestroy();
        } else if (kv8Var.b().compareTo(kv8.b.d) >= 0) {
            xv8Var.f();
        } else {
            xv8Var.onStop();
        }
    }

    @Override // defpackage.lv8
    public final void d(xv8 xv8Var) {
        this.a.remove(xv8Var);
    }

    @qqa(kv8.a.ON_DESTROY)
    public void onDestroy(zv8 zv8Var) {
        Iterator it = xjg.e(this.a).iterator();
        while (it.hasNext()) {
            ((xv8) it.next()).onDestroy();
        }
        zv8Var.getLifecycle().c(this);
    }

    @qqa(kv8.a.ON_START)
    public void onStart(zv8 zv8Var) {
        Iterator it = xjg.e(this.a).iterator();
        while (it.hasNext()) {
            ((xv8) it.next()).f();
        }
    }

    @qqa(kv8.a.ON_STOP)
    public void onStop(zv8 zv8Var) {
        Iterator it = xjg.e(this.a).iterator();
        while (it.hasNext()) {
            ((xv8) it.next()).onStop();
        }
    }
}
