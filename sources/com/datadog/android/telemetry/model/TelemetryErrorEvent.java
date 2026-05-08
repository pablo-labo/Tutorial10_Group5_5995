package com.datadog.android.telemetry.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.akb;
import defpackage.b0;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u000bYZX[\\]^_`abB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u009a\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b7\u0010#J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010%R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bG\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u00100R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u00102R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bU\u00104R\u001a\u0010V\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010#¨\u0006c"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "dd", "", LogAttributes.DATE, "", "service", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "source", "version", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "application", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "session", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "view", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", RumEventDeserializer.EVENT_TYPE_ACTION, "", "effectiveSampleRate", "", "experimentalFeatures", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "telemetry", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "component5", "component6", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "component7", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "component8", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "component9", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "component10", "()Ljava/lang/Number;", "component11", "()Ljava/util/List;", "component12", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "getDd", "J", "getDate", "Ljava/lang/String;", "getService", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "getSource", "getVersion", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "getApplication", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "getSession", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "getView", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "getAction", "Ljava/lang/Number;", "getEffectiveSampleRate", "Ljava/util/List;", "getExperimentalFeatures", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "getTelemetry", "type", "getType", "Companion", "Action", "Application", "Dd", "Device", "Error", "Os", "Session", "Source", "Telemetry", "View", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TelemetryErrorEvent {

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

    public /* synthetic */ TelemetryErrorEvent(Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List list, Telemetry telemetry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dd, j, str, source, str2, (i & 32) != 0 ? null : application, (i & 64) != 0 ? null : session, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : view, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : action, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : number, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : list, telemetry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TelemetryErrorEvent copy$default(TelemetryErrorEvent telemetryErrorEvent, Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List list, Telemetry telemetry, int i, Object obj) {
        if ((i & 1) != 0) {
            dd = telemetryErrorEvent.dd;
        }
        return telemetryErrorEvent.copy(dd, (i & 2) != 0 ? telemetryErrorEvent.date : j, (i & 4) != 0 ? telemetryErrorEvent.service : str, (i & 8) != 0 ? telemetryErrorEvent.source : source, (i & 16) != 0 ? telemetryErrorEvent.version : str2, (i & 32) != 0 ? telemetryErrorEvent.application : application, (i & 64) != 0 ? telemetryErrorEvent.session : session, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? telemetryErrorEvent.view : view, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? telemetryErrorEvent.action : action, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? telemetryErrorEvent.effectiveSampleRate : number, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? telemetryErrorEvent.experimentalFeatures : list, (i & 2048) != 0 ? telemetryErrorEvent.telemetry : telemetry);
    }

    public static final TelemetryErrorEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final TelemetryErrorEvent fromJsonObject(ab8 ab8Var) {
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

    public final TelemetryErrorEvent copy(Dd dd, long date, String service, Source source, String version, Application application, Session session, View view, Action action, Number effectiveSampleRate, List<String> experimentalFeatures, Telemetry telemetry) {
        dd.getClass();
        service.getClass();
        source.getClass();
        version.getClass();
        telemetry.getClass();
        return new TelemetryErrorEvent(dd, date, service, source, version, application, session, view, action, effectiveSampleRate, experimentalFeatures, telemetry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryErrorEvent)) {
            return false;
        }
        TelemetryErrorEvent telemetryErrorEvent = (TelemetryErrorEvent) other;
        return wl7.b(this.dd, telemetryErrorEvent.dd) && this.date == telemetryErrorEvent.date && wl7.b(this.service, telemetryErrorEvent.service) && this.source == telemetryErrorEvent.source && wl7.b(this.version, telemetryErrorEvent.version) && wl7.b(this.application, telemetryErrorEvent.application) && wl7.b(this.session, telemetryErrorEvent.session) && wl7.b(this.view, telemetryErrorEvent.view) && wl7.b(this.action, telemetryErrorEvent.action) && wl7.b(this.effectiveSampleRate, telemetryErrorEvent.effectiveSampleRate) && wl7.b(this.experimentalFeatures, telemetryErrorEvent.experimentalFeatures) && wl7.b(this.telemetry, telemetryErrorEvent.telemetry);
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
        return "TelemetryErrorEvent(dd=" + this.dd + ", date=" + this.date + ", service=" + this.service + ", source=" + this.source + ", version=" + this.version + ", application=" + this.application + ", session=" + this.session + ", view=" + this.view + ", action=" + this.action + ", effectiveSampleRate=" + this.effectiveSampleRate + ", experimentalFeatures=" + this.experimentalFeatures + ", telemetry=" + this.telemetry + ")";
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Action;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "", "", "architecture", "brand", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArchitecture", "getBrand", "getModel", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "", "", "stack", "kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStack", "getKind", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Error {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String kind;
        private final String stack;

        public /* synthetic */ Error(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.stack;
            }
            if ((i & 2) != 0) {
                str2 = error.kind;
            }
            return error.copy(str, str2);
        }

        public static final Error fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Error fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStack() {
            return this.stack;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        public final Error copy(String stack, String kind) {
            return new Error(stack, kind);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return wl7.b(this.stack, error.stack) && wl7.b(this.kind, error.kind);
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getStack() {
            return this.stack;
        }

        public int hashCode() {
            String str = this.stack;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.kind;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.stack;
            if (str != null) {
                ab8Var.l("stack", str);
            }
            String str2 = this.kind;
            if (str2 != null) {
                ab8Var.l("kind", str2);
            }
            return ab8Var;
        }

        public String toString() {
            return akb.k("Error(stack=", this.stack, ", kind=", this.kind, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("stack");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("kind");
                    return new Error(strG, ka8VarM2 != null ? ka8VarM2.g() : null);
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

        public Error(String str, String str2) {
            this.stack = str;
            this.kind = str2;
        }

        public Error() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "", "", "build", "name", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Session;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0018R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001aR\u001a\u0010/\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0016R\u001a\u00101\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u0016¨\u00064"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "device", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "os", "", "message", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "error", "", "additionalProperties", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "component2", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "component5", "()Ljava/util/Map;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;Ljava/util/Map;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Device;", "getDevice", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Os;", "getOs", "Ljava/lang/String;", "getMessage", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Error;", "getError", "Ljava/util/Map;", "getAdditionalProperties", "type", "getType", "status", "getStatus", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Telemetry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"device", "os", "type", "status", "message", "error"};
        private final Map<String, Object> additionalProperties;
        private final Device device;
        private final Error error;
        private final String message;
        private final Os os;
        private final String status;
        private final String type;

        public /* synthetic */ Telemetry(Device device, Os os, String str, Error error, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : device, (i & 2) != 0 ? null : os, str, (i & 8) != 0 ? null : error, (i & 16) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Telemetry copy$default(Telemetry telemetry, Device device, Os os, String str, Error error, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                device = telemetry.device;
            }
            if ((i & 2) != 0) {
                os = telemetry.os;
            }
            if ((i & 4) != 0) {
                str = telemetry.message;
            }
            if ((i & 8) != 0) {
                error = telemetry.error;
            }
            if ((i & 16) != 0) {
                map = telemetry.additionalProperties;
            }
            Map map2 = map;
            String str2 = str;
            return telemetry.copy(device, os, str2, error, map2);
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
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Error getError() {
            return this.error;
        }

        public final Map<String, Object> component5() {
            return this.additionalProperties;
        }

        public final Telemetry copy(Device device, Os os, String message, Error error, Map<String, Object> additionalProperties) {
            message.getClass();
            additionalProperties.getClass();
            return new Telemetry(device, os, message, error, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Telemetry)) {
                return false;
            }
            Telemetry telemetry = (Telemetry) other;
            return wl7.b(this.device, telemetry.device) && wl7.b(this.os, telemetry.os) && wl7.b(this.message, telemetry.message) && wl7.b(this.error, telemetry.error) && wl7.b(this.additionalProperties, telemetry.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final Device getDevice() {
            return this.device;
        }

        public final Error getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Os getOs() {
            return this.os;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            Device device = this.device;
            int iHashCode = (device == null ? 0 : device.hashCode()) * 31;
            Os os = this.os;
            int iD = akb.d((iHashCode + (os == null ? 0 : os.hashCode())) * 31, 31, this.message);
            Error error = this.error;
            return this.additionalProperties.hashCode() + ((iD + (error != null ? error.hashCode() : 0)) * 31);
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
            ab8Var.l("status", this.status);
            ab8Var.l("message", this.message);
            Error error = this.error;
            if (error != null) {
                ab8Var.i("error", error.toJson());
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
            Device device = this.device;
            Os os = this.os;
            String str = this.message;
            Error error = this.error;
            Map<String, Object> map = this.additionalProperties;
            StringBuilder sb = new StringBuilder("Telemetry(device=");
            sb.append(device);
            sb.append(", os=");
            sb.append(os);
            sb.append(", message=");
            sb.append(str);
            sb.append(", error=");
            sb.append(error);
            sb.append(", additionalProperties=");
            return b0.k(sb, map, ")");
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Telemetry;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ka8 ka8VarM3 = jsonObject.m("type");
                    String strG = ka8VarM3 != null ? ka8VarM3.g() : null;
                    String strG2 = jsonObject.m("status").g();
                    String strG3 = jsonObject.m("message").g();
                    ka8 ka8VarM4 = jsonObject.m("error");
                    Error errorFromJsonObject = ka8VarM4 != null ? Error.INSTANCE.fromJsonObject(ka8VarM4.d()) : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_rum_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    if (strG != null && !strG.equals("log")) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!wl7.b(strG2, "error")) {
                        throw new IllegalStateException("Check failed.");
                    }
                    strG3.getClass();
                    return new Telemetry(deviceFromJsonObject, osFromJsonObject, strG3, errorFromJsonObject, linkedHashMap);
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

        public Telemetry(Device device, Os os, String str, Error error, Map<String, Object> map) {
            str.getClass();
            map.getClass();
            this.device = device;
            this.os = os;
            this.message = str;
            this.error = error;
            this.additionalProperties = map;
            this.type = "log";
            this.status = "error";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$View;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TelemetryErrorEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type TelemetryErrorEvent", e);
                return null;
            }
        }

        public final TelemetryErrorEvent fromJsonObject(ab8 jsonObject) {
            TelemetryErrorEvent telemetryErrorEvent;
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
                    telemetryErrorEvent = null;
                    try {
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        Iterator<ka8> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(it.next().g());
                        }
                        arrayList = arrayList3;
                    } catch (IllegalStateException e) {
                        e = e;
                        g7.n("Unable to parse json into type TelemetryErrorEvent", e);
                        return telemetryErrorEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        g7.n("Unable to parse json into type TelemetryErrorEvent", e);
                        return telemetryErrorEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        g7.n("Unable to parse json into type TelemetryErrorEvent", e);
                        return telemetryErrorEvent;
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
                return new TelemetryErrorEvent(ddFromJsonObject, jE, strG2, sourceFromJson, strG4, applicationFromJsonObject, sessionFromJsonObject, viewFromJsonObject, actionFromJsonObject, numberF, arrayList, telemetryFromJsonObject);
            } catch (IllegalStateException e4) {
                e = e4;
                telemetryErrorEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                telemetryErrorEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                telemetryErrorEvent = null;
            }
        }

        private Companion() {
        }
    }

    public TelemetryErrorEvent(Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List<String> list, Telemetry telemetry) {
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
