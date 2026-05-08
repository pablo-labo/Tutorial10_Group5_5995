package com.datadog.android.rum.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.FeaturesContextResolver;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
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
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b[\b\u0086\b\u0018\u0000 \u008e\u00012\u00020\u0001:Z\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u008e\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001B÷\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u00105J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u00105J\u0012\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b8\u00105J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020!HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020)HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u008c\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)HÆ\u0001¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b[\u00105J\u0010\u0010]\u001a\u00020\\HÖ\u0001¢\u0006\u0004\b]\u0010^J\u001a\u0010a\u001a\u00020`2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010c\u001a\u0004\bd\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010e\u001a\u0004\bf\u00103R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010g\u001a\u0004\bh\u00105R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bi\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010g\u001a\u0004\bj\u00105R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010g\u001a\u0004\bk\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010l\u001a\u0004\bm\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010n\u001a\u0004\bo\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010p\u001a\u0004\bq\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010r\u001a\u0004\bs\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010t\u001a\u0004\bu\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010v\u001a\u0004\bw\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010x\u001a\u0004\by\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010z\u001a\u0004\b{\u0010HR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010|\u001a\u0004\b}\u0010JR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010~\u001a\u0004\b\u007f\u0010LR\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010NR\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010PR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010RR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010TR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010VR\u0019\u0010*\u001a\u00020)8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010XR\u001d\u0010\u008c\u0001\u001a\u00020\u00068\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010g\u001a\u0005\b\u008d\u0001\u00105¨\u0006»\u0001"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent;", "", "", LogAttributes.DATE, "Lcom/datadog/android/rum/model/ResourceEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "session", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "source", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "view", "Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/ResourceEvent$Account;", "account", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/ResourceEvent$Display;", "display", "Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/ResourceEvent$Os;", "os", "Lcom/datadog/android/rum/model/ResourceEvent$Device;", "device", "Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/ResourceEvent$Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/rum/model/ResourceEvent$Action;", RumEventDeserializer.EVENT_TYPE_ACTION, "Lcom/datadog/android/rum/model/ResourceEvent$Container;", "container", "Lcom/datadog/android/rum/model/ResourceEvent$Resource;", RumEventDeserializer.EVENT_TYPE_RESOURCE, "<init>", "(JLcom/datadog/android/rum/model/ResourceEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;Lcom/datadog/android/rum/model/ResourceEvent$Usr;Lcom/datadog/android/rum/model/ResourceEvent$Account;Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;Lcom/datadog/android/rum/model/ResourceEvent$Display;Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;Lcom/datadog/android/rum/model/ResourceEvent$CiTest;Lcom/datadog/android/rum/model/ResourceEvent$Os;Lcom/datadog/android/rum/model/ResourceEvent$Device;Lcom/datadog/android/rum/model/ResourceEvent$Dd;Lcom/datadog/android/rum/model/ResourceEvent$Context;Lcom/datadog/android/rum/model/ResourceEvent$Action;Lcom/datadog/android/rum/model/ResourceEvent$Container;Lcom/datadog/android/rum/model/ResourceEvent$Resource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$Application;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "component8", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "component9", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "component10", "()Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "component11", "()Lcom/datadog/android/rum/model/ResourceEvent$Account;", "component12", "()Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "component13", "()Lcom/datadog/android/rum/model/ResourceEvent$Display;", "component14", "()Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "component15", "()Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "component16", "()Lcom/datadog/android/rum/model/ResourceEvent$Os;", "component17", "()Lcom/datadog/android/rum/model/ResourceEvent$Device;", "component18", "()Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "component19", "()Lcom/datadog/android/rum/model/ResourceEvent$Context;", "component20", "()Lcom/datadog/android/rum/model/ResourceEvent$Action;", "component21", "()Lcom/datadog/android/rum/model/ResourceEvent$Container;", "component22", "()Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "copy", "(JLcom/datadog/android/rum/model/ResourceEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;Lcom/datadog/android/rum/model/ResourceEvent$Usr;Lcom/datadog/android/rum/model/ResourceEvent$Account;Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;Lcom/datadog/android/rum/model/ResourceEvent$Display;Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;Lcom/datadog/android/rum/model/ResourceEvent$CiTest;Lcom/datadog/android/rum/model/ResourceEvent$Os;Lcom/datadog/android/rum/model/ResourceEvent$Device;Lcom/datadog/android/rum/model/ResourceEvent$Dd;Lcom/datadog/android/rum/model/ResourceEvent$Context;Lcom/datadog/android/rum/model/ResourceEvent$Action;Lcom/datadog/android/rum/model/ResourceEvent$Container;Lcom/datadog/android/rum/model/ResourceEvent$Resource;)Lcom/datadog/android/rum/model/ResourceEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDate", "Lcom/datadog/android/rum/model/ResourceEvent$Application;", "getApplication", "Ljava/lang/String;", "getService", "getVersion", "getBuildVersion", "getBuildId", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "getSession", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "getSource", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "getView", "Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "getUsr", "Lcom/datadog/android/rum/model/ResourceEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/ResourceEvent$Display;", "getDisplay", "Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "getSynthetics", "Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/ResourceEvent$Os;", "getOs", "Lcom/datadog/android/rum/model/ResourceEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "getDd", "Lcom/datadog/android/rum/model/ResourceEvent$Context;", "getContext", "Lcom/datadog/android/rum/model/ResourceEvent$Action;", "getAction", "Lcom/datadog/android/rum/model/ResourceEvent$Container;", "getContainer", "Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "getResource", "type", "getType", "Companion", "Account", "Action", "Application", "Cellular", "CiTest", "Configuration", "Connect", "Connectivity", "Container", "ContainerView", "Context", "Dd", "DdSession", "DeliveryType", "Device", "DeviceType", "Display", "Dns", "Download", "EffectiveType", "FirstByte", "Graphql", "Interface", "Method", "OperationType", "Os", "Plan", "Provider", "ProviderType", "Redirect", "RenderBlockingStatus", "Resource", "ResourceEventSession", "ResourceEventSessionType", "ResourceEventSource", "ResourceEventView", "ResourceType", "SessionPrecondition", "Ssl", "Status", "Synthetics", "Usr", "Viewport", "Worker", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ResourceEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Account account;
    private final Action action;
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
    private final Resource resource;
    private final String service;
    private final ResourceEventSession session;
    private final ResourceEventSource source;
    private final Synthetics synthetics;
    private final String type;
    private final Usr usr;
    private final String version;
    private final ResourceEventView view;

    public /* synthetic */ ResourceEvent(long j, Application application, String str, String str2, String str3, String str4, ResourceEventSession resourceEventSession, ResourceEventSource resourceEventSource, ResourceEventView resourceEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Resource resource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, resourceEventSession, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : resourceEventSource, resourceEventView, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : usr, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : account, (i & 2048) != 0 ? null : connectivity, (i & 4096) != 0 ? null : display, (i & 8192) != 0 ? null : synthetics, (i & 16384) != 0 ? null : ciTest, (32768 & i) != 0 ? null : os, (65536 & i) != 0 ? null : device, dd, (262144 & i) != 0 ? null : context, (524288 & i) != 0 ? null : action, (i & 1048576) != 0 ? null : container, resource);
    }

    public static /* synthetic */ ResourceEvent copy$default(ResourceEvent resourceEvent, long j, Application application, String str, String str2, String str3, String str4, ResourceEventSession resourceEventSession, ResourceEventSource resourceEventSource, ResourceEventView resourceEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Resource resource, int i, Object obj) {
        Resource resource2;
        Container container2;
        long j2 = (i & 1) != 0 ? resourceEvent.date : j;
        Application application2 = (i & 2) != 0 ? resourceEvent.application : application;
        String str5 = (i & 4) != 0 ? resourceEvent.service : str;
        String str6 = (i & 8) != 0 ? resourceEvent.version : str2;
        String str7 = (i & 16) != 0 ? resourceEvent.buildVersion : str3;
        String str8 = (i & 32) != 0 ? resourceEvent.buildId : str4;
        ResourceEventSession resourceEventSession2 = (i & 64) != 0 ? resourceEvent.session : resourceEventSession;
        ResourceEventSource resourceEventSource2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? resourceEvent.source : resourceEventSource;
        ResourceEventView resourceEventView2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? resourceEvent.view : resourceEventView;
        Usr usr2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? resourceEvent.usr : usr;
        Account account2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? resourceEvent.account : account;
        Connectivity connectivity2 = (i & 2048) != 0 ? resourceEvent.connectivity : connectivity;
        Display display2 = (i & 4096) != 0 ? resourceEvent.display : display;
        long j3 = j2;
        Synthetics synthetics2 = (i & 8192) != 0 ? resourceEvent.synthetics : synthetics;
        CiTest ciTest2 = (i & 16384) != 0 ? resourceEvent.ciTest : ciTest;
        Os os2 = (i & 32768) != 0 ? resourceEvent.os : os;
        Device device2 = (i & 65536) != 0 ? resourceEvent.device : device;
        Dd dd2 = (i & 131072) != 0 ? resourceEvent.dd : dd;
        Context context2 = (i & 262144) != 0 ? resourceEvent.context : context;
        Action action2 = (i & 524288) != 0 ? resourceEvent.action : action;
        Container container3 = (i & 1048576) != 0 ? resourceEvent.container : container;
        if ((i & 2097152) != 0) {
            container2 = container3;
            resource2 = resourceEvent.resource;
        } else {
            resource2 = resource;
            container2 = container3;
        }
        return resourceEvent.copy(j3, application2, str5, str6, str7, str8, resourceEventSession2, resourceEventSource2, resourceEventView2, usr2, account2, connectivity2, display2, synthetics2, ciTest2, os2, device2, dd2, context2, action2, container2, resource2);
    }

    public static final ResourceEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final ResourceEvent fromJsonObject(ab8 ab8Var) {
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
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Container getContainer() {
        return this.container;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Resource getResource() {
        return this.resource;
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
    public final ResourceEventSession getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ResourceEventSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ResourceEventView getView() {
        return this.view;
    }

    public final ResourceEvent copy(long date, Application application, String service, String version, String buildVersion, String buildId, ResourceEventSession session, ResourceEventSource source, ResourceEventView view, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Resource resource) {
        application.getClass();
        session.getClass();
        view.getClass();
        dd.getClass();
        resource.getClass();
        return new ResourceEvent(date, application, service, version, buildVersion, buildId, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, action, container, resource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceEvent)) {
            return false;
        }
        ResourceEvent resourceEvent = (ResourceEvent) other;
        return this.date == resourceEvent.date && wl7.b(this.application, resourceEvent.application) && wl7.b(this.service, resourceEvent.service) && wl7.b(this.version, resourceEvent.version) && wl7.b(this.buildVersion, resourceEvent.buildVersion) && wl7.b(this.buildId, resourceEvent.buildId) && wl7.b(this.session, resourceEvent.session) && this.source == resourceEvent.source && wl7.b(this.view, resourceEvent.view) && wl7.b(this.usr, resourceEvent.usr) && wl7.b(this.account, resourceEvent.account) && wl7.b(this.connectivity, resourceEvent.connectivity) && wl7.b(this.display, resourceEvent.display) && wl7.b(this.synthetics, resourceEvent.synthetics) && wl7.b(this.ciTest, resourceEvent.ciTest) && wl7.b(this.os, resourceEvent.os) && wl7.b(this.device, resourceEvent.device) && wl7.b(this.dd, resourceEvent.dd) && wl7.b(this.context, resourceEvent.context) && wl7.b(this.action, resourceEvent.action) && wl7.b(this.container, resourceEvent.container) && wl7.b(this.resource, resourceEvent.resource);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Action getAction() {
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

    public final Resource getResource() {
        return this.resource;
    }

    public final String getService() {
        return this.service;
    }

    public final ResourceEventSession getSession() {
        return this.session;
    }

    public final ResourceEventSource getSource() {
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

    public final ResourceEventView getView() {
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
        ResourceEventSource resourceEventSource = this.source;
        int iHashCode6 = (this.view.hashCode() + ((iHashCode5 + (resourceEventSource == null ? 0 : resourceEventSource.hashCode())) * 31)) * 31;
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
        Action action = this.action;
        int iHashCode16 = (iHashCode15 + (action == null ? 0 : action.hashCode())) * 31;
        Container container = this.container;
        return this.resource.hashCode() + ((iHashCode16 + (container != null ? container.hashCode() : 0)) * 31);
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
        ResourceEventSource resourceEventSource = this.source;
        if (resourceEventSource != null) {
            ab8Var.i("source", resourceEventSource.toJson());
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
        Action action = this.action;
        if (action != null) {
            ab8Var.i(RumEventDeserializer.EVENT_TYPE_ACTION, action.toJson());
        }
        Container container = this.container;
        if (container != null) {
            ab8Var.i("container", container.toJson());
        }
        ab8Var.l("type", this.type);
        ab8Var.i(RumEventDeserializer.EVENT_TYPE_RESOURCE, this.resource.toJson());
        return ab8Var;
    }

    public String toString() {
        long j = this.date;
        Application application = this.application;
        String str = this.service;
        String str2 = this.version;
        String str3 = this.buildVersion;
        String str4 = this.buildId;
        ResourceEventSession resourceEventSession = this.session;
        ResourceEventSource resourceEventSource = this.source;
        ResourceEventView resourceEventView = this.view;
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
        Action action = this.action;
        Container container = this.container;
        Resource resource = this.resource;
        StringBuilder sb = new StringBuilder("ResourceEvent(date=");
        sb.append(j);
        sb.append(", application=");
        sb.append(application);
        ia.r(sb, ", service=", str, ", version=", str2);
        ia.r(sb, ", buildVersion=", str3, ", buildId=", str4);
        sb.append(", session=");
        sb.append(resourceEventSession);
        sb.append(", source=");
        sb.append(resourceEventSource);
        sb.append(", view=");
        sb.append(resourceEventView);
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
        sb.append(", action=");
        sb.append(action);
        sb.append(", container=");
        sb.append(container);
        sb.append(", resource=");
        sb.append(resource);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$Account;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Account;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Action;", "", "", "", "id", "<init>", "(Ljava/util/List;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/datadog/android/rum/model/ResourceEvent$Action;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Action {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> id;

        public Action(List<String> list) {
            list.getClass();
            this.id = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Action copy$default(Action action, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = action.id;
            }
            return action.copy(list);
        }

        public static final Action fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Action fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public final List<String> component1() {
            return this.id;
        }

        public final Action copy(List<String> id) {
            id.getClass();
            return new Action(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && wl7.b(this.id, ((Action) other).id);
        }

        public final List<String> getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            w98 w98Var = new w98(this.id.size());
            Iterator<T> it = this.id.iterator();
            while (it.hasNext()) {
                w98Var.j((String) it.next());
            }
            ab8Var.i("id", w98Var);
            return ab8Var;
        }

        public String toString() {
            return g7.h("Action(id=", ")", this.id);
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Action;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Action;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    w98 w98VarC = jsonObject.m("id").c();
                    ArrayList arrayList = new ArrayList(w98VarC.a.size());
                    Iterator<ka8> it = w98VarC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().g());
                    }
                    return new Action(arrayList);
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTechnology", "getCarrierName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestExecutionId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getSessionSampleRate", "getSessionReplaySampleRate", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "", "", "duration", "start", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Connect {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public Connect(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public static /* synthetic */ Connect copy$default(Connect connect, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = connect.duration;
            }
            if ((i & 2) != 0) {
                j2 = connect.start;
            }
            return connect.copy(j, j2);
        }

        public static final Connect fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Connect fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final Connect copy(long duration, long start) {
            return new Connect(duration, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Connect)) {
                return false;
            }
            Connect connect = (Connect) other;
            return this.duration == connect.duration && this.start == connect.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.start, ")", w40.i(this.duration, "Connect(duration=", ", start="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connect$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Connect fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Connect", e);
                    return null;
                }
            }

            public final Connect fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Connect(jsonObject.m("duration").e(), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Connect", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Connect", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Connect", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006-"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "status", "", "Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;Lcom/datadog/android/rum/model/ResourceEvent$Cellular;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$Status;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;Lcom/datadog/android/rum/model/ResourceEvent$Cellular;)Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "getStatus", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "getEffectiveType", "Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "getCellular", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Container;", "", "Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;)Lcom/datadog/android/rum/model/ResourceEvent$Container;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "getView", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "getSource", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Container {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ResourceEventSource source;
        private final ContainerView view;

        public Container(ContainerView containerView, ResourceEventSource resourceEventSource) {
            containerView.getClass();
            resourceEventSource.getClass();
            this.view = containerView;
            this.source = resourceEventSource;
        }

        public static /* synthetic */ Container copy$default(Container container, ContainerView containerView, ResourceEventSource resourceEventSource, int i, Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                resourceEventSource = container.source;
            }
            return container.copy(containerView, resourceEventSource);
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
        public final ResourceEventSource getSource() {
            return this.source;
        }

        public final Container copy(ContainerView view, ResourceEventSource source) {
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

        public final ResourceEventSource getSource() {
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Container;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Container;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ResourceEventSource.Companion companion = ResourceEventSource.INSTANCE;
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$Context;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Context;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Context;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJd\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001eR\u001a\u00105\u001a\u0002048\u0006X\u0086D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "", "Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "configuration", "", "browserSdkVersion", "spanId", "traceId", "", "rulePsr", "", "discarded", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$DdSession;Lcom/datadog/android/rum/model/ResourceEvent$Configuration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/lang/Number;", "component7", "()Ljava/lang/Boolean;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$DdSession;Lcom/datadog/android/rum/model/ResourceEvent$Configuration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "getSession", "Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "getConfiguration", "Ljava/lang/String;", "getBrowserSdkVersion", "getSpanId", "getTraceId", "Ljava/lang/Number;", "getRulePsr", "Ljava/lang/Boolean;", "getDiscarded", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String browserSdkVersion;
        private final Configuration configuration;
        private final Boolean discarded;
        private final long formatVersion;
        private final Number rulePsr;
        private final DdSession session;
        private final String spanId;
        private final String traceId;

        public /* synthetic */ Dd(DdSession ddSession, Configuration configuration, String str, String str2, String str3, Number number, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : number, (i & 64) != 0 ? null : bool);
        }

        public static /* synthetic */ Dd copy$default(Dd dd, DdSession ddSession, Configuration configuration, String str, String str2, String str3, Number number, Boolean bool, int i, Object obj) {
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
                str2 = dd.spanId;
            }
            if ((i & 16) != 0) {
                str3 = dd.traceId;
            }
            if ((i & 32) != 0) {
                number = dd.rulePsr;
            }
            if ((i & 64) != 0) {
                bool = dd.discarded;
            }
            Number number2 = number;
            Boolean bool2 = bool;
            String str4 = str3;
            String str5 = str;
            return dd.copy(ddSession, configuration, str5, str2, str4, number2, bool2);
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
        public final String getSpanId() {
            return this.spanId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTraceId() {
            return this.traceId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Number getRulePsr() {
            return this.rulePsr;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getDiscarded() {
            return this.discarded;
        }

        public final Dd copy(DdSession session, Configuration configuration, String browserSdkVersion, String spanId, String traceId, Number rulePsr, Boolean discarded) {
            return new Dd(session, configuration, browserSdkVersion, spanId, traceId, rulePsr, discarded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) other;
            return wl7.b(this.session, dd.session) && wl7.b(this.configuration, dd.configuration) && wl7.b(this.browserSdkVersion, dd.browserSdkVersion) && wl7.b(this.spanId, dd.spanId) && wl7.b(this.traceId, dd.traceId) && wl7.b(this.rulePsr, dd.rulePsr) && wl7.b(this.discarded, dd.discarded);
        }

        public final String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final Boolean getDiscarded() {
            return this.discarded;
        }

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final Number getRulePsr() {
            return this.rulePsr;
        }

        public final DdSession getSession() {
            return this.session;
        }

        public final String getSpanId() {
            return this.spanId;
        }

        public final String getTraceId() {
            return this.traceId;
        }

        public int hashCode() {
            DdSession ddSession = this.session;
            int iHashCode = (ddSession == null ? 0 : ddSession.hashCode()) * 31;
            Configuration configuration = this.configuration;
            int iHashCode2 = (iHashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            String str = this.browserSdkVersion;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.spanId;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.traceId;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Number number = this.rulePsr;
            int iHashCode6 = (iHashCode5 + (number == null ? 0 : number.hashCode())) * 31;
            Boolean bool = this.discarded;
            return iHashCode6 + (bool != null ? bool.hashCode() : 0);
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
            String str2 = this.spanId;
            if (str2 != null) {
                ab8Var.l("span_id", str2);
            }
            String str3 = this.traceId;
            if (str3 != null) {
                ab8Var.l("trace_id", str3);
            }
            Number number = this.rulePsr;
            if (number != null) {
                ab8Var.j(number, "rule_psr");
            }
            Boolean bool = this.discarded;
            if (bool != null) {
                ab8Var.k("discarded", bool);
            }
            return ab8Var;
        }

        public String toString() {
            DdSession ddSession = this.session;
            Configuration configuration = this.configuration;
            String str = this.browserSdkVersion;
            String str2 = this.spanId;
            String str3 = this.traceId;
            Number number = this.rulePsr;
            Boolean bool = this.discarded;
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(ddSession);
            sb.append(", configuration=");
            sb.append(configuration);
            sb.append(", browserSdkVersion=");
            ia.r(sb, str, ", spanId=", str2, ", traceId=");
            sb.append(str3);
            sb.append(", rulePsr=");
            sb.append(number);
            sb.append(", discarded=");
            return l5.n(sb, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ka8 ka8VarM4 = jsonObject.m("span_id");
                    String strG2 = ka8VarM4 != null ? ka8VarM4.g() : null;
                    ka8 ka8VarM5 = jsonObject.m("trace_id");
                    String strG3 = ka8VarM5 != null ? ka8VarM5.g() : null;
                    ka8 ka8VarM6 = jsonObject.m("rule_psr");
                    Number numberF = ka8VarM6 != null ? ka8VarM6.f() : null;
                    ka8 ka8VarM7 = jsonObject.m("discarded");
                    Boolean boolValueOf = ka8VarM7 != null ? Boolean.valueOf(ka8VarM7.a()) : null;
                    if (jE == 2) {
                        return new Dd(ddSessionFromJsonObject, configurationFromJsonObject, strG, strG2, strG3, numberF, boolValueOf);
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

        public Dd(DdSession ddSession, Configuration configuration, String str, String str2, String str3, Number number, Boolean bool) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.spanId = str2;
            this.traceId = str3;
            this.rulePsr = number;
            this.discarded = bool;
            this.formatVersion = 2L;
        }

        public Dd() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Plan;Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$Plan;Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "getSessionPrecondition", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CACHE", "NAVIGATIONAL_PREFETCH", "OTHER", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum DeliveryType {
        CACHE("cache"),
        NAVIGATIONAL_PREFETCH("navigational-prefetch"),
        OTHER("other");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        DeliveryType(String str) {
            this.jsonValue = str;
        }

        public static final DeliveryType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DeliveryType fromJson(String jsonString) {
                jsonString.getClass();
                for (DeliveryType deliveryType : DeliveryType.values()) {
                    if (wl7.b(deliveryType.jsonValue, jsonString)) {
                        return deliveryType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Device;", "", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "getType", "Ljava/lang/String;", "getName", "getModel", "getBrand", "getArchitecture", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeviceType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Display;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "viewport", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Viewport;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$Viewport;)Lcom/datadog/android/rum/model/ResourceEvent$Display;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "getViewport", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Display;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Display;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "", "", "duration", "start", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dns {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public Dns(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public static /* synthetic */ Dns copy$default(Dns dns, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dns.duration;
            }
            if ((i & 2) != 0) {
                j2 = dns.start;
            }
            return dns.copy(j, j2);
        }

        public static final Dns fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Dns fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final Dns copy(long duration, long start) {
            return new Dns(duration, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dns)) {
                return false;
            }
            Dns dns = (Dns) other;
            return this.duration == dns.duration && this.start == dns.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.start, ")", w40.i(this.duration, "Dns(duration=", ", start="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dns$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Dns fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Dns", e);
                    return null;
                }
            }

            public final Dns fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Dns(jsonObject.m("duration").e(), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Dns", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Dns", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Dns", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Download;", "", "", "duration", "start", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Download;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Download {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public Download(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public static /* synthetic */ Download copy$default(Download download, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = download.duration;
            }
            if ((i & 2) != 0) {
                j2 = download.start;
            }
            return download.copy(j, j2);
        }

        public static final Download fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Download fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final Download copy(long duration, long start) {
            return new Download(duration, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Download)) {
                return false;
            }
            Download download = (Download) other;
            return this.duration == download.duration && this.start == download.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.start, ")", w40.i(this.duration, "Download(duration=", ", start="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Download$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Download;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Download;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Download fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Download", e);
                    return null;
                }
            }

            public final Download fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Download(jsonObject.m("duration").e(), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Download", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Download", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Download", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "SLOW_2G", "2G", "3G", "4G", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        f92G("2g"),
        f103G("3g"),
        f114G("4g");


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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "", "", "duration", "start", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class FirstByte {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public FirstByte(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public static /* synthetic */ FirstByte copy$default(FirstByte firstByte, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = firstByte.duration;
            }
            if ((i & 2) != 0) {
                j2 = firstByte.start;
            }
            return firstByte.copy(j, j2);
        }

        public static final FirstByte fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final FirstByte fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final FirstByte copy(long duration, long start) {
            return new FirstByte(duration, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirstByte)) {
                return false;
            }
            FirstByte firstByte = (FirstByte) other;
            return this.duration == firstByte.duration && this.start == firstByte.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.start, ")", w40.i(this.duration, "FirstByte(duration=", ", start="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$FirstByte$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FirstByte fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type FirstByte", e);
                    return null;
                }
            }

            public final FirstByte fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new FirstByte(jsonObject.m("duration").e(), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type FirstByte", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type FirstByte", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type FirstByte", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "operationType", "", "operationName", "payload", "variables", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "getOperationType", "Ljava/lang/String;", "getOperationName", "getPayload", "setPayload", "(Ljava/lang/String;)V", "getVariables", "setVariables", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Graphql {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String operationName;
        private final OperationType operationType;
        private String payload;
        private String variables;

        public /* synthetic */ Graphql(OperationType operationType, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(operationType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public static /* synthetic */ Graphql copy$default(Graphql graphql, OperationType operationType, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                operationType = graphql.operationType;
            }
            if ((i & 2) != 0) {
                str = graphql.operationName;
            }
            if ((i & 4) != 0) {
                str2 = graphql.payload;
            }
            if ((i & 8) != 0) {
                str3 = graphql.variables;
            }
            return graphql.copy(operationType, str, str2, str3);
        }

        public static final Graphql fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Graphql fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OperationType getOperationType() {
            return this.operationType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOperationName() {
            return this.operationName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVariables() {
            return this.variables;
        }

        public final Graphql copy(OperationType operationType, String operationName, String payload, String variables) {
            operationType.getClass();
            return new Graphql(operationType, operationName, payload, variables);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Graphql)) {
                return false;
            }
            Graphql graphql = (Graphql) other;
            return this.operationType == graphql.operationType && wl7.b(this.operationName, graphql.operationName) && wl7.b(this.payload, graphql.payload) && wl7.b(this.variables, graphql.variables);
        }

        public final String getOperationName() {
            return this.operationName;
        }

        public final OperationType getOperationType() {
            return this.operationType;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final String getVariables() {
            return this.variables;
        }

        public int hashCode() {
            int iHashCode = this.operationType.hashCode() * 31;
            String str = this.operationName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.payload;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.variables;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setPayload(String str) {
            this.payload = str;
        }

        public final void setVariables(String str) {
            this.variables = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("operationType", this.operationType.toJson());
            String str = this.operationName;
            if (str != null) {
                ab8Var.l("operationName", str);
            }
            String str2 = this.payload;
            if (str2 != null) {
                ab8Var.l("payload", str2);
            }
            String str3 = this.variables;
            if (str3 != null) {
                ab8Var.l("variables", str3);
            }
            return ab8Var;
        }

        public String toString() {
            OperationType operationType = this.operationType;
            String str = this.operationName;
            String str2 = this.payload;
            String str3 = this.variables;
            StringBuilder sb = new StringBuilder("Graphql(operationType=");
            sb.append(operationType);
            sb.append(", operationName=");
            sb.append(str);
            sb.append(", payload=");
            return z3.n(sb, str2, ", variables=", str3, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Graphql$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Graphql fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Graphql", e);
                    return null;
                }
            }

            public final Graphql fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    OperationType.Companion companion = OperationType.INSTANCE;
                    String strG = jsonObject.m("operationType").g();
                    strG.getClass();
                    OperationType operationTypeFromJson = companion.fromJson(strG);
                    ka8 ka8VarM = jsonObject.m("operationName");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("payload");
                    String strG3 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("variables");
                    return new Graphql(operationTypeFromJson, strG2, strG3, ka8VarM3 != null ? ka8VarM3.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Graphql", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Graphql", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Graphql", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Graphql(OperationType operationType, String str, String str2, String str3) {
            operationType.getClass();
            this.operationType = operationType;
            this.operationName = str;
            this.payload = str2;
            this.variables = str3;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Interface$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Method;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "POST", "GET", "HEAD", "PUT", "DELETE", "PATCH", "TRACE", "OPTIONS", "CONNECT", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Method {
        POST("POST"),
        GET("GET"),
        HEAD("HEAD"),
        PUT("PUT"),
        DELETE("DELETE"),
        PATCH("PATCH"),
        TRACE("TRACE"),
        OPTIONS("OPTIONS"),
        CONNECT("CONNECT");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Method(String str) {
            this.jsonValue = str;
        }

        public static final Method fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Method$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Method fromJson(String jsonString) {
                jsonString.getClass();
                for (Method method : Method.values()) {
                    if (wl7.b(method.jsonValue, jsonString)) {
                        return method;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "QUERY", "MUTATION", "SUBSCRIPTION", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum OperationType {
        QUERY("query"),
        MUTATION("mutation"),
        SUBSCRIPTION("subscription");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        OperationType(String str) {
            this.jsonValue = str;
        }

        public static final OperationType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$OperationType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OperationType fromJson(String jsonString) {
                jsonString.getClass();
                for (OperationType operationType : OperationType.values()) {
                    if (wl7.b(operationType.jsonValue, jsonString)) {
                        return operationType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "getBuild", "getVersionMajor", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/Number;", "Companion", "PLAN_1", "PLAN_2", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Plan$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "", "", "domain", "name", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;)Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDomain", "getName", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "getType", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Provider {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String domain;
        private final String name;
        private final ProviderType type;

        public /* synthetic */ Provider(String str, String str2, ProviderType providerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : providerType);
        }

        public static /* synthetic */ Provider copy$default(Provider provider, String str, String str2, ProviderType providerType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = provider.domain;
            }
            if ((i & 2) != 0) {
                str2 = provider.name;
            }
            if ((i & 4) != 0) {
                providerType = provider.type;
            }
            return provider.copy(str, str2, providerType);
        }

        public static final Provider fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Provider fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDomain() {
            return this.domain;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ProviderType getType() {
            return this.type;
        }

        public final Provider copy(String domain, String name, ProviderType type) {
            return new Provider(domain, name, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) other;
            return wl7.b(this.domain, provider.domain) && wl7.b(this.name, provider.name) && this.type == provider.type;
        }

        public final String getDomain() {
            return this.domain;
        }

        public final String getName() {
            return this.name;
        }

        public final ProviderType getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.domain;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ProviderType providerType = this.type;
            return iHashCode2 + (providerType != null ? providerType.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.domain;
            if (str != null) {
                ab8Var.l("domain", str);
            }
            String str2 = this.name;
            if (str2 != null) {
                ab8Var.l("name", str2);
            }
            ProviderType providerType = this.type;
            if (providerType != null) {
                ab8Var.i("type", providerType.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.domain;
            String str2 = this.name;
            ProviderType providerType = this.type;
            StringBuilder sbF = u40.f("Provider(domain=", str, ", name=", str2, ", type=");
            sbF.append(providerType);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Provider$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Provider fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Provider", e);
                    return null;
                }
            }

            public final Provider fromJsonObject(ab8 jsonObject) {
                String strG;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("domain");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("name");
                    String strG3 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("type");
                    return new Provider(strG2, strG3, (ka8VarM3 == null || (strG = ka8VarM3.g()) == null) ? null : ProviderType.INSTANCE.fromJson(strG));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Provider", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Provider", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Provider", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Provider(String str, String str2, ProviderType providerType) {
            this.domain = str;
            this.name = str2;
            this.type = providerType;
        }

        public Provider() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "AD", "ADVERTISING", "ANALYTICS", "CDN", "CONTENT", "CUSTOMER_SUCCESS", "FIRST_PARTY", "HOSTING", "MARKETING", "OTHER", "SOCIAL", "TAG_MANAGER", "UTILITY", "VIDEO", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ProviderType {
        AD("ad"),
        ADVERTISING("advertising"),
        ANALYTICS("analytics"),
        CDN("cdn"),
        CONTENT("content"),
        CUSTOMER_SUCCESS("customer-success"),
        FIRST_PARTY("first party"),
        HOSTING("hosting"),
        MARKETING("marketing"),
        OTHER("other"),
        SOCIAL("social"),
        TAG_MANAGER("tag-manager"),
        UTILITY("utility"),
        VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ProviderType(String str) {
            this.jsonValue = str;
        }

        public static final ProviderType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ProviderType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ProviderType fromJson(String jsonString) {
                jsonString.getClass();
                for (ProviderType providerType : ProviderType.values()) {
                    if (wl7.b(providerType.jsonValue, jsonString)) {
                        return providerType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "", "", "duration", "start", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Redirect {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public Redirect(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public static /* synthetic */ Redirect copy$default(Redirect redirect, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = redirect.duration;
            }
            if ((i & 2) != 0) {
                j2 = redirect.start;
            }
            return redirect.copy(j, j2);
        }

        public static final Redirect fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Redirect fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final Redirect copy(long duration, long start) {
            return new Redirect(duration, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) other;
            return this.duration == redirect.duration && this.start == redirect.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.start, ")", w40.i(this.duration, "Redirect(duration=", ", start="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Redirect$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Redirect fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Redirect", e);
                    return null;
                }
            }

            public final Redirect fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Redirect(jsonObject.m("duration").e(), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Redirect", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Redirect", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Redirect", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "BLOCKING", "NON_BLOCKING", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum RenderBlockingStatus {
        BLOCKING("blocking"),
        NON_BLOCKING("non-blocking");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        RenderBlockingStatus(String str) {
            this.jsonValue = str;
        }

        public static final RenderBlockingStatus fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RenderBlockingStatus fromJson(String jsonString) {
                jsonString.getClass();
                for (RenderBlockingStatus renderBlockingStatus : RenderBlockingStatus.values()) {
                    if (wl7.b(renderBlockingStatus.jsonValue, jsonString)) {
                        return renderBlockingStatus;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\b\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B\u0087\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b7\u00104J\u0012\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b8\u00104J\u0012\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b9\u00104J\u0012\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010-J\u0012\u0010K\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0094\u0002\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bS\u0010-J\u0010\u0010U\u001a\u00020THÖ\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010Y\u001a\u00020X2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bY\u0010ZR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010]\u001a\u0004\b^\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\b`\u00101R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010[\u001a\u0004\ba\u0010-\"\u0004\bb\u0010cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010d\u001a\u0004\be\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010d\u001a\u0004\bf\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\bg\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010d\u001a\u0004\bh\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010d\u001a\u0004\bi\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010d\u001a\u0004\bj\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010k\u001a\u0004\bl\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010m\u001a\u0004\bn\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010o\u001a\u0004\bp\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010q\u001a\u0004\br\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010s\u001a\u0004\bt\u0010CR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010u\u001a\u0004\bv\u0010ER\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010w\u001a\u0004\bx\u0010GR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010y\u001a\u0004\bz\u0010IR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010[\u001a\u0004\b{\u0010-R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010|\u001a\u0004\b}\u0010LR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010~\u001a\u0004\b\u007f\u0010NR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010P¨\u0006\u0083\u0001"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "", "", "id", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "type", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "method", "url", "", "statusCode", "duration", "size", "encodedBodySize", "decodedBodySize", "transferSize", "Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "renderBlockingStatus", "Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "worker", "Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "redirect", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "dns", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "connect", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "ssl", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "firstByte", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "download", "protocol", "Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "deliveryType", "Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "provider", "Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "graphql", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;Lcom/datadog/android/rum/model/ResourceEvent$Method;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;Lcom/datadog/android/rum/model/ResourceEvent$Worker;Lcom/datadog/android/rum/model/ResourceEvent$Redirect;Lcom/datadog/android/rum/model/ResourceEvent$Dns;Lcom/datadog/android/rum/model/ResourceEvent$Connect;Lcom/datadog/android/rum/model/ResourceEvent$Ssl;Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;Lcom/datadog/android/rum/model/ResourceEvent$Download;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;Lcom/datadog/android/rum/model/ResourceEvent$Provider;Lcom/datadog/android/rum/model/ResourceEvent$Graphql;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "component3", "()Lcom/datadog/android/rum/model/ResourceEvent$Method;", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "component12", "()Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "component13", "()Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "component14", "()Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "component15", "()Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "component16", "()Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "component17", "()Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "component18", "()Lcom/datadog/android/rum/model/ResourceEvent$Download;", "component19", "component20", "()Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "component21", "()Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "component22", "()Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;Lcom/datadog/android/rum/model/ResourceEvent$Method;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;Lcom/datadog/android/rum/model/ResourceEvent$Worker;Lcom/datadog/android/rum/model/ResourceEvent$Redirect;Lcom/datadog/android/rum/model/ResourceEvent$Dns;Lcom/datadog/android/rum/model/ResourceEvent$Connect;Lcom/datadog/android/rum/model/ResourceEvent$Ssl;Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;Lcom/datadog/android/rum/model/ResourceEvent$Download;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;Lcom/datadog/android/rum/model/ResourceEvent$Provider;Lcom/datadog/android/rum/model/ResourceEvent$Graphql;)Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "getType", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "getMethod", "getUrl", "setUrl", "(Ljava/lang/String;)V", "Ljava/lang/Long;", "getStatusCode", "getDuration", "getSize", "getEncodedBodySize", "getDecodedBodySize", "getTransferSize", "Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "getRenderBlockingStatus", "Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "getWorker", "Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "getRedirect", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "getDns", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "getConnect", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "getSsl", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "getFirstByte", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "getDownload", "getProtocol", "Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "getDeliveryType", "Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "getProvider", "Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "getGraphql", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Resource {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Connect connect;
        private final Long decodedBodySize;
        private final DeliveryType deliveryType;
        private final Dns dns;
        private final Download download;
        private final Long duration;
        private final Long encodedBodySize;
        private final FirstByte firstByte;
        private final Graphql graphql;
        private final String id;
        private final Method method;
        private final String protocol;
        private final Provider provider;
        private final Redirect redirect;
        private final RenderBlockingStatus renderBlockingStatus;
        private final Long size;
        private final Ssl ssl;
        private final Long statusCode;
        private final Long transferSize;
        private final ResourceType type;
        private String url;
        private final Worker worker;

        public /* synthetic */ Resource(String str, ResourceType resourceType, Method method, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, RenderBlockingStatus renderBlockingStatus, Worker worker, Redirect redirect, Dns dns, Connect connect, Ssl ssl, FirstByte firstByte, Download download, String str3, DeliveryType deliveryType, Provider provider, Graphql graphql, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : method, str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : l4, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : l5, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : l6, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : renderBlockingStatus, (i & 2048) != 0 ? null : worker, (i & 4096) != 0 ? null : redirect, (i & 8192) != 0 ? null : dns, (i & 16384) != 0 ? null : connect, (32768 & i) != 0 ? null : ssl, (65536 & i) != 0 ? null : firstByte, (131072 & i) != 0 ? null : download, (262144 & i) != 0 ? null : str3, (524288 & i) != 0 ? null : deliveryType, (1048576 & i) != 0 ? null : provider, (i & 2097152) != 0 ? null : graphql);
        }

        public static /* synthetic */ Resource copy$default(Resource resource, String str, ResourceType resourceType, Method method, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, RenderBlockingStatus renderBlockingStatus, Worker worker, Redirect redirect, Dns dns, Connect connect, Ssl ssl, FirstByte firstByte, Download download, String str3, DeliveryType deliveryType, Provider provider, Graphql graphql, int i, Object obj) {
            Graphql graphql2;
            Provider provider2;
            String str4 = (i & 1) != 0 ? resource.id : str;
            ResourceType resourceType2 = (i & 2) != 0 ? resource.type : resourceType;
            Method method2 = (i & 4) != 0 ? resource.method : method;
            String str5 = (i & 8) != 0 ? resource.url : str2;
            Long l7 = (i & 16) != 0 ? resource.statusCode : l;
            Long l8 = (i & 32) != 0 ? resource.duration : l2;
            Long l9 = (i & 64) != 0 ? resource.size : l3;
            Long l10 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? resource.encodedBodySize : l4;
            Long l11 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? resource.decodedBodySize : l5;
            Long l12 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? resource.transferSize : l6;
            RenderBlockingStatus renderBlockingStatus2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? resource.renderBlockingStatus : renderBlockingStatus;
            Worker worker2 = (i & 2048) != 0 ? resource.worker : worker;
            Redirect redirect2 = (i & 4096) != 0 ? resource.redirect : redirect;
            Dns dns2 = (i & 8192) != 0 ? resource.dns : dns;
            String str6 = str4;
            Connect connect2 = (i & 16384) != 0 ? resource.connect : connect;
            Ssl ssl2 = (i & 32768) != 0 ? resource.ssl : ssl;
            FirstByte firstByte2 = (i & 65536) != 0 ? resource.firstByte : firstByte;
            Download download2 = (i & 131072) != 0 ? resource.download : download;
            String str7 = (i & 262144) != 0 ? resource.protocol : str3;
            DeliveryType deliveryType2 = (i & 524288) != 0 ? resource.deliveryType : deliveryType;
            Provider provider3 = (i & 1048576) != 0 ? resource.provider : provider;
            if ((i & 2097152) != 0) {
                provider2 = provider3;
                graphql2 = resource.graphql;
            } else {
                graphql2 = graphql;
                provider2 = provider3;
            }
            return resource.copy(str6, resourceType2, method2, str5, l7, l8, l9, l10, l11, l12, renderBlockingStatus2, worker2, redirect2, dns2, connect2, ssl2, firstByte2, download2, str7, deliveryType2, provider2, graphql2);
        }

        public static final Resource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Resource fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Long getTransferSize() {
            return this.transferSize;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final RenderBlockingStatus getRenderBlockingStatus() {
            return this.renderBlockingStatus;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Worker getWorker() {
            return this.worker;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Redirect getRedirect() {
            return this.redirect;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Dns getDns() {
            return this.dns;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final Connect getConnect() {
            return this.connect;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Ssl getSsl() {
            return this.ssl;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final FirstByte getFirstByte() {
            return this.firstByte;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final Download getDownload() {
            return this.download;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getProtocol() {
            return this.protocol;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ResourceType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final DeliveryType getDeliveryType() {
            return this.deliveryType;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Provider getProvider() {
            return this.provider;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Graphql getGraphql() {
            return this.graphql;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getStatusCode() {
            return this.statusCode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Long getEncodedBodySize() {
            return this.encodedBodySize;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Long getDecodedBodySize() {
            return this.decodedBodySize;
        }

        public final Resource copy(String id, ResourceType type, Method method, String url, Long statusCode, Long duration, Long size, Long encodedBodySize, Long decodedBodySize, Long transferSize, RenderBlockingStatus renderBlockingStatus, Worker worker, Redirect redirect, Dns dns, Connect connect, Ssl ssl, FirstByte firstByte, Download download, String protocol, DeliveryType deliveryType, Provider provider, Graphql graphql) {
            type.getClass();
            url.getClass();
            return new Resource(id, type, method, url, statusCode, duration, size, encodedBodySize, decodedBodySize, transferSize, renderBlockingStatus, worker, redirect, dns, connect, ssl, firstByte, download, protocol, deliveryType, provider, graphql);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) other;
            return wl7.b(this.id, resource.id) && this.type == resource.type && this.method == resource.method && wl7.b(this.url, resource.url) && wl7.b(this.statusCode, resource.statusCode) && wl7.b(this.duration, resource.duration) && wl7.b(this.size, resource.size) && wl7.b(this.encodedBodySize, resource.encodedBodySize) && wl7.b(this.decodedBodySize, resource.decodedBodySize) && wl7.b(this.transferSize, resource.transferSize) && this.renderBlockingStatus == resource.renderBlockingStatus && wl7.b(this.worker, resource.worker) && wl7.b(this.redirect, resource.redirect) && wl7.b(this.dns, resource.dns) && wl7.b(this.connect, resource.connect) && wl7.b(this.ssl, resource.ssl) && wl7.b(this.firstByte, resource.firstByte) && wl7.b(this.download, resource.download) && wl7.b(this.protocol, resource.protocol) && this.deliveryType == resource.deliveryType && wl7.b(this.provider, resource.provider) && wl7.b(this.graphql, resource.graphql);
        }

        public final Connect getConnect() {
            return this.connect;
        }

        public final Long getDecodedBodySize() {
            return this.decodedBodySize;
        }

        public final DeliveryType getDeliveryType() {
            return this.deliveryType;
        }

        public final Dns getDns() {
            return this.dns;
        }

        public final Download getDownload() {
            return this.download;
        }

        public final Long getDuration() {
            return this.duration;
        }

        public final Long getEncodedBodySize() {
            return this.encodedBodySize;
        }

        public final FirstByte getFirstByte() {
            return this.firstByte;
        }

        public final Graphql getGraphql() {
            return this.graphql;
        }

        public final String getId() {
            return this.id;
        }

        public final Method getMethod() {
            return this.method;
        }

        public final String getProtocol() {
            return this.protocol;
        }

        public final Provider getProvider() {
            return this.provider;
        }

        public final Redirect getRedirect() {
            return this.redirect;
        }

        public final RenderBlockingStatus getRenderBlockingStatus() {
            return this.renderBlockingStatus;
        }

        public final Long getSize() {
            return this.size;
        }

        public final Ssl getSsl() {
            return this.ssl;
        }

        public final Long getStatusCode() {
            return this.statusCode;
        }

        public final Long getTransferSize() {
            return this.transferSize;
        }

        public final ResourceType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final Worker getWorker() {
            return this.worker;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            Method method = this.method;
            int iD = akb.d((iHashCode + (method == null ? 0 : method.hashCode())) * 31, 31, this.url);
            Long l = this.statusCode;
            int iHashCode2 = (iD + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.duration;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.size;
            int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.encodedBodySize;
            int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.decodedBodySize;
            int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
            Long l6 = this.transferSize;
            int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
            RenderBlockingStatus renderBlockingStatus = this.renderBlockingStatus;
            int iHashCode8 = (iHashCode7 + (renderBlockingStatus == null ? 0 : renderBlockingStatus.hashCode())) * 31;
            Worker worker = this.worker;
            int iHashCode9 = (iHashCode8 + (worker == null ? 0 : worker.hashCode())) * 31;
            Redirect redirect = this.redirect;
            int iHashCode10 = (iHashCode9 + (redirect == null ? 0 : redirect.hashCode())) * 31;
            Dns dns = this.dns;
            int iHashCode11 = (iHashCode10 + (dns == null ? 0 : dns.hashCode())) * 31;
            Connect connect = this.connect;
            int iHashCode12 = (iHashCode11 + (connect == null ? 0 : connect.hashCode())) * 31;
            Ssl ssl = this.ssl;
            int iHashCode13 = (iHashCode12 + (ssl == null ? 0 : ssl.hashCode())) * 31;
            FirstByte firstByte = this.firstByte;
            int iHashCode14 = (iHashCode13 + (firstByte == null ? 0 : firstByte.hashCode())) * 31;
            Download download = this.download;
            int iHashCode15 = (iHashCode14 + (download == null ? 0 : download.hashCode())) * 31;
            String str2 = this.protocol;
            int iHashCode16 = (iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeliveryType deliveryType = this.deliveryType;
            int iHashCode17 = (iHashCode16 + (deliveryType == null ? 0 : deliveryType.hashCode())) * 31;
            Provider provider = this.provider;
            int iHashCode18 = (iHashCode17 + (provider == null ? 0 : provider.hashCode())) * 31;
            Graphql graphql = this.graphql;
            return iHashCode18 + (graphql != null ? graphql.hashCode() : 0);
        }

        public final void setUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            ab8Var.i("type", this.type.toJson());
            Method method = this.method;
            if (method != null) {
                ab8Var.i("method", method.toJson());
            }
            ab8Var.l("url", this.url);
            Long l = this.statusCode;
            if (l != null) {
                ia.o(l, ab8Var, "status_code");
            }
            Long l2 = this.duration;
            if (l2 != null) {
                ia.o(l2, ab8Var, "duration");
            }
            Long l3 = this.size;
            if (l3 != null) {
                ia.o(l3, ab8Var, "size");
            }
            Long l4 = this.encodedBodySize;
            if (l4 != null) {
                ia.o(l4, ab8Var, "encoded_body_size");
            }
            Long l5 = this.decodedBodySize;
            if (l5 != null) {
                ia.o(l5, ab8Var, "decoded_body_size");
            }
            Long l6 = this.transferSize;
            if (l6 != null) {
                ia.o(l6, ab8Var, "transfer_size");
            }
            RenderBlockingStatus renderBlockingStatus = this.renderBlockingStatus;
            if (renderBlockingStatus != null) {
                ab8Var.i("render_blocking_status", renderBlockingStatus.toJson());
            }
            Worker worker = this.worker;
            if (worker != null) {
                ab8Var.i("worker", worker.toJson());
            }
            Redirect redirect = this.redirect;
            if (redirect != null) {
                ab8Var.i("redirect", redirect.toJson());
            }
            Dns dns = this.dns;
            if (dns != null) {
                ab8Var.i("dns", dns.toJson());
            }
            Connect connect = this.connect;
            if (connect != null) {
                ab8Var.i("connect", connect.toJson());
            }
            Ssl ssl = this.ssl;
            if (ssl != null) {
                ab8Var.i("ssl", ssl.toJson());
            }
            FirstByte firstByte = this.firstByte;
            if (firstByte != null) {
                ab8Var.i("first_byte", firstByte.toJson());
            }
            Download download = this.download;
            if (download != null) {
                ab8Var.i("download", download.toJson());
            }
            String str2 = this.protocol;
            if (str2 != null) {
                ab8Var.l("protocol", str2);
            }
            DeliveryType deliveryType = this.deliveryType;
            if (deliveryType != null) {
                ab8Var.i("delivery_type", deliveryType.toJson());
            }
            Provider provider = this.provider;
            if (provider != null) {
                ab8Var.i("provider", provider.toJson());
            }
            Graphql graphql = this.graphql;
            if (graphql != null) {
                ab8Var.i("graphql", graphql.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Resource(id=" + this.id + ", type=" + this.type + ", method=" + this.method + ", url=" + this.url + ", statusCode=" + this.statusCode + ", duration=" + this.duration + ", size=" + this.size + ", encodedBodySize=" + this.encodedBodySize + ", decodedBodySize=" + this.decodedBodySize + ", transferSize=" + this.transferSize + ", renderBlockingStatus=" + this.renderBlockingStatus + ", worker=" + this.worker + ", redirect=" + this.redirect + ", dns=" + this.dns + ", connect=" + this.connect + ", ssl=" + this.ssl + ", firstByte=" + this.firstByte + ", download=" + this.download + ", protocol=" + this.protocol + ", deliveryType=" + this.deliveryType + ", provider=" + this.provider + ", graphql=" + this.graphql + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Resource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

            /* JADX WARN: Multi-variable type inference failed */
            public final Resource fromJsonObject(ab8 jsonObject) {
                Resource resource;
                Redirect redirectFromJsonObject;
                String strG;
                String strG2;
                String strG3;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    String strG4 = ka8VarM != null ? ka8VarM.g() : null;
                    ResourceType.Companion companion = ResourceType.INSTANCE;
                    String strG5 = jsonObject.m("type").g();
                    strG5.getClass();
                    ResourceType resourceTypeFromJson = companion.fromJson(strG5);
                    ka8 ka8VarM2 = jsonObject.m("method");
                    Method methodFromJson = (ka8VarM2 == null || (strG3 = ka8VarM2.g()) == null) ? null : Method.INSTANCE.fromJson(strG3);
                    String strG6 = jsonObject.m("url").g();
                    ka8 ka8VarM3 = jsonObject.m("status_code");
                    Long lValueOf = ka8VarM3 != null ? Long.valueOf(ka8VarM3.e()) : null;
                    ka8 ka8VarM4 = jsonObject.m("duration");
                    Long lValueOf2 = ka8VarM4 != null ? Long.valueOf(ka8VarM4.e()) : null;
                    ka8 ka8VarM5 = jsonObject.m("size");
                    Long lValueOf3 = ka8VarM5 != null ? Long.valueOf(ka8VarM5.e()) : null;
                    ka8 ka8VarM6 = jsonObject.m("encoded_body_size");
                    Long lValueOf4 = ka8VarM6 != null ? Long.valueOf(ka8VarM6.e()) : null;
                    ka8 ka8VarM7 = jsonObject.m("decoded_body_size");
                    Long lValueOf5 = ka8VarM7 != null ? Long.valueOf(ka8VarM7.e()) : null;
                    ka8 ka8VarM8 = jsonObject.m("transfer_size");
                    Long lValueOf6 = ka8VarM8 != null ? Long.valueOf(ka8VarM8.e()) : null;
                    ka8 ka8VarM9 = jsonObject.m("render_blocking_status");
                    RenderBlockingStatus renderBlockingStatusFromJson = (ka8VarM9 == null || (strG2 = ka8VarM9.g()) == null) ? null : RenderBlockingStatus.INSTANCE.fromJson(strG2);
                    ka8 ka8VarM10 = jsonObject.m("worker");
                    Worker workerFromJsonObject = ka8VarM10 != null ? Worker.INSTANCE.fromJsonObject(ka8VarM10.d()) : null;
                    ka8 ka8VarM11 = jsonObject.m("redirect");
                    if (ka8VarM11 != null) {
                        resource = null;
                        try {
                            redirectFromJsonObject = Redirect.INSTANCE.fromJsonObject(ka8VarM11.d());
                        } catch (IllegalStateException e) {
                            e = e;
                            g7.n("Unable to parse json into type Resource", e);
                            return resource;
                        } catch (NullPointerException e2) {
                            e = e2;
                            g7.n("Unable to parse json into type Resource", e);
                            return resource;
                        } catch (NumberFormatException e3) {
                            e = e3;
                            g7.n("Unable to parse json into type Resource", e);
                            return resource;
                        }
                    } else {
                        resource = null;
                        redirectFromJsonObject = null;
                    }
                    ka8 ka8VarM12 = jsonObject.m("dns");
                    Dns dnsFromJsonObject = ka8VarM12 != null ? Dns.INSTANCE.fromJsonObject(ka8VarM12.d()) : resource;
                    ka8 ka8VarM13 = jsonObject.m("connect");
                    Connect connectFromJsonObject = ka8VarM13 != null ? Connect.INSTANCE.fromJsonObject(ka8VarM13.d()) : resource;
                    ka8 ka8VarM14 = jsonObject.m("ssl");
                    Ssl sslFromJsonObject = ka8VarM14 != null ? Ssl.INSTANCE.fromJsonObject(ka8VarM14.d()) : resource;
                    ka8 ka8VarM15 = jsonObject.m("first_byte");
                    FirstByte firstByteFromJsonObject = ka8VarM15 != null ? FirstByte.INSTANCE.fromJsonObject(ka8VarM15.d()) : resource;
                    ka8 ka8VarM16 = jsonObject.m("download");
                    Download downloadFromJsonObject = ka8VarM16 != null ? Download.INSTANCE.fromJsonObject(ka8VarM16.d()) : resource;
                    ka8 ka8VarM17 = jsonObject.m("protocol");
                    String strG7 = ka8VarM17 != null ? ka8VarM17.g() : resource;
                    ka8 ka8VarM18 = jsonObject.m("delivery_type");
                    DeliveryType deliveryTypeFromJson = (ka8VarM18 == null || (strG = ka8VarM18.g()) == null) ? resource : DeliveryType.INSTANCE.fromJson(strG);
                    ka8 ka8VarM19 = jsonObject.m("provider");
                    Provider providerFromJsonObject = ka8VarM19 != null ? Provider.INSTANCE.fromJsonObject(ka8VarM19.d()) : resource;
                    ka8 ka8VarM20 = jsonObject.m("graphql");
                    Graphql graphqlFromJsonObject = ka8VarM20 != null ? Graphql.INSTANCE.fromJsonObject(ka8VarM20.d()) : resource;
                    strG6.getClass();
                    return new Resource(strG4, resourceTypeFromJson, methodFromJson, strG6, lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, renderBlockingStatusFromJson, workerFromJsonObject, redirectFromJsonObject, dnsFromJsonObject, connectFromJsonObject, sslFromJsonObject, firstByteFromJsonObject, downloadFromJsonObject, strG7, deliveryTypeFromJson, providerFromJsonObject, graphqlFromJsonObject);
                } catch (IllegalStateException e4) {
                    e = e4;
                    resource = null;
                } catch (NullPointerException e5) {
                    e = e5;
                    resource = null;
                } catch (NumberFormatException e6) {
                    e = e6;
                    resource = null;
                }
            }

            private Companion() {
            }
        }

        public Resource(String str, ResourceType resourceType, Method method, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, RenderBlockingStatus renderBlockingStatus, Worker worker, Redirect redirect, Dns dns, Connect connect, Ssl ssl, FirstByte firstByte, Download download, String str3, DeliveryType deliveryType, Provider provider, Graphql graphql) {
            resourceType.getClass();
            str2.getClass();
            this.id = str;
            this.type = resourceType;
            this.method = method;
            this.url = str2;
            this.statusCode = l;
            this.duration = l2;
            this.size = l3;
            this.encodedBodySize = l4;
            this.decodedBodySize = l5;
            this.transferSize = l6;
            this.renderBlockingStatus = renderBlockingStatus;
            this.worker = worker;
            this.redirect = redirect;
            this.dns = dns;
            this.connect = connect;
            this.ssl = ssl;
            this.firstByte = firstByte;
            this.download = download;
            this.protocol = str3;
            this.deliveryType = deliveryType;
            this.provider = provider;
            this.graphql = graphql;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "type", "", "hasReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "getType", "Ljava/lang/Boolean;", "getHasReplay", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ResourceEventSession {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean hasReplay;
        private final String id;
        private final ResourceEventSessionType type;

        public ResourceEventSession(String str, ResourceEventSessionType resourceEventSessionType, Boolean bool) {
            str.getClass();
            resourceEventSessionType.getClass();
            this.id = str;
            this.type = resourceEventSessionType;
            this.hasReplay = bool;
        }

        public static /* synthetic */ ResourceEventSession copy$default(ResourceEventSession resourceEventSession, String str, ResourceEventSessionType resourceEventSessionType, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resourceEventSession.id;
            }
            if ((i & 2) != 0) {
                resourceEventSessionType = resourceEventSession.type;
            }
            if ((i & 4) != 0) {
                bool = resourceEventSession.hasReplay;
            }
            return resourceEventSession.copy(str, resourceEventSessionType, bool);
        }

        public static final ResourceEventSession fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ResourceEventSession fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ResourceEventSessionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final ResourceEventSession copy(String id, ResourceEventSessionType type, Boolean hasReplay) {
            id.getClass();
            type.getClass();
            return new ResourceEventSession(id, type, hasReplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResourceEventSession)) {
                return false;
            }
            ResourceEventSession resourceEventSession = (ResourceEventSession) other;
            return wl7.b(this.id, resourceEventSession.id) && this.type == resourceEventSession.type && wl7.b(this.hasReplay, resourceEventSession.hasReplay);
        }

        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final String getId() {
            return this.id;
        }

        public final ResourceEventSessionType getType() {
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
            ResourceEventSessionType resourceEventSessionType = this.type;
            Boolean bool = this.hasReplay;
            StringBuilder sb = new StringBuilder("ResourceEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(resourceEventSessionType);
            sb.append(", hasReplay=");
            return l5.n(sb, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResourceEventSession fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ResourceEventSession", e);
                    return null;
                }
            }

            public final ResourceEventSession fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    ResourceEventSessionType.Companion companion = ResourceEventSessionType.INSTANCE;
                    String strG2 = jsonObject.m("type").g();
                    strG2.getClass();
                    ResourceEventSessionType resourceEventSessionTypeFromJson = companion.fromJson(strG2);
                    ka8 ka8VarM = jsonObject.m(FeaturesContextResolver.HAS_REPLAY_KEY);
                    Boolean boolValueOf = ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null;
                    strG.getClass();
                    return new ResourceEventSession(strG, resourceEventSessionTypeFromJson, boolValueOf);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ResourceEventSession", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ResourceEventSession", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ResourceEventSession", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ ResourceEventSession(String str, ResourceEventSessionType resourceEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, resourceEventSessionType, (i & 4) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER", "SYNTHETICS", "CI_TEST", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ResourceEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ResourceEventSessionType(String str) {
            this.jsonValue = str;
        }

        public static final ResourceEventSessionType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResourceEventSessionType fromJson(String jsonString) {
                jsonString.getClass();
                for (ResourceEventSessionType resourceEventSessionType : ResourceEventSessionType.values()) {
                    if (wl7.b(resourceEventSessionType.jsonValue, jsonString)) {
                        return resourceEventSessionType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ResourceEventSource {
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

        ResourceEventSource(String str) {
            this.jsonValue = str;
        }

        public static final ResourceEventSource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResourceEventSource fromJson(String jsonString) {
                jsonString.getClass();
                for (ResourceEventSource resourceEventSource : ResourceEventSource.values()) {
                    if (wl7.b(resourceEventSource.jsonValue, jsonString)) {
                        return resourceEventSource;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "", "", "id", "referrer", "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getReferrer", "setReferrer", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getName", "setName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ResourceEventView {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private String name;
        private String referrer;
        private String url;

        public ResourceEventView(String str, String str2, String str3, String str4) {
            str.getClass();
            str3.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
        }

        public static /* synthetic */ ResourceEventView copy$default(ResourceEventView resourceEventView, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resourceEventView.id;
            }
            if ((i & 2) != 0) {
                str2 = resourceEventView.referrer;
            }
            if ((i & 4) != 0) {
                str3 = resourceEventView.url;
            }
            if ((i & 8) != 0) {
                str4 = resourceEventView.name;
            }
            return resourceEventView.copy(str, str2, str3, str4);
        }

        public static final ResourceEventView fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ResourceEventView fromJsonObject(ab8 ab8Var) {
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

        public final ResourceEventView copy(String id, String referrer, String url, String name) {
            id.getClass();
            url.getClass();
            return new ResourceEventView(id, referrer, url, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResourceEventView)) {
                return false;
            }
            ResourceEventView resourceEventView = (ResourceEventView) other;
            return wl7.b(this.id, resourceEventView.id) && wl7.b(this.referrer, resourceEventView.referrer) && wl7.b(this.url, resourceEventView.url) && wl7.b(this.name, resourceEventView.name);
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
            return z3.n(u40.f("ResourceEventView(id=", str, ", referrer=", str2, ", url="), this.url, ", name=", this.name, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResourceEventView fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ResourceEventView", e);
                    return null;
                }
            }

            public final ResourceEventView fromJsonObject(ab8 jsonObject) {
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
                    return new ResourceEventView(strG, strG2, strG3, strG4);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ResourceEventView", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ResourceEventView", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ResourceEventView", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ ResourceEventView(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "DOCUMENT", "XHR", "BEACON", "FETCH", "CSS", "JS", "IMAGE", "FONT", "MEDIA", "OTHER", "NATIVE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ResourceType {
        DOCUMENT("document"),
        XHR("xhr"),
        BEACON("beacon"),
        FETCH("fetch"),
        CSS("css"),
        JS("js"),
        IMAGE("image"),
        FONT("font"),
        MEDIA("media"),
        OTHER("other"),
        NATIVE("native");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ResourceType(String str) {
            this.jsonValue = str;
        }

        public static final ResourceType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResourceType fromJson(String jsonString) {
                jsonString.getClass();
                for (ResourceType resourceType : ResourceType.values()) {
                    if (wl7.b(resourceType.jsonValue, jsonString)) {
                        return resourceType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "", "", "duration", "start", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Ssl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public Ssl(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public static /* synthetic */ Ssl copy$default(Ssl ssl, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = ssl.duration;
            }
            if ((i & 2) != 0) {
                j2 = ssl.start;
            }
            return ssl.copy(j, j2);
        }

        public static final Ssl fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Ssl fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final Ssl copy(long duration, long start) {
            return new Ssl(duration, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ssl)) {
                return false;
            }
            Ssl ssl = (Ssl) other;
            return this.duration == ssl.duration && this.start == ssl.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.start, ")", w40.i(this.duration, "Ssl(duration=", ", start="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Ssl$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Ssl fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Ssl", e);
                    return null;
                }
            }

            public final Ssl fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Ssl(jsonObject.m("duration").e(), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Ssl", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Ssl", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Ssl", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Status;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Status$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "getResultId", "Ljava/lang/Boolean;", "getInjected", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "getAnonymousId", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getWidth", "getHeight", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "", "", "duration", "start", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Worker {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public Worker(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public static /* synthetic */ Worker copy$default(Worker worker, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = worker.duration;
            }
            if ((i & 2) != 0) {
                j2 = worker.start;
            }
            return worker.copy(j, j2);
        }

        public static final Worker fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Worker fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final Worker copy(long duration, long start) {
            return new Worker(duration, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Worker)) {
                return false;
            }
            Worker worker = (Worker) other;
            return this.duration == worker.duration && this.start == worker.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (Long.hashCode(this.duration) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.start, ")", w40.i(this.duration, "Worker(duration=", ", start="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Worker$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Worker fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Worker", e);
                    return null;
                }
            }

            public final Worker fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Worker(jsonObject.m("duration").e(), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Worker", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Worker", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Worker", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ResourceEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResourceEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type ResourceEvent", e);
                return null;
            }
        }

        public final ResourceEvent fromJsonObject(ab8 jsonObject) {
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
                ResourceEventSession resourceEventSessionFromJsonObject = ResourceEventSession.INSTANCE.fromJsonObject(jsonObject.m("session").d());
                ka8 ka8VarM5 = jsonObject.m("source");
                ResourceEventSource resourceEventSourceFromJson = (ka8VarM5 == null || (strG = ka8VarM5.g()) == null) ? null : ResourceEventSource.INSTANCE.fromJson(strG);
                ResourceEventView resourceEventViewFromJsonObject = ResourceEventView.INSTANCE.fromJsonObject(jsonObject.m("view").d());
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
                ka8 ka8VarM15 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_ACTION);
                Action actionFromJsonObject = ka8VarM15 != null ? Action.INSTANCE.fromJsonObject(ka8VarM15.d()) : null;
                ka8 ka8VarM16 = jsonObject.m("container");
                Container containerFromJsonObject = ka8VarM16 != null ? Container.INSTANCE.fromJsonObject(ka8VarM16.d()) : null;
                String strG6 = jsonObject.m("type").g();
                Resource resourceFromJsonObject = Resource.INSTANCE.fromJsonObject(jsonObject.m(RumEventDeserializer.EVENT_TYPE_RESOURCE).d());
                if (wl7.b(strG6, RumEventDeserializer.EVENT_TYPE_RESOURCE)) {
                    return new ResourceEvent(jE, applicationFromJsonObject, strG2, strG3, strG4, strG5, resourceEventSessionFromJsonObject, resourceEventSourceFromJson, resourceEventViewFromJsonObject, usrFromJsonObject, accountFromJsonObject, connectivityFromJsonObject, displayFromJsonObject, syntheticsFromJsonObject, ciTestFromJsonObject, osFromJsonObject, deviceFromJsonObject, ddFromJsonObject, contextFromJsonObject, actionFromJsonObject, containerFromJsonObject, resourceFromJsonObject);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type ResourceEvent", e);
                return null;
            } catch (NullPointerException e2) {
                g7.n("Unable to parse json into type ResourceEvent", e2);
                return null;
            } catch (NumberFormatException e3) {
                g7.n("Unable to parse json into type ResourceEvent", e3);
                return null;
            }
        }

        private Companion() {
        }
    }

    public ResourceEvent(long j, Application application, String str, String str2, String str3, String str4, ResourceEventSession resourceEventSession, ResourceEventSource resourceEventSource, ResourceEventView resourceEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Resource resource) {
        application.getClass();
        resourceEventSession.getClass();
        resourceEventView.getClass();
        dd.getClass();
        resource.getClass();
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.session = resourceEventSession;
        this.source = resourceEventSource;
        this.view = resourceEventView;
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
        this.action = action;
        this.container = container;
        this.resource = resource;
        this.type = RumEventDeserializer.EVENT_TYPE_RESOURCE;
    }
}
