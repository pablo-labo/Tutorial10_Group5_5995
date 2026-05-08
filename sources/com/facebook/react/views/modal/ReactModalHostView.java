package com.facebook.react.views.modal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.WindowUtilKt;
import com.indeed.android.jobsearch.R;
import defpackage.c74;
import defpackage.g84;
import defpackage.hg2;
import defpackage.ine;
import defpackage.l5;
import defpackage.mkf;
import defpackage.nn2;
import defpackage.ot7;
import defpackage.qfd;
import defpackage.r6;
import defpackage.rzg;
import defpackage.s55;
import defpackage.sj4;
import defpackage.tpc;
import defpackage.u63;
import defpackage.uzg;
import defpackage.vse;
import defpackage.wl7;
import defpackage.wpa;
import defpackage.yo7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@g84
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003!\u0013\u0019J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR*\u00107\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR.\u0010=\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\rR*\u0010A\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001a\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR(\u0010C\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "id", "Lj6g;", "setId", "(I)V", "getChildCount", "()I", "", "testId", "setDialogRootViewGroupTestId", "(Ljava/lang/String;)V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "Lhg2;", "value", "a", "Lhg2;", "getDialog", "()Lhg2;", "dialog", "", "b", "Z", "getTransparent", "()Z", "setTransparent", "(Z)V", "transparent", "Landroid/content/DialogInterface$OnShowListener;", "c", "Landroid/content/DialogInterface$OnShowListener;", "getOnShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setOnShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "onShowListener", "Lcom/facebook/react/views/modal/ReactModalHostView$c;", "d", "Lcom/facebook/react/views/modal/ReactModalHostView$c;", "getOnRequestCloseListener", "()Lcom/facebook/react/views/modal/ReactModalHostView$c;", "setOnRequestCloseListener", "(Lcom/facebook/react/views/modal/ReactModalHostView$c;)V", "onRequestCloseListener", "e", "getStatusBarTranslucent", "setStatusBarTranslucent", "statusBarTranslucent", "f", "getNavigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarTranslucent", "V", "Ljava/lang/String;", "getAnimationType", "()Ljava/lang/String;", "setAnimationType", "animationType", "W", "getHardwareAccelerated", "setHardwareAccelerated", "hardwareAccelerated", "Lvse;", "stateWrapper", "getStateWrapper", "()Lvse;", "setStateWrapper", "(Lvse;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ReactModalHostView extends ViewGroup implements LifecycleEventListener {
    public static final a c0 = new a();
    public static int d0;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String animationType;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean hardwareAccelerated;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public hg2 dialog;
    public final b a0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean transparent;
    public boolean b0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public DialogInterface.OnShowListener onShowListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public c onRequestCloseListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean statusBarTranslucent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean navigationBarTranslucent;

    public static final class a {
        public static final /* synthetic */ long a() {
            return ReactModalHostView.c0.getScreenDisplayMetricsWithoutInsets();
        }

        @g84
        private final long getScreenDisplayMetricsWithoutInsets() {
            DisplayMetrics displayMetricsC = c74.c();
            return (((long) Float.floatToRawIntBits(nn2.C(displayMetricsC.widthPixels))) << 32) | ((long) Float.floatToRawIntBits(nn2.C(displayMetricsC.heightPixels - ReactModalHostView.d0)));
        }
    }

    public static final class b extends tpc implements qfd {
        public vse a;
        public EventDispatcher b;
        public int c;
        public int d;
        public final ot7 e;
        public final yo7 f;

        public b(mkf mkfVar) {
            super(mkfVar);
            this.e = new ot7(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.f = new yo7(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final mkf getReactContext() {
            Context context = getContext();
            context.getClass();
            return (mkf) context;
        }

        @Override // defpackage.qfd
        public final void b(View view, MotionEvent motionEvent) {
            motionEvent.getClass();
            EventDispatcher eventDispatcher = this.b;
            if (eventDispatcher != null) {
                this.e.c(motionEvent, eventDispatcher);
                yo7 yo7Var = this.f;
                if (yo7Var != null) {
                    yo7Var.g(view, motionEvent, eventDispatcher);
                }
            }
        }

        @Override // defpackage.qfd
        public final void e(ViewGroup viewGroup, MotionEvent motionEvent) {
            if (this.b != null) {
                ot7 ot7Var = this.e;
                ot7Var.getClass();
                ot7Var.d = false;
            }
            yo7 yo7Var = this.f;
            if (yo7Var != null) {
                yo7Var.e = -1;
            }
        }

        public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
            return this.b;
        }

        public final vse getStateWrapper$ReactAndroid_release() {
            return this.a;
        }

        @Override // defpackage.tpc, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            yo7 yo7Var;
            motionEvent.getClass();
            EventDispatcher eventDispatcher = this.b;
            if (eventDispatcher != null && (yo7Var = this.f) != null) {
                yo7Var.d(motionEvent, eventDispatcher, false);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            accessibilityNodeInfo.getClass();
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            String str = (String) getTag(R.id.react_test_id);
            if (str != null) {
                accessibilityNodeInfo.setViewIdResourceName(str);
            }
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
            yo7 yo7Var;
            motionEvent.getClass();
            EventDispatcher eventDispatcher = this.b;
            if (eventDispatcher != null && (yo7Var = this.f) != null) {
                yo7Var.d(motionEvent, eventDispatcher, true);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // defpackage.tpc, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            motionEvent.getClass();
            EventDispatcher eventDispatcher = this.b;
            if (eventDispatcher != null) {
                this.e.b(motionEvent, eventDispatcher, getReactContext());
                yo7 yo7Var = this.f;
                if (yo7Var != null) {
                    yo7Var.d(motionEvent, eventDispatcher, true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // defpackage.tpc, android.view.View
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.c = i;
            this.d = i2;
            float fC = nn2.C(i);
            float fC2 = nn2.C(i2);
            vse vseVar = this.a;
            if (vseVar == null) {
                getReactContext().runOnNativeModulesQueueThread(new com.facebook.react.views.modal.a(this, getReactContext()));
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", fC);
            writableNativeMap.putDouble("screenHeight", fC2);
            vseVar.updateState(writableNativeMap);
        }

        @Override // defpackage.tpc, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            motionEvent.getClass();
            EventDispatcher eventDispatcher = this.b;
            if (eventDispatcher != null) {
                this.e.b(motionEvent, eventDispatcher, getReactContext());
                yo7 yo7Var = this.f;
                if (yo7Var != null) {
                    yo7Var.d(motionEvent, eventDispatcher, false);
                }
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public final void requestDisallowInterceptTouchEvent(boolean z) {
        }

        public final void setEventDispatcher$ReactAndroid_release(EventDispatcher eventDispatcher) {
            this.b = eventDispatcher;
        }

        public final void setStateWrapper$ReactAndroid_release(vse vseVar) {
            this.a = vseVar;
        }
    }

    public interface c {
    }

    public static final class d implements DialogInterface.OnKeyListener {
        public final /* synthetic */ sj4 a;
        public final /* synthetic */ ReactModalHostView b;

        public d(sj4 sj4Var, ReactModalHostView reactModalHostView) {
            this.a = sj4Var;
            this.b = reactModalHostView;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            dialogInterface.getClass();
            keyEvent.getClass();
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i == 4 || i == 111) {
                this.a.invoke();
                return true;
            }
            Context context = this.b.getContext();
            context.getClass();
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i, keyEvent);
            }
            return false;
        }
    }

    public static final class e extends wpa {
        public final /* synthetic */ sj4 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(sj4 sj4Var) {
            super(true);
            this.d = sj4Var;
        }

        @Override // defpackage.wpa
        public final void b() {
            this.d.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReactModalHostView(defpackage.mkf r3) {
        /*
            r2 = this;
            r2.<init>(r3)
            com.facebook.react.bridge.ReactApplicationContext r0 = r3.a
            android.app.Activity r0 = r0.getCurrentActivity()
            if (r0 == 0) goto L2b
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L2b
            java.util.WeakHashMap<android.view.View, prg> r1 = defpackage.epg.a
            rzg r0 = epg.e.a(r0)
            if (r0 != 0) goto L20
            goto L2b
        L20:
            r1 = 131(0x83, float:1.84E-43)
            rzg$j r0 = r0.a
            kf7 r0 = r0.g(r1)
            int r0 = r0.b
            goto L2c
        L2b:
            r0 = 0
        L2c:
            com.facebook.react.views.modal.ReactModalHostView.d0 = r0
            com.facebook.react.views.modal.ReactModalHostView$b r0 = new com.facebook.react.views.modal.ReactModalHostView$b
            r0.<init>(r3)
            r2.a0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.modal.ReactModalHostView.<init>(mkf):void");
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.a0);
        if (!getStatusBarTranslucent()) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        context.getClass();
        return ((mkf) context).a.getCurrentActivity();
    }

    @g84
    private static final long getScreenDisplayMetricsWithoutInsets() {
        return a.a();
    }

    public final void a() {
        Context baseContext;
        UiThreadUtil.assertOnUiThread();
        hg2 hg2Var = this.dialog;
        if (hg2Var != null) {
            if (hg2Var.isShowing()) {
                Context context = hg2Var.getContext();
                while (!Activity.class.isInstance(context)) {
                    if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                        context = null;
                        break;
                    }
                    context = baseContext;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    hg2Var.dismiss();
                }
            }
            this.dialog = null;
            this.b0 = true;
            ViewParent parent = this.a0.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList<View> arrayList) {
        arrayList.getClass();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.a0.addView(view, i);
    }

    public final void b() {
        Context context = getContext();
        context.getClass();
        ((mkf) context).a.removeLifecycleEventListener(this);
        a();
    }

    public final void c() {
        UiThreadUtil.assertOnUiThread();
        if (!this.b0) {
            d();
            return;
        }
        a();
        this.b0 = false;
        String str = this.animationType;
        int i = wl7.b(str, "fade") ? R.style.Theme_FullScreenDialogAnimatedFade : wl7.b(str, "slide") ? R.style.Theme_FullScreenDialogAnimatedSlide : R.style.Theme_FullScreenDialog;
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity != null ? currentActivity : getContext();
        context.getClass();
        hg2 hg2Var = new hg2(context, i);
        this.dialog = hg2Var;
        Window window = hg2Var.getWindow();
        if (window == null) {
            l5.q("Required value was null.");
            return;
        }
        window.setFlags(8, 8);
        hg2Var.setContentView(getContentView());
        d();
        hg2Var.setOnShowListener(this.onShowListener);
        sj4 sj4Var = new sj4(5, this, hg2Var);
        hg2Var.c.a(hg2Var, new e(sj4Var));
        hg2Var.setOnKeyListener(new d(sj4Var, this));
        window.setSoftInputMode(16);
        if (this.hardwareAccelerated) {
            window.addFlags(16777216);
        }
        if (currentActivity != null && (currentActivity.getWindow().getAttributes().flags & 8192) != 0) {
            window.setFlags(8192, 8192);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        hg2Var.show();
        Activity currentActivity2 = getCurrentActivity();
        if (currentActivity2 != null) {
            hg2 hg2Var2 = this.dialog;
            if (hg2Var2 == null) {
                r6.g("dialog must exist when we call updateProperties");
                return;
            }
            Window window2 = hg2Var2.getWindow();
            if (window2 == null) {
                r6.g("dialog must have window when we call updateProperties");
                return;
            }
            Window window3 = currentActivity2.getWindow();
            if (Build.VERSION.SDK_INT > 30) {
                ine ineVar = new ine(window3.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                uzg.g fVar = i2 >= 35 ? new uzg.f(window3, ineVar) : i2 >= 30 ? new uzg.d(window3, ineVar) : new uzg.c(window3, ineVar);
                ine ineVar2 = new ine(window2.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                uzg.g fVar2 = i3 >= 35 ? new uzg.f(window2, ineVar2) : i3 >= 30 ? new uzg.d(window2, ineVar2) : new uzg.c(window2, ineVar2);
                if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
                    fVar.e();
                    fVar2.e();
                }
                fVar2.d(fVar.b());
                WindowInsets rootWindowInsets = window3.getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    rzg rzgVarH = rzg.h(null, rootWindowInsets);
                    Iterator it = u63.a0(1, 2).iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (rzgVarH.a.q(iIntValue)) {
                            fVar2.f(iIntValue);
                        } else {
                            fVar2.a(iIntValue);
                        }
                    }
                }
            } else {
                window2.getDecorView().setSystemUiVisibility(window3.getDecorView().getSystemUiVisibility());
            }
        }
        window.clearFlags(8);
    }

    public final void d() {
        hg2 hg2Var = this.dialog;
        if (hg2Var == null) {
            r6.g("dialog must exist when we call updateProperties");
            return;
        }
        Window window = hg2Var.getWindow();
        if (window == null) {
            r6.g("dialog must have window when we call updateProperties");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            return;
        }
        try {
            Window window2 = currentActivity.getWindow();
            if (window2 != null) {
                if ((window2.getAttributes().flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                } else {
                    window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                }
            }
            if (getNavigationBarTranslucent()) {
                WindowUtilKt.enableEdgeToEdge(window);
            } else {
                WindowUtilKt.disableEdgeToEdge(window);
                WindowUtilKt.setStatusBarTranslucency(window, getStatusBarTranslucent());
            }
            if (this.transparent) {
                window.clearFlags(2);
            } else {
                window.setDimAmount(0.5f);
                window.setFlags(2, 2);
            }
        } catch (IllegalArgumentException e2) {
            s55.h("ReactModalHost", "ReactModalHostView: error while setting window flags: ", e2.getMessage());
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getClass();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        viewStructure.getClass();
        this.a0.dispatchProvideStructure(viewStructure);
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        return this.a0.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.a0.getChildCount();
    }

    public final hg2 getDialog() {
        return this.dialog;
    }

    public final EventDispatcher getEventDispatcher() {
        return this.a0.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final boolean getNavigationBarTranslucent() {
        return this.navigationBarTranslucent || WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final c getOnRequestCloseListener() {
        return this.onRequestCloseListener;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.onShowListener;
    }

    public final vse getStateWrapper() {
        return this.a0.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.statusBarTranslucent || WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final boolean getTransparent() {
        return this.transparent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        context.getClass();
        ((mkf) context).a.addLifecycleEventListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.a0.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        b bVar = this.a0;
        bVar.removeView(bVar.getChildAt(i));
    }

    public final void setAnimationType(String str) {
        this.animationType = str;
        this.b0 = true;
    }

    public final void setDialogRootViewGroupTestId(String testId) {
        this.a0.setTag(R.id.react_test_id, testId);
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.a0.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z) {
        this.hardwareAccelerated = z;
        this.b0 = true;
    }

    @Override // android.view.View
    public void setId(int id) {
        super.setId(id);
        this.a0.setId(id);
    }

    public final void setNavigationBarTranslucent(boolean z) {
        this.navigationBarTranslucent = z;
        this.b0 = this.b0 || !WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final void setOnRequestCloseListener(c cVar) {
        this.onRequestCloseListener = cVar;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.onShowListener = onShowListener;
    }

    public final void setStateWrapper(vse vseVar) {
        this.a0.setStateWrapper$ReactAndroid_release(vseVar);
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.statusBarTranslucent = z;
        this.b0 = this.b0 || !WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final void setTransparent(boolean z) {
        this.transparent = z;
    }
}
