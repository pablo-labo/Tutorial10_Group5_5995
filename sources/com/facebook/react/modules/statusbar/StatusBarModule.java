package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.views.view.WindowUtilKt;
import defpackage.nmc;
import defpackage.qdb;
import defpackage.s55;
import defpackage.yi0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "StatusBarManager")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "colorDouble", "", "animated", "Lj6g;", "setColor", "(DZ)V", "translucent", "setTranslucent", "(Z)V", "hidden", "setHidden", "style", "setStyle", "(Ljava/lang/String;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public static final class b extends GuardedRunnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, boolean z, int i, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.a = activity;
            this.b = z;
            this.c = i;
            reactApplicationContext.getClass();
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            Activity activity = this.a;
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            boolean z = this.b;
            int i = this.c;
            if (!z) {
                window.setStatusBarColor(i);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(i));
            valueAnimatorOfObject.addUpdateListener(new qdb(activity, 2));
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    public static final class c extends GuardedRunnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, boolean z, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.a = activity;
            this.b = z;
            reactApplicationContext.getClass();
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            Window window = this.a.getWindow();
            if (window != null) {
                WindowUtilKt.setStatusBarTranslucency(window, this.b);
            }
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowUtilKt.setStatusBarVisibility(window, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            decorView.getClass();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if ("dark-content".equals(str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> getTypedExportedConstants() {
        /*
            r3 = this;
            com.facebook.react.bridge.ReactApplicationContext r3 = r3.getReactApplicationContext()
            android.app.Activity r3 = r3.getCurrentActivity()
            if (r3 == 0) goto L2c
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L2c
            int r0 = r0.getStatusBarColor()
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "#%06X"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            goto L2e
        L2c:
            java.lang.String r0 = "black"
        L2e:
            if (r3 == 0) goto L50
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L50
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L50
            java.util.WeakHashMap<android.view.View, prg> r1 = defpackage.epg.a
            rzg r3 = epg.e.a(r3)
            if (r3 != 0) goto L45
            goto L50
        L45:
            r1 = 131(0x83, float:1.84E-43)
            rzg$j r3 = r3.a
            kf7 r3 = r3.g(r1)
            int r3 = r3.b
            goto L51
        L50:
            r3 = 0
        L51:
            float r3 = (float) r3
            float r3 = defpackage.nn2.C(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "HEIGHT"
            r1.<init>(r2, r3)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r2 = "DEFAULT_BACKGROUND_COLOR"
            r3.<init>(r2, r0)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r1, r3}
            java.util.Map r3 = defpackage.lc9.a0(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.statusbar.StatusBarModule.getTypedExportedConstants():java.util.Map");
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double colorDouble, boolean animated) {
        int i = (int) colorDouble;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            s55.n("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            s55.n("ReactNative", "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, animated, i, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean hidden) {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            s55.n("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: qte
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$1(currentActivity, hidden);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(String style) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            s55.n("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new yi0(7, currentActivity, style));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean translucent) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            s55.n("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            s55.n("ReactNative", "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            UiThreadUtil.runOnUiThread(new c(currentActivity, translucent, getReactApplicationContext()));
        }
    }
}
