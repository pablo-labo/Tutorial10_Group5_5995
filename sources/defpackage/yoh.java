package defpackage;

import android.os.Bundle;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yoh {
    public final Map a = Collections.synchronizedMap(new ht0());
    public int b = 0;
    public Bundle c;

    public final void a(String str, nv8 nv8Var) {
        Map map = this.a;
        if (map.containsKey(str)) {
            l5.q(m6.h(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, nv8Var);
        if (this.b > 0) {
            new x0i(Looper.getMainLooper()).post(new clh(this, nv8Var, str));
        }
    }

    public final void b(Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((nv8) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((nv8) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
