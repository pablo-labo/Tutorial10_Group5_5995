package com.datadog.android.api.feature;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import defpackage.b0;
import defpackage.j6g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0001H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/api/feature/FeatureScope;", "", "", "forceNewBatch", "Lkotlin/Function2;", "Lcom/datadog/android/api/context/DatadogContext;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lj6g;", "callback", "withWriteContext", "(ZLkotlin/jvm/functions/Function2;)V", "event", "sendEvent", "(Ljava/lang/Object;)V", "Lcom/datadog/android/api/feature/Feature;", "T", "unwrap", "()Lcom/datadog/android/api/feature/Feature;", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "getDataStore", "()Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "dataStore", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface FeatureScope {

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void withWriteContext$default(FeatureScope featureScope, boolean z, Function2 function2, int i, Object obj) {
            if (obj != null) {
                b0.u("Super calls with default arguments not supported in this target, function: withWriteContext");
                return;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            featureScope.withWriteContext(z, function2);
        }
    }

    DataStoreHandler getDataStore();

    void sendEvent(Object event);

    <T extends Feature> T unwrap();

    void withWriteContext(boolean forceNewBatch, Function2<? super DatadogContext, ? super EventBatchWriter, j6g> callback);
}
