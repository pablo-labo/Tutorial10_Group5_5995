package com.datadog.android.telemetry.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.gson.JsonParseException;
import defpackage.ab8;
import defpackage.akb;
import defpackage.ey8;
import defpackage.fb8;
import defpackage.g7;
import defpackage.hh2;
import defpackage.ia;
import defpackage.j6g;
import defpackage.ka8;
import defpackage.l5;
import defpackage.l6;
import defpackage.s6;
import defpackage.u40;
import defpackage.ut0;
import defpackage.w98;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b.\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u0012YZX[\\]^_`abcdefghiB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u009a\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b7\u0010#J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010%R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bG\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u00100R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u00102R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bU\u00104R\u001a\u0010V\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010#¨\u0006j"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;", "dd", "", LogAttributes.DATE, "", "service", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "source", "version", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "application", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "session", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "view", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", RumEventDeserializer.EVENT_TYPE_ACTION, "", "effectiveSampleRate", "", "experimentalFeatures", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "telemetry", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "component5", "component6", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "component7", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "component8", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "component9", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", "component10", "()Ljava/lang/Number;", "component11", "()Ljava/util/List;", "component12", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;", "getDd", "J", "getDate", "Ljava/lang/String;", "getService", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "getSource", "getVersion", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "getApplication", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "getSession", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "getView", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", "getAction", "Ljava/lang/Number;", "getEffectiveSampleRate", "Ljava/util/List;", "getExperimentalFeatures", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "getTelemetry", "type", "getType", "Companion", "Action", "Application", "Configuration", "Dd", "Device", "Os", "Plugin", "SelectedTracingPropagator", "Session", "SessionPersistence", "Source", "Telemetry", "TraceContextInjection", "TrackFeatureFlagsForEvent", "TrackingConsent", "View", "ViewTrackingStrategy", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TelemetryConfigurationEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Action action;
    private final Application application;
    private final long date;
    private final Dd dd;
    private final Number effectiveSampleRate;
    private final List<String> experimentalFeatures;
    private final String service;
    private final Session session;
    private final Source source;
    private final Telemetry telemetry;
    private final String type;
    private final String version;
    private final View view;

    public /* synthetic */ TelemetryConfigurationEvent(Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List list, Telemetry telemetry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dd, j, str, source, str2, (i & 32) != 0 ? null : application, (i & 64) != 0 ? null : session, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : view, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : action, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : number, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : list, telemetry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TelemetryConfigurationEvent copy$default(TelemetryConfigurationEvent telemetryConfigurationEvent, Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List list, Telemetry telemetry, int i, Object obj) {
        if ((i & 1) != 0) {
            dd = telemetryConfigurationEvent.dd;
        }
        return telemetryConfigurationEvent.copy(dd, (i & 2) != 0 ? telemetryConfigurationEvent.date : j, (i & 4) != 0 ? telemetryConfigurationEvent.service : str, (i & 8) != 0 ? telemetryConfigurationEvent.source : source, (i & 16) != 0 ? telemetryConfigurationEvent.version : str2, (i & 32) != 0 ? telemetryConfigurationEvent.application : application, (i & 64) != 0 ? telemetryConfigurationEvent.session : session, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? telemetryConfigurationEvent.view : view, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? telemetryConfigurationEvent.action : action, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? telemetryConfigurationEvent.effectiveSampleRate : number, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? telemetryConfigurationEvent.experimentalFeatures : list, (i & 2048) != 0 ? telemetryConfigurationEvent.telemetry : telemetry);
    }

    public static final TelemetryConfigurationEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final TelemetryConfigurationEvent fromJsonObject(ab8 ab8Var) {
        return INSTANCE.fromJsonObject(ab8Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Dd getDd() {
        return this.dd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Number getEffectiveSampleRate() {
        return this.effectiveSampleRate;
    }

    public final List<String> component11() {
        return this.experimentalFeatures;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Telemetry getTelemetry() {
        return this.telemetry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Application getApplication() {
        return this.application;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    public final TelemetryConfigurationEvent copy(Dd dd, long date, String service, Source source, String version, Application application, Session session, View view, Action action, Number effectiveSampleRate, List<String> experimentalFeatures, Telemetry telemetry) {
        dd.getClass();
        service.getClass();
        source.getClass();
        version.getClass();
        telemetry.getClass();
        return new TelemetryConfigurationEvent(dd, date, service, source, version, application, session, view, action, effectiveSampleRate, experimentalFeatures, telemetry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryConfigurationEvent)) {
            return false;
        }
        TelemetryConfigurationEvent telemetryConfigurationEvent = (TelemetryConfigurationEvent) other;
        return wl7.b(this.dd, telemetryConfigurationEvent.dd) && this.date == telemetryConfigurationEvent.date && wl7.b(this.service, telemetryConfigurationEvent.service) && this.source == telemetryConfigurationEvent.source && wl7.b(this.version, telemetryConfigurationEvent.version) && wl7.b(this.application, telemetryConfigurationEvent.application) && wl7.b(this.session, telemetryConfigurationEvent.session) && wl7.b(this.view, telemetryConfigurationEvent.view) && wl7.b(this.action, telemetryConfigurationEvent.action) && wl7.b(this.effectiveSampleRate, telemetryConfigurationEvent.effectiveSampleRate) && wl7.b(this.experimentalFeatures, telemetryConfigurationEvent.experimentalFeatures) && wl7.b(this.telemetry, telemetryConfigurationEvent.telemetry);
    }

    public final Action getAction() {
        return this.action;
    }

    public final Application getApplication() {
        return this.application;
    }

    public final long getDate() {
        return this.date;
    }

    public final Dd getDd() {
        return this.dd;
    }

    public final Number getEffectiveSampleRate() {
        return this.effectiveSampleRate;
    }

    public final List<String> getExperimentalFeatures() {
        return this.experimentalFeatures;
    }

    public final String getService() {
        return this.service;
    }

    public final Session getSession() {
        return this.session;
    }

    public final Source getSource() {
        return this.source;
    }

    public final Telemetry getTelemetry() {
        return this.telemetry;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public final View getView() {
        return this.view;
    }

    public int hashCode() {
        int iD = akb.d((this.source.hashCode() + akb.d(ia.d(this.dd.hashCode() * 31, 31, this.date), 31, this.service)) * 31, 31, this.version);
        Application application = this.application;
        int iHashCode = (iD + (application == null ? 0 : application.hashCode())) * 31;
        Session session = this.session;
        int iHashCode2 = (iHashCode + (session == null ? 0 : session.hashCode())) * 31;
        View view = this.view;
        int iHashCode3 = (iHashCode2 + (view == null ? 0 : view.hashCode())) * 31;
        Action action = this.action;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        Number number = this.effectiveSampleRate;
        int iHashCode5 = (iHashCode4 + (number == null ? 0 : number.hashCode())) * 31;
        List<String> list = this.experimentalFeatures;
        return this.telemetry.hashCode() + ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final ka8 toJson() {
        ab8 ab8Var = new ab8();
        ab8Var.i("_dd", this.dd.toJson());
        ab8Var.l("type", this.type);
        ab8Var.j(Long.valueOf(this.date), LogAttributes.DATE);
        ab8Var.l("service", this.service);
        ab8Var.i("source", this.source.toJson());
        ab8Var.l("version", this.version);
        Application application = this.application;
        if (application != null) {
            ab8Var.i("application", application.toJson());
        }
        Session session = this.session;
        if (session != null) {
            ab8Var.i("session", session.toJson());
        }
        View view = this.view;
        if (view != null) {
            ab8Var.i("view", view.toJson());
        }
        Action action = this.action;
        if (action != null) {
            ab8Var.i(RumEventDeserializer.EVENT_TYPE_ACTION, action.toJson());
        }
        Number number = this.effectiveSampleRate;
        if (number != null) {
            ab8Var.j(number, "effective_sample_rate");
        }
        List<String> list = this.experimentalFeatures;
        if (list != null) {
            w98 w98Var = new w98(list.size());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                w98Var.j((String) it.next());
            }
            ab8Var.i("experimental_features", w98Var);
        }
        ab8Var.i("telemetry", this.telemetry.toJson());
        return ab8Var;
    }

    public String toString() {
        return "TelemetryConfigurationEvent(dd=" + this.dd + ", date=" + this.date + ", service=" + this.service + ", source=" + this.source + ", version=" + this.version + ", application=" + this.application + ", session=" + this.session + ", view=" + this.view + ", action=" + this.action + ", effectiveSampleRate=" + this.effectiveSampleRate + ", experimentalFeatures=" + this.experimentalFeatures + ", telemetry=" + this.telemetry + ")";
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Action {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public Action(String str) {
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = action.id;
            }
            return action.copy(str);
        }

        public static final Action fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Action fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Action copy(String id) {
            id.getClass();
            return new Action(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && wl7.b(this.id, ((Action) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            return ab8Var;
        }

        public String toString() {
            return l5.m("Action(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Action;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Action fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Action", e);
                    return null;
                }
            }

            public final Action fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    strG.getClass();
                    return new Action(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Action", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Action", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Action", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Application {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public Application(String str) {
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            return application.copy(str);
        }

        public static final Application fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Application fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Application copy(String id) {
            id.getClass();
            return new Application(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Application) && wl7.b(this.id, ((Application) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            return ab8Var;
        }

        public String toString() {
            return l5.m("Application(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Application fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Application", e);
                    return null;
                }
            }

            public final Application fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    strG.getClass();
                    return new Application(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Application", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Application", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Application", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\b\n\u0003\b\u0081\u0001\b\u0086\b\u0018\u0000 ³\u00022\u00020\u0001:\u0002³\u0002B©\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010$\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010$\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bX\u0010YJ\r\u0010[\u001a\u00020Z¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b_\u0010^J\u0012\u0010`\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b`\u0010^J\u0012\u0010a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\ba\u0010^J\u0012\u0010b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bb\u0010^J\u0012\u0010c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\be\u0010^J\u0012\u0010f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bf\u0010^J\u0012\u0010g\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bg\u0010^J\u0012\u0010h\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bl\u0010kJ\u0012\u0010m\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bm\u0010kJ\u0012\u0010n\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bn\u0010kJ\u0012\u0010o\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bo\u0010kJ\u0012\u0010p\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bp\u0010kJ\u0012\u0010q\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bq\u0010kJ\u0012\u0010r\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\br\u0010kJ\u0012\u0010s\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bs\u0010kJ\u0012\u0010t\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bt\u0010kJ\u0012\u0010u\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bu\u0010kJ\u0012\u0010v\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bv\u0010kJ\u0012\u0010w\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\by\u0010kJ\u0012\u0010z\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bz\u0010kJ\u0012\u0010{\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b}\u0010kJ\u0012\u0010~\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b~\u0010kJ\u0019\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010|J\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010|J\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010|J\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010|J\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010kJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010kJ\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010kJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010kJ\u0014\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010kJ\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010kJ\u0014\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010kJ\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010kJ\u0014\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010kJ\u001b\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$HÆ\u0003¢\u0006\u0006\b\u008e\u0001\u0010\u0080\u0001J\u001b\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$HÆ\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0080\u0001J\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010kJ\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0014\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0093\u0001\u0010kJ\u0014\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0094\u0001\u0010^J\u0014\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0095\u0001\u0010kJ\u0014\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0096\u0001\u0010kJ\u0014\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0097\u0001\u0010kJ\u0014\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0098\u0001\u0010kJ\u0014\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0099\u0001\u0010kJ\u0014\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u009a\u0001\u0010kJ\u0014\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u009b\u0001\u0010kJ\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u009c\u0001\u0010kJ\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010|J\u0014\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u009e\u0001\u0010kJ\u0014\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009f\u0001\u0010^J\u0014\u0010 \u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b \u0001\u0010^J\u0014\u0010¡\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b¡\u0001\u0010^J\u0014\u0010¢\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b¢\u0001\u0010kJ\u0014\u0010£\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b£\u0001\u0010|J\u0014\u0010¤\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b¤\u0001\u0010|J\u0014\u0010¥\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b¥\u0001\u0010|J\u0014\u0010¦\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b¦\u0001\u0010|J\u0014\u0010§\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b§\u0001\u0010^J\u0014\u0010¨\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b¨\u0001\u0010kJ\u0014\u0010©\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\b©\u0001\u0010|J\u0014\u0010ª\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0005\bª\u0001\u0010|J\u0014\u0010«\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b«\u0001\u0010kJ\u001b\u0010¬\u0001\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010$HÆ\u0003¢\u0006\u0006\b¬\u0001\u0010\u0080\u0001J\u0014\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u00ad\u0001\u0010kJ\u001b\u0010®\u0001\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010$HÆ\u0003¢\u0006\u0006\b®\u0001\u0010\u0080\u0001J\u0014\u0010¯\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b¯\u0001\u0010kJµ\u0007\u0010°\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010$2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010$2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0012\u0010²\u0001\u001a\u00020 HÖ\u0001¢\u0006\u0005\b²\u0001\u0010|J\u0014\u0010´\u0001\u001a\u00030³\u0001HÖ\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001e\u0010·\u0001\u001a\u00020\u000f2\t\u0010¶\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b·\u0001\u0010¸\u0001R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010¹\u0001\u001a\u0005\bº\u0001\u0010^R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0004\u0010¹\u0001\u001a\u0005\b»\u0001\u0010^R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010¹\u0001\u001a\u0005\b¼\u0001\u0010^R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0006\u0010¹\u0001\u001a\u0005\b½\u0001\u0010^R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010¹\u0001\u001a\u0005\b¾\u0001\u0010^R(\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\t\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010d\"\u0006\bÁ\u0001\u0010Â\u0001R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\n\u0010¹\u0001\u001a\u0005\bÃ\u0001\u0010^R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010¹\u0001\u001a\u0005\bÄ\u0001\u0010^R(\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\f\u0010¹\u0001\u001a\u0005\bÅ\u0001\u0010^\"\u0006\bÆ\u0001\u0010Ç\u0001R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010È\u0001\u001a\u0005\bÉ\u0001\u0010iR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0010\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010k\"\u0006\bÌ\u0001\u0010Í\u0001R(\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0011\u0010Ê\u0001\u001a\u0005\bÎ\u0001\u0010k\"\u0006\bÏ\u0001\u0010Í\u0001R(\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0012\u0010Ê\u0001\u001a\u0005\bÐ\u0001\u0010k\"\u0006\bÑ\u0001\u0010Í\u0001R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010Ê\u0001\u001a\u0005\bÒ\u0001\u0010kR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010Ê\u0001\u001a\u0005\bÓ\u0001\u0010kR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010Ê\u0001\u001a\u0005\bÔ\u0001\u0010kR(\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0016\u0010Ê\u0001\u001a\u0005\bÕ\u0001\u0010k\"\u0006\bÖ\u0001\u0010Í\u0001R(\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0017\u0010Ê\u0001\u001a\u0005\b×\u0001\u0010k\"\u0006\bØ\u0001\u0010Í\u0001R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010Ê\u0001\u001a\u0005\bÙ\u0001\u0010kR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010Ê\u0001\u001a\u0005\bÚ\u0001\u0010kR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010Ê\u0001\u001a\u0005\bÛ\u0001\u0010kR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010Ê\u0001\u001a\u0005\bÜ\u0001\u0010kR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010Ý\u0001\u001a\u0005\bÞ\u0001\u0010xR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010Ê\u0001\u001a\u0005\bß\u0001\u0010kR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010Ê\u0001\u001a\u0005\bà\u0001\u0010kR\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b!\u0010á\u0001\u001a\u0005\bâ\u0001\u0010|R\u001b\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\"\u0010Ê\u0001\u001a\u0005\bã\u0001\u0010kR\u001b\u0010#\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b#\u0010Ê\u0001\u001a\u0005\bä\u0001\u0010kR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\b&\u0010å\u0001\u001a\u0006\bæ\u0001\u0010\u0080\u0001R(\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b'\u0010á\u0001\u001a\u0005\bç\u0001\u0010|\"\u0006\bè\u0001\u0010é\u0001R(\u0010(\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b(\u0010á\u0001\u001a\u0005\bê\u0001\u0010|\"\u0006\bë\u0001\u0010é\u0001R(\u0010)\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b)\u0010á\u0001\u001a\u0005\bì\u0001\u0010|\"\u0006\bí\u0001\u0010é\u0001R(\u0010*\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b*\u0010á\u0001\u001a\u0005\bî\u0001\u0010|\"\u0006\bï\u0001\u0010é\u0001R(\u0010+\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b+\u0010Ê\u0001\u001a\u0005\bð\u0001\u0010k\"\u0006\bñ\u0001\u0010Í\u0001R\u001b\u0010,\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b,\u0010Ê\u0001\u001a\u0005\bò\u0001\u0010kR\u001b\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b-\u0010Ê\u0001\u001a\u0005\bó\u0001\u0010kR\u001b\u0010.\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b.\u0010Ê\u0001\u001a\u0005\bô\u0001\u0010kR(\u0010/\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b/\u0010Ê\u0001\u001a\u0005\bõ\u0001\u0010k\"\u0006\bö\u0001\u0010Í\u0001R(\u00100\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b0\u0010Ê\u0001\u001a\u0005\b÷\u0001\u0010k\"\u0006\bø\u0001\u0010Í\u0001R(\u00101\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b1\u0010Ê\u0001\u001a\u0005\bù\u0001\u0010k\"\u0006\bú\u0001\u0010Í\u0001R(\u00102\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b2\u0010Ê\u0001\u001a\u0005\bû\u0001\u0010k\"\u0006\bü\u0001\u0010Í\u0001R\u001b\u00103\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b3\u0010Ê\u0001\u001a\u0005\bý\u0001\u0010kR\"\u00104\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\b4\u0010å\u0001\u001a\u0006\bþ\u0001\u0010\u0080\u0001R\"\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\b5\u0010å\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0001R\u001b\u00106\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b6\u0010Ê\u0001\u001a\u0005\b\u0080\u0002\u0010kR\u001c\u00108\u001a\u0004\u0018\u0001078\u0006¢\u0006\u000f\n\u0005\b8\u0010\u0081\u0002\u001a\u0006\b\u0082\u0002\u0010\u0092\u0001R(\u00109\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b9\u0010Ê\u0001\u001a\u0005\b\u0083\u0002\u0010k\"\u0006\b\u0084\u0002\u0010Í\u0001R(\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b:\u0010¹\u0001\u001a\u0005\b\u0085\u0002\u0010^\"\u0006\b\u0086\u0002\u0010Ç\u0001R(\u0010;\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b;\u0010Ê\u0001\u001a\u0005\b\u0087\u0002\u0010k\"\u0006\b\u0088\u0002\u0010Í\u0001R(\u0010<\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b<\u0010Ê\u0001\u001a\u0005\b\u0089\u0002\u0010k\"\u0006\b\u008a\u0002\u0010Í\u0001R\u001b\u0010=\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b=\u0010Ê\u0001\u001a\u0005\b\u008b\u0002\u0010kR(\u0010>\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b>\u0010Ê\u0001\u001a\u0005\b\u008c\u0002\u0010k\"\u0006\b\u008d\u0002\u0010Í\u0001R(\u0010?\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b?\u0010Ê\u0001\u001a\u0005\b\u008e\u0002\u0010k\"\u0006\b\u008f\u0002\u0010Í\u0001R(\u0010@\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b@\u0010Ê\u0001\u001a\u0005\b\u0090\u0002\u0010k\"\u0006\b\u0091\u0002\u0010Í\u0001R(\u0010A\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bA\u0010Ê\u0001\u001a\u0005\b\u0092\u0002\u0010k\"\u0006\b\u0093\u0002\u0010Í\u0001R(\u0010B\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bB\u0010Ê\u0001\u001a\u0005\b\u0094\u0002\u0010k\"\u0006\b\u0095\u0002\u0010Í\u0001R(\u0010C\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bC\u0010á\u0001\u001a\u0005\b\u0096\u0002\u0010|\"\u0006\b\u0097\u0002\u0010é\u0001R(\u0010D\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bD\u0010Ê\u0001\u001a\u0005\b\u0098\u0002\u0010k\"\u0006\b\u0099\u0002\u0010Í\u0001R\u001b\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bE\u0010¹\u0001\u001a\u0005\b\u009a\u0002\u0010^R\u001b\u0010F\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bF\u0010¹\u0001\u001a\u0005\b\u009b\u0002\u0010^R\u001b\u0010G\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bG\u0010¹\u0001\u001a\u0005\b\u009c\u0002\u0010^R\u001b\u0010H\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\bH\u0010Ê\u0001\u001a\u0005\b\u009d\u0002\u0010kR(\u0010I\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bI\u0010á\u0001\u001a\u0005\b\u009e\u0002\u0010|\"\u0006\b\u009f\u0002\u0010é\u0001R(\u0010J\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bJ\u0010á\u0001\u001a\u0005\b \u0002\u0010|\"\u0006\b¡\u0002\u0010é\u0001R(\u0010K\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bK\u0010á\u0001\u001a\u0005\b¢\u0002\u0010|\"\u0006\b£\u0002\u0010é\u0001R(\u0010L\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bL\u0010á\u0001\u001a\u0005\b¤\u0002\u0010|\"\u0006\b¥\u0002\u0010é\u0001R\u001b\u0010M\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bM\u0010¹\u0001\u001a\u0005\b¦\u0002\u0010^R(\u0010N\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bN\u0010Ê\u0001\u001a\u0005\b§\u0002\u0010k\"\u0006\b¨\u0002\u0010Í\u0001R(\u0010O\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bO\u0010á\u0001\u001a\u0005\b©\u0002\u0010|\"\u0006\bª\u0002\u0010é\u0001R(\u0010P\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bP\u0010á\u0001\u001a\u0005\b«\u0002\u0010|\"\u0006\b¬\u0002\u0010é\u0001R(\u0010Q\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bQ\u0010Ê\u0001\u001a\u0005\b\u00ad\u0002\u0010k\"\u0006\b®\u0002\u0010Í\u0001R\"\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\bS\u0010å\u0001\u001a\u0006\b¯\u0002\u0010\u0080\u0001R\u001a\u0010T\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\r\n\u0005\bT\u0010Ê\u0001\u001a\u0004\bT\u0010kR\"\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\bV\u0010å\u0001\u001a\u0006\b°\u0002\u0010\u0080\u0001R(\u0010W\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bW\u0010Ê\u0001\u001a\u0005\b±\u0002\u0010k\"\u0006\b²\u0002\u0010Í\u0001¨\u0006´\u0002"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "", "", "sessionSampleRate", "telemetrySampleRate", "telemetryConfigurationSampleRate", "telemetryUsageSampleRate", "traceSampleRate", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "traceContextInjection", "premiumSampleRate", "replaySampleRate", "sessionReplaySampleRate", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "trackingConsent", "", "startSessionReplayRecordingManually", "startRecordingImmediately", "useProxy", "useBeforeSend", "silentMultipleInit", "trackSessionAcrossSubdomains", "trackResources", "trackLongTask", "useCrossSiteSessionCookie", "usePartitionedCrossSiteSessionCookie", "useSecureSessionCookie", "allowFallbackToLocalStorage", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence;", "sessionPersistence", "storeContextsAcrossPages", "allowUntrustedEvents", "", "actionNameAttribute", "useAllowedTracingOrigins", "useAllowedTracingUrls", "", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SelectedTracingPropagator;", "selectedTracingPropagators", "defaultPrivacyLevel", "textAndInputPrivacyLevel", "imagePrivacyLevel", "touchPrivacyLevel", "enablePrivacyForActionName", "useExcludedActivityUrls", "useWorkerUrl", "compressIntakeRequests", "trackFrustrations", "trackViewsManually", "trackInteractions", "trackUserInteractions", "forwardErrorsToLogs", "forwardConsoleLogs", "forwardReports", "useLocalEncryption", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "viewTrackingStrategy", "trackBackgroundEvents", "mobileVitalsUpdatePeriod", "trackErrors", "trackNetworkRequests", "useTracing", "trackNativeViews", "trackNativeErrors", "trackNativeLongTasks", "trackCrossPlatformLongTasks", "useFirstPartyHosts", "initializationType", "trackFlutterPerformance", "batchSize", "batchUploadFrequency", "batchProcessingLevel", "backgroundTasksEnabled", "reactVersion", "reactNativeVersion", "dartVersion", "unityVersion", "appHangThreshold", "usePciIntake", "tracerApi", "tracerApiVersion", "sendLogsAfterSessionExpiration", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Plugin;", "plugins", "isMainProcess", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackFeatureFlagsForEvent;", "trackFeatureFlagsForEvents", "trackAnonymousUser", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "component5", "component6", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "component7", "component8", "component9", "component10", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence;", "component24", "component25", "component26", "()Ljava/lang/String;", "component27", "component28", "component29", "()Ljava/util/List;", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSessionSampleRate", "getTelemetrySampleRate", "getTelemetryConfigurationSampleRate", "getTelemetryUsageSampleRate", "getTraceSampleRate", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "getTraceContextInjection", "setTraceContextInjection", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;)V", "getPremiumSampleRate", "getReplaySampleRate", "getSessionReplaySampleRate", "setSessionReplaySampleRate", "(Ljava/lang/Long;)V", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "getTrackingConsent", "Ljava/lang/Boolean;", "getStartSessionReplayRecordingManually", "setStartSessionReplayRecordingManually", "(Ljava/lang/Boolean;)V", "getStartRecordingImmediately", "setStartRecordingImmediately", "getUseProxy", "setUseProxy", "getUseBeforeSend", "getSilentMultipleInit", "getTrackSessionAcrossSubdomains", "getTrackResources", "setTrackResources", "getTrackLongTask", "setTrackLongTask", "getUseCrossSiteSessionCookie", "getUsePartitionedCrossSiteSessionCookie", "getUseSecureSessionCookie", "getAllowFallbackToLocalStorage", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence;", "getSessionPersistence", "getStoreContextsAcrossPages", "getAllowUntrustedEvents", "Ljava/lang/String;", "getActionNameAttribute", "getUseAllowedTracingOrigins", "getUseAllowedTracingUrls", "Ljava/util/List;", "getSelectedTracingPropagators", "getDefaultPrivacyLevel", "setDefaultPrivacyLevel", "(Ljava/lang/String;)V", "getTextAndInputPrivacyLevel", "setTextAndInputPrivacyLevel", "getImagePrivacyLevel", "setImagePrivacyLevel", "getTouchPrivacyLevel", "setTouchPrivacyLevel", "getEnablePrivacyForActionName", "setEnablePrivacyForActionName", "getUseExcludedActivityUrls", "getUseWorkerUrl", "getCompressIntakeRequests", "getTrackFrustrations", "setTrackFrustrations", "getTrackViewsManually", "setTrackViewsManually", "getTrackInteractions", "setTrackInteractions", "getTrackUserInteractions", "setTrackUserInteractions", "getForwardErrorsToLogs", "getForwardConsoleLogs", "getForwardReports", "getUseLocalEncryption", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "getViewTrackingStrategy", "getTrackBackgroundEvents", "setTrackBackgroundEvents", "getMobileVitalsUpdatePeriod", "setMobileVitalsUpdatePeriod", "getTrackErrors", "setTrackErrors", "getTrackNetworkRequests", "setTrackNetworkRequests", "getUseTracing", "getTrackNativeViews", "setTrackNativeViews", "getTrackNativeErrors", "setTrackNativeErrors", "getTrackNativeLongTasks", "setTrackNativeLongTasks", "getTrackCrossPlatformLongTasks", "setTrackCrossPlatformLongTasks", "getUseFirstPartyHosts", "setUseFirstPartyHosts", "getInitializationType", "setInitializationType", "getTrackFlutterPerformance", "setTrackFlutterPerformance", "getBatchSize", "getBatchUploadFrequency", "getBatchProcessingLevel", "getBackgroundTasksEnabled", "getReactVersion", "setReactVersion", "getReactNativeVersion", "setReactNativeVersion", "getDartVersion", "setDartVersion", "getUnityVersion", "setUnityVersion", "getAppHangThreshold", "getUsePciIntake", "setUsePciIntake", "getTracerApi", "setTracerApi", "getTracerApiVersion", "setTracerApiVersion", "getSendLogsAfterSessionExpiration", "setSendLogsAfterSessionExpiration", "getPlugins", "getTrackFeatureFlagsForEvents", "getTrackAnonymousUser", "setTrackAnonymousUser", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Configuration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String actionNameAttribute;
        private final Boolean allowFallbackToLocalStorage;
        private final Boolean allowUntrustedEvents;
        private final Long appHangThreshold;
        private final Boolean backgroundTasksEnabled;
        private final Long batchProcessingLevel;
        private final Long batchSize;
        private final Long batchUploadFrequency;
        private final Boolean compressIntakeRequests;
        private String dartVersion;
        private String defaultPrivacyLevel;
        private Boolean enablePrivacyForActionName;
        private final List<String> forwardConsoleLogs;
        private final Boolean forwardErrorsToLogs;
        private final List<String> forwardReports;
        private String imagePrivacyLevel;
        private String initializationType;
        private final Boolean isMainProcess;
        private Long mobileVitalsUpdatePeriod;
        private final List<Plugin> plugins;
        private final Long premiumSampleRate;
        private String reactNativeVersion;
        private String reactVersion;
        private final Long replaySampleRate;
        private final List<SelectedTracingPropagator> selectedTracingPropagators;
        private Boolean sendLogsAfterSessionExpiration;
        private final SessionPersistence sessionPersistence;
        private Long sessionReplaySampleRate;
        private final Long sessionSampleRate;
        private final Boolean silentMultipleInit;
        private Boolean startRecordingImmediately;
        private Boolean startSessionReplayRecordingManually;
        private final Boolean storeContextsAcrossPages;
        private final Long telemetryConfigurationSampleRate;
        private final Long telemetrySampleRate;
        private final Long telemetryUsageSampleRate;
        private String textAndInputPrivacyLevel;
        private String touchPrivacyLevel;
        private TraceContextInjection traceContextInjection;
        private final Long traceSampleRate;
        private String tracerApi;
        private String tracerApiVersion;
        private Boolean trackAnonymousUser;
        private Boolean trackBackgroundEvents;
        private Boolean trackCrossPlatformLongTasks;
        private Boolean trackErrors;
        private final List<TrackFeatureFlagsForEvent> trackFeatureFlagsForEvents;
        private Boolean trackFlutterPerformance;
        private Boolean trackFrustrations;
        private Boolean trackInteractions;
        private Boolean trackLongTask;
        private Boolean trackNativeErrors;
        private Boolean trackNativeLongTasks;
        private Boolean trackNativeViews;
        private Boolean trackNetworkRequests;
        private Boolean trackResources;
        private final Boolean trackSessionAcrossSubdomains;
        private Boolean trackUserInteractions;
        private Boolean trackViewsManually;
        private final TrackingConsent trackingConsent;
        private String unityVersion;
        private final Boolean useAllowedTracingOrigins;
        private final Boolean useAllowedTracingUrls;
        private final Boolean useBeforeSend;
        private final Boolean useCrossSiteSessionCookie;
        private final Boolean useExcludedActivityUrls;
        private Boolean useFirstPartyHosts;
        private final Boolean useLocalEncryption;
        private final Boolean usePartitionedCrossSiteSessionCookie;
        private Boolean usePciIntake;
        private Boolean useProxy;
        private final Boolean useSecureSessionCookie;
        private final Boolean useTracing;
        private final Boolean useWorkerUrl;
        private final ViewTrackingStrategy viewTrackingStrategy;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Configuration(Long l, Long l2, Long l3, Long l4, Long l5, TraceContextInjection traceContextInjection, Long l6, Long l7, Long l8, TrackingConsent trackingConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, SessionPersistence sessionPersistence, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, List list, String str2, String str3, String str4, String str5, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, List list2, List list3, Boolean bool26, ViewTrackingStrategy viewTrackingStrategy, Boolean bool27, Long l9, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str6, Boolean bool36, Long l10, Long l11, Long l12, Boolean bool37, String str7, String str8, String str9, String str10, Long l13, Boolean bool38, String str11, String str12, Boolean bool39, List list4, Boolean bool40, List list5, Boolean bool41, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            Long l14 = (i & 1) != 0 ? null : l;
            Long l15 = (i & 2) != 0 ? null : l2;
            Long l16 = (i & 4) != 0 ? null : l3;
            Long l17 = (i & 8) != 0 ? null : l4;
            Long l18 = (i & 16) != 0 ? null : l5;
            TraceContextInjection traceContextInjection2 = (i & 32) != 0 ? null : traceContextInjection;
            Long l19 = (i & 64) != 0 ? null : l6;
            Long l20 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : l7;
            Long l21 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : l8;
            TrackingConsent trackingConsent2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : trackingConsent;
            Boolean bool42 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : bool;
            Boolean bool43 = (i & 2048) != 0 ? null : bool2;
            Boolean bool44 = (i & 4096) != 0 ? null : bool3;
            Long l22 = l14;
            Boolean bool45 = (i & 8192) != 0 ? null : bool4;
            Boolean bool46 = (i & 16384) != 0 ? null : bool5;
            Boolean bool47 = (i & 32768) != 0 ? null : bool6;
            Boolean bool48 = (i & 65536) != 0 ? null : bool7;
            Boolean bool49 = (i & 131072) != 0 ? null : bool8;
            Boolean bool50 = (i & 262144) != 0 ? null : bool9;
            Boolean bool51 = (i & 524288) != 0 ? null : bool10;
            Boolean bool52 = (i & 1048576) != 0 ? null : bool11;
            Boolean bool53 = (i & 2097152) != 0 ? null : bool12;
            SessionPersistence sessionPersistence2 = (i & 4194304) != 0 ? null : sessionPersistence;
            Boolean bool54 = (i & 8388608) != 0 ? null : bool13;
            Boolean bool55 = (i & 16777216) != 0 ? null : bool14;
            String str13 = (i & 33554432) != 0 ? null : str;
            Boolean bool56 = (i & 67108864) != 0 ? null : bool15;
            Boolean bool57 = (i & 134217728) != 0 ? null : bool16;
            List list6 = (i & 268435456) != 0 ? null : list;
            String str14 = (i & 536870912) != 0 ? null : str2;
            String str15 = (i & 1073741824) != 0 ? null : str3;
            String str16 = (i & Integer.MIN_VALUE) != 0 ? null : str4;
            this(l22, l15, l16, l17, l18, traceContextInjection2, l19, l20, l21, trackingConsent2, bool42, bool43, bool44, bool45, bool46, bool47, bool48, bool49, bool50, bool51, bool52, bool53, sessionPersistence2, bool54, bool55, str13, bool56, bool57, list6, str14, str15, str16, (i2 & 1) != 0 ? null : str5, (i2 & 2) != 0 ? null : bool17, (i2 & 4) != 0 ? null : bool18, (i2 & 8) != 0 ? null : bool19, (i2 & 16) != 0 ? null : bool20, (i2 & 32) != 0 ? null : bool21, (i2 & 64) != 0 ? null : bool22, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : bool23, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : bool24, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : bool25, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : list2, (i2 & 2048) != 0 ? null : list3, (i2 & 4096) != 0 ? null : bool26, (i2 & 8192) != 0 ? null : viewTrackingStrategy, (i2 & 16384) != 0 ? null : bool27, (i2 & 32768) != 0 ? null : l9, (i2 & 65536) != 0 ? null : bool28, (i2 & 131072) != 0 ? null : bool29, (i2 & 262144) != 0 ? null : bool30, (i2 & 524288) != 0 ? null : bool31, (i2 & 1048576) != 0 ? null : bool32, (i2 & 2097152) != 0 ? null : bool33, (i2 & 4194304) != 0 ? null : bool34, (i2 & 8388608) != 0 ? null : bool35, (i2 & 16777216) != 0 ? null : str6, (i2 & 33554432) != 0 ? null : bool36, (i2 & 67108864) != 0 ? null : l10, (i2 & 134217728) != 0 ? null : l11, (i2 & 268435456) != 0 ? null : l12, (i2 & 536870912) != 0 ? null : bool37, (i2 & 1073741824) != 0 ? null : str7, (i2 & Integer.MIN_VALUE) != 0 ? null : str8, (i3 & 1) != 0 ? null : str9, (i3 & 2) != 0 ? null : str10, (i3 & 4) != 0 ? null : l13, (i3 & 8) != 0 ? null : bool38, (i3 & 16) != 0 ? null : str11, (i3 & 32) != 0 ? null : str12, (i3 & 64) != 0 ? null : bool39, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : list4, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : bool40, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : list5, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Boolean.TRUE : bool41);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Configuration copy$default(Configuration configuration, Long l, Long l2, Long l3, Long l4, Long l5, TraceContextInjection traceContextInjection, Long l6, Long l7, Long l8, TrackingConsent trackingConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, SessionPersistence sessionPersistence, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, List list, String str2, String str3, String str4, String str5, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, List list2, List list3, Boolean bool26, ViewTrackingStrategy viewTrackingStrategy, Boolean bool27, Long l9, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str6, Boolean bool36, Long l10, Long l11, Long l12, Boolean bool37, String str7, String str8, String str9, String str10, Long l13, Boolean bool38, String str11, String str12, Boolean bool39, List list4, Boolean bool40, List list5, Boolean bool41, int i, int i2, int i3, Object obj) {
            Long l14 = (i & 1) != 0 ? configuration.sessionSampleRate : l;
            return configuration.copy(l14, (i & 2) != 0 ? configuration.telemetrySampleRate : l2, (i & 4) != 0 ? configuration.telemetryConfigurationSampleRate : l3, (i & 8) != 0 ? configuration.telemetryUsageSampleRate : l4, (i & 16) != 0 ? configuration.traceSampleRate : l5, (i & 32) != 0 ? configuration.traceContextInjection : traceContextInjection, (i & 64) != 0 ? configuration.premiumSampleRate : l6, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? configuration.replaySampleRate : l7, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? configuration.sessionReplaySampleRate : l8, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? configuration.trackingConsent : trackingConsent, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? configuration.startSessionReplayRecordingManually : bool, (i & 2048) != 0 ? configuration.startRecordingImmediately : bool2, (i & 4096) != 0 ? configuration.useProxy : bool3, (i & 8192) != 0 ? configuration.useBeforeSend : bool4, (i & 16384) != 0 ? configuration.silentMultipleInit : bool5, (i & 32768) != 0 ? configuration.trackSessionAcrossSubdomains : bool6, (i & 65536) != 0 ? configuration.trackResources : bool7, (i & 131072) != 0 ? configuration.trackLongTask : bool8, (i & 262144) != 0 ? configuration.useCrossSiteSessionCookie : bool9, (i & 524288) != 0 ? configuration.usePartitionedCrossSiteSessionCookie : bool10, (i & 1048576) != 0 ? configuration.useSecureSessionCookie : bool11, (i & 2097152) != 0 ? configuration.allowFallbackToLocalStorage : bool12, (i & 4194304) != 0 ? configuration.sessionPersistence : sessionPersistence, (i & 8388608) != 0 ? configuration.storeContextsAcrossPages : bool13, (i & 16777216) != 0 ? configuration.allowUntrustedEvents : bool14, (i & 33554432) != 0 ? configuration.actionNameAttribute : str, (i & 67108864) != 0 ? configuration.useAllowedTracingOrigins : bool15, (i & 134217728) != 0 ? configuration.useAllowedTracingUrls : bool16, (i & 268435456) != 0 ? configuration.selectedTracingPropagators : list, (i & 536870912) != 0 ? configuration.defaultPrivacyLevel : str2, (i & 1073741824) != 0 ? configuration.textAndInputPrivacyLevel : str3, (i & Integer.MIN_VALUE) != 0 ? configuration.imagePrivacyLevel : str4, (i2 & 1) != 0 ? configuration.touchPrivacyLevel : str5, (i2 & 2) != 0 ? configuration.enablePrivacyForActionName : bool17, (i2 & 4) != 0 ? configuration.useExcludedActivityUrls : bool18, (i2 & 8) != 0 ? configuration.useWorkerUrl : bool19, (i2 & 16) != 0 ? configuration.compressIntakeRequests : bool20, (i2 & 32) != 0 ? configuration.trackFrustrations : bool21, (i2 & 64) != 0 ? configuration.trackViewsManually : bool22, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? configuration.trackInteractions : bool23, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? configuration.trackUserInteractions : bool24, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? configuration.forwardErrorsToLogs : bool25, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? configuration.forwardConsoleLogs : list2, (i2 & 2048) != 0 ? configuration.forwardReports : list3, (i2 & 4096) != 0 ? configuration.useLocalEncryption : bool26, (i2 & 8192) != 0 ? configuration.viewTrackingStrategy : viewTrackingStrategy, (i2 & 16384) != 0 ? configuration.trackBackgroundEvents : bool27, (i2 & 32768) != 0 ? configuration.mobileVitalsUpdatePeriod : l9, (i2 & 65536) != 0 ? configuration.trackErrors : bool28, (i2 & 131072) != 0 ? configuration.trackNetworkRequests : bool29, (i2 & 262144) != 0 ? configuration.useTracing : bool30, (i2 & 524288) != 0 ? configuration.trackNativeViews : bool31, (i2 & 1048576) != 0 ? configuration.trackNativeErrors : bool32, (i2 & 2097152) != 0 ? configuration.trackNativeLongTasks : bool33, (i2 & 4194304) != 0 ? configuration.trackCrossPlatformLongTasks : bool34, (i2 & 8388608) != 0 ? configuration.useFirstPartyHosts : bool35, (i2 & 16777216) != 0 ? configuration.initializationType : str6, (i2 & 33554432) != 0 ? configuration.trackFlutterPerformance : bool36, (i2 & 67108864) != 0 ? configuration.batchSize : l10, (i2 & 134217728) != 0 ? configuration.batchUploadFrequency : l11, (i2 & 268435456) != 0 ? configuration.batchProcessingLevel : l12, (i2 & 536870912) != 0 ? configuration.backgroundTasksEnabled : bool37, (i2 & 1073741824) != 0 ? configuration.reactVersion : str7, (i2 & Integer.MIN_VALUE) != 0 ? configuration.reactNativeVersion : str8, (i3 & 1) != 0 ? configuration.dartVersion : str9, (i3 & 2) != 0 ? configuration.unityVersion : str10, (i3 & 4) != 0 ? configuration.appHangThreshold : l13, (i3 & 8) != 0 ? configuration.usePciIntake : bool38, (i3 & 16) != 0 ? configuration.tracerApi : str11, (i3 & 32) != 0 ? configuration.tracerApiVersion : str12, (i3 & 64) != 0 ? configuration.sendLogsAfterSessionExpiration : bool39, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? configuration.plugins : list4, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? configuration.isMainProcess : bool40, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? configuration.trackFeatureFlagsForEvents : list5, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? configuration.trackAnonymousUser : bool41);
        }

        public static final Configuration fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Configuration fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getSessionSampleRate() {
            return this.sessionSampleRate;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final TrackingConsent getTrackingConsent() {
            return this.trackingConsent;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Boolean getStartSessionReplayRecordingManually() {
            return this.startSessionReplayRecordingManually;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Boolean getStartRecordingImmediately() {
            return this.startRecordingImmediately;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Boolean getUseProxy() {
            return this.useProxy;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Boolean getUseBeforeSend() {
            return this.useBeforeSend;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final Boolean getSilentMultipleInit() {
            return this.silentMultipleInit;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Boolean getTrackSessionAcrossSubdomains() {
            return this.trackSessionAcrossSubdomains;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final Boolean getTrackResources() {
            return this.trackResources;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final Boolean getTrackLongTask() {
            return this.trackLongTask;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Boolean getUseCrossSiteSessionCookie() {
            return this.useCrossSiteSessionCookie;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getTelemetrySampleRate() {
            return this.telemetrySampleRate;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Boolean getUsePartitionedCrossSiteSessionCookie() {
            return this.usePartitionedCrossSiteSessionCookie;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Boolean getUseSecureSessionCookie() {
            return this.useSecureSessionCookie;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Boolean getAllowFallbackToLocalStorage() {
            return this.allowFallbackToLocalStorage;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final SessionPersistence getSessionPersistence() {
            return this.sessionPersistence;
        }

        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Boolean getStoreContextsAcrossPages() {
            return this.storeContextsAcrossPages;
        }

        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Boolean getAllowUntrustedEvents() {
            return this.allowUntrustedEvents;
        }

        /* JADX INFO: renamed from: component26, reason: from getter */
        public final String getActionNameAttribute() {
            return this.actionNameAttribute;
        }

        /* JADX INFO: renamed from: component27, reason: from getter */
        public final Boolean getUseAllowedTracingOrigins() {
            return this.useAllowedTracingOrigins;
        }

        /* JADX INFO: renamed from: component28, reason: from getter */
        public final Boolean getUseAllowedTracingUrls() {
            return this.useAllowedTracingUrls;
        }

        public final List<SelectedTracingPropagator> component29() {
            return this.selectedTracingPropagators;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getTelemetryConfigurationSampleRate() {
            return this.telemetryConfigurationSampleRate;
        }

        /* JADX INFO: renamed from: component30, reason: from getter */
        public final String getDefaultPrivacyLevel() {
            return this.defaultPrivacyLevel;
        }

        /* JADX INFO: renamed from: component31, reason: from getter */
        public final String getTextAndInputPrivacyLevel() {
            return this.textAndInputPrivacyLevel;
        }

        /* JADX INFO: renamed from: component32, reason: from getter */
        public final String getImagePrivacyLevel() {
            return this.imagePrivacyLevel;
        }

        /* JADX INFO: renamed from: component33, reason: from getter */
        public final String getTouchPrivacyLevel() {
            return this.touchPrivacyLevel;
        }

        /* JADX INFO: renamed from: component34, reason: from getter */
        public final Boolean getEnablePrivacyForActionName() {
            return this.enablePrivacyForActionName;
        }

        /* JADX INFO: renamed from: component35, reason: from getter */
        public final Boolean getUseExcludedActivityUrls() {
            return this.useExcludedActivityUrls;
        }

        /* JADX INFO: renamed from: component36, reason: from getter */
        public final Boolean getUseWorkerUrl() {
            return this.useWorkerUrl;
        }

        /* JADX INFO: renamed from: component37, reason: from getter */
        public final Boolean getCompressIntakeRequests() {
            return this.compressIntakeRequests;
        }

        /* JADX INFO: renamed from: component38, reason: from getter */
        public final Boolean getTrackFrustrations() {
            return this.trackFrustrations;
        }

        /* JADX INFO: renamed from: component39, reason: from getter */
        public final Boolean getTrackViewsManually() {
            return this.trackViewsManually;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getTelemetryUsageSampleRate() {
            return this.telemetryUsageSampleRate;
        }

        /* JADX INFO: renamed from: component40, reason: from getter */
        public final Boolean getTrackInteractions() {
            return this.trackInteractions;
        }

        /* JADX INFO: renamed from: component41, reason: from getter */
        public final Boolean getTrackUserInteractions() {
            return this.trackUserInteractions;
        }

        /* JADX INFO: renamed from: component42, reason: from getter */
        public final Boolean getForwardErrorsToLogs() {
            return this.forwardErrorsToLogs;
        }

        public final List<String> component43() {
            return this.forwardConsoleLogs;
        }

        public final List<String> component44() {
            return this.forwardReports;
        }

        /* JADX INFO: renamed from: component45, reason: from getter */
        public final Boolean getUseLocalEncryption() {
            return this.useLocalEncryption;
        }

        /* JADX INFO: renamed from: component46, reason: from getter */
        public final ViewTrackingStrategy getViewTrackingStrategy() {
            return this.viewTrackingStrategy;
        }

        /* JADX INFO: renamed from: component47, reason: from getter */
        public final Boolean getTrackBackgroundEvents() {
            return this.trackBackgroundEvents;
        }

        /* JADX INFO: renamed from: component48, reason: from getter */
        public final Long getMobileVitalsUpdatePeriod() {
            return this.mobileVitalsUpdatePeriod;
        }

        /* JADX INFO: renamed from: component49, reason: from getter */
        public final Boolean getTrackErrors() {
            return this.trackErrors;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getTraceSampleRate() {
            return this.traceSampleRate;
        }

        /* JADX INFO: renamed from: component50, reason: from getter */
        public final Boolean getTrackNetworkRequests() {
            return this.trackNetworkRequests;
        }

        /* JADX INFO: renamed from: component51, reason: from getter */
        public final Boolean getUseTracing() {
            return this.useTracing;
        }

        /* JADX INFO: renamed from: component52, reason: from getter */
        public final Boolean getTrackNativeViews() {
            return this.trackNativeViews;
        }

        /* JADX INFO: renamed from: component53, reason: from getter */
        public final Boolean getTrackNativeErrors() {
            return this.trackNativeErrors;
        }

        /* JADX INFO: renamed from: component54, reason: from getter */
        public final Boolean getTrackNativeLongTasks() {
            return this.trackNativeLongTasks;
        }

        /* JADX INFO: renamed from: component55, reason: from getter */
        public final Boolean getTrackCrossPlatformLongTasks() {
            return this.trackCrossPlatformLongTasks;
        }

        /* JADX INFO: renamed from: component56, reason: from getter */
        public final Boolean getUseFirstPartyHosts() {
            return this.useFirstPartyHosts;
        }

        /* JADX INFO: renamed from: component57, reason: from getter */
        public final String getInitializationType() {
            return this.initializationType;
        }

        /* JADX INFO: renamed from: component58, reason: from getter */
        public final Boolean getTrackFlutterPerformance() {
            return this.trackFlutterPerformance;
        }

        /* JADX INFO: renamed from: component59, reason: from getter */
        public final Long getBatchSize() {
            return this.batchSize;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final TraceContextInjection getTraceContextInjection() {
            return this.traceContextInjection;
        }

        /* JADX INFO: renamed from: component60, reason: from getter */
        public final Long getBatchUploadFrequency() {
            return this.batchUploadFrequency;
        }

        /* JADX INFO: renamed from: component61, reason: from getter */
        public final Long getBatchProcessingLevel() {
            return this.batchProcessingLevel;
        }

        /* JADX INFO: renamed from: component62, reason: from getter */
        public final Boolean getBackgroundTasksEnabled() {
            return this.backgroundTasksEnabled;
        }

        /* JADX INFO: renamed from: component63, reason: from getter */
        public final String getReactVersion() {
            return this.reactVersion;
        }

        /* JADX INFO: renamed from: component64, reason: from getter */
        public final String getReactNativeVersion() {
            return this.reactNativeVersion;
        }

        /* JADX INFO: renamed from: component65, reason: from getter */
        public final String getDartVersion() {
            return this.dartVersion;
        }

        /* JADX INFO: renamed from: component66, reason: from getter */
        public final String getUnityVersion() {
            return this.unityVersion;
        }

        /* JADX INFO: renamed from: component67, reason: from getter */
        public final Long getAppHangThreshold() {
            return this.appHangThreshold;
        }

        /* JADX INFO: renamed from: component68, reason: from getter */
        public final Boolean getUsePciIntake() {
            return this.usePciIntake;
        }

        /* JADX INFO: renamed from: component69, reason: from getter */
        public final String getTracerApi() {
            return this.tracerApi;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getPremiumSampleRate() {
            return this.premiumSampleRate;
        }

        /* JADX INFO: renamed from: component70, reason: from getter */
        public final String getTracerApiVersion() {
            return this.tracerApiVersion;
        }

        /* JADX INFO: renamed from: component71, reason: from getter */
        public final Boolean getSendLogsAfterSessionExpiration() {
            return this.sendLogsAfterSessionExpiration;
        }

        public final List<Plugin> component72() {
            return this.plugins;
        }

        /* JADX INFO: renamed from: component73, reason: from getter */
        public final Boolean getIsMainProcess() {
            return this.isMainProcess;
        }

        public final List<TrackFeatureFlagsForEvent> component74() {
            return this.trackFeatureFlagsForEvents;
        }

        /* JADX INFO: renamed from: component75, reason: from getter */
        public final Boolean getTrackAnonymousUser() {
            return this.trackAnonymousUser;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Long getReplaySampleRate() {
            return this.replaySampleRate;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Long getSessionReplaySampleRate() {
            return this.sessionReplaySampleRate;
        }

        public final Configuration copy(Long sessionSampleRate, Long telemetrySampleRate, Long telemetryConfigurationSampleRate, Long telemetryUsageSampleRate, Long traceSampleRate, TraceContextInjection traceContextInjection, Long premiumSampleRate, Long replaySampleRate, Long sessionReplaySampleRate, TrackingConsent trackingConsent, Boolean startSessionReplayRecordingManually, Boolean startRecordingImmediately, Boolean useProxy, Boolean useBeforeSend, Boolean silentMultipleInit, Boolean trackSessionAcrossSubdomains, Boolean trackResources, Boolean trackLongTask, Boolean useCrossSiteSessionCookie, Boolean usePartitionedCrossSiteSessionCookie, Boolean useSecureSessionCookie, Boolean allowFallbackToLocalStorage, SessionPersistence sessionPersistence, Boolean storeContextsAcrossPages, Boolean allowUntrustedEvents, String actionNameAttribute, Boolean useAllowedTracingOrigins, Boolean useAllowedTracingUrls, List<? extends SelectedTracingPropagator> selectedTracingPropagators, String defaultPrivacyLevel, String textAndInputPrivacyLevel, String imagePrivacyLevel, String touchPrivacyLevel, Boolean enablePrivacyForActionName, Boolean useExcludedActivityUrls, Boolean useWorkerUrl, Boolean compressIntakeRequests, Boolean trackFrustrations, Boolean trackViewsManually, Boolean trackInteractions, Boolean trackUserInteractions, Boolean forwardErrorsToLogs, List<String> forwardConsoleLogs, List<String> forwardReports, Boolean useLocalEncryption, ViewTrackingStrategy viewTrackingStrategy, Boolean trackBackgroundEvents, Long mobileVitalsUpdatePeriod, Boolean trackErrors, Boolean trackNetworkRequests, Boolean useTracing, Boolean trackNativeViews, Boolean trackNativeErrors, Boolean trackNativeLongTasks, Boolean trackCrossPlatformLongTasks, Boolean useFirstPartyHosts, String initializationType, Boolean trackFlutterPerformance, Long batchSize, Long batchUploadFrequency, Long batchProcessingLevel, Boolean backgroundTasksEnabled, String reactVersion, String reactNativeVersion, String dartVersion, String unityVersion, Long appHangThreshold, Boolean usePciIntake, String tracerApi, String tracerApiVersion, Boolean sendLogsAfterSessionExpiration, List<Plugin> plugins, Boolean isMainProcess, List<? extends TrackFeatureFlagsForEvent> trackFeatureFlagsForEvents, Boolean trackAnonymousUser) {
            return new Configuration(sessionSampleRate, telemetrySampleRate, telemetryConfigurationSampleRate, telemetryUsageSampleRate, traceSampleRate, traceContextInjection, premiumSampleRate, replaySampleRate, sessionReplaySampleRate, trackingConsent, startSessionReplayRecordingManually, startRecordingImmediately, useProxy, useBeforeSend, silentMultipleInit, trackSessionAcrossSubdomains, trackResources, trackLongTask, useCrossSiteSessionCookie, usePartitionedCrossSiteSessionCookie, useSecureSessionCookie, allowFallbackToLocalStorage, sessionPersistence, storeContextsAcrossPages, allowUntrustedEvents, actionNameAttribute, useAllowedTracingOrigins, useAllowedTracingUrls, selectedTracingPropagators, defaultPrivacyLevel, textAndInputPrivacyLevel, imagePrivacyLevel, touchPrivacyLevel, enablePrivacyForActionName, useExcludedActivityUrls, useWorkerUrl, compressIntakeRequests, trackFrustrations, trackViewsManually, trackInteractions, trackUserInteractions, forwardErrorsToLogs, forwardConsoleLogs, forwardReports, useLocalEncryption, viewTrackingStrategy, trackBackgroundEvents, mobileVitalsUpdatePeriod, trackErrors, trackNetworkRequests, useTracing, trackNativeViews, trackNativeErrors, trackNativeLongTasks, trackCrossPlatformLongTasks, useFirstPartyHosts, initializationType, trackFlutterPerformance, batchSize, batchUploadFrequency, batchProcessingLevel, backgroundTasksEnabled, reactVersion, reactNativeVersion, dartVersion, unityVersion, appHangThreshold, usePciIntake, tracerApi, tracerApiVersion, sendLogsAfterSessionExpiration, plugins, isMainProcess, trackFeatureFlagsForEvents, trackAnonymousUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return wl7.b(this.sessionSampleRate, configuration.sessionSampleRate) && wl7.b(this.telemetrySampleRate, configuration.telemetrySampleRate) && wl7.b(this.telemetryConfigurationSampleRate, configuration.telemetryConfigurationSampleRate) && wl7.b(this.telemetryUsageSampleRate, configuration.telemetryUsageSampleRate) && wl7.b(this.traceSampleRate, configuration.traceSampleRate) && this.traceContextInjection == configuration.traceContextInjection && wl7.b(this.premiumSampleRate, configuration.premiumSampleRate) && wl7.b(this.replaySampleRate, configuration.replaySampleRate) && wl7.b(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) && this.trackingConsent == configuration.trackingConsent && wl7.b(this.startSessionReplayRecordingManually, configuration.startSessionReplayRecordingManually) && wl7.b(this.startRecordingImmediately, configuration.startRecordingImmediately) && wl7.b(this.useProxy, configuration.useProxy) && wl7.b(this.useBeforeSend, configuration.useBeforeSend) && wl7.b(this.silentMultipleInit, configuration.silentMultipleInit) && wl7.b(this.trackSessionAcrossSubdomains, configuration.trackSessionAcrossSubdomains) && wl7.b(this.trackResources, configuration.trackResources) && wl7.b(this.trackLongTask, configuration.trackLongTask) && wl7.b(this.useCrossSiteSessionCookie, configuration.useCrossSiteSessionCookie) && wl7.b(this.usePartitionedCrossSiteSessionCookie, configuration.usePartitionedCrossSiteSessionCookie) && wl7.b(this.useSecureSessionCookie, configuration.useSecureSessionCookie) && wl7.b(this.allowFallbackToLocalStorage, configuration.allowFallbackToLocalStorage) && this.sessionPersistence == configuration.sessionPersistence && wl7.b(this.storeContextsAcrossPages, configuration.storeContextsAcrossPages) && wl7.b(this.allowUntrustedEvents, configuration.allowUntrustedEvents) && wl7.b(this.actionNameAttribute, configuration.actionNameAttribute) && wl7.b(this.useAllowedTracingOrigins, configuration.useAllowedTracingOrigins) && wl7.b(this.useAllowedTracingUrls, configuration.useAllowedTracingUrls) && wl7.b(this.selectedTracingPropagators, configuration.selectedTracingPropagators) && wl7.b(this.defaultPrivacyLevel, configuration.defaultPrivacyLevel) && wl7.b(this.textAndInputPrivacyLevel, configuration.textAndInputPrivacyLevel) && wl7.b(this.imagePrivacyLevel, configuration.imagePrivacyLevel) && wl7.b(this.touchPrivacyLevel, configuration.touchPrivacyLevel) && wl7.b(this.enablePrivacyForActionName, configuration.enablePrivacyForActionName) && wl7.b(this.useExcludedActivityUrls, configuration.useExcludedActivityUrls) && wl7.b(this.useWorkerUrl, configuration.useWorkerUrl) && wl7.b(this.compressIntakeRequests, configuration.compressIntakeRequests) && wl7.b(this.trackFrustrations, configuration.trackFrustrations) && wl7.b(this.trackViewsManually, configuration.trackViewsManually) && wl7.b(this.trackInteractions, configuration.trackInteractions) && wl7.b(this.trackUserInteractions, configuration.trackUserInteractions) && wl7.b(this.forwardErrorsToLogs, configuration.forwardErrorsToLogs) && wl7.b(this.forwardConsoleLogs, configuration.forwardConsoleLogs) && wl7.b(this.forwardReports, configuration.forwardReports) && wl7.b(this.useLocalEncryption, configuration.useLocalEncryption) && this.viewTrackingStrategy == configuration.viewTrackingStrategy && wl7.b(this.trackBackgroundEvents, configuration.trackBackgroundEvents) && wl7.b(this.mobileVitalsUpdatePeriod, configuration.mobileVitalsUpdatePeriod) && wl7.b(this.trackErrors, configuration.trackErrors) && wl7.b(this.trackNetworkRequests, configuration.trackNetworkRequests) && wl7.b(this.useTracing, configuration.useTracing) && wl7.b(this.trackNativeViews, configuration.trackNativeViews) && wl7.b(this.trackNativeErrors, configuration.trackNativeErrors) && wl7.b(this.trackNativeLongTasks, configuration.trackNativeLongTasks) && wl7.b(this.trackCrossPlatformLongTasks, configuration.trackCrossPlatformLongTasks) && wl7.b(this.useFirstPartyHosts, configuration.useFirstPartyHosts) && wl7.b(this.initializationType, configuration.initializationType) && wl7.b(this.trackFlutterPerformance, configuration.trackFlutterPerformance) && wl7.b(this.batchSize, configuration.batchSize) && wl7.b(this.batchUploadFrequency, configuration.batchUploadFrequency) && wl7.b(this.batchProcessingLevel, configuration.batchProcessingLevel) && wl7.b(this.backgroundTasksEnabled, configuration.backgroundTasksEnabled) && wl7.b(this.reactVersion, configuration.reactVersion) && wl7.b(this.reactNativeVersion, configuration.reactNativeVersion) && wl7.b(this.dartVersion, configuration.dartVersion) && wl7.b(this.unityVersion, configuration.unityVersion) && wl7.b(this.appHangThreshold, configuration.appHangThreshold) && wl7.b(this.usePciIntake, configuration.usePciIntake) && wl7.b(this.tracerApi, configuration.tracerApi) && wl7.b(this.tracerApiVersion, configuration.tracerApiVersion) && wl7.b(this.sendLogsAfterSessionExpiration, configuration.sendLogsAfterSessionExpiration) && wl7.b(this.plugins, configuration.plugins) && wl7.b(this.isMainProcess, configuration.isMainProcess) && wl7.b(this.trackFeatureFlagsForEvents, configuration.trackFeatureFlagsForEvents) && wl7.b(this.trackAnonymousUser, configuration.trackAnonymousUser);
        }

        public final String getActionNameAttribute() {
            return this.actionNameAttribute;
        }

        public final Boolean getAllowFallbackToLocalStorage() {
            return this.allowFallbackToLocalStorage;
        }

        public final Boolean getAllowUntrustedEvents() {
            return this.allowUntrustedEvents;
        }

        public final Long getAppHangThreshold() {
            return this.appHangThreshold;
        }

        public final Boolean getBackgroundTasksEnabled() {
            return this.backgroundTasksEnabled;
        }

        public final Long getBatchProcessingLevel() {
            return this.batchProcessingLevel;
        }

        public final Long getBatchSize() {
            return this.batchSize;
        }

        public final Long getBatchUploadFrequency() {
            return this.batchUploadFrequency;
        }

        public final Boolean getCompressIntakeRequests() {
            return this.compressIntakeRequests;
        }

        public final String getDartVersion() {
            return this.dartVersion;
        }

        public final String getDefaultPrivacyLevel() {
            return this.defaultPrivacyLevel;
        }

        public final Boolean getEnablePrivacyForActionName() {
            return this.enablePrivacyForActionName;
        }

        public final List<String> getForwardConsoleLogs() {
            return this.forwardConsoleLogs;
        }

        public final Boolean getForwardErrorsToLogs() {
            return this.forwardErrorsToLogs;
        }

        public final List<String> getForwardReports() {
            return this.forwardReports;
        }

        public final String getImagePrivacyLevel() {
            return this.imagePrivacyLevel;
        }

        public final String getInitializationType() {
            return this.initializationType;
        }

        public final Long getMobileVitalsUpdatePeriod() {
            return this.mobileVitalsUpdatePeriod;
        }

        public final List<Plugin> getPlugins() {
            return this.plugins;
        }

        public final Long getPremiumSampleRate() {
            return this.premiumSampleRate;
        }

        public final String getReactNativeVersion() {
            return this.reactNativeVersion;
        }

        public final String getReactVersion() {
            return this.reactVersion;
        }

        public final Long getReplaySampleRate() {
            return this.replaySampleRate;
        }

        public final List<SelectedTracingPropagator> getSelectedTracingPropagators() {
            return this.selectedTracingPropagators;
        }

        public final Boolean getSendLogsAfterSessionExpiration() {
            return this.sendLogsAfterSessionExpiration;
        }

        public final SessionPersistence getSessionPersistence() {
            return this.sessionPersistence;
        }

        public final Long getSessionReplaySampleRate() {
            return this.sessionReplaySampleRate;
        }

        public final Long getSessionSampleRate() {
            return this.sessionSampleRate;
        }

        public final Boolean getSilentMultipleInit() {
            return this.silentMultipleInit;
        }

        public final Boolean getStartRecordingImmediately() {
            return this.startRecordingImmediately;
        }

        public final Boolean getStartSessionReplayRecordingManually() {
            return this.startSessionReplayRecordingManually;
        }

        public final Boolean getStoreContextsAcrossPages() {
            return this.storeContextsAcrossPages;
        }

        public final Long getTelemetryConfigurationSampleRate() {
            return this.telemetryConfigurationSampleRate;
        }

        public final Long getTelemetrySampleRate() {
            return this.telemetrySampleRate;
        }

        public final Long getTelemetryUsageSampleRate() {
            return this.telemetryUsageSampleRate;
        }

        public final String getTextAndInputPrivacyLevel() {
            return this.textAndInputPrivacyLevel;
        }

        public final String getTouchPrivacyLevel() {
            return this.touchPrivacyLevel;
        }

        public final TraceContextInjection getTraceContextInjection() {
            return this.traceContextInjection;
        }

        public final Long getTraceSampleRate() {
            return this.traceSampleRate;
        }

        public final String getTracerApi() {
            return this.tracerApi;
        }

        public final String getTracerApiVersion() {
            return this.tracerApiVersion;
        }

        public final Boolean getTrackAnonymousUser() {
            return this.trackAnonymousUser;
        }

        public final Boolean getTrackBackgroundEvents() {
            return this.trackBackgroundEvents;
        }

        public final Boolean getTrackCrossPlatformLongTasks() {
            return this.trackCrossPlatformLongTasks;
        }

        public final Boolean getTrackErrors() {
            return this.trackErrors;
        }

        public final List<TrackFeatureFlagsForEvent> getTrackFeatureFlagsForEvents() {
            return this.trackFeatureFlagsForEvents;
        }

        public final Boolean getTrackFlutterPerformance() {
            return this.trackFlutterPerformance;
        }

        public final Boolean getTrackFrustrations() {
            return this.trackFrustrations;
        }

        public final Boolean getTrackInteractions() {
            return this.trackInteractions;
        }

        public final Boolean getTrackLongTask() {
            return this.trackLongTask;
        }

        public final Boolean getTrackNativeErrors() {
            return this.trackNativeErrors;
        }

        public final Boolean getTrackNativeLongTasks() {
            return this.trackNativeLongTasks;
        }

        public final Boolean getTrackNativeViews() {
            return this.trackNativeViews;
        }

        public final Boolean getTrackNetworkRequests() {
            return this.trackNetworkRequests;
        }

        public final Boolean getTrackResources() {
            return this.trackResources;
        }

        public final Boolean getTrackSessionAcrossSubdomains() {
            return this.trackSessionAcrossSubdomains;
        }

        public final Boolean getTrackUserInteractions() {
            return this.trackUserInteractions;
        }

        public final Boolean getTrackViewsManually() {
            return this.trackViewsManually;
        }

        public final TrackingConsent getTrackingConsent() {
            return this.trackingConsent;
        }

        public final String getUnityVersion() {
            return this.unityVersion;
        }

        public final Boolean getUseAllowedTracingOrigins() {
            return this.useAllowedTracingOrigins;
        }

        public final Boolean getUseAllowedTracingUrls() {
            return this.useAllowedTracingUrls;
        }

        public final Boolean getUseBeforeSend() {
            return this.useBeforeSend;
        }

        public final Boolean getUseCrossSiteSessionCookie() {
            return this.useCrossSiteSessionCookie;
        }

        public final Boolean getUseExcludedActivityUrls() {
            return this.useExcludedActivityUrls;
        }

        public final Boolean getUseFirstPartyHosts() {
            return this.useFirstPartyHosts;
        }

        public final Boolean getUseLocalEncryption() {
            return this.useLocalEncryption;
        }

        public final Boolean getUsePartitionedCrossSiteSessionCookie() {
            return this.usePartitionedCrossSiteSessionCookie;
        }

        public final Boolean getUsePciIntake() {
            return this.usePciIntake;
        }

        public final Boolean getUseProxy() {
            return this.useProxy;
        }

        public final Boolean getUseSecureSessionCookie() {
            return this.useSecureSessionCookie;
        }

        public final Boolean getUseTracing() {
            return this.useTracing;
        }

        public final Boolean getUseWorkerUrl() {
            return this.useWorkerUrl;
        }

        public final ViewTrackingStrategy getViewTrackingStrategy() {
            return this.viewTrackingStrategy;
        }

        public int hashCode() {
            Long l = this.sessionSampleRate;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.telemetrySampleRate;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.telemetryConfigurationSampleRate;
            int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.telemetryUsageSampleRate;
            int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.traceSampleRate;
            int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
            TraceContextInjection traceContextInjection = this.traceContextInjection;
            int iHashCode6 = (iHashCode5 + (traceContextInjection == null ? 0 : traceContextInjection.hashCode())) * 31;
            Long l6 = this.premiumSampleRate;
            int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l7 = this.replaySampleRate;
            int iHashCode8 = (iHashCode7 + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l8 = this.sessionReplaySampleRate;
            int iHashCode9 = (iHashCode8 + (l8 == null ? 0 : l8.hashCode())) * 31;
            TrackingConsent trackingConsent = this.trackingConsent;
            int iHashCode10 = (iHashCode9 + (trackingConsent == null ? 0 : trackingConsent.hashCode())) * 31;
            Boolean bool = this.startSessionReplayRecordingManually;
            int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.startRecordingImmediately;
            int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.useProxy;
            int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.useBeforeSend;
            int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.silentMultipleInit;
            int iHashCode15 = (iHashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.trackSessionAcrossSubdomains;
            int iHashCode16 = (iHashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.trackResources;
            int iHashCode17 = (iHashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.trackLongTask;
            int iHashCode18 = (iHashCode17 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.useCrossSiteSessionCookie;
            int iHashCode19 = (iHashCode18 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.usePartitionedCrossSiteSessionCookie;
            int iHashCode20 = (iHashCode19 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.useSecureSessionCookie;
            int iHashCode21 = (iHashCode20 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.allowFallbackToLocalStorage;
            int iHashCode22 = (iHashCode21 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            SessionPersistence sessionPersistence = this.sessionPersistence;
            int iHashCode23 = (iHashCode22 + (sessionPersistence == null ? 0 : sessionPersistence.hashCode())) * 31;
            Boolean bool13 = this.storeContextsAcrossPages;
            int iHashCode24 = (iHashCode23 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.allowUntrustedEvents;
            int iHashCode25 = (iHashCode24 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            String str = this.actionNameAttribute;
            int iHashCode26 = (iHashCode25 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool15 = this.useAllowedTracingOrigins;
            int iHashCode27 = (iHashCode26 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.useAllowedTracingUrls;
            int iHashCode28 = (iHashCode27 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            List<SelectedTracingPropagator> list = this.selectedTracingPropagators;
            int iHashCode29 = (iHashCode28 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.defaultPrivacyLevel;
            int iHashCode30 = (iHashCode29 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.textAndInputPrivacyLevel;
            int iHashCode31 = (iHashCode30 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imagePrivacyLevel;
            int iHashCode32 = (iHashCode31 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.touchPrivacyLevel;
            int iHashCode33 = (iHashCode32 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool17 = this.enablePrivacyForActionName;
            int iHashCode34 = (iHashCode33 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            Boolean bool18 = this.useExcludedActivityUrls;
            int iHashCode35 = (iHashCode34 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            Boolean bool19 = this.useWorkerUrl;
            int iHashCode36 = (iHashCode35 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.compressIntakeRequests;
            int iHashCode37 = (iHashCode36 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            Boolean bool21 = this.trackFrustrations;
            int iHashCode38 = (iHashCode37 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
            Boolean bool22 = this.trackViewsManually;
            int iHashCode39 = (iHashCode38 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
            Boolean bool23 = this.trackInteractions;
            int iHashCode40 = (iHashCode39 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
            Boolean bool24 = this.trackUserInteractions;
            int iHashCode41 = (iHashCode40 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
            Boolean bool25 = this.forwardErrorsToLogs;
            int iHashCode42 = (iHashCode41 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
            List<String> list2 = this.forwardConsoleLogs;
            int iHashCode43 = (iHashCode42 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.forwardReports;
            int iHashCode44 = (iHashCode43 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Boolean bool26 = this.useLocalEncryption;
            int iHashCode45 = (iHashCode44 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
            ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            int iHashCode46 = (iHashCode45 + (viewTrackingStrategy == null ? 0 : viewTrackingStrategy.hashCode())) * 31;
            Boolean bool27 = this.trackBackgroundEvents;
            int iHashCode47 = (iHashCode46 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
            Long l9 = this.mobileVitalsUpdatePeriod;
            int iHashCode48 = (iHashCode47 + (l9 == null ? 0 : l9.hashCode())) * 31;
            Boolean bool28 = this.trackErrors;
            int iHashCode49 = (iHashCode48 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
            Boolean bool29 = this.trackNetworkRequests;
            int iHashCode50 = (iHashCode49 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
            Boolean bool30 = this.useTracing;
            int iHashCode51 = (iHashCode50 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
            Boolean bool31 = this.trackNativeViews;
            int iHashCode52 = (iHashCode51 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
            Boolean bool32 = this.trackNativeErrors;
            int iHashCode53 = (iHashCode52 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
            Boolean bool33 = this.trackNativeLongTasks;
            int iHashCode54 = (iHashCode53 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
            Boolean bool34 = this.trackCrossPlatformLongTasks;
            int iHashCode55 = (iHashCode54 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
            Boolean bool35 = this.useFirstPartyHosts;
            int iHashCode56 = (iHashCode55 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
            String str6 = this.initializationType;
            int iHashCode57 = (iHashCode56 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool36 = this.trackFlutterPerformance;
            int iHashCode58 = (iHashCode57 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
            Long l10 = this.batchSize;
            int iHashCode59 = (iHashCode58 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.batchUploadFrequency;
            int iHashCode60 = (iHashCode59 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.batchProcessingLevel;
            int iHashCode61 = (iHashCode60 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Boolean bool37 = this.backgroundTasksEnabled;
            int iHashCode62 = (iHashCode61 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
            String str7 = this.reactVersion;
            int iHashCode63 = (iHashCode62 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.reactNativeVersion;
            int iHashCode64 = (iHashCode63 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.dartVersion;
            int iHashCode65 = (iHashCode64 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.unityVersion;
            int iHashCode66 = (iHashCode65 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Long l13 = this.appHangThreshold;
            int iHashCode67 = (iHashCode66 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Boolean bool38 = this.usePciIntake;
            int iHashCode68 = (iHashCode67 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
            String str11 = this.tracerApi;
            int iHashCode69 = (iHashCode68 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.tracerApiVersion;
            int iHashCode70 = (iHashCode69 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Boolean bool39 = this.sendLogsAfterSessionExpiration;
            int iHashCode71 = (iHashCode70 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
            List<Plugin> list4 = this.plugins;
            int iHashCode72 = (iHashCode71 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Boolean bool40 = this.isMainProcess;
            int iHashCode73 = (iHashCode72 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
            List<TrackFeatureFlagsForEvent> list5 = this.trackFeatureFlagsForEvents;
            int iHashCode74 = (iHashCode73 + (list5 == null ? 0 : list5.hashCode())) * 31;
            Boolean bool41 = this.trackAnonymousUser;
            return iHashCode74 + (bool41 != null ? bool41.hashCode() : 0);
        }

        public final Boolean isMainProcess() {
            return this.isMainProcess;
        }

        public final void setDartVersion(String str) {
            this.dartVersion = str;
        }

        public final void setDefaultPrivacyLevel(String str) {
            this.defaultPrivacyLevel = str;
        }

        public final void setEnablePrivacyForActionName(Boolean bool) {
            this.enablePrivacyForActionName = bool;
        }

        public final void setImagePrivacyLevel(String str) {
            this.imagePrivacyLevel = str;
        }

        public final void setInitializationType(String str) {
            this.initializationType = str;
        }

        public final void setMobileVitalsUpdatePeriod(Long l) {
            this.mobileVitalsUpdatePeriod = l;
        }

        public final void setReactNativeVersion(String str) {
            this.reactNativeVersion = str;
        }

        public final void setReactVersion(String str) {
            this.reactVersion = str;
        }

        public final void setSendLogsAfterSessionExpiration(Boolean bool) {
            this.sendLogsAfterSessionExpiration = bool;
        }

        public final void setSessionReplaySampleRate(Long l) {
            this.sessionReplaySampleRate = l;
        }

        public final void setStartRecordingImmediately(Boolean bool) {
            this.startRecordingImmediately = bool;
        }

        public final void setStartSessionReplayRecordingManually(Boolean bool) {
            this.startSessionReplayRecordingManually = bool;
        }

        public final void setTextAndInputPrivacyLevel(String str) {
            this.textAndInputPrivacyLevel = str;
        }

        public final void setTouchPrivacyLevel(String str) {
            this.touchPrivacyLevel = str;
        }

        public final void setTraceContextInjection(TraceContextInjection traceContextInjection) {
            this.traceContextInjection = traceContextInjection;
        }

        public final void setTracerApi(String str) {
            this.tracerApi = str;
        }

        public final void setTracerApiVersion(String str) {
            this.tracerApiVersion = str;
        }

        public final void setTrackAnonymousUser(Boolean bool) {
            this.trackAnonymousUser = bool;
        }

        public final void setTrackBackgroundEvents(Boolean bool) {
            this.trackBackgroundEvents = bool;
        }

        public final void setTrackCrossPlatformLongTasks(Boolean bool) {
            this.trackCrossPlatformLongTasks = bool;
        }

        public final void setTrackErrors(Boolean bool) {
            this.trackErrors = bool;
        }

        public final void setTrackFlutterPerformance(Boolean bool) {
            this.trackFlutterPerformance = bool;
        }

        public final void setTrackFrustrations(Boolean bool) {
            this.trackFrustrations = bool;
        }

        public final void setTrackInteractions(Boolean bool) {
            this.trackInteractions = bool;
        }

        public final void setTrackLongTask(Boolean bool) {
            this.trackLongTask = bool;
        }

        public final void setTrackNativeErrors(Boolean bool) {
            this.trackNativeErrors = bool;
        }

        public final void setTrackNativeLongTasks(Boolean bool) {
            this.trackNativeLongTasks = bool;
        }

        public final void setTrackNativeViews(Boolean bool) {
            this.trackNativeViews = bool;
        }

        public final void setTrackNetworkRequests(Boolean bool) {
            this.trackNetworkRequests = bool;
        }

        public final void setTrackResources(Boolean bool) {
            this.trackResources = bool;
        }

        public final void setTrackUserInteractions(Boolean bool) {
            this.trackUserInteractions = bool;
        }

        public final void setTrackViewsManually(Boolean bool) {
            this.trackViewsManually = bool;
        }

        public final void setUnityVersion(String str) {
            this.unityVersion = str;
        }

        public final void setUseFirstPartyHosts(Boolean bool) {
            this.useFirstPartyHosts = bool;
        }

        public final void setUsePciIntake(Boolean bool) {
            this.usePciIntake = bool;
        }

        public final void setUseProxy(Boolean bool) {
            this.useProxy = bool;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Long l = this.sessionSampleRate;
            if (l != null) {
                ia.o(l, ab8Var, "session_sample_rate");
                j6g j6gVar = j6g.a;
            }
            Long l2 = this.telemetrySampleRate;
            if (l2 != null) {
                ia.o(l2, ab8Var, "telemetry_sample_rate");
                j6g j6gVar2 = j6g.a;
            }
            Long l3 = this.telemetryConfigurationSampleRate;
            if (l3 != null) {
                ia.o(l3, ab8Var, "telemetry_configuration_sample_rate");
                j6g j6gVar3 = j6g.a;
            }
            Long l4 = this.telemetryUsageSampleRate;
            if (l4 != null) {
                ia.o(l4, ab8Var, "telemetry_usage_sample_rate");
                j6g j6gVar4 = j6g.a;
            }
            Long l5 = this.traceSampleRate;
            if (l5 != null) {
                ia.o(l5, ab8Var, "trace_sample_rate");
                j6g j6gVar5 = j6g.a;
            }
            TraceContextInjection traceContextInjection = this.traceContextInjection;
            if (traceContextInjection != null) {
                ab8Var.i("trace_context_injection", traceContextInjection.toJson());
                j6g j6gVar6 = j6g.a;
            }
            Long l6 = this.premiumSampleRate;
            if (l6 != null) {
                ia.o(l6, ab8Var, "premium_sample_rate");
                j6g j6gVar7 = j6g.a;
            }
            Long l7 = this.replaySampleRate;
            if (l7 != null) {
                ia.o(l7, ab8Var, "replay_sample_rate");
                j6g j6gVar8 = j6g.a;
            }
            Long l8 = this.sessionReplaySampleRate;
            if (l8 != null) {
                ia.o(l8, ab8Var, TelemetryEventHandler.SESSION_REPLAY_SAMPLE_RATE_KEY);
                j6g j6gVar9 = j6g.a;
            }
            TrackingConsent trackingConsent = this.trackingConsent;
            if (trackingConsent != null) {
                ab8Var.i("tracking_consent", trackingConsent.toJson());
                j6g j6gVar10 = j6g.a;
            }
            Boolean bool = this.startSessionReplayRecordingManually;
            if (bool != null) {
                ab8Var.k("start_session_replay_recording_manually", bool);
                j6g j6gVar11 = j6g.a;
            }
            Boolean bool2 = this.startRecordingImmediately;
            if (bool2 != null) {
                ab8Var.k("start_recording_immediately", bool2);
                j6g j6gVar12 = j6g.a;
            }
            Boolean bool3 = this.useProxy;
            if (bool3 != null) {
                ab8Var.k("use_proxy", bool3);
                j6g j6gVar13 = j6g.a;
            }
            Boolean bool4 = this.useBeforeSend;
            if (bool4 != null) {
                ab8Var.k("use_before_send", bool4);
                j6g j6gVar14 = j6g.a;
            }
            Boolean bool5 = this.silentMultipleInit;
            if (bool5 != null) {
                ab8Var.k("silent_multiple_init", bool5);
                j6g j6gVar15 = j6g.a;
            }
            Boolean bool6 = this.trackSessionAcrossSubdomains;
            if (bool6 != null) {
                ab8Var.k("track_session_across_subdomains", bool6);
                j6g j6gVar16 = j6g.a;
            }
            Boolean bool7 = this.trackResources;
            if (bool7 != null) {
                ab8Var.k("track_resources", bool7);
                j6g j6gVar17 = j6g.a;
            }
            Boolean bool8 = this.trackLongTask;
            if (bool8 != null) {
                ab8Var.k("track_long_task", bool8);
                j6g j6gVar18 = j6g.a;
            }
            Boolean bool9 = this.useCrossSiteSessionCookie;
            if (bool9 != null) {
                ab8Var.k("use_cross_site_session_cookie", bool9);
                j6g j6gVar19 = j6g.a;
            }
            Boolean bool10 = this.usePartitionedCrossSiteSessionCookie;
            if (bool10 != null) {
                ab8Var.k("use_partitioned_cross_site_session_cookie", bool10);
                j6g j6gVar20 = j6g.a;
            }
            Boolean bool11 = this.useSecureSessionCookie;
            if (bool11 != null) {
                ab8Var.k("use_secure_session_cookie", bool11);
                j6g j6gVar21 = j6g.a;
            }
            Boolean bool12 = this.allowFallbackToLocalStorage;
            if (bool12 != null) {
                ab8Var.k("allow_fallback_to_local_storage", bool12);
                j6g j6gVar22 = j6g.a;
            }
            SessionPersistence sessionPersistence = this.sessionPersistence;
            if (sessionPersistence != null) {
                ab8Var.i("session_persistence", sessionPersistence.toJson());
                j6g j6gVar23 = j6g.a;
            }
            Boolean bool13 = this.storeContextsAcrossPages;
            if (bool13 != null) {
                ab8Var.k("store_contexts_across_pages", bool13);
                j6g j6gVar24 = j6g.a;
            }
            Boolean bool14 = this.allowUntrustedEvents;
            if (bool14 != null) {
                ab8Var.k("allow_untrusted_events", bool14);
                j6g j6gVar25 = j6g.a;
            }
            String str = this.actionNameAttribute;
            if (str != null) {
                ab8Var.l("action_name_attribute", str);
                j6g j6gVar26 = j6g.a;
            }
            Boolean bool15 = this.useAllowedTracingOrigins;
            if (bool15 != null) {
                ab8Var.k("use_allowed_tracing_origins", bool15);
                j6g j6gVar27 = j6g.a;
            }
            Boolean bool16 = this.useAllowedTracingUrls;
            if (bool16 != null) {
                ab8Var.k("use_allowed_tracing_urls", bool16);
                j6g j6gVar28 = j6g.a;
            }
            List<SelectedTracingPropagator> list = this.selectedTracingPropagators;
            if (list != null) {
                w98 w98Var = new w98(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    w98Var.i(((SelectedTracingPropagator) it.next()).toJson());
                }
                ab8Var.i("selected_tracing_propagators", w98Var);
                j6g j6gVar29 = j6g.a;
            }
            String str2 = this.defaultPrivacyLevel;
            if (str2 != null) {
                ab8Var.l("default_privacy_level", str2);
                j6g j6gVar30 = j6g.a;
            }
            String str3 = this.textAndInputPrivacyLevel;
            if (str3 != null) {
                ab8Var.l("text_and_input_privacy_level", str3);
                j6g j6gVar31 = j6g.a;
            }
            String str4 = this.imagePrivacyLevel;
            if (str4 != null) {
                ab8Var.l("image_privacy_level", str4);
                j6g j6gVar32 = j6g.a;
            }
            String str5 = this.touchPrivacyLevel;
            if (str5 != null) {
                ab8Var.l("touch_privacy_level", str5);
                j6g j6gVar33 = j6g.a;
            }
            Boolean bool17 = this.enablePrivacyForActionName;
            if (bool17 != null) {
                ab8Var.k("enable_privacy_for_action_name", bool17);
                j6g j6gVar34 = j6g.a;
            }
            Boolean bool18 = this.useExcludedActivityUrls;
            if (bool18 != null) {
                ab8Var.k("use_excluded_activity_urls", bool18);
                j6g j6gVar35 = j6g.a;
            }
            Boolean bool19 = this.useWorkerUrl;
            if (bool19 != null) {
                ab8Var.k("use_worker_url", bool19);
                j6g j6gVar36 = j6g.a;
            }
            Boolean bool20 = this.compressIntakeRequests;
            if (bool20 != null) {
                ab8Var.k("compress_intake_requests", bool20);
                j6g j6gVar37 = j6g.a;
            }
            Boolean bool21 = this.trackFrustrations;
            if (bool21 != null) {
                ab8Var.k("track_frustrations", bool21);
                j6g j6gVar38 = j6g.a;
            }
            Boolean bool22 = this.trackViewsManually;
            if (bool22 != null) {
                ab8Var.k("track_views_manually", bool22);
                j6g j6gVar39 = j6g.a;
            }
            Boolean bool23 = this.trackInteractions;
            if (bool23 != null) {
                ab8Var.k("track_interactions", bool23);
                j6g j6gVar40 = j6g.a;
            }
            Boolean bool24 = this.trackUserInteractions;
            if (bool24 != null) {
                ab8Var.k("track_user_interactions", bool24);
                j6g j6gVar41 = j6g.a;
            }
            Boolean bool25 = this.forwardErrorsToLogs;
            if (bool25 != null) {
                ab8Var.k("forward_errors_to_logs", bool25);
                j6g j6gVar42 = j6g.a;
            }
            List<String> list2 = this.forwardConsoleLogs;
            if (list2 != null) {
                w98 w98Var2 = new w98(list2.size());
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    w98Var2.j((String) it2.next());
                }
                ab8Var.i("forward_console_logs", w98Var2);
                j6g j6gVar43 = j6g.a;
            }
            List<String> list3 = this.forwardReports;
            if (list3 != null) {
                w98 w98Var3 = new w98(list3.size());
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    w98Var3.j((String) it3.next());
                }
                ab8Var.i("forward_reports", w98Var3);
                j6g j6gVar44 = j6g.a;
            }
            Boolean bool26 = this.useLocalEncryption;
            if (bool26 != null) {
                ab8Var.k("use_local_encryption", bool26);
                j6g j6gVar45 = j6g.a;
            }
            ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            if (viewTrackingStrategy != null) {
                ab8Var.i("view_tracking_strategy", viewTrackingStrategy.toJson());
                j6g j6gVar46 = j6g.a;
            }
            Boolean bool27 = this.trackBackgroundEvents;
            if (bool27 != null) {
                ab8Var.k("track_background_events", bool27);
                j6g j6gVar47 = j6g.a;
            }
            Long l9 = this.mobileVitalsUpdatePeriod;
            if (l9 != null) {
                ia.o(l9, ab8Var, "mobile_vitals_update_period");
                j6g j6gVar48 = j6g.a;
            }
            Boolean bool28 = this.trackErrors;
            if (bool28 != null) {
                ab8Var.k("track_errors", bool28);
                j6g j6gVar49 = j6g.a;
            }
            Boolean bool29 = this.trackNetworkRequests;
            if (bool29 != null) {
                ab8Var.k("track_network_requests", bool29);
                j6g j6gVar50 = j6g.a;
            }
            Boolean bool30 = this.useTracing;
            if (bool30 != null) {
                ab8Var.k("use_tracing", bool30);
                j6g j6gVar51 = j6g.a;
            }
            Boolean bool31 = this.trackNativeViews;
            if (bool31 != null) {
                ab8Var.k("track_native_views", bool31);
                j6g j6gVar52 = j6g.a;
            }
            Boolean bool32 = this.trackNativeErrors;
            if (bool32 != null) {
                ab8Var.k("track_native_errors", bool32);
                j6g j6gVar53 = j6g.a;
            }
            Boolean bool33 = this.trackNativeLongTasks;
            if (bool33 != null) {
                ab8Var.k("track_native_long_tasks", bool33);
                j6g j6gVar54 = j6g.a;
            }
            Boolean bool34 = this.trackCrossPlatformLongTasks;
            if (bool34 != null) {
                ab8Var.k("track_cross_platform_long_tasks", bool34);
                j6g j6gVar55 = j6g.a;
            }
            Boolean bool35 = this.useFirstPartyHosts;
            if (bool35 != null) {
                ab8Var.k("use_first_party_hosts", bool35);
                j6g j6gVar56 = j6g.a;
            }
            String str6 = this.initializationType;
            if (str6 != null) {
                ab8Var.l("initialization_type", str6);
                j6g j6gVar57 = j6g.a;
            }
            Boolean bool36 = this.trackFlutterPerformance;
            if (bool36 != null) {
                ab8Var.k("track_flutter_performance", bool36);
                j6g j6gVar58 = j6g.a;
            }
            Long l10 = this.batchSize;
            if (l10 != null) {
                ia.o(l10, ab8Var, BatchMetricsDispatcher.BATCH_SIZE_KEY);
                j6g j6gVar59 = j6g.a;
            }
            Long l11 = this.batchUploadFrequency;
            if (l11 != null) {
                ia.o(l11, ab8Var, "batch_upload_frequency");
                j6g j6gVar60 = j6g.a;
            }
            Long l12 = this.batchProcessingLevel;
            if (l12 != null) {
                ia.o(l12, ab8Var, "batch_processing_level");
                j6g j6gVar61 = j6g.a;
            }
            Boolean bool37 = this.backgroundTasksEnabled;
            if (bool37 != null) {
                ab8Var.k("background_tasks_enabled", bool37);
                j6g j6gVar62 = j6g.a;
            }
            String str7 = this.reactVersion;
            if (str7 != null) {
                ab8Var.l("react_version", str7);
                j6g j6gVar63 = j6g.a;
            }
            String str8 = this.reactNativeVersion;
            if (str8 != null) {
                ab8Var.l("react_native_version", str8);
                j6g j6gVar64 = j6g.a;
            }
            String str9 = this.dartVersion;
            if (str9 != null) {
                ab8Var.l("dart_version", str9);
                j6g j6gVar65 = j6g.a;
            }
            String str10 = this.unityVersion;
            if (str10 != null) {
                ab8Var.l("unity_version", str10);
                j6g j6gVar66 = j6g.a;
            }
            Long l13 = this.appHangThreshold;
            if (l13 != null) {
                ia.o(l13, ab8Var, "app_hang_threshold");
                j6g j6gVar67 = j6g.a;
            }
            Boolean bool38 = this.usePciIntake;
            if (bool38 != null) {
                ab8Var.k("use_pci_intake", bool38);
                j6g j6gVar68 = j6g.a;
            }
            String str11 = this.tracerApi;
            if (str11 != null) {
                ab8Var.l("tracer_api", str11);
                j6g j6gVar69 = j6g.a;
            }
            String str12 = this.tracerApiVersion;
            if (str12 != null) {
                ab8Var.l("tracer_api_version", str12);
                j6g j6gVar70 = j6g.a;
            }
            Boolean bool39 = this.sendLogsAfterSessionExpiration;
            if (bool39 != null) {
                ab8Var.k("send_logs_after_session_expiration", bool39);
                j6g j6gVar71 = j6g.a;
            }
            List<Plugin> list4 = this.plugins;
            if (list4 != null) {
                w98 w98Var4 = new w98(list4.size());
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    w98Var4.i(((Plugin) it4.next()).toJson());
                }
                ab8Var.i("plugins", w98Var4);
                j6g j6gVar72 = j6g.a;
            }
            Boolean bool40 = this.isMainProcess;
            if (bool40 != null) {
                ab8Var.k("is_main_process", bool40);
                j6g j6gVar73 = j6g.a;
            }
            List<TrackFeatureFlagsForEvent> list5 = this.trackFeatureFlagsForEvents;
            if (list5 != null) {
                w98 w98Var5 = new w98(list5.size());
                Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    w98Var5.i(((TrackFeatureFlagsForEvent) it5.next()).toJson());
                }
                ab8Var.i("track_feature_flags_for_events", w98Var5);
                j6g j6gVar74 = j6g.a;
            }
            Boolean bool41 = this.trackAnonymousUser;
            if (bool41 != null) {
                ab8Var.k("track_anonymous_user", bool41);
                j6g j6gVar75 = j6g.a;
            }
            return ab8Var;
        }

        public String toString() {
            Long l = this.sessionSampleRate;
            Long l2 = this.telemetrySampleRate;
            Long l3 = this.telemetryConfigurationSampleRate;
            Long l4 = this.telemetryUsageSampleRate;
            Long l5 = this.traceSampleRate;
            TraceContextInjection traceContextInjection = this.traceContextInjection;
            Long l6 = this.premiumSampleRate;
            Long l7 = this.replaySampleRate;
            Long l8 = this.sessionReplaySampleRate;
            TrackingConsent trackingConsent = this.trackingConsent;
            Boolean bool = this.startSessionReplayRecordingManually;
            Boolean bool2 = this.startRecordingImmediately;
            Boolean bool3 = this.useProxy;
            Boolean bool4 = this.useBeforeSend;
            Boolean bool5 = this.silentMultipleInit;
            Boolean bool6 = this.trackSessionAcrossSubdomains;
            Boolean bool7 = this.trackResources;
            Boolean bool8 = this.trackLongTask;
            Boolean bool9 = this.useCrossSiteSessionCookie;
            Boolean bool10 = this.usePartitionedCrossSiteSessionCookie;
            Boolean bool11 = this.useSecureSessionCookie;
            Boolean bool12 = this.allowFallbackToLocalStorage;
            SessionPersistence sessionPersistence = this.sessionPersistence;
            Boolean bool13 = this.storeContextsAcrossPages;
            Boolean bool14 = this.allowUntrustedEvents;
            String str = this.actionNameAttribute;
            Boolean bool15 = this.useAllowedTracingOrigins;
            Boolean bool16 = this.useAllowedTracingUrls;
            List<SelectedTracingPropagator> list = this.selectedTracingPropagators;
            String str2 = this.defaultPrivacyLevel;
            String str3 = this.textAndInputPrivacyLevel;
            String str4 = this.imagePrivacyLevel;
            String str5 = this.touchPrivacyLevel;
            Boolean bool17 = this.enablePrivacyForActionName;
            Boolean bool18 = this.useExcludedActivityUrls;
            Boolean bool19 = this.useWorkerUrl;
            Boolean bool20 = this.compressIntakeRequests;
            Boolean bool21 = this.trackFrustrations;
            Boolean bool22 = this.trackViewsManually;
            Boolean bool23 = this.trackInteractions;
            Boolean bool24 = this.trackUserInteractions;
            Boolean bool25 = this.forwardErrorsToLogs;
            List<String> list2 = this.forwardConsoleLogs;
            List<String> list3 = this.forwardReports;
            Boolean bool26 = this.useLocalEncryption;
            ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            Boolean bool27 = this.trackBackgroundEvents;
            Long l9 = this.mobileVitalsUpdatePeriod;
            Boolean bool28 = this.trackErrors;
            Boolean bool29 = this.trackNetworkRequests;
            Boolean bool30 = this.useTracing;
            Boolean bool31 = this.trackNativeViews;
            Boolean bool32 = this.trackNativeErrors;
            Boolean bool33 = this.trackNativeLongTasks;
            Boolean bool34 = this.trackCrossPlatformLongTasks;
            Boolean bool35 = this.useFirstPartyHosts;
            String str6 = this.initializationType;
            Boolean bool36 = this.trackFlutterPerformance;
            Long l10 = this.batchSize;
            Long l11 = this.batchUploadFrequency;
            Long l12 = this.batchProcessingLevel;
            Boolean bool37 = this.backgroundTasksEnabled;
            String str7 = this.reactVersion;
            String str8 = this.reactNativeVersion;
            String str9 = this.dartVersion;
            String str10 = this.unityVersion;
            Long l13 = this.appHangThreshold;
            Boolean bool38 = this.usePciIntake;
            String str11 = this.tracerApi;
            String str12 = this.tracerApiVersion;
            Boolean bool39 = this.sendLogsAfterSessionExpiration;
            List<Plugin> list4 = this.plugins;
            Boolean bool40 = this.isMainProcess;
            List<TrackFeatureFlagsForEvent> list5 = this.trackFeatureFlagsForEvents;
            Boolean bool41 = this.trackAnonymousUser;
            StringBuilder sb = new StringBuilder("Configuration(sessionSampleRate=");
            sb.append(l);
            sb.append(", telemetrySampleRate=");
            sb.append(l2);
            sb.append(", telemetryConfigurationSampleRate=");
            sb.append(l3);
            sb.append(", telemetryUsageSampleRate=");
            sb.append(l4);
            sb.append(", traceSampleRate=");
            sb.append(l5);
            sb.append(", traceContextInjection=");
            sb.append(traceContextInjection);
            sb.append(", premiumSampleRate=");
            sb.append(l6);
            sb.append(", replaySampleRate=");
            sb.append(l7);
            sb.append(", sessionReplaySampleRate=");
            sb.append(l8);
            sb.append(", trackingConsent=");
            sb.append(trackingConsent);
            sb.append(", startSessionReplayRecordingManually=");
            sb.append(bool);
            sb.append(", startRecordingImmediately=");
            sb.append(bool2);
            sb.append(", useProxy=");
            sb.append(bool3);
            sb.append(", useBeforeSend=");
            sb.append(bool4);
            sb.append(", silentMultipleInit=");
            sb.append(bool5);
            sb.append(", trackSessionAcrossSubdomains=");
            sb.append(bool6);
            sb.append(", trackResources=");
            sb.append(bool7);
            sb.append(", trackLongTask=");
            sb.append(bool8);
            sb.append(", useCrossSiteSessionCookie=");
            sb.append(bool9);
            sb.append(", usePartitionedCrossSiteSessionCookie=");
            sb.append(bool10);
            sb.append(", useSecureSessionCookie=");
            sb.append(bool11);
            sb.append(", allowFallbackToLocalStorage=");
            sb.append(bool12);
            sb.append(", sessionPersistence=");
            sb.append(sessionPersistence);
            sb.append(", storeContextsAcrossPages=");
            sb.append(bool13);
            sb.append(", allowUntrustedEvents=");
            sb.append(bool14);
            sb.append(", actionNameAttribute=");
            sb.append(str);
            sb.append(", useAllowedTracingOrigins=");
            sb.append(bool15);
            sb.append(", useAllowedTracingUrls=");
            sb.append(bool16);
            sb.append(", selectedTracingPropagators=");
            sb.append(list);
            sb.append(", defaultPrivacyLevel=");
            sb.append(str2);
            sb.append(", textAndInputPrivacyLevel=");
            ia.r(sb, str3, ", imagePrivacyLevel=", str4, ", touchPrivacyLevel=");
            sb.append(str5);
            sb.append(", enablePrivacyForActionName=");
            sb.append(bool17);
            sb.append(", useExcludedActivityUrls=");
            sb.append(bool18);
            sb.append(", useWorkerUrl=");
            sb.append(bool19);
            sb.append(", compressIntakeRequests=");
            sb.append(bool20);
            sb.append(", trackFrustrations=");
            sb.append(bool21);
            sb.append(", trackViewsManually=");
            sb.append(bool22);
            sb.append(", trackInteractions=");
            sb.append(bool23);
            sb.append(", trackUserInteractions=");
            sb.append(bool24);
            sb.append(", forwardErrorsToLogs=");
            sb.append(bool25);
            sb.append(", forwardConsoleLogs=");
            l6.q(sb, list2, ", forwardReports=", list3, ", useLocalEncryption=");
            sb.append(bool26);
            sb.append(", viewTrackingStrategy=");
            sb.append(viewTrackingStrategy);
            sb.append(", trackBackgroundEvents=");
            sb.append(bool27);
            sb.append(", mobileVitalsUpdatePeriod=");
            sb.append(l9);
            sb.append(", trackErrors=");
            sb.append(bool28);
            sb.append(", trackNetworkRequests=");
            sb.append(bool29);
            sb.append(", useTracing=");
            sb.append(bool30);
            sb.append(", trackNativeViews=");
            sb.append(bool31);
            sb.append(", trackNativeErrors=");
            sb.append(bool32);
            sb.append(", trackNativeLongTasks=");
            sb.append(bool33);
            sb.append(", trackCrossPlatformLongTasks=");
            sb.append(bool34);
            sb.append(", useFirstPartyHosts=");
            sb.append(bool35);
            sb.append(", initializationType=");
            sb.append(str6);
            sb.append(", trackFlutterPerformance=");
            sb.append(bool36);
            sb.append(", batchSize=");
            sb.append(l10);
            sb.append(", batchUploadFrequency=");
            sb.append(l11);
            sb.append(", batchProcessingLevel=");
            sb.append(l12);
            sb.append(", backgroundTasksEnabled=");
            sb.append(bool37);
            sb.append(", reactVersion=");
            ia.r(sb, str7, ", reactNativeVersion=", str8, ", dartVersion=");
            ia.r(sb, str9, ", unityVersion=", str10, ", appHangThreshold=");
            sb.append(l13);
            sb.append(", usePciIntake=");
            sb.append(bool38);
            sb.append(", tracerApi=");
            ia.r(sb, str11, ", tracerApiVersion=", str12, ", sendLogsAfterSessionExpiration=");
            sb.append(bool39);
            sb.append(", plugins=");
            sb.append(list4);
            sb.append(", isMainProcess=");
            sb.append(bool40);
            sb.append(", trackFeatureFlagsForEvents=");
            sb.append(list5);
            sb.append(", trackAnonymousUser=");
            return l5.n(sb, bool41, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Configuration fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Configuration", e);
                    return null;
                }
            }

            public final Configuration fromJsonObject(ab8 jsonObject) {
                Long l;
                SessionPersistence sessionPersistenceFromJson;
                SessionPersistence sessionPersistence;
                ArrayList arrayList;
                ArrayList arrayList2;
                String str;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                Boolean bool;
                ViewTrackingStrategy viewTrackingStrategyFromJson;
                ViewTrackingStrategy viewTrackingStrategy;
                ArrayList arrayList6;
                ArrayList arrayList7;
                ArrayList arrayList8;
                String strG;
                String strG2;
                String strG3;
                String strG4;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("session_sample_rate");
                    Long lValueOf = ka8VarM != null ? Long.valueOf(ka8VarM.e()) : null;
                    ka8 ka8VarM2 = jsonObject.m("telemetry_sample_rate");
                    Long lValueOf2 = ka8VarM2 != null ? Long.valueOf(ka8VarM2.e()) : null;
                    ka8 ka8VarM3 = jsonObject.m("telemetry_configuration_sample_rate");
                    Long lValueOf3 = ka8VarM3 != null ? Long.valueOf(ka8VarM3.e()) : null;
                    ka8 ka8VarM4 = jsonObject.m("telemetry_usage_sample_rate");
                    Long lValueOf4 = ka8VarM4 != null ? Long.valueOf(ka8VarM4.e()) : null;
                    ka8 ka8VarM5 = jsonObject.m("trace_sample_rate");
                    Long lValueOf5 = ka8VarM5 != null ? Long.valueOf(ka8VarM5.e()) : null;
                    ka8 ka8VarM6 = jsonObject.m("trace_context_injection");
                    TraceContextInjection traceContextInjectionFromJson = (ka8VarM6 == null || (strG4 = ka8VarM6.g()) == null) ? null : TraceContextInjection.INSTANCE.fromJson(strG4);
                    ka8 ka8VarM7 = jsonObject.m("premium_sample_rate");
                    Long lValueOf6 = ka8VarM7 != null ? Long.valueOf(ka8VarM7.e()) : null;
                    ka8 ka8VarM8 = jsonObject.m("replay_sample_rate");
                    Long lValueOf7 = ka8VarM8 != null ? Long.valueOf(ka8VarM8.e()) : null;
                    ka8 ka8VarM9 = jsonObject.m(TelemetryEventHandler.SESSION_REPLAY_SAMPLE_RATE_KEY);
                    Long lValueOf8 = ka8VarM9 != null ? Long.valueOf(ka8VarM9.e()) : null;
                    ka8 ka8VarM10 = jsonObject.m("tracking_consent");
                    TrackingConsent trackingConsentFromJson = (ka8VarM10 == null || (strG3 = ka8VarM10.g()) == null) ? null : TrackingConsent.INSTANCE.fromJson(strG3);
                    ka8 ka8VarM11 = jsonObject.m("start_session_replay_recording_manually");
                    Boolean boolValueOf = ka8VarM11 != null ? Boolean.valueOf(ka8VarM11.a()) : null;
                    ka8 ka8VarM12 = jsonObject.m("start_recording_immediately");
                    Boolean boolValueOf2 = ka8VarM12 != null ? Boolean.valueOf(ka8VarM12.a()) : null;
                    ka8 ka8VarM13 = jsonObject.m("use_proxy");
                    Boolean boolValueOf3 = ka8VarM13 != null ? Boolean.valueOf(ka8VarM13.a()) : null;
                    ka8 ka8VarM14 = jsonObject.m("use_before_send");
                    Boolean boolValueOf4 = ka8VarM14 != null ? Boolean.valueOf(ka8VarM14.a()) : null;
                    ka8 ka8VarM15 = jsonObject.m("silent_multiple_init");
                    Boolean boolValueOf5 = ka8VarM15 != null ? Boolean.valueOf(ka8VarM15.a()) : null;
                    ka8 ka8VarM16 = jsonObject.m("track_session_across_subdomains");
                    Boolean boolValueOf6 = ka8VarM16 != null ? Boolean.valueOf(ka8VarM16.a()) : null;
                    ka8 ka8VarM17 = jsonObject.m("track_resources");
                    Boolean boolValueOf7 = ka8VarM17 != null ? Boolean.valueOf(ka8VarM17.a()) : null;
                    ka8 ka8VarM18 = jsonObject.m("track_long_task");
                    Boolean boolValueOf8 = ka8VarM18 != null ? Boolean.valueOf(ka8VarM18.a()) : null;
                    ka8 ka8VarM19 = jsonObject.m("use_cross_site_session_cookie");
                    Boolean boolValueOf9 = ka8VarM19 != null ? Boolean.valueOf(ka8VarM19.a()) : null;
                    ka8 ka8VarM20 = jsonObject.m("use_partitioned_cross_site_session_cookie");
                    Boolean boolValueOf10 = ka8VarM20 != null ? Boolean.valueOf(ka8VarM20.a()) : null;
                    ka8 ka8VarM21 = jsonObject.m("use_secure_session_cookie");
                    Boolean boolValueOf11 = ka8VarM21 != null ? Boolean.valueOf(ka8VarM21.a()) : null;
                    ka8 ka8VarM22 = jsonObject.m("allow_fallback_to_local_storage");
                    Boolean boolValueOf12 = ka8VarM22 != null ? Boolean.valueOf(ka8VarM22.a()) : null;
                    ka8 ka8VarM23 = jsonObject.m("session_persistence");
                    if (ka8VarM23 == null || (strG2 = ka8VarM23.g()) == null) {
                        l = lValueOf;
                        sessionPersistenceFromJson = null;
                    } else {
                        l = lValueOf;
                        sessionPersistenceFromJson = SessionPersistence.INSTANCE.fromJson(strG2);
                    }
                    ka8 ka8VarM24 = jsonObject.m("store_contexts_across_pages");
                    Boolean boolValueOf13 = ka8VarM24 != null ? Boolean.valueOf(ka8VarM24.a()) : null;
                    ka8 ka8VarM25 = jsonObject.m("allow_untrusted_events");
                    Boolean boolValueOf14 = ka8VarM25 != null ? Boolean.valueOf(ka8VarM25.a()) : null;
                    ka8 ka8VarM26 = jsonObject.m("action_name_attribute");
                    String strG5 = ka8VarM26 != null ? ka8VarM26.g() : null;
                    ka8 ka8VarM27 = jsonObject.m("use_allowed_tracing_origins");
                    Boolean boolValueOf15 = ka8VarM27 != null ? Boolean.valueOf(ka8VarM27.a()) : null;
                    ka8 ka8VarM28 = jsonObject.m("use_allowed_tracing_urls");
                    Boolean boolValueOf16 = ka8VarM28 != null ? Boolean.valueOf(ka8VarM28.a()) : null;
                    ka8 ka8VarM29 = jsonObject.m("selected_tracing_propagators");
                    if (ka8VarM29 != null) {
                        w98 w98VarC = ka8VarM29.c();
                        sessionPersistence = sessionPersistenceFromJson;
                        arrayList = new ArrayList(w98VarC.size());
                        Iterator<ka8> it = w98VarC.iterator();
                        while (it.hasNext()) {
                            ka8 next = it.next();
                            Iterator<ka8> it2 = it;
                            SelectedTracingPropagator.Companion companion = SelectedTracingPropagator.INSTANCE;
                            Long l2 = lValueOf2;
                            String strG6 = next.g();
                            strG6.getClass();
                            arrayList.add(companion.fromJson(strG6));
                            it = it2;
                            lValueOf2 = l2;
                        }
                    } else {
                        sessionPersistence = sessionPersistenceFromJson;
                        arrayList = null;
                    }
                    Long l3 = lValueOf2;
                    ka8 ka8VarM30 = jsonObject.m("default_privacy_level");
                    String strG7 = ka8VarM30 != null ? ka8VarM30.g() : null;
                    ka8 ka8VarM31 = jsonObject.m("text_and_input_privacy_level");
                    String strG8 = ka8VarM31 != null ? ka8VarM31.g() : null;
                    ka8 ka8VarM32 = jsonObject.m("image_privacy_level");
                    String strG9 = ka8VarM32 != null ? ka8VarM32.g() : null;
                    ka8 ka8VarM33 = jsonObject.m("touch_privacy_level");
                    String strG10 = ka8VarM33 != null ? ka8VarM33.g() : null;
                    ka8 ka8VarM34 = jsonObject.m("enable_privacy_for_action_name");
                    Boolean boolValueOf17 = ka8VarM34 != null ? Boolean.valueOf(ka8VarM34.a()) : null;
                    ka8 ka8VarM35 = jsonObject.m("use_excluded_activity_urls");
                    Boolean boolValueOf18 = ka8VarM35 != null ? Boolean.valueOf(ka8VarM35.a()) : null;
                    ka8 ka8VarM36 = jsonObject.m("use_worker_url");
                    Boolean boolValueOf19 = ka8VarM36 != null ? Boolean.valueOf(ka8VarM36.a()) : null;
                    ka8 ka8VarM37 = jsonObject.m("compress_intake_requests");
                    Boolean boolValueOf20 = ka8VarM37 != null ? Boolean.valueOf(ka8VarM37.a()) : null;
                    ka8 ka8VarM38 = jsonObject.m("track_frustrations");
                    Boolean boolValueOf21 = ka8VarM38 != null ? Boolean.valueOf(ka8VarM38.a()) : null;
                    ka8 ka8VarM39 = jsonObject.m("track_views_manually");
                    Boolean boolValueOf22 = ka8VarM39 != null ? Boolean.valueOf(ka8VarM39.a()) : null;
                    ka8 ka8VarM40 = jsonObject.m("track_interactions");
                    Boolean boolValueOf23 = ka8VarM40 != null ? Boolean.valueOf(ka8VarM40.a()) : null;
                    ka8 ka8VarM41 = jsonObject.m("track_user_interactions");
                    Boolean boolValueOf24 = ka8VarM41 != null ? Boolean.valueOf(ka8VarM41.a()) : null;
                    ka8 ka8VarM42 = jsonObject.m("forward_errors_to_logs");
                    Boolean boolValueOf25 = ka8VarM42 != null ? Boolean.valueOf(ka8VarM42.a()) : null;
                    ka8 ka8VarM43 = jsonObject.m("forward_console_logs");
                    if (ka8VarM43 != null) {
                        w98 w98VarC2 = ka8VarM43.c();
                        arrayList2 = arrayList;
                        str = strG9;
                        arrayList3 = new ArrayList(w98VarC2.size());
                        Iterator<ka8> it3 = w98VarC2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(it3.next().g());
                        }
                    } else {
                        arrayList2 = arrayList;
                        str = strG9;
                        arrayList3 = null;
                    }
                    ka8 ka8VarM44 = jsonObject.m("forward_reports");
                    if (ka8VarM44 != null) {
                        w98 w98VarC3 = ka8VarM44.c();
                        arrayList4 = arrayList3;
                        arrayList5 = new ArrayList(w98VarC3.size());
                        Iterator<ka8> it4 = w98VarC3.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(it4.next().g());
                        }
                    } else {
                        arrayList4 = arrayList3;
                        arrayList5 = null;
                    }
                    ka8 ka8VarM45 = jsonObject.m("use_local_encryption");
                    Boolean boolValueOf26 = ka8VarM45 != null ? Boolean.valueOf(ka8VarM45.a()) : null;
                    ka8 ka8VarM46 = jsonObject.m("view_tracking_strategy");
                    if (ka8VarM46 == null || (strG = ka8VarM46.g()) == null) {
                        bool = boolValueOf26;
                        viewTrackingStrategyFromJson = null;
                    } else {
                        bool = boolValueOf26;
                        viewTrackingStrategyFromJson = ViewTrackingStrategy.INSTANCE.fromJson(strG);
                    }
                    ka8 ka8VarM47 = jsonObject.m("track_background_events");
                    Boolean boolValueOf27 = ka8VarM47 != null ? Boolean.valueOf(ka8VarM47.a()) : null;
                    ka8 ka8VarM48 = jsonObject.m("mobile_vitals_update_period");
                    Long lValueOf9 = ka8VarM48 != null ? Long.valueOf(ka8VarM48.e()) : null;
                    ka8 ka8VarM49 = jsonObject.m("track_errors");
                    Boolean boolValueOf28 = ka8VarM49 != null ? Boolean.valueOf(ka8VarM49.a()) : null;
                    ka8 ka8VarM50 = jsonObject.m("track_network_requests");
                    Boolean boolValueOf29 = ka8VarM50 != null ? Boolean.valueOf(ka8VarM50.a()) : null;
                    ka8 ka8VarM51 = jsonObject.m("use_tracing");
                    Boolean boolValueOf30 = ka8VarM51 != null ? Boolean.valueOf(ka8VarM51.a()) : null;
                    ka8 ka8VarM52 = jsonObject.m("track_native_views");
                    Boolean boolValueOf31 = ka8VarM52 != null ? Boolean.valueOf(ka8VarM52.a()) : null;
                    ka8 ka8VarM53 = jsonObject.m("track_native_errors");
                    Boolean boolValueOf32 = ka8VarM53 != null ? Boolean.valueOf(ka8VarM53.a()) : null;
                    ka8 ka8VarM54 = jsonObject.m("track_native_long_tasks");
                    Boolean boolValueOf33 = ka8VarM54 != null ? Boolean.valueOf(ka8VarM54.a()) : null;
                    ka8 ka8VarM55 = jsonObject.m("track_cross_platform_long_tasks");
                    Boolean boolValueOf34 = ka8VarM55 != null ? Boolean.valueOf(ka8VarM55.a()) : null;
                    ka8 ka8VarM56 = jsonObject.m("use_first_party_hosts");
                    Boolean boolValueOf35 = ka8VarM56 != null ? Boolean.valueOf(ka8VarM56.a()) : null;
                    ka8 ka8VarM57 = jsonObject.m("initialization_type");
                    String strG11 = ka8VarM57 != null ? ka8VarM57.g() : null;
                    ka8 ka8VarM58 = jsonObject.m("track_flutter_performance");
                    Boolean boolValueOf36 = ka8VarM58 != null ? Boolean.valueOf(ka8VarM58.a()) : null;
                    ka8 ka8VarM59 = jsonObject.m(BatchMetricsDispatcher.BATCH_SIZE_KEY);
                    Long lValueOf10 = ka8VarM59 != null ? Long.valueOf(ka8VarM59.e()) : null;
                    ka8 ka8VarM60 = jsonObject.m("batch_upload_frequency");
                    Long lValueOf11 = ka8VarM60 != null ? Long.valueOf(ka8VarM60.e()) : null;
                    ka8 ka8VarM61 = jsonObject.m("batch_processing_level");
                    Long lValueOf12 = ka8VarM61 != null ? Long.valueOf(ka8VarM61.e()) : null;
                    ka8 ka8VarM62 = jsonObject.m("background_tasks_enabled");
                    Boolean boolValueOf37 = ka8VarM62 != null ? Boolean.valueOf(ka8VarM62.a()) : null;
                    ka8 ka8VarM63 = jsonObject.m("react_version");
                    String strG12 = ka8VarM63 != null ? ka8VarM63.g() : null;
                    ka8 ka8VarM64 = jsonObject.m("react_native_version");
                    String strG13 = ka8VarM64 != null ? ka8VarM64.g() : null;
                    ka8 ka8VarM65 = jsonObject.m("dart_version");
                    String strG14 = ka8VarM65 != null ? ka8VarM65.g() : null;
                    ka8 ka8VarM66 = jsonObject.m("unity_version");
                    String strG15 = ka8VarM66 != null ? ka8VarM66.g() : null;
                    ka8 ka8VarM67 = jsonObject.m("app_hang_threshold");
                    Long lValueOf13 = ka8VarM67 != null ? Long.valueOf(ka8VarM67.e()) : null;
                    ka8 ka8VarM68 = jsonObject.m("use_pci_intake");
                    Boolean boolValueOf38 = ka8VarM68 != null ? Boolean.valueOf(ka8VarM68.a()) : null;
                    ka8 ka8VarM69 = jsonObject.m("tracer_api");
                    String strG16 = ka8VarM69 != null ? ka8VarM69.g() : null;
                    ka8 ka8VarM70 = jsonObject.m("tracer_api_version");
                    String strG17 = ka8VarM70 != null ? ka8VarM70.g() : null;
                    ka8 ka8VarM71 = jsonObject.m("send_logs_after_session_expiration");
                    Boolean boolValueOf39 = ka8VarM71 != null ? Boolean.valueOf(ka8VarM71.a()) : null;
                    ka8 ka8VarM72 = jsonObject.m("plugins");
                    if (ka8VarM72 != null) {
                        w98 w98VarC4 = ka8VarM72.c();
                        viewTrackingStrategy = viewTrackingStrategyFromJson;
                        arrayList6 = new ArrayList(w98VarC4.size());
                        Iterator<ka8> it5 = w98VarC4.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(Plugin.INSTANCE.fromJsonObject(it5.next().d()));
                            it5 = it5;
                            arrayList5 = arrayList5;
                        }
                    } else {
                        viewTrackingStrategy = viewTrackingStrategyFromJson;
                        arrayList6 = null;
                    }
                    ArrayList arrayList9 = arrayList5;
                    ka8 ka8VarM73 = jsonObject.m("is_main_process");
                    Boolean boolValueOf40 = ka8VarM73 != null ? Boolean.valueOf(ka8VarM73.a()) : null;
                    ka8 ka8VarM74 = jsonObject.m("track_feature_flags_for_events");
                    if (ka8VarM74 != null) {
                        w98 w98VarC5 = ka8VarM74.c();
                        arrayList7 = arrayList6;
                        arrayList8 = new ArrayList(w98VarC5.size());
                        Iterator<ka8> it6 = w98VarC5.iterator();
                        while (it6.hasNext()) {
                            ka8 next2 = it6.next();
                            Iterator<ka8> it7 = it6;
                            TrackFeatureFlagsForEvent.Companion companion2 = TrackFeatureFlagsForEvent.INSTANCE;
                            String strG18 = next2.g();
                            strG18.getClass();
                            arrayList8.add(companion2.fromJson(strG18));
                            it6 = it7;
                        }
                    } else {
                        arrayList7 = arrayList6;
                        arrayList8 = null;
                    }
                    ka8 ka8VarM75 = jsonObject.m("track_anonymous_user");
                    return new Configuration(l, l3, lValueOf3, lValueOf4, lValueOf5, traceContextInjectionFromJson, lValueOf6, lValueOf7, lValueOf8, trackingConsentFromJson, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, sessionPersistence, boolValueOf13, boolValueOf14, strG5, boolValueOf15, boolValueOf16, arrayList2, strG7, strG8, str, strG10, boolValueOf17, boolValueOf18, boolValueOf19, boolValueOf20, boolValueOf21, boolValueOf22, boolValueOf23, boolValueOf24, boolValueOf25, arrayList4, arrayList9, bool, viewTrackingStrategy, boolValueOf27, lValueOf9, boolValueOf28, boolValueOf29, boolValueOf30, boolValueOf31, boolValueOf32, boolValueOf33, boolValueOf34, boolValueOf35, strG11, boolValueOf36, lValueOf10, lValueOf11, lValueOf12, boolValueOf37, strG12, strG13, strG14, strG15, lValueOf13, boolValueOf38, strG16, strG17, boolValueOf39, arrayList7, boolValueOf40, arrayList8, ka8VarM75 != null ? Boolean.valueOf(ka8VarM75.a()) : null);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e, "Unable to parse json into type Configuration");
                } catch (NullPointerException e2) {
                    throw new JsonParseException(e2, "Unable to parse json into type Configuration");
                } catch (NumberFormatException e3) {
                    throw new JsonParseException(e3, "Unable to parse json into type Configuration");
                }
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(Long l, Long l2, Long l3, Long l4, Long l5, TraceContextInjection traceContextInjection, Long l6, Long l7, Long l8, TrackingConsent trackingConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, SessionPersistence sessionPersistence, Boolean bool13, Boolean bool14, String str, Boolean bool15, Boolean bool16, List<? extends SelectedTracingPropagator> list, String str2, String str3, String str4, String str5, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, List<String> list2, List<String> list3, Boolean bool26, ViewTrackingStrategy viewTrackingStrategy, Boolean bool27, Long l9, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, String str6, Boolean bool36, Long l10, Long l11, Long l12, Boolean bool37, String str7, String str8, String str9, String str10, Long l13, Boolean bool38, String str11, String str12, Boolean bool39, List<Plugin> list4, Boolean bool40, List<? extends TrackFeatureFlagsForEvent> list5, Boolean bool41) {
            this.sessionSampleRate = l;
            this.telemetrySampleRate = l2;
            this.telemetryConfigurationSampleRate = l3;
            this.telemetryUsageSampleRate = l4;
            this.traceSampleRate = l5;
            this.traceContextInjection = traceContextInjection;
            this.premiumSampleRate = l6;
            this.replaySampleRate = l7;
            this.sessionReplaySampleRate = l8;
            this.trackingConsent = trackingConsent;
            this.startSessionReplayRecordingManually = bool;
            this.startRecordingImmediately = bool2;
            this.useProxy = bool3;
            this.useBeforeSend = bool4;
            this.silentMultipleInit = bool5;
            this.trackSessionAcrossSubdomains = bool6;
            this.trackResources = bool7;
            this.trackLongTask = bool8;
            this.useCrossSiteSessionCookie = bool9;
            this.usePartitionedCrossSiteSessionCookie = bool10;
            this.useSecureSessionCookie = bool11;
            this.allowFallbackToLocalStorage = bool12;
            this.sessionPersistence = sessionPersistence;
            this.storeContextsAcrossPages = bool13;
            this.allowUntrustedEvents = bool14;
            this.actionNameAttribute = str;
            this.useAllowedTracingOrigins = bool15;
            this.useAllowedTracingUrls = bool16;
            this.selectedTracingPropagators = list;
            this.defaultPrivacyLevel = str2;
            this.textAndInputPrivacyLevel = str3;
            this.imagePrivacyLevel = str4;
            this.touchPrivacyLevel = str5;
            this.enablePrivacyForActionName = bool17;
            this.useExcludedActivityUrls = bool18;
            this.useWorkerUrl = bool19;
            this.compressIntakeRequests = bool20;
            this.trackFrustrations = bool21;
            this.trackViewsManually = bool22;
            this.trackInteractions = bool23;
            this.trackUserInteractions = bool24;
            this.forwardErrorsToLogs = bool25;
            this.forwardConsoleLogs = list2;
            this.forwardReports = list3;
            this.useLocalEncryption = bool26;
            this.viewTrackingStrategy = viewTrackingStrategy;
            this.trackBackgroundEvents = bool27;
            this.mobileVitalsUpdatePeriod = l9;
            this.trackErrors = bool28;
            this.trackNetworkRequests = bool29;
            this.useTracing = bool30;
            this.trackNativeViews = bool31;
            this.trackNativeErrors = bool32;
            this.trackNativeLongTasks = bool33;
            this.trackCrossPlatformLongTasks = bool34;
            this.useFirstPartyHosts = bool35;
            this.initializationType = str6;
            this.trackFlutterPerformance = bool36;
            this.batchSize = l10;
            this.batchUploadFrequency = l11;
            this.batchProcessingLevel = l12;
            this.backgroundTasksEnabled = bool37;
            this.reactVersion = str7;
            this.reactNativeVersion = str8;
            this.dartVersion = str9;
            this.unityVersion = str10;
            this.appHangThreshold = l13;
            this.usePciIntake = bool38;
            this.tracerApi = str11;
            this.tracerApiVersion = str12;
            this.sendLogsAfterSessionExpiration = bool39;
            this.plugins = list4;
            this.isMainProcess = bool40;
            this.trackFeatureFlagsForEvents = list5;
            this.trackAnonymousUser = bool41;
        }

        public Configuration() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 2047, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;", "", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long formatVersion = 2;

        public static final Dd fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Dd fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.formatVersion), "format_version");
            return ab8Var;
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    if (jsonObject.m("format_version").e() == 2) {
                        return new Dd();
                    }
                    throw new IllegalStateException("Check failed.");
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "", "", "architecture", "brand", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArchitecture", "getBrand", "getModel", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Device {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String architecture;
        private final String brand;
        private final String model;

        public /* synthetic */ Device(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ Device copy$default(Device device, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = device.architecture;
            }
            if ((i & 2) != 0) {
                str2 = device.brand;
            }
            if ((i & 4) != 0) {
                str3 = device.model;
            }
            return device.copy(str, str2, str3);
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

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        public final Device copy(String architecture, String brand, String model) {
            return new Device(architecture, brand, model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Device)) {
                return false;
            }
            Device device = (Device) other;
            return wl7.b(this.architecture, device.architecture) && wl7.b(this.brand, device.brand) && wl7.b(this.model, device.model);
        }

        public final String getArchitecture() {
            return this.architecture;
        }

        public final String getBrand() {
            return this.brand;
        }

        public final String getModel() {
            return this.model;
        }

        public int hashCode() {
            String str = this.architecture;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.brand;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.model;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.architecture;
            if (str != null) {
                ab8Var.l("architecture", str);
            }
            String str2 = this.brand;
            if (str2 != null) {
                ab8Var.l("brand", str2);
            }
            String str3 = this.model;
            if (str3 != null) {
                ab8Var.l("model", str3);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.architecture;
            String str2 = this.brand;
            return l6.i(u40.f("Device(architecture=", str, ", brand=", str2, ", model="), this.model, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ka8 ka8VarM = jsonObject.m("architecture");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("brand");
                    String strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("model");
                    return new Device(strG, strG2, ka8VarM3 != null ? ka8VarM3.g() : null);
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

        public Device(String str, String str2, String str3) {
            this.architecture = str;
            this.brand = str2;
            this.model = str3;
        }

        public Device() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "", "", "build", "name", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Os {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String build;
        private final String name;
        private final String version;

        public /* synthetic */ Os(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ Os copy$default(Os os, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = os.build;
            }
            if ((i & 2) != 0) {
                str2 = os.name;
            }
            if ((i & 4) != 0) {
                str3 = os.version;
            }
            return os.copy(str, str2, str3);
        }

        public static final Os fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Os fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBuild() {
            return this.build;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Os copy(String build, String name, String version) {
            return new Os(build, name, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Os)) {
                return false;
            }
            Os os = (Os) other;
            return wl7.b(this.build, os.build) && wl7.b(this.name, os.name) && wl7.b(this.version, os.version);
        }

        public final String getBuild() {
            return this.build;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.build;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.version;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.build;
            if (str != null) {
                ab8Var.l("build", str);
            }
            String str2 = this.name;
            if (str2 != null) {
                ab8Var.l("name", str2);
            }
            String str3 = this.version;
            if (str3 != null) {
                ab8Var.l("version", str3);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.build;
            String str2 = this.name;
            return l6.i(u40.f("Os(build=", str, ", name=", str2, ", version="), this.version, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Os fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Os", e);
                    return null;
                }
            }

            public final Os fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("build");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("name");
                    String strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("version");
                    return new Os(strG, strG2, ka8VarM3 != null ? ka8VarM3.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Os", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Os", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Os", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Os(String str, String str2, String str3) {
            this.build = str;
            this.name = str2;
            this.version = str3;
        }

        public Os() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Plugin;", "", "", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Plugin;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Plugin {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"name"};
        private final Map<String, Object> additionalProperties;
        private final String name;

        public Plugin(String str, Map<String, Object> map) {
            str.getClass();
            map.getClass();
            this.name = str;
            this.additionalProperties = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Plugin copy$default(Plugin plugin, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = plugin.name;
            }
            if ((i & 2) != 0) {
                map = plugin.additionalProperties;
            }
            return plugin.copy(str, map);
        }

        public static final Plugin fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Plugin fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> component2() {
            return this.additionalProperties;
        }

        public final Plugin copy(String name, Map<String, Object> additionalProperties) {
            name.getClass();
            additionalProperties.getClass();
            return new Plugin(name, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plugin)) {
                return false;
            }
            Plugin plugin = (Plugin) other;
            return wl7.b(this.name, plugin.name) && wl7.b(this.additionalProperties, plugin.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.additionalProperties.hashCode() + (this.name.hashCode() * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("name", this.name);
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
            return "Plugin(name=" + this.name + ", additionalProperties=" + this.additionalProperties + ")";
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Plugin$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Plugin;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Plugin;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Plugin;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Plugin fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Plugin", e);
                    return null;
                }
            }

            public final Plugin fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("name").g();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_rum_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    strG.getClass();
                    return new Plugin(strG, linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Plugin", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Plugin", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Plugin", e3);
                    return null;
                }
            }

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return Plugin.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Plugin(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new LinkedHashMap() : map);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SelectedTracingPropagator;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "DATADOG", "B3", "B3MULTI", "TRACECONTEXT", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SelectedTracingPropagator {
        DATADOG("datadog"),
        B3(TracingInterceptor.B3_HEADER_KEY),
        B3MULTI("b3multi"),
        TRACECONTEXT("tracecontext");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        SelectedTracingPropagator(String str) {
            this.jsonValue = str;
        }

        public static final SelectedTracingPropagator fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SelectedTracingPropagator$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SelectedTracingPropagator;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SelectedTracingPropagator fromJson(String jsonString) {
                jsonString.getClass();
                for (SelectedTracingPropagator selectedTracingPropagator : SelectedTracingPropagator.values()) {
                    if (wl7.b(selectedTracingPropagator.jsonValue, jsonString)) {
                        return selectedTracingPropagator;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Session {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public Session(String str) {
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Session copy$default(Session session, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = session.id;
            }
            return session.copy(str);
        }

        public static final Session fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Session fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Session copy(String id) {
            id.getClass();
            return new Session(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Session) && wl7.b(this.id, ((Session) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            return ab8Var;
        }

        public String toString() {
            return l5.m("Session(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Session;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Session fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Session", e);
                    return null;
                }
            }

            public final Session fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    strG.getClass();
                    return new Session(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Session", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Session", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Session", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "LOCAL_STORAGE", "COOKIE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SessionPersistence {
        LOCAL_STORAGE("local-storage"),
        COOKIE("cookie");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        SessionPersistence(String str) {
            this.jsonValue = str;
        }

        public static final SessionPersistence fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$SessionPersistence;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SessionPersistence fromJson(String jsonString) {
                jsonString.getClass();
                for (SessionPersistence sessionPersistence : SessionPersistence.values()) {
                    if (wl7.b(sessionPersistence.jsonValue, jsonString)) {
                        return sessionPersistence;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Source {
        ANDROID(CoreFeature.DEFAULT_SOURCE_NAME),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Source(String str) {
            this.jsonValue = str;
        }

        public static final Source fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Source fromJson(String jsonString) {
                jsonString.getClass();
                for (Source source : Source.values()) {
                    if (wl7.b(source.jsonValue, jsonString)) {
                        return source;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0015R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010+\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001b¨\u0006/"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "device", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "os", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "configuration", "", "", "additionalProperties", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "component2", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "component3", "()Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;Ljava/util/Map;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Device;", "getDevice", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Os;", "getOs", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Configuration;", "getConfiguration", "Ljava/util/Map;", "getAdditionalProperties", "type", "Ljava/lang/String;", "getType", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Telemetry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"device", "os", "type", "configuration"};
        private final Map<String, Object> additionalProperties;
        private final Configuration configuration;
        private final Device device;
        private final Os os;
        private final String type;

        public /* synthetic */ Telemetry(Device device, Os os, Configuration configuration, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : device, (i & 2) != 0 ? null : os, configuration, (i & 8) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Telemetry copy$default(Telemetry telemetry, Device device, Os os, Configuration configuration, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                device = telemetry.device;
            }
            if ((i & 2) != 0) {
                os = telemetry.os;
            }
            if ((i & 4) != 0) {
                configuration = telemetry.configuration;
            }
            if ((i & 8) != 0) {
                map = telemetry.additionalProperties;
            }
            return telemetry.copy(device, os, configuration, map);
        }

        public static final Telemetry fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Telemetry fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Device getDevice() {
            return this.device;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Os getOs() {
            return this.os;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final Map<String, Object> component4() {
            return this.additionalProperties;
        }

        public final Telemetry copy(Device device, Os os, Configuration configuration, Map<String, Object> additionalProperties) {
            configuration.getClass();
            additionalProperties.getClass();
            return new Telemetry(device, os, configuration, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Telemetry)) {
                return false;
            }
            Telemetry telemetry = (Telemetry) other;
            return wl7.b(this.device, telemetry.device) && wl7.b(this.os, telemetry.os) && wl7.b(this.configuration, telemetry.configuration) && wl7.b(this.additionalProperties, telemetry.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final Device getDevice() {
            return this.device;
        }

        public final Os getOs() {
            return this.os;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            Device device = this.device;
            int iHashCode = (device == null ? 0 : device.hashCode()) * 31;
            Os os = this.os;
            return this.additionalProperties.hashCode() + ((this.configuration.hashCode() + ((iHashCode + (os != null ? os.hashCode() : 0)) * 31)) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Device device = this.device;
            if (device != null) {
                ab8Var.i("device", device.toJson());
            }
            Os os = this.os;
            if (os != null) {
                ab8Var.i("os", os.toJson());
            }
            ab8Var.l("type", this.type);
            ab8Var.i("configuration", this.configuration.toJson());
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
            return "Telemetry(device=" + this.device + ", os=" + this.os + ", configuration=" + this.configuration + ", additionalProperties=" + this.additionalProperties + ")";
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Telemetry;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Telemetry fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Telemetry", e);
                    return null;
                }
            }

            public final Telemetry fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("device");
                    Device deviceFromJsonObject = ka8VarM != null ? Device.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                    ka8 ka8VarM2 = jsonObject.m("os");
                    Os osFromJsonObject = ka8VarM2 != null ? Os.INSTANCE.fromJsonObject(ka8VarM2.d()) : null;
                    String strG = jsonObject.m("type").g();
                    Configuration configurationFromJsonObject = Configuration.INSTANCE.fromJsonObject(jsonObject.m("configuration").d());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_rum_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    if (wl7.b(strG, "configuration")) {
                        return new Telemetry(deviceFromJsonObject, osFromJsonObject, configurationFromJsonObject, linkedHashMap);
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Telemetry", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Telemetry", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Telemetry", e3);
                    return null;
                }
            }

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return Telemetry.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        public Telemetry(Device device, Os os, Configuration configuration, Map<String, Object> map) {
            configuration.getClass();
            map.getClass();
            this.device = device;
            this.os = os;
            this.configuration = configuration;
            this.additionalProperties = map;
            this.type = "configuration";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ALL", "SAMPLED", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum TraceContextInjection {
        ALL("all"),
        SAMPLED("sampled");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        TraceContextInjection(String str) {
            this.jsonValue = str;
        }

        public static final TraceContextInjection fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TraceContextInjection;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TraceContextInjection fromJson(String jsonString) {
                jsonString.getClass();
                for (TraceContextInjection traceContextInjection : TraceContextInjection.values()) {
                    if (wl7.b(traceContextInjection.jsonValue, jsonString)) {
                        return traceContextInjection;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackFeatureFlagsForEvent;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "VITAL", "RESOURCE", "ACTION", "LONG_TASK", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum TrackFeatureFlagsForEvent {
        VITAL("vital"),
        RESOURCE(RumEventDeserializer.EVENT_TYPE_RESOURCE),
        ACTION(RumEventDeserializer.EVENT_TYPE_ACTION),
        LONG_TASK(RumEventDeserializer.EVENT_TYPE_LONG_TASK);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        TrackFeatureFlagsForEvent(String str) {
            this.jsonValue = str;
        }

        public static final TrackFeatureFlagsForEvent fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackFeatureFlagsForEvent$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackFeatureFlagsForEvent;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TrackFeatureFlagsForEvent fromJson(String jsonString) {
                jsonString.getClass();
                for (TrackFeatureFlagsForEvent trackFeatureFlagsForEvent : TrackFeatureFlagsForEvent.values()) {
                    if (wl7.b(trackFeatureFlagsForEvent.jsonValue, jsonString)) {
                        return trackFeatureFlagsForEvent;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "GRANTED", "NOT_GRANTED", "PENDING", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum TrackingConsent {
        GRANTED("granted"),
        NOT_GRANTED("not-granted"),
        PENDING("pending");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        TrackingConsent(String str) {
            this.jsonValue = str;
        }

        public static final TrackingConsent fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$TrackingConsent;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TrackingConsent fromJson(String jsonString) {
                jsonString.getClass();
                for (TrackingConsent trackingConsent : TrackingConsent.values()) {
                    if (wl7.b(trackingConsent.jsonValue, jsonString)) {
                        return trackingConsent;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class View {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public View(String str) {
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ View copy$default(View view, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = view.id;
            }
            return view.copy(str);
        }

        public static final View fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final View fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final View copy(String id) {
            id.getClass();
            return new View(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof View) && wl7.b(this.id, ((View) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            return ab8Var;
        }

        public String toString() {
            return l5.m("View(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$View;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final View fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type View", e);
                    return null;
                }
            }

            public final View fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    strG.getClass();
                    return new View(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type View", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type View", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type View", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ACTIVITYVIEWTRACKINGSTRATEGY", "FRAGMENTVIEWTRACKINGSTRATEGY", "MIXEDVIEWTRACKINGSTRATEGY", "NAVIGATIONVIEWTRACKINGSTRATEGY", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ViewTrackingStrategy {
        ACTIVITYVIEWTRACKINGSTRATEGY("ActivityViewTrackingStrategy"),
        FRAGMENTVIEWTRACKINGSTRATEGY("FragmentViewTrackingStrategy"),
        MIXEDVIEWTRACKINGSTRATEGY("MixedViewTrackingStrategy"),
        NAVIGATIONVIEWTRACKINGSTRATEGY("NavigationViewTrackingStrategy");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ViewTrackingStrategy(String str) {
            this.jsonValue = str;
        }

        public static final ViewTrackingStrategy fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$ViewTrackingStrategy;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewTrackingStrategy fromJson(String jsonString) {
                jsonString.getClass();
                for (ViewTrackingStrategy viewTrackingStrategy : ViewTrackingStrategy.values()) {
                    if (wl7.b(viewTrackingStrategy.jsonValue, jsonString)) {
                        return viewTrackingStrategy;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TelemetryConfigurationEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type TelemetryConfigurationEvent", e);
                return null;
            }
        }

        public final TelemetryConfigurationEvent fromJsonObject(ab8 jsonObject) {
            TelemetryConfigurationEvent telemetryConfigurationEvent;
            ArrayList arrayList;
            jsonObject.getClass();
            try {
                Dd ddFromJsonObject = Dd.INSTANCE.fromJsonObject(jsonObject.m("_dd").d());
                String strG = jsonObject.m("type").g();
                long jE = jsonObject.m(LogAttributes.DATE).e();
                String strG2 = jsonObject.m("service").g();
                Source.Companion companion = Source.INSTANCE;
                String strG3 = jsonObject.m("source").g();
                strG3.getClass();
                Source sourceFromJson = companion.fromJson(strG3);
                String strG4 = jsonObject.m("version").g();
                ka8 ka8VarM = jsonObject.m("application");
                Application applicationFromJsonObject = ka8VarM != null ? Application.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                ka8 ka8VarM2 = jsonObject.m("session");
                Session sessionFromJsonObject = ka8VarM2 != null ? Session.INSTANCE.fromJsonObject(ka8VarM2.d()) : null;
                ka8 ka8VarM3 = jsonObject.m("view");
                View viewFromJsonObject = ka8VarM3 != null ? View.INSTANCE.fromJsonObject(ka8VarM3.d()) : null;
                ka8 ka8VarM4 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_ACTION);
                Action actionFromJsonObject = ka8VarM4 != null ? Action.INSTANCE.fromJsonObject(ka8VarM4.d()) : null;
                ka8 ka8VarM5 = jsonObject.m("effective_sample_rate");
                Number numberF = ka8VarM5 != null ? ka8VarM5.f() : null;
                ka8 ka8VarM6 = jsonObject.m("experimental_features");
                if (ka8VarM6 != null) {
                    ArrayList<ka8> arrayList2 = ka8VarM6.c().a;
                    telemetryConfigurationEvent = null;
                    try {
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        Iterator<ka8> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(it.next().g());
                        }
                        arrayList = arrayList3;
                    } catch (IllegalStateException e) {
                        e = e;
                        g7.n("Unable to parse json into type TelemetryConfigurationEvent", e);
                        return telemetryConfigurationEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        g7.n("Unable to parse json into type TelemetryConfigurationEvent", e);
                        return telemetryConfigurationEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        g7.n("Unable to parse json into type TelemetryConfigurationEvent", e);
                        return telemetryConfigurationEvent;
                    }
                } else {
                    arrayList = null;
                }
                Telemetry telemetryFromJsonObject = Telemetry.INSTANCE.fromJsonObject(jsonObject.m("telemetry").d());
                if (!wl7.b(strG, "telemetry")) {
                    throw new IllegalStateException("Check failed.");
                }
                strG2.getClass();
                strG4.getClass();
                return new TelemetryConfigurationEvent(ddFromJsonObject, jE, strG2, sourceFromJson, strG4, applicationFromJsonObject, sessionFromJsonObject, viewFromJsonObject, actionFromJsonObject, numberF, arrayList, telemetryFromJsonObject);
            } catch (IllegalStateException e4) {
                e = e4;
                telemetryConfigurationEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                telemetryConfigurationEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                telemetryConfigurationEvent = null;
            }
        }

        private Companion() {
        }
    }

    public TelemetryConfigurationEvent(Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List<String> list, Telemetry telemetry) {
        dd.getClass();
        str.getClass();
        source.getClass();
        str2.getClass();
        telemetry.getClass();
        this.dd = dd;
        this.date = j;
        this.service = str;
        this.source = source;
        this.version = str2;
        this.application = application;
        this.session = session;
        this.view = view;
        this.action = action;
        this.effectiveSampleRate = number;
        this.experimentalFeatures = list;
        this.telemetry = telemetry;
        this.type = "telemetry";
    }
}
