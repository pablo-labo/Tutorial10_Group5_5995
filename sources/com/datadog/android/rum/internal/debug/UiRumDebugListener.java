package com.datadog.android.rum.internal.debug;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.monitor.NoOpAdvancedRumMonitor;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.ma7;
import defpackage.mj8;
import defpackage.oa7;
import defpackage.z92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b'\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b(\u0010%J\u001f\u0010*\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010)\u001a\u00020 H\u0017¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b+\u0010%J\u001d\u0010,\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0017¢\u0006\u0004\b,\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\n068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/datadog/android/rum/internal/debug/UiRumDebugListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "advancedRumMonitor", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;)V", "", "", "viewNames", "Lj6g;", "showRumViewsInfo", "(Ljava/util/List;)V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "viewName", "", "alpha", "Landroid/widget/TextView;", "createDebugTextView", "(Landroid/content/Context;Ljava/lang/String;I)Landroid/widget/TextView;", "Landroid/app/Activity;", "activity", "Landroid/widget/FrameLayout;", "findContentView", "(Landroid/app/Activity;)Landroid/widget/FrameLayout;", "", "dp", "dpToPx", "(FLandroid/content/Context;)I", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "onReceiveRumActiveViews", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Landroid/widget/LinearLayout;", "rumViewsContainer", "Landroid/widget/LinearLayout;", "getRumViewsContainer$dd_sdk_android_rum_release", "()Landroid/widget/LinearLayout;", "setRumViewsContainer$dd_sdk_android_rum_release", "(Landroid/widget/LinearLayout;)V", "", "viewsSnapshot", "Ljava/util/List;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class UiRumDebugListener implements Application.ActivityLifecycleCallbacks, RumDebugListener {
    public static final String CANNOT_FIND_CONTENT_VIEW_MESSAGE = "Cannot enable RUM debugging, because root content view can't be found";
    public static final int DEFAULT_ALPHA = 200;
    private final AdvancedRumMonitor advancedRumMonitor;
    private LinearLayout rumViewsContainer;
    private final FeatureSdkCore sdkCore;
    private final List<String> viewsSnapshot;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int ACTIVE_COLOR = Color.rgb(99, 44, 166);

    public UiRumDebugListener(FeatureSdkCore featureSdkCore, AdvancedRumMonitor advancedRumMonitor) {
        featureSdkCore.getClass();
        advancedRumMonitor.getClass();
        this.sdkCore = featureSdkCore;
        this.advancedRumMonitor = advancedRumMonitor;
        this.viewsSnapshot = new ArrayList();
    }

    private final TextView createDebugTextView(Context context, String viewName, int alpha) {
        TextView textView = new TextView(context);
        textView.setGravity(1);
        int i = ACTIVE_COLOR;
        textView.setBackgroundColor(Color.argb(alpha, Color.red(i), Color.green(i), Color.blue(i)));
        textView.setTextColor(-1);
        int iDpToPx = dpToPx(2.0f, context);
        textView.setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        textView.setText(viewName);
        return textView;
    }

    private final int dpToPx(float dp, Context context) {
        return (int) (((double) (dp * context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    private final FrameLayout findContentView(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.content) : null;
        if (viewFindViewById instanceof FrameLayout) {
            return (FrameLayout) viewFindViewById;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceiveRumActiveViews$lambda$4$lambda$3(UiRumDebugListener uiRumDebugListener, List list) {
        uiRumDebugListener.getClass();
        list.getClass();
        uiRumDebugListener.showRumViewsInfo(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showRumViewsInfo(List<String> viewNames) {
        LinearLayout linearLayout = this.rumViewsContainer;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        if (viewNames.isEmpty()) {
            Context context = linearLayout.getContext();
            context.getClass();
            linearLayout.addView(createDebugTextView(context, "No active RUM View", DEFAULT_ALPHA));
            return;
        }
        Iterator it = z92.G1(z92.i1(viewNames)).iterator();
        while (true) {
            oa7 oa7Var = (oa7) it;
            if (!oa7Var.a.hasNext()) {
                return;
            }
            ma7 ma7Var = (ma7) oa7Var.next();
            Context context2 = linearLayout.getContext();
            context2.getClass();
            linearLayout.addView(createDebugTextView(context2, (String) ma7Var.b, (int) (Math.pow(0.75d, ma7Var.a + 1) * 255.0d)));
        }
    }

    /* JADX INFO: renamed from: getRumViewsContainer$dd_sdk_android_rum_release, reason: from getter */
    public final LinearLayout getRumViewsContainer() {
        return this.rumViewsContainer;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.advancedRumMonitor instanceof NoOpAdvancedRumMonitor) {
            return;
        }
        FrameLayout frameLayoutFindContentView = findContentView(activity);
        if (frameLayoutFindContentView != null) {
            frameLayoutFindContentView.removeView(this.rumViewsContainer);
        }
        this.rumViewsContainer = null;
        this.advancedRumMonitor.setDebugListener(null);
        this.viewsSnapshot.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        if (this.advancedRumMonitor instanceof NoOpAdvancedRumMonitor) {
            return;
        }
        FrameLayout frameLayoutFindContentView = findContentView(activity);
        if (frameLayoutFindContentView == null) {
            InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return;
        }
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        this.rumViewsContainer = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        j6g j6gVar = j6g.a;
        frameLayoutFindContentView.addView(linearLayout, layoutParams);
        this.advancedRumMonitor.setDebugListener(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        activity.getClass();
        outState.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0006, B:6:0x000e, B:8:0x001a, B:10:0x0026, B:23:0x0072, B:15:0x0032, B:16:0x0036, B:18:0x0041, B:20:0x0058, B:22:0x0069), top: B:28:0x0006 }] */
    @Override // com.datadog.android.rum.internal.debug.RumDebugListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceiveRumActiveViews(java.util.List<java.lang.String> r5) {
        /*
            r4 = this;
            r5.getClass()
            java.util.List<java.lang.String> r0 = r4.viewsSnapshot
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = r4.viewsSnapshot     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L58
            java.util.List<java.lang.String> r1 = r4.viewsSnapshot     // Catch: java.lang.Throwable -> L30
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L30
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L30
            if (r1 != r2) goto L58
            java.util.List<java.lang.String> r1 = r4.viewsSnapshot     // Catch: java.lang.Throwable -> L30
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L30
            na7 r1 = defpackage.z92.G1(r1)     // Catch: java.lang.Throwable -> L30
            boolean r2 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L30
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            goto L72
        L30:
            r4 = move-exception
            goto L76
        L32:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L30
        L36:
            r2 = r1
            oa7 r2 = (defpackage.oa7) r2     // Catch: java.lang.Throwable -> L30
            java.util.Iterator<T> r2 = r2.a     // Catch: java.lang.Throwable -> L30
            boolean r2 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L72
            r2 = r1
            oa7 r2 = (defpackage.oa7) r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L30
            ma7 r2 = (defpackage.ma7) r2     // Catch: java.lang.Throwable -> L30
            T r3 = r2.b     // Catch: java.lang.Throwable -> L30
            int r2 = r2.a     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = defpackage.z92.R0(r2, r5)     // Catch: java.lang.Throwable -> L30
            boolean r2 = defpackage.wl7.b(r3, r2)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L36
        L58:
            java.util.List<java.lang.String> r1 = r4.viewsSnapshot     // Catch: java.lang.Throwable -> L30
            r1.clear()     // Catch: java.lang.Throwable -> L30
            java.util.List<java.lang.String> r1 = r4.viewsSnapshot     // Catch: java.lang.Throwable -> L30
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L30
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L30
            android.widget.LinearLayout r1 = r4.rumViewsContainer     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L72
            et3 r2 = new et3     // Catch: java.lang.Throwable -> L30
            r3 = 5
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L30
            r1.post(r2)     // Catch: java.lang.Throwable -> L30
        L72:
            j6g r4 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)
            return
        L76:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.debug.UiRumDebugListener.onReceiveRumActiveViews(java.util.List):void");
    }

    public final void setRumViewsContainer$dd_sdk_android_rum_release(LinearLayout linearLayout) {
        this.rumViewsContainer = linearLayout;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/datadog/android/rum/internal/debug/UiRumDebugListener$Companion;", "", "()V", "ACTIVE_COLOR", "", "getACTIVE_COLOR", "()I", "CANNOT_FIND_CONTENT_VIEW_MESSAGE", "", "DEFAULT_ALPHA", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getACTIVE_COLOR() {
            return UiRumDebugListener.ACTIVE_COLOR;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.debug.UiRumDebugListener$onActivityResumed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return UiRumDebugListener.CANNOT_FIND_CONTENT_VIEW_MESSAGE;
        }
    }
}
