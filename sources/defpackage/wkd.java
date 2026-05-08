package defpackage;

import android.os.Bundle;
import defpackage.ald;
import defpackage.grg;
import defpackage.kv8;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class wkd {
    public static final b a = new b();
    public static final c b = new c();
    public static final d c = new d();

    public static final class a implements grg.c {
        @Override // grg.c
        public final brg b(yd8 yd8Var, u2a u2aVar) {
            yd8Var.getClass();
            return new ykd();
        }
    }

    public static final class b {
    }

    public static final class c {
    }

    public static final class d {
    }

    public static final qkd a(u2a u2aVar) {
        qkd qkdVar;
        u2aVar.getClass();
        LinkedHashMap linkedHashMap = u2aVar.a;
        dld dldVar = (dld) linkedHashMap.get(a);
        Bundle bundle = null;
        if (dldVar == null) {
            l5.q("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        jrg jrgVar = (jrg) linkedHashMap.get(b);
        if (jrgVar == null) {
            l5.q("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(grg.b);
        if (str == null) {
            l5.q("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        ald.b bVarB = dldVar.getSavedStateRegistry().b();
        xkd xkdVar = bVarB instanceof xkd ? (xkd) bVarB : null;
        if (xkdVar == null) {
            r6.g("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(jrgVar).b;
        qkd qkdVar2 = (qkd) linkedHashMap2.get(str);
        if (qkdVar2 != null) {
            return qkdVar2;
        }
        xkdVar.b();
        Bundle bundle3 = xkdVar.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = aq1.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                xkdVar.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            qkdVar = new qkd();
        } else {
            ClassLoader classLoader = qkd.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            hb9 hb9Var = new hb9(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                hb9Var.put(str2, bundle2.get(str2));
            }
            qkdVar = new qkd(hb9Var.j());
        }
        linkedHashMap2.put(str, qkdVar);
        return qkdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends dld & jrg> void b(T t) {
        kv8.b bVarB = t.getLifecycle().b();
        if (bVarB != kv8.b.b && bVarB != kv8.b.c) {
            l5.q("Failed requirement.");
        } else if (t.getSavedStateRegistry().b() == null) {
            xkd xkdVar = new xkd(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", xkdVar);
            t.getLifecycle().a(new rkd(xkdVar));
        }
    }

    public static final ykd c(jrg jrgVar) {
        grg grgVarA = grg.b.a(jrgVar, new a(), 4);
        return (ykd) grgVarA.a.a(fwc.a.b(ykd.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
