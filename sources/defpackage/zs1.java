package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzw;

/* JADX INFO: loaded from: classes.dex */
public final class zs1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zs1(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((at1) this.c).b.put((m3d) this.b);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
                break;
            case 1:
                ((f3i) this.b).a();
                if (!awd.s()) {
                    boolean z = ((ohh) this.c).c != 0;
                    ((ohh) this.c).c = 0L;
                    if (z) {
                        ((ohh) this.c).a();
                    }
                } else {
                    ((f3i) this.b).zzq().m(this);
                }
                break;
            default:
                m4i m4iVar = (m4i) this.c;
                Bundle bundle = (Bundle) this.b;
                m4iVar.b();
                m4iVar.k();
                fib.f(bundle.getString("name"));
                fib.f(bundle.getString("origin"));
                fib.i(bundle.get("value"));
                i0i i0iVar = m4iVar.a;
                if (!i0iVar.d()) {
                    m4iVar.zzr().c0.b("Conditional property not set since app measurement is disabled");
                } else {
                    try {
                        i0iVar.m().o(new zzw(bundle.getString("app_id"), bundle.getString("origin"), new zzkq(bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("name"), bundle.getString("origin")), bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), m4iVar.e().q(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L), bundle.getLong("trigger_timeout"), m4iVar.e().q(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L), bundle.getLong("time_to_live"), m4iVar.e().q(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
