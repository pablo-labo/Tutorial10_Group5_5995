package defpackage;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.GestureHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class vcc extends ox4<vcc> {
    public static final pgb<vcc> d = new pgb<>(7);
    public pz5<?> a;
    public short b;
    public boolean c;

    public static final class a {
        public static vcc a(GestureHandler gestureHandler, pz5 pz5Var, boolean z) {
            pz5Var.getClass();
            vcc vccVarAcquire = vcc.d.acquire();
            if (vccVarAcquire == null) {
                vccVarAcquire = new vcc();
            }
            View view = gestureHandler.e;
            view.getClass();
            vccVarAcquire.init(dmc.h(view), view.getId());
            vccVarAcquire.a = pz5Var;
            vccVarAcquire.c = z;
            vccVarAcquire.b = gestureHandler.s;
            return vccVarAcquire;
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
        pz5<?> pz5Var = this.a;
        pz5Var.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        pz5Var.a(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return this.c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // defpackage.ox4
    public final void onDispose() {
        this.a = null;
        d.a(this);
    }
}
