package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityInfo";

    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @f84
    public abstract void announceForAccessibility(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AccessibilityInfo";
    }

    @ReactMethod
    @f84
    public void getRecommendedTimeoutMillis(double d, Callback callback) {
    }

    @ReactMethod
    @f84
    public void isAccessibilityServiceEnabled(Callback callback) {
    }

    @ReactMethod
    @f84
    public void isGrayscaleEnabled(Callback callback) {
    }

    @ReactMethod
    @f84
    public void isHighTextContrastEnabled(Callback callback) {
    }

    @ReactMethod
    @f84
    public void isInvertColorsEnabled(Callback callback) {
    }

    @ReactMethod
    @f84
    public abstract void isReduceMotionEnabled(Callback callback);

    @ReactMethod
    @f84
    public abstract void isTouchExplorationEnabled(Callback callback);

    @ReactMethod
    @f84
    public abstract void setAccessibilityFocus(double d);
}
