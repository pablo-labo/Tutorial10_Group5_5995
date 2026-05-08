package com.datadog.android.rum.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.FeaturesContextResolver;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
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
import defpackage.q6;
import defpackage.r6;
import defpackage.s6;
import defpackage.u40;
import defpackage.ut0;
import defpackage.w40;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bU\b\u0086\b\u0018\u0000 \u0088\u00012\u00020\u0001:R\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0088\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00103J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020!HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020'HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0080\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'HÆ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bW\u00103J\u0010\u0010Y\u001a\u00020XHÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u001a\u0010]\u001a\u00020\\2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b]\u0010^R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010_\u001a\u0004\b`\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010a\u001a\u0004\bb\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010c\u001a\u0004\bd\u00103R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010c\u001a\u0004\be\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010c\u001a\u0004\bf\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010c\u001a\u0004\bg\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010h\u001a\u0004\bi\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010j\u001a\u0004\bk\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010l\u001a\u0004\bm\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010n\u001a\u0004\bo\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010p\u001a\u0004\bq\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010r\u001a\u0004\bs\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010t\u001a\u0004\bu\u0010DR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010v\u001a\u0004\bw\u0010FR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010x\u001a\u0004\by\u0010HR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010z\u001a\u0004\b{\u0010JR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010|\u001a\u0004\b}\u0010LR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010~\u001a\u0004\b\u007f\u0010NR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010PR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010RR\u0019\u0010(\u001a\u00020'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010TR\u001d\u0010\u0086\u0001\u001a\u00020\u00068\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010c\u001a\u0005\b\u0087\u0001\u00103¨\u0006±\u0001"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent;", "", "", LogAttributes.DATE, "Lcom/datadog/android/rum/model/ActionEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "session", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "source", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "view", "Lcom/datadog/android/rum/model/ActionEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/ActionEvent$Account;", "account", "Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/ActionEvent$Display;", "display", "Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/ActionEvent$Os;", "os", "Lcom/datadog/android/rum/model/ActionEvent$Device;", "device", "Lcom/datadog/android/rum/model/ActionEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/ActionEvent$Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/rum/model/ActionEvent$Container;", "container", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", RumEventDeserializer.EVENT_TYPE_ACTION, "<init>", "(JLcom/datadog/android/rum/model/ActionEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;Lcom/datadog/android/rum/model/ActionEvent$Usr;Lcom/datadog/android/rum/model/ActionEvent$Account;Lcom/datadog/android/rum/model/ActionEvent$Connectivity;Lcom/datadog/android/rum/model/ActionEvent$Display;Lcom/datadog/android/rum/model/ActionEvent$Synthetics;Lcom/datadog/android/rum/model/ActionEvent$CiTest;Lcom/datadog/android/rum/model/ActionEvent$Os;Lcom/datadog/android/rum/model/ActionEvent$Device;Lcom/datadog/android/rum/model/ActionEvent$Dd;Lcom/datadog/android/rum/model/ActionEvent$Context;Lcom/datadog/android/rum/model/ActionEvent$Container;Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "()Lcom/datadog/android/rum/model/ActionEvent$Application;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "component8", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "component9", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "component10", "()Lcom/datadog/android/rum/model/ActionEvent$Usr;", "component11", "()Lcom/datadog/android/rum/model/ActionEvent$Account;", "component12", "()Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "component13", "()Lcom/datadog/android/rum/model/ActionEvent$Display;", "component14", "()Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "component15", "()Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "component16", "()Lcom/datadog/android/rum/model/ActionEvent$Os;", "component17", "()Lcom/datadog/android/rum/model/ActionEvent$Device;", "component18", "()Lcom/datadog/android/rum/model/ActionEvent$Dd;", "component19", "()Lcom/datadog/android/rum/model/ActionEvent$Context;", "component20", "()Lcom/datadog/android/rum/model/ActionEvent$Container;", "component21", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", "copy", "(JLcom/datadog/android/rum/model/ActionEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;Lcom/datadog/android/rum/model/ActionEvent$Usr;Lcom/datadog/android/rum/model/ActionEvent$Account;Lcom/datadog/android/rum/model/ActionEvent$Connectivity;Lcom/datadog/android/rum/model/ActionEvent$Display;Lcom/datadog/android/rum/model/ActionEvent$Synthetics;Lcom/datadog/android/rum/model/ActionEvent$CiTest;Lcom/datadog/android/rum/model/ActionEvent$Os;Lcom/datadog/android/rum/model/ActionEvent$Device;Lcom/datadog/android/rum/model/ActionEvent$Dd;Lcom/datadog/android/rum/model/ActionEvent$Context;Lcom/datadog/android/rum/model/ActionEvent$Container;Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;)Lcom/datadog/android/rum/model/ActionEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDate", "Lcom/datadog/android/rum/model/ActionEvent$Application;", "getApplication", "Ljava/lang/String;", "getService", "getVersion", "getBuildVersion", "getBuildId", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "getSession", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "getSource", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "getView", "Lcom/datadog/android/rum/model/ActionEvent$Usr;", "getUsr", "Lcom/datadog/android/rum/model/ActionEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/ActionEvent$Display;", "getDisplay", "Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "getSynthetics", "Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/ActionEvent$Os;", "getOs", "Lcom/datadog/android/rum/model/ActionEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/ActionEvent$Dd;", "getDd", "Lcom/datadog/android/rum/model/ActionEvent$Context;", "getContext", "Lcom/datadog/android/rum/model/ActionEvent$Container;", "getContainer", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", "getAction", "type", "getType", "Companion", "Account", "ActionEventAction", "ActionEventActionTarget", "ActionEventActionType", "ActionEventSession", "ActionEventSessionType", "ActionEventSource", "ActionEventView", "Application", "Cellular", "CiTest", "Configuration", "Connectivity", "Container", "ContainerView", "Context", "Crash", "Dd", "DdAction", "DdActionTarget", "DdSession", "Device", "DeviceType", "Display", "EffectiveType", "Error", "Frustration", "Interface", "LongTask", "NameSource", "Os", "Plan", "Position", "Resource", "SessionPrecondition", "Status", "Synthetics", "Type", "Usr", "Viewport", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ActionEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Account account;
    private final ActionEventAction action;
    private final Application application;
    private final String buildId;
    private final String buildVersion;
    private final CiTest ciTest;
    private final Connectivity connectivity;
    private final Container container;
    private final Context context;
    private final long date;
    private final Dd dd;
    private final Device device;
    private final Display display;
    private final Os os;
    private final String service;
    private final ActionEventSession session;
    private final ActionEventSource source;
    private final Synthetics synthetics;
    private final String type;
    private final Usr usr;
    private final String version;
    private final ActionEventView view;

    public /* synthetic */ ActionEvent(long j, Application application, String str, String str2, String str3, String str4, ActionEventSession actionEventSession, ActionEventSource actionEventSource, ActionEventView actionEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, ActionEventAction actionEventAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, actionEventSession, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : actionEventSource, actionEventView, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : usr, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : account, (i & 2048) != 0 ? null : connectivity, (i & 4096) != 0 ? null : display, (i & 8192) != 0 ? null : synthetics, (i & 16384) != 0 ? null : ciTest, (32768 & i) != 0 ? null : os, (65536 & i) != 0 ? null : device, dd, (262144 & i) != 0 ? null : context, (i & 524288) != 0 ? null : container, actionEventAction);
    }

    public static /* synthetic */ ActionEvent copy$default(ActionEvent actionEvent, long j, Application application, String str, String str2, String str3, String str4, ActionEventSession actionEventSession, ActionEventSource actionEventSource, ActionEventView actionEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, ActionEventAction actionEventAction, int i, Object obj) {
        ActionEventAction actionEventAction2;
        Container container2;
        long j2 = (i & 1) != 0 ? actionEvent.date : j;
        Application application2 = (i & 2) != 0 ? actionEvent.application : application;
        String str5 = (i & 4) != 0 ? actionEvent.service : str;
        String str6 = (i & 8) != 0 ? actionEvent.version : str2;
        String str7 = (i & 16) != 0 ? actionEvent.buildVersion : str3;
        String str8 = (i & 32) != 0 ? actionEvent.buildId : str4;
        ActionEventSession actionEventSession2 = (i & 64) != 0 ? actionEvent.session : actionEventSession;
        ActionEventSource actionEventSource2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? actionEvent.source : actionEventSource;
        ActionEventView actionEventView2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? actionEvent.view : actionEventView;
        Usr usr2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? actionEvent.usr : usr;
        Account account2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? actionEvent.account : account;
        Connectivity connectivity2 = (i & 2048) != 0 ? actionEvent.connectivity : connectivity;
        Display display2 = (i & 4096) != 0 ? actionEvent.display : display;
        long j3 = j2;
        Synthetics synthetics2 = (i & 8192) != 0 ? actionEvent.synthetics : synthetics;
        CiTest ciTest2 = (i & 16384) != 0 ? actionEvent.ciTest : ciTest;
        Os os2 = (i & 32768) != 0 ? actionEvent.os : os;
        Device device2 = (i & 65536) != 0 ? actionEvent.device : device;
        Dd dd2 = (i & 131072) != 0 ? actionEvent.dd : dd;
        Context context2 = (i & 262144) != 0 ? actionEvent.context : context;
        Container container3 = (i & 524288) != 0 ? actionEvent.container : container;
        if ((i & 1048576) != 0) {
            container2 = container3;
            actionEventAction2 = actionEvent.action;
        } else {
            actionEventAction2 = actionEventAction;
            container2 = container3;
        }
        return actionEvent.copy(j3, application2, str5, str6, str7, str8, actionEventSession2, actionEventSource2, actionEventView2, usr2, account2, connectivity2, display2, synthetics2, ciTest2, os2, device2, dd2, context2, container2, actionEventAction2);
    }

    public static final ActionEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final ActionEvent fromJsonObject(ab8 ab8Var) {
        return INSTANCE.fromJsonObject(ab8Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Usr getUsr() {
        return this.usr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Connectivity getConnectivity() {
        return this.connectivity;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Synthetics getSynthetics() {
        return this.synthetics;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final CiTest getCiTest() {
        return this.ciTest;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Os getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Device getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Dd getDd() {
        return this.dd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Application getApplication() {
        return this.application;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Container getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final ActionEventAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBuildVersion() {
        return this.buildVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBuildId() {
        return this.buildId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ActionEventSession getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ActionEventSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ActionEventView getView() {
        return this.view;
    }

    public final ActionEvent copy(long date, Application application, String service, String version, String buildVersion, String buildId, ActionEventSession session, ActionEventSource source, ActionEventView view, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, ActionEventAction action) {
        application.getClass();
        session.getClass();
        view.getClass();
        dd.getClass();
        action.getClass();
        return new ActionEvent(date, application, service, version, buildVersion, buildId, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, container, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionEvent)) {
            return false;
        }
        ActionEvent actionEvent = (ActionEvent) other;
        return this.date == actionEvent.date && wl7.b(this.application, actionEvent.application) && wl7.b(this.service, actionEvent.service) && wl7.b(this.version, actionEvent.version) && wl7.b(this.buildVersion, actionEvent.buildVersion) && wl7.b(this.buildId, actionEvent.buildId) && wl7.b(this.session, actionEvent.session) && this.source == actionEvent.source && wl7.b(this.view, actionEvent.view) && wl7.b(this.usr, actionEvent.usr) && wl7.b(this.account, actionEvent.account) && wl7.b(this.connectivity, actionEvent.connectivity) && wl7.b(this.display, actionEvent.display) && wl7.b(this.synthetics, actionEvent.synthetics) && wl7.b(this.ciTest, actionEvent.ciTest) && wl7.b(this.os, actionEvent.os) && wl7.b(this.device, actionEvent.device) && wl7.b(this.dd, actionEvent.dd) && wl7.b(this.context, actionEvent.context) && wl7.b(this.container, actionEvent.container) && wl7.b(this.action, actionEvent.action);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final ActionEventAction getAction() {
        return this.action;
    }

    public final Application getApplication() {
        return this.application;
    }

    public final String getBuildId() {
        return this.buildId;
    }

    public final String getBuildVersion() {
        return this.buildVersion;
    }

    public final CiTest getCiTest() {
        return this.ciTest;
    }

    public final Connectivity getConnectivity() {
        return this.connectivity;
    }

    public final Container getContainer() {
        return this.container;
    }

    public final Context getContext() {
        return this.context;
    }

    public final long getDate() {
        return this.date;
    }

    public final Dd getDd() {
        return this.dd;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final Display getDisplay() {
        return this.display;
    }

    public final Os getOs() {
        return this.os;
    }

    public final String getService() {
        return this.service;
    }

    public final ActionEventSession getSession() {
        return this.session;
    }

    public final ActionEventSource getSource() {
        return this.source;
    }

    public final Synthetics getSynthetics() {
        return this.synthetics;
    }

    public final String getType() {
        return this.type;
    }

    public final Usr getUsr() {
        return this.usr;
    }

    public final String getVersion() {
        return this.version;
    }

    public final ActionEventView getView() {
        return this.view;
    }

    public int hashCode() {
        int iHashCode = (this.application.hashCode() + (Long.hashCode(this.date) * 31)) * 31;
        String str = this.service;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buildVersion;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buildId;
        int iHashCode5 = (this.session.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        ActionEventSource actionEventSource = this.source;
        int iHashCode6 = (this.view.hashCode() + ((iHashCode5 + (actionEventSource == null ? 0 : actionEventSource.hashCode())) * 31)) * 31;
        Usr usr = this.usr;
        int iHashCode7 = (iHashCode6 + (usr == null ? 0 : usr.hashCode())) * 31;
        Account account = this.account;
        int iHashCode8 = (iHashCode7 + (account == null ? 0 : account.hashCode())) * 31;
        Connectivity connectivity = this.connectivity;
        int iHashCode9 = (iHashCode8 + (connectivity == null ? 0 : connectivity.hashCode())) * 31;
        Display display = this.display;
        int iHashCode10 = (iHashCode9 + (display == null ? 0 : display.hashCode())) * 31;
        Synthetics synthetics = this.synthetics;
        int iHashCode11 = (iHashCode10 + (synthetics == null ? 0 : synthetics.hashCode())) * 31;
        CiTest ciTest = this.ciTest;
        int iHashCode12 = (iHashCode11 + (ciTest == null ? 0 : ciTest.hashCode())) * 31;
        Os os = this.os;
        int iHashCode13 = (iHashCode12 + (os == null ? 0 : os.hashCode())) * 31;
        Device device = this.device;
        int iHashCode14 = (this.dd.hashCode() + ((iHashCode13 + (device == null ? 0 : device.hashCode())) * 31)) * 31;
        Context context = this.context;
        int iHashCode15 = (iHashCode14 + (context == null ? 0 : context.hashCode())) * 31;
        Container container = this.container;
        return this.action.hashCode() + ((iHashCode15 + (container != null ? container.hashCode() : 0)) * 31);
    }

    public final ka8 toJson() {
        ab8 ab8Var = new ab8();
        ab8Var.j(Long.valueOf(this.date), LogAttributes.DATE);
        ab8Var.i("application", this.application.toJson());
        String str = this.service;
        if (str != null) {
            ab8Var.l("service", str);
        }
        String str2 = this.version;
        if (str2 != null) {
            ab8Var.l("version", str2);
        }
        String str3 = this.buildVersion;
        if (str3 != null) {
            ab8Var.l("build_version", str3);
        }
        String str4 = this.buildId;
        if (str4 != null) {
            ab8Var.l("build_id", str4);
        }
        ab8Var.i("session", this.session.toJson());
        ActionEventSource actionEventSource = this.source;
        if (actionEventSource != null) {
            ab8Var.i("source", actionEventSource.toJson());
        }
        ab8Var.i("view", this.view.toJson());
        Usr usr = this.usr;
        if (usr != null) {
            ab8Var.i("usr", usr.toJson());
        }
        Account account = this.account;
        if (account != null) {
            ab8Var.i("account", account.toJson());
        }
        Connectivity connectivity = this.connectivity;
        if (connectivity != null) {
            ab8Var.i("connectivity", connectivity.toJson());
        }
        Display display = this.display;
        if (display != null) {
            ab8Var.i("display", display.toJson());
        }
        Synthetics synthetics = this.synthetics;
        if (synthetics != null) {
            ab8Var.i("synthetics", synthetics.toJson());
        }
        CiTest ciTest = this.ciTest;
        if (ciTest != null) {
            ab8Var.i("ci_test", ciTest.toJson());
        }
        Os os = this.os;
        if (os != null) {
            ab8Var.i("os", os.toJson());
        }
        Device device = this.device;
        if (device != null) {
            ab8Var.i("device", device.toJson());
        }
        ab8Var.i("_dd", this.dd.toJson());
        Context context = this.context;
        if (context != null) {
            ab8Var.i(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, context.toJson());
        }
        Container container = this.container;
        if (container != null) {
            ab8Var.i("container", container.toJson());
        }
        ab8Var.l("type", this.type);
        ab8Var.i(RumEventDeserializer.EVENT_TYPE_ACTION, this.action.toJson());
        return ab8Var;
    }

    public String toString() {
        long j = this.date;
        Application application = this.application;
        String str = this.service;
        String str2 = this.version;
        String str3 = this.buildVersion;
        String str4 = this.buildId;
        ActionEventSession actionEventSession = this.session;
        ActionEventSource actionEventSource = this.source;
        ActionEventView actionEventView = this.view;
        Usr usr = this.usr;
        Account account = this.account;
        Connectivity connectivity = this.connectivity;
        Display display = this.display;
        Synthetics synthetics = this.synthetics;
        CiTest ciTest = this.ciTest;
        Os os = this.os;
        Device device = this.device;
        Dd dd = this.dd;
        Context context = this.context;
        Container container = this.container;
        ActionEventAction actionEventAction = this.action;
        StringBuilder sb = new StringBuilder("ActionEvent(date=");
        sb.append(j);
        sb.append(", application=");
        sb.append(application);
        ia.r(sb, ", service=", str, ", version=", str2);
        ia.r(sb, ", buildVersion=", str3, ", buildId=", str4);
        sb.append(", session=");
        sb.append(actionEventSession);
        sb.append(", source=");
        sb.append(actionEventSource);
        sb.append(", view=");
        sb.append(actionEventView);
        sb.append(", usr=");
        sb.append(usr);
        sb.append(", account=");
        sb.append(account);
        sb.append(", connectivity=");
        sb.append(connectivity);
        sb.append(", display=");
        sb.append(display);
        sb.append(", synthetics=");
        sb.append(synthetics);
        sb.append(", ciTest=");
        sb.append(ciTest);
        sb.append(", os=");
        sb.append(os);
        sb.append(", device=");
        sb.append(device);
        sb.append(", dd=");
        sb.append(dd);
        sb.append(", context=");
        sb.append(context);
        sb.append(", container=");
        sb.append(container);
        sb.append(", action=");
        sb.append(actionEventAction);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ActionEvent$Account;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Account {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"id", "name"};
        private final Map<String, Object> additionalProperties;
        private final String id;
        private final String name;

        public /* synthetic */ Account(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Account copy$default(Account account, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = account.id;
            }
            if ((i & 2) != 0) {
                str2 = account.name;
            }
            if ((i & 4) != 0) {
                map = account.additionalProperties;
            }
            return account.copy(str, str2, map);
        }

        public static final Account fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Account fromJsonObject(ab8 ab8Var) {
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

        public final Map<String, Object> component3() {
            return this.additionalProperties;
        }

        public final Account copy(String id, String name, Map<String, Object> additionalProperties) {
            id.getClass();
            additionalProperties.getClass();
            return new Account(id, name, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Account)) {
                return false;
            }
            Account account = (Account) other;
            return wl7.b(this.id, account.id) && wl7.b(this.name, account.name) && wl7.b(this.additionalProperties, account.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.name;
            return this.additionalProperties.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            String str = this.name;
            if (str != null) {
                ab8Var.l("name", str);
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
            return b0.k(u40.f("Account(id=", str, ", name=", str2, ", additionalProperties="), this.additionalProperties, ")");
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Account;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Account fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Account", e);
                    return null;
                }
            }

            public final Account fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    ka8 ka8VarM = jsonObject.m("name");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_rum_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    strG.getClass();
                    return new Account(strG, strG2, linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Account", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Account", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Account", e3);
                    return null;
                }
            }

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return Account.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        public Account(String str, String str2, Map<String, Object> map) {
            str.getClass();
            map.getClass();
            this.id = str;
            this.name = str2;
            this.additionalProperties = map;
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u0000 G2\u00020\u0001:\u0001GBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*Jz\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010*¨\u0006H"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", "", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "type", "", "id", "", "loadingTime", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "target", "Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "frustration", "Lcom/datadog/android/rum/model/ActionEvent$Error;", "error", "Lcom/datadog/android/rum/model/ActionEvent$Crash;", "crash", "Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "longTask", "Lcom/datadog/android/rum/model/ActionEvent$Resource;", RumEventDeserializer.EVENT_TYPE_RESOURCE, "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;Lcom/datadog/android/rum/model/ActionEvent$Frustration;Lcom/datadog/android/rum/model/ActionEvent$Error;Lcom/datadog/android/rum/model/ActionEvent$Crash;Lcom/datadog/android/rum/model/ActionEvent$LongTask;Lcom/datadog/android/rum/model/ActionEvent$Resource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "component5", "()Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "component6", "()Lcom/datadog/android/rum/model/ActionEvent$Error;", "component7", "()Lcom/datadog/android/rum/model/ActionEvent$Crash;", "component8", "()Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "component9", "()Lcom/datadog/android/rum/model/ActionEvent$Resource;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;Ljava/lang/String;Ljava/lang/Long;Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;Lcom/datadog/android/rum/model/ActionEvent$Frustration;Lcom/datadog/android/rum/model/ActionEvent$Error;Lcom/datadog/android/rum/model/ActionEvent$Crash;Lcom/datadog/android/rum/model/ActionEvent$LongTask;Lcom/datadog/android/rum/model/ActionEvent$Resource;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "getType", "Ljava/lang/String;", "getId", "Ljava/lang/Long;", "getLoadingTime", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "getTarget", "Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "getFrustration", "Lcom/datadog/android/rum/model/ActionEvent$Error;", "getError", "Lcom/datadog/android/rum/model/ActionEvent$Crash;", "getCrash", "Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "getLongTask", "Lcom/datadog/android/rum/model/ActionEvent$Resource;", "getResource", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ActionEventAction {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Crash crash;
        private final Error error;
        private final Frustration frustration;
        private final String id;
        private final Long loadingTime;
        private final LongTask longTask;
        private final Resource resource;
        private final ActionEventActionTarget target;
        private final ActionEventActionType type;

        public /* synthetic */ ActionEventAction(ActionEventActionType actionEventActionType, String str, Long l, ActionEventActionTarget actionEventActionTarget, Frustration frustration, Error error, Crash crash, LongTask longTask, Resource resource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(actionEventActionType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : actionEventActionTarget, (i & 16) != 0 ? null : frustration, (i & 32) != 0 ? null : error, (i & 64) != 0 ? null : crash, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : longTask, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : resource);
        }

        public static /* synthetic */ ActionEventAction copy$default(ActionEventAction actionEventAction, ActionEventActionType actionEventActionType, String str, Long l, ActionEventActionTarget actionEventActionTarget, Frustration frustration, Error error, Crash crash, LongTask longTask, Resource resource, int i, Object obj) {
            if ((i & 1) != 0) {
                actionEventActionType = actionEventAction.type;
            }
            if ((i & 2) != 0) {
                str = actionEventAction.id;
            }
            if ((i & 4) != 0) {
                l = actionEventAction.loadingTime;
            }
            if ((i & 8) != 0) {
                actionEventActionTarget = actionEventAction.target;
            }
            if ((i & 16) != 0) {
                frustration = actionEventAction.frustration;
            }
            if ((i & 32) != 0) {
                error = actionEventAction.error;
            }
            if ((i & 64) != 0) {
                crash = actionEventAction.crash;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                longTask = actionEventAction.longTask;
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                resource = actionEventAction.resource;
            }
            LongTask longTask2 = longTask;
            Resource resource2 = resource;
            Error error2 = error;
            Crash crash2 = crash;
            Frustration frustration2 = frustration;
            Long l2 = l;
            return actionEventAction.copy(actionEventActionType, str, l2, actionEventActionTarget, frustration2, error2, crash2, longTask2, resource2);
        }

        public static final ActionEventAction fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ActionEventAction fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ActionEventActionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getLoadingTime() {
            return this.loadingTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ActionEventActionTarget getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Frustration getFrustration() {
            return this.frustration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Error getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Crash getCrash() {
            return this.crash;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final LongTask getLongTask() {
            return this.longTask;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Resource getResource() {
            return this.resource;
        }

        public final ActionEventAction copy(ActionEventActionType type, String id, Long loadingTime, ActionEventActionTarget target, Frustration frustration, Error error, Crash crash, LongTask longTask, Resource resource) {
            type.getClass();
            return new ActionEventAction(type, id, loadingTime, target, frustration, error, crash, longTask, resource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionEventAction)) {
                return false;
            }
            ActionEventAction actionEventAction = (ActionEventAction) other;
            return this.type == actionEventAction.type && wl7.b(this.id, actionEventAction.id) && wl7.b(this.loadingTime, actionEventAction.loadingTime) && wl7.b(this.target, actionEventAction.target) && wl7.b(this.frustration, actionEventAction.frustration) && wl7.b(this.error, actionEventAction.error) && wl7.b(this.crash, actionEventAction.crash) && wl7.b(this.longTask, actionEventAction.longTask) && wl7.b(this.resource, actionEventAction.resource);
        }

        public final Crash getCrash() {
            return this.crash;
        }

        public final Error getError() {
            return this.error;
        }

        public final Frustration getFrustration() {
            return this.frustration;
        }

        public final String getId() {
            return this.id;
        }

        public final Long getLoadingTime() {
            return this.loadingTime;
        }

        public final LongTask getLongTask() {
            return this.longTask;
        }

        public final Resource getResource() {
            return this.resource;
        }

        public final ActionEventActionTarget getTarget() {
            return this.target;
        }

        public final ActionEventActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.id;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.loadingTime;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            ActionEventActionTarget actionEventActionTarget = this.target;
            int iHashCode4 = (iHashCode3 + (actionEventActionTarget == null ? 0 : actionEventActionTarget.hashCode())) * 31;
            Frustration frustration = this.frustration;
            int iHashCode5 = (iHashCode4 + (frustration == null ? 0 : frustration.hashCode())) * 31;
            Error error = this.error;
            int iHashCode6 = (iHashCode5 + (error == null ? 0 : error.hashCode())) * 31;
            Crash crash = this.crash;
            int iHashCode7 = (iHashCode6 + (crash == null ? 0 : crash.hashCode())) * 31;
            LongTask longTask = this.longTask;
            int iHashCode8 = (iHashCode7 + (longTask == null ? 0 : longTask.hashCode())) * 31;
            Resource resource = this.resource;
            return iHashCode8 + (resource != null ? resource.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("type", this.type.toJson());
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            Long l = this.loadingTime;
            if (l != null) {
                ia.o(l, ab8Var, "loading_time");
            }
            ActionEventActionTarget actionEventActionTarget = this.target;
            if (actionEventActionTarget != null) {
                ab8Var.i("target", actionEventActionTarget.toJson());
            }
            Frustration frustration = this.frustration;
            if (frustration != null) {
                ab8Var.i("frustration", frustration.toJson());
            }
            Error error = this.error;
            if (error != null) {
                ab8Var.i("error", error.toJson());
            }
            Crash crash = this.crash;
            if (crash != null) {
                ab8Var.i("crash", crash.toJson());
            }
            LongTask longTask = this.longTask;
            if (longTask != null) {
                ab8Var.i(RumEventDeserializer.EVENT_TYPE_LONG_TASK, longTask.toJson());
            }
            Resource resource = this.resource;
            if (resource != null) {
                ab8Var.i(RumEventDeserializer.EVENT_TYPE_RESOURCE, resource.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "ActionEventAction(type=" + this.type + ", id=" + this.id + ", loadingTime=" + this.loadingTime + ", target=" + this.target + ", frustration=" + this.frustration + ", error=" + this.error + ", crash=" + this.crash + ", longTask=" + this.longTask + ", resource=" + this.resource + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventAction;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActionEventAction fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventAction", e);
                    return null;
                }
            }

            public final ActionEventAction fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ActionEventActionType.Companion companion = ActionEventActionType.INSTANCE;
                    String strG = jsonObject.m("type").g();
                    strG.getClass();
                    ActionEventActionType actionEventActionTypeFromJson = companion.fromJson(strG);
                    ka8 ka8VarM = jsonObject.m("id");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("loading_time");
                    Long lValueOf = ka8VarM2 != null ? Long.valueOf(ka8VarM2.e()) : null;
                    ka8 ka8VarM3 = jsonObject.m("target");
                    ActionEventActionTarget actionEventActionTargetFromJsonObject = ka8VarM3 != null ? ActionEventActionTarget.INSTANCE.fromJsonObject(ka8VarM3.d()) : null;
                    ka8 ka8VarM4 = jsonObject.m("frustration");
                    Frustration frustrationFromJsonObject = ka8VarM4 != null ? Frustration.INSTANCE.fromJsonObject(ka8VarM4.d()) : null;
                    ka8 ka8VarM5 = jsonObject.m("error");
                    Error errorFromJsonObject = ka8VarM5 != null ? Error.INSTANCE.fromJsonObject(ka8VarM5.d()) : null;
                    ka8 ka8VarM6 = jsonObject.m("crash");
                    Crash crashFromJsonObject = ka8VarM6 != null ? Crash.INSTANCE.fromJsonObject(ka8VarM6.d()) : null;
                    ka8 ka8VarM7 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_LONG_TASK);
                    LongTask longTaskFromJsonObject = ka8VarM7 != null ? LongTask.INSTANCE.fromJsonObject(ka8VarM7.d()) : null;
                    ka8 ka8VarM8 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_RESOURCE);
                    return new ActionEventAction(actionEventActionTypeFromJson, strG2, lValueOf, actionEventActionTargetFromJsonObject, frustrationFromJsonObject, errorFromJsonObject, crashFromJsonObject, longTaskFromJsonObject, ka8VarM8 != null ? Resource.INSTANCE.fromJsonObject(ka8VarM8.d()) : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventAction", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ActionEventAction", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ActionEventAction", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public ActionEventAction(ActionEventActionType actionEventActionType, String str, Long l, ActionEventActionTarget actionEventActionTarget, Frustration frustration, Error error, Crash crash, LongTask longTask, Resource resource) {
            actionEventActionType.getClass();
            this.type = actionEventActionType;
            this.id = str;
            this.loadingTime = l;
            this.target = actionEventActionTarget;
            this.frustration = frustration;
            this.error = error;
            this.crash = crash;
            this.longTask = longTask;
            this.resource = resource;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "setName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ActionEventActionTarget {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String name;

        public ActionEventActionTarget(String str) {
            str.getClass();
            this.name = str;
        }

        public static /* synthetic */ ActionEventActionTarget copy$default(ActionEventActionTarget actionEventActionTarget, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionEventActionTarget.name;
            }
            return actionEventActionTarget.copy(str);
        }

        public static final ActionEventActionTarget fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ActionEventActionTarget fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final ActionEventActionTarget copy(String name) {
            name.getClass();
            return new ActionEventActionTarget(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionEventActionTarget) && wl7.b(this.name, ((ActionEventActionTarget) other).name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public final void setName(String str) {
            str.getClass();
            this.name = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("name", this.name);
            return ab8Var;
        }

        public String toString() {
            return l5.m("ActionEventActionTarget(name=", this.name, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionTarget;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActionEventActionTarget fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventActionTarget", e);
                    return null;
                }
            }

            public final ActionEventActionTarget fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("name").g();
                    strG.getClass();
                    return new ActionEventActionTarget(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventActionTarget", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ActionEventActionTarget", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ActionEventActionTarget", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CUSTOM", "CLICK", "TAP", "SCROLL", "SWIPE", "APPLICATION_START", "BACK", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ActionEventActionType {
        CUSTOM("custom"),
        CLICK("click"),
        TAP("tap"),
        SCROLL("scroll"),
        SWIPE("swipe"),
        APPLICATION_START("application_start"),
        BACK(WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ActionEventActionType(String str) {
            this.jsonValue = str;
        }

        public static final ActionEventActionType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActionEventActionType fromJson(String jsonString) {
                jsonString.getClass();
                for (ActionEventActionType actionEventActionType : ActionEventActionType.values()) {
                    if (wl7.b(actionEventActionType.jsonValue, jsonString)) {
                        return actionEventActionType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "type", "", "hasReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "getType", "Ljava/lang/Boolean;", "getHasReplay", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ActionEventSession {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean hasReplay;
        private final String id;
        private final ActionEventSessionType type;

        public ActionEventSession(String str, ActionEventSessionType actionEventSessionType, Boolean bool) {
            str.getClass();
            actionEventSessionType.getClass();
            this.id = str;
            this.type = actionEventSessionType;
            this.hasReplay = bool;
        }

        public static /* synthetic */ ActionEventSession copy$default(ActionEventSession actionEventSession, String str, ActionEventSessionType actionEventSessionType, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionEventSession.id;
            }
            if ((i & 2) != 0) {
                actionEventSessionType = actionEventSession.type;
            }
            if ((i & 4) != 0) {
                bool = actionEventSession.hasReplay;
            }
            return actionEventSession.copy(str, actionEventSessionType, bool);
        }

        public static final ActionEventSession fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ActionEventSession fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ActionEventSessionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final ActionEventSession copy(String id, ActionEventSessionType type, Boolean hasReplay) {
            id.getClass();
            type.getClass();
            return new ActionEventSession(id, type, hasReplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionEventSession)) {
                return false;
            }
            ActionEventSession actionEventSession = (ActionEventSession) other;
            return wl7.b(this.id, actionEventSession.id) && this.type == actionEventSession.type && wl7.b(this.hasReplay, actionEventSession.hasReplay);
        }

        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final String getId() {
            return this.id;
        }

        public final ActionEventSessionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
            Boolean bool = this.hasReplay;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            ab8Var.i("type", this.type.toJson());
            Boolean bool = this.hasReplay;
            if (bool != null) {
                ab8Var.k(FeaturesContextResolver.HAS_REPLAY_KEY, bool);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            ActionEventSessionType actionEventSessionType = this.type;
            Boolean bool = this.hasReplay;
            StringBuilder sb = new StringBuilder("ActionEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(actionEventSessionType);
            sb.append(", hasReplay=");
            return l5.n(sb, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActionEventSession fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventSession", e);
                    return null;
                }
            }

            public final ActionEventSession fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    ActionEventSessionType.Companion companion = ActionEventSessionType.INSTANCE;
                    String strG2 = jsonObject.m("type").g();
                    strG2.getClass();
                    ActionEventSessionType actionEventSessionTypeFromJson = companion.fromJson(strG2);
                    ka8 ka8VarM = jsonObject.m(FeaturesContextResolver.HAS_REPLAY_KEY);
                    Boolean boolValueOf = ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null;
                    strG.getClass();
                    return new ActionEventSession(strG, actionEventSessionTypeFromJson, boolValueOf);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventSession", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ActionEventSession", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ActionEventSession", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ ActionEventSession(String str, ActionEventSessionType actionEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, actionEventSessionType, (i & 4) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER", "SYNTHETICS", "CI_TEST", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ActionEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ActionEventSessionType(String str) {
            this.jsonValue = str;
        }

        public static final ActionEventSessionType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSessionType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActionEventSessionType fromJson(String jsonString) {
                jsonString.getClass();
                for (ActionEventSessionType actionEventSessionType : ActionEventSessionType.values()) {
                    if (wl7.b(actionEventSessionType.jsonValue, jsonString)) {
                        return actionEventSessionType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ActionEventSource {
        ANDROID(CoreFeature.DEFAULT_SOURCE_NAME),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        ROKU("roku"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ActionEventSource(String str) {
            this.jsonValue = str;
        }

        public static final ActionEventSource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActionEventSource fromJson(String jsonString) {
                jsonString.getClass();
                for (ActionEventSource actionEventSource : ActionEventSource.values()) {
                    if (wl7.b(actionEventSource.jsonValue, jsonString)) {
                        return actionEventSource;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014¨\u0006*"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "", "", "id", "referrer", "url", "name", "", "inForeground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getReferrer", "setReferrer", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getName", "setName", "Ljava/lang/Boolean;", "getInForeground", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ActionEventView {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final Boolean inForeground;
        private String name;
        private String referrer;
        private String url;

        public ActionEventView(String str, String str2, String str3, String str4, Boolean bool) {
            str.getClass();
            str3.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
            this.inForeground = bool;
        }

        public static /* synthetic */ ActionEventView copy$default(ActionEventView actionEventView, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionEventView.id;
            }
            if ((i & 2) != 0) {
                str2 = actionEventView.referrer;
            }
            if ((i & 4) != 0) {
                str3 = actionEventView.url;
            }
            if ((i & 8) != 0) {
                str4 = actionEventView.name;
            }
            if ((i & 16) != 0) {
                bool = actionEventView.inForeground;
            }
            Boolean bool2 = bool;
            String str5 = str3;
            return actionEventView.copy(str, str2, str5, str4, bool2);
        }

        public static final ActionEventView fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ActionEventView fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getInForeground() {
            return this.inForeground;
        }

        public final ActionEventView copy(String id, String referrer, String url, String name, Boolean inForeground) {
            id.getClass();
            url.getClass();
            return new ActionEventView(id, referrer, url, name, inForeground);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionEventView)) {
                return false;
            }
            ActionEventView actionEventView = (ActionEventView) other;
            return wl7.b(this.id, actionEventView.id) && wl7.b(this.referrer, actionEventView.referrer) && wl7.b(this.url, actionEventView.url) && wl7.b(this.name, actionEventView.name) && wl7.b(this.inForeground, actionEventView.inForeground);
        }

        public final String getId() {
            return this.id;
        }

        public final Boolean getInForeground() {
            return this.inForeground;
        }

        public final String getName() {
            return this.name;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.referrer;
            int iD = akb.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.url);
            String str2 = this.name;
            int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.inForeground;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setReferrer(String str) {
            this.referrer = str;
        }

        public final void setUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            String str = this.referrer;
            if (str != null) {
                ab8Var.l("referrer", str);
            }
            ab8Var.l("url", this.url);
            String str2 = this.name;
            if (str2 != null) {
                ab8Var.l("name", str2);
            }
            Boolean bool = this.inForeground;
            if (bool != null) {
                ab8Var.k("in_foreground", bool);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.referrer;
            String str3 = this.url;
            String str4 = this.name;
            Boolean bool = this.inForeground;
            StringBuilder sbF = u40.f("ActionEventView(id=", str, ", referrer=", str2, ", url=");
            ia.r(sbF, str3, ", name=", str4, ", inForeground=");
            return l5.n(sbF, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ActionEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$ActionEventView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ActionEventView fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventView", e);
                    return null;
                }
            }

            public final ActionEventView fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    ka8 ka8VarM = jsonObject.m("referrer");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    String strG3 = jsonObject.m("url").g();
                    ka8 ka8VarM2 = jsonObject.m("name");
                    String strG4 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("in_foreground");
                    Boolean boolValueOf = ka8VarM3 != null ? Boolean.valueOf(ka8VarM3.a()) : null;
                    strG.getClass();
                    strG3.getClass();
                    return new ActionEventView(strG, strG2, strG3, strG4, boolValueOf);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ActionEventView", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ActionEventView", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ActionEventView", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ ActionEventView(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTechnology", "getCarrierName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Cellular {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String carrierName;
        private final String technology;

        public /* synthetic */ Cellular(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Cellular copy$default(Cellular cellular, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cellular.technology;
            }
            if ((i & 2) != 0) {
                str2 = cellular.carrierName;
            }
            return cellular.copy(str, str2);
        }

        public static final Cellular fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Cellular fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTechnology() {
            return this.technology;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCarrierName() {
            return this.carrierName;
        }

        public final Cellular copy(String technology, String carrierName) {
            return new Cellular(technology, carrierName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cellular)) {
                return false;
            }
            Cellular cellular = (Cellular) other;
            return wl7.b(this.technology, cellular.technology) && wl7.b(this.carrierName, cellular.carrierName);
        }

        public final String getCarrierName() {
            return this.carrierName;
        }

        public final String getTechnology() {
            return this.technology;
        }

        public int hashCode() {
            String str = this.technology;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.carrierName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.technology;
            if (str != null) {
                ab8Var.l("technology", str);
            }
            String str2 = this.carrierName;
            if (str2 != null) {
                ab8Var.l("carrier_name", str2);
            }
            return ab8Var;
        }

        public String toString() {
            return akb.k("Cellular(technology=", this.technology, ", carrierName=", this.carrierName, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Cellular fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Cellular", e);
                    return null;
                }
            }

            public final Cellular fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("technology");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("carrier_name");
                    return new Cellular(strG, ka8VarM2 != null ? ka8VarM2.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Cellular", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Cellular", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Cellular", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Cellular(String str, String str2) {
            this.technology = str;
            this.carrierName = str2;
        }

        public Cellular() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestExecutionId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class CiTest {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String testExecutionId;

        public CiTest(String str) {
            str.getClass();
            this.testExecutionId = str;
        }

        public static /* synthetic */ CiTest copy$default(CiTest ciTest, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ciTest.testExecutionId;
            }
            return ciTest.copy(str);
        }

        public static final CiTest fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final CiTest fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTestExecutionId() {
            return this.testExecutionId;
        }

        public final CiTest copy(String testExecutionId) {
            testExecutionId.getClass();
            return new CiTest(testExecutionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CiTest) && wl7.b(this.testExecutionId, ((CiTest) other).testExecutionId);
        }

        public final String getTestExecutionId() {
            return this.testExecutionId;
        }

        public int hashCode() {
            return this.testExecutionId.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("test_execution_id", this.testExecutionId);
            return ab8Var;
        }

        public String toString() {
            return l5.m("CiTest(testExecutionId=", this.testExecutionId, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$CiTest;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CiTest fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type CiTest", e);
                    return null;
                }
            }

            public final CiTest fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("test_execution_id").g();
                    strG.getClass();
                    return new CiTest(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type CiTest", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type CiTest", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type CiTest", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getSessionSampleRate", "getSessionReplaySampleRate", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Configuration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Number sessionReplaySampleRate;
        private final Number sessionSampleRate;

        public Configuration(Number number, Number number2) {
            number.getClass();
            this.sessionSampleRate = number;
            this.sessionReplaySampleRate = number2;
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, Number number, Number number2, int i, Object obj) {
            if ((i & 1) != 0) {
                number = configuration.sessionSampleRate;
            }
            if ((i & 2) != 0) {
                number2 = configuration.sessionReplaySampleRate;
            }
            return configuration.copy(number, number2);
        }

        public static final Configuration fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Configuration fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Number getSessionSampleRate() {
            return this.sessionSampleRate;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Number getSessionReplaySampleRate() {
            return this.sessionReplaySampleRate;
        }

        public final Configuration copy(Number sessionSampleRate, Number sessionReplaySampleRate) {
            sessionSampleRate.getClass();
            return new Configuration(sessionSampleRate, sessionReplaySampleRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return wl7.b(this.sessionSampleRate, configuration.sessionSampleRate) && wl7.b(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate);
        }

        public final Number getSessionReplaySampleRate() {
            return this.sessionReplaySampleRate;
        }

        public final Number getSessionSampleRate() {
            return this.sessionSampleRate;
        }

        public int hashCode() {
            int iHashCode = this.sessionSampleRate.hashCode() * 31;
            Number number = this.sessionReplaySampleRate;
            return iHashCode + (number == null ? 0 : number.hashCode());
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(this.sessionSampleRate, "session_sample_rate");
            Number number = this.sessionReplaySampleRate;
            if (number != null) {
                ab8Var.j(number, TelemetryEventHandler.SESSION_REPLAY_SAMPLE_RATE_KEY);
            }
            return ab8Var;
        }

        public String toString() {
            return "Configuration(sessionSampleRate=" + this.sessionSampleRate + ", sessionReplaySampleRate=" + this.sessionReplaySampleRate + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                jsonObject.getClass();
                try {
                    Number numberF = jsonObject.m("session_sample_rate").f();
                    ka8 ka8VarM = jsonObject.m(TelemetryEventHandler.SESSION_REPLAY_SAMPLE_RATE_KEY);
                    Number numberF2 = ka8VarM != null ? ka8VarM.f() : null;
                    numberF.getClass();
                    return new Configuration(numberF, numberF2);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Configuration", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Configuration", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Configuration", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ Configuration(Number number, Number number2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006-"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/ActionEvent$Status;", "status", "", "Lcom/datadog/android/rum/model/ActionEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;Lcom/datadog/android/rum/model/ActionEvent$Cellular;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$Status;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;Lcom/datadog/android/rum/model/ActionEvent$Cellular;)Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$Status;", "getStatus", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "getEffectiveType", "Lcom/datadog/android/rum/model/ActionEvent$Cellular;", "getCellular", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Connectivity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Cellular cellular;
        private final EffectiveType effectiveType;
        private final List<Interface> interfaces;
        private final Status status;

        public /* synthetic */ Connectivity(Status status, List list, EffectiveType effectiveType, Cellular cellular, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : cellular);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Connectivity copy$default(Connectivity connectivity, Status status, List list, EffectiveType effectiveType, Cellular cellular, int i, Object obj) {
            if ((i & 1) != 0) {
                status = connectivity.status;
            }
            if ((i & 2) != 0) {
                list = connectivity.interfaces;
            }
            if ((i & 4) != 0) {
                effectiveType = connectivity.effectiveType;
            }
            if ((i & 8) != 0) {
                cellular = connectivity.cellular;
            }
            return connectivity.copy(status, list, effectiveType, cellular);
        }

        public static final Connectivity fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Connectivity fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        public final List<Interface> component2() {
            return this.interfaces;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Cellular getCellular() {
            return this.cellular;
        }

        public final Connectivity copy(Status status, List<? extends Interface> interfaces, EffectiveType effectiveType, Cellular cellular) {
            status.getClass();
            return new Connectivity(status, interfaces, effectiveType, cellular);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Connectivity)) {
                return false;
            }
            Connectivity connectivity = (Connectivity) other;
            return this.status == connectivity.status && wl7.b(this.interfaces, connectivity.interfaces) && this.effectiveType == connectivity.effectiveType && wl7.b(this.cellular, connectivity.cellular);
        }

        public final Cellular getCellular() {
            return this.cellular;
        }

        public final EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        public final List<Interface> getInterfaces() {
            return this.interfaces;
        }

        public final Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            List<Interface> list = this.interfaces;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            EffectiveType effectiveType = this.effectiveType;
            int iHashCode3 = (iHashCode2 + (effectiveType == null ? 0 : effectiveType.hashCode())) * 31;
            Cellular cellular = this.cellular;
            return iHashCode3 + (cellular != null ? cellular.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("status", this.status.toJson());
            List<Interface> list = this.interfaces;
            if (list != null) {
                w98 w98Var = new w98(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    w98Var.i(((Interface) it.next()).toJson());
                }
                ab8Var.i("interfaces", w98Var);
            }
            EffectiveType effectiveType = this.effectiveType;
            if (effectiveType != null) {
                ab8Var.i("effective_type", effectiveType.toJson());
            }
            Cellular cellular = this.cellular;
            if (cellular != null) {
                ab8Var.i("cellular", cellular.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Connectivity(status=" + this.status + ", interfaces=" + this.interfaces + ", effectiveType=" + this.effectiveType + ", cellular=" + this.cellular + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Connectivity fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Connectivity", e);
                    return null;
                }
            }

            public final Connectivity fromJsonObject(ab8 jsonObject) {
                ArrayList arrayList;
                String strG;
                jsonObject.getClass();
                try {
                    Status.Companion companion = Status.INSTANCE;
                    String strG2 = jsonObject.m("status").g();
                    strG2.getClass();
                    Status statusFromJson = companion.fromJson(strG2);
                    ka8 ka8VarM = jsonObject.m("interfaces");
                    if (ka8VarM != null) {
                        w98 w98VarC = ka8VarM.c();
                        arrayList = new ArrayList(w98VarC.a.size());
                        for (ka8 ka8Var : w98VarC) {
                            Interface.Companion companion2 = Interface.INSTANCE;
                            String strG3 = ka8Var.g();
                            strG3.getClass();
                            arrayList.add(companion2.fromJson(strG3));
                        }
                    } else {
                        arrayList = null;
                    }
                    ka8 ka8VarM2 = jsonObject.m("effective_type");
                    EffectiveType effectiveTypeFromJson = (ka8VarM2 == null || (strG = ka8VarM2.g()) == null) ? null : EffectiveType.INSTANCE.fromJson(strG);
                    ka8 ka8VarM3 = jsonObject.m("cellular");
                    return new Connectivity(statusFromJson, arrayList, effectiveTypeFromJson, ka8VarM3 != null ? Cellular.INSTANCE.fromJsonObject(ka8VarM3.d()) : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Connectivity", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Connectivity", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Connectivity", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Connectivity(Status status, List<? extends Interface> list, EffectiveType effectiveType, Cellular cellular) {
            status.getClass();
            this.status = status;
            this.interfaces = list;
            this.effectiveType = effectiveType;
            this.cellular = cellular;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Container;", "", "Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$ContainerView;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$ContainerView;Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;)Lcom/datadog/android/rum/model/ActionEvent$Container;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "getView", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "getSource", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Container {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionEventSource source;
        private final ContainerView view;

        public Container(ContainerView containerView, ActionEventSource actionEventSource) {
            containerView.getClass();
            actionEventSource.getClass();
            this.view = containerView;
            this.source = actionEventSource;
        }

        public static /* synthetic */ Container copy$default(Container container, ContainerView containerView, ActionEventSource actionEventSource, int i, Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                actionEventSource = container.source;
            }
            return container.copy(containerView, actionEventSource);
        }

        public static final Container fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Container fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ContainerView getView() {
            return this.view;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ActionEventSource getSource() {
            return this.source;
        }

        public final Container copy(ContainerView view, ActionEventSource source) {
            view.getClass();
            source.getClass();
            return new Container(view, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Container)) {
                return false;
            }
            Container container = (Container) other;
            return wl7.b(this.view, container.view) && this.source == container.source;
        }

        public final ActionEventSource getSource() {
            return this.source;
        }

        public final ContainerView getView() {
            return this.view;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.view.hashCode() * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("view", this.view.toJson());
            ab8Var.i("source", this.source.toJson());
            return ab8Var;
        }

        public String toString() {
            return "Container(view=" + this.view + ", source=" + this.source + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Container;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Container;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Container fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Container", e);
                    return null;
                }
            }

            public final Container fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ContainerView containerViewFromJsonObject = ContainerView.INSTANCE.fromJsonObject(jsonObject.m("view").d());
                    ActionEventSource.Companion companion = ActionEventSource.INSTANCE;
                    String strG = jsonObject.m("source").g();
                    strG.getClass();
                    return new Container(containerViewFromJsonObject, companion.fromJson(strG));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Container", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Container", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Container", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ContainerView {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;

        public ContainerView(String str) {
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ ContainerView copy$default(ContainerView containerView, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = containerView.id;
            }
            return containerView.copy(str);
        }

        public static final ContainerView fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ContainerView fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final ContainerView copy(String id) {
            id.getClass();
            return new ContainerView(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContainerView) && wl7.b(this.id, ((ContainerView) other).id);
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
            return l5.m("ContainerView(id=", this.id, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$ContainerView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ContainerView fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ContainerView", e);
                    return null;
                }
            }

            public final ContainerView fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    strG.getClass();
                    return new ContainerView(strG);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ContainerView", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ContainerView", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ContainerView", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ActionEvent$Context;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Context {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, Object> additionalProperties;

        public /* synthetic */ Context(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Context copy$default(Context context, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = context.additionalProperties;
            }
            return context.copy(map);
        }

        public static final Context fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Context fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public final Map<String, Object> component1() {
            return this.additionalProperties;
        }

        public final Context copy(Map<String, Object> additionalProperties) {
            additionalProperties.getClass();
            return new Context(additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Context) && wl7.b(this.additionalProperties, ((Context) other).additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            for (Map.Entry<String, Object> entry : this.additionalProperties.entrySet()) {
                ab8Var.i(entry.getKey(), JsonSerializer.INSTANCE.toJsonElement(entry.getValue()));
            }
            return ab8Var;
        }

        public String toString() {
            return "Context(additionalProperties=" + this.additionalProperties + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Context;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Context;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Context fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Context", e);
                    return null;
                }
            }

            public final Context fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        Object key = entry.getKey();
                        key.getClass();
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new Context(linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Context", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Context", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Context", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Context(Map<String, Object> map) {
            map.getClass();
            this.additionalProperties = map;
        }

        public Context() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Crash;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ActionEvent$Crash;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Crash {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long count;

        public Crash(long j) {
            this.count = j;
        }

        public static /* synthetic */ Crash copy$default(Crash crash, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = crash.count;
            }
            return crash.copy(j);
        }

        public static final Crash fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Crash fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        public final Crash copy(long count) {
            return new Crash(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Crash) && this.count == ((Crash) other).count;
        }

        public final long getCount() {
            return this.count;
        }

        public int hashCode() {
            return Long.hashCode(this.count);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.count), "count");
            return ab8Var;
        }

        public String toString() {
            return u40.c(this.count, "Crash(count=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Crash$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Crash;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Crash;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Crash;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Crash fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Crash", e);
                    return null;
                }
            }

            public final Crash fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Crash(jsonObject.m("count").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Crash", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Crash", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Crash", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016R\u001a\u0010*\u001a\u00020)8\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Dd;", "", "Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "configuration", "", "browserSdkVersion", "Lcom/datadog/android/rum/model/ActionEvent$DdAction;", RumEventDeserializer.EVENT_TYPE_ACTION, "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$DdSession;Lcom/datadog/android/rum/model/ActionEvent$Configuration;Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$DdAction;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/rum/model/ActionEvent$DdAction;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$DdSession;Lcom/datadog/android/rum/model/ActionEvent$Configuration;Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$DdAction;)Lcom/datadog/android/rum/model/ActionEvent$Dd;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "getSession", "Lcom/datadog/android/rum/model/ActionEvent$Configuration;", "getConfiguration", "Ljava/lang/String;", "getBrowserSdkVersion", "Lcom/datadog/android/rum/model/ActionEvent$DdAction;", "getAction", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DdAction action;
        private final String browserSdkVersion;
        private final Configuration configuration;
        private final long formatVersion;
        private final DdSession session;

        public /* synthetic */ Dd(DdSession ddSession, Configuration configuration, String str, DdAction ddAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : ddAction);
        }

        public static /* synthetic */ Dd copy$default(Dd dd, DdSession ddSession, Configuration configuration, String str, DdAction ddAction, int i, Object obj) {
            if ((i & 1) != 0) {
                ddSession = dd.session;
            }
            if ((i & 2) != 0) {
                configuration = dd.configuration;
            }
            if ((i & 4) != 0) {
                str = dd.browserSdkVersion;
            }
            if ((i & 8) != 0) {
                ddAction = dd.action;
            }
            return dd.copy(ddSession, configuration, str, ddAction);
        }

        public static final Dd fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Dd fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DdSession getSession() {
            return this.session;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Configuration getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final DdAction getAction() {
            return this.action;
        }

        public final Dd copy(DdSession session, Configuration configuration, String browserSdkVersion, DdAction action) {
            return new Dd(session, configuration, browserSdkVersion, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) other;
            return wl7.b(this.session, dd.session) && wl7.b(this.configuration, dd.configuration) && wl7.b(this.browserSdkVersion, dd.browserSdkVersion) && wl7.b(this.action, dd.action);
        }

        public final DdAction getAction() {
            return this.action;
        }

        public final String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final DdSession getSession() {
            return this.session;
        }

        public int hashCode() {
            DdSession ddSession = this.session;
            int iHashCode = (ddSession == null ? 0 : ddSession.hashCode()) * 31;
            Configuration configuration = this.configuration;
            int iHashCode2 = (iHashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            String str = this.browserSdkVersion;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            DdAction ddAction = this.action;
            return iHashCode3 + (ddAction != null ? ddAction.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.formatVersion), "format_version");
            DdSession ddSession = this.session;
            if (ddSession != null) {
                ab8Var.i("session", ddSession.toJson());
            }
            Configuration configuration = this.configuration;
            if (configuration != null) {
                ab8Var.i("configuration", configuration.toJson());
            }
            String str = this.browserSdkVersion;
            if (str != null) {
                ab8Var.l("browser_sdk_version", str);
            }
            DdAction ddAction = this.action;
            if (ddAction != null) {
                ab8Var.i(RumEventDeserializer.EVENT_TYPE_ACTION, ddAction.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Dd(session=" + this.session + ", configuration=" + this.configuration + ", browserSdkVersion=" + this.browserSdkVersion + ", action=" + this.action + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    long jE = jsonObject.m("format_version").e();
                    ka8 ka8VarM = jsonObject.m("session");
                    DdSession ddSessionFromJsonObject = ka8VarM != null ? DdSession.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                    ka8 ka8VarM2 = jsonObject.m("configuration");
                    Configuration configurationFromJsonObject = ka8VarM2 != null ? Configuration.INSTANCE.fromJsonObject(ka8VarM2.d()) : null;
                    ka8 ka8VarM3 = jsonObject.m("browser_sdk_version");
                    String strG = ka8VarM3 != null ? ka8VarM3.g() : null;
                    ka8 ka8VarM4 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_ACTION);
                    DdAction ddActionFromJsonObject = ka8VarM4 != null ? DdAction.INSTANCE.fromJsonObject(ka8VarM4.d()) : null;
                    if (jE == 2) {
                        return new Dd(ddSessionFromJsonObject, configurationFromJsonObject, strG, ddActionFromJsonObject);
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

        public Dd(DdSession ddSession, Configuration configuration, String str, DdAction ddAction) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.action = ddAction;
            this.formatVersion = 2L;
        }

        public Dd() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DdAction;", "", "Lcom/datadog/android/rum/model/ActionEvent$Position;", "position", "Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "target", "Lcom/datadog/android/rum/model/ActionEvent$NameSource;", "nameSource", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$Position;Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;Lcom/datadog/android/rum/model/ActionEvent$NameSource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$Position;", "component2", "()Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "component3", "()Lcom/datadog/android/rum/model/ActionEvent$NameSource;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$Position;Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;Lcom/datadog/android/rum/model/ActionEvent$NameSource;)Lcom/datadog/android/rum/model/ActionEvent$DdAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$Position;", "getPosition", "Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "getTarget", "Lcom/datadog/android/rum/model/ActionEvent$NameSource;", "getNameSource", "setNameSource", "(Lcom/datadog/android/rum/model/ActionEvent$NameSource;)V", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class DdAction {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private NameSource nameSource;
        private final Position position;
        private final DdActionTarget target;

        public /* synthetic */ DdAction(Position position, DdActionTarget ddActionTarget, NameSource nameSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : position, (i & 2) != 0 ? null : ddActionTarget, (i & 4) != 0 ? null : nameSource);
        }

        public static /* synthetic */ DdAction copy$default(DdAction ddAction, Position position, DdActionTarget ddActionTarget, NameSource nameSource, int i, Object obj) {
            if ((i & 1) != 0) {
                position = ddAction.position;
            }
            if ((i & 2) != 0) {
                ddActionTarget = ddAction.target;
            }
            if ((i & 4) != 0) {
                nameSource = ddAction.nameSource;
            }
            return ddAction.copy(position, ddActionTarget, nameSource);
        }

        public static final DdAction fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final DdAction fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DdActionTarget getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NameSource getNameSource() {
            return this.nameSource;
        }

        public final DdAction copy(Position position, DdActionTarget target, NameSource nameSource) {
            return new DdAction(position, target, nameSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DdAction)) {
                return false;
            }
            DdAction ddAction = (DdAction) other;
            return wl7.b(this.position, ddAction.position) && wl7.b(this.target, ddAction.target) && this.nameSource == ddAction.nameSource;
        }

        public final NameSource getNameSource() {
            return this.nameSource;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final DdActionTarget getTarget() {
            return this.target;
        }

        public int hashCode() {
            Position position = this.position;
            int iHashCode = (position == null ? 0 : position.hashCode()) * 31;
            DdActionTarget ddActionTarget = this.target;
            int iHashCode2 = (iHashCode + (ddActionTarget == null ? 0 : ddActionTarget.hashCode())) * 31;
            NameSource nameSource = this.nameSource;
            return iHashCode2 + (nameSource != null ? nameSource.hashCode() : 0);
        }

        public final void setNameSource(NameSource nameSource) {
            this.nameSource = nameSource;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Position position = this.position;
            if (position != null) {
                ab8Var.i("position", position.toJson());
            }
            DdActionTarget ddActionTarget = this.target;
            if (ddActionTarget != null) {
                ab8Var.i("target", ddActionTarget.toJson());
            }
            NameSource nameSource = this.nameSource;
            if (nameSource != null) {
                ab8Var.i("name_source", nameSource.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "DdAction(position=" + this.position + ", target=" + this.target + ", nameSource=" + this.nameSource + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DdAction$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$DdAction;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$DdAction;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$DdAction;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DdAction fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdAction", e);
                    return null;
                }
            }

            public final DdAction fromJsonObject(ab8 jsonObject) {
                String strG;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("position");
                    Position positionFromJsonObject = ka8VarM != null ? Position.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                    ka8 ka8VarM2 = jsonObject.m("target");
                    DdActionTarget ddActionTargetFromJsonObject = ka8VarM2 != null ? DdActionTarget.INSTANCE.fromJsonObject(ka8VarM2.d()) : null;
                    ka8 ka8VarM3 = jsonObject.m("name_source");
                    return new DdAction(positionFromJsonObject, ddActionTargetFromJsonObject, (ka8VarM3 == null || (strG = ka8VarM3.g()) == null) ? null : NameSource.INSTANCE.fromJson(strG));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdAction", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type DdAction", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type DdAction", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public DdAction(Position position, DdActionTarget ddActionTarget, NameSource nameSource) {
            this.position = position;
            this.target = ddActionTarget;
            this.nameSource = nameSource;
        }

        public DdAction() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ4\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000f¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "", "", "selector", "", "width", "height", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelector", "Ljava/lang/Long;", "getWidth", "getHeight", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class DdActionTarget {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long height;
        private final String selector;
        private final Long width;

        public /* synthetic */ DdActionTarget(String str, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
        }

        public static /* synthetic */ DdActionTarget copy$default(DdActionTarget ddActionTarget, String str, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ddActionTarget.selector;
            }
            if ((i & 2) != 0) {
                l = ddActionTarget.width;
            }
            if ((i & 4) != 0) {
                l2 = ddActionTarget.height;
            }
            return ddActionTarget.copy(str, l, l2);
        }

        public static final DdActionTarget fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final DdActionTarget fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSelector() {
            return this.selector;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getHeight() {
            return this.height;
        }

        public final DdActionTarget copy(String selector, Long width, Long height) {
            return new DdActionTarget(selector, width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DdActionTarget)) {
                return false;
            }
            DdActionTarget ddActionTarget = (DdActionTarget) other;
            return wl7.b(this.selector, ddActionTarget.selector) && wl7.b(this.width, ddActionTarget.width) && wl7.b(this.height, ddActionTarget.height);
        }

        public final Long getHeight() {
            return this.height;
        }

        public final String getSelector() {
            return this.selector;
        }

        public final Long getWidth() {
            return this.width;
        }

        public int hashCode() {
            String str = this.selector;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.width;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.height;
            return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.selector;
            if (str != null) {
                ab8Var.l("selector", str);
            }
            Long l = this.width;
            if (l != null) {
                ia.o(l, ab8Var, "width");
            }
            Long l2 = this.height;
            if (l2 != null) {
                ia.o(l2, ab8Var, "height");
            }
            return ab8Var;
        }

        public String toString() {
            return "DdActionTarget(selector=" + this.selector + ", width=" + this.width + ", height=" + this.height + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$DdActionTarget;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DdActionTarget fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdActionTarget", e);
                    return null;
                }
            }

            public final DdActionTarget fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("selector");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("width");
                    Long lValueOf = ka8VarM2 != null ? Long.valueOf(ka8VarM2.e()) : null;
                    ka8 ka8VarM3 = jsonObject.m("height");
                    return new DdActionTarget(strG, lValueOf, ka8VarM3 != null ? Long.valueOf(ka8VarM3.e()) : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdActionTarget", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type DdActionTarget", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type DdActionTarget", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public DdActionTarget(String str, Long l, Long l2) {
            this.selector = str;
            this.width = l;
            this.height = l2;
        }

        public DdActionTarget() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "", "Lcom/datadog/android/rum/model/ActionEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$Plan;Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$Plan;Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "getSessionPrecondition", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class DdSession {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Plan plan;
        private final SessionPrecondition sessionPrecondition;

        public /* synthetic */ DdSession(Plan plan, SessionPrecondition sessionPrecondition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : sessionPrecondition);
        }

        public static /* synthetic */ DdSession copy$default(DdSession ddSession, Plan plan, SessionPrecondition sessionPrecondition, int i, Object obj) {
            if ((i & 1) != 0) {
                plan = ddSession.plan;
            }
            if ((i & 2) != 0) {
                sessionPrecondition = ddSession.sessionPrecondition;
            }
            return ddSession.copy(plan, sessionPrecondition);
        }

        public static final DdSession fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final DdSession fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Plan getPlan() {
            return this.plan;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        public final DdSession copy(Plan plan, SessionPrecondition sessionPrecondition) {
            return new DdSession(plan, sessionPrecondition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DdSession)) {
                return false;
            }
            DdSession ddSession = (DdSession) other;
            return this.plan == ddSession.plan && this.sessionPrecondition == ddSession.sessionPrecondition;
        }

        public final Plan getPlan() {
            return this.plan;
        }

        public final SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        public int hashCode() {
            Plan plan = this.plan;
            int iHashCode = (plan == null ? 0 : plan.hashCode()) * 31;
            SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            return iHashCode + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Plan plan = this.plan;
            if (plan != null) {
                ab8Var.i("plan", plan.toJson());
            }
            SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            if (sessionPrecondition != null) {
                ab8Var.i("session_precondition", sessionPrecondition.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "DdSession(plan=" + this.plan + ", sessionPrecondition=" + this.sessionPrecondition + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$DdSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DdSession fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdSession", e);
                    return null;
                }
            }

            public final DdSession fromJsonObject(ab8 jsonObject) {
                String strG;
                String strG2;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("plan");
                    Plan planFromJson = (ka8VarM == null || (strG2 = ka8VarM.g()) == null) ? null : Plan.INSTANCE.fromJson(strG2);
                    ka8 ka8VarM2 = jsonObject.m("session_precondition");
                    return new DdSession(planFromJson, (ka8VarM2 == null || (strG = ka8VarM2.g()) == null) ? null : SessionPrecondition.INSTANCE.fromJson(strG));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdSession", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type DdSession", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type DdSession", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public DdSession(Plan plan, SessionPrecondition sessionPrecondition) {
            this.plan = plan;
            this.sessionPrecondition = sessionPrecondition;
        }

        public DdSession() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Device;", "", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "getType", "Ljava/lang/String;", "getName", "getModel", "getBrand", "getArchitecture", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Device {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String architecture;
        private final String brand;
        private final String model;
        private final String name;
        private final DeviceType type;

        public /* synthetic */ Device(DeviceType deviceType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public static /* synthetic */ Device copy$default(Device device, DeviceType deviceType, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceType = device.type;
            }
            if ((i & 2) != 0) {
                str = device.name;
            }
            if ((i & 4) != 0) {
                str2 = device.model;
            }
            if ((i & 8) != 0) {
                str3 = device.brand;
            }
            if ((i & 16) != 0) {
                str4 = device.architecture;
            }
            String str5 = str4;
            String str6 = str2;
            return device.copy(deviceType, str, str6, str3, str5);
        }

        public static final Device fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Device fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeviceType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getArchitecture() {
            return this.architecture;
        }

        public final Device copy(DeviceType type, String name, String model, String brand, String architecture) {
            type.getClass();
            return new Device(type, name, model, brand, architecture);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Device)) {
                return false;
            }
            Device device = (Device) other;
            return this.type == device.type && wl7.b(this.name, device.name) && wl7.b(this.model, device.model) && wl7.b(this.brand, device.brand) && wl7.b(this.architecture, device.architecture);
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

        public final String getName() {
            return this.name;
        }

        public final DeviceType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.brand;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.architecture;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("type", this.type.toJson());
            String str = this.name;
            if (str != null) {
                ab8Var.l("name", str);
            }
            String str2 = this.model;
            if (str2 != null) {
                ab8Var.l("model", str2);
            }
            String str3 = this.brand;
            if (str3 != null) {
                ab8Var.l("brand", str3);
            }
            String str4 = this.architecture;
            if (str4 != null) {
                ab8Var.l("architecture", str4);
            }
            return ab8Var;
        }

        public String toString() {
            DeviceType deviceType = this.type;
            String str = this.name;
            String str2 = this.model;
            String str3 = this.brand;
            String str4 = this.architecture;
            StringBuilder sb = new StringBuilder("Device(type=");
            sb.append(deviceType);
            sb.append(", name=");
            sb.append(str);
            sb.append(", model=");
            ia.r(sb, str2, ", brand=", str3, ", architecture=");
            return l6.i(sb, str4, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    DeviceType.Companion companion = DeviceType.INSTANCE;
                    String strG = jsonObject.m("type").g();
                    strG.getClass();
                    DeviceType deviceTypeFromJson = companion.fromJson(strG);
                    ka8 ka8VarM = jsonObject.m("name");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("model");
                    String strG3 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("brand");
                    String strG4 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    ka8 ka8VarM4 = jsonObject.m("architecture");
                    return new Device(deviceTypeFromJson, strG2, strG3, strG4, ka8VarM4 != null ? ka8VarM4.g() : null);
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

        public Device(DeviceType deviceType, String str, String str2, String str3, String str4) {
            deviceType.getClass();
            this.type = deviceType;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        DeviceType(String str) {
            this.jsonValue = str;
        }

        public static final DeviceType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$DeviceType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DeviceType fromJson(String jsonString) {
                jsonString.getClass();
                for (DeviceType deviceType : DeviceType.values()) {
                    if (wl7.b(deviceType.jsonValue, jsonString)) {
                        return deviceType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Display;", "", "Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "viewport", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$Viewport;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$Viewport;)Lcom/datadog/android/rum/model/ActionEvent$Display;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "getViewport", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Display {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Viewport viewport;

        public /* synthetic */ Display(Viewport viewport, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewport);
        }

        public static /* synthetic */ Display copy$default(Display display, Viewport viewport, int i, Object obj) {
            if ((i & 1) != 0) {
                viewport = display.viewport;
            }
            return display.copy(viewport);
        }

        public static final Display fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Display fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Viewport getViewport() {
            return this.viewport;
        }

        public final Display copy(Viewport viewport) {
            return new Display(viewport);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Display) && wl7.b(this.viewport, ((Display) other).viewport);
        }

        public final Viewport getViewport() {
            return this.viewport;
        }

        public int hashCode() {
            Viewport viewport = this.viewport;
            if (viewport == null) {
                return 0;
            }
            return viewport.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Viewport viewport = this.viewport;
            if (viewport != null) {
                ab8Var.i("viewport", viewport.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Display(viewport=" + this.viewport + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Display;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Display;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Display fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Display", e);
                    return null;
                }
            }

            public final Display fromJsonObject(ab8 jsonObject) {
                Viewport viewportFromJsonObject;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("viewport");
                    if (ka8VarM != null) {
                        viewportFromJsonObject = Viewport.INSTANCE.fromJsonObject(ka8VarM.d());
                    } else {
                        viewportFromJsonObject = null;
                    }
                    return new Display(viewportFromJsonObject);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Display", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Display", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Display", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Display(Viewport viewport) {
            this.viewport = viewport;
        }

        public Display() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "SLOW_2G", "2G", "3G", "4G", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        f02G("2g"),
        f13G("3g"),
        f24G("4g");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        EffectiveType(String str) {
            this.jsonValue = str;
        }

        public static final EffectiveType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$EffectiveType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$EffectiveType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EffectiveType fromJson(String jsonString) {
                jsonString.getClass();
                for (EffectiveType effectiveType : EffectiveType.values()) {
                    if (wl7.b(effectiveType.jsonValue, jsonString)) {
                        return effectiveType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Error;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ActionEvent$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Error {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long count;

        public Error(long j) {
            this.count = j;
        }

        public static /* synthetic */ Error copy$default(Error error, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = error.count;
            }
            return error.copy(j);
        }

        public static final Error fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Error fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        public final Error copy(long count) {
            return new Error(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && this.count == ((Error) other).count;
        }

        public final long getCount() {
            return this.count;
        }

        public int hashCode() {
            return Long.hashCode(this.count);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.count), "count");
            return ab8Var;
        }

        public String toString() {
            return u40.c(this.count, "Error(count=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Error;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Error;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    return new Error(jsonObject.m("count").e());
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
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "", "", "Lcom/datadog/android/rum/model/ActionEvent$Type;", "type", "<init>", "(Ljava/util/List;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getType", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Frustration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<Type> type;

        /* JADX WARN: Multi-variable type inference failed */
        public Frustration(List<? extends Type> list) {
            list.getClass();
            this.type = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Frustration copy$default(Frustration frustration, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = frustration.type;
            }
            return frustration.copy(list);
        }

        public static final Frustration fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Frustration fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public final List<Type> component1() {
            return this.type;
        }

        public final Frustration copy(List<? extends Type> type) {
            type.getClass();
            return new Frustration(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Frustration) && wl7.b(this.type, ((Frustration) other).type);
        }

        public final List<Type> getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            w98 w98Var = new w98(this.type.size());
            Iterator<T> it = this.type.iterator();
            while (it.hasNext()) {
                w98Var.i(((Type) it.next()).toJson());
            }
            ab8Var.i("type", w98Var);
            return ab8Var;
        }

        public String toString() {
            return g7.h("Frustration(type=", ")", this.type);
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Frustration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Frustration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Frustration fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Frustration", e);
                    return null;
                }
            }

            public final Frustration fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    w98 w98VarC = jsonObject.m("type").c();
                    ArrayList arrayList = new ArrayList(w98VarC.a.size());
                    for (ka8 ka8Var : w98VarC) {
                        Type.Companion companion = Type.INSTANCE;
                        String strG = ka8Var.g();
                        strG.getClass();
                        arrayList.add(companion.fromJson(strG));
                    }
                    return new Frustration(arrayList);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Frustration", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Frustration", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Frustration", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Interface;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Interface {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        MIXED("mixed"),
        OTHER("other"),
        UNKNOWN("unknown"),
        NONE("none");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }

        public static final Interface fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Interface$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$Interface;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Interface fromJson(String jsonString) {
                jsonString.getClass();
                for (Interface r2 : Interface.values()) {
                    if (wl7.b(r2.jsonValue, jsonString)) {
                        return r2;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class LongTask {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long count;

        public LongTask(long j) {
            this.count = j;
        }

        public static /* synthetic */ LongTask copy$default(LongTask longTask, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = longTask.count;
            }
            return longTask.copy(j);
        }

        public static final LongTask fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final LongTask fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        public final LongTask copy(long count) {
            return new LongTask(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LongTask) && this.count == ((LongTask) other).count;
        }

        public final long getCount() {
            return this.count;
        }

        public int hashCode() {
            return Long.hashCode(this.count);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.count), "count");
            return ab8Var;
        }

        public String toString() {
            return u40.c(this.count, "LongTask(count=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$LongTask$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$LongTask;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LongTask fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type LongTask", e);
                    return null;
                }
            }

            public final LongTask fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new LongTask(jsonObject.m("count").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type LongTask", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type LongTask", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type LongTask", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$NameSource;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CUSTOM_ATTRIBUTE", "MASK_PLACEHOLDER", "STANDARD_ATTRIBUTE", "TEXT_CONTENT", "MASK_DISALLOWED", "BLANK", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum NameSource {
        CUSTOM_ATTRIBUTE("custom_attribute"),
        MASK_PLACEHOLDER("mask_placeholder"),
        STANDARD_ATTRIBUTE("standard_attribute"),
        TEXT_CONTENT("text_content"),
        MASK_DISALLOWED("mask_disallowed"),
        BLANK("blank");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        NameSource(String str) {
            this.jsonValue = str;
        }

        public static final NameSource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$NameSource$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$NameSource;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NameSource fromJson(String jsonString) {
                jsonString.getClass();
                for (NameSource nameSource : NameSource.values()) {
                    if (wl7.b(nameSource.jsonValue, jsonString)) {
                        return nameSource;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "getBuild", "getVersionMajor", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Os {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String build;
        private final String name;
        private final String version;
        private final String versionMajor;

        public Os(String str, String str2, String str3, String str4) {
            q6.m(str, str2, str4);
            this.name = str;
            this.version = str2;
            this.build = str3;
            this.versionMajor = str4;
        }

        public static /* synthetic */ Os copy$default(Os os, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = os.name;
            }
            if ((i & 2) != 0) {
                str2 = os.version;
            }
            if ((i & 4) != 0) {
                str3 = os.build;
            }
            if ((i & 8) != 0) {
                str4 = os.versionMajor;
            }
            return os.copy(str, str2, str3, str4);
        }

        public static final Os fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Os fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBuild() {
            return this.build;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVersionMajor() {
            return this.versionMajor;
        }

        public final Os copy(String name, String version, String build, String versionMajor) {
            name.getClass();
            version.getClass();
            versionMajor.getClass();
            return new Os(name, version, build, versionMajor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Os)) {
                return false;
            }
            Os os = (Os) other;
            return wl7.b(this.name, os.name) && wl7.b(this.version, os.version) && wl7.b(this.build, os.build) && wl7.b(this.versionMajor, os.versionMajor);
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

        public final String getVersionMajor() {
            return this.versionMajor;
        }

        public int hashCode() {
            int iD = akb.d(this.name.hashCode() * 31, 31, this.version);
            String str = this.build;
            return this.versionMajor.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("name", this.name);
            ab8Var.l("version", this.version);
            String str = this.build;
            if (str != null) {
                ab8Var.l("build", str);
            }
            ab8Var.l("version_major", this.versionMajor);
            return ab8Var;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.version;
            return z3.n(u40.f("Os(name=", str, ", version=", str2, ", build="), this.build, ", versionMajor=", this.versionMajor, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    String strG = jsonObject.m("name").g();
                    String strG2 = jsonObject.m("version").g();
                    ka8 ka8VarM = jsonObject.m("build");
                    String strG3 = ka8VarM != null ? ka8VarM.g() : null;
                    String strG4 = jsonObject.m("version_major").g();
                    strG.getClass();
                    strG2.getClass();
                    strG4.getClass();
                    return new Os(strG, strG2, strG3, strG4);
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

        public /* synthetic */ Os(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Plan;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/Number;", "Companion", "PLAN_1", "PLAN_2", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Plan {
        PLAN_1(1),
        PLAN_2(2);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Number jsonValue;

        Plan(Number number) {
            this.jsonValue = number;
        }

        public static final Plan fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Plan$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$Plan;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Plan fromJson(String jsonString) {
                jsonString.getClass();
                for (Plan plan : Plan.values()) {
                    if (wl7.b(plan.jsonValue.toString(), jsonString)) {
                        return plan;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Position;", "", "", "x", "y", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ActionEvent$Position;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getX", "getY", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Position {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long x;
        private final long y;

        public Position(long j, long j2) {
            this.x = j;
            this.y = j2;
        }

        public static /* synthetic */ Position copy$default(Position position, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = position.x;
            }
            if ((i & 2) != 0) {
                j2 = position.y;
            }
            return position.copy(j, j2);
        }

        public static final Position fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Position fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getY() {
            return this.y;
        }

        public final Position copy(long x, long y) {
            return new Position(x, y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return this.x == position.x && this.y == position.y;
        }

        public final long getX() {
            return this.x;
        }

        public final long getY() {
            return this.y;
        }

        public int hashCode() {
            return Long.hashCode(this.y) + (Long.hashCode(this.x) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.x), "x");
            ab8Var.j(Long.valueOf(this.y), "y");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.y, ")", w40.i(this.x, "Position(x=", ", y="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Position$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Position;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Position;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Position;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Position fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Position", e);
                    return null;
                }
            }

            public final Position fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Position(jsonObject.m("x").e(), jsonObject.m("y").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Position", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Position", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Position", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Resource;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ActionEvent$Resource;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Resource {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long count;

        public Resource(long j) {
            this.count = j;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = resource.count;
            }
            return resource.copy(j);
        }

        public static final Resource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Resource fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        public final Resource copy(long count) {
            return new Resource(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Resource) && this.count == ((Resource) other).count;
        }

        public final long getCount() {
            return this.count;
        }

        public int hashCode() {
            return Long.hashCode(this.count);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.count), "count");
            return ab8Var;
        }

        public String toString() {
            return u40.c(this.count, "Resource(count=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Resource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Resource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Resource;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Resource;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Resource fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Resource", e);
                    return null;
                }
            }

            public final Resource fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Resource(jsonObject.m("count").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Resource", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Resource", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Resource", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SessionPrecondition {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION("max_duration"),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        SessionPrecondition(String str) {
            this.jsonValue = str;
        }

        public static final SessionPrecondition fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SessionPrecondition fromJson(String jsonString) {
                jsonString.getClass();
                for (SessionPrecondition sessionPrecondition : SessionPrecondition.values()) {
                    if (wl7.b(sessionPrecondition.jsonValue, jsonString)) {
                        return sessionPrecondition;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Status;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Status {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Status$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$Status;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "getResultId", "Ljava/lang/Boolean;", "getInjected", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Synthetics {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean injected;
        private final String resultId;
        private final String testId;

        public Synthetics(String str, String str2, Boolean bool) {
            str.getClass();
            str2.getClass();
            this.testId = str;
            this.resultId = str2;
            this.injected = bool;
        }

        public static /* synthetic */ Synthetics copy$default(Synthetics synthetics, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = synthetics.testId;
            }
            if ((i & 2) != 0) {
                str2 = synthetics.resultId;
            }
            if ((i & 4) != 0) {
                bool = synthetics.injected;
            }
            return synthetics.copy(str, str2, bool);
        }

        public static final Synthetics fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Synthetics fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
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
        public final Boolean getInjected() {
            return this.injected;
        }

        public final Synthetics copy(String testId, String resultId, Boolean injected) {
            testId.getClass();
            resultId.getClass();
            return new Synthetics(testId, resultId, injected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Synthetics)) {
                return false;
            }
            Synthetics synthetics = (Synthetics) other;
            return wl7.b(this.testId, synthetics.testId) && wl7.b(this.resultId, synthetics.resultId) && wl7.b(this.injected, synthetics.injected);
        }

        public final Boolean getInjected() {
            return this.injected;
        }

        public final String getResultId() {
            return this.resultId;
        }

        public final String getTestId() {
            return this.testId;
        }

        public int hashCode() {
            int iD = akb.d(this.testId.hashCode() * 31, 31, this.resultId);
            Boolean bool = this.injected;
            return iD + (bool == null ? 0 : bool.hashCode());
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("test_id", this.testId);
            ab8Var.l("result_id", this.resultId);
            Boolean bool = this.injected;
            if (bool != null) {
                ab8Var.k("injected", bool);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.testId;
            String str2 = this.resultId;
            return l5.n(u40.f("Synthetics(testId=", str, ", resultId=", str2, ", injected="), this.injected, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Synthetics;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Synthetics fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Synthetics", e);
                    return null;
                }
            }

            public final Synthetics fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("test_id").g();
                    String strG2 = jsonObject.m("result_id").g();
                    ka8 ka8VarM = jsonObject.m("injected");
                    Boolean boolValueOf = ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null;
                    strG.getClass();
                    strG2.getClass();
                    return new Synthetics(strG, strG2, boolValueOf);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Synthetics", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Synthetics", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Synthetics", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ Synthetics(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Type;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "RAGE_CLICK", "DEAD_CLICK", "ERROR_CLICK", "RAGE_TAP", "ERROR_TAP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Type {
        RAGE_CLICK("rage_click"),
        DEAD_CLICK("dead_click"),
        ERROR_CLICK("error_click"),
        RAGE_TAP("rage_tap"),
        ERROR_TAP("error_tap");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Type(String str) {
            this.jsonValue = str;
        }

        public static final Type fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Type$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ActionEvent$Type;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromJson(String jsonString) {
                jsonString.getClass();
                for (Type type : Type.values()) {
                    if (wl7.b(type.jsonValue, jsonString)) {
                        return type;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ActionEvent$Usr;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "getAnonymousId", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Usr {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String[] RESERVED_PROPERTIES = {"id", "name", "email", "anonymous_id"};
        private final Map<String, Object> additionalProperties;
        private final String anonymousId;
        private final String email;
        private final String id;
        private final String name;

        public /* synthetic */ Usr(String str, String str2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Usr copy$default(Usr usr, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
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
                str4 = usr.anonymousId;
            }
            if ((i & 16) != 0) {
                map = usr.additionalProperties;
            }
            Map map2 = map;
            String str5 = str3;
            return usr.copy(str, str2, str5, str4, map2);
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

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAnonymousId() {
            return this.anonymousId;
        }

        public final Map<String, Object> component5() {
            return this.additionalProperties;
        }

        public final Usr copy(String id, String name, String email, String anonymousId, Map<String, Object> additionalProperties) {
            additionalProperties.getClass();
            return new Usr(id, name, email, anonymousId, additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Usr)) {
                return false;
            }
            Usr usr = (Usr) other;
            return wl7.b(this.id, usr.id) && wl7.b(this.name, usr.name) && wl7.b(this.email, usr.email) && wl7.b(this.anonymousId, usr.anonymousId) && wl7.b(this.additionalProperties, usr.additionalProperties);
        }

        public final Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final String getAnonymousId() {
            return this.anonymousId;
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
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.anonymousId;
            return this.additionalProperties.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
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
            String str4 = this.anonymousId;
            if (str4 != null) {
                ab8Var.l("anonymous_id", str4);
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
            String str4 = this.anonymousId;
            Map<String, Object> map = this.additionalProperties;
            StringBuilder sbF = u40.f("Usr(id=", str, ", name=", str2, ", email=");
            ia.r(sbF, str3, ", anonymousId=", str4, ", additionalProperties=");
            return b0.k(sbF, map, ")");
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Usr;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ka8 ka8VarM4 = jsonObject.m("anonymous_id");
                    String strG4 = ka8VarM4 != null ? ka8VarM4.g() : null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_rum_release())) {
                            Object key = entry.getKey();
                            key.getClass();
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new Usr(strG, strG2, strG3, strG4, linkedHashMap);
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

            public final String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return Usr.RESERVED_PROPERTIES;
            }

            private Companion() {
            }
        }

        public Usr(String str, String str2, String str3, String str4, Map<String, Object> map) {
            map.getClass();
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.anonymousId = str4;
            this.additionalProperties = map;
        }

        public Usr() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getWidth", "getHeight", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Viewport {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Number height;
        private final Number width;

        public Viewport(Number number, Number number2) {
            number.getClass();
            number2.getClass();
            this.width = number;
            this.height = number2;
        }

        public static /* synthetic */ Viewport copy$default(Viewport viewport, Number number, Number number2, int i, Object obj) {
            if ((i & 1) != 0) {
                number = viewport.width;
            }
            if ((i & 2) != 0) {
                number2 = viewport.height;
            }
            return viewport.copy(number, number2);
        }

        public static final Viewport fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Viewport fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Number getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Number getHeight() {
            return this.height;
        }

        public final Viewport copy(Number width, Number height) {
            width.getClass();
            height.getClass();
            return new Viewport(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Viewport)) {
                return false;
            }
            Viewport viewport = (Viewport) other;
            return wl7.b(this.width, viewport.width) && wl7.b(this.height, viewport.height);
        }

        public final Number getHeight() {
            return this.height;
        }

        public final Number getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.height.hashCode() + (this.width.hashCode() * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(this.width, "width");
            ab8Var.j(this.height, "height");
            return ab8Var;
        }

        public String toString() {
            return "Viewport(width=" + this.width + ", height=" + this.height + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent$Viewport;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Viewport fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Viewport", e);
                    return null;
                }
            }

            public final Viewport fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    Number numberF = jsonObject.m("width").f();
                    Number numberF2 = jsonObject.m("height").f();
                    numberF.getClass();
                    numberF2.getClass();
                    return new Viewport(numberF, numberF2);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Viewport", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Viewport", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Viewport", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ActionEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ActionEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ActionEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ActionEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ActionEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type ActionEvent", e);
                return null;
            }
        }

        public final ActionEvent fromJsonObject(ab8 jsonObject) {
            String strG;
            jsonObject.getClass();
            try {
                long jE = jsonObject.m(LogAttributes.DATE).e();
                Application applicationFromJsonObject = Application.INSTANCE.fromJsonObject(jsonObject.m("application").d());
                ka8 ka8VarM = jsonObject.m("service");
                String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                ka8 ka8VarM2 = jsonObject.m("version");
                String strG3 = ka8VarM2 != null ? ka8VarM2.g() : null;
                ka8 ka8VarM3 = jsonObject.m("build_version");
                String strG4 = ka8VarM3 != null ? ka8VarM3.g() : null;
                ka8 ka8VarM4 = jsonObject.m("build_id");
                String strG5 = ka8VarM4 != null ? ka8VarM4.g() : null;
                ActionEventSession actionEventSessionFromJsonObject = ActionEventSession.INSTANCE.fromJsonObject(jsonObject.m("session").d());
                ka8 ka8VarM5 = jsonObject.m("source");
                ActionEventSource actionEventSourceFromJson = (ka8VarM5 == null || (strG = ka8VarM5.g()) == null) ? null : ActionEventSource.INSTANCE.fromJson(strG);
                ActionEventView actionEventViewFromJsonObject = ActionEventView.INSTANCE.fromJsonObject(jsonObject.m("view").d());
                ka8 ka8VarM6 = jsonObject.m("usr");
                Usr usrFromJsonObject = ka8VarM6 != null ? Usr.INSTANCE.fromJsonObject(ka8VarM6.d()) : null;
                ka8 ka8VarM7 = jsonObject.m("account");
                Account accountFromJsonObject = ka8VarM7 != null ? Account.INSTANCE.fromJsonObject(ka8VarM7.d()) : null;
                ka8 ka8VarM8 = jsonObject.m("connectivity");
                Connectivity connectivityFromJsonObject = ka8VarM8 != null ? Connectivity.INSTANCE.fromJsonObject(ka8VarM8.d()) : null;
                ka8 ka8VarM9 = jsonObject.m("display");
                Display displayFromJsonObject = ka8VarM9 != null ? Display.INSTANCE.fromJsonObject(ka8VarM9.d()) : null;
                ka8 ka8VarM10 = jsonObject.m("synthetics");
                Synthetics syntheticsFromJsonObject = ka8VarM10 != null ? Synthetics.INSTANCE.fromJsonObject(ka8VarM10.d()) : null;
                ka8 ka8VarM11 = jsonObject.m("ci_test");
                CiTest ciTestFromJsonObject = ka8VarM11 != null ? CiTest.INSTANCE.fromJsonObject(ka8VarM11.d()) : null;
                ka8 ka8VarM12 = jsonObject.m("os");
                Os osFromJsonObject = ka8VarM12 != null ? Os.INSTANCE.fromJsonObject(ka8VarM12.d()) : null;
                ka8 ka8VarM13 = jsonObject.m("device");
                Device deviceFromJsonObject = ka8VarM13 != null ? Device.INSTANCE.fromJsonObject(ka8VarM13.d()) : null;
                Dd ddFromJsonObject = Dd.INSTANCE.fromJsonObject(jsonObject.m("_dd").d());
                ka8 ka8VarM14 = jsonObject.m(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
                Context contextFromJsonObject = ka8VarM14 != null ? Context.INSTANCE.fromJsonObject(ka8VarM14.d()) : null;
                ka8 ka8VarM15 = jsonObject.m("container");
                Container containerFromJsonObject = ka8VarM15 != null ? Container.INSTANCE.fromJsonObject(ka8VarM15.d()) : null;
                String strG6 = jsonObject.m("type").g();
                ActionEventAction actionEventActionFromJsonObject = ActionEventAction.INSTANCE.fromJsonObject(jsonObject.m(RumEventDeserializer.EVENT_TYPE_ACTION).d());
                if (wl7.b(strG6, RumEventDeserializer.EVENT_TYPE_ACTION)) {
                    return new ActionEvent(jE, applicationFromJsonObject, strG2, strG3, strG4, strG5, actionEventSessionFromJsonObject, actionEventSourceFromJson, actionEventViewFromJsonObject, usrFromJsonObject, accountFromJsonObject, connectivityFromJsonObject, displayFromJsonObject, syntheticsFromJsonObject, ciTestFromJsonObject, osFromJsonObject, deviceFromJsonObject, ddFromJsonObject, contextFromJsonObject, containerFromJsonObject, actionEventActionFromJsonObject);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type ActionEvent", e);
                return null;
            } catch (NullPointerException e2) {
                g7.n("Unable to parse json into type ActionEvent", e2);
                return null;
            } catch (NumberFormatException e3) {
                g7.n("Unable to parse json into type ActionEvent", e3);
                return null;
            }
        }

        private Companion() {
        }
    }

    public ActionEvent(long j, Application application, String str, String str2, String str3, String str4, ActionEventSession actionEventSession, ActionEventSource actionEventSource, ActionEventView actionEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, ActionEventAction actionEventAction) {
        application.getClass();
        actionEventSession.getClass();
        actionEventView.getClass();
        dd.getClass();
        actionEventAction.getClass();
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.session = actionEventSession;
        this.source = actionEventSource;
        this.view = actionEventView;
        this.usr = usr;
        this.account = account;
        this.connectivity = connectivity;
        this.display = display;
        this.synthetics = synthetics;
        this.ciTest = ciTest;
        this.os = os;
        this.device = device;
        this.dd = dd;
        this.context = context;
        this.container = container;
        this.action = actionEventAction;
        this.type = RumEventDeserializer.EVENT_TYPE_ACTION;
    }
}
