package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.GestureHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class fdc extends ox4<fdc> {
    public static final pgb<fdc> c = new pgb<>(7);
    public WritableMap a;
    public short b;

    public static final class a {
        public static WritableMap a(GestureHandler gestureHandler) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            writableMapCreateMap.putInt("handlerTag", gestureHandler.d);
            writableMapCreateMap.putInt("state", gestureHandler.f);
            writableMapCreateMap.putInt("numberOfTouches", gestureHandler.o);
            writableMapCreateMap.putInt("eventType", gestureHandler.n);
            writableMapCreateMap.putInt("pointerType", gestureHandler.D);
            WritableArray writableArray = gestureHandler.l;
            gestureHandler.l = null;
            if (writableArray != null) {
                writableMapCreateMap.putArray("changedTouches", writableArray);
            }
            WritableArray writableArray2 = gestureHandler.m;
            gestureHandler.m = null;
            if (writableArray2 != null) {
                writableMapCreateMap.putArray("allTouches", writableArray2);
            }
            if (gestureHandler.H && gestureHandler.f == 4) {
                writableMapCreateMap.putInt("state", 2);
            }
            return writableMapCreateMap;
        }
    }

    @Override // defpackage.ox4
    public final boolean canCoalesce() {
        return true;
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return this.b;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        return this.a;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // defpackage.ox4
    public final void onDispose() {
        this.a = null;
        c.a(this);
    }
}
