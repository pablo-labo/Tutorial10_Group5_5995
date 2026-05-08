package defpackage;

import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzw;

/* JADX INFO: loaded from: classes.dex */
public final class rs3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rs3(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                z39 z39VarD = z39.d();
                String str = ss3.d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                r3h r3hVar = (r3h) obj;
                sb.append(r3hVar.a);
                z39VarD.a(str, sb.toString());
                ((ss3) obj2).a.d(r3hVar);
                break;
            default:
                m4i m4iVar = (m4i) obj2;
                Bundle bundle = (Bundle) obj;
                m4iVar.b();
                m4iVar.k();
                fib.f(bundle.getString("name"));
                i0i i0iVar = m4iVar.a;
                if (!i0iVar.d()) {
                    m4iVar.zzr().c0.b("Conditional property not cleared since app measurement is disabled");
                } else {
                    try {
                        i0iVar.m().o(new zzw(bundle.getString("app_id"), bundle.getString("origin"), new zzkq(0L, null, bundle.getString("name"), null), bundle.getLong("creation_timestamp"), bundle.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), m4iVar.e().q(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"))));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
