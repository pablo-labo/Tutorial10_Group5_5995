package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class edc extends ox4<edc> {
    public static final pgb<edc> d = new pgb<>(7);
    public pz5<?> a;
    public int b;
    public int c;

    public static final class a {
        public static WritableMap a(pz5 pz5Var, int i, int i2) {
            pz5Var.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            pz5Var.a(writableMapCreateMap);
            writableMapCreateMap.putInt("state", i);
            writableMapCreateMap.putInt("oldState", i2);
            return writableMapCreateMap;
        }
    }

    @Override // defpackage.ox4
    public final boolean canCoalesce() {
        return false;
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        pz5<?> pz5Var = this.a;
        pz5Var.getClass();
        return a.a(pz5Var, this.b, this.c);
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // defpackage.ox4
    public final void onDispose() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        d.a(this);
    }
}
