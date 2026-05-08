package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import defpackage.f9a;
import defpackage.ikc;
import defpackage.k6;
import defpackage.opc;
import defpackage.pz5;
import defpackage.rz5;
import defpackage.s6;
import defpackage.soc;
import defpackage.tpc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends GestureHandler {
    public static final a P = new a();
    public boolean M;
    public boolean N;
    public InterfaceC0193e O = P;

    public static final class a implements InterfaceC0193e {
        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean a() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean b(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean c() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean d(View view) {
            return InterfaceC0193e.a.a(view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return Boolean.valueOf(view.onTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void f(MotionEvent motionEvent) {
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean g(GestureHandler gestureHandler) {
            gestureHandler.getClass();
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void h(MotionEvent motionEvent) {
        }
    }

    public static final class b {
    }

    public static final class c implements InterfaceC0193e {
        public final e a;
        public final ikc b;
        public float c;
        public float d;
        public final int e;

        public c(e eVar, ikc ikcVar) {
            ikcVar.getClass();
            this.a = eVar;
            this.b = ikcVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(ikcVar.getContext());
            this.e = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean a() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean b(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean c() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean d(View view) {
            return InterfaceC0193e.a.a(view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return Boolean.valueOf(view.onTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void f(MotionEvent motionEvent) {
            this.a.a(false);
            this.b.onTouchEvent(motionEvent);
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean g(GestureHandler gestureHandler) {
            gestureHandler.getClass();
            return Boolean.valueOf(gestureHandler.d > 0 && !(gestureHandler instanceof e));
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void h(MotionEvent motionEvent) {
            if (k6.b(motionEvent.getY(), this.d, motionEvent.getY() - this.d, (motionEvent.getX() - this.c) * (motionEvent.getX() - this.c)) < this.e) {
                this.b.i();
            }
        }
    }

    public static final class d extends GestureHandler.a<e> {
        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final GestureHandler a(ReactApplicationContext reactApplicationContext) {
            return new e();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final pz5 b(GestureHandler gestureHandler) {
            return new f9a((e) gestureHandler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final String c() {
            return "NativeViewGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final Class<e> d() {
            return e.class;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.a
        public final void e(GestureHandler gestureHandler, ReadableMap readableMap) {
            e eVar = (e) gestureHandler;
            super.e(eVar, readableMap);
            if (readableMap.hasKey("shouldActivateOnStart")) {
                eVar.M = readableMap.getBoolean("shouldActivateOnStart");
            }
            if (readableMap.hasKey("disallowInterruption")) {
                eVar.N = readableMap.getBoolean("disallowInterruption");
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.e$e, reason: collision with other inner class name */
    public interface InterfaceC0193e {

        /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.e$e$a */
        public static final class a {
            public static boolean a(View view) {
                view.getClass();
                return view.isPressed();
            }
        }

        boolean a();

        boolean b(MotionEvent motionEvent);

        boolean c();

        boolean d(View view);

        Boolean e(View view, MotionEvent motionEvent);

        void f(MotionEvent motionEvent);

        Boolean g(GestureHandler gestureHandler);

        void h(MotionEvent motionEvent);
    }

    public static final class f implements InterfaceC0193e {
        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean a() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean b(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean c() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean d(View view) {
            return InterfaceC0193e.a.a(view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void f(MotionEvent motionEvent) {
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean g(GestureHandler gestureHandler) {
            gestureHandler.getClass();
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void h(MotionEvent motionEvent) {
        }
    }

    public static final class g implements InterfaceC0193e {
        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean a() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean b(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean c() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean d(View view) {
            return InterfaceC0193e.a.a(view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return Boolean.valueOf(view.onTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void f(MotionEvent motionEvent) {
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean g(GestureHandler gestureHandler) {
            gestureHandler.getClass();
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void h(MotionEvent motionEvent) {
        }
    }

    public static final class h implements InterfaceC0193e {
        public final e a;
        public final soc b;

        public h(e eVar, soc socVar) {
            socVar.getClass();
            this.a = eVar;
            this.b = socVar;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean a() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean b(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean c() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean d(View view) {
            return InterfaceC0193e.a.a(view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return Boolean.valueOf(view.onTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void f(MotionEvent motionEvent) {
            ArrayList<GestureHandler> arrayListE;
            View childAt = this.b.getChildAt(0);
            gestureHandler = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            e eVar = this.a;
            rz5 rz5Var = eVar.A;
            if (rz5Var != null && (arrayListE = rz5Var.b.e(scrollView)) != null) {
                for (GestureHandler gestureHandler : arrayListE) {
                    if (gestureHandler instanceof e) {
                    }
                }
                s6.j("Collection contains no element matching the predicate.");
                return;
            }
            if (gestureHandler == null || gestureHandler.f != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            eVar.l();
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean g(GestureHandler gestureHandler) {
            gestureHandler.getClass();
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void h(MotionEvent motionEvent) {
        }
    }

    public static final class i implements InterfaceC0193e {
        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean a() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean b(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean c() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean d(View view) {
            view.getClass();
            return view instanceof opc;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return Boolean.valueOf(view.onTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void f(MotionEvent motionEvent) {
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean g(GestureHandler gestureHandler) {
            gestureHandler.getClass();
            return Boolean.FALSE;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void h(MotionEvent motionEvent) {
        }
    }

    public e() {
        this.z = true;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final boolean C(GestureHandler gestureHandler) {
        return !this.N;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final boolean D(GestureHandler gestureHandler) {
        gestureHandler.getClass();
        Boolean boolG = this.O.g(gestureHandler);
        if (boolG != null) {
            return boolG.booleanValue();
        }
        if (super.D(gestureHandler)) {
            return true;
        }
        if ((gestureHandler instanceof e) && gestureHandler.f == 4 && ((e) gestureHandler).N) {
            return false;
        }
        boolean z = this.N;
        int i2 = gestureHandler.f;
        int i3 = this.f;
        if ((i3 == 4 && i2 == 4 && !z) || i3 != 4 || z) {
            return false;
        }
        return !this.O.a() || gestureHandler.d > 0;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void r() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        this.O.e(this.e, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void s() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        this.O.e(this.e, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void t(MotionEvent motionEvent, MotionEvent motionEvent2) {
        motionEvent2.getClass();
        View view = this.e;
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        boolean zIsTouchExplorationEnabled = ((AccessibilityManager) systemService).isTouchExplorationEnabled();
        if ((view instanceof RNGestureHandlerButtonViewManager.a) && zIsTouchExplorationEnabled) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f;
        if (actionMasked == 1) {
            if (i2 != 0 || this.O.b(motionEvent)) {
                this.O.e(view, motionEvent);
                int i3 = this.f;
                if ((i3 == 0 || i3 == 2) && this.O.d(view)) {
                    a(false);
                }
                if (this.f == 0) {
                    e();
                } else {
                    j();
                }
            } else {
                e();
            }
            this.O.h(motionEvent);
            return;
        }
        if (i2 != 0 && i2 != 2) {
            if (i2 == 4) {
                this.O.e(view, motionEvent);
                return;
            }
            return;
        }
        if (this.M) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
            }
            this.O.e(view, motionEvent);
            a(false);
            return;
        }
        boolean z = (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        InterfaceC0193e interfaceC0193e = this.O;
        if (z) {
            interfaceC0193e.e(view, motionEvent);
            a(false);
        } else if (interfaceC0193e.c()) {
            this.O.f(motionEvent);
        } else {
            if (this.f == 2 || !this.O.b(motionEvent)) {
                return;
            }
            d();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void v() {
        KeyEvent.Callback callback = this.e;
        if (callback instanceof InterfaceC0193e) {
            this.O = (InterfaceC0193e) callback;
            return;
        }
        if (callback instanceof ikc) {
            this.O = new c(this, (ikc) callback);
            return;
        }
        if (callback instanceof soc) {
            this.O = new h(this, (soc) callback);
            return;
        }
        if (callback instanceof com.facebook.react.views.scroll.c) {
            this.O = new g();
            return;
        }
        if (callback instanceof com.facebook.react.views.scroll.b) {
            this.O = new g();
        } else if (callback instanceof opc) {
            this.O = new i();
        } else if (callback instanceof tpc) {
            this.O = new f();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void w() {
        this.O = P;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public final void y() {
        super.y();
        this.M = false;
        this.N = false;
        this.z = true;
    }
}
