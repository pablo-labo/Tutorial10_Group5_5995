package com.datadog.android.rum.internal.instrumentation.gestures;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.tracking.InteractionPredicate;
import com.datadog.android.rum.tracking.ViewAttributesProvider;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.u63;
import defpackage.zve;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 m2\u00020\u0001:\u0001mB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\f0\fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u001a0\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\u00172\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\f0\fH\u0096\u0001¢\u0006\u0004\b \u0010\u0019J \u0010#\u001a\u00020\"2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010!0!H\u0096\u0001¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\"2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010!0!H\u0096\u0001¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J\"\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020)2\b\b\u0001\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u0016\u001a\u00020)H\u0097\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b1\u0010'J\"\u00102\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020)2\b\b\u0001\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b2\u0010-J\"\u00103\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020)2\b\b\u0001\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b3\u00104J.\u00106\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020)2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010.2\b\b\u0001\u00105\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b8\u00109J \u00108\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010:0:H\u0096\u0001¢\u0006\u0004\b8\u0010;J \u0010=\u001a\u00020\"2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010<0<H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b?\u0010@J\"\u0010B\u001a\u0004\u0018\u00010!2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010A0AH\u0097\u0001¢\u0006\u0004\bB\u0010CJ*\u0010B\u001a\u0004\u0018\u00010!2\u000e\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010A0A2\u0006\u0010+\u001a\u00020)H\u0097\u0001¢\u0006\u0004\bB\u0010DJ\u0019\u0010F\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bF\u0010\u0019J\u001f\u0010J\u001a\u00020\u00172\u0006\u0010G\u001a\u00020)2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bL\u0010\u001cJ\u000f\u0010M\u001a\u00020\"H\u0002¢\u0006\u0004\bM\u0010'J\u0017\u0010N\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u001aH\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010S\u001a\u00020\"2\n\u0010R\u001a\u00060Pj\u0002`QH\u0002¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010[R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\\\u001a\u0004\b]\u0010^R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010_\u001a\u0004\b`\u0010aR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010e\u001a\u0004\bf\u0010gR(\u0010i\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00020\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/WindowCallbackWrapper;", "Landroid/view/Window$Callback;", "Landroid/view/Window;", "window", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "wrappedCallback", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "gesturesDetector", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "copyEvent", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "targetAttributesProviders", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Landroid/view/Window;Lcom/datadog/android/api/SdkCore;Landroid/view/Window$Callback;Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lkotlin/jvm/functions/Function1;[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/api/InternalLogger;)V", "kotlin.jvm.PlatformType", "p0", "", "dispatchGenericMotionEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyShortcutEvent", "(Landroid/view/KeyEvent;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "dispatchTrackballEvent", "Landroid/view/ActionMode;", "Lj6g;", "onActionModeFinished", "(Landroid/view/ActionMode;)V", "onActionModeStarted", "onAttachedToWindow", "()V", "onContentChanged", "", "Landroid/view/Menu;", "p1", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/View;", "onCreatePanelView", "(I)Landroid/view/View;", "onDetachedFromWindow", "onMenuOpened", "onPanelClosed", "(ILandroid/view/Menu;)V", "p2", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onSearchRequested", "()Z", "Landroid/view/SearchEvent;", "(Landroid/view/SearchEvent;)Z", "Landroid/view/WindowManager$LayoutParams;", "onWindowAttributesChanged", "(Landroid/view/WindowManager$LayoutParams;)V", "onWindowFocusChanged", "(Z)V", "Landroid/view/ActionMode$Callback;", "onWindowStartingActionMode", "(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;", "(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "event", "dispatchTouchEvent", "featureId", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "dispatchKeyEvent", "handleRemoteControlActionEvent", "handleBackEvent", "(Landroid/view/KeyEvent;)V", "Ljava/lang/NullPointerException;", "Lkotlin/NullPointerException;", "e", "logOrRethrowWrappedCallbackException", "(Ljava/lang/NullPointerException;)V", "Lcom/datadog/android/api/SdkCore;", "getSdkCore", "()Lcom/datadog/android/api/SdkCore;", "Landroid/view/Window$Callback;", "getWrappedCallback", "()Landroid/view/Window$Callback;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "getInteractionPredicate", "()Lcom/datadog/android/rum/tracking/InteractionPredicate;", "Lkotlin/jvm/functions/Function1;", "getCopyEvent", "()Lkotlin/jvm/functions/Function1;", "[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "getTargetAttributesProviders", "()[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Ljava/lang/ref/WeakReference;", "windowReference", "Ljava/lang/ref/WeakReference;", "getWindowReference$dd_sdk_android_rum_release", "()Ljava/lang/ref/WeakReference;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class WindowCallbackWrapper implements Window.Callback {
    public static final String BACK_DEFAULT_TARGET_NAME = "back";
    public static final boolean EVENT_CONSUMED = true;
    private final Function1<MotionEvent, MotionEvent> copyEvent;
    private final GesturesDetectorWrapper gesturesDetector;
    private final InteractionPredicate interactionPredicate;
    private final InternalLogger internalLogger;
    private final SdkCore sdkCore;
    private final ViewAttributesProvider[] targetAttributesProviders;
    private final WeakReference<Window> windowReference;
    private final Window.Callback wrappedCallback;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/MotionEvent;", "kotlin.jvm.PlatformType", "it", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<MotionEvent, MotionEvent> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MotionEvent invoke(MotionEvent motionEvent) {
            motionEvent.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.getClass();
            return motionEventObtain;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowCallbackWrapper(Window window, SdkCore sdkCore, Window.Callback callback, GesturesDetectorWrapper gesturesDetectorWrapper, InteractionPredicate interactionPredicate, Function1<? super MotionEvent, MotionEvent> function1, ViewAttributesProvider[] viewAttributesProviderArr, InternalLogger internalLogger) {
        window.getClass();
        sdkCore.getClass();
        callback.getClass();
        gesturesDetectorWrapper.getClass();
        interactionPredicate.getClass();
        function1.getClass();
        viewAttributesProviderArr.getClass();
        internalLogger.getClass();
        this.sdkCore = sdkCore;
        this.wrappedCallback = callback;
        this.gesturesDetector = gesturesDetectorWrapper;
        this.interactionPredicate = interactionPredicate;
        this.copyEvent = function1;
        this.targetAttributesProviders = viewAttributesProviderArr;
        this.internalLogger = internalLogger;
        this.windowReference = new WeakReference<>(window);
    }

    private final void handleBackEvent(KeyEvent event) {
        String targetName = this.interactionPredicate.getTargetName(event);
        if (targetName == null || targetName.length() == 0) {
            targetName = BACK_DEFAULT_TARGET_NAME;
        }
        GlobalRumMonitor.get(this.sdkCore).addAction(RumActionType.BACK, targetName, bs4.a);
    }

    private final void handleRemoteControlActionEvent() {
        View currentFocus;
        Window window = this.windowReference.get();
        if (window == null || (currentFocus = window.getCurrentFocus()) == null) {
            return;
        }
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair(RumAttributes.ACTION_TARGET_CLASS_NAME, GesturesUtilsKt.targetClassName(currentFocus)), new Pair(RumAttributes.ACTION_TARGET_RESOURCE_ID, GesturesUtilsKt.resourceIdName(window.getContext(), currentFocus.getId())));
        for (ViewAttributesProvider viewAttributesProvider : this.targetAttributesProviders) {
            viewAttributesProvider.extractAttributes(currentFocus, linkedHashMapB0);
        }
        GlobalRumMonitor.get(this.sdkCore).addAction(RumActionType.CLICK, GesturesUtilsKt.resolveTargetName(this.interactionPredicate, currentFocus), linkedHashMapB0);
    }

    private final void logOrRethrowWrappedCallbackException(NullPointerException e) {
        String message = e.getMessage();
        if (message == null || !zve.L(message, "Parameter specified as non-null is null", false)) {
            throw e;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C06101.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent p0) {
        return this.wrappedCallback.dispatchGenericMotionEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) C06081.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        } else if (event.getKeyCode() == 4 && event.getAction() == 1) {
            handleBackEvent(event);
        } else if (event.getKeyCode() == 23 && event.getAction() == 1) {
            handleRemoteControlActionEvent();
        }
        try {
            return this.wrappedCallback.dispatchKeyEvent(event);
        } catch (NullPointerException e) {
            this.logOrRethrowWrappedCallbackException(e);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent p0) {
        return this.wrappedCallback.dispatchKeyShortcutEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0) {
        return this.wrappedCallback.dispatchPopulateAccessibilityEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event != null) {
            MotionEvent motionEventInvoke = this.copyEvent.invoke(event);
            try {
                try {
                    this.gesturesDetector.onTouchEvent(motionEventInvoke);
                } catch (Exception e) {
                    InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) C06091.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
                }
                motionEventInvoke.recycle();
            } catch (Throwable th) {
                motionEventInvoke.recycle();
                throw th;
            }
        } else {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        try {
            return this.wrappedCallback.dispatchTouchEvent(event);
        } catch (NullPointerException e2) {
            this.logOrRethrowWrappedCallbackException(e2);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent p0) {
        return this.wrappedCallback.dispatchTrackballEvent(p0);
    }

    public final Function1<MotionEvent, MotionEvent> getCopyEvent() {
        return this.copyEvent;
    }

    public final InteractionPredicate getInteractionPredicate() {
        return this.interactionPredicate;
    }

    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final SdkCore getSdkCore() {
        return this.sdkCore;
    }

    public final ViewAttributesProvider[] getTargetAttributesProviders() {
        return this.targetAttributesProviders;
    }

    public final WeakReference<Window> getWindowReference$dd_sdk_android_rum_release() {
        return this.windowReference;
    }

    public final Window.Callback getWrappedCallback() {
        return this.wrappedCallback;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode p0) {
        this.wrappedCallback.onActionModeFinished(p0);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode p0) {
        this.wrappedCallback.onActionModeStarted(p0);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.wrappedCallback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.wrappedCallback.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int p0, @NonNull Menu p1) {
        p1.getClass();
        return this.wrappedCallback.onCreatePanelMenu(p0, p1);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public View onCreatePanelView(int p0) {
        return this.wrappedCallback.onCreatePanelView(p0);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.wrappedCallback.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        item.getClass();
        Window window = this.windowReference.get();
        GlobalRumMonitor.get(this.sdkCore).addAction(RumActionType.TAP, GesturesUtilsKt.resolveTargetName(this.interactionPredicate, item), lc9.b0(new Pair(RumAttributes.ACTION_TARGET_CLASS_NAME, item.getClass().getCanonicalName()), new Pair(RumAttributes.ACTION_TARGET_RESOURCE_ID, GesturesUtilsKt.resourceIdName(window != null ? window.getContext() : null, item.getItemId())), new Pair(RumAttributes.ACTION_TARGET_TITLE, item.getTitle())));
        try {
            return this.wrappedCallback.onMenuItemSelected(featureId, item);
        } catch (NullPointerException e) {
            this.logOrRethrowWrappedCallbackException(e);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int p0, @NonNull Menu p1) {
        p1.getClass();
        return this.wrappedCallback.onMenuOpened(p0, p1);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int p0, @NonNull Menu p1) {
        p1.getClass();
        this.wrappedCallback.onPanelClosed(p0, p1);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int p0, @Nullable View p1, @NonNull Menu p2) {
        p2.getClass();
        return this.wrappedCallback.onPreparePanel(p0, p1, p2);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.wrappedCallback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams p0) {
        this.wrappedCallback.onWindowAttributesChanged(p0);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean p0) {
        this.wrappedCallback.onWindowFocusChanged(p0);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback p0) {
        return this.wrappedCallback.onWindowStartingActionMode(p0);
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchKeyEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06081 extends mj8 implements gu5<String> {
        public static final C06081 INSTANCE = new C06081();

        public C06081() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Received null KeyEvent";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchTouchEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06091 extends mj8 implements gu5<String> {
        public static final C06091 INSTANCE = new C06091();

        public C06091() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Error processing MotionEvent";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchTouchEvent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Received null MotionEvent";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$logOrRethrowWrappedCallbackException$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06101 extends mj8 implements gu5<String> {
        public static final C06101 INSTANCE = new C06101();

        public C06101() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Wrapped Window.Callback failed processing event";
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent p0) {
        return this.wrappedCallback.onSearchRequested(p0);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback p0, int p1) {
        return this.wrappedCallback.onWindowStartingActionMode(p0, p1);
    }

    public /* synthetic */ WindowCallbackWrapper(Window window, SdkCore sdkCore, Window.Callback callback, GesturesDetectorWrapper gesturesDetectorWrapper, InteractionPredicate interactionPredicate, Function1 function1, ViewAttributesProvider[] viewAttributesProviderArr, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(window, sdkCore, callback, gesturesDetectorWrapper, (i & 16) != 0 ? new NoOpInteractionPredicate() : interactionPredicate, (i & 32) != 0 ? AnonymousClass1.INSTANCE : function1, (i & 64) != 0 ? new ViewAttributesProvider[0] : viewAttributesProviderArr, internalLogger);
    }
}
