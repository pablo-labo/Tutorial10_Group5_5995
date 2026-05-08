package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import defpackage.p0f;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class o0f implements Runnable {
    public final /* synthetic */ p0f.b a;
    public final /* synthetic */ p0f.a b;

    public o0f(p0f.b bVar, p0f.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0f.b bVar = this.a;
        EventEmitterWrapper eventEmitterWrapper = bVar.g;
        p0f.a aVar = this.b;
        if (eventEmitterWrapper == null) {
            if (bVar.h == null) {
                bVar.h = new LinkedList();
            }
            bVar.h.add(aVar);
            return;
        }
        WritableMap writableMap = aVar.d;
        boolean z = aVar.b;
        String str = aVar.a;
        if (z) {
            eventEmitterWrapper.dispatchUnique(str, writableMap);
        } else {
            eventEmitterWrapper.dispatch(str, writableMap, aVar.c);
        }
    }
}
