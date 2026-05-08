package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.e;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import defpackage.cdc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ddc extends tpc {
    public boolean a;
    public cdc b;

    @Override // defpackage.tpc, android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.a) {
            cdc cdcVar = this.b;
            cdcVar.getClass();
            if (cdcVar.a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.a) {
            cdc cdcVar = this.b;
            cdcVar.getClass();
            if (cdcVar.a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void g(RNGestureHandlerButtonViewManager.a aVar) {
        rz5 rz5Var;
        ArrayList<GestureHandler> arrayListE;
        cdc cdcVar = this.b;
        if (cdcVar == null || (rz5Var = cdcVar.b) == null || (arrayListE = rz5Var.b.e(aVar)) == null) {
            return;
        }
        for (GestureHandler gestureHandler : arrayListE) {
            if (gestureHandler instanceof e) {
                rz5Var.d(gestureHandler, aVar);
                e eVar = (e) gestureHandler;
                gestureHandler.i = true;
                eVar.d();
                eVar.a(false);
                eVar.j();
                j6g j6gVar = j6g.a;
                gestureHandler.i = false;
            }
        }
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        UiThreadUtil.assertOnUiThread();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof ucc) || (parent instanceof ddc)) {
                z = true;
                break;
            } else {
                if (parent instanceof qfd) {
                    break;
                }
            }
        }
        z = false;
        this.a = !z;
        if (z) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.a && this.b == null) {
            Context context = getContext();
            context.getClass();
            this.b = new cdc((ReactContext) context, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        cdc.a aVar;
        if (this.a) {
            cdc cdcVar = this.b;
            cdcVar.getClass();
            if (cdcVar.b != null && !cdcVar.f && (aVar = cdcVar.c) != null && aVar.f == 2) {
                aVar.a(false);
                aVar.j();
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
