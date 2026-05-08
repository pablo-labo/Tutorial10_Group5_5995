package defpackage;

import android.os.Bundle;
import defpackage.ju8;
import defpackage.otc;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ald {
    public final cld a;
    public otc.a b;

    public interface a {
        void a(dld dldVar);
    }

    public interface b {
        Bundle a();
    }

    public ald(cld cldVar) {
        this.a = cldVar;
    }

    public final Bundle a(String str) {
        cld cldVar = this.a;
        if (!cldVar.g) {
            r6.g("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = cldVar.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = bundle.containsKey(str) ? zkd.B(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            cldVar.f = null;
        }
        return bundleB;
    }

    public final b b() {
        b bVar;
        cld cldVar = this.a;
        synchronized (cldVar.c) {
            Iterator it = cldVar.d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                b bVar2 = (b) entry.getValue();
                if (wl7.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final void c(String str, b bVar) {
        bVar.getClass();
        cld cldVar = this.a;
        synchronized (cldVar.c) {
            if (cldVar.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            cldVar.d.put(str, bVar);
            j6g j6gVar = j6g.a;
        }
    }

    public final void d() {
        if (!this.a.h) {
            r6.g("Can not perform this action after onSaveInstanceState");
            return;
        }
        otc.a aVar = this.b;
        if (aVar == null) {
            aVar = new otc.a(this);
        }
        this.b = aVar;
        try {
            ju8.a.class.getDeclaredConstructor(null);
            otc.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a.add(ju8.a.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + ju8.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
