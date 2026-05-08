package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class wpa {
    public boolean a;
    public final CopyOnWriteArrayList<ow1> b = new CopyOnWriteArrayList<>();
    public gu5<j6g> c;

    public wpa(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(f71 f71Var) {
        f71Var.getClass();
    }

    public void d(f71 f71Var) {
        f71Var.getClass();
    }

    public final void e() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((ow1) it.next()).cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        gu5<j6g> gu5Var = this.c;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
    }
}
