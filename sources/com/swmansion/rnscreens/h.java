package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.a;
import defpackage.emc;
import defpackage.epg;
import defpackage.ine;
import defpackage.izg;
import defpackage.kf7;
import defpackage.mf4;
import defpackage.n60;
import defpackage.nf7;
import defpackage.prg;
import defpackage.qdb;
import defpackage.rzg;
import defpackage.sqd;
import defpackage.sy3;
import defpackage.tpa;
import defpackage.uzg;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static Integer d;
    public static final c e = new c();

    public static final class a extends GuardedRunnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, Integer num, boolean z, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.a = activity;
            this.b = num;
            this.c = z;
            jSExceptionHandler.getClass();
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            Window window = this.a.getWindow();
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.b);
            valueAnimatorOfObject.addUpdateListener(new qdb(window, 1));
            if (this.c) {
                valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            } else {
                valueAnimatorOfObject.setDuration(0L).setStartDelay(300L);
            }
            valueAnimatorOfObject.start();
        }
    }

    public static final class b extends GuardedRunnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, boolean z, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.a = activity;
            this.b = z;
            jSExceptionHandler.getClass();
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            View decorView = this.a.getWindow().getDecorView();
            decorView.getClass();
            boolean z = this.b;
            c cVar = h.e;
            if (z) {
                nf7.a.a(decorView);
                nf7.b.add(cVar);
            } else {
                nf7.b.remove(cVar);
            }
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.c.c(decorView);
        }
    }

    public static final class c implements tpa {
        @Override // defpackage.tpa
        public final rzg b(View view, rzg rzgVar) {
            view.getClass();
            rzg rzgVarI = epg.i(view, rzgVar);
            int i = Build.VERSION.SDK_INT;
            if (i < 30) {
                rzg rzgVarF = rzgVarI.f(rzgVarI.b(), 0, rzgVarI.c(), rzgVarI.a());
                rzgVarF.getClass();
                return rzgVarF;
            }
            kf7 kf7VarG = rzgVarI.a.g(1);
            kf7VarG.getClass();
            rzg.d cVar = i >= 30 ? new rzg.c() : i >= 29 ? new rzg.b() : new rzg.a();
            cVar.c(1, kf7.b(kf7VarG.a, 0, kf7VarG.c, kf7VarG.d));
            rzg rzgVarB = cVar.b();
            rzgVarB.getClass();
            return rzgVarB;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.swmansion.rnscreens.a r1, com.swmansion.rnscreens.a.e r2) {
        /*
            int r2 = r2.ordinal()
            r0 = 0
            switch(r2) {
                case 0: goto L3a;
                case 1: goto L33;
                case 2: goto L2c;
                case 3: goto L27;
                case 4: goto L22;
                case 5: goto L1d;
                case 6: goto L16;
                case 7: goto L11;
                case 8: goto Lc;
                default: goto L8;
            }
        L8:
            defpackage.l.g()
            return r0
        Lc:
            java.lang.Boolean r1 = r1.y0
            if (r1 == 0) goto L42
            goto L40
        L11:
            java.lang.Boolean r1 = r1.x0
            if (r1 == 0) goto L42
            goto L40
        L16:
            java.lang.Integer r1 = r1.getNavigationBarColor()
            if (r1 == 0) goto L42
            goto L40
        L1d:
            java.lang.Boolean r1 = r1.g0
            if (r1 == 0) goto L42
            goto L40
        L22:
            java.lang.Boolean r1 = r1.t0
            if (r1 == 0) goto L42
            goto L40
        L27:
            java.lang.Boolean r1 = r1.u0
            if (r1 == 0) goto L42
            goto L40
        L2c:
            java.lang.String r1 = r1.getStatusBarStyle()
            if (r1 == 0) goto L42
            goto L40
        L33:
            java.lang.Integer r1 = r1.getStatusBarColor()
            if (r1 == 0) goto L42
            goto L40
        L3a:
            java.lang.Integer r1 = r1.getScreenOrientation()
            if (r1 == 0) goto L42
        L40:
            r1 = 1
            return r1
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.h.a(com.swmansion.rnscreens.a, com.swmansion.rnscreens.a$e):boolean");
    }

    public static com.swmansion.rnscreens.a b(com.swmansion.rnscreens.a aVar, a.e eVar) {
        sqd fragmentWrapper;
        if (aVar == null || (fragmentWrapper = aVar.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator<com.swmansion.rnscreens.b> it = fragmentWrapper.n().iterator();
        while (it.hasNext()) {
            com.swmansion.rnscreens.a topScreen = it.next().getTopScreen();
            com.swmansion.rnscreens.a aVarB = b(topScreen, eVar);
            if (aVarB != null) {
                return aVarB;
            }
            if (topScreen != null && a(topScreen, eVar)) {
                return topScreen;
            }
        }
        return null;
    }

    public static com.swmansion.rnscreens.a c(com.swmansion.rnscreens.a aVar, a.e eVar) {
        com.swmansion.rnscreens.a aVarB = b(aVar, eVar);
        if (aVarB != null) {
            return aVarB;
        }
        if (a(aVar, eVar)) {
            return aVar;
        }
        for (ViewParent container = aVar.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof com.swmansion.rnscreens.a) {
                com.swmansion.rnscreens.a aVar2 = (com.swmansion.rnscreens.a) container;
                if (a(aVar2, eVar)) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    @sy3
    public static void d(com.swmansion.rnscreens.a aVar, Activity activity, ReactContext reactContext) {
        Integer statusBarColor;
        Boolean bool;
        if (activity == null || reactContext == null) {
            return;
        }
        if (d == null) {
            d = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        com.swmansion.rnscreens.a aVarC = c(aVar, a.e.b);
        com.swmansion.rnscreens.a aVarC2 = c(aVar, a.e.f);
        if (aVarC == null || (statusBarColor = aVarC.getStatusBarColor()) == null) {
            statusBarColor = d;
        }
        UiThreadUtil.runOnUiThread(new a(activity, statusBarColor, (aVarC2 == null || (bool = aVarC2.g0) == null) ? false : bool.booleanValue(), reactContext.getExceptionHandler()));
    }

    public static void e(com.swmansion.rnscreens.a aVar, Activity activity) {
        Boolean bool;
        if (activity == null) {
            return;
        }
        com.swmansion.rnscreens.a aVarC = c(aVar, a.e.e);
        boolean zBooleanValue = (aVarC == null || (bool = aVarC.t0) == null) ? false : bool.booleanValue();
        Window window = activity.getWindow();
        UiThreadUtil.runOnUiThread(new emc(zBooleanValue, new uzg(window, window.getDecorView())));
    }

    @sy3
    public static void f(com.swmansion.rnscreens.a aVar, Activity activity) {
        Integer navigationBarColor;
        if (activity == null) {
            return;
        }
        final Window window = activity.getWindow();
        com.swmansion.rnscreens.a aVarC = c(aVar, a.e.V);
        final int navigationBarColor2 = (aVarC == null || (navigationBarColor = aVarC.getNavigationBarColor()) == null) ? window.getNavigationBarColor() : navigationBarColor.intValue();
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: frd
            @Override // java.lang.Runnable
            public final void run() {
                Window window2 = window;
                ine ineVar = new ine(window2.getDecorView());
                int i = Build.VERSION.SDK_INT;
                uzg.g fVar = i >= 35 ? new uzg.f(window2, ineVar) : i >= 30 ? new uzg.d(window2, ineVar) : new uzg.c(window2, ineVar);
                int i2 = navigationBarColor2;
                fVar.c(1.0d - (((((double) Color.blue(i2)) * 0.114d) + ((((double) Color.green(i2)) * 0.587d) + (((double) Color.red(i2)) * 0.299d))) / 255.0d) < 0.5d);
            }
        });
        window.setNavigationBarColor(navigationBarColor2);
    }

    public static void g(com.swmansion.rnscreens.a aVar, Activity activity) {
        Boolean bool;
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        com.swmansion.rnscreens.a aVarC = c(aVar, a.e.X);
        if (!((aVarC == null || (bool = aVarC.y0) == null) ? false : bool.booleanValue())) {
            ine ineVar = new ine(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            (i >= 35 ? new uzg.f(window, ineVar) : i >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar)).f(2);
        } else {
            ine ineVar2 = new ine(window.getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            uzg.g fVar = i2 >= 35 ? new uzg.f(window, ineVar2) : i2 >= 30 ? new uzg.d(window, ineVar2) : new uzg.c(window, ineVar2);
            fVar.a(2);
            fVar.e();
        }
    }

    @sy3
    public static void h(com.swmansion.rnscreens.a aVar, Activity activity) {
        Boolean bool;
        if (activity == null || mf4.a) {
            return;
        }
        Window window = activity.getWindow();
        com.swmansion.rnscreens.a aVarC = c(aVar, a.e.W);
        if (aVarC == null || (bool = aVarC.x0) == null) {
            return;
        }
        izg.a(window, !bool.booleanValue());
    }

    public static void i(com.swmansion.rnscreens.a aVar, Activity activity, ReactContext reactContext) {
        String statusBarStyle;
        if (activity == null || reactContext == null) {
            return;
        }
        com.swmansion.rnscreens.a aVarC = c(aVar, a.e.c);
        if (aVarC == null || (statusBarStyle = aVarC.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new n60(7, activity, statusBarStyle));
    }

    @sy3
    public static void j(com.swmansion.rnscreens.a aVar, Activity activity, ReactContext reactContext) {
        Boolean bool;
        if (activity == null || reactContext == null || mf4.a) {
            return;
        }
        com.swmansion.rnscreens.a aVarC = c(aVar, a.e.d);
        UiThreadUtil.runOnUiThread(new b(activity, (aVarC == null || (bool = aVarC.u0) == null) ? false : bool.booleanValue(), reactContext.getExceptionHandler()));
    }

    public static void k(com.swmansion.rnscreens.a aVar, Activity activity, ReactContext reactContext) {
        Integer screenOrientation;
        if (a && activity != null) {
            com.swmansion.rnscreens.a aVarC = c(aVar, a.e.a);
            activity.setRequestedOrientation((aVarC == null || (screenOrientation = aVarC.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
        }
        if (b) {
            d(aVar, activity, reactContext);
            i(aVar, activity, reactContext);
            j(aVar, activity, reactContext);
            e(aVar, activity);
        }
        if (c) {
            f(aVar, activity);
            h(aVar, activity);
            g(aVar, activity);
        }
    }
}
