package com.datadog.android.rum.metric.interactiontonextview;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/rum/metric/interactiontonextview/TimeBasedInteractionIdentifier;", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "timeThresholdInMilliseconds", "", "(J)V", "timeThresholdInNanoSeconds", "equals", "", "other", "", "hashCode", "", "validate", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/rum/metric/interactiontonextview/PreviousViewLastInteractionContext;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class TimeBasedInteractionIdentifier implements LastInteractionIdentifier {
    public static final long DEFAULT_TIME_THRESHOLD_MS = 3000;
    private final long timeThresholdInNanoSeconds;

    public TimeBasedInteractionIdentifier(long j) {
        this.timeThresholdInNanoSeconds = TimeUnit.MILLISECONDS.toNanos(j);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TimeBasedInteractionIdentifier.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return this.timeThresholdInNanoSeconds == ((TimeBasedInteractionIdentifier) other).timeThresholdInNanoSeconds;
    }

    public int hashCode() {
        return Long.hashCode(this.timeThresholdInNanoSeconds);
    }

    @Override // com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier
    public boolean validate(PreviousViewLastInteractionContext context) {
        context.getClass();
        Long currentViewCreationTimestamp = context.getCurrentViewCreationTimestamp();
        return currentViewCreationTimestamp != null && currentViewCreationTimestamp.longValue() - context.getEventCreatedAtNanos() < this.timeThresholdInNanoSeconds;
    }

    public TimeBasedInteractionIdentifier() {
        this(0L, 1, null);
    }

    public /* synthetic */ TimeBasedInteractionIdentifier(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_TIME_THRESHOLD_MS : j);
    }
}
