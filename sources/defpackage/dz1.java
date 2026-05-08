package defpackage;

import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.media3.session.a;
import androidx.media3.session.c;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.l;
import androidx.media3.session.m;
import androidx.media3.session.z;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.a2d;
import defpackage.f47;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.wr3;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dz1 implements wr3.a, lz8.a, n8, m.a, a2d.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dz1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // a2d.b
    public void b(long j, g4b g4bVar) {
        gz1.a(j, g4bVar, ((lzd) this.b).b);
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) this.b;
        Map map = (Map) obj;
        map.getClass();
        yb1 yb1Var = indeedApplyWebViewFragment.B0;
        if (yb1Var != null) {
            yb1Var.invoke(map);
        }
        indeedApplyWebViewFragment.B0 = null;
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        c cVar = (c) this.b;
        aae aaeVar = kVar.e;
        if (kVar.D != null) {
            zkd.w("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            kVar.Z0().T0();
            return;
        }
        g gVar = cVar.c;
        e47<a> e47Var = cVar.n;
        Bundle bundle = cVar.i;
        kVar.D = gVar;
        kVar.q = cVar.d;
        kVar.v = cVar.e;
        gdb.a aVar = cVar.f;
        kVar.w = aVar;
        gdb.a aVar2 = cVar.g;
        kVar.x = aVar2;
        gdb.a aVarT0 = k.T0(aVar, aVar2);
        kVar.y = aVarT0;
        e47<a> e47Var2 = cVar.k;
        kVar.r = e47Var2;
        e47<a> e47Var3 = cVar.l;
        kVar.s = e47Var3;
        qyc qycVarQ1 = k.q1(e47Var3, e47Var2, kVar.v, aVarT0, bundle);
        kVar.t = qycVarQ1;
        kVar.u = k.p1(qycVarQ1, kVar.r, bundle, kVar.v, kVar.y);
        f47.a aVar3 = new f47.a(4);
        for (int i = 0; i < e47Var.size(); i++) {
            a aVar4 = e47Var.get(i);
            v8e v8eVar = aVar4.a;
            if (v8eVar != null && v8eVar.a == 0) {
                aVar3.b(v8eVar.b, aVar4);
            }
        }
        aVar3.a();
        kVar.p = cVar.j;
        MediaSession.Token tokenH = cVar.m;
        if (tokenH == null) {
            tokenH = aaeVar.a.h();
        }
        MediaSession.Token token = tokenH;
        if (token != null) {
            kVar.E = new MediaController(kVar.d, token);
        }
        try {
            cVar.c.asBinder().linkToDeath(kVar.g, 0);
            kVar.m = new aae(aaeVar.a.a(), cVar.a, cVar.b, aaeVar.a.e(), cVar.c, cVar.h, token);
            kVar.I = bundle;
            kVar.Z0().x();
        } catch (RemoteException unused) {
            kVar.Z0().T0();
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((gdb.c) obj).s(((adb) obj2).e);
                break;
            case 3:
                ((gdb.c) obj).M((js9) obj2);
                break;
            case 4:
            default:
                ((gdb.c) obj).h0(((l) obj2).p.a.z);
                break;
            case 5:
                ((gdb.c) obj).s(((z) obj2).y);
                break;
        }
    }

    @Override // wr3.a
    public void j(j6c j6cVar) {
        u33 u33Var = (u33) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        u33Var.b.set((s33) j6cVar.get());
    }
}
