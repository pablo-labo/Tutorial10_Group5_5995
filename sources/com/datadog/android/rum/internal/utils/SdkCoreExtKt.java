package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.feature.FeatureSdkCore;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b*$\b\u0000\u0010\u000e\"\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/storage/DataWriter;", "", "rumDataWriter", "Lcom/datadog/android/api/storage/EventType;", "eventType", "Lkotlin/Function1;", "Lcom/datadog/android/api/context/DatadogContext;", "eventSource", "Lcom/datadog/android/rum/internal/utils/WriteOperation;", "newRumEventWriteOperation", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/api/storage/EventType;Lkotlin/jvm/functions/Function1;)Lcom/datadog/android/rum/internal/utils/WriteOperation;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Lj6g;", "EventOutcomeAction", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class SdkCoreExtKt {
    public static final WriteOperation newRumEventWriteOperation(FeatureSdkCore featureSdkCore, DataWriter<Object> dataWriter, EventType eventType, Function1<? super DatadogContext, ? extends Object> function1) {
        featureSdkCore.getClass();
        dataWriter.getClass();
        eventType.getClass();
        function1.getClass();
        return new WriteOperation(featureSdkCore, dataWriter, eventType, function1);
    }

    public static /* synthetic */ WriteOperation newRumEventWriteOperation$default(FeatureSdkCore featureSdkCore, DataWriter dataWriter, EventType eventType, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            eventType = EventType.DEFAULT;
        }
        return newRumEventWriteOperation(featureSdkCore, dataWriter, eventType, function1);
    }
}
