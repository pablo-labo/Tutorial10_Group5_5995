package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.rum.internal.domain.RumContext;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J \u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/NoOpRumScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "()V", "getRumContext", "Lcom/datadog/android/rum/internal/domain/RumContext;", "handleEvent", "event", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "writer", "Lcom/datadog/android/api/storage/DataWriter;", "", "isActive", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class NoOpRumScope implements RumScope {
    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: getRumContext */
    public RumContext getInitialContext() {
        return new RumContext(null, null, false, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 32767, null);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer) {
        event.getClass();
        writer.getClass();
        return null;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return false;
    }
}
