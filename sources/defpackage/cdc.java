package defpackage;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class cdc {
    public final ReactContext a;
    public final rz5 b;
    public final a c;
    public final ViewGroup d;
    public boolean e;
    public boolean f;

    public final class a extends GestureHandler {
        public a(int i) {
            this.d = i;
        }

        public final void H(MotionEvent motionEvent) {
            rz5 rz5Var;
            ArrayList<GestureHandler> arrayList;
            if (this.f == 0) {
                cdc cdcVar = cdc.this;
                if (!cdcVar.e || (rz5Var = this.A) == null || ((arrayList = rz5Var.e) != null && arrayList.isEmpty())) {
                    d();
                    cdcVar.e = false;
                } else {
                    Iterator<GestureHandler> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().f == 4) {
                            break;
                        }
                    }
                    d();
                    cdcVar.e = false;
                }
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                j();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.swmansion.gesturehandler.core.GestureHandler
        public final void r() {
            cdc cdcVar = cdc.this;
            cdcVar.e = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            ViewGroup viewGroup = cdcVar.d;
            if (viewGroup instanceof qfd) {
                ((qfd) viewGroup).b(viewGroup, motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
            motionEvent2.getClass();
            H(motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
            motionEvent2.getClass();
            H(motionEvent);
        }
    }

    public cdc(ReactContext reactContext, ddc ddcVar) {
        this.a = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id = ddcVar.getId();
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        nativeModule.getClass();
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        bdc registry = rNGestureHandlerModule.getRegistry();
        UiThreadUtil.assertOnUiThread();
        ViewParent parent = ddcVar;
        while (parent != null && !(parent instanceof qfd)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            v40.o("View ", ddcVar, " has not been mounted under ReactRootView");
            throw null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.d = viewGroup;
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroup);
        rz5 rz5Var = new rz5(ddcVar, registry, new beb());
        rz5Var.d = 0.1f;
        this.b = rz5Var;
        a aVar = new a(-id);
        this.c = aVar;
        synchronized (registry) {
            registry.a.put(aVar.d, aVar);
        }
        registry.a(aVar.d, id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdc.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.d);
        NativeModule nativeModule = ((mkf) this.a).a.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        nativeModule.getClass();
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        bdc registry = rNGestureHandlerModule.getRegistry();
        a aVar = this.c;
        aVar.getClass();
        registry.c(aVar.d);
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
