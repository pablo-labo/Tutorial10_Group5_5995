package com.facebook.react.internal.featureflags;

import com.facebook.soloader.SoLoader;
import defpackage.f84;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0013\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0016\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0019\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001a\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001b\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001d\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001e\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u001f\u0010\u0006J\u0010\u0010 \u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b \u0010\u0006J\u0010\u0010!\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b!\u0010\u0006J\u0010\u0010\"\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\"\u0010\u0006J\u0010\u0010#\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b#\u0010\u0006J\u0010\u0010$\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b$\u0010\u0006J\u0010\u0010%\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b%\u0010\u0006J\u0010\u0010&\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b&\u0010\u0006J\u0010\u0010'\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b'\u0010\u0006J\u0010\u0010(\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b(\u0010\u0006J\u0010\u0010)\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b)\u0010\u0006J\u0010\u0010*\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b*\u0010\u0006J\u0010\u0010+\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b+\u0010\u0006J\u0010\u0010,\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b,\u0010\u0006J\u0010\u0010-\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b-\u0010\u0006J\u0010\u0010.\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b.\u0010\u0006J\u0010\u0010/\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b/\u0010\u0006J\u0010\u00100\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b0\u0010\u0006J\u0010\u00101\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b1\u0010\u0006J\u0010\u00102\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b2\u0010\u0006J\u0010\u00103\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b3\u0010\u0006J\u0010\u00105\u001a\u000204H\u0087 ¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b7\u0010\u0006J\u0010\u00108\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b8\u0010\u0006J\u0010\u00109\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b9\u0010\u0006J\u0010\u0010:\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b:\u0010\u0006J\u0010\u0010;\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b;\u0010\u0006J\u0010\u0010<\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b<\u0010\u0006J\u0010\u0010=\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b=\u0010\u0006J\u0010\u0010>\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b>\u0010\u0006J\u0010\u0010?\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b?\u0010\u0006J\u0010\u0010@\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b@\u0010\u0006J\u0010\u0010A\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bA\u0010\u0006J\u0010\u0010B\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bB\u0010\u0006J\u0010\u0010C\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\bC\u0010\u0006J\u0010\u0010D\u001a\u000204H\u0087 ¢\u0006\u0004\bD\u00106J\u0018\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020\u0001H\u0087 ¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020FH\u0087 ¢\u0006\u0004\bI\u0010\u0003J\u001a\u0010K\u001a\u0004\u0018\u00010J2\u0006\u0010E\u001a\u00020\u0001H\u0087 ¢\u0006\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", "", "<init>", "()V", "", "commonTestFlag", "()Z", "animatedShouldSignalBatch", "cxxNativeAnimatedEnabled", "cxxNativeAnimatedRemoveJsSync", "disableMainQueueSyncDispatchIOS", "disableMountItemReorderingAndroid", "disableTextLayoutManagerCacheAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDoubleMeasurementFixAndroid", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableFixForParentTagDuringReparenting", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableMainQueueModulesOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableNativeCSSParsing", "enableNetworkEventReporting", "enableNewBackgroundAndBorderDrawables", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableResourceTimingAPI", "enableSynchronousStateUpdates", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewDebugFeatures", "enableVirtualViewRenderState", "enableVirtualViewWindowFocusDetection", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "hideOffscreenVirtualViewsOnIOS", "", "preparedTextCacheSize", "()D", "preventShadowTreeCommitExhaustion", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeEqualsInNativeReadableArrayAndroid", "useNativeTransformHelperAndroid", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useTurboModuleInterop", "useTurboModules", "virtualViewPrerenderRatio", "provider", "Lj6g;", "override", "(Ljava/lang/Object;)V", "dangerouslyReset", "", "dangerouslyForceOverride", "(Ljava/lang/Object;)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class ReactNativeFeatureFlagsCxxInterop {
    static {
        new ReactNativeFeatureFlagsCxxInterop();
        SoLoader.l("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    @f84
    public static final native boolean animatedShouldSignalBatch();

    @f84
    public static final native boolean commonTestFlag();

    @f84
    public static final native boolean cxxNativeAnimatedEnabled();

    @f84
    public static final native boolean cxxNativeAnimatedRemoveJsSync();

    @f84
    public static final native String dangerouslyForceOverride(Object provider);

    @f84
    public static final native void dangerouslyReset();

    @f84
    public static final native boolean disableMainQueueSyncDispatchIOS();

    @f84
    public static final native boolean disableMountItemReorderingAndroid();

    @f84
    public static final native boolean disableTextLayoutManagerCacheAndroid();

    @f84
    public static final native boolean enableAccessibilityOrder();

    @f84
    public static final native boolean enableAccumulatedUpdatesInRawPropsAndroid();

    @f84
    public static final native boolean enableAndroidTextMeasurementOptimizations();

    @f84
    public static final native boolean enableBridgelessArchitecture();

    @f84
    public static final native boolean enableCppPropsIteratorSetter();

    @f84
    public static final native boolean enableCustomFocusSearchOnClippedElementsAndroid();

    @f84
    public static final native boolean enableDestroyShadowTreeRevisionAsync();

    @f84
    public static final native boolean enableDoubleMeasurementFixAndroid();

    @f84
    public static final native boolean enableEagerRootViewAttachment();

    @f84
    public static final native boolean enableFabricLogs();

    @f84
    public static final native boolean enableFabricRenderer();

    @f84
    public static final native boolean enableFixForParentTagDuringReparenting();

    @f84
    public static final native boolean enableFontScaleChangesUpdatingLayout();

    @f84
    public static final native boolean enableIOSTextBaselineOffsetPerLine();

    @f84
    public static final native boolean enableIOSViewClipToPaddingBox();

    @f84
    public static final native boolean enableInteropViewManagerClassLookUpOptimizationIOS();

    @f84
    public static final native boolean enableLayoutAnimationsOnAndroid();

    @f84
    public static final native boolean enableLayoutAnimationsOnIOS();

    @f84
    public static final native boolean enableMainQueueCoordinatorOnIOS();

    @f84
    public static final native boolean enableMainQueueModulesOnIOS();

    @f84
    public static final native boolean enableModuleArgumentNSNullConversionIOS();

    @f84
    public static final native boolean enableNativeCSSParsing();

    @f84
    public static final native boolean enableNetworkEventReporting();

    @f84
    public static final native boolean enableNewBackgroundAndBorderDrawables();

    @f84
    public static final native boolean enablePreparedTextLayout();

    @f84
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @f84
    public static final native boolean enableResourceTimingAPI();

    @f84
    public static final native boolean enableSynchronousStateUpdates();

    @f84
    public static final native boolean enableViewCulling();

    @f84
    public static final native boolean enableViewRecycling();

    @f84
    public static final native boolean enableViewRecyclingForText();

    @f84
    public static final native boolean enableViewRecyclingForView();

    @f84
    public static final native boolean enableVirtualViewDebugFeatures();

    @f84
    public static final native boolean enableVirtualViewRenderState();

    @f84
    public static final native boolean enableVirtualViewWindowFocusDetection();

    @f84
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @f84
    public static final native boolean fuseboxEnabledRelease();

    @f84
    public static final native boolean fuseboxNetworkInspectionEnabled();

    @f84
    public static final native boolean hideOffscreenVirtualViewsOnIOS();

    @f84
    public static final native void override(Object provider);

    @f84
    public static final native double preparedTextCacheSize();

    @f84
    public static final native boolean preventShadowTreeCommitExhaustion();

    @f84
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @f84
    public static final native boolean updateRuntimeShadowNodeReferencesOnCommit();

    @f84
    public static final native boolean useAlwaysAvailableJSErrorHandling();

    @f84
    public static final native boolean useFabricInterop();

    @f84
    public static final native boolean useNativeEqualsInNativeReadableArrayAndroid();

    @f84
    public static final native boolean useNativeTransformHelperAndroid();

    @f84
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @f84
    public static final native boolean useOptimizedEventBatchingOnAndroid();

    @f84
    public static final native boolean useRawPropsJsiValue();

    @f84
    public static final native boolean useShadowNodeStateOnClone();

    @f84
    public static final native boolean useTurboModuleInterop();

    @f84
    public static final native boolean useTurboModules();

    @f84
    public static final native double virtualViewPrerenderRatio();
}
