package com.datadog.android.rum;

import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import defpackage.b0;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.sy3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\u0014\u0010\u0013J7\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\u0015\u0010\u0013J?\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH'¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\u0018\u0010\u001bJI\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\"\u0010#JQ\u0010)\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b)\u0010*J[\u0010)\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b)\u0010-J?\u0010.\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b.\u0010/J?\u00101\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0001H&¢\u0006\u0004\b6\u00107J#\u00109\u001a\u00020\u00042\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\nH&¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b;\u00107J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b<\u00104J\u001d\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H&¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0004H&¢\u0006\u0004\bA\u0010@J\u0017\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020BH'¢\u0006\u0004\bD\u0010EJ\u0011\u0010G\u001a\u0004\u0018\u00010FH&¢\u0006\u0004\bG\u0010HR\u001c\u0010L\u001a\u00020B8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010E¨\u0006M"}, d2 = {"Lcom/datadog/android/rum/RumMonitor;", "", "Lkotlin/Function1;", "", "Lj6g;", "callback", "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "key", "name", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumActionType;", "type", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "startAction", "stopAction", "method", "url", "startResource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumResourceMethod;", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "", "statusCode", "", "size", "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", RumFeature.EVENT_THROWABLE_PROPERTY, "stopResourceWithError", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stackTrace", "errorType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "addTiming", "(Ljava/lang/String;)V", "value", "addFeatureFlagEvaluation", "(Ljava/lang/String;Ljava/lang/Object;)V", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "addAttribute", "removeAttribute", "getAttributes", "()Ljava/util/Map;", "clearAttributes", "()V", "stopSession", "", "overwrite", "addViewLoadingTime", "(Z)V", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", "getDebug", "()Z", "setDebug", RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface RumMonitor {
    /* JADX INFO: renamed from: _getInternal */
    /* synthetic */ _RumInternalProxy getInternalProxy();

    void addAction(RumActionType type, String name, Map<String, ? extends Object> attributes);

    void addAttribute(String key, Object value);

    void addError(String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes);

    void addErrorWithStacktrace(String message, RumErrorSource source, String stacktrace, Map<String, ? extends Object> attributes);

    void addFeatureFlagEvaluation(String name, Object value);

    void addFeatureFlagEvaluations(Map<String, ? extends Object> featureFlags);

    void addTiming(String name);

    @ExperimentalRumApi
    void addViewLoadingTime(boolean overwrite);

    void clearAttributes();

    Map<String, Object> getAttributes();

    void getCurrentSessionId(Function1<? super String, j6g> callback);

    boolean getDebug();

    void removeAttribute(String key);

    void setDebug(boolean z);

    void startAction(RumActionType type, String name, Map<String, ? extends Object> attributes);

    void startResource(String key, RumResourceMethod method, String url, Map<String, ? extends Object> attributes);

    @sy3
    void startResource(String key, String method, String url, Map<String, ? extends Object> attributes);

    void startView(Object key, String name, Map<String, ? extends Object> attributes);

    void stopAction(RumActionType type, String name, Map<String, ? extends Object> attributes);

    void stopResource(String key, Integer statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes);

    void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes);

    void stopResourceWithError(String key, Integer statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes);

    void stopSession();

    void stopView(Object key, Map<String, ? extends Object> attributes);

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startResource$default(RumMonitor rumMonitor, String str, String str2, String str3, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: startResource");
                return;
            }
            if ((i & 8) != 0) {
                map = bs4.a;
            }
            rumMonitor.startResource(str, str2, str3, (Map<String, ? extends Object>) map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startView$default(RumMonitor rumMonitor, Object obj, String str, Map map, int i, Object obj2) {
            if (obj2 != null) {
                b0.u("Super calls with default arguments not supported in this target, function: startView");
                return;
            }
            if ((i & 4) != 0) {
                map = bs4.a;
            }
            rumMonitor.startView(obj, str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopAction$default(RumMonitor rumMonitor, RumActionType rumActionType, String str, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: stopAction");
                return;
            }
            if ((i & 4) != 0) {
                map = bs4.a;
            }
            rumMonitor.stopAction(rumActionType, str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopResourceWithError$default(RumMonitor rumMonitor, String str, Integer num, String str2, RumErrorSource rumErrorSource, String str3, String str4, Map map, int i, Object obj) {
            if (obj == null) {
                rumMonitor.stopResourceWithError(str, num, str2, rumErrorSource, str3, str4, (i & 64) != 0 ? bs4.a : map);
            } else {
                b0.u("Super calls with default arguments not supported in this target, function: stopResourceWithError");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopView$default(RumMonitor rumMonitor, Object obj, Map map, int i, Object obj2) {
            if (obj2 != null) {
                b0.u("Super calls with default arguments not supported in this target, function: stopView");
                return;
            }
            if ((i & 2) != 0) {
                map = bs4.a;
            }
            rumMonitor.stopView(obj, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startResource$default(RumMonitor rumMonitor, String str, RumResourceMethod rumResourceMethod, String str2, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: startResource");
                return;
            }
            if ((i & 8) != 0) {
                map = bs4.a;
            }
            rumMonitor.startResource(str, rumResourceMethod, str2, (Map<String, ? extends Object>) map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopResourceWithError$default(RumMonitor rumMonitor, String str, Integer num, String str2, RumErrorSource rumErrorSource, Throwable th, Map map, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: stopResourceWithError");
                return;
            }
            if ((i & 32) != 0) {
                map = bs4.a;
            }
            rumMonitor.stopResourceWithError(str, num, str2, rumErrorSource, th, map);
        }
    }
}
