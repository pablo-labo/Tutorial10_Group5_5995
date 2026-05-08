package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.event.EventMapper;
import com.datadog.android.event.NoOpEventMapper;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.wl7;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bm\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0001HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0001HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0001HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0010HÂ\u0003Js\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\u0012\u0010&\u001a\u0004\u0018\u00010\u00022\u0006\u0010'\u001a\u00020\u0002H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010'\u001a\u00020\u0002H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00022\u0006\u0010'\u001a\u00020\u0002H\u0002J\t\u0010*\u001a\u00020+HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006-"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMapper;", "Lcom/datadog/android/event/EventMapper;", "", "viewEventMapper", "Lcom/datadog/android/rum/model/ViewEvent;", "errorEventMapper", "Lcom/datadog/android/rum/model/ErrorEvent;", "resourceEventMapper", "Lcom/datadog/android/rum/model/ResourceEvent;", "actionEventMapper", "Lcom/datadog/android/rum/model/ActionEvent;", "longTaskEventMapper", "Lcom/datadog/android/rum/model/LongTaskEvent;", "telemetryConfigurationMapper", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/event/EventMapper;Lcom/datadog/android/api/InternalLogger;)V", "getActionEventMapper", "()Lcom/datadog/android/event/EventMapper;", "getErrorEventMapper", "getLongTaskEventMapper", "getResourceEventMapper", "getTelemetryConfigurationMapper", "getViewEventMapper", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "map", "event", "mapRumEvent", "resolveEvent", "toString", "", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class RumEventMapper implements EventMapper<Object> {
    public static final String EVENT_NULL_WARNING_MESSAGE = "RumEventMapper: the returned mapped object was null. This event will be dropped: %s";
    public static final String NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE = "RumEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s";
    public static final String NO_DROPPING_FATAL_ERRORS_WARNING_MESSAGE = "RumEventMapper: the return from the ErrorEvent mapper was null for a crash. Dropping crashes in from the event mapper is not supported. The original event object will be used instead.";
    public static final String NO_EVENT_MAPPER_ASSIGNED_WARNING_MESSAGE = "RumEventMapper: there was no EventMapper assigned for RUM event type: %s";
    public static final String VIEW_EVENT_NULL_WARNING_MESSAGE = "RumEventMapper: the returned mapped ViewEvent was null. The original event object will be used instead: %s";
    private final EventMapper<ActionEvent> actionEventMapper;
    private final EventMapper<ErrorEvent> errorEventMapper;
    private final InternalLogger internalLogger;
    private final EventMapper<LongTaskEvent> longTaskEventMapper;
    private final EventMapper<ResourceEvent> resourceEventMapper;
    private final EventMapper<TelemetryConfigurationEvent> telemetryConfigurationMapper;
    private final EventMapper<ViewEvent> viewEventMapper;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ Object $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj) {
            super(0);
            this.$event = obj;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumEventMapper.NO_EVENT_MAPPER_ASSIGNED_WARNING_MESSAGE, Arrays.copyOf(new Object[]{this.$event.getClass().getSimpleName()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05841 extends mj8 implements gu5<String> {
        final /* synthetic */ Object $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05841(Object obj) {
            super(0);
            this.$event = obj;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumEventMapper.VIEW_EVENT_NULL_WARNING_MESSAGE, Arrays.copyOf(new Object[]{this.$event}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05852 extends mj8 implements gu5<String> {
        final /* synthetic */ Object $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05852(Object obj) {
            super(0);
            this.$event = obj;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumEventMapper.EVENT_NULL_WARNING_MESSAGE, Arrays.copyOf(new Object[]{this.$event}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventMapper$resolveEvent$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ Object $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Object obj) {
            super(0);
            this.$event = obj;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumEventMapper.NOT_SAME_EVENT_INSTANCE_WARNING_MESSAGE, Arrays.copyOf(new Object[]{this.$event}, 1));
        }
    }

    public /* synthetic */ RumEventMapper(EventMapper eventMapper, EventMapper eventMapper2, EventMapper eventMapper3, EventMapper eventMapper4, EventMapper eventMapper5, EventMapper eventMapper6, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new NoOpEventMapper() : eventMapper, (i & 2) != 0 ? new NoOpEventMapper() : eventMapper2, (i & 4) != 0 ? new NoOpEventMapper() : eventMapper3, (i & 8) != 0 ? new NoOpEventMapper() : eventMapper4, (i & 16) != 0 ? new NoOpEventMapper() : eventMapper5, (i & 32) != 0 ? new NoOpEventMapper() : eventMapper6, internalLogger);
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RumEventMapper copy$default(RumEventMapper rumEventMapper, EventMapper eventMapper, EventMapper eventMapper2, EventMapper eventMapper3, EventMapper eventMapper4, EventMapper eventMapper5, EventMapper eventMapper6, InternalLogger internalLogger, int i, Object obj) {
        if ((i & 1) != 0) {
            eventMapper = rumEventMapper.viewEventMapper;
        }
        if ((i & 2) != 0) {
            eventMapper2 = rumEventMapper.errorEventMapper;
        }
        if ((i & 4) != 0) {
            eventMapper3 = rumEventMapper.resourceEventMapper;
        }
        if ((i & 8) != 0) {
            eventMapper4 = rumEventMapper.actionEventMapper;
        }
        if ((i & 16) != 0) {
            eventMapper5 = rumEventMapper.longTaskEventMapper;
        }
        if ((i & 32) != 0) {
            eventMapper6 = rumEventMapper.telemetryConfigurationMapper;
        }
        if ((i & 64) != 0) {
            internalLogger = rumEventMapper.internalLogger;
        }
        EventMapper eventMapper7 = eventMapper6;
        InternalLogger internalLogger2 = internalLogger;
        EventMapper eventMapper8 = eventMapper5;
        EventMapper eventMapper9 = eventMapper3;
        return rumEventMapper.copy(eventMapper, eventMapper2, eventMapper9, eventMapper4, eventMapper8, eventMapper7, internalLogger2);
    }

    private final Object mapRumEvent(Object event) {
        if (event instanceof ViewEvent) {
            return this.viewEventMapper.map(event);
        }
        if (event instanceof ActionEvent) {
            return this.actionEventMapper.map(event);
        }
        if (event instanceof ErrorEvent) {
            ErrorEvent errorEvent = (ErrorEvent) event;
            boolean zB = wl7.b(errorEvent.getError().isCrash(), Boolean.TRUE);
            EventMapper<ErrorEvent> eventMapper = this.errorEventMapper;
            if (!zB) {
                return eventMapper.map(event);
            }
            ErrorEvent map = eventMapper.map(event);
            if (map != null) {
                return map;
            }
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return errorEvent;
        }
        if (event instanceof ResourceEvent) {
            return this.resourceEventMapper.map(event);
        }
        if (event instanceof LongTaskEvent) {
            return this.longTaskEventMapper.map(event);
        }
        if (event instanceof TelemetryConfigurationEvent) {
            return this.telemetryConfigurationMapper.map(event);
        }
        if (event instanceof TelemetryDebugEvent ? true : event instanceof TelemetryUsageEvent ? true : event instanceof TelemetryErrorEvent) {
            return event;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass2(event), (Throwable) null, false, (Map) null, 56, (Object) null);
        return event;
    }

    private final Object resolveEvent(Object event) {
        Object objMapRumEvent = mapRumEvent(event);
        if ((event instanceof ViewEvent) && (objMapRumEvent == null || objMapRumEvent != event)) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new C05841(event), (Throwable) null, false, (Map) null, 56, (Object) null);
            return event;
        }
        if (objMapRumEvent == null) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) new C05852(event), (Throwable) null, false, (Map) null, 56, (Object) null);
            return null;
        }
        if (objMapRumEvent == event) {
            return event;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass3(event), (Throwable) null, false, (Map) null, 56, (Object) null);
        return null;
    }

    public final EventMapper<ViewEvent> component1() {
        return this.viewEventMapper;
    }

    public final EventMapper<ErrorEvent> component2() {
        return this.errorEventMapper;
    }

    public final EventMapper<ResourceEvent> component3() {
        return this.resourceEventMapper;
    }

    public final EventMapper<ActionEvent> component4() {
        return this.actionEventMapper;
    }

    public final EventMapper<LongTaskEvent> component5() {
        return this.longTaskEventMapper;
    }

    public final EventMapper<TelemetryConfigurationEvent> component6() {
        return this.telemetryConfigurationMapper;
    }

    public final RumEventMapper copy(EventMapper<ViewEvent> viewEventMapper, EventMapper<ErrorEvent> errorEventMapper, EventMapper<ResourceEvent> resourceEventMapper, EventMapper<ActionEvent> actionEventMapper, EventMapper<LongTaskEvent> longTaskEventMapper, EventMapper<TelemetryConfigurationEvent> telemetryConfigurationMapper, InternalLogger internalLogger) {
        viewEventMapper.getClass();
        errorEventMapper.getClass();
        resourceEventMapper.getClass();
        actionEventMapper.getClass();
        longTaskEventMapper.getClass();
        telemetryConfigurationMapper.getClass();
        internalLogger.getClass();
        return new RumEventMapper(viewEventMapper, errorEventMapper, resourceEventMapper, actionEventMapper, longTaskEventMapper, telemetryConfigurationMapper, internalLogger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RumEventMapper)) {
            return false;
        }
        RumEventMapper rumEventMapper = (RumEventMapper) other;
        return wl7.b(this.viewEventMapper, rumEventMapper.viewEventMapper) && wl7.b(this.errorEventMapper, rumEventMapper.errorEventMapper) && wl7.b(this.resourceEventMapper, rumEventMapper.resourceEventMapper) && wl7.b(this.actionEventMapper, rumEventMapper.actionEventMapper) && wl7.b(this.longTaskEventMapper, rumEventMapper.longTaskEventMapper) && wl7.b(this.telemetryConfigurationMapper, rumEventMapper.telemetryConfigurationMapper) && wl7.b(this.internalLogger, rumEventMapper.internalLogger);
    }

    public final EventMapper<ActionEvent> getActionEventMapper() {
        return this.actionEventMapper;
    }

    public final EventMapper<ErrorEvent> getErrorEventMapper() {
        return this.errorEventMapper;
    }

    public final EventMapper<LongTaskEvent> getLongTaskEventMapper() {
        return this.longTaskEventMapper;
    }

    public final EventMapper<ResourceEvent> getResourceEventMapper() {
        return this.resourceEventMapper;
    }

    public final EventMapper<TelemetryConfigurationEvent> getTelemetryConfigurationMapper() {
        return this.telemetryConfigurationMapper;
    }

    public final EventMapper<ViewEvent> getViewEventMapper() {
        return this.viewEventMapper;
    }

    public int hashCode() {
        return this.internalLogger.hashCode() + ((this.telemetryConfigurationMapper.hashCode() + ((this.longTaskEventMapper.hashCode() + ((this.actionEventMapper.hashCode() + ((this.resourceEventMapper.hashCode() + ((this.errorEventMapper.hashCode() + (this.viewEventMapper.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.datadog.android.event.EventMapper
    public Object map(Object event) {
        event.getClass();
        return resolveEvent(event);
    }

    public String toString() {
        return "RumEventMapper(viewEventMapper=" + this.viewEventMapper + ", errorEventMapper=" + this.errorEventMapper + ", resourceEventMapper=" + this.resourceEventMapper + ", actionEventMapper=" + this.actionEventMapper + ", longTaskEventMapper=" + this.longTaskEventMapper + ", telemetryConfigurationMapper=" + this.telemetryConfigurationMapper + ", internalLogger=" + this.internalLogger + ")";
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumEventMapper.NO_DROPPING_FATAL_ERRORS_WARNING_MESSAGE;
        }
    }

    public RumEventMapper(EventMapper<ViewEvent> eventMapper, EventMapper<ErrorEvent> eventMapper2, EventMapper<ResourceEvent> eventMapper3, EventMapper<ActionEvent> eventMapper4, EventMapper<LongTaskEvent> eventMapper5, EventMapper<TelemetryConfigurationEvent> eventMapper6, InternalLogger internalLogger) {
        eventMapper.getClass();
        eventMapper2.getClass();
        eventMapper3.getClass();
        eventMapper4.getClass();
        eventMapper5.getClass();
        eventMapper6.getClass();
        internalLogger.getClass();
        this.viewEventMapper = eventMapper;
        this.errorEventMapper = eventMapper2;
        this.resourceEventMapper = eventMapper3;
        this.actionEventMapper = eventMapper4;
        this.longTaskEventMapper = eventMapper5;
        this.telemetryConfigurationMapper = eventMapper6;
        this.internalLogger = internalLogger;
    }
}
