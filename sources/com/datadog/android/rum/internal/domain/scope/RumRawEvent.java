package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.RumErrorSourceType;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.model.ActionEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.k20;
import defpackage.u40;
import defpackage.w40;
import defpackage.wl7;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\"\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\")*+,-./0123456789:;<=>?@ABCDEFGHIJ¨\u0006K"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "", "()V", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "ActionDropped", "ActionSent", "AddCustomTiming", "AddError", "AddFeatureFlagEvaluation", "AddFeatureFlagEvaluations", "AddLongTask", "AddResourceTiming", "AddViewLoadingTime", "ApplicationStarted", "ErrorDropped", "ErrorSent", "KeepAlive", "LongTaskDropped", "LongTaskSent", "ResetSession", "ResourceDropped", "ResourceSent", "SdkInit", "SendCustomActionNow", "SetSyntheticsTestAttribute", "StartAction", "StartResource", "StartView", "StopAction", "StopResource", "StopResourceWithError", "StopResourceWithStackTrace", "StopSession", "StopView", "TelemetryEventWrapper", "UpdatePerformanceMetric", "WaitForResourceTiming", "WebViewEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluations;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$KeepAlive;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WaitForResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class RumRawEvent {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "applicationStartupNanos", "", "(Lcom/datadog/android/rum/internal/domain/Time;J)V", "getApplicationStartupNanos", "()J", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ApplicationStarted extends RumRawEvent {
        private final long applicationStartupNanos;
        private final Time eventTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationStarted(Time time, long j) {
            super(null);
            time.getClass();
            this.eventTime = time;
            this.applicationStartupNanos = j;
        }

        public static /* synthetic */ ApplicationStarted copy$default(ApplicationStarted applicationStarted, Time time, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                time = applicationStarted.eventTime;
            }
            if ((i & 2) != 0) {
                j = applicationStarted.applicationStartupNanos;
            }
            return applicationStarted.copy(time, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getApplicationStartupNanos() {
            return this.applicationStartupNanos;
        }

        public final ApplicationStarted copy(Time eventTime, long applicationStartupNanos) {
            eventTime.getClass();
            return new ApplicationStarted(eventTime, applicationStartupNanos);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplicationStarted)) {
                return false;
            }
            ApplicationStarted applicationStarted = (ApplicationStarted) other;
            return wl7.b(this.eventTime, applicationStarted.eventTime) && this.applicationStartupNanos == applicationStarted.applicationStartupNanos;
        }

        public final long getApplicationStartupNanos() {
            return this.applicationStartupNanos;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return Long.hashCode(this.applicationStartupNanos) + (this.eventTime.hashCode() * 31);
        }

        public String toString() {
            return "ApplicationStarted(eventTime=" + this.eventTime + ", applicationStartupNanos=" + this.applicationStartupNanos + ")";
        }
    }

    public /* synthetic */ RumRawEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Time getEventTime();

    private RumRawEvent() {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getViewId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ActionDropped extends RumRawEvent {
        private final Time eventTime;
        private final String viewId;

        public /* synthetic */ ActionDropped(String str, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ ActionDropped copy$default(ActionDropped actionDropped, String str, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionDropped.viewId;
            }
            if ((i & 2) != 0) {
                time = actionDropped.eventTime;
            }
            return actionDropped.copy(str, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final ActionDropped copy(String viewId, Time eventTime) {
            viewId.getClass();
            eventTime.getClass();
            return new ActionDropped(viewId, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionDropped)) {
                return false;
            }
            ActionDropped actionDropped = (ActionDropped) other;
            return wl7.b(this.viewId, actionDropped.viewId) && wl7.b(this.eventTime, actionDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + (this.viewId.hashCode() * 31);
        }

        public String toString() {
            return "ActionDropped(viewId=" + this.viewId + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionDropped(String str, Time time) {
            super(null);
            str.getClass();
            time.getClass();
            this.viewId = str;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "name", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class AddCustomTiming extends RumRawEvent {
        private final Time eventTime;
        private final String name;

        public /* synthetic */ AddCustomTiming(String str, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ AddCustomTiming copy$default(AddCustomTiming addCustomTiming, String str, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addCustomTiming.name;
            }
            if ((i & 2) != 0) {
                time = addCustomTiming.eventTime;
            }
            return addCustomTiming.copy(str, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final AddCustomTiming copy(String name, Time eventTime) {
            name.getClass();
            eventTime.getClass();
            return new AddCustomTiming(name, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddCustomTiming)) {
                return false;
            }
            AddCustomTiming addCustomTiming = (AddCustomTiming) other;
            return wl7.b(this.name, addCustomTiming.name) && wl7.b(this.eventTime, addCustomTiming.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "AddCustomTiming(name=" + this.name + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddCustomTiming(String str, Time time) {
            super(null);
            str.getClass();
            time.getClass();
            this.name = str;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "name", "", "value", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class AddFeatureFlagEvaluation extends RumRawEvent {
        private final Time eventTime;
        private final String name;
        private final Object value;

        public /* synthetic */ AddFeatureFlagEvaluation(String str, Object obj, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, obj, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ AddFeatureFlagEvaluation copy$default(AddFeatureFlagEvaluation addFeatureFlagEvaluation, String str, Object obj, Time time, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = addFeatureFlagEvaluation.name;
            }
            if ((i & 2) != 0) {
                obj = addFeatureFlagEvaluation.value;
            }
            if ((i & 4) != 0) {
                time = addFeatureFlagEvaluation.eventTime;
            }
            return addFeatureFlagEvaluation.copy(str, obj, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final AddFeatureFlagEvaluation copy(String name, Object value, Time eventTime) {
            name.getClass();
            value.getClass();
            eventTime.getClass();
            return new AddFeatureFlagEvaluation(name, value, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddFeatureFlagEvaluation)) {
                return false;
            }
            AddFeatureFlagEvaluation addFeatureFlagEvaluation = (AddFeatureFlagEvaluation) other;
            return wl7.b(this.name, addFeatureFlagEvaluation.name) && wl7.b(this.value, addFeatureFlagEvaluation.value) && wl7.b(this.eventTime, addFeatureFlagEvaluation.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getName() {
            return this.name;
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + ((this.value.hashCode() + (this.name.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "AddFeatureFlagEvaluation(name=" + this.name + ", value=" + this.value + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFeatureFlagEvaluation(String str, Object obj, Time time) {
            super(null);
            str.getClass();
            obj.getClass();
            time.getClass();
            this.name = str;
            this.value = obj;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluations;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "featureFlags", "", "", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getFeatureFlags", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class AddFeatureFlagEvaluations extends RumRawEvent {
        private final Time eventTime;
        private final Map<String, Object> featureFlags;

        public /* synthetic */ AddFeatureFlagEvaluations(Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, (i & 2) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddFeatureFlagEvaluations copy$default(AddFeatureFlagEvaluations addFeatureFlagEvaluations, Map map, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                map = addFeatureFlagEvaluations.featureFlags;
            }
            if ((i & 2) != 0) {
                time = addFeatureFlagEvaluations.eventTime;
            }
            return addFeatureFlagEvaluations.copy(map, time);
        }

        public final Map<String, Object> component1() {
            return this.featureFlags;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final AddFeatureFlagEvaluations copy(Map<String, ? extends Object> featureFlags, Time eventTime) {
            featureFlags.getClass();
            eventTime.getClass();
            return new AddFeatureFlagEvaluations(featureFlags, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddFeatureFlagEvaluations)) {
                return false;
            }
            AddFeatureFlagEvaluations addFeatureFlagEvaluations = (AddFeatureFlagEvaluations) other;
            return wl7.b(this.featureFlags, addFeatureFlagEvaluations.featureFlags) && wl7.b(this.eventTime, addFeatureFlagEvaluations.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Map<String, Object> getFeatureFlags() {
            return this.featureFlags;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + (this.featureFlags.hashCode() * 31);
        }

        public String toString() {
            return "AddFeatureFlagEvaluations(featureFlags=" + this.featureFlags + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFeatureFlagEvaluations(Map<String, ? extends Object> map, Time time) {
            super(null);
            map.getClass();
            time.getClass();
            this.featureFlags = map;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "durationNs", "", "target", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(JLjava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "getDurationNs", "()J", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getTarget", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class AddLongTask extends RumRawEvent {
        private final long durationNs;
        private final Time eventTime;
        private final String target;

        public /* synthetic */ AddLongTask(long j, String str, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ AddLongTask copy$default(AddLongTask addLongTask, long j, String str, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                j = addLongTask.durationNs;
            }
            if ((i & 2) != 0) {
                str = addLongTask.target;
            }
            if ((i & 4) != 0) {
                time = addLongTask.eventTime;
            }
            return addLongTask.copy(j, str, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDurationNs() {
            return this.durationNs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final AddLongTask copy(long durationNs, String target, Time eventTime) {
            target.getClass();
            eventTime.getClass();
            return new AddLongTask(durationNs, target, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddLongTask)) {
                return false;
            }
            AddLongTask addLongTask = (AddLongTask) other;
            return this.durationNs == addLongTask.durationNs && wl7.b(this.target, addLongTask.target) && wl7.b(this.eventTime, addLongTask.eventTime);
        }

        public final long getDurationNs() {
            return this.durationNs;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + akb.d(Long.hashCode(this.durationNs) * 31, 31, this.target);
        }

        public String toString() {
            return "AddLongTask(durationNs=" + this.durationNs + ", target=" + this.target + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddLongTask(long j, String str, Time time) {
            super(null);
            str.getClass();
            time.getClass();
            this.durationNs = j;
            this.target = str;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "", "timing", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Ljava/lang/Object;", "getTiming", "()Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class AddResourceTiming extends RumRawEvent {
        private final Time eventTime;
        private final Object key;
        private final ResourceTiming timing;

        public /* synthetic */ AddResourceTiming(Object obj, ResourceTiming resourceTiming, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, resourceTiming, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ AddResourceTiming copy$default(AddResourceTiming addResourceTiming, Object obj, ResourceTiming resourceTiming, Time time, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = addResourceTiming.key;
            }
            if ((i & 2) != 0) {
                resourceTiming = addResourceTiming.timing;
            }
            if ((i & 4) != 0) {
                time = addResourceTiming.eventTime;
            }
            return addResourceTiming.copy(obj, resourceTiming, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ResourceTiming getTiming() {
            return this.timing;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final AddResourceTiming copy(Object key, ResourceTiming timing, Time eventTime) {
            key.getClass();
            timing.getClass();
            eventTime.getClass();
            return new AddResourceTiming(key, timing, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddResourceTiming)) {
                return false;
            }
            AddResourceTiming addResourceTiming = (AddResourceTiming) other;
            return wl7.b(this.key, addResourceTiming.key) && wl7.b(this.timing, addResourceTiming.timing) && wl7.b(this.eventTime, addResourceTiming.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Object getKey() {
            return this.key;
        }

        public final ResourceTiming getTiming() {
            return this.timing;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + ((this.timing.hashCode() + (this.key.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "AddResourceTiming(key=" + this.key + ", timing=" + this.timing + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddResourceTiming(Object obj, ResourceTiming resourceTiming, Time time) {
            super(null);
            obj.getClass();
            resourceTiming.getClass();
            time.getClass();
            this.key = obj;
            this.timing = resourceTiming;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "overwrite", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(ZLcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getOverwrite", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class AddViewLoadingTime extends RumRawEvent {
        private final Time eventTime;
        private final boolean overwrite;

        public /* synthetic */ AddViewLoadingTime(boolean z, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ AddViewLoadingTime copy$default(AddViewLoadingTime addViewLoadingTime, boolean z, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                z = addViewLoadingTime.overwrite;
            }
            if ((i & 2) != 0) {
                time = addViewLoadingTime.eventTime;
            }
            return addViewLoadingTime.copy(z, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getOverwrite() {
            return this.overwrite;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final AddViewLoadingTime copy(boolean overwrite, Time eventTime) {
            eventTime.getClass();
            return new AddViewLoadingTime(overwrite, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddViewLoadingTime)) {
                return false;
            }
            AddViewLoadingTime addViewLoadingTime = (AddViewLoadingTime) other;
            return this.overwrite == addViewLoadingTime.overwrite && wl7.b(this.eventTime, addViewLoadingTime.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final boolean getOverwrite() {
            return this.overwrite;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + (Boolean.hashCode(this.overwrite) * 31);
        }

        public String toString() {
            return "AddViewLoadingTime(overwrite=" + this.overwrite + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddViewLoadingTime(boolean z, Time time) {
            super(null);
            time.getClass();
            this.overwrite = z;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$KeepAlive;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class KeepAlive extends RumRawEvent {
        private final Time eventTime;

        public /* synthetic */ KeepAlive(Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ KeepAlive copy$default(KeepAlive keepAlive, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                time = keepAlive.eventTime;
            }
            return keepAlive.copy(time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final KeepAlive copy(Time eventTime) {
            eventTime.getClass();
            return new KeepAlive(eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof KeepAlive) && wl7.b(this.eventTime, ((KeepAlive) other).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return this.eventTime.hashCode();
        }

        public String toString() {
            return "KeepAlive(eventTime=" + this.eventTime + ")";
        }

        public KeepAlive() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeepAlive(Time time) {
            super(null);
            time.getClass();
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResetSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ResetSession extends RumRawEvent {
        private final Time eventTime;

        public /* synthetic */ ResetSession(Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ ResetSession copy$default(ResetSession resetSession, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                time = resetSession.eventTime;
            }
            return resetSession.copy(time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final ResetSession copy(Time eventTime) {
            eventTime.getClass();
            return new ResetSession(eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResetSession) && wl7.b(this.eventTime, ((ResetSession) other).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return this.eventTime.hashCode();
        }

        public String toString() {
            return "ResetSession(eventTime=" + this.eventTime + ")";
        }

        public ResetSession() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetSession(Time time) {
            super(null);
            time.getClass();
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "resourceId", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getResourceId", "()Ljava/lang/String;", "getViewId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ResourceDropped extends RumRawEvent {
        private final Time eventTime;
        private final String resourceId;
        private final String viewId;

        public /* synthetic */ ResourceDropped(String str, String str2, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ ResourceDropped copy$default(ResourceDropped resourceDropped, String str, String str2, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resourceDropped.viewId;
            }
            if ((i & 2) != 0) {
                str2 = resourceDropped.resourceId;
            }
            if ((i & 4) != 0) {
                time = resourceDropped.eventTime;
            }
            return resourceDropped.copy(str, str2, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getResourceId() {
            return this.resourceId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final ResourceDropped copy(String viewId, String resourceId, Time eventTime) {
            viewId.getClass();
            resourceId.getClass();
            eventTime.getClass();
            return new ResourceDropped(viewId, resourceId, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResourceDropped)) {
                return false;
            }
            ResourceDropped resourceDropped = (ResourceDropped) other;
            return wl7.b(this.viewId, resourceDropped.viewId) && wl7.b(this.resourceId, resourceDropped.resourceId) && wl7.b(this.eventTime, resourceDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getResourceId() {
            return this.resourceId;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + akb.d(this.viewId.hashCode() * 31, 31, this.resourceId);
        }

        public String toString() {
            String str = this.viewId;
            String str2 = this.resourceId;
            Time time = this.eventTime;
            StringBuilder sbF = u40.f("ResourceDropped(viewId=", str, ", resourceId=", str2, ", eventTime=");
            sbF.append(time);
            sbF.append(")");
            return sbF.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceDropped(String str, String str2, Time time) {
            super(null);
            str.getClass();
            str2.getClass();
            time.getClass();
            this.viewId = str;
            this.resourceId = str2;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SdkInit;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "isAppInForeground", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(ZLcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class SdkInit extends RumRawEvent {
        private final Time eventTime;
        private final boolean isAppInForeground;

        public /* synthetic */ SdkInit(boolean z, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ SdkInit copy$default(SdkInit sdkInit, boolean z, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                z = sdkInit.isAppInForeground;
            }
            if ((i & 2) != 0) {
                time = sdkInit.eventTime;
            }
            return sdkInit.copy(z, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsAppInForeground() {
            return this.isAppInForeground;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final SdkInit copy(boolean isAppInForeground, Time eventTime) {
            eventTime.getClass();
            return new SdkInit(isAppInForeground, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkInit)) {
                return false;
            }
            SdkInit sdkInit = (SdkInit) other;
            return this.isAppInForeground == sdkInit.isAppInForeground && wl7.b(this.eventTime, sdkInit.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + (Boolean.hashCode(this.isAppInForeground) * 31);
        }

        public final boolean isAppInForeground() {
            return this.isAppInForeground;
        }

        public String toString() {
            return "SdkInit(isAppInForeground=" + this.isAppInForeground + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkInit(boolean z, Time time) {
            super(null);
            time.getClass();
            this.isAppInForeground = z;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SendCustomActionNow;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class SendCustomActionNow extends RumRawEvent {
        private final Time eventTime;

        public /* synthetic */ SendCustomActionNow(Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ SendCustomActionNow copy$default(SendCustomActionNow sendCustomActionNow, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                time = sendCustomActionNow.eventTime;
            }
            return sendCustomActionNow.copy(time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final SendCustomActionNow copy(Time eventTime) {
            eventTime.getClass();
            return new SendCustomActionNow(eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendCustomActionNow) && wl7.b(this.eventTime, ((SendCustomActionNow) other).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return this.eventTime.hashCode();
        }

        public String toString() {
            return "SendCustomActionNow(eventTime=" + this.eventTime + ")";
        }

        public SendCustomActionNow() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendCustomActionNow(Time time) {
            super(null);
            time.getClass();
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$SetSyntheticsTestAttribute;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "testId", "", "resultId", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getResultId", "()Ljava/lang/String;", "getTestId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class SetSyntheticsTestAttribute extends RumRawEvent {
        private final Time eventTime;
        private final String resultId;
        private final String testId;

        public /* synthetic */ SetSyntheticsTestAttribute(String str, String str2, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ SetSyntheticsTestAttribute copy$default(SetSyntheticsTestAttribute setSyntheticsTestAttribute, String str, String str2, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setSyntheticsTestAttribute.testId;
            }
            if ((i & 2) != 0) {
                str2 = setSyntheticsTestAttribute.resultId;
            }
            if ((i & 4) != 0) {
                time = setSyntheticsTestAttribute.eventTime;
            }
            return setSyntheticsTestAttribute.copy(str, str2, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getResultId() {
            return this.resultId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final SetSyntheticsTestAttribute copy(String testId, String resultId, Time eventTime) {
            testId.getClass();
            resultId.getClass();
            eventTime.getClass();
            return new SetSyntheticsTestAttribute(testId, resultId, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetSyntheticsTestAttribute)) {
                return false;
            }
            SetSyntheticsTestAttribute setSyntheticsTestAttribute = (SetSyntheticsTestAttribute) other;
            return wl7.b(this.testId, setSyntheticsTestAttribute.testId) && wl7.b(this.resultId, setSyntheticsTestAttribute.resultId) && wl7.b(this.eventTime, setSyntheticsTestAttribute.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getResultId() {
            return this.resultId;
        }

        public final String getTestId() {
            return this.testId;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + akb.d(this.testId.hashCode() * 31, 31, this.resultId);
        }

        public String toString() {
            String str = this.testId;
            String str2 = this.resultId;
            Time time = this.eventTime;
            StringBuilder sbF = u40.f("SetSyntheticsTestAttribute(testId=", str, ", resultId=", str2, ", eventTime=");
            sbF.append(time);
            sbF.append(")");
            return sbF.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetSyntheticsTestAttribute(String str, String str2, Time time) {
            super(null);
            str.getClass();
            str2.getClass();
            time.getClass();
            this.testId = str;
            this.resultId = str2;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StartView extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final RumScopeKey key;

        public /* synthetic */ StartView(RumScopeKey rumScopeKey, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumScopeKey, map, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StartView copy$default(StartView startView, RumScopeKey rumScopeKey, Map map, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                rumScopeKey = startView.key;
            }
            if ((i & 2) != 0) {
                map = startView.attributes;
            }
            if ((i & 4) != 0) {
                time = startView.eventTime;
            }
            return startView.copy(rumScopeKey, map, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RumScopeKey getKey() {
            return this.key;
        }

        public final Map<String, Object> component2() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StartView copy(RumScopeKey key, Map<String, ? extends Object> attributes, Time eventTime) {
            key.getClass();
            attributes.getClass();
            eventTime.getClass();
            return new StartView(key, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartView)) {
                return false;
            }
            StartView startView = (StartView) other;
            return wl7.b(this.key, startView.key) && wl7.b(this.attributes, startView.attributes) && wl7.b(this.eventTime, startView.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final RumScopeKey getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + k20.b(this.attributes, this.key.hashCode() * 31, 31);
        }

        public String toString() {
            return "StartView(key=" + this.key + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartView(RumScopeKey rumScopeKey, Map<String, ? extends Object> map, Time time) {
            super(null);
            rumScopeKey.getClass();
            map.getClass();
            time.getClass();
            this.key = rumScopeKey;
            this.attributes = map;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "type", "Lcom/datadog/android/rum/RumActionType;", "name", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getName", "()Ljava/lang/String;", "getType", "()Lcom/datadog/android/rum/RumActionType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StopAction extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final String name;
        private final RumActionType type;

        public /* synthetic */ StopAction(RumActionType rumActionType, String str, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumActionType, str, map, (i & 8) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StopAction copy$default(StopAction stopAction, RumActionType rumActionType, String str, Map map, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                rumActionType = stopAction.type;
            }
            if ((i & 2) != 0) {
                str = stopAction.name;
            }
            if ((i & 4) != 0) {
                map = stopAction.attributes;
            }
            if ((i & 8) != 0) {
                time = stopAction.eventTime;
            }
            return stopAction.copy(rumActionType, str, map, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RumActionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> component3() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StopAction copy(RumActionType type, String name, Map<String, ? extends Object> attributes, Time eventTime) {
            attributes.getClass();
            eventTime.getClass();
            return new StopAction(type, name, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopAction)) {
                return false;
            }
            StopAction stopAction = (StopAction) other;
            return this.type == stopAction.type && wl7.b(this.name, stopAction.name) && wl7.b(this.attributes, stopAction.attributes) && wl7.b(this.eventTime, stopAction.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getName() {
            return this.name;
        }

        public final RumActionType getType() {
            return this.type;
        }

        public int hashCode() {
            RumActionType rumActionType = this.type;
            int iHashCode = (rumActionType == null ? 0 : rumActionType.hashCode()) * 31;
            String str = this.name;
            return this.eventTime.hashCode() + k20.b(this.attributes, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        }

        public String toString() {
            return "StopAction(type=" + this.type + ", name=" + this.name + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopAction(RumActionType rumActionType, String str, Map<String, ? extends Object> map, Time time) {
            super(null);
            map.getClass();
            time.getClass();
            this.type = rumActionType;
            this.name = str;
            this.attributes = map;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopSession;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StopSession extends RumRawEvent {
        private final Time eventTime;

        public /* synthetic */ StopSession(Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ StopSession copy$default(StopSession stopSession, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                time = stopSession.eventTime;
            }
            return stopSession.copy(time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StopSession copy(Time eventTime) {
            eventTime.getClass();
            return new StopSession(eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopSession) && wl7.b(this.eventTime, ((StopSession) other).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return this.eventTime.hashCode();
        }

        public String toString() {
            return "StopSession(eventTime=" + this.eventTime + ")";
        }

        public StopSession() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopSession(Time time) {
            super(null);
            time.getClass();
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StopView extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final RumScopeKey key;

        public /* synthetic */ StopView(RumScopeKey rumScopeKey, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumScopeKey, map, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StopView copy$default(StopView stopView, RumScopeKey rumScopeKey, Map map, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                rumScopeKey = stopView.key;
            }
            if ((i & 2) != 0) {
                map = stopView.attributes;
            }
            if ((i & 4) != 0) {
                time = stopView.eventTime;
            }
            return stopView.copy(rumScopeKey, map, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RumScopeKey getKey() {
            return this.key;
        }

        public final Map<String, Object> component2() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StopView copy(RumScopeKey key, Map<String, ? extends Object> attributes, Time eventTime) {
            key.getClass();
            attributes.getClass();
            eventTime.getClass();
            return new StopView(key, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopView)) {
                return false;
            }
            StopView stopView = (StopView) other;
            return wl7.b(this.key, stopView.key) && wl7.b(this.attributes, stopView.attributes) && wl7.b(this.eventTime, stopView.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final RumScopeKey getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + k20.b(this.attributes, this.key.hashCode() * 31, 31);
        }

        public String toString() {
            return "StopView(key=" + this.key + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopView(RumScopeKey rumScopeKey, Map<String, ? extends Object> map, Time time) {
            super(null);
            rumScopeKey.getClass();
            map.getClass();
            time.getClass();
            this.key = rumScopeKey;
            this.attributes = map;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$TelemetryEventWrapper;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEvent", "()Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class TelemetryEventWrapper extends RumRawEvent {
        private final InternalTelemetryEvent event;
        private final Time eventTime;

        public /* synthetic */ TelemetryEventWrapper(InternalTelemetryEvent internalTelemetryEvent, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(internalTelemetryEvent, (i & 2) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ TelemetryEventWrapper copy$default(TelemetryEventWrapper telemetryEventWrapper, InternalTelemetryEvent internalTelemetryEvent, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                internalTelemetryEvent = telemetryEventWrapper.event;
            }
            if ((i & 2) != 0) {
                time = telemetryEventWrapper.eventTime;
            }
            return telemetryEventWrapper.copy(internalTelemetryEvent, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InternalTelemetryEvent getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final TelemetryEventWrapper copy(InternalTelemetryEvent event, Time eventTime) {
            event.getClass();
            eventTime.getClass();
            return new TelemetryEventWrapper(event, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TelemetryEventWrapper)) {
                return false;
            }
            TelemetryEventWrapper telemetryEventWrapper = (TelemetryEventWrapper) other;
            return wl7.b(this.event, telemetryEventWrapper.event) && wl7.b(this.eventTime, telemetryEventWrapper.eventTime);
        }

        public final InternalTelemetryEvent getEvent() {
            return this.event;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return "TelemetryEventWrapper(event=" + this.event + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TelemetryEventWrapper(InternalTelemetryEvent internalTelemetryEvent, Time time) {
            super(null);
            internalTelemetryEvent.getClass();
            time.getClass();
            this.event = internalTelemetryEvent;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "metric", "Lcom/datadog/android/rum/RumPerformanceMetric;", "value", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/RumPerformanceMetric;DLcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getMetric", "()Lcom/datadog/android/rum/RumPerformanceMetric;", "getValue", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class UpdatePerformanceMetric extends RumRawEvent {
        private final Time eventTime;
        private final RumPerformanceMetric metric;
        private final double value;

        public /* synthetic */ UpdatePerformanceMetric(RumPerformanceMetric rumPerformanceMetric, double d, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumPerformanceMetric, d, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ UpdatePerformanceMetric copy$default(UpdatePerformanceMetric updatePerformanceMetric, RumPerformanceMetric rumPerformanceMetric, double d, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                rumPerformanceMetric = updatePerformanceMetric.metric;
            }
            if ((i & 2) != 0) {
                d = updatePerformanceMetric.value;
            }
            if ((i & 4) != 0) {
                time = updatePerformanceMetric.eventTime;
            }
            return updatePerformanceMetric.copy(rumPerformanceMetric, d, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RumPerformanceMetric getMetric() {
            return this.metric;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final UpdatePerformanceMetric copy(RumPerformanceMetric metric, double value, Time eventTime) {
            metric.getClass();
            eventTime.getClass();
            return new UpdatePerformanceMetric(metric, value, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatePerformanceMetric)) {
                return false;
            }
            UpdatePerformanceMetric updatePerformanceMetric = (UpdatePerformanceMetric) other;
            return this.metric == updatePerformanceMetric.metric && Double.compare(this.value, updatePerformanceMetric.value) == 0 && wl7.b(this.eventTime, updatePerformanceMetric.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final RumPerformanceMetric getMetric() {
            return this.metric;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + ((Double.hashCode(this.value) + (this.metric.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "UpdatePerformanceMetric(metric=" + this.metric + ", value=" + this.value + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePerformanceMetric(RumPerformanceMetric rumPerformanceMetric, double d, Time time) {
            super(null);
            rumPerformanceMetric.getClass();
            time.getClass();
            this.metric = rumPerformanceMetric;
            this.value = d;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WaitForResourceTiming;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class WaitForResourceTiming extends RumRawEvent {
        private final Time eventTime;
        private final Object key;

        public /* synthetic */ WaitForResourceTiming(Object obj, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ WaitForResourceTiming copy$default(WaitForResourceTiming waitForResourceTiming, Object obj, Time time, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = waitForResourceTiming.key;
            }
            if ((i & 2) != 0) {
                time = waitForResourceTiming.eventTime;
            }
            return waitForResourceTiming.copy(obj, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final WaitForResourceTiming copy(Object key, Time eventTime) {
            key.getClass();
            eventTime.getClass();
            return new WaitForResourceTiming(key, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForResourceTiming)) {
                return false;
            }
            WaitForResourceTiming waitForResourceTiming = (WaitForResourceTiming) other;
            return wl7.b(this.key, waitForResourceTiming.key) && wl7.b(this.eventTime, waitForResourceTiming.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Object getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return "WaitForResourceTiming(key=" + this.key + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForResourceTiming(Object obj, Time time) {
            super(null);
            obj.getClass();
            time.getClass();
            this.key = obj;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$WebViewEvent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class WebViewEvent extends RumRawEvent {
        private final Time eventTime;

        public /* synthetic */ WebViewEvent(Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ WebViewEvent copy$default(WebViewEvent webViewEvent, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                time = webViewEvent.eventTime;
            }
            return webViewEvent.copy(time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final WebViewEvent copy(Time eventTime) {
            eventTime.getClass();
            return new WebViewEvent(eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WebViewEvent) && wl7.b(this.eventTime, ((WebViewEvent) other).eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public int hashCode() {
            return this.eventTime.hashCode();
        }

        public String toString() {
            return "WebViewEvent(eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewEvent(Time time) {
            super(null);
            time.getClass();
            this.eventTime = time;
        }

        public WebViewEvent() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "resourceId", "resourceEndTimestampInNanos", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Ljava/lang/String;JLcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getResourceEndTimestampInNanos", "()J", "getResourceId", "()Ljava/lang/String;", "getViewId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ResourceSent extends RumRawEvent {
        private final Time eventTime;
        private final long resourceEndTimestampInNanos;
        private final String resourceId;
        private final String viewId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceSent(String str, String str2, long j, Time time) {
            super(null);
            str.getClass();
            str2.getClass();
            time.getClass();
            this.viewId = str;
            this.resourceId = str2;
            this.resourceEndTimestampInNanos = j;
            this.eventTime = time;
        }

        public static /* synthetic */ ResourceSent copy$default(ResourceSent resourceSent, String str, String str2, long j, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resourceSent.viewId;
            }
            if ((i & 2) != 0) {
                str2 = resourceSent.resourceId;
            }
            if ((i & 4) != 0) {
                j = resourceSent.resourceEndTimestampInNanos;
            }
            if ((i & 8) != 0) {
                time = resourceSent.eventTime;
            }
            Time time2 = time;
            return resourceSent.copy(str, str2, j, time2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getResourceId() {
            return this.resourceId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final ResourceSent copy(String viewId, String resourceId, long resourceEndTimestampInNanos, Time eventTime) {
            viewId.getClass();
            resourceId.getClass();
            eventTime.getClass();
            return new ResourceSent(viewId, resourceId, resourceEndTimestampInNanos, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResourceSent)) {
                return false;
            }
            ResourceSent resourceSent = (ResourceSent) other;
            return wl7.b(this.viewId, resourceSent.viewId) && wl7.b(this.resourceId, resourceSent.resourceId) && this.resourceEndTimestampInNanos == resourceSent.resourceEndTimestampInNanos && wl7.b(this.eventTime, resourceSent.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        public final String getResourceId() {
            return this.resourceId;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + ia.d(akb.d(this.viewId.hashCode() * 31, 31, this.resourceId), 31, this.resourceEndTimestampInNanos);
        }

        public String toString() {
            String str = this.viewId;
            String str2 = this.resourceId;
            long j = this.resourceEndTimestampInNanos;
            Time time = this.eventTime;
            StringBuilder sbF = u40.f("ResourceSent(viewId=", str, ", resourceId=", str2, ", resourceEndTimestampInNanos=");
            sbF.append(j);
            sbF.append(", eventTime=");
            sbF.append(time);
            sbF.append(")");
            return sbF.toString();
        }

        public /* synthetic */ ResourceSent(String str, String str2, long j, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, (i & 8) != 0 ? new Time(0L, 0L, 3, null) : time);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "frustrationCount", "", "type", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "eventEndTimestampInNanos", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;ILcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;JLcom/datadog/android/rum/internal/domain/Time;)V", "getEventEndTimestampInNanos", "()J", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getFrustrationCount", "()I", "getType", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "getViewId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ActionSent extends RumRawEvent {
        private final long eventEndTimestampInNanos;
        private final Time eventTime;
        private final int frustrationCount;
        private final ActionEvent.ActionEventActionType type;
        private final String viewId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionSent(String str, int i, ActionEvent.ActionEventActionType actionEventActionType, long j, Time time) {
            super(null);
            str.getClass();
            actionEventActionType.getClass();
            time.getClass();
            this.viewId = str;
            this.frustrationCount = i;
            this.type = actionEventActionType;
            this.eventEndTimestampInNanos = j;
            this.eventTime = time;
        }

        public static /* synthetic */ ActionSent copy$default(ActionSent actionSent, String str, int i, ActionEvent.ActionEventActionType actionEventActionType, long j, Time time, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = actionSent.viewId;
            }
            if ((i2 & 2) != 0) {
                i = actionSent.frustrationCount;
            }
            if ((i2 & 4) != 0) {
                actionEventActionType = actionSent.type;
            }
            if ((i2 & 8) != 0) {
                j = actionSent.eventEndTimestampInNanos;
            }
            if ((i2 & 16) != 0) {
                time = actionSent.eventTime;
            }
            Time time2 = time;
            ActionEvent.ActionEventActionType actionEventActionType2 = actionEventActionType;
            return actionSent.copy(str, i, actionEventActionType2, j, time2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getFrustrationCount() {
            return this.frustrationCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ActionEvent.ActionEventActionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getEventEndTimestampInNanos() {
            return this.eventEndTimestampInNanos;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final ActionSent copy(String viewId, int frustrationCount, ActionEvent.ActionEventActionType type, long eventEndTimestampInNanos, Time eventTime) {
            viewId.getClass();
            type.getClass();
            eventTime.getClass();
            return new ActionSent(viewId, frustrationCount, type, eventEndTimestampInNanos, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionSent)) {
                return false;
            }
            ActionSent actionSent = (ActionSent) other;
            return wl7.b(this.viewId, actionSent.viewId) && this.frustrationCount == actionSent.frustrationCount && this.type == actionSent.type && this.eventEndTimestampInNanos == actionSent.eventEndTimestampInNanos && wl7.b(this.eventTime, actionSent.eventTime);
        }

        public final long getEventEndTimestampInNanos() {
            return this.eventEndTimestampInNanos;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final int getFrustrationCount() {
            return this.frustrationCount;
        }

        public final ActionEvent.ActionEventActionType getType() {
            return this.type;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + ia.d((this.type.hashCode() + w40.c(this.frustrationCount, this.viewId.hashCode() * 31, 31)) * 31, 31, this.eventEndTimestampInNanos);
        }

        public String toString() {
            String str = this.viewId;
            int i = this.frustrationCount;
            ActionEvent.ActionEventActionType actionEventActionType = this.type;
            long j = this.eventEndTimestampInNanos;
            Time time = this.eventTime;
            StringBuilder sbH = w40.h(i, "ActionSent(viewId=", str, ", frustrationCount=", ", type=");
            sbH.append(actionEventActionType);
            sbH.append(", eventEndTimestampInNanos=");
            sbH.append(j);
            sbH.append(", eventTime=");
            sbH.append(time);
            sbH.append(")");
            return sbH.toString();
        }

        public /* synthetic */ ActionSent(String str, int i, ActionEvent.ActionEventActionType actionEventActionType, long j, Time time, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, actionEventActionType, j, (i2 & 16) != 0 ? new Time(0L, 0L, 3, null) : time);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "resourceId", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getResourceId", "()Ljava/lang/String;", "getViewId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ErrorDropped extends RumRawEvent {
        private final Time eventTime;
        private final String resourceId;
        private final String viewId;

        public /* synthetic */ ErrorDropped(String str, String str2, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ ErrorDropped copy$default(ErrorDropped errorDropped, String str, String str2, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorDropped.viewId;
            }
            if ((i & 2) != 0) {
                str2 = errorDropped.resourceId;
            }
            if ((i & 4) != 0) {
                time = errorDropped.eventTime;
            }
            return errorDropped.copy(str, str2, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getResourceId() {
            return this.resourceId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final ErrorDropped copy(String viewId, String resourceId, Time eventTime) {
            viewId.getClass();
            eventTime.getClass();
            return new ErrorDropped(viewId, resourceId, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorDropped)) {
                return false;
            }
            ErrorDropped errorDropped = (ErrorDropped) other;
            return wl7.b(this.viewId, errorDropped.viewId) && wl7.b(this.resourceId, errorDropped.resourceId) && wl7.b(this.eventTime, errorDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getResourceId() {
            return this.resourceId;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            int iHashCode = this.viewId.hashCode() * 31;
            String str = this.resourceId;
            return this.eventTime.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.viewId;
            String str2 = this.resourceId;
            Time time = this.eventTime;
            StringBuilder sbF = u40.f("ErrorDropped(viewId=", str, ", resourceId=", str2, ", eventTime=");
            sbF.append(time);
            sbF.append(")");
            return sbF.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorDropped(String str, String str2, Time time) {
            super(null);
            str.getClass();
            time.getClass();
            this.viewId = str;
            this.resourceId = str2;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "isFrozenFrame", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;ZLcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "()Z", "getViewId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class LongTaskDropped extends RumRawEvent {
        private final Time eventTime;
        private final boolean isFrozenFrame;
        private final String viewId;

        public /* synthetic */ LongTaskDropped(String str, boolean z, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ LongTaskDropped copy$default(LongTaskDropped longTaskDropped, String str, boolean z, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = longTaskDropped.viewId;
            }
            if ((i & 2) != 0) {
                z = longTaskDropped.isFrozenFrame;
            }
            if ((i & 4) != 0) {
                time = longTaskDropped.eventTime;
            }
            return longTaskDropped.copy(str, z, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsFrozenFrame() {
            return this.isFrozenFrame;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final LongTaskDropped copy(String viewId, boolean isFrozenFrame, Time eventTime) {
            viewId.getClass();
            eventTime.getClass();
            return new LongTaskDropped(viewId, isFrozenFrame, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LongTaskDropped)) {
                return false;
            }
            LongTaskDropped longTaskDropped = (LongTaskDropped) other;
            return wl7.b(this.viewId, longTaskDropped.viewId) && this.isFrozenFrame == longTaskDropped.isFrozenFrame && wl7.b(this.eventTime, longTaskDropped.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + ia.f(this.viewId.hashCode() * 31, 31, this.isFrozenFrame);
        }

        public final boolean isFrozenFrame() {
            return this.isFrozenFrame;
        }

        public String toString() {
            return "LongTaskDropped(viewId=" + this.viewId + ", isFrozenFrame=" + this.isFrozenFrame + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LongTaskDropped(String str, boolean z, Time time) {
            super(null);
            str.getClass();
            time.getClass();
            this.viewId = str;
            this.isFrozenFrame = z;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "isFrozenFrame", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;ZLcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "()Z", "getViewId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class LongTaskSent extends RumRawEvent {
        private final Time eventTime;
        private final boolean isFrozenFrame;
        private final String viewId;

        public /* synthetic */ LongTaskSent(String str, boolean z, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ LongTaskSent copy$default(LongTaskSent longTaskSent, String str, boolean z, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = longTaskSent.viewId;
            }
            if ((i & 2) != 0) {
                z = longTaskSent.isFrozenFrame;
            }
            if ((i & 4) != 0) {
                time = longTaskSent.eventTime;
            }
            return longTaskSent.copy(str, z, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsFrozenFrame() {
            return this.isFrozenFrame;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final LongTaskSent copy(String viewId, boolean isFrozenFrame, Time eventTime) {
            viewId.getClass();
            eventTime.getClass();
            return new LongTaskSent(viewId, isFrozenFrame, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LongTaskSent)) {
                return false;
            }
            LongTaskSent longTaskSent = (LongTaskSent) other;
            return wl7.b(this.viewId, longTaskSent.viewId) && this.isFrozenFrame == longTaskSent.isFrozenFrame && wl7.b(this.eventTime, longTaskSent.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + ia.f(this.viewId.hashCode() * 31, 31, this.isFrozenFrame);
        }

        public final boolean isFrozenFrame() {
            return this.isFrozenFrame;
        }

        public String toString() {
            return "LongTaskSent(viewId=" + this.viewId + ", isFrozenFrame=" + this.isFrozenFrame + ", eventTime=" + this.eventTime + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LongTaskSent(String str, boolean z, Time time) {
            super(null);
            str.getClass();
            time.getClass();
            this.viewId = str;
            this.isFrozenFrame = z;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "type", "Lcom/datadog/android/rum/RumActionType;", "name", "", "waitForStop", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;ZLjava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getName", "()Ljava/lang/String;", "getType", "()Lcom/datadog/android/rum/RumActionType;", "getWaitForStop", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StartAction extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final String name;
        private final RumActionType type;
        private final boolean waitForStop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartAction(RumActionType rumActionType, String str, boolean z, Map<String, ? extends Object> map, Time time) {
            super(null);
            rumActionType.getClass();
            str.getClass();
            map.getClass();
            time.getClass();
            this.type = rumActionType;
            this.name = str;
            this.waitForStop = z;
            this.attributes = map;
            this.eventTime = time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StartAction copy$default(StartAction startAction, RumActionType rumActionType, String str, boolean z, Map map, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                rumActionType = startAction.type;
            }
            if ((i & 2) != 0) {
                str = startAction.name;
            }
            if ((i & 4) != 0) {
                z = startAction.waitForStop;
            }
            if ((i & 8) != 0) {
                map = startAction.attributes;
            }
            if ((i & 16) != 0) {
                time = startAction.eventTime;
            }
            Time time2 = time;
            boolean z2 = z;
            return startAction.copy(rumActionType, str, z2, map, time2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RumActionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getWaitForStop() {
            return this.waitForStop;
        }

        public final Map<String, Object> component4() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StartAction copy(RumActionType type, String name, boolean waitForStop, Map<String, ? extends Object> attributes, Time eventTime) {
            type.getClass();
            name.getClass();
            attributes.getClass();
            eventTime.getClass();
            return new StartAction(type, name, waitForStop, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartAction)) {
                return false;
            }
            StartAction startAction = (StartAction) other;
            return this.type == startAction.type && wl7.b(this.name, startAction.name) && this.waitForStop == startAction.waitForStop && wl7.b(this.attributes, startAction.attributes) && wl7.b(this.eventTime, startAction.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getName() {
            return this.name;
        }

        public final RumActionType getType() {
            return this.type;
        }

        public final boolean getWaitForStop() {
            return this.waitForStop;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + k20.b(this.attributes, ia.f(akb.d(this.type.hashCode() * 31, 31, this.name), 31, this.waitForStop), 31);
        }

        public String toString() {
            return "StartAction(type=" + this.type + ", name=" + this.name + ", waitForStop=" + this.waitForStop + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }

        public /* synthetic */ StartAction(RumActionType rumActionType, String str, boolean z, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumActionType, str, z, map, (i & 16) != 0 ? new Time(0L, 0L, 3, null) : time);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\\\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018¨\u0006)"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "", "statusCode", "", "size", "kind", "Lcom/datadog/android/rum/RumResourceKind;", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Ljava/lang/Object;", "getKind", "()Lcom/datadog/android/rum/RumResourceKind;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatusCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResource;", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StopResource extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final Object key;
        private final RumResourceKind kind;
        private final Long size;
        private final Long statusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopResource(Object obj, Long l, Long l2, RumResourceKind rumResourceKind, Map<String, ? extends Object> map, Time time) {
            super(null);
            obj.getClass();
            rumResourceKind.getClass();
            map.getClass();
            time.getClass();
            this.key = obj;
            this.statusCode = l;
            this.size = l2;
            this.kind = rumResourceKind;
            this.attributes = map;
            this.eventTime = time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StopResource copy$default(StopResource stopResource, Object obj, Long l, Long l2, RumResourceKind rumResourceKind, Map map, Time time, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = stopResource.key;
            }
            if ((i & 2) != 0) {
                l = stopResource.statusCode;
            }
            if ((i & 4) != 0) {
                l2 = stopResource.size;
            }
            if ((i & 8) != 0) {
                rumResourceKind = stopResource.kind;
            }
            if ((i & 16) != 0) {
                map = stopResource.attributes;
            }
            if ((i & 32) != 0) {
                time = stopResource.eventTime;
            }
            Map map2 = map;
            Time time2 = time;
            return stopResource.copy(obj, l, l2, rumResourceKind, map2, time2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStatusCode() {
            return this.statusCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final RumResourceKind getKind() {
            return this.kind;
        }

        public final Map<String, Object> component5() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StopResource copy(Object key, Long statusCode, Long size, RumResourceKind kind, Map<String, ? extends Object> attributes, Time eventTime) {
            key.getClass();
            kind.getClass();
            attributes.getClass();
            eventTime.getClass();
            return new StopResource(key, statusCode, size, kind, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopResource)) {
                return false;
            }
            StopResource stopResource = (StopResource) other;
            return wl7.b(this.key, stopResource.key) && wl7.b(this.statusCode, stopResource.statusCode) && wl7.b(this.size, stopResource.size) && this.kind == stopResource.kind && wl7.b(this.attributes, stopResource.attributes) && wl7.b(this.eventTime, stopResource.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Object getKey() {
            return this.key;
        }

        public final RumResourceKind getKind() {
            return this.kind;
        }

        public final Long getSize() {
            return this.size;
        }

        public final Long getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            Long l = this.statusCode;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.size;
            return this.eventTime.hashCode() + k20.b(this.attributes, (this.kind.hashCode() + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31)) * 31, 31);
        }

        public String toString() {
            return "StopResource(key=" + this.key + ", statusCode=" + this.statusCode + ", size=" + this.size + ", kind=" + this.kind + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }

        public /* synthetic */ StopResource(Object obj, Long l, Long l2, RumResourceKind rumResourceKind, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, l2, rumResourceKind, map, (i & 32) != 0 ? new Time(0L, 0L, 3, null) : time);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "", "url", "", "method", "Lcom/datadog/android/rum/RumResourceMethod;", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/Object;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Ljava/lang/Object;", "getMethod", "()Lcom/datadog/android/rum/RumResourceMethod;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StartResource extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final Object key;
        private final RumResourceMethod method;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartResource(Object obj, String str, RumResourceMethod rumResourceMethod, Map<String, ? extends Object> map, Time time) {
            super(null);
            obj.getClass();
            str.getClass();
            rumResourceMethod.getClass();
            map.getClass();
            time.getClass();
            this.key = obj;
            this.url = str;
            this.method = rumResourceMethod;
            this.attributes = map;
            this.eventTime = time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StartResource copy$default(StartResource startResource, Object obj, String str, RumResourceMethod rumResourceMethod, Map map, Time time, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = startResource.key;
            }
            if ((i & 2) != 0) {
                str = startResource.url;
            }
            if ((i & 4) != 0) {
                rumResourceMethod = startResource.method;
            }
            if ((i & 8) != 0) {
                map = startResource.attributes;
            }
            if ((i & 16) != 0) {
                time = startResource.eventTime;
            }
            Time time2 = time;
            RumResourceMethod rumResourceMethod2 = rumResourceMethod;
            return startResource.copy(obj, str, rumResourceMethod2, map, time2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final RumResourceMethod getMethod() {
            return this.method;
        }

        public final Map<String, Object> component4() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StartResource copy(Object key, String url, RumResourceMethod method, Map<String, ? extends Object> attributes, Time eventTime) {
            key.getClass();
            url.getClass();
            method.getClass();
            attributes.getClass();
            eventTime.getClass();
            return new StartResource(key, url, method, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartResource)) {
                return false;
            }
            StartResource startResource = (StartResource) other;
            return wl7.b(this.key, startResource.key) && wl7.b(this.url, startResource.url) && this.method == startResource.method && wl7.b(this.attributes, startResource.attributes) && wl7.b(this.eventTime, startResource.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Object getKey() {
            return this.key;
        }

        public final RumResourceMethod getMethod() {
            return this.method;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.eventTime.hashCode() + k20.b(this.attributes, (this.method.hashCode() + akb.d(this.key.hashCode() * 31, 31, this.url)) * 31, 31);
        }

        public String toString() {
            return "StartResource(key=" + this.key + ", url=" + this.url + ", method=" + this.method + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }

        public /* synthetic */ StartResource(Object obj, String str, RumResourceMethod rumResourceMethod, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, str, rumResourceMethod, map, (i & 16) != 0 ? new Time(0L, 0L, 3, null) : time);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\bHÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", RumEventMeta.VIEW_ID_KEY, "", "resourceId", "resourceEndTimestampInNanos", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/internal/domain/Time;)V", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getResourceEndTimestampInNanos", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getResourceId", "()Ljava/lang/String;", "getViewId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ErrorSent extends RumRawEvent {
        private final Time eventTime;
        private final Long resourceEndTimestampInNanos;
        private final String resourceId;
        private final String viewId;

        public /* synthetic */ ErrorSent(String str, String str2, Long l, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? new Time(0L, 0L, 3, null) : time);
        }

        public static /* synthetic */ ErrorSent copy$default(ErrorSent errorSent, String str, String str2, Long l, Time time, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorSent.viewId;
            }
            if ((i & 2) != 0) {
                str2 = errorSent.resourceId;
            }
            if ((i & 4) != 0) {
                l = errorSent.resourceEndTimestampInNanos;
            }
            if ((i & 8) != 0) {
                time = errorSent.eventTime;
            }
            return errorSent.copy(str, str2, l, time);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getResourceId() {
            return this.resourceId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final ErrorSent copy(String viewId, String resourceId, Long resourceEndTimestampInNanos, Time eventTime) {
            viewId.getClass();
            eventTime.getClass();
            return new ErrorSent(viewId, resourceId, resourceEndTimestampInNanos, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorSent)) {
                return false;
            }
            ErrorSent errorSent = (ErrorSent) other;
            return wl7.b(this.viewId, errorSent.viewId) && wl7.b(this.resourceId, errorSent.resourceId) && wl7.b(this.resourceEndTimestampInNanos, errorSent.resourceEndTimestampInNanos) && wl7.b(this.eventTime, errorSent.eventTime);
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Long getResourceEndTimestampInNanos() {
            return this.resourceEndTimestampInNanos;
        }

        public final String getResourceId() {
            return this.resourceId;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            int iHashCode = this.viewId.hashCode() * 31;
            String str = this.resourceId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.resourceEndTimestampInNanos;
            return this.eventTime.hashCode() + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.viewId;
            String str2 = this.resourceId;
            Long l = this.resourceEndTimestampInNanos;
            Time time = this.eventTime;
            StringBuilder sbF = u40.f("ErrorSent(viewId=", str, ", resourceId=", str2, ", resourceEndTimestampInNanos=");
            sbF.append(l);
            sbF.append(", eventTime=");
            sbF.append(time);
            sbF.append(")");
            return sbF.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorSent(String str, String str2, Long l, Time time) {
            super(null);
            str.getClass();
            time.getClass();
            this.viewId = str;
            this.resourceId = str2;
            this.resourceEndTimestampInNanos = l;
            this.eventTime = time;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Jd\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "", "statusCode", "", "message", "", "source", "Lcom/datadog/android/rum/RumErrorSource;", RumFeature.EVENT_THROWABLE_PROPERTY, "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getSource", "()Lcom/datadog/android/rum/RumErrorSource;", "getStatusCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithError;", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StopResourceWithError extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final Object key;
        private final String message;
        private final RumErrorSource source;
        private final Long statusCode;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopResourceWithError(Object obj, Long l, String str, RumErrorSource rumErrorSource, Throwable th, Map<String, ? extends Object> map, Time time) {
            super(null);
            obj.getClass();
            str.getClass();
            rumErrorSource.getClass();
            th.getClass();
            map.getClass();
            time.getClass();
            this.key = obj;
            this.statusCode = l;
            this.message = str;
            this.source = rumErrorSource;
            this.throwable = th;
            this.attributes = map;
            this.eventTime = time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StopResourceWithError copy$default(StopResourceWithError stopResourceWithError, Object obj, Long l, String str, RumErrorSource rumErrorSource, Throwable th, Map map, Time time, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = stopResourceWithError.key;
            }
            if ((i & 2) != 0) {
                l = stopResourceWithError.statusCode;
            }
            if ((i & 4) != 0) {
                str = stopResourceWithError.message;
            }
            if ((i & 8) != 0) {
                rumErrorSource = stopResourceWithError.source;
            }
            if ((i & 16) != 0) {
                th = stopResourceWithError.throwable;
            }
            if ((i & 32) != 0) {
                map = stopResourceWithError.attributes;
            }
            if ((i & 64) != 0) {
                time = stopResourceWithError.eventTime;
            }
            Map map2 = map;
            Time time2 = time;
            Throwable th2 = th;
            String str2 = str;
            return stopResourceWithError.copy(obj, l, str2, rumErrorSource, th2, map2, time2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStatusCode() {
            return this.statusCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final RumErrorSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Map<String, Object> component6() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StopResourceWithError copy(Object key, Long statusCode, String message, RumErrorSource source, Throwable throwable, Map<String, ? extends Object> attributes, Time eventTime) {
            key.getClass();
            message.getClass();
            source.getClass();
            throwable.getClass();
            attributes.getClass();
            eventTime.getClass();
            return new StopResourceWithError(key, statusCode, message, source, throwable, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopResourceWithError)) {
                return false;
            }
            StopResourceWithError stopResourceWithError = (StopResourceWithError) other;
            return wl7.b(this.key, stopResourceWithError.key) && wl7.b(this.statusCode, stopResourceWithError.statusCode) && wl7.b(this.message, stopResourceWithError.message) && this.source == stopResourceWithError.source && wl7.b(this.throwable, stopResourceWithError.throwable) && wl7.b(this.attributes, stopResourceWithError.attributes) && wl7.b(this.eventTime, stopResourceWithError.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Object getKey() {
            return this.key;
        }

        public final String getMessage() {
            return this.message;
        }

        public final RumErrorSource getSource() {
            return this.source;
        }

        public final Long getStatusCode() {
            return this.statusCode;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            Long l = this.statusCode;
            return this.eventTime.hashCode() + k20.b(this.attributes, (this.throwable.hashCode() + ((this.source.hashCode() + akb.d((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.message)) * 31)) * 31, 31);
        }

        public String toString() {
            return "StopResourceWithError(key=" + this.key + ", statusCode=" + this.statusCode + ", message=" + this.message + ", source=" + this.source + ", throwable=" + this.throwable + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ")";
        }

        public /* synthetic */ StopResourceWithError(Object obj, Long l, String str, RumErrorSource rumErrorSource, Throwable th, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, str, rumErrorSource, th, map, (i & 64) != 0 ? new Time(0L, 0L, 3, null) : time);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jp\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "key", "", "statusCode", "", "message", "", "source", "Lcom/datadog/android/rum/RumErrorSource;", "stackTrace", "errorType", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)V", "getAttributes", "()Ljava/util/Map;", "getErrorType", "()Ljava/lang/String;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "getKey", "()Ljava/lang/Object;", "getMessage", "getSource", "()Lcom/datadog/android/rum/RumErrorSource;", "getStackTrace", "getStatusCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopResourceWithStackTrace;", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class StopResourceWithStackTrace extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final String errorType;
        private final Time eventTime;
        private final Object key;
        private final String message;
        private final RumErrorSource source;
        private final String stackTrace;
        private final Long statusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopResourceWithStackTrace(Object obj, Long l, String str, RumErrorSource rumErrorSource, String str2, String str3, Map<String, ? extends Object> map, Time time) {
            super(null);
            obj.getClass();
            str.getClass();
            rumErrorSource.getClass();
            str2.getClass();
            map.getClass();
            time.getClass();
            this.key = obj;
            this.statusCode = l;
            this.message = str;
            this.source = rumErrorSource;
            this.stackTrace = str2;
            this.errorType = str3;
            this.attributes = map;
            this.eventTime = time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StopResourceWithStackTrace copy$default(StopResourceWithStackTrace stopResourceWithStackTrace, Object obj, Long l, String str, RumErrorSource rumErrorSource, String str2, String str3, Map map, Time time, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = stopResourceWithStackTrace.key;
            }
            if ((i & 2) != 0) {
                l = stopResourceWithStackTrace.statusCode;
            }
            if ((i & 4) != 0) {
                str = stopResourceWithStackTrace.message;
            }
            if ((i & 8) != 0) {
                rumErrorSource = stopResourceWithStackTrace.source;
            }
            if ((i & 16) != 0) {
                str2 = stopResourceWithStackTrace.stackTrace;
            }
            if ((i & 32) != 0) {
                str3 = stopResourceWithStackTrace.errorType;
            }
            if ((i & 64) != 0) {
                map = stopResourceWithStackTrace.attributes;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                time = stopResourceWithStackTrace.eventTime;
            }
            Map map2 = map;
            Time time2 = time;
            String str4 = str2;
            String str5 = str3;
            return stopResourceWithStackTrace.copy(obj, l, str, rumErrorSource, str4, str5, map2, time2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStatusCode() {
            return this.statusCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final RumErrorSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getStackTrace() {
            return this.stackTrace;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getErrorType() {
            return this.errorType;
        }

        public final Map<String, Object> component7() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        public final StopResourceWithStackTrace copy(Object key, Long statusCode, String message, RumErrorSource source, String stackTrace, String errorType, Map<String, ? extends Object> attributes, Time eventTime) {
            key.getClass();
            message.getClass();
            source.getClass();
            stackTrace.getClass();
            attributes.getClass();
            eventTime.getClass();
            return new StopResourceWithStackTrace(key, statusCode, message, source, stackTrace, errorType, attributes, eventTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopResourceWithStackTrace)) {
                return false;
            }
            StopResourceWithStackTrace stopResourceWithStackTrace = (StopResourceWithStackTrace) other;
            return wl7.b(this.key, stopResourceWithStackTrace.key) && wl7.b(this.statusCode, stopResourceWithStackTrace.statusCode) && wl7.b(this.message, stopResourceWithStackTrace.message) && this.source == stopResourceWithStackTrace.source && wl7.b(this.stackTrace, stopResourceWithStackTrace.stackTrace) && wl7.b(this.errorType, stopResourceWithStackTrace.errorType) && wl7.b(this.attributes, stopResourceWithStackTrace.attributes) && wl7.b(this.eventTime, stopResourceWithStackTrace.eventTime);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final Object getKey() {
            return this.key;
        }

        public final String getMessage() {
            return this.message;
        }

        public final RumErrorSource getSource() {
            return this.source;
        }

        public final String getStackTrace() {
            return this.stackTrace;
        }

        public final Long getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            Long l = this.statusCode;
            int iD = akb.d((this.source.hashCode() + akb.d((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.message)) * 31, 31, this.stackTrace);
            String str = this.errorType;
            return this.eventTime.hashCode() + k20.b(this.attributes, (iD + (str != null ? str.hashCode() : 0)) * 31, 31);
        }

        public String toString() {
            Object obj = this.key;
            Long l = this.statusCode;
            String str = this.message;
            RumErrorSource rumErrorSource = this.source;
            String str2 = this.stackTrace;
            String str3 = this.errorType;
            Map<String, Object> map = this.attributes;
            Time time = this.eventTime;
            StringBuilder sb = new StringBuilder("StopResourceWithStackTrace(key=");
            sb.append(obj);
            sb.append(", statusCode=");
            sb.append(l);
            sb.append(", message=");
            sb.append(str);
            sb.append(", source=");
            sb.append(rumErrorSource);
            sb.append(", stackTrace=");
            ia.r(sb, str2, ", errorType=", str3, ", attributes=");
            sb.append(map);
            sb.append(", eventTime=");
            sb.append(time);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ StopResourceWithStackTrace(Object obj, Long l, String str, RumErrorSource rumErrorSource, String str2, String str3, Map map, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, l, str, rumErrorSource, str2, str3, map, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new Time(0L, 0L, 3, null) : time);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010*J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\fHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0012HÆ\u0003J\u0098\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001f¨\u0006?"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "message", "", "source", "Lcom/datadog/android/rum/RumErrorSource;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "stacktrace", "isFatal", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "", "eventTime", "Lcom/datadog/android/rum/internal/domain/Time;", "type", "sourceType", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "threads", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "timeSinceAppStartNs", "", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/lang/String;ZLjava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;Ljava/lang/String;Lcom/datadog/android/rum/internal/RumErrorSourceType;Ljava/util/List;Ljava/lang/Long;)V", "getAttributes", "()Ljava/util/Map;", "getEventTime", "()Lcom/datadog/android/rum/internal/domain/Time;", "()Z", "getMessage", "()Ljava/lang/String;", "getSource", "()Lcom/datadog/android/rum/RumErrorSource;", "getSourceType", "()Lcom/datadog/android/rum/internal/RumErrorSourceType;", "getStacktrace", "getThreads", "()Ljava/util/List;", "getThrowable", "()Ljava/lang/Throwable;", "getTimeSinceAppStartNs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/lang/String;ZLjava/util/Map;Lcom/datadog/android/rum/internal/domain/Time;Ljava/lang/String;Lcom/datadog/android/rum/internal/RumErrorSourceType;Ljava/util/List;Ljava/lang/Long;)Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "equals", "other", "hashCode", "", "toString", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class AddError extends RumRawEvent {
        private final Map<String, Object> attributes;
        private final Time eventTime;
        private final boolean isFatal;
        private final String message;
        private final RumErrorSource source;
        private final RumErrorSourceType sourceType;
        private final String stacktrace;
        private final List<ThreadDump> threads;
        private final Throwable throwable;
        private final Long timeSinceAppStartNs;
        private final String type;

        public /* synthetic */ AddError(String str, RumErrorSource rumErrorSource, Throwable th, String str2, boolean z, Map map, Time time, String str3, RumErrorSourceType rumErrorSourceType, List list, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, rumErrorSource, th, str2, z, map, (i & 64) != 0 ? new Time(0L, 0L, 3, null) : time, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str3, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? RumErrorSourceType.ANDROID : rumErrorSourceType, list, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddError copy$default(AddError addError, String str, RumErrorSource rumErrorSource, Throwable th, String str2, boolean z, Map map, Time time, String str3, RumErrorSourceType rumErrorSourceType, List list, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addError.message;
            }
            if ((i & 2) != 0) {
                rumErrorSource = addError.source;
            }
            if ((i & 4) != 0) {
                th = addError.throwable;
            }
            if ((i & 8) != 0) {
                str2 = addError.stacktrace;
            }
            if ((i & 16) != 0) {
                z = addError.isFatal;
            }
            if ((i & 32) != 0) {
                map = addError.attributes;
            }
            if ((i & 64) != 0) {
                time = addError.eventTime;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                str3 = addError.type;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                rumErrorSourceType = addError.sourceType;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                list = addError.threads;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                l = addError.timeSinceAppStartNs;
            }
            List list2 = list;
            Long l2 = l;
            String str4 = str3;
            RumErrorSourceType rumErrorSourceType2 = rumErrorSourceType;
            Map map2 = map;
            Time time2 = time;
            boolean z2 = z;
            Throwable th2 = th;
            return addError.copy(str, rumErrorSource, th2, str2, z2, map2, time2, str4, rumErrorSourceType2, list2, l2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final List<ThreadDump> component10() {
            return this.threads;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Long getTimeSinceAppStartNs() {
            return this.timeSinceAppStartNs;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final RumErrorSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getStacktrace() {
            return this.stacktrace;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsFatal() {
            return this.isFatal;
        }

        public final Map<String, Object> component6() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Time getEventTime() {
            return this.eventTime;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final RumErrorSourceType getSourceType() {
            return this.sourceType;
        }

        public final AddError copy(String message, RumErrorSource source, Throwable throwable, String stacktrace, boolean isFatal, Map<String, ? extends Object> attributes, Time eventTime, String type, RumErrorSourceType sourceType, List<ThreadDump> threads, Long timeSinceAppStartNs) {
            message.getClass();
            source.getClass();
            attributes.getClass();
            eventTime.getClass();
            sourceType.getClass();
            threads.getClass();
            return new AddError(message, source, throwable, stacktrace, isFatal, attributes, eventTime, type, sourceType, threads, timeSinceAppStartNs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddError)) {
                return false;
            }
            AddError addError = (AddError) other;
            return wl7.b(this.message, addError.message) && this.source == addError.source && wl7.b(this.throwable, addError.throwable) && wl7.b(this.stacktrace, addError.stacktrace) && this.isFatal == addError.isFatal && wl7.b(this.attributes, addError.attributes) && wl7.b(this.eventTime, addError.eventTime) && wl7.b(this.type, addError.type) && this.sourceType == addError.sourceType && wl7.b(this.threads, addError.threads) && wl7.b(this.timeSinceAppStartNs, addError.timeSinceAppStartNs);
        }

        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Override // com.datadog.android.rum.internal.domain.scope.RumRawEvent
        public Time getEventTime() {
            return this.eventTime;
        }

        public final String getMessage() {
            return this.message;
        }

        public final RumErrorSource getSource() {
            return this.source;
        }

        public final RumErrorSourceType getSourceType() {
            return this.sourceType;
        }

        public final String getStacktrace() {
            return this.stacktrace;
        }

        public final List<ThreadDump> getThreads() {
            return this.threads;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Long getTimeSinceAppStartNs() {
            return this.timeSinceAppStartNs;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = (this.source.hashCode() + (this.message.hashCode() * 31)) * 31;
            Throwable th = this.throwable;
            int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
            String str = this.stacktrace;
            int iHashCode3 = (this.eventTime.hashCode() + k20.b(this.attributes, ia.f((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFatal), 31)) * 31;
            String str2 = this.type;
            int iG = ia.g(this.threads, (this.sourceType.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
            Long l = this.timeSinceAppStartNs;
            return iG + (l != null ? l.hashCode() : 0);
        }

        public final boolean isFatal() {
            return this.isFatal;
        }

        public String toString() {
            return "AddError(message=" + this.message + ", source=" + this.source + ", throwable=" + this.throwable + ", stacktrace=" + this.stacktrace + ", isFatal=" + this.isFatal + ", attributes=" + this.attributes + ", eventTime=" + this.eventTime + ", type=" + this.type + ", sourceType=" + this.sourceType + ", threads=" + this.threads + ", timeSinceAppStartNs=" + this.timeSinceAppStartNs + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddError(String str, RumErrorSource rumErrorSource, Throwable th, String str2, boolean z, Map<String, ? extends Object> map, Time time, String str3, RumErrorSourceType rumErrorSourceType, List<ThreadDump> list, Long l) {
            super(null);
            str.getClass();
            rumErrorSource.getClass();
            map.getClass();
            time.getClass();
            rumErrorSourceType.getClass();
            list.getClass();
            this.message = str;
            this.source = rumErrorSource;
            this.throwable = th;
            this.stacktrace = str2;
            this.isFatal = z;
            this.attributes = map;
            this.eventTime = time;
            this.type = str3;
            this.sourceType = rumErrorSourceType;
            this.threads = list;
            this.timeSinceAppStartNs = l;
        }
    }
}
