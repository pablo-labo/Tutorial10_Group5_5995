package com.datadog.android.rum.internal.monitor;

import com.datadog.android.lint.InternalApi;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.resource.ResourceId;
import defpackage.b0;
import defpackage.bs4;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H'¢\u0006\u0004\b\u001c\u0010\u001dJQ\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H'¢\u0006\u0004\b#\u0010$J[\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H'¢\u0006\u0004\b#\u0010'¨\u0006("}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedNetworkRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "", "key", "Lj6g;", "waitForResourceTiming", "(Ljava/lang/Object;)V", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "addResourceTiming", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)V", "notifyInterceptorInstantiated", "()V", "Lcom/datadog/android/rum/resource/ResourceId;", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "", "url", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "startResource", "(Lcom/datadog/android/rum/resource/ResourceId;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "", "statusCode", "", "size", "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", RumFeature.EVENT_THROWABLE_PROPERTY, "stopResourceWithError", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stackTrace", "errorType", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface AdvancedNetworkRumMonitor extends RumMonitor {
    @InternalApi
    void addResourceTiming(Object key, ResourceTiming timing);

    @InternalApi
    void notifyInterceptorInstantiated();

    @InternalApi
    void startResource(ResourceId key, RumResourceMethod method, String url, Map<String, ? extends Object> attributes);

    @InternalApi
    void stopResource(ResourceId key, Integer statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes);

    @InternalApi
    void stopResourceWithError(ResourceId key, Integer statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes);

    @InternalApi
    void stopResourceWithError(ResourceId key, Integer statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes);

    @InternalApi
    void waitForResourceTiming(Object key);

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startResource$default(AdvancedNetworkRumMonitor advancedNetworkRumMonitor, ResourceId resourceId, RumResourceMethod rumResourceMethod, String str, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: startResource");
                return;
            }
            if ((i & 8) != 0) {
                map = bs4.a;
            }
            advancedNetworkRumMonitor.startResource(resourceId, rumResourceMethod, str, (Map<String, ? extends Object>) map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopResourceWithError$default(AdvancedNetworkRumMonitor advancedNetworkRumMonitor, ResourceId resourceId, Integer num, String str, RumErrorSource rumErrorSource, String str2, String str3, Map map, int i, Object obj) {
            if (obj == null) {
                advancedNetworkRumMonitor.stopResourceWithError(resourceId, num, str, rumErrorSource, str2, str3, (Map<String, ? extends Object>) ((i & 64) != 0 ? bs4.a : map));
            } else {
                b0.u("Super calls with default arguments not supported in this target, function: stopResourceWithError");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopResourceWithError$default(AdvancedNetworkRumMonitor advancedNetworkRumMonitor, ResourceId resourceId, Integer num, String str, RumErrorSource rumErrorSource, Throwable th, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: stopResourceWithError");
                return;
            }
            if ((i & 32) != 0) {
                map = bs4.a;
            }
            advancedNetworkRumMonitor.stopResourceWithError(resourceId, num, str, rumErrorSource, th, (Map<String, ? extends Object>) map);
        }
    }
}
