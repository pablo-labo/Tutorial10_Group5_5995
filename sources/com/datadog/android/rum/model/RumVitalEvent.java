package com.datadog.android.rum.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.FeaturesContextResolver;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ab8;
import defpackage.akb;
import defpackage.b0;
import defpackage.bs4;
import defpackage.ey8;
import defpackage.fb8;
import defpackage.g7;
import defpackage.hh2;
import defpackage.ia;
import defpackage.ka8;
import defpackage.l5;
import defpackage.l6;
import defpackage.q6;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bL\b\u0086\b\u0018\u0000 \u0088\u00012\u00020\u0001:@\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u0088\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u00103J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00103J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020!HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020'HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0080\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'HÆ\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bW\u00103J\u0010\u0010Y\u001a\u00020XHÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u001a\u0010]\u001a\u00020\\2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b]\u0010^R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010_\u001a\u0004\b`\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010a\u001a\u0004\bb\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010c\u001a\u0004\bd\u00103R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010c\u001a\u0004\be\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010c\u001a\u0004\bf\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010c\u001a\u0004\bg\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010h\u001a\u0004\bi\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010j\u001a\u0004\bk\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010l\u001a\u0004\bm\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010n\u001a\u0004\bo\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010p\u001a\u0004\bq\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010r\u001a\u0004\bs\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010t\u001a\u0004\bu\u0010DR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010v\u001a\u0004\bw\u0010FR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010x\u001a\u0004\by\u0010HR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010z\u001a\u0004\b{\u0010JR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010|\u001a\u0004\b}\u0010LR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010~\u001a\u0004\b\u007f\u0010NR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010PR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010RR\u0019\u0010(\u001a\u00020'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010TR\u001d\u0010\u0086\u0001\u001a\u00020\u00068\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010c\u001a\u0005\b\u0087\u0001\u00103¨\u0006¨\u0001"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent;", "", "", LogAttributes.DATE, "Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "session", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "source", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "view", "Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "account", "Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "display", "Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "os", "Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "device", "Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/RumVitalEvent$Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "container", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "vital", "<init>", "(JLcom/datadog/android/rum/model/RumVitalEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;Lcom/datadog/android/rum/model/RumVitalEvent$Usr;Lcom/datadog/android/rum/model/RumVitalEvent$Account;Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;Lcom/datadog/android/rum/model/RumVitalEvent$Display;Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;Lcom/datadog/android/rum/model/RumVitalEvent$Os;Lcom/datadog/android/rum/model/RumVitalEvent$Device;Lcom/datadog/android/rum/model/RumVitalEvent$Dd;Lcom/datadog/android/rum/model/RumVitalEvent$Context;Lcom/datadog/android/rum/model/RumVitalEvent$Container;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "()Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "component8", "()Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "component9", "()Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "component10", "()Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "component11", "()Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "component12", "()Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "component13", "()Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "component14", "()Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "component15", "()Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "component16", "()Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "component17", "()Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "component18", "()Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "component19", "()Lcom/datadog/android/rum/model/RumVitalEvent$Context;", "component20", "()Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "component21", "()Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "copy", "(JLcom/datadog/android/rum/model/RumVitalEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;Lcom/datadog/android/rum/model/RumVitalEvent$Usr;Lcom/datadog/android/rum/model/RumVitalEvent$Account;Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;Lcom/datadog/android/rum/model/RumVitalEvent$Display;Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;Lcom/datadog/android/rum/model/RumVitalEvent$Os;Lcom/datadog/android/rum/model/RumVitalEvent$Device;Lcom/datadog/android/rum/model/RumVitalEvent$Dd;Lcom/datadog/android/rum/model/RumVitalEvent$Context;Lcom/datadog/android/rum/model/RumVitalEvent$Container;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;)Lcom/datadog/android/rum/model/RumVitalEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDate", "Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "getApplication", "Ljava/lang/String;", "getService", "getVersion", "getBuildVersion", "getBuildId", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "getSession", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "getSource", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "getView", "Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "getUsr", "Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "getDisplay", "Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "getSynthetics", "Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "getOs", "Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "getDd", "Lcom/datadog/android/rum/model/RumVitalEvent$Context;", "getContext", "Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "getContainer", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "getVital", "type", "getType", "Companion", "Account", "Application", "Cellular", "CiTest", "Configuration", "Connectivity", "Container", "ContainerView", "Context", "Custom", "Dd", "DdSession", "DdVital", "Device", "DeviceType", "Display", "EffectiveType", "Interface", "Os", "Plan", "RumVitalEventSession", "RumVitalEventSessionType", "RumVitalEventSource", "RumVitalEventView", "RumVitalEventVital", "RumVitalEventVitalType", "SessionPrecondition", "Status", "Synthetics", "Usr", "Viewport", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class RumVitalEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Account account;
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
    private final RumVitalEventSession session;
    private final RumVitalEventSource source;
    private final Synthetics synthetics;
    private final String type;
    private final Usr usr;
    private final String version;
    private final RumVitalEventView view;
    private final RumVitalEventVital vital;

    public /* synthetic */ RumVitalEvent(long j, Application application, String str, String str2, String str3, String str4, RumVitalEventSession rumVitalEventSession, RumVitalEventSource rumVitalEventSource, RumVitalEventView rumVitalEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, RumVitalEventVital rumVitalEventVital, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, rumVitalEventSession, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : rumVitalEventSource, rumVitalEventView, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : usr, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : account, (i & 2048) != 0 ? null : connectivity, (i & 4096) != 0 ? null : display, (i & 8192) != 0 ? null : synthetics, (i & 16384) != 0 ? null : ciTest, (32768 & i) != 0 ? null : os, (65536 & i) != 0 ? null : device, dd, (262144 & i) != 0 ? null : context, (i & 524288) != 0 ? null : container, rumVitalEventVital);
    }

    public static /* synthetic */ RumVitalEvent copy$default(RumVitalEvent rumVitalEvent, long j, Application application, String str, String str2, String str3, String str4, RumVitalEventSession rumVitalEventSession, RumVitalEventSource rumVitalEventSource, RumVitalEventView rumVitalEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, RumVitalEventVital rumVitalEventVital, int i, Object obj) {
        RumVitalEventVital rumVitalEventVital2;
        Container container2;
        long j2 = (i & 1) != 0 ? rumVitalEvent.date : j;
        Application application2 = (i & 2) != 0 ? rumVitalEvent.application : application;
        String str5 = (i & 4) != 0 ? rumVitalEvent.service : str;
        String str6 = (i & 8) != 0 ? rumVitalEvent.version : str2;
        String str7 = (i & 16) != 0 ? rumVitalEvent.buildVersion : str3;
        String str8 = (i & 32) != 0 ? rumVitalEvent.buildId : str4;
        RumVitalEventSession rumVitalEventSession2 = (i & 64) != 0 ? rumVitalEvent.session : rumVitalEventSession;
        RumVitalEventSource rumVitalEventSource2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? rumVitalEvent.source : rumVitalEventSource;
        RumVitalEventView rumVitalEventView2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? rumVitalEvent.view : rumVitalEventView;
        Usr usr2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? rumVitalEvent.usr : usr;
        Account account2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? rumVitalEvent.account : account;
        Connectivity connectivity2 = (i & 2048) != 0 ? rumVitalEvent.connectivity : connectivity;
        Display display2 = (i & 4096) != 0 ? rumVitalEvent.display : display;
        long j3 = j2;
        Synthetics synthetics2 = (i & 8192) != 0 ? rumVitalEvent.synthetics : synthetics;
        CiTest ciTest2 = (i & 16384) != 0 ? rumVitalEvent.ciTest : ciTest;
        Os os2 = (i & 32768) != 0 ? rumVitalEvent.os : os;
        Device device2 = (i & 65536) != 0 ? rumVitalEvent.device : device;
        Dd dd2 = (i & 131072) != 0 ? rumVitalEvent.dd : dd;
        Context context2 = (i & 262144) != 0 ? rumVitalEvent.context : context;
        Container container3 = (i & 524288) != 0 ? rumVitalEvent.container : container;
        if ((i & 1048576) != 0) {
            container2 = container3;
            rumVitalEventVital2 = rumVitalEvent.vital;
        } else {
            rumVitalEventVital2 = rumVitalEventVital;
            container2 = container3;
        }
        return rumVitalEvent.copy(j3, application2, str5, str6, str7, str8, rumVitalEventSession2, rumVitalEventSource2, rumVitalEventView2, usr2, account2, connectivity2, display2, synthetics2, ciTest2, os2, device2, dd2, context2, container2, rumVitalEventVital2);
    }

    public static final RumVitalEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final RumVitalEvent fromJsonObject(ab8 ab8Var) {
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
    public final RumVitalEventVital getVital() {
        return this.vital;
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
    public final RumVitalEventSession getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RumVitalEventSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RumVitalEventView getView() {
        return this.view;
    }

    public final RumVitalEvent copy(long date, Application application, String service, String version, String buildVersion, String buildId, RumVitalEventSession session, RumVitalEventSource source, RumVitalEventView view, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, RumVitalEventVital vital) {
        application.getClass();
        session.getClass();
        view.getClass();
        dd.getClass();
        vital.getClass();
        return new RumVitalEvent(date, application, service, version, buildVersion, buildId, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, container, vital);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RumVitalEvent)) {
            return false;
        }
        RumVitalEvent rumVitalEvent = (RumVitalEvent) other;
        return this.date == rumVitalEvent.date && wl7.b(this.application, rumVitalEvent.application) && wl7.b(this.service, rumVitalEvent.service) && wl7.b(this.version, rumVitalEvent.version) && wl7.b(this.buildVersion, rumVitalEvent.buildVersion) && wl7.b(this.buildId, rumVitalEvent.buildId) && wl7.b(this.session, rumVitalEvent.session) && this.source == rumVitalEvent.source && wl7.b(this.view, rumVitalEvent.view) && wl7.b(this.usr, rumVitalEvent.usr) && wl7.b(this.account, rumVitalEvent.account) && wl7.b(this.connectivity, rumVitalEvent.connectivity) && wl7.b(this.display, rumVitalEvent.display) && wl7.b(this.synthetics, rumVitalEvent.synthetics) && wl7.b(this.ciTest, rumVitalEvent.ciTest) && wl7.b(this.os, rumVitalEvent.os) && wl7.b(this.device, rumVitalEvent.device) && wl7.b(this.dd, rumVitalEvent.dd) && wl7.b(this.context, rumVitalEvent.context) && wl7.b(this.container, rumVitalEvent.container) && wl7.b(this.vital, rumVitalEvent.vital);
    }

    public final Account getAccount() {
        return this.account;
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

    public final RumVitalEventSession getSession() {
        return this.session;
    }

    public final RumVitalEventSource getSource() {
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

    public final RumVitalEventView getView() {
        return this.view;
    }

    public final RumVitalEventVital getVital() {
        return this.vital;
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
        RumVitalEventSource rumVitalEventSource = this.source;
        int iHashCode6 = (this.view.hashCode() + ((iHashCode5 + (rumVitalEventSource == null ? 0 : rumVitalEventSource.hashCode())) * 31)) * 31;
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
        return this.vital.hashCode() + ((iHashCode15 + (container != null ? container.hashCode() : 0)) * 31);
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
        RumVitalEventSource rumVitalEventSource = this.source;
        if (rumVitalEventSource != null) {
            ab8Var.i("source", rumVitalEventSource.toJson());
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
        ab8Var.i("vital", this.vital.toJson());
        return ab8Var;
    }

    public String toString() {
        long j = this.date;
        Application application = this.application;
        String str = this.service;
        String str2 = this.version;
        String str3 = this.buildVersion;
        String str4 = this.buildId;
        RumVitalEventSession rumVitalEventSession = this.session;
        RumVitalEventSource rumVitalEventSource = this.source;
        RumVitalEventView rumVitalEventView = this.view;
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
        RumVitalEventVital rumVitalEventVital = this.vital;
        StringBuilder sb = new StringBuilder("RumVitalEvent(date=");
        sb.append(j);
        sb.append(", application=");
        sb.append(application);
        ia.r(sb, ", service=", str, ", version=", str2);
        ia.r(sb, ", buildVersion=", str3, ", buildId=", str4);
        sb.append(", session=");
        sb.append(rumVitalEventSession);
        sb.append(", source=");
        sb.append(rumVitalEventSource);
        sb.append(", view=");
        sb.append(rumVitalEventView);
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
        sb.append(", vital=");
        sb.append(rumVitalEventVital);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTechnology", "getCarrierName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestExecutionId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$CiTest;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getSessionSampleRate", "getSessionReplaySampleRate", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006-"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/RumVitalEvent$Status;", "status", "", "Lcom/datadog/android/rum/model/RumVitalEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/RumVitalEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType;Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/RumVitalEvent$Status;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/RumVitalEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType;Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;)Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/RumVitalEvent$Status;", "getStatus", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType;", "getEffectiveType", "Lcom/datadog/android/rum/model/RumVitalEvent$Cellular;", "getCellular", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Connectivity;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "", "Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "copy", "(Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;)Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "getView", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "getSource", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Container {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RumVitalEventSource source;
        private final ContainerView view;

        public Container(ContainerView containerView, RumVitalEventSource rumVitalEventSource) {
            containerView.getClass();
            rumVitalEventSource.getClass();
            this.view = containerView;
            this.source = rumVitalEventSource;
        }

        public static /* synthetic */ Container copy$default(Container container, ContainerView containerView, RumVitalEventSource rumVitalEventSource, int i, Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                rumVitalEventSource = container.source;
            }
            return container.copy(containerView, rumVitalEventSource);
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
        public final RumVitalEventSource getSource() {
            return this.source;
        }

        public final Container copy(ContainerView view, RumVitalEventSource source) {
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

        public final RumVitalEventSource getSource() {
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Container;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    RumVitalEventSource.Companion companion = RumVitalEventSource.INSTANCE;
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$ContainerView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/RumVitalEvent$Context;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Context;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Context;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Custom {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, Number> additionalProperties;

        public /* synthetic */ Custom(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? bs4.a : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Custom copy$default(Custom custom, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = custom.additionalProperties;
            }
            return custom.copy(map);
        }

        public static final Custom fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Custom fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public final Map<String, Number> component1() {
            return this.additionalProperties;
        }

        public final Custom copy(Map<String, ? extends Number> additionalProperties) {
            additionalProperties.getClass();
            return new Custom(additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Custom) && wl7.b(this.additionalProperties, ((Custom) other).additionalProperties);
        }

        public final Map<String, Number> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            for (Map.Entry<String, Number> entry : this.additionalProperties.entrySet()) {
                ab8Var.j(entry.getValue(), entry.getKey());
            }
            return ab8Var;
        }

        public String toString() {
            return "Custom(additionalProperties=" + this.additionalProperties + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Custom$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Custom fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Custom", e);
                    return null;
                }
            }

            public final Custom fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = ((ey8.b) jsonObject.a.entrySet()).iterator();
                    while (((ey8.d) it).hasNext()) {
                        Map.Entry entryA = ((ey8.b.a) it).a();
                        Object key = entryA.getKey();
                        key.getClass();
                        Number numberF = ((ka8) entryA.getValue()).f();
                        numberF.getClass();
                        linkedHashMap.put(key, numberF);
                    }
                    return new Custom(linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Custom", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Custom", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Custom", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Custom(Map<String, ? extends Number> map) {
            map.getClass();
            this.additionalProperties = map;
        }

        public Custom() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016R\u001a\u0010*\u001a\u00020)8\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "", "Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "configuration", "", "browserSdkVersion", "Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "vital", "<init>", "(Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;Ljava/lang/String;Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "copy", "(Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;Ljava/lang/String;Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;)Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "getSession", "Lcom/datadog/android/rum/model/RumVitalEvent$Configuration;", "getConfiguration", "Ljava/lang/String;", "getBrowserSdkVersion", "Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "getVital", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String browserSdkVersion;
        private final Configuration configuration;
        private final long formatVersion;
        private final DdSession session;
        private final DdVital vital;

        public /* synthetic */ Dd(DdSession ddSession, Configuration configuration, String str, DdVital ddVital, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : ddVital);
        }

        public static /* synthetic */ Dd copy$default(Dd dd, DdSession ddSession, Configuration configuration, String str, DdVital ddVital, int i, Object obj) {
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
                ddVital = dd.vital;
            }
            return dd.copy(ddSession, configuration, str, ddVital);
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
        public final DdVital getVital() {
            return this.vital;
        }

        public final Dd copy(DdSession session, Configuration configuration, String browserSdkVersion, DdVital vital) {
            return new Dd(session, configuration, browserSdkVersion, vital);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) other;
            return wl7.b(this.session, dd.session) && wl7.b(this.configuration, dd.configuration) && wl7.b(this.browserSdkVersion, dd.browserSdkVersion) && wl7.b(this.vital, dd.vital);
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

        public final DdVital getVital() {
            return this.vital;
        }

        public int hashCode() {
            DdSession ddSession = this.session;
            int iHashCode = (ddSession == null ? 0 : ddSession.hashCode()) * 31;
            Configuration configuration = this.configuration;
            int iHashCode2 = (iHashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            String str = this.browserSdkVersion;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            DdVital ddVital = this.vital;
            return iHashCode3 + (ddVital != null ? ddVital.hashCode() : 0);
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
            DdVital ddVital = this.vital;
            if (ddVital != null) {
                ab8Var.i("vital", ddVital.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Dd(session=" + this.session + ", configuration=" + this.configuration + ", browserSdkVersion=" + this.browserSdkVersion + ", vital=" + this.vital + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ka8 ka8VarM4 = jsonObject.m("vital");
                    DdVital ddVitalFromJsonObject = ka8VarM4 != null ? DdVital.INSTANCE.fromJsonObject(ka8VarM4.d()) : null;
                    if (jE == 2) {
                        return new Dd(ddSessionFromJsonObject, configurationFromJsonObject, strG, ddVitalFromJsonObject);
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

        public Dd(DdSession ddSession, Configuration configuration, String str, DdVital ddVital) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.vital = ddVital;
            this.formatVersion = 2L;
        }

        public Dd() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "", "Lcom/datadog/android/rum/model/RumVitalEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/RumVitalEvent$Plan;Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/RumVitalEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/RumVitalEvent$Plan;Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/RumVitalEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition;", "getSessionPrecondition", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$DdSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "", "", "computedValue", "<init>", "(Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getComputedValue", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class DdVital {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean computedValue;

        public /* synthetic */ DdVital(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public static /* synthetic */ DdVital copy$default(DdVital ddVital, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = ddVital.computedValue;
            }
            return ddVital.copy(bool);
        }

        public static final DdVital fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final DdVital fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getComputedValue() {
            return this.computedValue;
        }

        public final DdVital copy(Boolean computedValue) {
            return new DdVital(computedValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DdVital) && wl7.b(this.computedValue, ((DdVital) other).computedValue);
        }

        public final Boolean getComputedValue() {
            return this.computedValue;
        }

        public int hashCode() {
            Boolean bool = this.computedValue;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Boolean bool = this.computedValue;
            if (bool != null) {
                ab8Var.k("computed_value", bool);
            }
            return ab8Var;
        }

        public String toString() {
            return "DdVital(computedValue=" + this.computedValue + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$DdVital$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$DdVital;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DdVital fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdVital", e);
                    return null;
                }
            }

            public final DdVital fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("computed_value");
                    return new DdVital(ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type DdVital", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type DdVital", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type DdVital", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public DdVital(Boolean bool) {
            this.computedValue = bool;
        }

        public DdVital() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "", "Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "<init>", "(Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType;", "getType", "Ljava/lang/String;", "getName", "getModel", "getBrand", "getArchitecture", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$DeviceType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "", "Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "viewport", "<init>", "(Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "copy", "(Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;)Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "getViewport", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Display;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "SLOW_2G", "2G", "3G", "4G", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        f122G("2g"),
        f133G("3g"),
        f144G("4g");


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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$EffectiveType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Interface;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Interface$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$Interface;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "getBuild", "getVersionMajor", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Plan;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/Number;", "Companion", "PLAN_1", "PLAN_2", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Plan$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$Plan;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType;", "type", "", "hasReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType;", "getType", "Ljava/lang/Boolean;", "getHasReplay", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RumVitalEventSession {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean hasReplay;
        private final String id;
        private final RumVitalEventSessionType type;

        public RumVitalEventSession(String str, RumVitalEventSessionType rumVitalEventSessionType, Boolean bool) {
            str.getClass();
            rumVitalEventSessionType.getClass();
            this.id = str;
            this.type = rumVitalEventSessionType;
            this.hasReplay = bool;
        }

        public static /* synthetic */ RumVitalEventSession copy$default(RumVitalEventSession rumVitalEventSession, String str, RumVitalEventSessionType rumVitalEventSessionType, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rumVitalEventSession.id;
            }
            if ((i & 2) != 0) {
                rumVitalEventSessionType = rumVitalEventSession.type;
            }
            if ((i & 4) != 0) {
                bool = rumVitalEventSession.hasReplay;
            }
            return rumVitalEventSession.copy(str, rumVitalEventSessionType, bool);
        }

        public static final RumVitalEventSession fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final RumVitalEventSession fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final RumVitalEventSessionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final RumVitalEventSession copy(String id, RumVitalEventSessionType type, Boolean hasReplay) {
            id.getClass();
            type.getClass();
            return new RumVitalEventSession(id, type, hasReplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RumVitalEventSession)) {
                return false;
            }
            RumVitalEventSession rumVitalEventSession = (RumVitalEventSession) other;
            return wl7.b(this.id, rumVitalEventSession.id) && this.type == rumVitalEventSession.type && wl7.b(this.hasReplay, rumVitalEventSession.hasReplay);
        }

        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final String getId() {
            return this.id;
        }

        public final RumVitalEventSessionType getType() {
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
            RumVitalEventSessionType rumVitalEventSessionType = this.type;
            Boolean bool = this.hasReplay;
            StringBuilder sb = new StringBuilder("RumVitalEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(rumVitalEventSessionType);
            sb.append(", hasReplay=");
            return l5.n(sb, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RumVitalEventSession fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type RumVitalEventSession", e);
                    return null;
                }
            }

            public final RumVitalEventSession fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    RumVitalEventSessionType.Companion companion = RumVitalEventSessionType.INSTANCE;
                    String strG2 = jsonObject.m("type").g();
                    strG2.getClass();
                    RumVitalEventSessionType rumVitalEventSessionTypeFromJson = companion.fromJson(strG2);
                    ka8 ka8VarM = jsonObject.m(FeaturesContextResolver.HAS_REPLAY_KEY);
                    Boolean boolValueOf = ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null;
                    strG.getClass();
                    return new RumVitalEventSession(strG, rumVitalEventSessionTypeFromJson, boolValueOf);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type RumVitalEventSession", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type RumVitalEventSession", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type RumVitalEventSession", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ RumVitalEventSession(String str, RumVitalEventSessionType rumVitalEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, rumVitalEventSessionType, (i & 4) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER", "SYNTHETICS", "CI_TEST", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum RumVitalEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        RumVitalEventSessionType(String str) {
            this.jsonValue = str;
        }

        public static final RumVitalEventSessionType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSessionType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RumVitalEventSessionType fromJson(String jsonString) {
                jsonString.getClass();
                for (RumVitalEventSessionType rumVitalEventSessionType : RumVitalEventSessionType.values()) {
                    if (wl7.b(rumVitalEventSessionType.jsonValue, jsonString)) {
                        return rumVitalEventSessionType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum RumVitalEventSource {
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

        RumVitalEventSource(String str) {
            this.jsonValue = str;
        }

        public static final RumVitalEventSource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventSource;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RumVitalEventSource fromJson(String jsonString) {
                jsonString.getClass();
                for (RumVitalEventSource rumVitalEventSource : RumVitalEventSource.values()) {
                    if (wl7.b(rumVitalEventSource.jsonValue, jsonString)) {
                        return rumVitalEventSource;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "", "", "id", "referrer", "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getReferrer", "setReferrer", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getName", "setName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RumVitalEventView {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private String name;
        private String referrer;
        private String url;

        public RumVitalEventView(String str, String str2, String str3, String str4) {
            str.getClass();
            str3.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
        }

        public static /* synthetic */ RumVitalEventView copy$default(RumVitalEventView rumVitalEventView, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rumVitalEventView.id;
            }
            if ((i & 2) != 0) {
                str2 = rumVitalEventView.referrer;
            }
            if ((i & 4) != 0) {
                str3 = rumVitalEventView.url;
            }
            if ((i & 8) != 0) {
                str4 = rumVitalEventView.name;
            }
            return rumVitalEventView.copy(str, str2, str3, str4);
        }

        public static final RumVitalEventView fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final RumVitalEventView fromJsonObject(ab8 ab8Var) {
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

        public final RumVitalEventView copy(String id, String referrer, String url, String name) {
            id.getClass();
            url.getClass();
            return new RumVitalEventView(id, referrer, url, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RumVitalEventView)) {
                return false;
            }
            RumVitalEventView rumVitalEventView = (RumVitalEventView) other;
            return wl7.b(this.id, rumVitalEventView.id) && wl7.b(this.referrer, rumVitalEventView.referrer) && wl7.b(this.url, rumVitalEventView.url) && wl7.b(this.name, rumVitalEventView.name);
        }

        public final String getId() {
            return this.id;
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
            return iD + (str2 != null ? str2.hashCode() : 0);
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
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.referrer;
            return z3.n(u40.f("RumVitalEventView(id=", str, ", referrer=", str2, ", url="), this.url, ", name=", this.name, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RumVitalEventView fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type RumVitalEventView", e);
                    return null;
                }
            }

            public final RumVitalEventView fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    ka8 ka8VarM = jsonObject.m("referrer");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    String strG3 = jsonObject.m("url").g();
                    ka8 ka8VarM2 = jsonObject.m("name");
                    String strG4 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    strG.getClass();
                    strG3.getClass();
                    return new RumVitalEventView(strG, strG2, strG3, strG4);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type RumVitalEventView", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type RumVitalEventView", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type RumVitalEventView", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ RumVitalEventView(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJT\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001a¨\u00060"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType;", "type", "", "id", "name", "details", "", "duration", "Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "custom", "<init>", "(Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Lcom/datadog/android/rum/model/RumVitalEvent$Custom;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Number;", "component6", "()Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "copy", "(Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Lcom/datadog/android/rum/model/RumVitalEvent$Custom;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType;", "getType", "Ljava/lang/String;", "getId", "getName", "getDetails", "Ljava/lang/Number;", "getDuration", "Lcom/datadog/android/rum/model/RumVitalEvent$Custom;", "getCustom", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RumVitalEventVital {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Custom custom;
        private final String details;
        private final Number duration;
        private final String id;
        private final String name;
        private final RumVitalEventVitalType type;

        public /* synthetic */ RumVitalEventVital(RumVitalEventVitalType rumVitalEventVitalType, String str, String str2, String str3, Number number, Custom custom, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rumVitalEventVitalType, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : number, (i & 32) != 0 ? null : custom);
        }

        public static /* synthetic */ RumVitalEventVital copy$default(RumVitalEventVital rumVitalEventVital, RumVitalEventVitalType rumVitalEventVitalType, String str, String str2, String str3, Number number, Custom custom, int i, Object obj) {
            if ((i & 1) != 0) {
                rumVitalEventVitalType = rumVitalEventVital.type;
            }
            if ((i & 2) != 0) {
                str = rumVitalEventVital.id;
            }
            if ((i & 4) != 0) {
                str2 = rumVitalEventVital.name;
            }
            if ((i & 8) != 0) {
                str3 = rumVitalEventVital.details;
            }
            if ((i & 16) != 0) {
                number = rumVitalEventVital.duration;
            }
            if ((i & 32) != 0) {
                custom = rumVitalEventVital.custom;
            }
            Number number2 = number;
            Custom custom2 = custom;
            return rumVitalEventVital.copy(rumVitalEventVitalType, str, str2, str3, number2, custom2);
        }

        public static final RumVitalEventVital fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final RumVitalEventVital fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RumVitalEventVitalType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Number getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Custom getCustom() {
            return this.custom;
        }

        public final RumVitalEventVital copy(RumVitalEventVitalType type, String id, String name, String details, Number duration, Custom custom) {
            type.getClass();
            id.getClass();
            return new RumVitalEventVital(type, id, name, details, duration, custom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RumVitalEventVital)) {
                return false;
            }
            RumVitalEventVital rumVitalEventVital = (RumVitalEventVital) other;
            return this.type == rumVitalEventVital.type && wl7.b(this.id, rumVitalEventVital.id) && wl7.b(this.name, rumVitalEventVital.name) && wl7.b(this.details, rumVitalEventVital.details) && wl7.b(this.duration, rumVitalEventVital.duration) && wl7.b(this.custom, rumVitalEventVital.custom);
        }

        public final Custom getCustom() {
            return this.custom;
        }

        public final String getDetails() {
            return this.details;
        }

        public final Number getDuration() {
            return this.duration;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final RumVitalEventVitalType getType() {
            return this.type;
        }

        public int hashCode() {
            int iD = akb.d(this.type.hashCode() * 31, 31, this.id);
            String str = this.name;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.details;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Number number = this.duration;
            int iHashCode3 = (iHashCode2 + (number == null ? 0 : number.hashCode())) * 31;
            Custom custom = this.custom;
            return iHashCode3 + (custom != null ? custom.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("type", this.type.toJson());
            ab8Var.l("id", this.id);
            String str = this.name;
            if (str != null) {
                ab8Var.l("name", str);
            }
            String str2 = this.details;
            if (str2 != null) {
                ab8Var.l("details", str2);
            }
            Number number = this.duration;
            if (number != null) {
                ab8Var.j(number, "duration");
            }
            Custom custom = this.custom;
            if (custom != null) {
                ab8Var.i("custom", custom.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            RumVitalEventVitalType rumVitalEventVitalType = this.type;
            String str = this.id;
            String str2 = this.name;
            String str3 = this.details;
            Number number = this.duration;
            Custom custom = this.custom;
            StringBuilder sb = new StringBuilder("RumVitalEventVital(type=");
            sb.append(rumVitalEventVitalType);
            sb.append(", id=");
            sb.append(str);
            sb.append(", name=");
            ia.r(sb, str2, ", details=", str3, ", duration=");
            sb.append(number);
            sb.append(", custom=");
            sb.append(custom);
            sb.append(")");
            return sb.toString();
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVital;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RumVitalEventVital fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type RumVitalEventVital", e);
                    return null;
                }
            }

            public final RumVitalEventVital fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    RumVitalEventVitalType.Companion companion = RumVitalEventVitalType.INSTANCE;
                    String strG = jsonObject.m("type").g();
                    strG.getClass();
                    RumVitalEventVitalType rumVitalEventVitalTypeFromJson = companion.fromJson(strG);
                    String strG2 = jsonObject.m("id").g();
                    ka8 ka8VarM = jsonObject.m("name");
                    String strG3 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("details");
                    String strG4 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("duration");
                    Number numberF = ka8VarM3 != null ? ka8VarM3.f() : null;
                    ka8 ka8VarM4 = jsonObject.m("custom");
                    Custom customFromJsonObject = ka8VarM4 != null ? Custom.INSTANCE.fromJsonObject(ka8VarM4.d()) : null;
                    strG2.getClass();
                    return new RumVitalEventVital(rumVitalEventVitalTypeFromJson, strG2, strG3, strG4, numberF, customFromJsonObject);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type RumVitalEventVital", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type RumVitalEventVital", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type RumVitalEventVital", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public RumVitalEventVital(RumVitalEventVitalType rumVitalEventVitalType, String str, String str2, String str3, Number number, Custom custom) {
            rumVitalEventVitalType.getClass();
            str.getClass();
            this.type = rumVitalEventVitalType;
            this.id = str;
            this.name = str2;
            this.details = str3;
            this.duration = number;
            this.custom = custom;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "DURATION", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum RumVitalEventVitalType {
        DURATION("duration");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        RumVitalEventVitalType(String str) {
            this.jsonValue = str;
        }

        public static final RumVitalEventVitalType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$RumVitalEventVitalType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RumVitalEventVitalType fromJson(String jsonString) {
                jsonString.getClass();
                for (RumVitalEventVitalType rumVitalEventVitalType : RumVitalEventVitalType.values()) {
                    if (wl7.b(rumVitalEventVitalType.jsonValue, jsonString)) {
                        return rumVitalEventVitalType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$SessionPrecondition;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Status;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Status$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/RumVitalEvent$Status;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "getResultId", "Ljava/lang/Boolean;", "getInjected", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Synthetics;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "getAnonymousId", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getWidth", "getHeight", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent$Viewport;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/RumVitalEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/RumVitalEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/RumVitalEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/RumVitalEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumVitalEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type RumVitalEvent", e);
                return null;
            }
        }

        public final RumVitalEvent fromJsonObject(ab8 jsonObject) {
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
                RumVitalEventSession rumVitalEventSessionFromJsonObject = RumVitalEventSession.INSTANCE.fromJsonObject(jsonObject.m("session").d());
                ka8 ka8VarM5 = jsonObject.m("source");
                RumVitalEventSource rumVitalEventSourceFromJson = (ka8VarM5 == null || (strG = ka8VarM5.g()) == null) ? null : RumVitalEventSource.INSTANCE.fromJson(strG);
                RumVitalEventView rumVitalEventViewFromJsonObject = RumVitalEventView.INSTANCE.fromJsonObject(jsonObject.m("view").d());
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
                RumVitalEventVital rumVitalEventVitalFromJsonObject = RumVitalEventVital.INSTANCE.fromJsonObject(jsonObject.m("vital").d());
                if (wl7.b(strG6, "vital")) {
                    return new RumVitalEvent(jE, applicationFromJsonObject, strG2, strG3, strG4, strG5, rumVitalEventSessionFromJsonObject, rumVitalEventSourceFromJson, rumVitalEventViewFromJsonObject, usrFromJsonObject, accountFromJsonObject, connectivityFromJsonObject, displayFromJsonObject, syntheticsFromJsonObject, ciTestFromJsonObject, osFromJsonObject, deviceFromJsonObject, ddFromJsonObject, contextFromJsonObject, containerFromJsonObject, rumVitalEventVitalFromJsonObject);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type RumVitalEvent", e);
                return null;
            } catch (NullPointerException e2) {
                g7.n("Unable to parse json into type RumVitalEvent", e2);
                return null;
            } catch (NumberFormatException e3) {
                g7.n("Unable to parse json into type RumVitalEvent", e3);
                return null;
            }
        }

        private Companion() {
        }
    }

    public RumVitalEvent(long j, Application application, String str, String str2, String str3, String str4, RumVitalEventSession rumVitalEventSession, RumVitalEventSource rumVitalEventSource, RumVitalEventView rumVitalEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, RumVitalEventVital rumVitalEventVital) {
        application.getClass();
        rumVitalEventSession.getClass();
        rumVitalEventView.getClass();
        dd.getClass();
        rumVitalEventVital.getClass();
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.session = rumVitalEventSession;
        this.source = rumVitalEventSource;
        this.view = rumVitalEventView;
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
        this.vital = rumVitalEventVital;
        this.type = "vital";
    }
}
