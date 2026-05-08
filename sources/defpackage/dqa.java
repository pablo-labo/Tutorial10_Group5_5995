package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.kv8;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class dqa {
    public final Runnable a;
    public final zs0<wpa> b;
    public wpa c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public static final class a {
        public static void a(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
        }

        public static void b(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class b {
    }

    public final class c implements uv8, ow1 {
        public final kv8 a;
        public final wpa b;
        public d c;
        public final /* synthetic */ dqa d;

        public c(dqa dqaVar, kv8 kv8Var, wpa wpaVar) {
            wpaVar.getClass();
            this.d = dqaVar;
            this.a = kv8Var;
            this.b = wpaVar;
            kv8Var.a(this);
        }

        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            if (aVar == kv8.a.ON_START) {
                this.c = this.d.b(this.b);
                return;
            }
            if (aVar != kv8.a.ON_STOP) {
                if (aVar == kv8.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.c;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }

        @Override // defpackage.ow1
        public final void cancel() {
            this.a.c(this);
            wpa wpaVar = this.b;
            wpaVar.getClass();
            wpaVar.b.remove(this);
            d dVar = this.c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.c = null;
        }
    }

    public final class d implements ow1 {
        public final wpa a;
        public final /* synthetic */ dqa b;

        public d(dqa dqaVar, wpa wpaVar) {
            wpaVar.getClass();
            this.b = dqaVar;
            this.a = wpaVar;
        }

        @Override // defpackage.ow1
        public final void cancel() {
            dqa dqaVar = this.b;
            zs0<wpa> zs0Var = dqaVar.b;
            wpa wpaVar = this.a;
            zs0Var.remove(wpaVar);
            if (wl7.b(dqaVar.c, wpaVar)) {
                wpaVar.a();
                dqaVar.c = null;
            }
            wpaVar.getClass();
            wpaVar.b.remove(this);
            gu5<j6g> gu5Var = wpaVar.c;
            if (gu5Var != null) {
                gu5Var.invoke();
            }
            wpaVar.c = null;
        }
    }

    public /* synthetic */ class e extends qv5 implements gu5<j6g> {
        @Override // defpackage.gu5
        public final j6g invoke() {
            ((dqa) this.receiver).f();
            return j6g.a;
        }
    }

    public dqa(Runnable runnable) {
        OnBackInvokedCallback eqaVar;
        this.a = runnable;
        this.b = new zs0<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                eqaVar = new eqa(new xpa(this), new ypa(this), new zpa(this), new aqa(this));
            } else {
                final bqa bqaVar = new bqa(this);
                eqaVar = new OnBackInvokedCallback() { // from class: cqa
                    public final void onBackInvoked() {
                        bqaVar.invoke();
                    }
                };
            }
            this.d = eqaVar;
        }
    }

    public final void a(zv8 zv8Var, wpa wpaVar) {
        zv8Var.getClass();
        wpaVar.getClass();
        kv8 lifecycle = zv8Var.getLifecycle();
        if (lifecycle.b() == kv8.b.a) {
            return;
        }
        wpaVar.b.add(new c(this, lifecycle, wpaVar));
        f();
        wpaVar.c = new e(0, this, dqa.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final d b(wpa wpaVar) {
        wpaVar.getClass();
        this.b.addLast(wpaVar);
        d dVar = new d(this, wpaVar);
        wpaVar.b.add(dVar);
        f();
        wpaVar.c = new fqa(0, this, dqa.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        return dVar;
    }

    public final void c() {
        wpa wpaVarPrevious;
        wpa wpaVar = this.c;
        if (wpaVar == null) {
            zs0<wpa> zs0Var = this.b;
            ListIterator<wpa> listIterator = zs0Var.listIterator(zs0Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    wpaVarPrevious = null;
                    break;
                } else {
                    wpaVarPrevious = listIterator.previous();
                    if (wpaVarPrevious.a) {
                        break;
                    }
                }
            }
            wpaVar = wpaVarPrevious;
        }
        this.c = null;
        if (wpaVar != null) {
            wpaVar.a();
        }
    }

    public final void d() {
        wpa wpaVarPrevious;
        wpa wpaVar = this.c;
        if (wpaVar == null) {
            zs0<wpa> zs0Var = this.b;
            ListIterator<wpa> listIterator = zs0Var.listIterator(zs0Var.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    wpaVarPrevious = null;
                    break;
                } else {
                    wpaVarPrevious = listIterator.previous();
                    if (wpaVarPrevious.a) {
                        break;
                    }
                }
            }
            wpaVar = wpaVarPrevious;
        }
        this.c = null;
        if (wpaVar != null) {
            wpaVar.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        if (z && !this.f) {
            a.a(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            a.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        boolean z2 = false;
        zs0<wpa> zs0Var = this.b;
        if (zs0Var == null || !zs0Var.isEmpty()) {
            Iterator<wpa> it = zs0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }

    public dqa() {
        this(null);
    }
}
