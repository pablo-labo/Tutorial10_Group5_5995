package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q0g implements i8, ui7, wv7, l0g {
    public ReactContext a;
    public WeakHashMap b;

    @Override // defpackage.l0g
    public final void a(n8b n8bVar) {
        WeakReference weakReference = new WeakReference(n8bVar);
        WeakHashMap weakHashMap = this.b;
        weakHashMap.put(n8bVar, new p0g(weakReference));
        this.a.addLifecycleEventListener((LifecycleEventListener) weakHashMap.get(n8bVar));
    }

    @Override // defpackage.i8
    public final Activity b() {
        return this.a.getCurrentActivity();
    }

    @Override // defpackage.ui7
    public final List<Class> f() {
        return Arrays.asList(i8.class, wv7.class, l0g.class);
    }

    @Override // defpackage.oyc
    public final void onDestroy() {
        WeakHashMap weakHashMap = this.b;
        Iterator it = new ArrayList(weakHashMap.values()).iterator();
        while (it.hasNext()) {
            ((LifecycleEventListener) it.next()).onHostDestroy();
        }
        Iterator it2 = weakHashMap.values().iterator();
        while (it2.hasNext()) {
            this.a.removeLifecycleEventListener((LifecycleEventListener) it2.next());
        }
        weakHashMap.clear();
    }
}
