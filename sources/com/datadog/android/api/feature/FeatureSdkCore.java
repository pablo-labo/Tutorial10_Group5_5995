package com.datadog.android.api.feature;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import defpackage.j6g;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072 \u0010\u000f\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0004\u0012\u00020\u00040\fH&¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00122\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0007H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u0007H&¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/SdkCore;", "Lcom/datadog/android/api/feature/Feature;", "feature", "Lj6g;", "registerFeature", "(Lcom/datadog/android/api/feature/Feature;)V", "", "featureName", "Lcom/datadog/android/api/feature/FeatureScope;", "getFeature", "(Ljava/lang/String;)Lcom/datadog/android/api/feature/FeatureScope;", "Lkotlin/Function1;", "", "", "updateCallback", "updateFeatureContext", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "getFeatureContext", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "receiver", "setEventReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureEventReceiver;)V", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", "listener", "setContextUpdateReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;)V", "removeContextUpdateReceiver", "removeEventReceiver", "(Ljava/lang/String;)V", "executorContext", "Ljava/util/concurrent/ExecutorService;", "createSingleThreadExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "createScheduledExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface FeatureSdkCore extends SdkCore {
    ScheduledExecutorService createScheduledExecutorService(String executorContext);

    ExecutorService createSingleThreadExecutorService(String executorContext);

    FeatureScope getFeature(String featureName);

    Map<String, Object> getFeatureContext(String featureName);

    InternalLogger getInternalLogger();

    void registerFeature(Feature feature);

    void removeContextUpdateReceiver(String featureName, FeatureContextUpdateReceiver listener);

    void removeEventReceiver(String featureName);

    void setContextUpdateReceiver(String featureName, FeatureContextUpdateReceiver listener);

    void setEventReceiver(String featureName, FeatureEventReceiver receiver);

    void updateFeatureContext(String featureName, Function1<? super Map<String, Object>, j6g> updateCallback);
}
