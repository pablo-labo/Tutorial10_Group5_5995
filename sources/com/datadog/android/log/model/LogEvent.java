package com.datadog.android.log.model;

import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.akb;
import defpackage.ey8;
import defpackage.fb8;
import defpackage.g7;
import defpackage.hh2;
import defpackage.ia;
import defpackage.ka8;
import defpackage.l5;
import defpackage.l6;
import defpackage.s6;
import defpackage.u40;
import defpackage.ut0;
import defpackage.w98;
import defpackage.wl7;
import defpackage.z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u0000 R2\u00020\u0001:\u000bSRTUVWXYZ[\\B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u009e\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010\u001eJ\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010=\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\bB\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\bM\u0010\u001eR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010=\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010AR%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bQ\u0010.¨\u0006]"}, d2 = {"Lcom/datadog/android/log/model/LogEvent;", "", "Lcom/datadog/android/log/model/LogEvent$Status;", "status", "", "service", "message", LogAttributes.DATE, "Lcom/datadog/android/log/model/LogEvent$Logger;", "logger", "Lcom/datadog/android/log/model/LogEvent$Dd;", "dd", "Lcom/datadog/android/log/model/LogEvent$Usr;", "usr", "Lcom/datadog/android/log/model/LogEvent$Network;", "network", "Lcom/datadog/android/log/model/LogEvent$Error;", "error", "buildId", "ddtags", "", "additionalProperties", "<init>", "(Lcom/datadog/android/log/model/LogEvent$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/log/model/LogEvent$Logger;Lcom/datadog/android/log/model/LogEvent$Dd;Lcom/datadog/android/log/model/LogEvent$Usr;Lcom/datadog/android/log/model/LogEvent$Network;Lcom/datadog/android/log/model/LogEvent$Error;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/log/model/LogEvent$Status;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/datadog/android/log/model/LogEvent$Logger;", "component6", "()Lcom/datadog/android/log/model/LogEvent$Dd;", "component7", "()Lcom/datadog/android/log/model/LogEvent$Usr;", "component8", "()Lcom/datadog/android/log/model/LogEvent$Network;", "component9", "()Lcom/datadog/android/log/model/LogEvent$Error;", "component10", "component11", "component12", "()Ljava/util/Map;", "copy", "(Lcom/datadog/android/log/model/LogEvent$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/log/model/LogEvent$Logger;Lcom/datadog/android/log/model/LogEvent$Dd;Lcom/datadog/android/log/model/LogEvent$Usr;Lcom/datadog/android/log/model/LogEvent$Network;Lcom/datadog/android/log/model/LogEvent$Error;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/log/model/LogEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/log/model/LogEvent$Status;", "getStatus", "setStatus", "(Lcom/datadog/android/log/model/LogEvent$Status;)V", "Ljava/lang/String;", "getService", "getMessage", "setMessage", "(Ljava/lang/String;)V", "getDate", "Lcom/datadog/android/log/model/LogEvent$Logger;", "getLogger", "Lcom/datadog/android/log/model/LogEvent$Dd;", "getDd", "Lcom/datadog/android/log/model/LogEvent$Usr;", "getUsr", "Lcom/datadog/android/log/model/LogEvent$Network;", "getNetwork", "Lcom/datadog/android/log/model/LogEvent$Error;", "getError", "getBuildId", "getDdtags", "setDdtags", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "Client", "Dd", "Device", "Error", "Logger", "Network", "SimCarrier", "Status", "Thread", "Usr", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class LogEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] RESERVED_PROPERTIES = {"status", "service", "message", LogAttributes.DATE, "logger", "_dd", "usr", "network", "error", "build_id", "ddtags"};
    private final Map<String, Object> additionalProperties;
    private final String buildId;
    private final String date;
    private final Dd dd;
    private String ddtags;
    private final Error error;
    private final Logger logger;
    private String message;
    private final Network network;
    private final String service;
    private Status status;
    private final Usr usr;

    public LogEvent(Status status, String str, String str2, String str3, Logger logger, Dd dd, Usr usr, Network network, Error error, String str4, String str5, Map<String, Object> map) {
        status.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        logger.getClass();
        dd.getClass();
        str5.getClass();
        map.getClass();
        this.status = status;
        this.service = str;
        this.message = str2;
        this.date = str3;
        this.logger = logger;
        this.dd = dd;
        this.usr = usr;
        this.network = network;
        this.error = error;
        this.buildId = str4;
        this.ddtags = str5;
        this.additionalProperties = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogEvent copy$default(LogEvent logEvent, Status status, String str, String str2, String str3, Logger logger, Dd dd, Usr usr, Network network, Error error, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            status = logEvent.status;
        }
        if ((i & 2) != 0) {
            str = logEvent.service;
        }
        if ((i & 4) != 0) {
            str2 = logEvent.message;
        }
        if ((i & 8) != 0) {
            str3 = logEvent.date;
        }
        if ((i & 16) != 0) {
            logger = logEvent.logger;
        }
        if ((i & 32) != 0) {
            dd = logEvent.dd;
        }
        if ((i & 64) != 0) {
            usr = logEvent.usr;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            network = logEvent.network;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            error = logEvent.error;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            str4 = logEvent.buildId;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            str5 = logEvent.ddtags;
        }
        if ((i & 2048) != 0) {
            map = logEvent.additionalProperties;
        }
        String str6 = str5;
        Map map2 = map;
        Error error2 = error;
        String str7 = str4;
        Usr usr2 = usr;
        Network network2 = network;
        Logger logger2 = logger;
        Dd dd2 = dd;
        return logEvent.copy(status, str, str2, str3, logger2, dd2, usr2, network2, error2, str7, str6, map2);
    }

    public static final LogEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final LogEvent fromJsonObject(ab8 ab8Var) {
        return INSTANCE.fromJsonObject(ab8Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBuildId() {
        return this.buildId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDdtags() {
        return this.ddtags;
    }

    public final Map<String, Object> component12() {
        return this.additionalProperties;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Dd getDd() {
        return this.dd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Usr getUsr() {
        return this.usr;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Network getNetwork() {
        return this.network;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    public final LogEvent copy(Status status, String service, String message, String date, Logger logger, Dd dd, Usr usr, Network network, Error error, String buildId, String ddtags, Map<String, Object> additionalProperties) {
        status.getClass();
        service.getClass();
        message.getClass();
        date.getClass();
        logger.getClass();
        dd.getClass();
        ddtags.getClass();
        additionalProperties.getClass();
        return new LogEvent(status, service, message, date, logger, dd, usr, network, error, buildId, ddtags, additionalProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) other;
        return this.status == logEvent.status && wl7.b(this.service, logEvent.service) && wl7.b(this.message, logEvent.message) && wl7.b(this.date, logEvent.date) && wl7.b(this.logger, logEvent.logger) && wl7.b(this.dd, logEvent.dd) && wl7.b(this.usr, logEvent.usr) && wl7.b(this.network, logEvent.network) && wl7.b(this.error, logEvent.error) && wl7.b(this.buildId, logEvent.buildId) && wl7.b(this.ddtags, logEvent.ddtags) && wl7.b(this.additionalProperties, logEvent.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getBuildId() {
        return this.buildId;
    }

    public final String getDate() {
        return this.date;
    }

    public final Dd getDd() {
        return this.dd;
    }

    public final String getDdtags() {
        return this.ddtags;
    }

    public final Error getError() {
        return this.error;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Network getNetwork() {
        return this.network;
    }

    public final String getService() {
        return this.service;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Usr getUsr() {
        return this.usr;
    }

    public int hashCode() {
        int iHashCode = (this.dd.hashCode() + ((this.logger.hashCode() + akb.d(akb.d(akb.d(this.status.hashCode() * 31, 31, this.service), 31, this.message), 31, this.date)) * 31)) * 31;
        Usr usr = this.usr;
        int iHashCode2 = (iHashCode + (usr == null ? 0 : usr.hashCode())) * 31;
        Network network = this.network;
        int iHashCode3 = (iHashCode2 + (network == null ? 0 : network.hashCode())) * 31;
        Error error = this.error;
        int iHashCode4 = (iHashCode3 + (error == null ? 0 : error.hashCode())) * 31;
        String str = this.buildId;
        return this.additionalProperties.hashCode() + akb.d((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31, this.ddtags);
    }

    public final void setDdtags(String str) {
        str.getClass();
        this.ddtags = str;
    }

    public final void setMessage(String str) {
        str.getClass();
        this.message = str;
    }

    public final void setStatus(Status status) {
        status.getClass();
        this.status = status;
    }

    public final ka8 toJson() {
        ab8 ab8Var = new ab8();
        ab8Var.i("status", this.status.toJson());
        ab8Var.l("service", this.service);
        ab8Var.l("message", this.message);
        ab8Var.l(LogAttributes.DATE, this.date);
        ab8Var.i("logger", this.logger.toJson());
        ab8Var.i("_dd", this.dd.toJson());
        Usr usr = this.usr;
        if (usr != null) {
            ab8Var.i("usr", usr.toJson());
        }
        Network network = this.network;
        if (network != null) {
            ab8Var.i("network", network.toJson());
        }
        Error error = this.error;
        if (error != null) {
            ab8Var.i("error", error.toJson());
        }
        String str = this.buildId;
        if (str != null) {
            ab8Var.l("build_id", str);
        }
        ab8Var.l("ddtags", this.ddtags);
        for (Map.Entry<String, Object> entry : this.additionalProperties.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!ut0.f0(key, RESERVED_PROPERTIES)) {
                ab8Var.i(key, JsonSerializer.INSTANCE.toJsonElement(value));
            }
        }
        return ab8Var;
    }

    public String toString() {
        Status status = this.status;
        String str = this.service;
        String str2 = this.message;
        String str3 = this.date;
        Logger logger = this.logger;
        Dd dd = this.dd;
        Usr usr = this.usr;
        Network network = this.network;
        Error error = this.error;
        String str4 = this.buildId;
        String str5 = this.ddtags;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder sb = new StringBuilder("LogEvent(status=");
        sb.append(status);
        sb.append(", service=");
        sb.append(str);
        sb.append(", message=");
        ia.r(sb, str2, ", date=", str3, ", logger=");
        sb.append(logger);
        sb.append(", dd=");
        sb.append(dd);
        sb.append(", usr=");
        sb.append(usr);
        sb.append(", network=");
        sb.append(network);
        sb.append(", error=");
        sb.append(error);
        sb.append(", buildId=");
        sb.append(str4);
        sb.append(", ddtags=");
        sb.append(str5);
        sb.append(", additionalProperties=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JJ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Client;", "", "Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "simCarrier", "", "signalStrength", "downlinkKbps", "uplinkKbps", "connectivity", "<init>", "(Lcom/datadog/android/log/model/LogEvent$SimCarrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/log/model/LogEvent$SimCarrier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Client;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "getSimCarrier", "Ljava/lang/String;", "getSignalStrength", "getDownlinkKbps", "getUplinkKbps", "getConnectivity", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Client {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String connectivity;
        private final String downlinkKbps;
        private final String signalStrength;
        private final SimCarrier simCarrier;
        private final String uplinkKbps;

        public /* synthetic */ Client(SimCarrier simCarrier, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : simCarrier, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, str4);
        }

        public static /* synthetic */ Client copy$default(Client client, SimCarrier simCarrier, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                simCarrier = client.simCarrier;
            }
            if ((i & 2) != 0) {
                str = client.signalStrength;
            }
            if ((i & 4) != 0) {
                str2 = client.downlinkKbps;
            }
            if ((i & 8) != 0) {
                str3 = client.uplinkKbps;
            }
            if ((i & 16) != 0) {
                str4 = client.connectivity;
            }
            String str5 = str4;
            String str6 = str2;
            return client.copy(simCarrier, str, str6, str3, str5);
        }

        public static final Client fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Client fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SimCarrier getSimCarrier() {
            return this.simCarrier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSignalStrength() {
            return this.signalStrength;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDownlinkKbps() {
            return this.downlinkKbps;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUplinkKbps() {
            return this.uplinkKbps;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getConnectivity() {
            return this.connectivity;
        }

        public final Client copy(SimCarrier simCarrier, String signalStrength, String downlinkKbps, String uplinkKbps, String connectivity) {
            connectivity.getClass();
            return new Client(simCarrier, signalStrength, downlinkKbps, uplinkKbps, connectivity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Client)) {
                return false;
            }
            Client client = (Client) other;
            return wl7.b(this.simCarrier, client.simCarrier) && wl7.b(this.signalStrength, client.signalStrength) && wl7.b(this.downlinkKbps, client.downlinkKbps) && wl7.b(this.uplinkKbps, client.uplinkKbps) && wl7.b(this.connectivity, client.connectivity);
        }

        public final String getConnectivity() {
            return this.connectivity;
        }

        public final String getDownlinkKbps() {
            return this.downlinkKbps;
        }

        public final String getSignalStrength() {
            return this.signalStrength;
        }

        public final SimCarrier getSimCarrier() {
            return this.simCarrier;
        }

        public final String getUplinkKbps() {
            return this.uplinkKbps;
        }

        public int hashCode() {
            SimCarrier simCarrier = this.simCarrier;
            int iHashCode = (simCarrier == null ? 0 : simCarrier.hashCode()) * 31;
            String str = this.signalStrength;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.downlinkKbps;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uplinkKbps;
            return this.connectivity.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            SimCarrier simCarrier = this.simCarrier;
            if (simCarrier != null) {
                ab8Var.i("sim_carrier", simCarrier.toJson());
            }
            String str = this.signalStrength;
            if (str != null) {
                ab8Var.l("signal_strength", str);
            }
            String str2 = this.downlinkKbps;
            if (str2 != null) {
                ab8Var.l("downlink_kbps", str2);
            }
            String str3 = this.uplinkKbps;
            if (str3 != null) {
                ab8Var.l("uplink_kbps", str3);
            }
            ab8Var.l("connectivity", this.connectivity);
            return ab8Var;
        }

        public String toString() {
            SimCarrier simCarrier = this.simCarrier;
            String str = this.signalStrength;
            String str2 = this.downlinkKbps;
            String str3 = this.uplinkKbps;
            String str4 = this.connectivity;
            StringBuilder sb = new StringBuilder("Client(simCarrier=");
            sb.append(simCarrier);
            sb.append(", signalStrength=");
            sb.append(str);
            sb.append(", downlinkKbps=");
            ia.r(sb, str2, ", uplinkKbps=", str3, ", connectivity=");
            return l6.i(sb, str4, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Client$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Client;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Client;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Client;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Client fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Client", e);
                    return null;
                }
            }

            public final Client fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("sim_carrier");
                    SimCarrier simCarrierFromJsonObject = ka8VarM != null ? SimCarrier.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                    ka8 ka8VarM2 = jsonObject.m("signal_strength");
                    String strG = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("downlink_kbps");
                    String strG2 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    ka8 ka8VarM4 = jsonObject.m("uplink_kbps");
                    String strG3 = ka8VarM4 != null ? ka8VarM4.g() : null;
                    String strG4 = jsonObject.m("connectivity").g();
                    strG4.getClass();
                    return new Client(simCarrierFromJsonObject, strG, strG2, strG3, strG4);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Client", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Client", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Client", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Client(SimCarrier simCarrier, String str, String str2, String str3, String str4) {
            str4.getClass();
            this.simCarrier = simCarrier;
            this.signalStrength = str;
            this.downlinkKbps = str2;
            this.uplinkKbps = str3;
            this.connectivity = str4;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Dd;", "", "Lcom/datadog/android/log/model/LogEvent$Device;", "device", "<init>", "(Lcom/datadog/android/log/model/LogEvent$Device;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/log/model/LogEvent$Device;", "copy", "(Lcom/datadog/android/log/model/LogEvent$Device;)Lcom/datadog/android/log/model/LogEvent$Dd;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/log/model/LogEvent$Device;", "getDevice", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Device device;

        public Dd(Device device) {
            device.getClass();
            this.device = device;
        }

        public static /* synthetic */ Dd copy$default(Dd dd, Device device, int i, Object obj) {
            if ((i & 1) != 0) {
                device = dd.device;
            }
            return dd.copy(device);
        }

        public static final Dd fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Dd fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Device getDevice() {
            return this.device;
        }

        public final Dd copy(Device device) {
            device.getClass();
            return new Dd(device);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dd) && wl7.b(this.device, ((Dd) other).device);
        }

        public final Device getDevice() {
            return this.device;
        }

        public int hashCode() {
            return this.device.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("device", this.device.toJson());
            return ab8Var;
        }

        public String toString() {
            return "Dd(device=" + this.device + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Dd;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Dd fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Dd", e);
                    return null;
                }
            }

            public final Dd fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Dd(Device.INSTANCE.fromJsonObject(jsonObject.m("device").d()));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Dd", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Dd", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Dd", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Device;", "", "", "architecture", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArchitecture", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Device {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String architecture;

        public Device(String str) {
            str.getClass();
            this.architecture = str;
        }

        public static /* synthetic */ Device copy$default(Device device, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = device.architecture;
            }
            return device.copy(str);
        }

        public static final Device fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Device fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getArchitecture() {
            return this.architecture;
        }

        public final Device copy(String architecture) {
            architecture.getClass();
            return new Device(architecture);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Device) && wl7.b(this.architecture, ((Device) other).architecture);
        }

        public final String getArchitecture() {
            return this.architecture;
        }

        public int hashCode() {
            return this.architecture.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("architecture", this.architecture);
            return ab8Var;
        }

        public String toString() {
            return l5.m("Device(architecture=", this.architecture, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Device;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Device fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Device", e);
                    return null;
                }
            }

            public final Device fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("architecture").g();
                    strG.getClass();
                    return new Device(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Device", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Device", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Device", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J^\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010%R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010%R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010%R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010%R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0017¨\u00061"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Error;", "", "", "kind", "message", "stack", "sourceType", "fingerprint", "", "Lcom/datadog/android/log/model/LogEvent$Thread;", "threads", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/datadog/android/log/model/LogEvent$Error;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKind", "setKind", "(Ljava/lang/String;)V", "getMessage", "setMessage", "getStack", "setStack", "getSourceType", "setSourceType", "getFingerprint", "setFingerprint", "Ljava/util/List;", "getThreads", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Error {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String fingerprint;
        private String kind;
        private String message;
        private String sourceType;
        private String stack;
        private final List<Thread> threads;

        public /* synthetic */ Error(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.kind;
            }
            if ((i & 2) != 0) {
                str2 = error.message;
            }
            if ((i & 4) != 0) {
                str3 = error.stack;
            }
            if ((i & 8) != 0) {
                str4 = error.sourceType;
            }
            if ((i & 16) != 0) {
                str5 = error.fingerprint;
            }
            if ((i & 32) != 0) {
                list = error.threads;
            }
            String str6 = str5;
            List list2 = list;
            return error.copy(str, str2, str3, str4, str6, list2);
        }

        public static final Error fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Error fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStack() {
            return this.stack;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        public final List<Thread> component6() {
            return this.threads;
        }

        public final Error copy(String kind, String message, String stack, String sourceType, String fingerprint, List<Thread> threads) {
            return new Error(kind, message, stack, sourceType, fingerprint, threads);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return wl7.b(this.kind, error.kind) && wl7.b(this.message, error.message) && wl7.b(this.stack, error.stack) && wl7.b(this.sourceType, error.sourceType) && wl7.b(this.fingerprint, error.fingerprint) && wl7.b(this.threads, error.threads);
        }

        public final String getFingerprint() {
            return this.fingerprint;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getSourceType() {
            return this.sourceType;
        }

        public final String getStack() {
            return this.stack;
        }

        public final List<Thread> getThreads() {
            return this.threads;
        }

        public int hashCode() {
            String str = this.kind;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.stack;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sourceType;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.fingerprint;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<Thread> list = this.threads;
            return iHashCode5 + (list != null ? list.hashCode() : 0);
        }

        public final void setFingerprint(String str) {
            this.fingerprint = str;
        }

        public final void setKind(String str) {
            this.kind = str;
        }

        public final void setMessage(String str) {
            this.message = str;
        }

        public final void setSourceType(String str) {
            this.sourceType = str;
        }

        public final void setStack(String str) {
            this.stack = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.kind;
            if (str != null) {
                ab8Var.l("kind", str);
            }
            String str2 = this.message;
            if (str2 != null) {
                ab8Var.l("message", str2);
            }
            String str3 = this.stack;
            if (str3 != null) {
                ab8Var.l("stack", str3);
            }
            String str4 = this.sourceType;
            if (str4 != null) {
                ab8Var.l("source_type", str4);
            }
            String str5 = this.fingerprint;
            if (str5 != null) {
                ab8Var.l("fingerprint", str5);
            }
            List<Thread> list = this.threads;
            if (list != null) {
                w98 w98Var = new w98(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    w98Var.i(((Thread) it.next()).toJson());
                }
                ab8Var.i("threads", w98Var);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.kind;
            String str2 = this.message;
            String str3 = this.stack;
            String str4 = this.sourceType;
            String str5 = this.fingerprint;
            List<Thread> list = this.threads;
            StringBuilder sbF = u40.f("Error(kind=", str, ", message=", str2, ", stack=");
            ia.r(sbF, str3, ", sourceType=", str4, ", fingerprint=");
            sbF.append(str5);
            sbF.append(", threads=");
            sbF.append(list);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Error;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Error;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Error fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Error", e);
                    return null;
                }
            }

            public final Error fromJsonObject(ab8 jsonObject) {
                ArrayList arrayList;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("kind");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("message");
                    String strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("stack");
                    String strG3 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    ka8 ka8VarM4 = jsonObject.m("source_type");
                    String strG4 = ka8VarM4 != null ? ka8VarM4.g() : null;
                    ka8 ka8VarM5 = jsonObject.m("fingerprint");
                    String strG5 = ka8VarM5 != null ? ka8VarM5.g() : null;
                    ka8 ka8VarM6 = jsonObject.m("threads");
                    if (ka8VarM6 != null) {
                        w98 w98VarC = ka8VarM6.c();
                        ArrayList arrayList2 = new ArrayList(w98VarC.a.size());
                        Iterator<ka8> it = w98VarC.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Thread.INSTANCE.fromJsonObject(it.next().d()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    return new Error(strG, strG2, strG3, strG4, strG5, arrayList);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Error", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Error", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Error", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, List<Thread> list) {
            this.kind = str;
            this.message = str2;
            this.stack = str3;
            this.sourceType = str4;
            this.fingerprint = str5;
            this.threads = list;
        }

        public Error() {
            this(null, null, null, null, null, null, 63, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001e\u0010\f¨\u0006 "}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Logger;", "", "", "name", "threadName", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Logger;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getThreadName", "getVersion", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String name;
        private final String threadName;
        private final String version;

        public Logger(String str, String str2, String str3) {
            str.getClass();
            str3.getClass();
            this.name = str;
            this.threadName = str2;
            this.version = str3;
        }

        public static /* synthetic */ Logger copy$default(Logger logger, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logger.name;
            }
            if ((i & 2) != 0) {
                str2 = logger.threadName;
            }
            if ((i & 4) != 0) {
                str3 = logger.version;
            }
            return logger.copy(str, str2, str3);
        }

        public static final Logger fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Logger fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getThreadName() {
            return this.threadName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Logger copy(String name, String threadName, String version) {
            name.getClass();
            version.getClass();
            return new Logger(name, threadName, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logger)) {
                return false;
            }
            Logger logger = (Logger) other;
            return wl7.b(this.name, logger.name) && wl7.b(this.threadName, logger.threadName) && wl7.b(this.version, logger.version);
        }

        public final String getName() {
            return this.name;
        }

        public final String getThreadName() {
            return this.threadName;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.threadName;
            return this.version.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final void setName(String str) {
            str.getClass();
            this.name = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("name", this.name);
            String str = this.threadName;
            if (str != null) {
                ab8Var.l("thread_name", str);
            }
            ab8Var.l("version", this.version);
            return ab8Var;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.threadName;
            return l6.i(u40.f("Logger(name=", str, ", threadName=", str2, ", version="), this.version, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Logger$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Logger;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Logger;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Logger;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Logger fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Logger", e);
                    return null;
                }
            }

            public final Logger fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("name").g();
                    ka8 ka8VarM = jsonObject.m("thread_name");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    String strG3 = jsonObject.m("version").g();
                    strG.getClass();
                    strG3.getClass();
                    return new Logger(strG, strG2, strG3);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Logger", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Logger", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Logger", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ Logger(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Network;", "", "Lcom/datadog/android/log/model/LogEvent$Client;", "client", "<init>", "(Lcom/datadog/android/log/model/LogEvent$Client;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/log/model/LogEvent$Client;", "copy", "(Lcom/datadog/android/log/model/LogEvent$Client;)Lcom/datadog/android/log/model/LogEvent$Network;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/log/model/LogEvent$Client;", "getClient", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Network {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Client client;

        public Network(Client client) {
            client.getClass();
            this.client = client;
        }

        public static /* synthetic */ Network copy$default(Network network, Client client, int i, Object obj) {
            if ((i & 1) != 0) {
                client = network.client;
            }
            return network.copy(client);
        }

        public static final Network fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Network fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Client getClient() {
            return this.client;
        }

        public final Network copy(Client client) {
            client.getClass();
            return new Network(client);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Network) && wl7.b(this.client, ((Network) other).client);
        }

        public final Client getClient() {
            return this.client;
        }

        public int hashCode() {
            return this.client.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("client", this.client.toJson());
            return ab8Var;
        }

        public String toString() {
            return "Network(client=" + this.client + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Network$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Network;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Network;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Network;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Network fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Network", e);
                    return null;
                }
            }

            public final Network fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Network(Client.INSTANCE.fromJsonObject(jsonObject.m("client").d()));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Network", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Network", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Network", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class SimCarrier {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final String name;

        public /* synthetic */ SimCarrier(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ SimCarrier copy$default(SimCarrier simCarrier, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = simCarrier.id;
            }
            if ((i & 2) != 0) {
                str2 = simCarrier.name;
            }
            return simCarrier.copy(str, str2);
        }

        public static final SimCarrier fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final SimCarrier fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final SimCarrier copy(String id, String name) {
            return new SimCarrier(id, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimCarrier)) {
                return false;
            }
            SimCarrier simCarrier = (SimCarrier) other;
            return wl7.b(this.id, simCarrier.id) && wl7.b(this.name, simCarrier.name);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            String str2 = this.name;
            if (str2 != null) {
                ab8Var.l("name", str2);
            }
            return ab8Var;
        }

        public String toString() {
            return akb.k("SimCarrier(id=", this.id, ", name=", this.name, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$SimCarrier$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$SimCarrier;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SimCarrier fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type SimCarrier", e);
                    return null;
                }
            }

            public final SimCarrier fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("name");
                    return new SimCarrier(strG, ka8VarM2 != null ? ka8VarM2.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type SimCarrier", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type SimCarrier", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type SimCarrier", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public SimCarrier(String str, String str2) {
            this.id = str;
            this.name = str2;
        }

        public SimCarrier() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Status;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CRITICAL", "ERROR", "WARN", "INFO", "DEBUG", "TRACE", "EMERGENCY", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Status {
        CRITICAL("critical"),
        ERROR("error"),
        WARN("warn"),
        INFO("info"),
        DEBUG(RumEventDeserializer.TELEMETRY_TYPE_DEBUG),
        TRACE("trace"),
        EMERGENCY("emergency");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Status(String str) {
            this.jsonValue = str;
        }

        public static final Status fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Status$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/log/model/LogEvent$Status;", "jsonString", "", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromJson(String jsonString) {
                jsonString.getClass();
                for (Status status : Status.values()) {
                    if (wl7.b(status.jsonValue, jsonString)) {
                        return status;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000e¨\u0006#"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Thread;", "", "", "name", "", "crashed", "stack", "state", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Thread;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Z", "getCrashed", "getStack", "getState", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Thread {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean crashed;
        private final String name;
        private final String stack;
        private final String state;

        public Thread(String str, boolean z, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.crashed = z;
            this.stack = str2;
            this.state = str3;
        }

        public static /* synthetic */ Thread copy$default(Thread thread, String str, boolean z, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = thread.name;
            }
            if ((i & 2) != 0) {
                z = thread.crashed;
            }
            if ((i & 4) != 0) {
                str2 = thread.stack;
            }
            if ((i & 8) != 0) {
                str3 = thread.state;
            }
            return thread.copy(str, z, str2, str3);
        }

        public static final Thread fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Thread fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getCrashed() {
            return this.crashed;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStack() {
            return this.stack;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final Thread copy(String name, boolean crashed, String stack, String state) {
            name.getClass();
            stack.getClass();
            return new Thread(name, crashed, stack, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Thread)) {
                return false;
            }
            Thread thread = (Thread) other;
            return wl7.b(this.name, thread.name) && this.crashed == thread.crashed && wl7.b(this.stack, thread.stack) && wl7.b(this.state, thread.state);
        }

        public final boolean getCrashed() {
            return this.crashed;
        }

        public final String getName() {
            return this.name;
        }

        public final String getStack() {
            return this.stack;
        }

        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            int iD = akb.d(ia.f(this.name.hashCode() * 31, 31, this.crashed), 31, this.stack);
            String str = this.state;
            return iD + (str == null ? 0 : str.hashCode());
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("name", this.name);
            ab8Var.k("crashed", Boolean.valueOf(this.crashed));
            ab8Var.l("stack", this.stack);
            String str = this.state;
            if (str != null) {
                ab8Var.l("state", str);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.name;
            boolean z = this.crashed;
            String str2 = this.stack;
            String str3 = this.state;
            StringBuilder sb = new StringBuilder("Thread(name=");
            sb.append(str);
            sb.append(", crashed=");
            sb.append(z);
            sb.append(", stack=");
            return z3.n(sb, str2, ", state=", str3, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Thread$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Thread;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Thread;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Thread;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Thread fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Thread", e);
                    return null;
                }
            }

            public final Thread fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("name").g();
                    boolean zA = jsonObject.m("crashed").a();
                    String strG2 = jsonObject.m("stack").g();
                    ka8 ka8VarM = jsonObject.m("state");
                    String strG3 = ka8VarM != null ? ka8VarM.g() : null;
                    strG.getClass();
                    strG2.getClass();
                    return new Thread(strG, zA, strG2, strG3);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Thread", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Thread", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Thread", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ Thread(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, (i & 8) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u000eR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006$"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Usr;", "", "", "id", "name", "email", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/log/model/LogEvent$Usr;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Usr {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"id", "name", "email"};
        private final Map<String, Object> additionalProperties;
        private final String email;
        private final String id;
        private final String name;

        public /* synthetic */ Usr(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Usr copy$default(Usr usr, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = usr.id;
            }
            if ((i & 2) != 0) {
                str2 = usr.name;
            }
            if ((i & 4) != 0) {
                str3 = usr.email;
            }
            if ((i & 8) != 0) {
                map = usr.additionalProperties;
            }
            return usr.copy(str, str2, str3, map);
        }

        public static final Usr fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Usr fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Map<String, Object> component4() {
            return this.additionalProperties;
        }

        public final Usr copy(String id, String name, String email, Map<String, Object> additionalProperties) {
            additionalProperties.getClass();
            return new Usr(id, name, email, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Usr)) {
                return false;
            }
            Usr usr = (Usr) other;
            return wl7.b(this.id, usr.id) && wl7.b(this.name, usr.name) && wl7.b(this.email, usr.email) && wl7.b(this.additionalProperties, usr.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            return this.additionalProperties.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            String str2 = this.name;
            if (str2 != null) {
                ab8Var.l("name", str2);
            }
            String str3 = this.email;
            if (str3 != null) {
                ab8Var.l("email", str3);
            }
            for (Map.Entry<String, Object> entry : this.additionalProperties.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!ut0.f0(key, RESERVED_PROPERTIES)) {
                    ab8Var.i(key, JsonSerializer.INSTANCE.toJsonElement(value));
                }
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.email;
            Map<String, Object> map = this.additionalProperties;
            StringBuilder sbF = u40.f("Usr(id=", str, ", name=", str2, ", email=");
            sbF.append(str3);
            sbF.append(", additionalProperties=");
            sbF.append(map);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent$Usr;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_logs_release", "()[Ljava/lang/String;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usr fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Usr", e);
                    return null;
                }
            }

            public final Usr fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("name");
                    String strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("email");
                    String strG3 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_logs_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new Usr(strG, strG2, strG3, linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Usr", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Usr", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Usr", e3);
                    return null;
                }
            }

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_logs_release() {
                return Usr.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        public Usr(String str, String str2, String str3, Map<String, Object> map) {
            map.getClass();
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.additionalProperties = map;
        }

        public Usr() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/log/model/LogEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/log/model/LogEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/log/model/LogEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/log/model/LogEvent;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_logs_release", "()[Ljava/lang/String;", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LogEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type LogEvent", e);
                return null;
            }
        }

        public final LogEvent fromJsonObject(ab8 jsonObject) {
            LogEvent logEvent;
            jsonObject.getClass();
            try {
                Status.Companion companion = Status.INSTANCE;
                String strG = jsonObject.m("status").g();
                strG.getClass();
                Status statusFromJson = companion.fromJson(strG);
                String strG2 = jsonObject.m("service").g();
                String strG3 = jsonObject.m("message").g();
                String strG4 = jsonObject.m(LogAttributes.DATE).g();
                Logger loggerFromJsonObject = Logger.INSTANCE.fromJsonObject(jsonObject.m("logger").d());
                Dd ddFromJsonObject = Dd.INSTANCE.fromJsonObject(jsonObject.m("_dd").d());
                ka8 ka8VarM = jsonObject.m("usr");
                Usr usrFromJsonObject = ka8VarM != null ? Usr.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                ka8 ka8VarM2 = jsonObject.m("network");
                Network networkFromJsonObject = ka8VarM2 != null ? Network.INSTANCE.fromJsonObject(ka8VarM2.d()) : null;
                ka8 ka8VarM3 = jsonObject.m("error");
                Error errorFromJsonObject = ka8VarM3 != null ? Error.INSTANCE.fromJsonObject(ka8VarM3.d()) : null;
                ka8 ka8VarM4 = jsonObject.m("build_id");
                String strG5 = ka8VarM4 != null ? ka8VarM4.g() : null;
                String strG6 = jsonObject.m("ddtags").g();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                    logEvent = null;
                    try {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_logs_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    } catch (IllegalStateException e) {
                        e = e;
                        g7.n("Unable to parse json into type LogEvent", e);
                        return logEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        g7.n("Unable to parse json into type LogEvent", e);
                        return logEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        g7.n("Unable to parse json into type LogEvent", e);
                        return logEvent;
                    }
                }
                logEvent = null;
                strG2.getClass();
                strG3.getClass();
                strG4.getClass();
                strG6.getClass();
                return new LogEvent(statusFromJson, strG2, strG3, strG4, loggerFromJsonObject, ddFromJsonObject, usrFromJsonObject, networkFromJsonObject, errorFromJsonObject, strG5, strG6, linkedHashMap);
            } catch (IllegalStateException e4) {
                e = e4;
                logEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                logEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                logEvent = null;
            }
        }

        public final String[] getRESERVED_PROPERTIES$dd_sdk_android_logs_release() {
            return LogEvent.RESERVED_PROPERTIES;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogEvent(Status status, String str, String str2, String str3, Logger logger, Dd dd, Usr usr, Network network, Error error, String str4, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, str, str2, str3, logger, dd, (i & 64) != 0 ? null : usr, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : network, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : error, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str4, str5, (i & 2048) != 0 ? new LinkedHashMap() : map);
    }
}
