package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o20 implements n20 {
    public static volatile o20 c;

    @VisibleForTesting
    public final wl0 a;

    @VisibleForTesting
    public final ConcurrentHashMap b;

    public o20(wl0 wl0Var) {
        fib.i(wl0Var);
        this.a = wl0Var;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.n20
    public final void a(String str, String str2, Bundle bundle) {
        if (wkh.c.contains(str) || wkh.b.contains(str2)) {
            return;
        }
        Iterator<String> it = wkh.d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (wkh.c.contains(str)) {
                return;
            }
            Iterator<String> it2 = wkh.d.iterator();
            while (it2.hasNext()) {
                if (bundle.containsKey(it2.next())) {
                    return;
                }
            }
            switch (str) {
                case "fcm":
                    bundle.putString("_cis", "fcm_integration");
                    break;
                case "fdl":
                    bundle.putString("_cis", "fdl_integration");
                    break;
                case "fiam":
                    bundle.putString("_cis", "fiam_integration");
                    break;
                default:
                    return;
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        mhh mhhVar = this.a.a;
        mhhVar.c(new lmh(mhhVar, str, str2, bundle, true));
    }

    @Override // defpackage.n20
    public final c0h b(String str, t23 t23Var) {
        Object obj;
        if (!wkh.c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                wl0 wl0Var = this.a;
                if (zEquals) {
                    kuh kuhVar = new kuh();
                    kuhVar.b = t23Var;
                    vrh vrhVar = new vrh(kuhVar);
                    mhh mhhVar = wl0Var.a;
                    mhhVar.c(new imh(mhhVar, vrhVar));
                    kuhVar.a = new HashSet();
                    obj = kuhVar;
                } else if ("crash".equals(str) || "clx".equals(str)) {
                    q0i q0iVar = new q0i();
                    q0iVar.a = t23Var;
                    wwh wwhVar = new wwh(q0iVar);
                    mhh mhhVar2 = wl0Var.a;
                    mhhVar2.c(new imh(mhhVar2, wwhVar));
                    obj = q0iVar;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    concurrentHashMap.put(str, obj);
                    return new c0h(11);
                }
            }
        }
        return null;
    }

    @Override // defpackage.n20
    public final void c(String str) {
        if (wkh.c.contains("fcm")) {
            return;
        }
        mhh mhhVar = this.a.a;
        mhhVar.c(new jmh(mhhVar, str));
    }
}
