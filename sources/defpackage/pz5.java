package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.GestureHandler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pz5<T extends GestureHandler> {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public pz5(T t) {
        t.getClass();
        this.a = t.y;
        this.b = t.d;
        this.c = t.f;
        this.d = t.D;
    }

    public void a(WritableMap writableMap) {
        writableMap.putInt("numberOfPointers", this.a);
        writableMap.putInt("handlerTag", this.b);
        writableMap.putInt("state", this.c);
        writableMap.putInt("pointerType", this.d);
    }
}
