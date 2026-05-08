package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.swmansion.gesturehandler.core.GestureHandler;
import defpackage.edc;
import defpackage.fdc;
import defpackage.vcc;

/* JADX INFO: loaded from: classes3.dex */
public final class wcc implements lra {
    public final ReactApplicationContext a;

    public wcc(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
    }

    @Override // defpackage.lra
    public final <T extends GestureHandler> void a(T t, int i, int i2) {
        GestureHandler.a<?> aVar;
        if (t.d < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 9) {
                aVar = null;
                break;
            }
            aVar = xcc.a[i3];
            if (aVar.d().equals(t.getClass())) {
                break;
            } else {
                i3++;
            }
        }
        if (aVar == null) {
            return;
        }
        int i4 = t.k;
        if (i4 != 1) {
            if (i4 == 2 || i4 == 3) {
                pgb<edc> pgbVar = edc.d;
                d("onGestureHandlerStateChange", edc.a.a(aVar.b(t), i, i2));
                return;
            } else {
                if (i4 != 4) {
                    return;
                }
                pgb<edc> pgbVar2 = edc.d;
                d("onGestureHandlerStateChange", edc.a.a(aVar.b(t), i, i2));
                return;
            }
        }
        pgb<edc> pgbVar3 = edc.d;
        pz5<?> pz5VarB = aVar.b(t);
        edc edcVarAcquire = edc.d.acquire();
        if (edcVarAcquire == null) {
            edcVarAcquire = new edc();
        }
        View view = t.e;
        view.getClass();
        edcVarAcquire.init(dmc.h(view), view.getId());
        edcVarAcquire.a = pz5VarB;
        edcVarAcquire.b = i;
        edcVarAcquire.c = i2;
    }

    @Override // defpackage.lra
    public final <T extends GestureHandler> void b(T t) {
        if (t.d < 0) {
            return;
        }
        int i = t.f;
        if (i == 2 || i == 4 || i == 0 || t.e != null) {
            int i2 = t.k;
            if (i2 != 1) {
                if (i2 != 4) {
                    return;
                }
                pgb<fdc> pgbVar = fdc.c;
                d("onGestureHandlerEvent", fdc.a.a(t));
                return;
            }
            fdc fdcVarAcquire = fdc.c.acquire();
            if (fdcVarAcquire == null) {
                fdcVarAcquire = new fdc();
            }
            View view = t.e;
            view.getClass();
            fdcVarAcquire.init(dmc.h(view), view.getId());
            fdcVarAcquire.a = fdc.a.a(t);
            fdcVarAcquire.b = t.s;
        }
    }

    @Override // defpackage.lra
    public final <T extends GestureHandler> void c(T t, MotionEvent motionEvent) {
        GestureHandler.a<?> aVar;
        if (t.d < 0 || t.f != 4) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= 9) {
                aVar = null;
                break;
            }
            aVar = xcc.a[i];
            if (aVar.d().equals(t.getClass())) {
                break;
            } else {
                i++;
            }
        }
        if (aVar == null) {
            return;
        }
        int i2 = t.k;
        if (i2 == 1) {
            pgb<vcc> pgbVar = vcc.d;
            vcc.a.a(t, aVar.b(t), false);
            return;
        }
        if (i2 == 2) {
            pgb<vcc> pgbVar2 = vcc.d;
            vcc vccVarA = vcc.a.a(t, aVar.b(t), true);
            UIManager uIManagerJ = dmc.j(this.a, 2, true);
            uIManagerJ.getClass();
            ((FabricUIManager) uIManagerJ).getEventDispatcher().a(vccVarA);
            return;
        }
        if (i2 == 3) {
            pgb<vcc> pgbVar3 = vcc.d;
            pz5<T> pz5VarB = aVar.b(t);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.getClass();
            pz5VarB.a(writableMapCreateMap);
            d("onGestureHandlerEvent", writableMapCreateMap);
            return;
        }
        if (i2 != 4) {
            return;
        }
        pgb<vcc> pgbVar4 = vcc.d;
        pz5<T> pz5VarB2 = aVar.b(t);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.getClass();
        pz5VarB2.a(writableMapCreateMap2);
        d("onGestureHandlerEvent", writableMapCreateMap2);
    }

    public final void d(String str, WritableMap writableMap) {
        JavaScriptModule jSModule = this.a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        jSModule.getClass();
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule).emit(str, writableMap);
    }
}
