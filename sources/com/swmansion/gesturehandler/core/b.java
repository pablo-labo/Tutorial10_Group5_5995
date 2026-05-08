package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.k;
import defpackage.beb;
import defpackage.cdc;
import defpackage.dk6;
import defpackage.gg2;
import defpackage.pz5;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends GestureHandler {
    public static final beb P = new beb();
    public Handler M;
    public final gg2 N = new gg2(this, 5);
    public k O = new k(0);

    public static final class a extends GestureHandler.a<b> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new b();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new dk6((b) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "HoverGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<b> d() {
            return b.class;
        }
    }

    public static Boolean J(View view, View view2, View view3) {
        if (wl7.b(view3, view2)) {
            return Boolean.TRUE;
        }
        if (wl7.b(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Boolean boolJ = J(view, view2, P.i(viewGroup, i));
            if (boolJ != null) {
                return boolJ;
            }
        }
        return null;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final boolean C(GestureHandler gestureHandler) {
        if (!(gestureHandler instanceof b) || ((b) gestureHandler).I(this)) {
            return super.C(gestureHandler);
        }
        View view = gestureHandler.e;
        view.getClass();
        View view2 = this.e;
        view2.getClass();
        Boolean boolJ = J(view, view2, view.getRootView());
        boolJ.getClass();
        return boolJ.booleanValue();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final boolean D(GestureHandler gestureHandler) {
        gestureHandler.getClass();
        if (((gestureHandler instanceof b) && (I(gestureHandler) || ((b) gestureHandler).I(this))) || (gestureHandler instanceof cdc.a)) {
            return true;
        }
        return super.D(gestureHandler);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final boolean E(GestureHandler gestureHandler) {
        gestureHandler.getClass();
        if ((gestureHandler instanceof b) && !I(gestureHandler) && !((b) gestureHandler).I(this)) {
            View view = this.e;
            view.getClass();
            View view2 = gestureHandler.e;
            view2.getClass();
            Boolean boolJ = J(view, view2, view.getRootView());
            if (boolJ != null) {
                return boolJ.booleanValue();
            }
        }
        return super.E(gestureHandler);
    }

    public final void H() {
        int i = this.f;
        if (i == 0) {
            e();
        } else if (i == 2) {
            l();
        } else {
            if (i != 4) {
                return;
            }
            j();
        }
    }

    public final boolean I(GestureHandler gestureHandler) {
        View view = gestureHandler.e;
        while (view != null) {
            if (view.equals(this.e)) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        if (motionEvent.getAction() == 0) {
            Handler handler = this.M;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.M = null;
            return;
        }
        if (motionEvent.getAction() != 1 || this.i) {
            return;
        }
        H();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        if (motionEvent.getAction() == 10) {
            if (this.M == null) {
                this.M = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.M;
            handler.getClass();
            handler.postDelayed(this.N, 4L);
            return;
        }
        if (!this.i) {
            H();
            return;
        }
        if (this.f == 4 && motionEvent.getToolType(0) == 2) {
            this.O = k.a.a(motionEvent);
            return;
        }
        if (this.f == 0) {
            if (motionEvent.getAction() == 7 || motionEvent.getAction() == 9) {
                d();
                a(false);
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        this.O = new k(0);
    }
}
