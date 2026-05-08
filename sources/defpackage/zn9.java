package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zn9 implements ComponentCallbacks2 {
    public final CopyOnWriteArrayList<MemoryPressureListener> a;

    public zn9(Context context) {
        context.getClass();
        this.a = new CopyOnWriteArrayList<>();
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks
    @sy3
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Iterator<MemoryPressureListener> it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().handleMemoryPressure(i);
        }
    }
}
