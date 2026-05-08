package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.constraints.DataConstraints;
import com.datadog.android.core.constraints.DatadogDataConstraints;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.ey8;
import defpackage.ka8;
import defpackage.lc9;
import defpackage.ut0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'¨\u0006)"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventSerializer;", "Lcom/datadog/android/core/persistence/Serializer;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/constraints/DataConstraints;", "dataConstraints", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/constraints/DataConstraints;)V", "Lcom/datadog/android/rum/model/ViewEvent;", "model", "", "serializeViewEvent", "(Lcom/datadog/android/rum/model/ViewEvent;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ErrorEvent;", "serializeErrorEvent", "(Lcom/datadog/android/rum/model/ErrorEvent;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent;", "serializeResourceEvent", "(Lcom/datadog/android/rum/model/ResourceEvent;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/ActionEvent;", "serializeActionEvent", "(Lcom/datadog/android/rum/model/ActionEvent;)Ljava/lang/String;", "Lcom/datadog/android/rum/model/LongTaskEvent;", "serializeLongTaskEvent", "(Lcom/datadog/android/rum/model/LongTaskEvent;)Ljava/lang/String;", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "validateContextAttributes", "(Ljava/util/Map;)Ljava/util/Map;", "validateUserAttributes", "Lab8;", "jsonObject", "extractKnownAttributes", "(Lab8;)Lab8;", "serialize", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/constraints/DataConstraints;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumEventSerializer implements Serializer<Object> {
    public static final String GLOBAL_ATTRIBUTE_PREFIX = "context";
    public static final String USER_ATTRIBUTE_PREFIX = "usr";
    public static final String USER_EXTRA_GROUP_VERBOSE_NAME = "user extra information";
    private final DataConstraints dataConstraints;
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> knownAttributes = ut0.I0(new String[]{RumAttributes.ACTION_GESTURE_DIRECTION, RumAttributes.ACTION_GESTURE_FROM_STATE, RumAttributes.ACTION_GESTURE_TO_STATE, RumAttributes.ACTION_TARGET_PARENT_RESOURCE_ID, RumAttributes.ACTION_TARGET_PARENT_CLASSNAME, RumAttributes.ACTION_TARGET_PARENT_INDEX, RumAttributes.ACTION_TARGET_CLASS_NAME, RumAttributes.ACTION_TARGET_RESOURCE_ID, RumAttributes.ACTION_TARGET_TITLE, RumAttributes.ERROR_RESOURCE_METHOD, RumAttributes.ERROR_RESOURCE_STATUS_CODE, RumAttributes.ERROR_RESOURCE_URL});
    private static final Set<String> ignoredAttributes = ut0.I0(new String[]{RumAttributes.INTERNAL_TIMESTAMP, RumAttributes.INTERNAL_ERROR_TYPE, "_dd.error.source_type", RumAttributes.INTERNAL_ERROR_IS_CRASH});
    private static final Set<String> crossPlatformTransitAttributes = ut0.I0(new String[]{RumAttributes.INTERNAL_TIMESTAMP, RumAttributes.INTERNAL_ERROR_TYPE, "_dd.error.source_type", RumAttributes.INTERNAL_ERROR_IS_CRASH});

    public RumEventSerializer(InternalLogger internalLogger, DataConstraints dataConstraints) {
        internalLogger.getClass();
        dataConstraints.getClass();
        this.internalLogger = internalLogger;
        this.dataConstraints = dataConstraints;
    }

    private final ab8 extractKnownAttributes(ab8 jsonObject) {
        if (jsonObject.a.containsKey(GLOBAL_ATTRIBUTE_PREFIX)) {
            ab8 ab8Var = (ab8) jsonObject.a.get(GLOBAL_ATTRIBUTE_PREFIX);
            Set<Map.Entry<String, ka8>> setEntrySet = ab8Var.a.entrySet();
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj : (ey8.b) setEntrySet) {
                if (knownAttributes.contains(((Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            for (Map.Entry entry : arrayList) {
                ab8Var.a.remove((String) entry.getKey());
                jsonObject.i((String) entry.getKey(), (ka8) entry.getValue());
            }
        }
        return jsonObject;
    }

    private final String serializeActionEvent(ActionEvent model) {
        ActionEvent.Usr usr = model.getUsr();
        ActionEvent.Usr usrCopy$default = usr != null ? ActionEvent.Usr.copy$default(usr, null, null, null, null, lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateUserAttributes(model.getUsr().getAdditionalProperties()), this.internalLogger)), 15, null) : null;
        ActionEvent.Context context = model.getContext();
        String string = extractKnownAttributes(ActionEvent.copy$default(model, 0L, null, null, null, null, null, null, null, null, usrCopy$default, null, null, null, null, null, null, null, null, context != null ? context.copy(lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateContextAttributes(model.getContext().getAdditionalProperties()), this.internalLogger))) : null, null, null, 1834495, null).toJson().d()).toString();
        string.getClass();
        return string;
    }

    private final String serializeErrorEvent(ErrorEvent model) {
        ErrorEvent.Usr usr = model.getUsr();
        ErrorEvent.Usr usrCopy$default = usr != null ? ErrorEvent.Usr.copy$default(usr, null, null, null, null, lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateUserAttributes(model.getUsr().getAdditionalProperties()), this.internalLogger)), 15, null) : null;
        ErrorEvent.Context context = model.getContext();
        String string = extractKnownAttributes(ErrorEvent.copy$default(model, 0L, null, null, null, null, null, null, null, null, usrCopy$default, null, null, null, null, null, null, null, null, context != null ? context.copy(lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateContextAttributes(model.getContext().getAdditionalProperties()), this.internalLogger))) : null, null, null, null, null, null, 16514559, null).toJson().d()).toString();
        string.getClass();
        return string;
    }

    private final String serializeLongTaskEvent(LongTaskEvent model) {
        LongTaskEvent.Usr usr = model.getUsr();
        LongTaskEvent.Usr usrCopy$default = usr != null ? LongTaskEvent.Usr.copy$default(usr, null, null, null, null, lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateUserAttributes(model.getUsr().getAdditionalProperties()), this.internalLogger)), 15, null) : null;
        LongTaskEvent.Context context = model.getContext();
        String string = extractKnownAttributes(LongTaskEvent.copy$default(model, 0L, null, null, null, null, null, null, null, null, usrCopy$default, null, null, null, null, null, null, null, null, context != null ? context.copy(lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateContextAttributes(model.getContext().getAdditionalProperties()), this.internalLogger))) : null, null, null, null, 3931647, null).toJson().d()).toString();
        string.getClass();
        return string;
    }

    private final String serializeResourceEvent(ResourceEvent model) {
        ResourceEvent.Usr usr = model.getUsr();
        ResourceEvent.Usr usrCopy$default = usr != null ? ResourceEvent.Usr.copy$default(usr, null, null, null, null, lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateUserAttributes(model.getUsr().getAdditionalProperties()), this.internalLogger)), 15, null) : null;
        ResourceEvent.Context context = model.getContext();
        String string = extractKnownAttributes(ResourceEvent.copy$default(model, 0L, null, null, null, null, null, null, null, null, usrCopy$default, null, null, null, null, null, null, null, null, context != null ? context.copy(lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateContextAttributes(model.getContext().getAdditionalProperties()), this.internalLogger))) : null, null, null, null, 3931647, null).toJson().d()).toString();
        string.getClass();
        return string;
    }

    private final String serializeViewEvent(ViewEvent model) {
        ViewEvent.Usr usr = model.getUsr();
        ViewEvent.Usr usrCopy$default = usr != null ? ViewEvent.Usr.copy$default(usr, null, null, null, null, lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateUserAttributes(model.getUsr().getAdditionalProperties()), this.internalLogger)), 15, null) : null;
        ViewEvent.Context context = model.getContext();
        ViewEvent.Context contextCopy = context != null ? context.copy(lc9.i0(JsonSerializer.INSTANCE.safeMapValuesToJson(validateContextAttributes(model.getContext().getAdditionalProperties()), this.internalLogger))) : null;
        ViewEvent.ViewEventView view = model.getView();
        ViewEvent.CustomTimings customTimings = model.getView().getCustomTimings();
        String string = extractKnownAttributes(ViewEvent.copy$default(model, 0L, null, null, null, null, null, null, null, view.copy((2013265919 & 1) != 0 ? view.id : null, (2013265919 & 2) != 0 ? view.referrer : null, (2013265919 & 4) != 0 ? view.url : null, (2013265919 & 8) != 0 ? view.name : null, (2013265919 & 16) != 0 ? view.loadingTime : null, (2013265919 & 32) != 0 ? view.networkSettledTime : null, (2013265919 & 64) != 0 ? view.interactionToNextViewTime : null, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? view.loadingType : null, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? view.timeSpent : 0L, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? view.firstContentfulPaint : null, (2013265919 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? view.largestContentfulPaint : null, (2013265919 & 2048) != 0 ? view.largestContentfulPaintTargetSelector : null, (2013265919 & 4096) != 0 ? view.firstInputDelay : null, (2013265919 & 8192) != 0 ? view.firstInputTime : null, (2013265919 & 16384) != 0 ? view.firstInputTargetSelector : null, (2013265919 & 32768) != 0 ? view.interactionToNextPaint : null, (2013265919 & 65536) != 0 ? view.interactionToNextPaintTime : null, (2013265919 & 131072) != 0 ? view.interactionToNextPaintTargetSelector : null, (2013265919 & 262144) != 0 ? view.cumulativeLayoutShift : null, (2013265919 & 524288) != 0 ? view.cumulativeLayoutShiftTime : null, (2013265919 & 1048576) != 0 ? view.cumulativeLayoutShiftTargetSelector : null, (2013265919 & 2097152) != 0 ? view.domComplete : null, (2013265919 & 4194304) != 0 ? view.domContentLoaded : null, (2013265919 & 8388608) != 0 ? view.domInteractive : null, (2013265919 & 16777216) != 0 ? view.loadEvent : null, (2013265919 & 33554432) != 0 ? view.firstByte : null, (2013265919 & 67108864) != 0 ? view.customTimings : customTimings != null ? customTimings.copy(this.dataConstraints.validateTimings(model.getView().getCustomTimings().getAdditionalProperties())) : null, (2013265919 & 134217728) != 0 ? view.isActive : null, (2013265919 & 268435456) != 0 ? view.isSlowRendered : null, (2013265919 & 536870912) != 0 ? view.action : null, (2013265919 & 1073741824) != 0 ? view.error : null, (2013265919 & Integer.MIN_VALUE) != 0 ? view.crash : null, (16383 & 1) != 0 ? view.longTask : null, (16383 & 2) != 0 ? view.frozenFrame : null, (16383 & 4) != 0 ? view.resource : null, (16383 & 8) != 0 ? view.frustration : null, (16383 & 16) != 0 ? view.inForegroundPeriods : null, (16383 & 32) != 0 ? view.memoryAverage : null, (16383 & 64) != 0 ? view.memoryMax : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? view.cpuTicksCount : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? view.cpuTicksPerSecond : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? view.refreshRateAverage : null, (16383 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? view.refreshRateMin : null, (16383 & 2048) != 0 ? view.flutterBuildTime : null, (16383 & 4096) != 0 ? view.flutterRasterTime : null, (16383 & 8192) != 0 ? view.jsRefreshRate : null), usrCopy$default, null, null, null, null, null, null, null, null, contextCopy, null, null, null, 3931391, null).toJson().d()).toString();
        string.getClass();
        return string;
    }

    private final Map<String, Object> validateContextAttributes(Map<String, ? extends Object> attributes) {
        DataConstraints dataConstraints = this.dataConstraints;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : attributes.entrySet()) {
            if (!crossPlatformTransitAttributes.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return DataConstraints.DefaultImpls.validateAttributes$default(dataConstraints, linkedHashMap, GLOBAL_ATTRIBUTE_PREFIX, null, ignoredAttributes, 4, null);
    }

    private final Map<String, Object> validateUserAttributes(Map<String, ? extends Object> attributes) {
        return this.dataConstraints.validateAttributes(attributes, "usr", "user extra information", ignoredAttributes);
    }

    @Override // com.datadog.android.core.persistence.Serializer
    public String serialize(Object model) {
        model.getClass();
        if (model instanceof ViewEvent) {
            return serializeViewEvent((ViewEvent) model);
        }
        if (model instanceof ErrorEvent) {
            return serializeErrorEvent((ErrorEvent) model);
        }
        if (model instanceof ActionEvent) {
            return serializeActionEvent((ActionEvent) model);
        }
        if (model instanceof ResourceEvent) {
            return serializeResourceEvent((ResourceEvent) model);
        }
        if (model instanceof LongTaskEvent) {
            return serializeLongTaskEvent((LongTaskEvent) model);
        }
        if (model instanceof TelemetryDebugEvent) {
            String string = ((TelemetryDebugEvent) model).toJson().toString();
            string.getClass();
            return string;
        }
        if (model instanceof TelemetryErrorEvent) {
            String string2 = ((TelemetryErrorEvent) model).toJson().toString();
            string2.getClass();
            return string2;
        }
        if (model instanceof TelemetryConfigurationEvent) {
            String string3 = ((TelemetryConfigurationEvent) model).toJson().toString();
            string3.getClass();
            return string3;
        }
        if (model instanceof TelemetryUsageEvent) {
            String string4 = ((TelemetryUsageEvent) model).toJson().toString();
            string4.getClass();
            return string4;
        }
        if (model instanceof ab8) {
            return model.toString();
        }
        String string5 = new ab8().toString();
        string5.getClass();
        return string5;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventSerializer$Companion;", "", "()V", "GLOBAL_ATTRIBUTE_PREFIX", "", "USER_ATTRIBUTE_PREFIX", "USER_EXTRA_GROUP_VERBOSE_NAME", "crossPlatformTransitAttributes", "", "getCrossPlatformTransitAttributes$dd_sdk_android_rum_release", "()Ljava/util/Set;", "ignoredAttributes", "getIgnoredAttributes$dd_sdk_android_rum_release", "knownAttributes", "getKnownAttributes$dd_sdk_android_rum_release", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getCrossPlatformTransitAttributes$dd_sdk_android_rum_release() {
            return RumEventSerializer.crossPlatformTransitAttributes;
        }

        public final Set<String> getIgnoredAttributes$dd_sdk_android_rum_release() {
            return RumEventSerializer.ignoredAttributes;
        }

        public final Set<String> getKnownAttributes$dd_sdk_android_rum_release() {
            return RumEventSerializer.knownAttributes;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RumEventSerializer(InternalLogger internalLogger, DataConstraints dataConstraints, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new DatadogDataConstraints(internalLogger) : dataConstraints);
    }
}
