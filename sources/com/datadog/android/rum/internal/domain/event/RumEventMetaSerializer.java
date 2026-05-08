package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import defpackage.l;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMetaSerializer;", "Lcom/datadog/android/core/persistence/Serializer;", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "()V", "serialize", "", "model", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumEventMetaSerializer implements Serializer<RumEventMeta> {
    @Override // com.datadog.android.core.persistence.Serializer
    public String serialize(RumEventMeta model) {
        model.getClass();
        if (!(model instanceof RumEventMeta.View)) {
            l.g();
            return null;
        }
        String string = model.toJson().toString();
        string.getClass();
        return string;
    }
}
