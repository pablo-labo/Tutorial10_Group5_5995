package com.datadog.android.core.internal;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/core/internal/ContextProvider;", "", "", "feature", "", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lj6g;", "setFeatureContext", "(Ljava/lang/String;Ljava/util/Map;)V", "getFeatureContext", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/datadog/android/api/context/DatadogContext;", "getContext", "()Lcom/datadog/android/api/context/DatadogContext;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface ContextProvider {
    DatadogContext getContext();

    Map<String, Object> getFeatureContext(String feature);

    void setFeatureContext(String feature, Map<String, ? extends Object> context);
}
