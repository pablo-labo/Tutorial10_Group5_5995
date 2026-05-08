package com.datadog.android.telemetry.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.gson.JsonParseException;
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
import defpackage.z92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u0000 X2\u00020\u0001:\fYZX[\\]^_`abcB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u009a\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b7\u0010#J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010%R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bG\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u00100R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u00102R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bU\u00104R\u001a\u0010V\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010#¨\u0006d"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;", "dd", "", LogAttributes.DATE, "", "service", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "source", "version", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "application", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "session", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "view", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", RumEventDeserializer.EVENT_TYPE_ACTION, "", "effectiveSampleRate", "", "experimentalFeatures", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "telemetry", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "component5", "component6", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "component7", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "component8", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "component9", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", "component10", "()Ljava/lang/Number;", "component11", "()Ljava/util/List;", "component12", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;JLjava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;Ljava/lang/String;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;Ljava/lang/Number;Ljava/util/List;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;", "getDd", "J", "getDate", "Ljava/lang/String;", "getService", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "getSource", "getVersion", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "getApplication", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "getSession", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "getView", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", "getAction", "Ljava/lang/Number;", "getEffectiveSampleRate", "Ljava/util/List;", "getExperimentalFeatures", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "getTelemetry", "type", "getType", "Companion", "Action", "Application", "Dd", "Device", "Os", "Session", "Source", "Telemetry", "TrackingConsent", "Usage", "View", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class TelemetryUsageEvent {

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

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u000f\b\t\n\u000b\f\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u000e\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "Companion", "AddAction", "AddDurationVital", "AddError", "AddFeatureFlagEvaluation", "AddViewLoadingTime", "SetAccount", "SetGlobalContext", "SetTrackingConsent", "SetUser", "StartDurationVital", "StartSessionReplayRecording", "StartView", "StopDurationVital", "StopSession", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddAction;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddDurationVital;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddError;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddFeatureFlagEvaluation;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddViewLoadingTime;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetAccount;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetGlobalContext;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetTrackingConsent;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetUser;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartDurationVital;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartSessionReplayRecording;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartView;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopDurationVital;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static abstract class Usage {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ Usage(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Usage fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Usage fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public abstract ka8 toJson();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddAction;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class AddAction extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public AddAction() {
                super(null);
                this.feature = "add-action";
            }

            public static final AddAction fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final AddAction fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddAction$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddAction;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddAction;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddAction;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final AddAction fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddAction", e);
                        return null;
                    }
                }

                public final AddAction fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "add-action")) {
                            return new AddAction();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddAction", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type AddAction", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type AddAction", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddDurationVital;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class AddDurationVital extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public AddDurationVital() {
                super(null);
                this.feature = "add-duration-vital";
            }

            public static final AddDurationVital fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final AddDurationVital fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddDurationVital$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddDurationVital;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddDurationVital;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddDurationVital;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final AddDurationVital fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddDurationVital", e);
                        return null;
                    }
                }

                public final AddDurationVital fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "add-duration-vital")) {
                            return new AddDurationVital();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddDurationVital", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type AddDurationVital", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type AddDurationVital", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddError;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class AddError extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public AddError() {
                super(null);
                this.feature = "add-error";
            }

            public static final AddError fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final AddError fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddError$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddError;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddError;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddError;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final AddError fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddError", e);
                        return null;
                    }
                }

                public final AddError fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "add-error")) {
                            return new AddError();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddError", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type AddError", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type AddError", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddFeatureFlagEvaluation;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class AddFeatureFlagEvaluation extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public AddFeatureFlagEvaluation() {
                super(null);
                this.feature = "add-feature-flag-evaluation";
            }

            public static final AddFeatureFlagEvaluation fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final AddFeatureFlagEvaluation fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddFeatureFlagEvaluation$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddFeatureFlagEvaluation;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddFeatureFlagEvaluation;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddFeatureFlagEvaluation;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final AddFeatureFlagEvaluation fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddFeatureFlagEvaluation", e);
                        return null;
                    }
                }

                public final AddFeatureFlagEvaluation fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "add-feature-flag-evaluation")) {
                            return new AddFeatureFlagEvaluation();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddFeatureFlagEvaluation", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type AddFeatureFlagEvaluation", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type AddFeatureFlagEvaluation", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00118\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013¨\u0006#"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddViewLoadingTime;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "", "noView", "noActiveView", "overwritten", "<init>", "(ZZZ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddViewLoadingTime;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getNoView", "getNoActiveView", "getOverwritten", "feature", "Ljava/lang/String;", "getFeature", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final /* data */ class AddViewLoadingTime extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;
            private final boolean noActiveView;
            private final boolean noView;
            private final boolean overwritten;

            public AddViewLoadingTime(boolean z, boolean z2, boolean z3) {
                super(null);
                this.noView = z;
                this.noActiveView = z2;
                this.overwritten = z3;
                this.feature = "addViewLoadingTime";
            }

            public static /* synthetic */ AddViewLoadingTime copy$default(AddViewLoadingTime addViewLoadingTime, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = addViewLoadingTime.noView;
                }
                if ((i & 2) != 0) {
                    z2 = addViewLoadingTime.noActiveView;
                }
                if ((i & 4) != 0) {
                    z3 = addViewLoadingTime.overwritten;
                }
                return addViewLoadingTime.copy(z, z2, z3);
            }

            public static final AddViewLoadingTime fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final AddViewLoadingTime fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getNoView() {
                return this.noView;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getNoActiveView() {
                return this.noActiveView;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getOverwritten() {
                return this.overwritten;
            }

            public final AddViewLoadingTime copy(boolean noView, boolean noActiveView, boolean overwritten) {
                return new AddViewLoadingTime(noView, noActiveView, overwritten);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddViewLoadingTime)) {
                    return false;
                }
                AddViewLoadingTime addViewLoadingTime = (AddViewLoadingTime) other;
                return this.noView == addViewLoadingTime.noView && this.noActiveView == addViewLoadingTime.noActiveView && this.overwritten == addViewLoadingTime.overwritten;
            }

            public final String getFeature() {
                return this.feature;
            }

            public final boolean getNoActiveView() {
                return this.noActiveView;
            }

            public final boolean getNoView() {
                return this.noView;
            }

            public final boolean getOverwritten() {
                return this.overwritten;
            }

            public int hashCode() {
                return Boolean.hashCode(this.overwritten) + ia.f(Boolean.hashCode(this.noView) * 31, 31, this.noActiveView);
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                ab8Var.k("no_view", Boolean.valueOf(this.noView));
                ab8Var.k("no_active_view", Boolean.valueOf(this.noActiveView));
                ab8Var.k("overwritten", Boolean.valueOf(this.overwritten));
                return ab8Var;
            }

            public String toString() {
                boolean z = this.noView;
                boolean z2 = this.noActiveView;
                boolean z3 = this.overwritten;
                StringBuilder sb = new StringBuilder("AddViewLoadingTime(noView=");
                sb.append(z);
                sb.append(", noActiveView=");
                sb.append(z2);
                sb.append(", overwritten=");
                return z3.o(sb, z3, ")");
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddViewLoadingTime$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddViewLoadingTime;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddViewLoadingTime;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$AddViewLoadingTime;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final AddViewLoadingTime fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddViewLoadingTime", e);
                        return null;
                    }
                }

                public final AddViewLoadingTime fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        String strG = jsonObject.m("feature").g();
                        boolean zA = jsonObject.m("no_view").a();
                        boolean zA2 = jsonObject.m("no_active_view").a();
                        boolean zA3 = jsonObject.m("overwritten").a();
                        if (wl7.b(strG, "addViewLoadingTime")) {
                            return new AddViewLoadingTime(zA, zA2, zA3);
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type AddViewLoadingTime", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type AddViewLoadingTime", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type AddViewLoadingTime", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetAccount;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class SetAccount extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public SetAccount() {
                super(null);
                this.feature = "set-account";
            }

            public static final SetAccount fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final SetAccount fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetAccount$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetAccount;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetAccount;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetAccount;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SetAccount fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetAccount", e);
                        return null;
                    }
                }

                public final SetAccount fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "set-account")) {
                            return new SetAccount();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetAccount", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type SetAccount", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type SetAccount", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetGlobalContext;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class SetGlobalContext extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public SetGlobalContext() {
                super(null);
                this.feature = "set-global-context";
            }

            public static final SetGlobalContext fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final SetGlobalContext fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetGlobalContext$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetGlobalContext;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetGlobalContext;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetGlobalContext;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SetGlobalContext fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetGlobalContext", e);
                        return null;
                    }
                }

                public final SetGlobalContext fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "set-global-context")) {
                            return new SetGlobalContext();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetGlobalContext", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type SetGlobalContext", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type SetGlobalContext", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetTrackingConsent;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent;", "trackingConsent", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetTrackingConsent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent;", "getTrackingConsent", "feature", "Ljava/lang/String;", "getFeature", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final /* data */ class SetTrackingConsent extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;
            private final TrackingConsent trackingConsent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetTrackingConsent(TrackingConsent trackingConsent) {
                super(null);
                trackingConsent.getClass();
                this.trackingConsent = trackingConsent;
                this.feature = "set-tracking-consent";
            }

            public static /* synthetic */ SetTrackingConsent copy$default(SetTrackingConsent setTrackingConsent, TrackingConsent trackingConsent, int i, Object obj) {
                if ((i & 1) != 0) {
                    trackingConsent = setTrackingConsent.trackingConsent;
                }
                return setTrackingConsent.copy(trackingConsent);
            }

            public static final SetTrackingConsent fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final SetTrackingConsent fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final TrackingConsent getTrackingConsent() {
                return this.trackingConsent;
            }

            public final SetTrackingConsent copy(TrackingConsent trackingConsent) {
                trackingConsent.getClass();
                return new SetTrackingConsent(trackingConsent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetTrackingConsent) && this.trackingConsent == ((SetTrackingConsent) other).trackingConsent;
            }

            public final String getFeature() {
                return this.feature;
            }

            public final TrackingConsent getTrackingConsent() {
                return this.trackingConsent;
            }

            public int hashCode() {
                return this.trackingConsent.hashCode();
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                ab8Var.i("tracking_consent", this.trackingConsent.toJson());
                return ab8Var;
            }

            public String toString() {
                return "SetTrackingConsent(trackingConsent=" + this.trackingConsent + ")";
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetTrackingConsent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetTrackingConsent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetTrackingConsent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetTrackingConsent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SetTrackingConsent fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetTrackingConsent", e);
                        return null;
                    }
                }

                public final SetTrackingConsent fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        String strG = jsonObject.m("feature").g();
                        TrackingConsent.Companion companion = TrackingConsent.INSTANCE;
                        String strG2 = jsonObject.m("tracking_consent").g();
                        strG2.getClass();
                        TrackingConsent trackingConsentFromJson = companion.fromJson(strG2);
                        if (wl7.b(strG, "set-tracking-consent")) {
                            return new SetTrackingConsent(trackingConsentFromJson);
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetTrackingConsent", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type SetTrackingConsent", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type SetTrackingConsent", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetUser;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class SetUser extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public SetUser() {
                super(null);
                this.feature = "set-user";
            }

            public static final SetUser fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final SetUser fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetUser$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetUser;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetUser;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$SetUser;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SetUser fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetUser", e);
                        return null;
                    }
                }

                public final SetUser fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "set-user")) {
                            return new SetUser();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type SetUser", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type SetUser", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type SetUser", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartDurationVital;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class StartDurationVital extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public StartDurationVital() {
                super(null);
                this.feature = "start-duration-vital";
            }

            public static final StartDurationVital fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final StartDurationVital fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartDurationVital$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartDurationVital;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartDurationVital;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartDurationVital;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final StartDurationVital fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StartDurationVital", e);
                        return null;
                    }
                }

                public final StartDurationVital fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "start-duration-vital")) {
                            return new StartDurationVital();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StartDurationVital", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type StartDurationVital", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type StartDurationVital", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0018\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartSessionReplayRecording;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "", "isForced", "<init>", "(Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartSessionReplayRecording;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "feature", "Ljava/lang/String;", "getFeature", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final /* data */ class StartSessionReplayRecording extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;
            private final Boolean isForced;

            public StartSessionReplayRecording(Boolean bool) {
                super(null);
                this.isForced = bool;
                this.feature = "start-session-replay-recording";
            }

            public static /* synthetic */ StartSessionReplayRecording copy$default(StartSessionReplayRecording startSessionReplayRecording, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = startSessionReplayRecording.isForced;
                }
                return startSessionReplayRecording.copy(bool);
            }

            public static final StartSessionReplayRecording fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final StartSessionReplayRecording fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Boolean getIsForced() {
                return this.isForced;
            }

            public final StartSessionReplayRecording copy(Boolean isForced) {
                return new StartSessionReplayRecording(isForced);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartSessionReplayRecording) && wl7.b(this.isForced, ((StartSessionReplayRecording) other).isForced);
            }

            public final String getFeature() {
                return this.feature;
            }

            public int hashCode() {
                Boolean bool = this.isForced;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public final Boolean isForced() {
                return this.isForced;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                Boolean bool = this.isForced;
                if (bool != null) {
                    ab8Var.k("is_forced", bool);
                }
                return ab8Var;
            }

            public String toString() {
                return "StartSessionReplayRecording(isForced=" + this.isForced + ")";
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartSessionReplayRecording$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartSessionReplayRecording;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartSessionReplayRecording;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartSessionReplayRecording;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final StartSessionReplayRecording fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StartSessionReplayRecording", e);
                        return null;
                    }
                }

                public final StartSessionReplayRecording fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        String strG = jsonObject.m("feature").g();
                        ka8 ka8VarM = jsonObject.m("is_forced");
                        Boolean boolValueOf = ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null;
                        if (wl7.b(strG, "start-session-replay-recording")) {
                            return new StartSessionReplayRecording(boolValueOf);
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StartSessionReplayRecording", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type StartSessionReplayRecording", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type StartSessionReplayRecording", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }

            public /* synthetic */ StartSessionReplayRecording(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool);
            }

            public StartSessionReplayRecording() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartView;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class StartView extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public StartView() {
                super(null);
                this.feature = "start-view";
            }

            public static final StartView fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final StartView fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StartView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final StartView fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StartView", e);
                        return null;
                    }
                }

                public final StartView fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "start-view")) {
                            return new StartView();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StartView", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type StartView", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type StartView", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopDurationVital;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class StopDurationVital extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public StopDurationVital() {
                super(null);
                this.feature = "stop-duration-vital";
            }

            public static final StopDurationVital fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final StopDurationVital fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopDurationVital$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopDurationVital;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopDurationVital;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopDurationVital;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final StopDurationVital fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StopDurationVital", e);
                        return null;
                    }
                }

                public final StopDurationVital fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "stop-duration-vital")) {
                            return new StopDurationVital();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StopDurationVital", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type StopDurationVital", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type StopDurationVital", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopSession;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class StopSession extends Usage {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String feature;

            public StopSession() {
                super(null);
                this.feature = "stop-session";
            }

            public static final StopSession fromJson(String str) {
                return INSTANCE.fromJson(str);
            }

            public static final StopSession fromJsonObject(ab8 ab8Var) {
                return INSTANCE.fromJsonObject(ab8Var);
            }

            public final String getFeature() {
                return this.feature;
            }

            @Override // com.datadog.android.telemetry.model.TelemetryUsageEvent.Usage
            public ka8 toJson() {
                ab8 ab8Var = new ab8();
                ab8Var.l("feature", this.feature);
                return ab8Var;
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$StopSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final StopSession fromJson(String jsonString) {
                    jsonString.getClass();
                    try {
                        return fromJsonObject(hh2.A(jsonString).d());
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StopSession", e);
                        return null;
                    }
                }

                public final StopSession fromJsonObject(ab8 jsonObject) {
                    jsonObject.getClass();
                    try {
                        if (wl7.b(jsonObject.m("feature").g(), "stop-session")) {
                            return new StopSession();
                        }
                        throw new IllegalStateException("Check failed.");
                    } catch (IllegalStateException e) {
                        g7.n("Unable to parse json into type StopSession", e);
                        return null;
                    } catch (NullPointerException e2) {
                        g7.n("Unable to parse json into type StopSession", e2);
                        return null;
                    } catch (NumberFormatException e3) {
                        g7.n("Unable to parse json into type StopSession", e3);
                        return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usage fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into one of type Usage", e);
                    return null;
                }
            }

            public final Usage fromJsonObject(ab8 jsonObject) {
                SetTrackingConsent setTrackingConsentFromJsonObject;
                StopSession stopSessionFromJsonObject;
                StartView startViewFromJsonObject;
                AddAction addActionFromJsonObject;
                AddError addErrorFromJsonObject;
                SetGlobalContext setGlobalContextFromJsonObject;
                SetUser setUserFromJsonObject;
                SetAccount setAccountFromJsonObject;
                AddFeatureFlagEvaluation addFeatureFlagEvaluationFromJsonObject;
                StartSessionReplayRecording startSessionReplayRecordingFromJsonObject;
                StartDurationVital startDurationVitalFromJsonObject;
                StopDurationVital stopDurationVitalFromJsonObject;
                AddDurationVital addDurationVitalFromJsonObject;
                AddViewLoadingTime addViewLoadingTimeFromJsonObject;
                Usage usage;
                jsonObject.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    setTrackingConsentFromJsonObject = SetTrackingConsent.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e) {
                    arrayList.add(e);
                    setTrackingConsentFromJsonObject = null;
                }
                try {
                    stopSessionFromJsonObject = StopSession.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e2) {
                    arrayList.add(e2);
                    stopSessionFromJsonObject = null;
                }
                try {
                    startViewFromJsonObject = StartView.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e3) {
                    arrayList.add(e3);
                    startViewFromJsonObject = null;
                }
                try {
                    addActionFromJsonObject = AddAction.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e4) {
                    arrayList.add(e4);
                    addActionFromJsonObject = null;
                }
                try {
                    addErrorFromJsonObject = AddError.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e5) {
                    arrayList.add(e5);
                    addErrorFromJsonObject = null;
                }
                try {
                    setGlobalContextFromJsonObject = SetGlobalContext.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e6) {
                    arrayList.add(e6);
                    setGlobalContextFromJsonObject = null;
                }
                try {
                    setUserFromJsonObject = SetUser.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e7) {
                    arrayList.add(e7);
                    setUserFromJsonObject = null;
                }
                try {
                    setAccountFromJsonObject = SetAccount.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e8) {
                    arrayList.add(e8);
                    setAccountFromJsonObject = null;
                }
                try {
                    addFeatureFlagEvaluationFromJsonObject = AddFeatureFlagEvaluation.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e9) {
                    arrayList.add(e9);
                    addFeatureFlagEvaluationFromJsonObject = null;
                }
                try {
                    startSessionReplayRecordingFromJsonObject = StartSessionReplayRecording.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e10) {
                    arrayList.add(e10);
                    startSessionReplayRecordingFromJsonObject = null;
                }
                try {
                    startDurationVitalFromJsonObject = StartDurationVital.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e11) {
                    arrayList.add(e11);
                    startDurationVitalFromJsonObject = null;
                }
                try {
                    stopDurationVitalFromJsonObject = StopDurationVital.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e12) {
                    arrayList.add(e12);
                    stopDurationVitalFromJsonObject = null;
                }
                try {
                    addDurationVitalFromJsonObject = AddDurationVital.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e13) {
                    arrayList.add(e13);
                    addDurationVitalFromJsonObject = null;
                }
                try {
                    addViewLoadingTimeFromJsonObject = AddViewLoadingTime.INSTANCE.fromJsonObject(jsonObject);
                } catch (JsonParseException e14) {
                    arrayList.add(e14);
                    addViewLoadingTimeFromJsonObject = null;
                }
                Usage[] usageArr = {setTrackingConsentFromJsonObject, stopSessionFromJsonObject, startViewFromJsonObject, addActionFromJsonObject, addErrorFromJsonObject, setGlobalContextFromJsonObject, setUserFromJsonObject, setAccountFromJsonObject, addFeatureFlagEvaluationFromJsonObject, startSessionReplayRecordingFromJsonObject, startDurationVitalFromJsonObject, stopDurationVitalFromJsonObject, addDurationVitalFromJsonObject, addViewLoadingTimeFromJsonObject};
                int i = 0;
                while (true) {
                    if (i >= 14) {
                        usage = null;
                        break;
                    }
                    Usage usage2 = usageArr[i];
                    if (usage2 != null) {
                        usage = usage2;
                        break;
                    }
                    i++;
                }
                if (usage != null) {
                    return usage;
                }
                throw new JsonParseException("Unable to parse json into one of type \nUsage\n".concat(z92.W0(arrayList, "\n", null, null, TelemetryUsageEvent$Usage$Companion$fromJsonObject$message$1.INSTANCE, 30)));
            }

            private Companion() {
            }
        }

        private Usage() {
        }
    }

    public /* synthetic */ TelemetryUsageEvent(Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List list, Telemetry telemetry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dd, j, str, source, str2, (i & 32) != 0 ? null : application, (i & 64) != 0 ? null : session, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : view, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : action, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : number, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : list, telemetry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TelemetryUsageEvent copy$default(TelemetryUsageEvent telemetryUsageEvent, Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List list, Telemetry telemetry, int i, Object obj) {
        if ((i & 1) != 0) {
            dd = telemetryUsageEvent.dd;
        }
        return telemetryUsageEvent.copy(dd, (i & 2) != 0 ? telemetryUsageEvent.date : j, (i & 4) != 0 ? telemetryUsageEvent.service : str, (i & 8) != 0 ? telemetryUsageEvent.source : source, (i & 16) != 0 ? telemetryUsageEvent.version : str2, (i & 32) != 0 ? telemetryUsageEvent.application : application, (i & 64) != 0 ? telemetryUsageEvent.session : session, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? telemetryUsageEvent.view : view, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? telemetryUsageEvent.action : action, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? telemetryUsageEvent.effectiveSampleRate : number, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? telemetryUsageEvent.experimentalFeatures : list, (i & 2048) != 0 ? telemetryUsageEvent.telemetry : telemetry);
    }

    public static final TelemetryUsageEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final TelemetryUsageEvent fromJsonObject(ab8 ab8Var) {
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

    public final TelemetryUsageEvent copy(Dd dd, long date, String service, Source source, String version, Application application, Session session, View view, Action action, Number effectiveSampleRate, List<String> experimentalFeatures, Telemetry telemetry) {
        dd.getClass();
        service.getClass();
        source.getClass();
        version.getClass();
        telemetry.getClass();
        return new TelemetryUsageEvent(dd, date, service, source, version, application, session, view, action, effectiveSampleRate, experimentalFeatures, telemetry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryUsageEvent)) {
            return false;
        }
        TelemetryUsageEvent telemetryUsageEvent = (TelemetryUsageEvent) other;
        return wl7.b(this.dd, telemetryUsageEvent.dd) && this.date == telemetryUsageEvent.date && wl7.b(this.service, telemetryUsageEvent.service) && this.source == telemetryUsageEvent.source && wl7.b(this.version, telemetryUsageEvent.version) && wl7.b(this.application, telemetryUsageEvent.application) && wl7.b(this.session, telemetryUsageEvent.session) && wl7.b(this.view, telemetryUsageEvent.view) && wl7.b(this.action, telemetryUsageEvent.action) && wl7.b(this.effectiveSampleRate, telemetryUsageEvent.effectiveSampleRate) && wl7.b(this.experimentalFeatures, telemetryUsageEvent.experimentalFeatures) && wl7.b(this.telemetry, telemetryUsageEvent.telemetry);
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
        return "TelemetryUsageEvent(dd=" + this.dd + ", date=" + this.date + ", service=" + this.service + ", source=" + this.source + ", version=" + this.version + ", application=" + this.application + ", session=" + this.session + ", view=" + this.view + ", action=" + this.action + ", effectiveSampleRate=" + this.effectiveSampleRate + ", experimentalFeatures=" + this.experimentalFeatures + ", telemetry=" + this.telemetry + ")";
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Action;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;", "", "<init>", "()V", "Lka8;", "toJson", "()Lka8;", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "", "", "architecture", "brand", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArchitecture", "getBrand", "getModel", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "", "", "build", "name", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Session;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0015R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010+\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001b¨\u0006/"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "device", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "os", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "usage", "", "", "additionalProperties", "<init>", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "component2", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "component3", "()Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;Ljava/util/Map;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Device;", "getDevice", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Os;", "getOs", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Usage;", "getUsage", "Ljava/util/Map;", "getAdditionalProperties", "type", "Ljava/lang/String;", "getType", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Telemetry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"device", "os", "type", "usage"};
        private final Map<String, Object> additionalProperties;
        private final Device device;
        private final Os os;
        private final String type;
        private final Usage usage;

        public /* synthetic */ Telemetry(Device device, Os os, Usage usage, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : device, (i & 2) != 0 ? null : os, usage, (i & 8) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Telemetry copy$default(Telemetry telemetry, Device device, Os os, Usage usage, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                device = telemetry.device;
            }
            if ((i & 2) != 0) {
                os = telemetry.os;
            }
            if ((i & 4) != 0) {
                usage = telemetry.usage;
            }
            if ((i & 8) != 0) {
                map = telemetry.additionalProperties;
            }
            return telemetry.copy(device, os, usage, map);
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
        public final Usage getUsage() {
            return this.usage;
        }

        public final Map<String, Object> component4() {
            return this.additionalProperties;
        }

        public final Telemetry copy(Device device, Os os, Usage usage, Map<String, Object> additionalProperties) {
            usage.getClass();
            additionalProperties.getClass();
            return new Telemetry(device, os, usage, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Telemetry)) {
                return false;
            }
            Telemetry telemetry = (Telemetry) other;
            return wl7.b(this.device, telemetry.device) && wl7.b(this.os, telemetry.os) && wl7.b(this.usage, telemetry.usage) && wl7.b(this.additionalProperties, telemetry.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
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

        public final Usage getUsage() {
            return this.usage;
        }

        public int hashCode() {
            Device device = this.device;
            int iHashCode = (device == null ? 0 : device.hashCode()) * 31;
            Os os = this.os;
            return this.additionalProperties.hashCode() + ((this.usage.hashCode() + ((iHashCode + (os != null ? os.hashCode() : 0)) * 31)) * 31);
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
            ab8Var.i("usage", this.usage.toJson());
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
            return "Telemetry(device=" + this.device + ", os=" + this.os + ", usage=" + this.usage + ", additionalProperties=" + this.additionalProperties + ")";
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Telemetry;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    Usage usageFromJsonObject = Usage.INSTANCE.fromJsonObject(jsonObject.m("usage").d());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_rum_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    if (wl7.b(strG, "usage")) {
                        return new Telemetry(deviceFromJsonObject, osFromJsonObject, usageFromJsonObject, linkedHashMap);
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

        public Telemetry(Device device, Os os, Usage usage, Map<String, Object> map) {
            usage.getClass();
            map.getClass();
            this.device = device;
            this.os = os;
            this.usage = usage;
            this.additionalProperties = map;
            this.type = "usage";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "GRANTED", "NOT_GRANTED", "PENDING", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$TrackingConsent;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$View;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TelemetryUsageEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type TelemetryUsageEvent", e);
                return null;
            }
        }

        public final TelemetryUsageEvent fromJsonObject(ab8 jsonObject) {
            TelemetryUsageEvent telemetryUsageEvent;
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
                    telemetryUsageEvent = null;
                    try {
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        Iterator<ka8> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(it.next().g());
                        }
                        arrayList = arrayList3;
                    } catch (IllegalStateException e) {
                        e = e;
                        g7.n("Unable to parse json into type TelemetryUsageEvent", e);
                        return telemetryUsageEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        g7.n("Unable to parse json into type TelemetryUsageEvent", e);
                        return telemetryUsageEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        g7.n("Unable to parse json into type TelemetryUsageEvent", e);
                        return telemetryUsageEvent;
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
                return new TelemetryUsageEvent(ddFromJsonObject, jE, strG2, sourceFromJson, strG4, applicationFromJsonObject, sessionFromJsonObject, viewFromJsonObject, actionFromJsonObject, numberF, arrayList, telemetryFromJsonObject);
            } catch (IllegalStateException e4) {
                e = e4;
                telemetryUsageEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                telemetryUsageEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                telemetryUsageEvent = null;
            }
        }

        private Companion() {
        }
    }

    public TelemetryUsageEvent(Dd dd, long j, String str, Source source, String str2, Application application, Session session, View view, Action action, Number number, List<String> list, Telemetry telemetry) {
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
