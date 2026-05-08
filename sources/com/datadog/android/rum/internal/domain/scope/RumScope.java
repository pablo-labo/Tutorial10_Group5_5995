package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.rum.internal.domain.RumContext;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH'J\b\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "", "getRumContext", "Lcom/datadog/android/rum/internal/domain/RumContext;", "handleEvent", "event", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "writer", "Lcom/datadog/android/api/storage/DataWriter;", "isActive", "", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface RumScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String SYNTHETICS_LOGCAT_TAG = "DatadogSynthetics";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScope$Companion;", "", "()V", "SYNTHETICS_LOGCAT_TAG", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String SYNTHETICS_LOGCAT_TAG = "DatadogSynthetics";

        private Companion() {
        }
    }

    RumContext getRumContext();

    RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer);

    boolean isActive();
}
