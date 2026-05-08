package com.facebook.react.modules.accessibilityinfo;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.nmc;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "AccessibilityInfo")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0003KLMB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u0019\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0012J\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u0012J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u0012R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u000602R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u000605R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010<R\u0016\u0010D\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010E\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010F¨\u0006N"}, d2 = {"Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;", "Lcom/facebook/fbreact/specs/NativeAccessibilityInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Callback;", "successCallback", "Lj6g;", "isReduceMotionEnabled", "(Lcom/facebook/react/bridge/Callback;)V", "isInvertColorsEnabled", "isGrayscaleEnabled", "isHighTextContrastEnabled", "isTouchExplorationEnabled", "isAccessibilityServiceEnabled", "onHostResume", "()V", "onHostPause", "initialize", "invalidate", "onHostDestroy", "", "message", "announceForAccessibility", "(Ljava/lang/String;)V", "", "reactTag", "setAccessibilityFocus", "(D)V", "originalTimeout", "getRecommendedTimeoutMillis", "(DLcom/facebook/react/bridge/Callback;)V", "updateAndSendReduceMotionChangeEvent", "updateAndSendInvertColorsChangeEvent", "updateAndSendHighTextContrastChangeEvent", "", "enabled", "updateAndSendTouchExplorationChangeEvent", "(Z)V", "updateAndSendAccessibilityServiceChangeEvent", "updateAndSendGrayscaleModeChangeEvent", "Landroid/database/ContentObserver;", "animationScaleObserver", "Landroid/database/ContentObserver;", "highTextContrastObserver", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "touchExplorationStateChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "accessibilityServiceChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "reduceMotionEnabled", "Z", "highTextContrastEnabled", "touchExplorationEnabled", "accessibilityServiceEnabled", "", "recommendedTimeout", "I", "invertColorsEnabled", "grayscaleModeEnabled", "isReduceMotionEnabledValue", "()Z", "isInvertColorsEnabledValue", "isGrayscaleEnabledValue", "isHighTextContrastEnabledValue", "Companion", "c", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT = "high_text_contrast_enabled";
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    private static final String GRAYSCALE_MODE_EVENT_NAME = "grayscaleModeDidChange";
    private static final String HIGH_TEXT_CONTRAST_EVENT_NAME = "highTextContrastDidChange";
    private static final String INVERT_COLOR_EVENT_NAME = "invertColorDidChange";
    public static final String NAME = "AccessibilityInfo";
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final AccessibilityManager accessibilityManager;
    private final b accessibilityServiceChangeListener;
    private boolean accessibilityServiceEnabled;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private boolean grayscaleModeEnabled;
    private boolean highTextContrastEnabled;
    private final ContentObserver highTextContrastObserver;
    private boolean invertColorsEnabled;
    private int recommendedTimeout;
    private boolean reduceMotionEnabled;
    private boolean touchExplorationEnabled;
    private final c touchExplorationStateChangeListener;

    public final class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(z);
        }
    }

    public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        public c() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.animationScaleObserver = new d(UiThreadUtil.getUiThreadHandler());
        this.highTextContrastObserver = new e(UiThreadUtil.getUiThreadHandler());
        this.touchExplorationStateChangeListener = new c();
        this.accessibilityServiceChangeListener = new b();
        Object systemService = reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        contentResolver.getClass();
        this.contentResolver = contentResolver;
        this.touchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        this.accessibilityServiceEnabled = accessibilityManager.isEnabled();
        this.reduceMotionEnabled = isReduceMotionEnabledValue();
        this.highTextContrastEnabled = isHighTextContrastEnabledValue();
        this.grayscaleModeEnabled = isGrayscaleEnabledValue();
    }

    private final boolean isGrayscaleEnabledValue() {
        try {
            if (Settings.Secure.getInt(this.contentResolver, "accessibility_display_daltonizer_enabled") == 1) {
                if (Settings.Secure.getInt(this.contentResolver, "accessibility_display_daltonizer") == 0) {
                    return true;
                }
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return false;
    }

    private final boolean isHighTextContrastEnabledValue() {
        return Settings.Secure.getInt(this.contentResolver, ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT, 0) != 0;
    }

    private final boolean isInvertColorsEnabledValue() {
        return Settings.Secure.getInt(this.contentResolver, "accessibility_display_inversion_enabled") == 1;
    }

    private final boolean isReduceMotionEnabledValue() {
        String string = Settings.Global.getString(this.contentResolver, "transition_animation_scale");
        if (string == null) {
            return false;
        }
        try {
            String strReplace = string.replace(',', JwtParser.SEPARATOR_CHAR);
            strReplace.getClass();
            return Float.parseFloat(strReplace) == 0.0f;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendAccessibilityServiceChangeEvent(boolean enabled) {
        if (this.accessibilityServiceEnabled != enabled) {
            this.accessibilityServiceEnabled = enabled;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.accessibilityServiceEnabled));
            }
        }
    }

    private final void updateAndSendGrayscaleModeChangeEvent() {
        boolean zIsGrayscaleEnabledValue = isGrayscaleEnabledValue();
        if (this.grayscaleModeEnabled != zIsGrayscaleEnabledValue) {
            this.grayscaleModeEnabled = zIsGrayscaleEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(GRAYSCALE_MODE_EVENT_NAME, Boolean.valueOf(this.grayscaleModeEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendHighTextContrastChangeEvent() {
        boolean zIsHighTextContrastEnabledValue = isHighTextContrastEnabledValue();
        if (this.highTextContrastEnabled != zIsHighTextContrastEnabledValue) {
            this.highTextContrastEnabled = zIsHighTextContrastEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(HIGH_TEXT_CONTRAST_EVENT_NAME, Boolean.valueOf(this.highTextContrastEnabled));
            }
        }
    }

    private final void updateAndSendInvertColorsChangeEvent() {
        boolean zIsInvertColorsEnabledValue = isInvertColorsEnabledValue();
        if (this.invertColorsEnabled != zIsInvertColorsEnabledValue) {
            this.invertColorsEnabled = zIsInvertColorsEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(INVERT_COLOR_EVENT_NAME, Boolean.valueOf(this.invertColorsEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendReduceMotionChangeEvent() {
        boolean zIsReduceMotionEnabledValue = isReduceMotionEnabledValue();
        if (this.reduceMotionEnabled != zIsReduceMotionEnabledValue) {
            this.reduceMotionEnabled = zIsReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.reduceMotionEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendTouchExplorationChangeEvent(boolean enabled) {
        if (this.touchExplorationEnabled != enabled) {
            this.touchExplorationEnabled = enabled;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.touchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String message) {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(message);
        accessibilityEventObtain.setClassName("com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule");
        accessibilityEventObtain.setPackageName(getReactApplicationContext().getPackageName());
        this.accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void getRecommendedTimeoutMillis(double originalTimeout, Callback successCallback) {
        successCallback.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            successCallback.invoke(Integer.valueOf((int) originalTimeout));
            return;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        int recommendedTimeoutMillis = accessibilityManager != null ? accessibilityManager.getRecommendedTimeoutMillis((int) originalTimeout, 4) : 0;
        this.recommendedTimeout = recommendedTimeoutMillis;
        successCallback.invoke(Integer.valueOf(recommendedTimeoutMillis));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        boolean z = false;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null && accessibilityManager2.isEnabled()) {
            z = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z);
        updateAndSendReduceMotionChangeEvent();
        updateAndSendHighTextContrastChangeEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isAccessibilityServiceEnabled(Callback successCallback) {
        successCallback.getClass();
        successCallback.invoke(Boolean.valueOf(this.accessibilityServiceEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isGrayscaleEnabled(Callback successCallback) {
        successCallback.getClass();
        successCallback.invoke(Boolean.valueOf(this.grayscaleModeEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isHighTextContrastEnabled(Callback successCallback) {
        successCallback.getClass();
        successCallback.invoke(Boolean.valueOf(this.highTextContrastEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isInvertColorsEnabled(Callback successCallback) {
        successCallback.getClass();
        successCallback.invoke(Boolean.valueOf(this.invertColorsEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback successCallback) {
        successCallback.getClass();
        successCallback.invoke(Boolean.valueOf(this.reduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback successCallback) {
        successCallback.getClass();
        successCallback.invoke(Boolean.valueOf(this.touchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.removeAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.contentResolver.unregisterContentObserver(this.highTextContrastObserver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.addAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        boolean z = false;
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor(ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT), false, this.highTextContrastObserver);
        AccessibilityManager accessibilityManager3 = this.accessibilityManager;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager3 != null && accessibilityManager3.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager4 = this.accessibilityManager;
        if (accessibilityManager4 != null && accessibilityManager4.isEnabled()) {
            z = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z);
        updateAndSendReduceMotionChangeEvent();
        updateAndSendHighTextContrastChangeEvent();
        updateAndSendInvertColorsChangeEvent();
        updateAndSendGrayscaleModeChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double reactTag) {
    }

    public static final class d extends ContentObserver {
        public d(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            AccessibilityInfoModule accessibilityInfoModule = AccessibilityInfoModule.this;
            if (accessibilityInfoModule.getReactApplicationContext().hasActiveReactInstance()) {
                accessibilityInfoModule.updateAndSendReduceMotionChangeEvent();
            }
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            onChange(z, null);
        }
    }

    public static final class e extends ContentObserver {
        public e(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            AccessibilityInfoModule accessibilityInfoModule = AccessibilityInfoModule.this;
            if (accessibilityInfoModule.getReactApplicationContext().hasActiveReactInstance()) {
                accessibilityInfoModule.updateAndSendHighTextContrastChangeEvent();
            }
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            onChange(z, null);
        }
    }
}
