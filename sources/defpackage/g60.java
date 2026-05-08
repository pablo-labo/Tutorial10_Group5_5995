package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import defpackage.q37;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g60 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ q37 b;

    public g60(Configuration configuration, q37 q37Var) {
        this.a = configuration;
        this.b = q37Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<q37.b, WeakReference<q37.a>>> it = this.b.a.entrySet().iterator();
        while (it.hasNext()) {
            q37.a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @sy3
    public final void onLowMemory() {
        this.b.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.a.clear();
    }
}
