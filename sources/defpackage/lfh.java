package defpackage;

import android.os.Bundle;
import defpackage.ht0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lfh extends srh {
    public final ht0 b;
    public final ht0 c;
    public long d;

    public lfh(i0i i0iVar) {
        super(i0iVar, 1);
        this.c = new ht0();
        this.b = new ht0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(long j) {
        f8i f8iVarO = i().o(false);
        ht0 ht0Var = this.b;
        for (String str : (ht0.c) ht0Var.keySet()) {
            n(str, j - ((Long) ht0Var.get(str)).longValue(), f8iVarO);
        }
        if (!ht0Var.isEmpty()) {
            m(j - this.d, f8iVarO);
        }
        o(j);
    }

    public final void l(long j, String str) {
        if (str == null || str.length() == 0) {
            zzr().f.b("Ad unit id must be a non-empty string");
        } else {
            zzq().m(new soh(this, str, j));
        }
    }

    public final void m(long j, f8i f8iVar) {
        if (f8iVar == null) {
            zzr().c0.b("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzr().c0.a(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        c8i.r(f8iVar, bundle, true);
        h().r("am", "_xa", bundle);
    }

    public final void n(String str, long j, f8i f8iVar) {
        if (f8iVar == null) {
            zzr().c0.b("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzr().c0.a(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        c8i.r(f8iVar, bundle, true);
        h().r("am", "_xu", bundle);
    }

    public final void o(long j) {
        ht0 ht0Var = this.b;
        Iterator it = ((ht0.c) ht0Var.keySet()).iterator();
        while (it.hasNext()) {
            ht0Var.put((String) it.next(), Long.valueOf(j));
        }
        if (ht0Var.isEmpty()) {
            return;
        }
        this.d = j;
    }

    public final void p(long j, String str) {
        if (str == null || str.length() == 0) {
            zzr().f.b("Ad unit id must be a non-empty string");
        } else {
            zzq().m(new rkh(this, str, j));
        }
    }
}
