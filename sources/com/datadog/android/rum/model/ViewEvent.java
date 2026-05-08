package com.datadog.android.rum.model;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.FeaturesContextResolver;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.gson.JsonParseException;
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
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bZ\b\u0086\b\u0018\u0000 \u008b\u00012\u00020\u0001:Z\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u008b\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001Bû\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u00104J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020!HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bT\u0010QJ\u0012\u0010U\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u008e\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bY\u00104J\u0010\u0010[\u001a\u00020ZHÖ\u0001¢\u0006\u0004\b[\u0010\\J\u001a\u0010_\u001a\u00020^2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010a\u001a\u0004\bb\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010c\u001a\u0004\bd\u00102R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010e\u001a\u0004\bf\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010e\u001a\u0004\bg\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010e\u001a\u0004\bh\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010e\u001a\u0004\bi\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010j\u001a\u0004\bk\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010l\u001a\u0004\bm\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010n\u001a\u0004\bo\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010p\u001a\u0004\bq\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010r\u001a\u0004\bs\u0010AR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010t\u001a\u0004\bu\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010v\u001a\u0004\bw\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010x\u001a\u0004\by\u0010GR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010z\u001a\u0004\b{\u0010IR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010|\u001a\u0004\b}\u0010KR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010~\u001a\u0004\b\u007f\u0010MR\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010OR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010QR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010SR\u001b\u0010'\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0082\u0001\u001a\u0005\b\u0086\u0001\u0010QR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010VR\u001d\u0010\u0089\u0001\u001a\u00020\u00068\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010e\u001a\u0005\b\u008a\u0001\u00104¨\u0006¸\u0001"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent;", "", "", LogAttributes.DATE, "Lcom/datadog/android/rum/model/ViewEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "session", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "source", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "view", "Lcom/datadog/android/rum/model/ViewEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/ViewEvent$Account;", "account", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/ViewEvent$Display;", "display", "Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/ViewEvent$Os;", "os", "Lcom/datadog/android/rum/model/ViewEvent$Device;", "device", "Lcom/datadog/android/rum/model/ViewEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/ViewEvent$Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/rum/model/ViewEvent$Container;", "container", "featureFlags", "Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "privacy", "<init>", "(JLcom/datadog/android/rum/model/ViewEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;Lcom/datadog/android/rum/model/ViewEvent$Usr;Lcom/datadog/android/rum/model/ViewEvent$Account;Lcom/datadog/android/rum/model/ViewEvent$Connectivity;Lcom/datadog/android/rum/model/ViewEvent$Display;Lcom/datadog/android/rum/model/ViewEvent$Synthetics;Lcom/datadog/android/rum/model/ViewEvent$CiTest;Lcom/datadog/android/rum/model/ViewEvent$Os;Lcom/datadog/android/rum/model/ViewEvent$Device;Lcom/datadog/android/rum/model/ViewEvent$Dd;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Container;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Privacy;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$Application;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "component8", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "component9", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "component10", "()Lcom/datadog/android/rum/model/ViewEvent$Usr;", "component11", "()Lcom/datadog/android/rum/model/ViewEvent$Account;", "component12", "()Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "component13", "()Lcom/datadog/android/rum/model/ViewEvent$Display;", "component14", "()Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "component15", "()Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "component16", "()Lcom/datadog/android/rum/model/ViewEvent$Os;", "component17", "()Lcom/datadog/android/rum/model/ViewEvent$Device;", "component18", "()Lcom/datadog/android/rum/model/ViewEvent$Dd;", "component19", "()Lcom/datadog/android/rum/model/ViewEvent$Context;", "component20", "()Lcom/datadog/android/rum/model/ViewEvent$Container;", "component21", "component22", "()Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "copy", "(JLcom/datadog/android/rum/model/ViewEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;Lcom/datadog/android/rum/model/ViewEvent$Usr;Lcom/datadog/android/rum/model/ViewEvent$Account;Lcom/datadog/android/rum/model/ViewEvent$Connectivity;Lcom/datadog/android/rum/model/ViewEvent$Display;Lcom/datadog/android/rum/model/ViewEvent$Synthetics;Lcom/datadog/android/rum/model/ViewEvent$CiTest;Lcom/datadog/android/rum/model/ViewEvent$Os;Lcom/datadog/android/rum/model/ViewEvent$Device;Lcom/datadog/android/rum/model/ViewEvent$Dd;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Container;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Privacy;)Lcom/datadog/android/rum/model/ViewEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDate", "Lcom/datadog/android/rum/model/ViewEvent$Application;", "getApplication", "Ljava/lang/String;", "getService", "getVersion", "getBuildVersion", "getBuildId", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "getSession", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "getSource", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "getView", "Lcom/datadog/android/rum/model/ViewEvent$Usr;", "getUsr", "Lcom/datadog/android/rum/model/ViewEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/ViewEvent$Display;", "getDisplay", "Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "getSynthetics", "Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/ViewEvent$Os;", "getOs", "Lcom/datadog/android/rum/model/ViewEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/ViewEvent$Dd;", "getDd", "Lcom/datadog/android/rum/model/ViewEvent$Context;", "getContext", "Lcom/datadog/android/rum/model/ViewEvent$Container;", "getContainer", "getFeatureFlags", "Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "getPrivacy", "type", "getType", "Companion", "Account", "Action", "Application", "Cellular", "CiTest", "Configuration", "Connectivity", "Container", "ContainerView", "Context", "Crash", "CustomTimings", "Dd", "DdSession", "Device", "DeviceType", "Display", "EffectiveType", "Error", "FlutterBuildTime", "FrozenFrame", "Frustration", "InForegroundPeriod", "Interface", "LoadingType", "LongTask", "Os", "PageState", "Plan", "Privacy", "ReplayLevel", "ReplayStats", "Resource", "Scroll", "SessionPrecondition", "State", "Status", "Synthetics", "Usr", "ViewEventSession", "ViewEventSessionType", "ViewEventSource", "ViewEventView", "Viewport", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ViewEvent {

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
    private final Context featureFlags;
    private final Os os;
    private final Privacy privacy;
    private final String service;
    private final ViewEventSession session;
    private final ViewEventSource source;
    private final Synthetics synthetics;
    private final String type;
    private final Usr usr;
    private final String version;
    private final ViewEventView view;

    public /* synthetic */ ViewEvent(long j, Application application, String str, String str2, String str3, String str4, ViewEventSession viewEventSession, ViewEventSource viewEventSource, ViewEventView viewEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, Context context2, Privacy privacy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, viewEventSession, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : viewEventSource, viewEventView, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : usr, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : account, (i & 2048) != 0 ? null : connectivity, (i & 4096) != 0 ? null : display, (i & 8192) != 0 ? null : synthetics, (i & 16384) != 0 ? null : ciTest, (32768 & i) != 0 ? null : os, (65536 & i) != 0 ? null : device, dd, (262144 & i) != 0 ? null : context, (524288 & i) != 0 ? null : container, (1048576 & i) != 0 ? null : context2, (i & 2097152) != 0 ? null : privacy);
    }

    public static /* synthetic */ ViewEvent copy$default(ViewEvent viewEvent, long j, Application application, String str, String str2, String str3, String str4, ViewEventSession viewEventSession, ViewEventSource viewEventSource, ViewEventView viewEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, Context context2, Privacy privacy, int i, Object obj) {
        Privacy privacy2;
        Context context3;
        long j2 = (i & 1) != 0 ? viewEvent.date : j;
        Application application2 = (i & 2) != 0 ? viewEvent.application : application;
        String str5 = (i & 4) != 0 ? viewEvent.service : str;
        String str6 = (i & 8) != 0 ? viewEvent.version : str2;
        String str7 = (i & 16) != 0 ? viewEvent.buildVersion : str3;
        String str8 = (i & 32) != 0 ? viewEvent.buildId : str4;
        ViewEventSession viewEventSession2 = (i & 64) != 0 ? viewEvent.session : viewEventSession;
        ViewEventSource viewEventSource2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? viewEvent.source : viewEventSource;
        ViewEventView viewEventView2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? viewEvent.view : viewEventView;
        Usr usr2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? viewEvent.usr : usr;
        Account account2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? viewEvent.account : account;
        Connectivity connectivity2 = (i & 2048) != 0 ? viewEvent.connectivity : connectivity;
        Display display2 = (i & 4096) != 0 ? viewEvent.display : display;
        long j3 = j2;
        Synthetics synthetics2 = (i & 8192) != 0 ? viewEvent.synthetics : synthetics;
        CiTest ciTest2 = (i & 16384) != 0 ? viewEvent.ciTest : ciTest;
        Os os2 = (i & 32768) != 0 ? viewEvent.os : os;
        Device device2 = (i & 65536) != 0 ? viewEvent.device : device;
        Dd dd2 = (i & 131072) != 0 ? viewEvent.dd : dd;
        Context context4 = (i & 262144) != 0 ? viewEvent.context : context;
        Container container2 = (i & 524288) != 0 ? viewEvent.container : container;
        Context context5 = (i & 1048576) != 0 ? viewEvent.featureFlags : context2;
        if ((i & 2097152) != 0) {
            context3 = context5;
            privacy2 = viewEvent.privacy;
        } else {
            privacy2 = privacy;
            context3 = context5;
        }
        return viewEvent.copy(j3, application2, str5, str6, str7, str8, viewEventSession2, viewEventSource2, viewEventView2, usr2, account2, connectivity2, display2, synthetics2, ciTest2, os2, device2, dd2, context4, container2, context3, privacy2);
    }

    public static final ViewEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final ViewEvent fromJsonObject(ab8 ab8Var) {
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
    public final Context getFeatureFlags() {
        return this.featureFlags;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Privacy getPrivacy() {
        return this.privacy;
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
    public final ViewEventSession getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ViewEventSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ViewEventView getView() {
        return this.view;
    }

    public final ViewEvent copy(long date, Application application, String service, String version, String buildVersion, String buildId, ViewEventSession session, ViewEventSource source, ViewEventView view, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, Context featureFlags, Privacy privacy) {
        application.getClass();
        session.getClass();
        view.getClass();
        dd.getClass();
        return new ViewEvent(date, application, service, version, buildVersion, buildId, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, container, featureFlags, privacy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewEvent)) {
            return false;
        }
        ViewEvent viewEvent = (ViewEvent) other;
        return this.date == viewEvent.date && wl7.b(this.application, viewEvent.application) && wl7.b(this.service, viewEvent.service) && wl7.b(this.version, viewEvent.version) && wl7.b(this.buildVersion, viewEvent.buildVersion) && wl7.b(this.buildId, viewEvent.buildId) && wl7.b(this.session, viewEvent.session) && this.source == viewEvent.source && wl7.b(this.view, viewEvent.view) && wl7.b(this.usr, viewEvent.usr) && wl7.b(this.account, viewEvent.account) && wl7.b(this.connectivity, viewEvent.connectivity) && wl7.b(this.display, viewEvent.display) && wl7.b(this.synthetics, viewEvent.synthetics) && wl7.b(this.ciTest, viewEvent.ciTest) && wl7.b(this.os, viewEvent.os) && wl7.b(this.device, viewEvent.device) && wl7.b(this.dd, viewEvent.dd) && wl7.b(this.context, viewEvent.context) && wl7.b(this.container, viewEvent.container) && wl7.b(this.featureFlags, viewEvent.featureFlags) && wl7.b(this.privacy, viewEvent.privacy);
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

    public final Context getFeatureFlags() {
        return this.featureFlags;
    }

    public final Os getOs() {
        return this.os;
    }

    public final Privacy getPrivacy() {
        return this.privacy;
    }

    public final String getService() {
        return this.service;
    }

    public final ViewEventSession getSession() {
        return this.session;
    }

    public final ViewEventSource getSource() {
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

    public final ViewEventView getView() {
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
        ViewEventSource viewEventSource = this.source;
        int iHashCode6 = (this.view.hashCode() + ((iHashCode5 + (viewEventSource == null ? 0 : viewEventSource.hashCode())) * 31)) * 31;
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
        int iHashCode16 = (iHashCode15 + (container == null ? 0 : container.hashCode())) * 31;
        Context context2 = this.featureFlags;
        int iHashCode17 = (iHashCode16 + (context2 == null ? 0 : context2.hashCode())) * 31;
        Privacy privacy = this.privacy;
        return iHashCode17 + (privacy != null ? privacy.hashCode() : 0);
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
        ViewEventSource viewEventSource = this.source;
        if (viewEventSource != null) {
            ab8Var.i("source", viewEventSource.toJson());
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
        Context context2 = this.featureFlags;
        if (context2 != null) {
            ab8Var.i("feature_flags", context2.toJson());
        }
        Privacy privacy = this.privacy;
        if (privacy != null) {
            ab8Var.i("privacy", privacy.toJson());
        }
        return ab8Var;
    }

    public String toString() {
        long j = this.date;
        Application application = this.application;
        String str = this.service;
        String str2 = this.version;
        String str3 = this.buildVersion;
        String str4 = this.buildId;
        ViewEventSession viewEventSession = this.session;
        ViewEventSource viewEventSource = this.source;
        ViewEventView viewEventView = this.view;
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
        Context context2 = this.featureFlags;
        Privacy privacy = this.privacy;
        StringBuilder sb = new StringBuilder("ViewEvent(date=");
        sb.append(j);
        sb.append(", application=");
        sb.append(application);
        ia.r(sb, ", service=", str, ", version=", str2);
        ia.r(sb, ", buildVersion=", str3, ", buildId=", str4);
        sb.append(", session=");
        sb.append(viewEventSession);
        sb.append(", source=");
        sb.append(viewEventSource);
        sb.append(", view=");
        sb.append(viewEventView);
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
        sb.append(", featureFlags=");
        sb.append(context2);
        sb.append(", privacy=");
        sb.append(privacy);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$Account;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Account;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Action;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Action;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Action {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long count;

        public Action(long j) {
            this.count = j;
        }

        public static /* synthetic */ Action copy$default(Action action, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = action.count;
            }
            return action.copy(j);
        }

        public static final Action fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Action fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        public final Action copy(long count) {
            return new Action(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && this.count == ((Action) other).count;
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
            return u40.c(this.count, "Action(count=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Action;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Action;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    return new Action(jsonObject.m("count").e());
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTechnology", "getCarrierName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestExecutionId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006\""}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "", "startSessionReplayRecordingManually", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getSessionSampleRate", "getSessionReplaySampleRate", "Ljava/lang/Boolean;", "getStartSessionReplayRecordingManually", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Configuration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Number sessionReplaySampleRate;
        private final Number sessionSampleRate;
        private final Boolean startSessionReplayRecordingManually;

        public /* synthetic */ Configuration(Number number, Number number2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2, (i & 4) != 0 ? null : bool);
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, Number number, Number number2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                number = configuration.sessionSampleRate;
            }
            if ((i & 2) != 0) {
                number2 = configuration.sessionReplaySampleRate;
            }
            if ((i & 4) != 0) {
                bool = configuration.startSessionReplayRecordingManually;
            }
            return configuration.copy(number, number2, bool);
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

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getStartSessionReplayRecordingManually() {
            return this.startSessionReplayRecordingManually;
        }

        public final Configuration copy(Number sessionSampleRate, Number sessionReplaySampleRate, Boolean startSessionReplayRecordingManually) {
            sessionSampleRate.getClass();
            return new Configuration(sessionSampleRate, sessionReplaySampleRate, startSessionReplayRecordingManually);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return wl7.b(this.sessionSampleRate, configuration.sessionSampleRate) && wl7.b(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) && wl7.b(this.startSessionReplayRecordingManually, configuration.startSessionReplayRecordingManually);
        }

        public final Number getSessionReplaySampleRate() {
            return this.sessionReplaySampleRate;
        }

        public final Number getSessionSampleRate() {
            return this.sessionSampleRate;
        }

        public final Boolean getStartSessionReplayRecordingManually() {
            return this.startSessionReplayRecordingManually;
        }

        public int hashCode() {
            int iHashCode = this.sessionSampleRate.hashCode() * 31;
            Number number = this.sessionReplaySampleRate;
            int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
            Boolean bool = this.startSessionReplayRecordingManually;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(this.sessionSampleRate, "session_sample_rate");
            Number number = this.sessionReplaySampleRate;
            if (number != null) {
                ab8Var.j(number, TelemetryEventHandler.SESSION_REPLAY_SAMPLE_RATE_KEY);
            }
            Boolean bool = this.startSessionReplayRecordingManually;
            if (bool != null) {
                ab8Var.k("start_session_replay_recording_manually", bool);
            }
            return ab8Var;
        }

        public String toString() {
            Number number = this.sessionSampleRate;
            Number number2 = this.sessionReplaySampleRate;
            Boolean bool = this.startSessionReplayRecordingManually;
            StringBuilder sb = new StringBuilder("Configuration(sessionSampleRate=");
            sb.append(number);
            sb.append(", sessionReplaySampleRate=");
            sb.append(number2);
            sb.append(", startSessionReplayRecordingManually=");
            return l5.n(sb, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ka8 ka8VarM2 = jsonObject.m("start_session_replay_recording_manually");
                    Boolean boolValueOf = ka8VarM2 != null ? Boolean.valueOf(ka8VarM2.a()) : null;
                    numberF.getClass();
                    return new Configuration(numberF, numberF2, boolValueOf);
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

        public Configuration(Number number, Number number2, Boolean bool) {
            number.getClass();
            this.sessionSampleRate = number;
            this.sessionReplaySampleRate = number2;
            this.startSessionReplayRecordingManually = bool;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006-"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/ViewEvent$Status;", "status", "", "Lcom/datadog/android/rum/model/ViewEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;Lcom/datadog/android/rum/model/ViewEvent$Cellular;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$Status;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;Lcom/datadog/android/rum/model/ViewEvent$Cellular;)Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$Status;", "getStatus", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "getEffectiveType", "Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "getCellular", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Container;", "", "Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$ContainerView;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$ContainerView;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;)Lcom/datadog/android/rum/model/ViewEvent$Container;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "getView", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "getSource", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Container {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ViewEventSource source;
        private final ContainerView view;

        public Container(ContainerView containerView, ViewEventSource viewEventSource) {
            containerView.getClass();
            viewEventSource.getClass();
            this.view = containerView;
            this.source = viewEventSource;
        }

        public static /* synthetic */ Container copy$default(Container container, ContainerView containerView, ViewEventSource viewEventSource, int i, Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                viewEventSource = container.source;
            }
            return container.copy(containerView, viewEventSource);
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
        public final ViewEventSource getSource() {
            return this.source;
        }

        public final Container copy(ContainerView view, ViewEventSource source) {
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

        public final ViewEventSource getSource() {
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Container;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Container;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ViewEventSource.Companion companion = ViewEventSource.INSTANCE;
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$Context;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Context;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Context;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Crash;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Crash;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Crash$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Crash;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Crash;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Crash;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class CustomTimings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, Long> additionalProperties;

        public /* synthetic */ CustomTimings(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? bs4.a : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomTimings copy$default(CustomTimings customTimings, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = customTimings.additionalProperties;
            }
            return customTimings.copy(map);
        }

        public static final CustomTimings fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final CustomTimings fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        public final Map<String, Long> component1() {
            return this.additionalProperties;
        }

        public final CustomTimings copy(Map<String, Long> additionalProperties) {
            additionalProperties.getClass();
            return new CustomTimings(additionalProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomTimings) && wl7.b(this.additionalProperties, ((CustomTimings) other).additionalProperties);
        }

        public final Map<String, Long> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            for (Map.Entry<String, Long> entry : this.additionalProperties.entrySet()) {
                ab8Var.j(Long.valueOf(entry.getValue().longValue()), entry.getKey());
            }
            return ab8Var;
        }

        public String toString() {
            return "CustomTimings(additionalProperties=" + this.additionalProperties + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CustomTimings$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CustomTimings fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type CustomTimings", e);
                    return null;
                }
            }

            public final CustomTimings fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                        Object key = entry.getKey();
                        key.getClass();
                        linkedHashMap.put(key, Long.valueOf(((ka8) entry.getValue()).e()));
                    }
                    return new CustomTimings(linkedHashMap);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type CustomTimings", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type CustomTimings", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type CustomTimings", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public CustomTimings(Map<String, Long> map) {
            map.getClass();
            this.additionalProperties = map;
        }

        public CustomTimings() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\\\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001bR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001fR\u001a\u00106\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010\u001b¨\u00069"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Dd;", "", "Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "configuration", "", "browserSdkVersion", "", RumEventMeta.DOCUMENT_VERSION_KEY, "", "Lcom/datadog/android/rum/model/ViewEvent$PageState;", "pageStates", "Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "replayStats", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$DdSession;Lcom/datadog/android/rum/model/ViewEvent$Configuration;Ljava/lang/String;JLjava/util/List;Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "component3", "()Ljava/lang/String;", "component4", "()J", "component5", "()Ljava/util/List;", "component6", "()Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$DdSession;Lcom/datadog/android/rum/model/ViewEvent$Configuration;Ljava/lang/String;JLjava/util/List;Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;)Lcom/datadog/android/rum/model/ViewEvent$Dd;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "getSession", "Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "getConfiguration", "Ljava/lang/String;", "getBrowserSdkVersion", "J", "getDocumentVersion", "Ljava/util/List;", "getPageStates", "Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "getReplayStats", "formatVersion", "getFormatVersion", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String browserSdkVersion;
        private final Configuration configuration;
        private final long documentVersion;
        private final long formatVersion;
        private final List<PageState> pageStates;
        private final ReplayStats replayStats;
        private final DdSession session;

        public /* synthetic */ Dd(DdSession ddSession, Configuration configuration, String str, long j, List list, ReplayStats replayStats, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str, j, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : replayStats);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dd copy$default(Dd dd, DdSession ddSession, Configuration configuration, String str, long j, List list, ReplayStats replayStats, int i, Object obj) {
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
                j = dd.documentVersion;
            }
            if ((i & 16) != 0) {
                list = dd.pageStates;
            }
            if ((i & 32) != 0) {
                replayStats = dd.replayStats;
            }
            long j2 = j;
            String str2 = str;
            return dd.copy(ddSession, configuration, str2, j2, list, replayStats);
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
        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        public final List<PageState> component5() {
            return this.pageStates;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final ReplayStats getReplayStats() {
            return this.replayStats;
        }

        public final Dd copy(DdSession session, Configuration configuration, String browserSdkVersion, long documentVersion, List<PageState> pageStates, ReplayStats replayStats) {
            return new Dd(session, configuration, browserSdkVersion, documentVersion, pageStates, replayStats);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) other;
            return wl7.b(this.session, dd.session) && wl7.b(this.configuration, dd.configuration) && wl7.b(this.browserSdkVersion, dd.browserSdkVersion) && this.documentVersion == dd.documentVersion && wl7.b(this.pageStates, dd.pageStates) && wl7.b(this.replayStats, dd.replayStats);
        }

        public final String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final List<PageState> getPageStates() {
            return this.pageStates;
        }

        public final ReplayStats getReplayStats() {
            return this.replayStats;
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
            int iD = ia.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.documentVersion);
            List<PageState> list = this.pageStates;
            int iHashCode3 = (iD + (list == null ? 0 : list.hashCode())) * 31;
            ReplayStats replayStats = this.replayStats;
            return iHashCode3 + (replayStats != null ? replayStats.hashCode() : 0);
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
            ab8Var.j(Long.valueOf(this.documentVersion), "document_version");
            List<PageState> list = this.pageStates;
            if (list != null) {
                w98 w98Var = new w98(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    w98Var.i(((PageState) it.next()).toJson());
                }
                ab8Var.i("page_states", w98Var);
            }
            ReplayStats replayStats = this.replayStats;
            if (replayStats != null) {
                ab8Var.i("replay_stats", replayStats.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Dd(session=" + this.session + ", configuration=" + this.configuration + ", browserSdkVersion=" + this.browserSdkVersion + ", documentVersion=" + this.documentVersion + ", pageStates=" + this.pageStates + ", replayStats=" + this.replayStats + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                ArrayList arrayList;
                jsonObject.getClass();
                try {
                    long jE = jsonObject.m("format_version").e();
                    ka8 ka8VarM = jsonObject.m("session");
                    DdSession ddSessionFromJsonObject = ka8VarM != null ? DdSession.INSTANCE.fromJsonObject(ka8VarM.d()) : null;
                    ka8 ka8VarM2 = jsonObject.m("configuration");
                    Configuration configurationFromJsonObject = ka8VarM2 != null ? Configuration.INSTANCE.fromJsonObject(ka8VarM2.d()) : null;
                    ka8 ka8VarM3 = jsonObject.m("browser_sdk_version");
                    String strG = ka8VarM3 != null ? ka8VarM3.g() : null;
                    long jE2 = jsonObject.m("document_version").e();
                    ka8 ka8VarM4 = jsonObject.m("page_states");
                    if (ka8VarM4 != null) {
                        w98 w98VarC = ka8VarM4.c();
                        ArrayList arrayList2 = new ArrayList(w98VarC.a.size());
                        Iterator<ka8> it = w98VarC.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(PageState.INSTANCE.fromJsonObject(it.next().d()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    ka8 ka8VarM5 = jsonObject.m("replay_stats");
                    ReplayStats replayStatsFromJsonObject = ka8VarM5 != null ? ReplayStats.INSTANCE.fromJsonObject(ka8VarM5.d()) : null;
                    if (jE == 2) {
                        return new Dd(ddSessionFromJsonObject, configurationFromJsonObject, strG, jE2, arrayList, replayStatsFromJsonObject);
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

        public Dd(DdSession ddSession, Configuration configuration, String str, long j, List<PageState> list, ReplayStats replayStats) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.documentVersion = j;
            this.pageStates = list;
            this.replayStats = replayStats;
            this.formatVersion = 2L;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$Plan;Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$Plan;Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "getSessionPrecondition", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Device;", "", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "getType", "Ljava/lang/String;", "getName", "getModel", "getBrand", "getArchitecture", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DeviceType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Display;", "", "Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "viewport", "Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "scroll", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$Viewport;Lcom/datadog/android/rum/model/ViewEvent$Scroll;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$Viewport;Lcom/datadog/android/rum/model/ViewEvent$Scroll;)Lcom/datadog/android/rum/model/ViewEvent$Display;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "getViewport", "Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "getScroll", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Display {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Scroll scroll;
        private final Viewport viewport;

        public /* synthetic */ Display(Viewport viewport, Scroll scroll, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewport, (i & 2) != 0 ? null : scroll);
        }

        public static /* synthetic */ Display copy$default(Display display, Viewport viewport, Scroll scroll, int i, Object obj) {
            if ((i & 1) != 0) {
                viewport = display.viewport;
            }
            if ((i & 2) != 0) {
                scroll = display.scroll;
            }
            return display.copy(viewport, scroll);
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

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Scroll getScroll() {
            return this.scroll;
        }

        public final Display copy(Viewport viewport, Scroll scroll) {
            return new Display(viewport, scroll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Display)) {
                return false;
            }
            Display display = (Display) other;
            return wl7.b(this.viewport, display.viewport) && wl7.b(this.scroll, display.scroll);
        }

        public final Scroll getScroll() {
            return this.scroll;
        }

        public final Viewport getViewport() {
            return this.viewport;
        }

        public int hashCode() {
            Viewport viewport = this.viewport;
            int iHashCode = (viewport == null ? 0 : viewport.hashCode()) * 31;
            Scroll scroll = this.scroll;
            return iHashCode + (scroll != null ? scroll.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Viewport viewport = this.viewport;
            if (viewport != null) {
                ab8Var.i("viewport", viewport.toJson());
            }
            Scroll scroll = this.scroll;
            if (scroll != null) {
                ab8Var.i("scroll", scroll.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Display(viewport=" + this.viewport + ", scroll=" + this.scroll + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Display;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Display;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                Scroll scrollFromJsonObject;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("viewport");
                    if (ka8VarM != null) {
                        viewportFromJsonObject = Viewport.INSTANCE.fromJsonObject(ka8VarM.d());
                    } else {
                        viewportFromJsonObject = null;
                    }
                    ka8 ka8VarM2 = jsonObject.m("scroll");
                    if (ka8VarM2 != null) {
                        scrollFromJsonObject = Scroll.INSTANCE.fromJsonObject(ka8VarM2.d());
                    } else {
                        scrollFromJsonObject = null;
                    }
                    return new Display(viewportFromJsonObject, scrollFromJsonObject);
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

        public Display(Viewport viewport, Scroll scroll) {
            this.viewport = viewport;
            this.scroll = scroll;
        }

        public Display() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "SLOW_2G", "2G", "3G", "4G", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        f152G("2g"),
        f163G("3g"),
        f174G("4g");


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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$EffectiveType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Error;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Error;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Error;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\r¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "", "", BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "average", "metricMax", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getMin", "getMax", "getAverage", "getMetricMax", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class FlutterBuildTime {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Number average;
        private final Number max;
        private final Number metricMax;
        private final Number min;

        public FlutterBuildTime(Number number, Number number2, Number number3, Number number4) {
            number.getClass();
            number2.getClass();
            number3.getClass();
            this.min = number;
            this.max = number2;
            this.average = number3;
            this.metricMax = number4;
        }

        public static /* synthetic */ FlutterBuildTime copy$default(FlutterBuildTime flutterBuildTime, Number number, Number number2, Number number3, Number number4, int i, Object obj) {
            if ((i & 1) != 0) {
                number = flutterBuildTime.min;
            }
            if ((i & 2) != 0) {
                number2 = flutterBuildTime.max;
            }
            if ((i & 4) != 0) {
                number3 = flutterBuildTime.average;
            }
            if ((i & 8) != 0) {
                number4 = flutterBuildTime.metricMax;
            }
            return flutterBuildTime.copy(number, number2, number3, number4);
        }

        public static final FlutterBuildTime fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final FlutterBuildTime fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Number getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Number getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Number getAverage() {
            return this.average;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Number getMetricMax() {
            return this.metricMax;
        }

        public final FlutterBuildTime copy(Number min, Number max, Number average, Number metricMax) {
            min.getClass();
            max.getClass();
            average.getClass();
            return new FlutterBuildTime(min, max, average, metricMax);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlutterBuildTime)) {
                return false;
            }
            FlutterBuildTime flutterBuildTime = (FlutterBuildTime) other;
            return wl7.b(this.min, flutterBuildTime.min) && wl7.b(this.max, flutterBuildTime.max) && wl7.b(this.average, flutterBuildTime.average) && wl7.b(this.metricMax, flutterBuildTime.metricMax);
        }

        public final Number getAverage() {
            return this.average;
        }

        public final Number getMax() {
            return this.max;
        }

        public final Number getMetricMax() {
            return this.metricMax;
        }

        public final Number getMin() {
            return this.min;
        }

        public int hashCode() {
            int iHashCode = (this.average.hashCode() + ((this.max.hashCode() + (this.min.hashCode() * 31)) * 31)) * 31;
            Number number = this.metricMax;
            return iHashCode + (number == null ? 0 : number.hashCode());
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(this.min, BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY);
            ab8Var.j(this.max, BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY);
            ab8Var.j(this.average, "average");
            Number number = this.metricMax;
            if (number != null) {
                ab8Var.j(number, "metric_max");
            }
            return ab8Var;
        }

        public String toString() {
            return "FlutterBuildTime(min=" + this.min + ", max=" + this.max + ", average=" + this.average + ", metricMax=" + this.metricMax + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FlutterBuildTime fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type FlutterBuildTime", e);
                    return null;
                }
            }

            public final FlutterBuildTime fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    Number numberF = jsonObject.m(BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY).f();
                    Number numberF2 = jsonObject.m(BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY).f();
                    Number numberF3 = jsonObject.m("average").f();
                    ka8 ka8VarM = jsonObject.m("metric_max");
                    Number numberF4 = ka8VarM != null ? ka8VarM.f() : null;
                    numberF.getClass();
                    numberF2.getClass();
                    numberF3.getClass();
                    return new FlutterBuildTime(numberF, numberF2, numberF3, numberF4);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type FlutterBuildTime", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type FlutterBuildTime", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type FlutterBuildTime", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ FlutterBuildTime(Number number, Number number2, Number number3, Number number4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(number, number2, number3, (i & 8) != 0 ? null : number4);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class FrozenFrame {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long count;

        public FrozenFrame(long j) {
            this.count = j;
        }

        public static /* synthetic */ FrozenFrame copy$default(FrozenFrame frozenFrame, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = frozenFrame.count;
            }
            return frozenFrame.copy(j);
        }

        public static final FrozenFrame fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final FrozenFrame fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        public final FrozenFrame copy(long count) {
            return new FrozenFrame(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FrozenFrame) && this.count == ((FrozenFrame) other).count;
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
            return u40.c(this.count, "FrozenFrame(count=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FrozenFrame fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type FrozenFrame", e);
                    return null;
                }
            }

            public final FrozenFrame fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new FrozenFrame(jsonObject.m("count").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type FrozenFrame", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type FrozenFrame", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type FrozenFrame", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Frustration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long count;

        public Frustration(long j) {
            this.count = j;
        }

        public static /* synthetic */ Frustration copy$default(Frustration frustration, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = frustration.count;
            }
            return frustration.copy(j);
        }

        public static final Frustration fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Frustration fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        public final Frustration copy(long count) {
            return new Frustration(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Frustration) && this.count == ((Frustration) other).count;
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
            return u40.c(this.count, "Frustration(count=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Frustration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    return new Frustration(jsonObject.m("count").e());
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "", "", "start", "duration", "<init>", "(JJ)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getStart", "getDuration", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class InForegroundPeriod {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;
        private final long start;

        public InForegroundPeriod(long j, long j2) {
            this.start = j;
            this.duration = j2;
        }

        public static /* synthetic */ InForegroundPeriod copy$default(InForegroundPeriod inForegroundPeriod, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = inForegroundPeriod.start;
            }
            if ((i & 2) != 0) {
                j2 = inForegroundPeriod.duration;
            }
            return inForegroundPeriod.copy(j, j2);
        }

        public static final InForegroundPeriod fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final InForegroundPeriod fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        public final InForegroundPeriod copy(long start, long duration) {
            return new InForegroundPeriod(start, duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InForegroundPeriod)) {
                return false;
            }
            InForegroundPeriod inForegroundPeriod = (InForegroundPeriod) other;
            return this.start == inForegroundPeriod.start && this.duration == inForegroundPeriod.duration;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.duration) + (Long.hashCode(this.start) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.start), "start");
            ab8Var.j(Long.valueOf(this.duration), "duration");
            return ab8Var;
        }

        public String toString() {
            return r6.d(this.duration, ")", w40.i(this.start, "InForegroundPeriod(start=", ", duration="));
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InForegroundPeriod fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type InForegroundPeriod", e);
                    return null;
                }
            }

            public final InForegroundPeriod fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new InForegroundPeriod(jsonObject.m("start").e(), jsonObject.m("duration").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type InForegroundPeriod", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type InForegroundPeriod", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type InForegroundPeriod", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Interface;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Interface$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$Interface;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "INITIAL_LOAD", "ROUTE_CHANGE", "ACTIVITY_DISPLAY", "ACTIVITY_REDISPLAY", "FRAGMENT_DISPLAY", "FRAGMENT_REDISPLAY", "VIEW_CONTROLLER_DISPLAY", "VIEW_CONTROLLER_REDISPLAY", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum LoadingType {
        INITIAL_LOAD("initial_load"),
        ROUTE_CHANGE("route_change"),
        ACTIVITY_DISPLAY("activity_display"),
        ACTIVITY_REDISPLAY("activity_redisplay"),
        FRAGMENT_DISPLAY("fragment_display"),
        FRAGMENT_REDISPLAY("fragment_redisplay"),
        VIEW_CONTROLLER_DISPLAY("view_controller_display"),
        VIEW_CONTROLLER_REDISPLAY("view_controller_redisplay");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        LoadingType(String str) {
            this.jsonValue = str;
        }

        public static final LoadingType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LoadingType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LoadingType fromJson(String jsonString) {
                jsonString.getClass();
                for (LoadingType loadingType : LoadingType.values()) {
                    if (wl7.b(loadingType.jsonValue, jsonString)) {
                        return loadingType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LongTask$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "getBuild", "getVersionMajor", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PageState;", "", "Lcom/datadog/android/rum/model/ViewEvent$State;", "state", "", "start", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$State;J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$State;", "component2", "()J", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$State;J)Lcom/datadog/android/rum/model/ViewEvent$PageState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$State;", "getState", "J", "getStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class PageState {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long start;
        private final State state;

        public PageState(State state, long j) {
            state.getClass();
            this.state = state;
            this.start = j;
        }

        public static /* synthetic */ PageState copy$default(PageState pageState, State state, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                state = pageState.state;
            }
            if ((i & 2) != 0) {
                j = pageState.start;
            }
            return pageState.copy(state, j);
        }

        public static final PageState fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final PageState fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final State getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        public final PageState copy(State state, long start) {
            state.getClass();
            return new PageState(state, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageState)) {
                return false;
            }
            PageState pageState = (PageState) other;
            return this.state == pageState.state && this.start == pageState.start;
        }

        public final long getStart() {
            return this.start;
        }

        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return Long.hashCode(this.start) + (this.state.hashCode() * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("state", this.state.toJson());
            ab8Var.j(Long.valueOf(this.start), "start");
            return ab8Var;
        }

        public String toString() {
            return "PageState(state=" + this.state + ", start=" + this.start + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PageState$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$PageState;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$PageState;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$PageState;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PageState fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type PageState", e);
                    return null;
                }
            }

            public final PageState fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    State.Companion companion = State.INSTANCE;
                    String strG = jsonObject.m("state").g();
                    strG.getClass();
                    return new PageState(companion.fromJson(strG), jsonObject.m("start").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type PageState", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type PageState", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type PageState", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Plan;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/Number;", "Companion", "PLAN_1", "PLAN_2", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Plan$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "replayLevel", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;)Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "getReplayLevel", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Privacy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ReplayLevel replayLevel;

        public Privacy(ReplayLevel replayLevel) {
            replayLevel.getClass();
            this.replayLevel = replayLevel;
        }

        public static /* synthetic */ Privacy copy$default(Privacy privacy, ReplayLevel replayLevel, int i, Object obj) {
            if ((i & 1) != 0) {
                replayLevel = privacy.replayLevel;
            }
            return privacy.copy(replayLevel);
        }

        public static final Privacy fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Privacy fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ReplayLevel getReplayLevel() {
            return this.replayLevel;
        }

        public final Privacy copy(ReplayLevel replayLevel) {
            replayLevel.getClass();
            return new Privacy(replayLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Privacy) && this.replayLevel == ((Privacy) other).replayLevel;
        }

        public final ReplayLevel getReplayLevel() {
            return this.replayLevel;
        }

        public int hashCode() {
            return this.replayLevel.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("replay_level", this.replayLevel.toJson());
            return ab8Var;
        }

        public String toString() {
            return "Privacy(replayLevel=" + this.replayLevel + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Privacy$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Privacy fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Privacy", e);
                    return null;
                }
            }

            public final Privacy fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ReplayLevel.Companion companion = ReplayLevel.INSTANCE;
                    String strG = jsonObject.m("replay_level").g();
                    strG.getClass();
                    return new Privacy(companion.fromJson(strG));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Privacy", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Privacy", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Privacy", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ALLOW", "MASK", "MASK_USER_INPUT", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ReplayLevel {
        ALLOW("allow"),
        MASK("mask"),
        MASK_USER_INPUT("mask-user-input");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ReplayLevel(String str) {
            this.jsonValue = str;
        }

        public static final ReplayLevel fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ReplayLevel fromJson(String jsonString) {
                jsonString.getClass();
                for (ReplayLevel replayLevel : ReplayLevel.values()) {
                    if (wl7.b(replayLevel.jsonValue, jsonString)) {
                        return replayLevel;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\f¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "", "", "recordsCount", "segmentsCount", "segmentsTotalRawSize", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Long;", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getRecordsCount", "getSegmentsCount", "getSegmentsTotalRawSize", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ReplayStats {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long recordsCount;
        private final Long segmentsCount;
        private final Long segmentsTotalRawSize;

        public /* synthetic */ ReplayStats(Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : l2, (i & 4) != 0 ? 0L : l3);
        }

        public static /* synthetic */ ReplayStats copy$default(ReplayStats replayStats, Long l, Long l2, Long l3, int i, Object obj) {
            if ((i & 1) != 0) {
                l = replayStats.recordsCount;
            }
            if ((i & 2) != 0) {
                l2 = replayStats.segmentsCount;
            }
            if ((i & 4) != 0) {
                l3 = replayStats.segmentsTotalRawSize;
            }
            return replayStats.copy(l, l2, l3);
        }

        public static final ReplayStats fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ReplayStats fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getRecordsCount() {
            return this.recordsCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getSegmentsCount() {
            return this.segmentsCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getSegmentsTotalRawSize() {
            return this.segmentsTotalRawSize;
        }

        public final ReplayStats copy(Long recordsCount, Long segmentsCount, Long segmentsTotalRawSize) {
            return new ReplayStats(recordsCount, segmentsCount, segmentsTotalRawSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReplayStats)) {
                return false;
            }
            ReplayStats replayStats = (ReplayStats) other;
            return wl7.b(this.recordsCount, replayStats.recordsCount) && wl7.b(this.segmentsCount, replayStats.segmentsCount) && wl7.b(this.segmentsTotalRawSize, replayStats.segmentsTotalRawSize);
        }

        public final Long getRecordsCount() {
            return this.recordsCount;
        }

        public final Long getSegmentsCount() {
            return this.segmentsCount;
        }

        public final Long getSegmentsTotalRawSize() {
            return this.segmentsTotalRawSize;
        }

        public int hashCode() {
            Long l = this.recordsCount;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.segmentsCount;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.segmentsTotalRawSize;
            return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Long l = this.recordsCount;
            if (l != null) {
                ia.o(l, ab8Var, FeaturesContextResolver.VIEW_RECORDS_COUNT_KEY);
            }
            Long l2 = this.segmentsCount;
            if (l2 != null) {
                ia.o(l2, ab8Var, "segments_count");
            }
            Long l3 = this.segmentsTotalRawSize;
            if (l3 != null) {
                ia.o(l3, ab8Var, "segments_total_raw_size");
            }
            return ab8Var;
        }

        public String toString() {
            return "ReplayStats(recordsCount=" + this.recordsCount + ", segmentsCount=" + this.segmentsCount + ", segmentsTotalRawSize=" + this.segmentsTotalRawSize + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayStats$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ReplayStats fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ReplayStats", e);
                    return null;
                }
            }

            public final ReplayStats fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m(FeaturesContextResolver.VIEW_RECORDS_COUNT_KEY);
                    Long lValueOf = ka8VarM != null ? Long.valueOf(ka8VarM.e()) : null;
                    ka8 ka8VarM2 = jsonObject.m("segments_count");
                    Long lValueOf2 = ka8VarM2 != null ? Long.valueOf(ka8VarM2.e()) : null;
                    ka8 ka8VarM3 = jsonObject.m("segments_total_raw_size");
                    return new ReplayStats(lValueOf, lValueOf2, ka8VarM3 != null ? Long.valueOf(ka8VarM3.e()) : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ReplayStats", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ReplayStats", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ReplayStats", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public ReplayStats(Long l, Long l2, Long l3) {
            this.recordsCount = l;
            this.segmentsCount = l2;
            this.segmentsTotalRawSize = l3;
        }

        public ReplayStats() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Resource;", "", "", "count", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Resource;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCount", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Resource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Resource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Resource;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Resource;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\r¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "", "", "maxDepth", "maxDepthScrollTop", "maxScrollHeight", "maxScrollHeightTime", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getMaxDepth", "getMaxDepthScrollTop", "getMaxScrollHeight", "getMaxScrollHeightTime", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Scroll {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Number maxDepth;
        private final Number maxDepthScrollTop;
        private final Number maxScrollHeight;
        private final Number maxScrollHeightTime;

        public Scroll(Number number, Number number2, Number number3, Number number4) {
            number.getClass();
            number2.getClass();
            number3.getClass();
            number4.getClass();
            this.maxDepth = number;
            this.maxDepthScrollTop = number2;
            this.maxScrollHeight = number3;
            this.maxScrollHeightTime = number4;
        }

        public static /* synthetic */ Scroll copy$default(Scroll scroll, Number number, Number number2, Number number3, Number number4, int i, Object obj) {
            if ((i & 1) != 0) {
                number = scroll.maxDepth;
            }
            if ((i & 2) != 0) {
                number2 = scroll.maxDepthScrollTop;
            }
            if ((i & 4) != 0) {
                number3 = scroll.maxScrollHeight;
            }
            if ((i & 8) != 0) {
                number4 = scroll.maxScrollHeightTime;
            }
            return scroll.copy(number, number2, number3, number4);
        }

        public static final Scroll fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Scroll fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Number getMaxDepth() {
            return this.maxDepth;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Number getMaxDepthScrollTop() {
            return this.maxDepthScrollTop;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Number getMaxScrollHeight() {
            return this.maxScrollHeight;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Number getMaxScrollHeightTime() {
            return this.maxScrollHeightTime;
        }

        public final Scroll copy(Number maxDepth, Number maxDepthScrollTop, Number maxScrollHeight, Number maxScrollHeightTime) {
            maxDepth.getClass();
            maxDepthScrollTop.getClass();
            maxScrollHeight.getClass();
            maxScrollHeightTime.getClass();
            return new Scroll(maxDepth, maxDepthScrollTop, maxScrollHeight, maxScrollHeightTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Scroll)) {
                return false;
            }
            Scroll scroll = (Scroll) other;
            return wl7.b(this.maxDepth, scroll.maxDepth) && wl7.b(this.maxDepthScrollTop, scroll.maxDepthScrollTop) && wl7.b(this.maxScrollHeight, scroll.maxScrollHeight) && wl7.b(this.maxScrollHeightTime, scroll.maxScrollHeightTime);
        }

        public final Number getMaxDepth() {
            return this.maxDepth;
        }

        public final Number getMaxDepthScrollTop() {
            return this.maxDepthScrollTop;
        }

        public final Number getMaxScrollHeight() {
            return this.maxScrollHeight;
        }

        public final Number getMaxScrollHeightTime() {
            return this.maxScrollHeightTime;
        }

        public int hashCode() {
            return this.maxScrollHeightTime.hashCode() + ((this.maxScrollHeight.hashCode() + ((this.maxDepthScrollTop.hashCode() + (this.maxDepth.hashCode() * 31)) * 31)) * 31);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(this.maxDepth, "max_depth");
            ab8Var.j(this.maxDepthScrollTop, "max_depth_scroll_top");
            ab8Var.j(this.maxScrollHeight, "max_scroll_height");
            ab8Var.j(this.maxScrollHeightTime, "max_scroll_height_time");
            return ab8Var;
        }

        public String toString() {
            return "Scroll(maxDepth=" + this.maxDepth + ", maxDepthScrollTop=" + this.maxDepthScrollTop + ", maxScrollHeight=" + this.maxScrollHeight + ", maxScrollHeightTime=" + this.maxScrollHeightTime + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Scroll$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Scroll fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Scroll", e);
                    return null;
                }
            }

            public final Scroll fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    Number numberF = jsonObject.m("max_depth").f();
                    Number numberF2 = jsonObject.m("max_depth_scroll_top").f();
                    Number numberF3 = jsonObject.m("max_scroll_height").f();
                    Number numberF4 = jsonObject.m("max_scroll_height_time").f();
                    numberF.getClass();
                    numberF2.getClass();
                    numberF3.getClass();
                    numberF4.getClass();
                    return new Scroll(numberF, numberF2, numberF3, numberF4);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Scroll", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Scroll", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Scroll", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$State;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ACTIVE", "PASSIVE", "HIDDEN", "FROZEN", "TERMINATED", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum State {
        ACTIVE(AppStateModule.APP_STATE_ACTIVE),
        PASSIVE("passive"),
        HIDDEN("hidden"),
        FROZEN("frozen"),
        TERMINATED("terminated");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        State(String str) {
            this.jsonValue = str;
        }

        public static final State fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$State$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$State;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final State fromJson(String jsonString) {
                jsonString.getClass();
                for (State state : State.values()) {
                    if (wl7.b(state.jsonValue, jsonString)) {
                        return state;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Status;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Status$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$Status;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "getResultId", "Ljava/lang/Boolean;", "getInjected", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$Usr;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "getAnonymousId", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Usr;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b&\u0010\u0014¨\u0006("}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "type", "", "hasReplay", "isActive", "sampledForReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "getType", "Ljava/lang/Boolean;", "getHasReplay", "getSampledForReplay", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ViewEventSession {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean hasReplay;
        private final String id;
        private final Boolean isActive;
        private final Boolean sampledForReplay;
        private final ViewEventSessionType type;

        public /* synthetic */ ViewEventSession(String str, ViewEventSessionType viewEventSessionType, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, viewEventSessionType, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? Boolean.TRUE : bool2, (i & 16) != 0 ? null : bool3);
        }

        public static /* synthetic */ ViewEventSession copy$default(ViewEventSession viewEventSession, String str, ViewEventSessionType viewEventSessionType, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewEventSession.id;
            }
            if ((i & 2) != 0) {
                viewEventSessionType = viewEventSession.type;
            }
            if ((i & 4) != 0) {
                bool = viewEventSession.hasReplay;
            }
            if ((i & 8) != 0) {
                bool2 = viewEventSession.isActive;
            }
            if ((i & 16) != 0) {
                bool3 = viewEventSession.sampledForReplay;
            }
            Boolean bool4 = bool3;
            Boolean bool5 = bool;
            return viewEventSession.copy(str, viewEventSessionType, bool5, bool2, bool4);
        }

        public static final ViewEventSession fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ViewEventSession fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ViewEventSessionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getIsActive() {
            return this.isActive;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getSampledForReplay() {
            return this.sampledForReplay;
        }

        public final ViewEventSession copy(String id, ViewEventSessionType type, Boolean hasReplay, Boolean isActive, Boolean sampledForReplay) {
            id.getClass();
            type.getClass();
            return new ViewEventSession(id, type, hasReplay, isActive, sampledForReplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewEventSession)) {
                return false;
            }
            ViewEventSession viewEventSession = (ViewEventSession) other;
            return wl7.b(this.id, viewEventSession.id) && this.type == viewEventSession.type && wl7.b(this.hasReplay, viewEventSession.hasReplay) && wl7.b(this.isActive, viewEventSession.isActive) && wl7.b(this.sampledForReplay, viewEventSession.sampledForReplay);
        }

        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final String getId() {
            return this.id;
        }

        public final Boolean getSampledForReplay() {
            return this.sampledForReplay;
        }

        public final ViewEventSessionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
            Boolean bool = this.hasReplay;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isActive;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.sampledForReplay;
            return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final Boolean isActive() {
            return this.isActive;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("id", this.id);
            ab8Var.i("type", this.type.toJson());
            Boolean bool = this.hasReplay;
            if (bool != null) {
                ab8Var.k(FeaturesContextResolver.HAS_REPLAY_KEY, bool);
            }
            Boolean bool2 = this.isActive;
            if (bool2 != null) {
                ab8Var.k("is_active", bool2);
            }
            Boolean bool3 = this.sampledForReplay;
            if (bool3 != null) {
                ab8Var.k("sampled_for_replay", bool3);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            ViewEventSessionType viewEventSessionType = this.type;
            Boolean bool = this.hasReplay;
            Boolean bool2 = this.isActive;
            Boolean bool3 = this.sampledForReplay;
            StringBuilder sb = new StringBuilder("ViewEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(viewEventSessionType);
            sb.append(", hasReplay=");
            sb.append(bool);
            sb.append(", isActive=");
            sb.append(bool2);
            sb.append(", sampledForReplay=");
            return l5.n(sb, bool3, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewEventSession fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ViewEventSession", e);
                    return null;
                }
            }

            public final ViewEventSession fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    ViewEventSessionType.Companion companion = ViewEventSessionType.INSTANCE;
                    String strG2 = jsonObject.m("type").g();
                    strG2.getClass();
                    ViewEventSessionType viewEventSessionTypeFromJson = companion.fromJson(strG2);
                    ka8 ka8VarM = jsonObject.m(FeaturesContextResolver.HAS_REPLAY_KEY);
                    Boolean boolValueOf = ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null;
                    ka8 ka8VarM2 = jsonObject.m("is_active");
                    Boolean boolValueOf2 = ka8VarM2 != null ? Boolean.valueOf(ka8VarM2.a()) : null;
                    ka8 ka8VarM3 = jsonObject.m("sampled_for_replay");
                    Boolean boolValueOf3 = ka8VarM3 != null ? Boolean.valueOf(ka8VarM3.a()) : null;
                    strG.getClass();
                    return new ViewEventSession(strG, viewEventSessionTypeFromJson, boolValueOf, boolValueOf2, boolValueOf3);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ViewEventSession", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ViewEventSession", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ViewEventSession", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public ViewEventSession(String str, ViewEventSessionType viewEventSessionType, Boolean bool, Boolean bool2, Boolean bool3) {
            str.getClass();
            viewEventSessionType.getClass();
            this.id = str;
            this.type = viewEventSessionType;
            this.hasReplay = bool;
            this.isActive = bool2;
            this.sampledForReplay = bool3;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER", "SYNTHETICS", "CI_TEST", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ViewEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ViewEventSessionType(String str) {
            this.jsonValue = str;
        }

        public static final ViewEventSessionType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewEventSessionType fromJson(String jsonString) {
                jsonString.getClass();
                for (ViewEventSessionType viewEventSessionType : ViewEventSessionType.values()) {
                    if (wl7.b(viewEventSessionType.jsonValue, jsonString)) {
                        return viewEventSessionType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ViewEventSource {
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

        ViewEventSource(String str) {
            this.jsonValue = str;
        }

        public static final ViewEventSource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewEventSource fromJson(String jsonString) {
                jsonString.getClass();
                for (ViewEventSource viewEventSource : ViewEventSource.values()) {
                    if (wl7.b(viewEventSource.jsonValue, jsonString)) {
                        return viewEventSource;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0004\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\b\n\u0002\bG\b\u0086\b\u0018\u0000 Ì\u00012\u00020\u0001:\u0002Ì\u0001B\u009d\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010<¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010FJ\u0010\u0010H\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bH\u0010FJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010FJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bL\u0010KJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bM\u0010KJ\u0012\u0010N\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bR\u0010KJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bS\u0010KJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u0010FJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bU\u0010KJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bV\u0010KJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010FJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bX\u0010KJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bY\u0010KJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010FJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b]\u0010KJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b^\u0010FJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b_\u0010KJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b`\u0010KJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\ba\u0010KJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bb\u0010KJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bc\u0010KJ\u0012\u0010d\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bh\u0010gJ\u0010\u0010i\u001a\u00020%HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0010\u0010k\u001a\u00020'HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0012\u0010q\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0010\u0010s\u001a\u00020/HÆ\u0003¢\u0006\u0004\bs\u0010tJ\u0012\u0010u\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bu\u0010vJ\u0018\u0010w\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\by\u0010\\J\u0012\u0010z\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bz\u0010\\J\u0012\u0010{\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b{\u0010\\J\u0012\u0010|\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b|\u0010\\J\u0012\u0010}\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b}\u0010\\J\u0012\u0010~\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b~\u0010\\J\u0013\u0010\u007f\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0080\u0001Jµ\u0004\u0010\u0083\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010<HÆ\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0012\u0010\u0085\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u0085\u0001\u0010FJ\u0014\u0010\u0087\u0001\u001a\u00030\u0086\u0001HÖ\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\"2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010FR(\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0004\u0010\u008c\u0001\u001a\u0005\b\u008e\u0001\u0010F\"\u0006\b\u008f\u0001\u0010\u0090\u0001R&\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0005\u0010\u008c\u0001\u001a\u0005\b\u0091\u0001\u0010F\"\u0006\b\u0092\u0001\u0010\u0090\u0001R(\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0006\u0010\u008c\u0001\u001a\u0005\b\u0093\u0001\u0010F\"\u0006\b\u0094\u0001\u0010\u0090\u0001R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\b\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010KR\u001b\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u0095\u0001\u001a\u0005\b\u0097\u0001\u0010KR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u0095\u0001\u001a\u0005\b\u0098\u0001\u0010KR\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010OR\u0019\u0010\r\u001a\u00020\u00078\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010QR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0095\u0001\u001a\u0005\b\u009d\u0001\u0010KR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0095\u0001\u001a\u0005\b\u009e\u0001\u0010KR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u008c\u0001\u001a\u0005\b\u009f\u0001\u0010FR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0095\u0001\u001a\u0005\b \u0001\u0010KR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u0095\u0001\u001a\u0005\b¡\u0001\u0010KR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u008c\u0001\u001a\u0005\b¢\u0001\u0010FR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010\u0095\u0001\u001a\u0005\b£\u0001\u0010KR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u0095\u0001\u001a\u0005\b¤\u0001\u0010KR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u008c\u0001\u001a\u0005\b¥\u0001\u0010FR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010¦\u0001\u001a\u0005\b§\u0001\u0010\\R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u0095\u0001\u001a\u0005\b¨\u0001\u0010KR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u008c\u0001\u001a\u0005\b©\u0001\u0010FR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0095\u0001\u001a\u0005\bª\u0001\u0010KR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0095\u0001\u001a\u0005\b«\u0001\u0010KR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0095\u0001\u001a\u0005\b¬\u0001\u0010KR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0095\u0001\u001a\u0005\b\u00ad\u0001\u0010KR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0095\u0001\u001a\u0005\b®\u0001\u0010KR\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b!\u0010¯\u0001\u001a\u0005\b°\u0001\u0010eR\u001a\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\r\n\u0005\b#\u0010±\u0001\u001a\u0004\b#\u0010gR\u001a\u0010$\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\r\n\u0005\b$\u0010±\u0001\u001a\u0004\b$\u0010gR\u0019\u0010&\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\b&\u0010²\u0001\u001a\u0005\b³\u0001\u0010jR\u0019\u0010(\u001a\u00020'8\u0006¢\u0006\u000e\n\u0005\b(\u0010´\u0001\u001a\u0005\bµ\u0001\u0010lR\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b*\u0010¶\u0001\u001a\u0005\b·\u0001\u0010nR\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010pR\u001b\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\u000e\n\u0005\b.\u0010º\u0001\u001a\u0005\b»\u0001\u0010rR\u0019\u00100\u001a\u00020/8\u0006¢\u0006\u000e\n\u0005\b0\u0010¼\u0001\u001a\u0005\b½\u0001\u0010tR\u001b\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000e\n\u0005\b2\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010vR!\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\b5\u0010À\u0001\u001a\u0005\bÁ\u0001\u0010xR\u001b\u00106\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b6\u0010¦\u0001\u001a\u0005\bÂ\u0001\u0010\\R\u001b\u00107\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b7\u0010¦\u0001\u001a\u0005\bÃ\u0001\u0010\\R\u001b\u00108\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b8\u0010¦\u0001\u001a\u0005\bÄ\u0001\u0010\\R\u001b\u00109\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b9\u0010¦\u0001\u001a\u0005\bÅ\u0001\u0010\\R\u001b\u0010:\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b:\u0010¦\u0001\u001a\u0005\bÆ\u0001\u0010\\R\u001b\u0010;\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b;\u0010¦\u0001\u001a\u0005\bÇ\u0001\u0010\\R\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000f\n\u0005\b=\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010\u0080\u0001R\u001c\u0010>\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000f\n\u0005\b>\u0010È\u0001\u001a\u0006\bÊ\u0001\u0010\u0080\u0001R\u001c\u0010?\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000f\n\u0005\b?\u0010È\u0001\u001a\u0006\bË\u0001\u0010\u0080\u0001¨\u0006Í\u0001"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "", "", "id", "referrer", "url", "name", "", "loadingTime", "networkSettledTime", "interactionToNextViewTime", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "loadingType", "timeSpent", "firstContentfulPaint", "largestContentfulPaint", "largestContentfulPaintTargetSelector", "firstInputDelay", "firstInputTime", "firstInputTargetSelector", "interactionToNextPaint", "interactionToNextPaintTime", "interactionToNextPaintTargetSelector", "", "cumulativeLayoutShift", "cumulativeLayoutShiftTime", "cumulativeLayoutShiftTargetSelector", "domComplete", "domContentLoaded", "domInteractive", "loadEvent", "firstByte", "Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "customTimings", "", "isActive", "isSlowRendered", "Lcom/datadog/android/rum/model/ViewEvent$Action;", RumEventDeserializer.EVENT_TYPE_ACTION, "Lcom/datadog/android/rum/model/ViewEvent$Error;", "error", "Lcom/datadog/android/rum/model/ViewEvent$Crash;", "crash", "Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "longTask", "Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "frozenFrame", "Lcom/datadog/android/rum/model/ViewEvent$Resource;", RumEventDeserializer.EVENT_TYPE_RESOURCE, "Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "frustration", "", "Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "inForegroundPeriods", "memoryAverage", "memoryMax", "cpuTicksCount", "cpuTicksPerSecond", "refreshRateAverage", "refreshRateMin", "Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "flutterBuildTime", "flutterRasterTime", "jsRefreshRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$LoadingType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ViewEvent$Action;Lcom/datadog/android/rum/model/ViewEvent$Error;Lcom/datadog/android/rum/model/ViewEvent$Crash;Lcom/datadog/android/rum/model/ViewEvent$LongTask;Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;Lcom/datadog/android/rum/model/ViewEvent$Resource;Lcom/datadog/android/rum/model/ViewEvent$Frustration;Ljava/util/List;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "()Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "component9", "()J", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Number;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "()Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "component28", "()Ljava/lang/Boolean;", "component29", "component30", "()Lcom/datadog/android/rum/model/ViewEvent$Action;", "component31", "()Lcom/datadog/android/rum/model/ViewEvent$Error;", "component32", "()Lcom/datadog/android/rum/model/ViewEvent$Crash;", "component33", "()Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "component34", "()Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "component35", "()Lcom/datadog/android/rum/model/ViewEvent$Resource;", "component36", "()Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "component37", "()Ljava/util/List;", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "()Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "component45", "component46", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$LoadingType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ViewEvent$Action;Lcom/datadog/android/rum/model/ViewEvent$Error;Lcom/datadog/android/rum/model/ViewEvent$Crash;Lcom/datadog/android/rum/model/ViewEvent$LongTask;Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;Lcom/datadog/android/rum/model/ViewEvent$Resource;Lcom/datadog/android/rum/model/ViewEvent$Frustration;Ljava/util/List;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getReferrer", "setReferrer", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getName", "setName", "Ljava/lang/Long;", "getLoadingTime", "getNetworkSettledTime", "getInteractionToNextViewTime", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "getLoadingType", "J", "getTimeSpent", "getFirstContentfulPaint", "getLargestContentfulPaint", "getLargestContentfulPaintTargetSelector", "getFirstInputDelay", "getFirstInputTime", "getFirstInputTargetSelector", "getInteractionToNextPaint", "getInteractionToNextPaintTime", "getInteractionToNextPaintTargetSelector", "Ljava/lang/Number;", "getCumulativeLayoutShift", "getCumulativeLayoutShiftTime", "getCumulativeLayoutShiftTargetSelector", "getDomComplete", "getDomContentLoaded", "getDomInteractive", "getLoadEvent", "getFirstByte", "Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "getCustomTimings", "Ljava/lang/Boolean;", "Lcom/datadog/android/rum/model/ViewEvent$Action;", "getAction", "Lcom/datadog/android/rum/model/ViewEvent$Error;", "getError", "Lcom/datadog/android/rum/model/ViewEvent$Crash;", "getCrash", "Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "getLongTask", "Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "getFrozenFrame", "Lcom/datadog/android/rum/model/ViewEvent$Resource;", "getResource", "Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "getFrustration", "Ljava/util/List;", "getInForegroundPeriods", "getMemoryAverage", "getMemoryMax", "getCpuTicksCount", "getCpuTicksPerSecond", "getRefreshRateAverage", "getRefreshRateMin", "Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "getFlutterBuildTime", "getFlutterRasterTime", "getJsRefreshRate", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ViewEventView {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Action action;
        private final Number cpuTicksCount;
        private final Number cpuTicksPerSecond;
        private final Crash crash;
        private final Number cumulativeLayoutShift;
        private final String cumulativeLayoutShiftTargetSelector;
        private final Long cumulativeLayoutShiftTime;
        private final CustomTimings customTimings;
        private final Long domComplete;
        private final Long domContentLoaded;
        private final Long domInteractive;
        private final Error error;
        private final Long firstByte;
        private final Long firstContentfulPaint;
        private final Long firstInputDelay;
        private final String firstInputTargetSelector;
        private final Long firstInputTime;
        private final FlutterBuildTime flutterBuildTime;
        private final FlutterBuildTime flutterRasterTime;
        private final FrozenFrame frozenFrame;
        private final Frustration frustration;
        private final String id;
        private final List<InForegroundPeriod> inForegroundPeriods;
        private final Long interactionToNextPaint;
        private final String interactionToNextPaintTargetSelector;
        private final Long interactionToNextPaintTime;
        private final Long interactionToNextViewTime;
        private final Boolean isActive;
        private final Boolean isSlowRendered;
        private final FlutterBuildTime jsRefreshRate;
        private final Long largestContentfulPaint;
        private final String largestContentfulPaintTargetSelector;
        private final Long loadEvent;
        private final Long loadingTime;
        private final LoadingType loadingType;
        private final LongTask longTask;
        private final Number memoryAverage;
        private final Number memoryMax;
        private String name;
        private final Long networkSettledTime;
        private String referrer;
        private final Number refreshRateAverage;
        private final Number refreshRateMin;
        private final Resource resource;
        private final long timeSpent;
        private String url;

        public /* synthetic */ ViewEventView(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, LoadingType loadingType, long j, Long l4, Long l5, String str5, Long l6, Long l7, String str6, Long l8, Long l9, String str7, Number number, Long l10, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, CustomTimings customTimings, Boolean bool, Boolean bool2, Action action, Error error, Crash crash, LongTask longTask, FrozenFrame frozenFrame, Resource resource, Frustration frustration, List list, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, FlutterBuildTime flutterBuildTime, FlutterBuildTime flutterBuildTime2, FlutterBuildTime flutterBuildTime3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : loadingType, j, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : l4, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : l5, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : l6, (i & 8192) != 0 ? null : l7, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : l8, (65536 & i) != 0 ? null : l9, (131072 & i) != 0 ? null : str7, (262144 & i) != 0 ? null : number, (524288 & i) != 0 ? null : l10, (1048576 & i) != 0 ? null : str8, (2097152 & i) != 0 ? null : l11, (4194304 & i) != 0 ? null : l12, (8388608 & i) != 0 ? null : l13, (16777216 & i) != 0 ? null : l14, (33554432 & i) != 0 ? null : l15, (67108864 & i) != 0 ? null : customTimings, (134217728 & i) != 0 ? null : bool, (268435456 & i) != 0 ? null : bool2, action, error, (i & Integer.MIN_VALUE) != 0 ? null : crash, (i2 & 1) != 0 ? null : longTask, (i2 & 2) != 0 ? null : frozenFrame, resource, (i2 & 8) != 0 ? null : frustration, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : number2, (i2 & 64) != 0 ? null : number3, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : number4, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : number5, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : number6, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : number7, (i2 & 2048) != 0 ? null : flutterBuildTime, (i2 & 4096) != 0 ? null : flutterBuildTime2, (i2 & 8192) != 0 ? null : flutterBuildTime3);
        }

        public static final ViewEventView fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ViewEventView fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Long getFirstContentfulPaint() {
            return this.firstContentfulPaint;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Long getLargestContentfulPaint() {
            return this.largestContentfulPaint;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getLargestContentfulPaintTargetSelector() {
            return this.largestContentfulPaintTargetSelector;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Long getFirstInputDelay() {
            return this.firstInputDelay;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Long getFirstInputTime() {
            return this.firstInputTime;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getFirstInputTargetSelector() {
            return this.firstInputTargetSelector;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Long getInteractionToNextPaint() {
            return this.interactionToNextPaint;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final Long getInteractionToNextPaintTime() {
            return this.interactionToNextPaintTime;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getInteractionToNextPaintTargetSelector() {
            return this.interactionToNextPaintTargetSelector;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Number getCumulativeLayoutShift() {
            return this.cumulativeLayoutShift;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Long getCumulativeLayoutShiftTime() {
            return this.cumulativeLayoutShiftTime;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getCumulativeLayoutShiftTargetSelector() {
            return this.cumulativeLayoutShiftTargetSelector;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getDomComplete() {
            return this.domComplete;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final Long getDomContentLoaded() {
            return this.domContentLoaded;
        }

        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Long getDomInteractive() {
            return this.domInteractive;
        }

        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Long getLoadEvent() {
            return this.loadEvent;
        }

        /* JADX INFO: renamed from: component26, reason: from getter */
        public final Long getFirstByte() {
            return this.firstByte;
        }

        /* JADX INFO: renamed from: component27, reason: from getter */
        public final CustomTimings getCustomTimings() {
            return this.customTimings;
        }

        /* JADX INFO: renamed from: component28, reason: from getter */
        public final Boolean getIsActive() {
            return this.isActive;
        }

        /* JADX INFO: renamed from: component29, reason: from getter */
        public final Boolean getIsSlowRendered() {
            return this.isSlowRendered;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component30, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component31, reason: from getter */
        public final Error getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component32, reason: from getter */
        public final Crash getCrash() {
            return this.crash;
        }

        /* JADX INFO: renamed from: component33, reason: from getter */
        public final LongTask getLongTask() {
            return this.longTask;
        }

        /* JADX INFO: renamed from: component34, reason: from getter */
        public final FrozenFrame getFrozenFrame() {
            return this.frozenFrame;
        }

        /* JADX INFO: renamed from: component35, reason: from getter */
        public final Resource getResource() {
            return this.resource;
        }

        /* JADX INFO: renamed from: component36, reason: from getter */
        public final Frustration getFrustration() {
            return this.frustration;
        }

        public final List<InForegroundPeriod> component37() {
            return this.inForegroundPeriods;
        }

        /* JADX INFO: renamed from: component38, reason: from getter */
        public final Number getMemoryAverage() {
            return this.memoryAverage;
        }

        /* JADX INFO: renamed from: component39, reason: from getter */
        public final Number getMemoryMax() {
            return this.memoryMax;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component40, reason: from getter */
        public final Number getCpuTicksCount() {
            return this.cpuTicksCount;
        }

        /* JADX INFO: renamed from: component41, reason: from getter */
        public final Number getCpuTicksPerSecond() {
            return this.cpuTicksPerSecond;
        }

        /* JADX INFO: renamed from: component42, reason: from getter */
        public final Number getRefreshRateAverage() {
            return this.refreshRateAverage;
        }

        /* JADX INFO: renamed from: component43, reason: from getter */
        public final Number getRefreshRateMin() {
            return this.refreshRateMin;
        }

        /* JADX INFO: renamed from: component44, reason: from getter */
        public final FlutterBuildTime getFlutterBuildTime() {
            return this.flutterBuildTime;
        }

        /* JADX INFO: renamed from: component45, reason: from getter */
        public final FlutterBuildTime getFlutterRasterTime() {
            return this.flutterRasterTime;
        }

        /* JADX INFO: renamed from: component46, reason: from getter */
        public final FlutterBuildTime getJsRefreshRate() {
            return this.jsRefreshRate;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getLoadingTime() {
            return this.loadingTime;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getNetworkSettledTime() {
            return this.networkSettledTime;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getInteractionToNextViewTime() {
            return this.interactionToNextViewTime;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final LoadingType getLoadingType() {
            return this.loadingType;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final long getTimeSpent() {
            return this.timeSpent;
        }

        public final ViewEventView copy(String id, String referrer, String url, String name, Long loadingTime, Long networkSettledTime, Long interactionToNextViewTime, LoadingType loadingType, long timeSpent, Long firstContentfulPaint, Long largestContentfulPaint, String largestContentfulPaintTargetSelector, Long firstInputDelay, Long firstInputTime, String firstInputTargetSelector, Long interactionToNextPaint, Long interactionToNextPaintTime, String interactionToNextPaintTargetSelector, Number cumulativeLayoutShift, Long cumulativeLayoutShiftTime, String cumulativeLayoutShiftTargetSelector, Long domComplete, Long domContentLoaded, Long domInteractive, Long loadEvent, Long firstByte, CustomTimings customTimings, Boolean isActive, Boolean isSlowRendered, Action action, Error error, Crash crash, LongTask longTask, FrozenFrame frozenFrame, Resource resource, Frustration frustration, List<InForegroundPeriod> inForegroundPeriods, Number memoryAverage, Number memoryMax, Number cpuTicksCount, Number cpuTicksPerSecond, Number refreshRateAverage, Number refreshRateMin, FlutterBuildTime flutterBuildTime, FlutterBuildTime flutterRasterTime, FlutterBuildTime jsRefreshRate) {
            id.getClass();
            url.getClass();
            action.getClass();
            error.getClass();
            resource.getClass();
            return new ViewEventView(id, referrer, url, name, loadingTime, networkSettledTime, interactionToNextViewTime, loadingType, timeSpent, firstContentfulPaint, largestContentfulPaint, largestContentfulPaintTargetSelector, firstInputDelay, firstInputTime, firstInputTargetSelector, interactionToNextPaint, interactionToNextPaintTime, interactionToNextPaintTargetSelector, cumulativeLayoutShift, cumulativeLayoutShiftTime, cumulativeLayoutShiftTargetSelector, domComplete, domContentLoaded, domInteractive, loadEvent, firstByte, customTimings, isActive, isSlowRendered, action, error, crash, longTask, frozenFrame, resource, frustration, inForegroundPeriods, memoryAverage, memoryMax, cpuTicksCount, cpuTicksPerSecond, refreshRateAverage, refreshRateMin, flutterBuildTime, flutterRasterTime, jsRefreshRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewEventView)) {
                return false;
            }
            ViewEventView viewEventView = (ViewEventView) other;
            return wl7.b(this.id, viewEventView.id) && wl7.b(this.referrer, viewEventView.referrer) && wl7.b(this.url, viewEventView.url) && wl7.b(this.name, viewEventView.name) && wl7.b(this.loadingTime, viewEventView.loadingTime) && wl7.b(this.networkSettledTime, viewEventView.networkSettledTime) && wl7.b(this.interactionToNextViewTime, viewEventView.interactionToNextViewTime) && this.loadingType == viewEventView.loadingType && this.timeSpent == viewEventView.timeSpent && wl7.b(this.firstContentfulPaint, viewEventView.firstContentfulPaint) && wl7.b(this.largestContentfulPaint, viewEventView.largestContentfulPaint) && wl7.b(this.largestContentfulPaintTargetSelector, viewEventView.largestContentfulPaintTargetSelector) && wl7.b(this.firstInputDelay, viewEventView.firstInputDelay) && wl7.b(this.firstInputTime, viewEventView.firstInputTime) && wl7.b(this.firstInputTargetSelector, viewEventView.firstInputTargetSelector) && wl7.b(this.interactionToNextPaint, viewEventView.interactionToNextPaint) && wl7.b(this.interactionToNextPaintTime, viewEventView.interactionToNextPaintTime) && wl7.b(this.interactionToNextPaintTargetSelector, viewEventView.interactionToNextPaintTargetSelector) && wl7.b(this.cumulativeLayoutShift, viewEventView.cumulativeLayoutShift) && wl7.b(this.cumulativeLayoutShiftTime, viewEventView.cumulativeLayoutShiftTime) && wl7.b(this.cumulativeLayoutShiftTargetSelector, viewEventView.cumulativeLayoutShiftTargetSelector) && wl7.b(this.domComplete, viewEventView.domComplete) && wl7.b(this.domContentLoaded, viewEventView.domContentLoaded) && wl7.b(this.domInteractive, viewEventView.domInteractive) && wl7.b(this.loadEvent, viewEventView.loadEvent) && wl7.b(this.firstByte, viewEventView.firstByte) && wl7.b(this.customTimings, viewEventView.customTimings) && wl7.b(this.isActive, viewEventView.isActive) && wl7.b(this.isSlowRendered, viewEventView.isSlowRendered) && wl7.b(this.action, viewEventView.action) && wl7.b(this.error, viewEventView.error) && wl7.b(this.crash, viewEventView.crash) && wl7.b(this.longTask, viewEventView.longTask) && wl7.b(this.frozenFrame, viewEventView.frozenFrame) && wl7.b(this.resource, viewEventView.resource) && wl7.b(this.frustration, viewEventView.frustration) && wl7.b(this.inForegroundPeriods, viewEventView.inForegroundPeriods) && wl7.b(this.memoryAverage, viewEventView.memoryAverage) && wl7.b(this.memoryMax, viewEventView.memoryMax) && wl7.b(this.cpuTicksCount, viewEventView.cpuTicksCount) && wl7.b(this.cpuTicksPerSecond, viewEventView.cpuTicksPerSecond) && wl7.b(this.refreshRateAverage, viewEventView.refreshRateAverage) && wl7.b(this.refreshRateMin, viewEventView.refreshRateMin) && wl7.b(this.flutterBuildTime, viewEventView.flutterBuildTime) && wl7.b(this.flutterRasterTime, viewEventView.flutterRasterTime) && wl7.b(this.jsRefreshRate, viewEventView.jsRefreshRate);
        }

        public final Action getAction() {
            return this.action;
        }

        public final Number getCpuTicksCount() {
            return this.cpuTicksCount;
        }

        public final Number getCpuTicksPerSecond() {
            return this.cpuTicksPerSecond;
        }

        public final Crash getCrash() {
            return this.crash;
        }

        public final Number getCumulativeLayoutShift() {
            return this.cumulativeLayoutShift;
        }

        public final String getCumulativeLayoutShiftTargetSelector() {
            return this.cumulativeLayoutShiftTargetSelector;
        }

        public final Long getCumulativeLayoutShiftTime() {
            return this.cumulativeLayoutShiftTime;
        }

        public final CustomTimings getCustomTimings() {
            return this.customTimings;
        }

        public final Long getDomComplete() {
            return this.domComplete;
        }

        public final Long getDomContentLoaded() {
            return this.domContentLoaded;
        }

        public final Long getDomInteractive() {
            return this.domInteractive;
        }

        public final Error getError() {
            return this.error;
        }

        public final Long getFirstByte() {
            return this.firstByte;
        }

        public final Long getFirstContentfulPaint() {
            return this.firstContentfulPaint;
        }

        public final Long getFirstInputDelay() {
            return this.firstInputDelay;
        }

        public final String getFirstInputTargetSelector() {
            return this.firstInputTargetSelector;
        }

        public final Long getFirstInputTime() {
            return this.firstInputTime;
        }

        public final FlutterBuildTime getFlutterBuildTime() {
            return this.flutterBuildTime;
        }

        public final FlutterBuildTime getFlutterRasterTime() {
            return this.flutterRasterTime;
        }

        public final FrozenFrame getFrozenFrame() {
            return this.frozenFrame;
        }

        public final Frustration getFrustration() {
            return this.frustration;
        }

        public final String getId() {
            return this.id;
        }

        public final List<InForegroundPeriod> getInForegroundPeriods() {
            return this.inForegroundPeriods;
        }

        public final Long getInteractionToNextPaint() {
            return this.interactionToNextPaint;
        }

        public final String getInteractionToNextPaintTargetSelector() {
            return this.interactionToNextPaintTargetSelector;
        }

        public final Long getInteractionToNextPaintTime() {
            return this.interactionToNextPaintTime;
        }

        public final Long getInteractionToNextViewTime() {
            return this.interactionToNextViewTime;
        }

        public final FlutterBuildTime getJsRefreshRate() {
            return this.jsRefreshRate;
        }

        public final Long getLargestContentfulPaint() {
            return this.largestContentfulPaint;
        }

        public final String getLargestContentfulPaintTargetSelector() {
            return this.largestContentfulPaintTargetSelector;
        }

        public final Long getLoadEvent() {
            return this.loadEvent;
        }

        public final Long getLoadingTime() {
            return this.loadingTime;
        }

        public final LoadingType getLoadingType() {
            return this.loadingType;
        }

        public final LongTask getLongTask() {
            return this.longTask;
        }

        public final Number getMemoryAverage() {
            return this.memoryAverage;
        }

        public final Number getMemoryMax() {
            return this.memoryMax;
        }

        public final String getName() {
            return this.name;
        }

        public final Long getNetworkSettledTime() {
            return this.networkSettledTime;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final Number getRefreshRateAverage() {
            return this.refreshRateAverage;
        }

        public final Number getRefreshRateMin() {
            return this.refreshRateMin;
        }

        public final Resource getResource() {
            return this.resource;
        }

        public final long getTimeSpent() {
            return this.timeSpent;
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
            Long l = this.loadingTime;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.networkSettledTime;
            int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.interactionToNextViewTime;
            int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
            LoadingType loadingType = this.loadingType;
            int iD2 = ia.d((iHashCode5 + (loadingType == null ? 0 : loadingType.hashCode())) * 31, 31, this.timeSpent);
            Long l4 = this.firstContentfulPaint;
            int iHashCode6 = (iD2 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.largestContentfulPaint;
            int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
            String str3 = this.largestContentfulPaintTargetSelector;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l6 = this.firstInputDelay;
            int iHashCode9 = (iHashCode8 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l7 = this.firstInputTime;
            int iHashCode10 = (iHashCode9 + (l7 == null ? 0 : l7.hashCode())) * 31;
            String str4 = this.firstInputTargetSelector;
            int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l8 = this.interactionToNextPaint;
            int iHashCode12 = (iHashCode11 + (l8 == null ? 0 : l8.hashCode())) * 31;
            Long l9 = this.interactionToNextPaintTime;
            int iHashCode13 = (iHashCode12 + (l9 == null ? 0 : l9.hashCode())) * 31;
            String str5 = this.interactionToNextPaintTargetSelector;
            int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Number number = this.cumulativeLayoutShift;
            int iHashCode15 = (iHashCode14 + (number == null ? 0 : number.hashCode())) * 31;
            Long l10 = this.cumulativeLayoutShiftTime;
            int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str6 = this.cumulativeLayoutShiftTargetSelector;
            int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l11 = this.domComplete;
            int iHashCode18 = (iHashCode17 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.domContentLoaded;
            int iHashCode19 = (iHashCode18 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.domInteractive;
            int iHashCode20 = (iHashCode19 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.loadEvent;
            int iHashCode21 = (iHashCode20 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.firstByte;
            int iHashCode22 = (iHashCode21 + (l15 == null ? 0 : l15.hashCode())) * 31;
            CustomTimings customTimings = this.customTimings;
            int iHashCode23 = (iHashCode22 + (customTimings == null ? 0 : customTimings.hashCode())) * 31;
            Boolean bool = this.isActive;
            int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSlowRendered;
            int iHashCode25 = (this.error.hashCode() + ((this.action.hashCode() + ((iHashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31)) * 31)) * 31;
            Crash crash = this.crash;
            int iHashCode26 = (iHashCode25 + (crash == null ? 0 : crash.hashCode())) * 31;
            LongTask longTask = this.longTask;
            int iHashCode27 = (iHashCode26 + (longTask == null ? 0 : longTask.hashCode())) * 31;
            FrozenFrame frozenFrame = this.frozenFrame;
            int iHashCode28 = (this.resource.hashCode() + ((iHashCode27 + (frozenFrame == null ? 0 : frozenFrame.hashCode())) * 31)) * 31;
            Frustration frustration = this.frustration;
            int iHashCode29 = (iHashCode28 + (frustration == null ? 0 : frustration.hashCode())) * 31;
            List<InForegroundPeriod> list = this.inForegroundPeriods;
            int iHashCode30 = (iHashCode29 + (list == null ? 0 : list.hashCode())) * 31;
            Number number2 = this.memoryAverage;
            int iHashCode31 = (iHashCode30 + (number2 == null ? 0 : number2.hashCode())) * 31;
            Number number3 = this.memoryMax;
            int iHashCode32 = (iHashCode31 + (number3 == null ? 0 : number3.hashCode())) * 31;
            Number number4 = this.cpuTicksCount;
            int iHashCode33 = (iHashCode32 + (number4 == null ? 0 : number4.hashCode())) * 31;
            Number number5 = this.cpuTicksPerSecond;
            int iHashCode34 = (iHashCode33 + (number5 == null ? 0 : number5.hashCode())) * 31;
            Number number6 = this.refreshRateAverage;
            int iHashCode35 = (iHashCode34 + (number6 == null ? 0 : number6.hashCode())) * 31;
            Number number7 = this.refreshRateMin;
            int iHashCode36 = (iHashCode35 + (number7 == null ? 0 : number7.hashCode())) * 31;
            FlutterBuildTime flutterBuildTime = this.flutterBuildTime;
            int iHashCode37 = (iHashCode36 + (flutterBuildTime == null ? 0 : flutterBuildTime.hashCode())) * 31;
            FlutterBuildTime flutterBuildTime2 = this.flutterRasterTime;
            int iHashCode38 = (iHashCode37 + (flutterBuildTime2 == null ? 0 : flutterBuildTime2.hashCode())) * 31;
            FlutterBuildTime flutterBuildTime3 = this.jsRefreshRate;
            return iHashCode38 + (flutterBuildTime3 != null ? flutterBuildTime3.hashCode() : 0);
        }

        public final Boolean isActive() {
            return this.isActive;
        }

        public final Boolean isSlowRendered() {
            return this.isSlowRendered;
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
            Long l = this.loadingTime;
            if (l != null) {
                ia.o(l, ab8Var, "loading_time");
            }
            Long l2 = this.networkSettledTime;
            if (l2 != null) {
                ia.o(l2, ab8Var, "network_settled_time");
            }
            Long l3 = this.interactionToNextViewTime;
            if (l3 != null) {
                ia.o(l3, ab8Var, "interaction_to_next_view_time");
            }
            LoadingType loadingType = this.loadingType;
            if (loadingType != null) {
                ab8Var.i("loading_type", loadingType.toJson());
            }
            ab8Var.j(Long.valueOf(this.timeSpent), "time_spent");
            Long l4 = this.firstContentfulPaint;
            if (l4 != null) {
                ia.o(l4, ab8Var, "first_contentful_paint");
            }
            Long l5 = this.largestContentfulPaint;
            if (l5 != null) {
                ia.o(l5, ab8Var, "largest_contentful_paint");
            }
            String str3 = this.largestContentfulPaintTargetSelector;
            if (str3 != null) {
                ab8Var.l("largest_contentful_paint_target_selector", str3);
            }
            Long l6 = this.firstInputDelay;
            if (l6 != null) {
                ia.o(l6, ab8Var, "first_input_delay");
            }
            Long l7 = this.firstInputTime;
            if (l7 != null) {
                ia.o(l7, ab8Var, "first_input_time");
            }
            String str4 = this.firstInputTargetSelector;
            if (str4 != null) {
                ab8Var.l("first_input_target_selector", str4);
            }
            Long l8 = this.interactionToNextPaint;
            if (l8 != null) {
                ia.o(l8, ab8Var, "interaction_to_next_paint");
            }
            Long l9 = this.interactionToNextPaintTime;
            if (l9 != null) {
                ia.o(l9, ab8Var, "interaction_to_next_paint_time");
            }
            String str5 = this.interactionToNextPaintTargetSelector;
            if (str5 != null) {
                ab8Var.l("interaction_to_next_paint_target_selector", str5);
            }
            Number number = this.cumulativeLayoutShift;
            if (number != null) {
                ab8Var.j(number, "cumulative_layout_shift");
            }
            Long l10 = this.cumulativeLayoutShiftTime;
            if (l10 != null) {
                ia.o(l10, ab8Var, "cumulative_layout_shift_time");
            }
            String str6 = this.cumulativeLayoutShiftTargetSelector;
            if (str6 != null) {
                ab8Var.l("cumulative_layout_shift_target_selector", str6);
            }
            Long l11 = this.domComplete;
            if (l11 != null) {
                ia.o(l11, ab8Var, "dom_complete");
            }
            Long l12 = this.domContentLoaded;
            if (l12 != null) {
                ia.o(l12, ab8Var, "dom_content_loaded");
            }
            Long l13 = this.domInteractive;
            if (l13 != null) {
                ia.o(l13, ab8Var, "dom_interactive");
            }
            Long l14 = this.loadEvent;
            if (l14 != null) {
                ia.o(l14, ab8Var, "load_event");
            }
            Long l15 = this.firstByte;
            if (l15 != null) {
                ia.o(l15, ab8Var, "first_byte");
            }
            CustomTimings customTimings = this.customTimings;
            if (customTimings != null) {
                ab8Var.i("custom_timings", customTimings.toJson());
            }
            Boolean bool = this.isActive;
            if (bool != null) {
                ab8Var.k("is_active", bool);
            }
            Boolean bool2 = this.isSlowRendered;
            if (bool2 != null) {
                ab8Var.k("is_slow_rendered", bool2);
            }
            ab8Var.i(RumEventDeserializer.EVENT_TYPE_ACTION, this.action.toJson());
            ab8Var.i("error", this.error.toJson());
            Crash crash = this.crash;
            if (crash != null) {
                ab8Var.i("crash", crash.toJson());
            }
            LongTask longTask = this.longTask;
            if (longTask != null) {
                ab8Var.i(RumEventDeserializer.EVENT_TYPE_LONG_TASK, longTask.toJson());
            }
            FrozenFrame frozenFrame = this.frozenFrame;
            if (frozenFrame != null) {
                ab8Var.i("frozen_frame", frozenFrame.toJson());
            }
            ab8Var.i(RumEventDeserializer.EVENT_TYPE_RESOURCE, this.resource.toJson());
            Frustration frustration = this.frustration;
            if (frustration != null) {
                ab8Var.i("frustration", frustration.toJson());
            }
            List<InForegroundPeriod> list = this.inForegroundPeriods;
            if (list != null) {
                w98 w98Var = new w98(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    w98Var.i(((InForegroundPeriod) it.next()).toJson());
                }
                ab8Var.i("in_foreground_periods", w98Var);
            }
            Number number2 = this.memoryAverage;
            if (number2 != null) {
                ab8Var.j(number2, "memory_average");
            }
            Number number3 = this.memoryMax;
            if (number3 != null) {
                ab8Var.j(number3, "memory_max");
            }
            Number number4 = this.cpuTicksCount;
            if (number4 != null) {
                ab8Var.j(number4, "cpu_ticks_count");
            }
            Number number5 = this.cpuTicksPerSecond;
            if (number5 != null) {
                ab8Var.j(number5, "cpu_ticks_per_second");
            }
            Number number6 = this.refreshRateAverage;
            if (number6 != null) {
                ab8Var.j(number6, "refresh_rate_average");
            }
            Number number7 = this.refreshRateMin;
            if (number7 != null) {
                ab8Var.j(number7, "refresh_rate_min");
            }
            FlutterBuildTime flutterBuildTime = this.flutterBuildTime;
            if (flutterBuildTime != null) {
                ab8Var.i("flutter_build_time", flutterBuildTime.toJson());
            }
            FlutterBuildTime flutterBuildTime2 = this.flutterRasterTime;
            if (flutterBuildTime2 != null) {
                ab8Var.i("flutter_raster_time", flutterBuildTime2.toJson());
            }
            FlutterBuildTime flutterBuildTime3 = this.jsRefreshRate;
            if (flutterBuildTime3 != null) {
                ab8Var.i("js_refresh_rate", flutterBuildTime3.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.referrer;
            String str3 = this.url;
            String str4 = this.name;
            Long l = this.loadingTime;
            Long l2 = this.networkSettledTime;
            Long l3 = this.interactionToNextViewTime;
            LoadingType loadingType = this.loadingType;
            long j = this.timeSpent;
            Long l4 = this.firstContentfulPaint;
            Long l5 = this.largestContentfulPaint;
            String str5 = this.largestContentfulPaintTargetSelector;
            Long l6 = this.firstInputDelay;
            Long l7 = this.firstInputTime;
            String str6 = this.firstInputTargetSelector;
            Long l8 = this.interactionToNextPaint;
            Long l9 = this.interactionToNextPaintTime;
            String str7 = this.interactionToNextPaintTargetSelector;
            Number number = this.cumulativeLayoutShift;
            Long l10 = this.cumulativeLayoutShiftTime;
            String str8 = this.cumulativeLayoutShiftTargetSelector;
            Long l11 = this.domComplete;
            Long l12 = this.domContentLoaded;
            Long l13 = this.domInteractive;
            Long l14 = this.loadEvent;
            Long l15 = this.firstByte;
            CustomTimings customTimings = this.customTimings;
            Boolean bool = this.isActive;
            Boolean bool2 = this.isSlowRendered;
            Action action = this.action;
            Error error = this.error;
            Crash crash = this.crash;
            LongTask longTask = this.longTask;
            FrozenFrame frozenFrame = this.frozenFrame;
            Resource resource = this.resource;
            Frustration frustration = this.frustration;
            List<InForegroundPeriod> list = this.inForegroundPeriods;
            Number number2 = this.memoryAverage;
            Number number3 = this.memoryMax;
            Number number4 = this.cpuTicksCount;
            Number number5 = this.cpuTicksPerSecond;
            Number number6 = this.refreshRateAverage;
            Number number7 = this.refreshRateMin;
            FlutterBuildTime flutterBuildTime = this.flutterBuildTime;
            FlutterBuildTime flutterBuildTime2 = this.flutterRasterTime;
            FlutterBuildTime flutterBuildTime3 = this.jsRefreshRate;
            StringBuilder sbF = u40.f("ViewEventView(id=", str, ", referrer=", str2, ", url=");
            ia.r(sbF, str3, ", name=", str4, ", loadingTime=");
            sbF.append(l);
            sbF.append(", networkSettledTime=");
            sbF.append(l2);
            sbF.append(", interactionToNextViewTime=");
            sbF.append(l3);
            sbF.append(", loadingType=");
            sbF.append(loadingType);
            sbF.append(", timeSpent=");
            sbF.append(j);
            sbF.append(", firstContentfulPaint=");
            sbF.append(l4);
            sbF.append(", largestContentfulPaint=");
            sbF.append(l5);
            sbF.append(", largestContentfulPaintTargetSelector=");
            sbF.append(str5);
            sbF.append(", firstInputDelay=");
            sbF.append(l6);
            sbF.append(", firstInputTime=");
            sbF.append(l7);
            sbF.append(", firstInputTargetSelector=");
            sbF.append(str6);
            sbF.append(", interactionToNextPaint=");
            sbF.append(l8);
            sbF.append(", interactionToNextPaintTime=");
            sbF.append(l9);
            sbF.append(", interactionToNextPaintTargetSelector=");
            sbF.append(str7);
            sbF.append(", cumulativeLayoutShift=");
            sbF.append(number);
            sbF.append(", cumulativeLayoutShiftTime=");
            sbF.append(l10);
            sbF.append(", cumulativeLayoutShiftTargetSelector=");
            sbF.append(str8);
            sbF.append(", domComplete=");
            sbF.append(l11);
            sbF.append(", domContentLoaded=");
            sbF.append(l12);
            sbF.append(", domInteractive=");
            sbF.append(l13);
            sbF.append(", loadEvent=");
            sbF.append(l14);
            sbF.append(", firstByte=");
            sbF.append(l15);
            sbF.append(", customTimings=");
            sbF.append(customTimings);
            sbF.append(", isActive=");
            sbF.append(bool);
            sbF.append(", isSlowRendered=");
            sbF.append(bool2);
            sbF.append(", action=");
            sbF.append(action);
            sbF.append(", error=");
            sbF.append(error);
            sbF.append(", crash=");
            sbF.append(crash);
            sbF.append(", longTask=");
            sbF.append(longTask);
            sbF.append(", frozenFrame=");
            sbF.append(frozenFrame);
            sbF.append(", resource=");
            sbF.append(resource);
            sbF.append(", frustration=");
            sbF.append(frustration);
            sbF.append(", inForegroundPeriods=");
            sbF.append(list);
            sbF.append(", memoryAverage=");
            sbF.append(number2);
            sbF.append(", memoryMax=");
            sbF.append(number3);
            sbF.append(", cpuTicksCount=");
            sbF.append(number4);
            sbF.append(", cpuTicksPerSecond=");
            sbF.append(number5);
            sbF.append(", refreshRateAverage=");
            sbF.append(number6);
            sbF.append(", refreshRateMin=");
            sbF.append(number7);
            sbF.append(", flutterBuildTime=");
            sbF.append(flutterBuildTime);
            sbF.append(", flutterRasterTime=");
            sbF.append(flutterBuildTime2);
            sbF.append(", jsRefreshRate=");
            sbF.append(flutterBuildTime3);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewEventView fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ViewEventView", e);
                    return null;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r43v0 */
            /* JADX WARN: Type inference failed for: r43v1, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r43v2 */
            /* JADX WARN: Type inference failed for: r44v0 */
            /* JADX WARN: Type inference failed for: r44v1, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r44v2 */
            /* JADX WARN: Type inference failed for: r45v0 */
            /* JADX WARN: Type inference failed for: r45v1, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r45v2 */
            /* JADX WARN: Type inference failed for: r46v0 */
            /* JADX WARN: Type inference failed for: r46v1, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r46v2 */
            /* JADX WARN: Type inference failed for: r47v0 */
            /* JADX WARN: Type inference failed for: r47v1, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r47v2 */
            /* JADX WARN: Type inference failed for: r48v0 */
            /* JADX WARN: Type inference failed for: r48v1, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r48v2 */
            /* JADX WARN: Type inference failed for: r49v0 */
            /* JADX WARN: Type inference failed for: r49v1, types: [com.datadog.android.rum.model.ViewEvent$FlutterBuildTime] */
            /* JADX WARN: Type inference failed for: r49v2 */
            /* JADX WARN: Type inference failed for: r50v0 */
            /* JADX WARN: Type inference failed for: r50v1, types: [com.datadog.android.rum.model.ViewEvent$FlutterBuildTime] */
            /* JADX WARN: Type inference failed for: r50v2 */
            /* JADX WARN: Type inference failed for: r51v0 */
            /* JADX WARN: Type inference failed for: r51v1, types: [com.datadog.android.rum.model.ViewEvent$FlutterBuildTime] */
            /* JADX WARN: Type inference failed for: r51v2 */
            public final ViewEventView fromJsonObject(ab8 jsonObject) {
                ViewEventView viewEventView;
                ArrayList arrayList;
                String strG;
                jsonObject.getClass();
                try {
                    try {
                        String strG2 = jsonObject.m("id").g();
                        ka8 ka8VarM = jsonObject.m("referrer");
                        String strG3 = ka8VarM != null ? ka8VarM.g() : null;
                        String strG4 = jsonObject.m("url").g();
                        ka8 ka8VarM2 = jsonObject.m("name");
                        String strG5 = ka8VarM2 != null ? ka8VarM2.g() : null;
                        ka8 ka8VarM3 = jsonObject.m("loading_time");
                        Long lValueOf = ka8VarM3 != null ? Long.valueOf(ka8VarM3.e()) : null;
                        ka8 ka8VarM4 = jsonObject.m("network_settled_time");
                        Long lValueOf2 = ka8VarM4 != null ? Long.valueOf(ka8VarM4.e()) : null;
                        ka8 ka8VarM5 = jsonObject.m("interaction_to_next_view_time");
                        Long lValueOf3 = ka8VarM5 != null ? Long.valueOf(ka8VarM5.e()) : null;
                        ka8 ka8VarM6 = jsonObject.m("loading_type");
                        LoadingType loadingTypeFromJson = (ka8VarM6 == null || (strG = ka8VarM6.g()) == null) ? null : LoadingType.INSTANCE.fromJson(strG);
                        long jE = jsonObject.m("time_spent").e();
                        ka8 ka8VarM7 = jsonObject.m("first_contentful_paint");
                        Long lValueOf4 = ka8VarM7 != null ? Long.valueOf(ka8VarM7.e()) : null;
                        ka8 ka8VarM8 = jsonObject.m("largest_contentful_paint");
                        Long lValueOf5 = ka8VarM8 != null ? Long.valueOf(ka8VarM8.e()) : null;
                        ka8 ka8VarM9 = jsonObject.m("largest_contentful_paint_target_selector");
                        String strG6 = ka8VarM9 != null ? ka8VarM9.g() : null;
                        ka8 ka8VarM10 = jsonObject.m("first_input_delay");
                        Long lValueOf6 = ka8VarM10 != null ? Long.valueOf(ka8VarM10.e()) : null;
                        ka8 ka8VarM11 = jsonObject.m("first_input_time");
                        Long lValueOf7 = ka8VarM11 != null ? Long.valueOf(ka8VarM11.e()) : null;
                        ka8 ka8VarM12 = jsonObject.m("first_input_target_selector");
                        String strG7 = ka8VarM12 != null ? ka8VarM12.g() : null;
                        ka8 ka8VarM13 = jsonObject.m("interaction_to_next_paint");
                        Long lValueOf8 = ka8VarM13 != null ? Long.valueOf(ka8VarM13.e()) : null;
                        ka8 ka8VarM14 = jsonObject.m("interaction_to_next_paint_time");
                        Long lValueOf9 = ka8VarM14 != null ? Long.valueOf(ka8VarM14.e()) : null;
                        ka8 ka8VarM15 = jsonObject.m("interaction_to_next_paint_target_selector");
                        String strG8 = ka8VarM15 != null ? ka8VarM15.g() : null;
                        ka8 ka8VarM16 = jsonObject.m("cumulative_layout_shift");
                        Number numberF = ka8VarM16 != null ? ka8VarM16.f() : null;
                        ka8 ka8VarM17 = jsonObject.m("cumulative_layout_shift_time");
                        Long lValueOf10 = ka8VarM17 != null ? Long.valueOf(ka8VarM17.e()) : null;
                        ka8 ka8VarM18 = jsonObject.m("cumulative_layout_shift_target_selector");
                        String strG9 = ka8VarM18 != null ? ka8VarM18.g() : null;
                        ka8 ka8VarM19 = jsonObject.m("dom_complete");
                        Long lValueOf11 = ka8VarM19 != null ? Long.valueOf(ka8VarM19.e()) : null;
                        ka8 ka8VarM20 = jsonObject.m("dom_content_loaded");
                        Long lValueOf12 = ka8VarM20 != null ? Long.valueOf(ka8VarM20.e()) : null;
                        ka8 ka8VarM21 = jsonObject.m("dom_interactive");
                        Long lValueOf13 = ka8VarM21 != null ? Long.valueOf(ka8VarM21.e()) : null;
                        ka8 ka8VarM22 = jsonObject.m("load_event");
                        Long lValueOf14 = ka8VarM22 != null ? Long.valueOf(ka8VarM22.e()) : null;
                        ka8 ka8VarM23 = jsonObject.m("first_byte");
                        Long lValueOf15 = ka8VarM23 != null ? Long.valueOf(ka8VarM23.e()) : null;
                        ka8 ka8VarM24 = jsonObject.m("custom_timings");
                        CustomTimings customTimingsFromJsonObject = ka8VarM24 != null ? CustomTimings.INSTANCE.fromJsonObject(ka8VarM24.d()) : null;
                        ka8 ka8VarM25 = jsonObject.m("is_active");
                        Boolean boolValueOf = ka8VarM25 != null ? Boolean.valueOf(ka8VarM25.a()) : null;
                        ka8 ka8VarM26 = jsonObject.m("is_slow_rendered");
                        Boolean boolValueOf2 = ka8VarM26 != null ? Boolean.valueOf(ka8VarM26.a()) : null;
                        Action actionFromJsonObject = Action.INSTANCE.fromJsonObject(jsonObject.m(RumEventDeserializer.EVENT_TYPE_ACTION).d());
                        Error errorFromJsonObject = Error.INSTANCE.fromJsonObject(jsonObject.m("error").d());
                        ka8 ka8VarM27 = jsonObject.m("crash");
                        Crash crashFromJsonObject = ka8VarM27 != null ? Crash.INSTANCE.fromJsonObject(ka8VarM27.d()) : null;
                        ka8 ka8VarM28 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_LONG_TASK);
                        LongTask longTaskFromJsonObject = ka8VarM28 != null ? LongTask.INSTANCE.fromJsonObject(ka8VarM28.d()) : null;
                        ka8 ka8VarM29 = jsonObject.m("frozen_frame");
                        FrozenFrame frozenFrameFromJsonObject = ka8VarM29 != null ? FrozenFrame.INSTANCE.fromJsonObject(ka8VarM29.d()) : null;
                        Resource resourceFromJsonObject = Resource.INSTANCE.fromJsonObject(jsonObject.m(RumEventDeserializer.EVENT_TYPE_RESOURCE).d());
                        ka8 ka8VarM30 = jsonObject.m("frustration");
                        Frustration frustrationFromJsonObject = ka8VarM30 != null ? Frustration.INSTANCE.fromJsonObject(ka8VarM30.d()) : null;
                        ka8 ka8VarM31 = jsonObject.m("in_foreground_periods");
                        if (ka8VarM31 != null) {
                            w98 w98VarC = ka8VarM31.c();
                            viewEventView = null;
                            try {
                                ArrayList arrayList2 = new ArrayList(w98VarC.size());
                                for (Iterator<ka8> it = w98VarC.iterator(); it.hasNext(); it = it) {
                                    arrayList2.add(InForegroundPeriod.INSTANCE.fromJsonObject(it.next().d()));
                                }
                                arrayList = arrayList2;
                            } catch (NullPointerException e) {
                                e = e;
                                g7.n("Unable to parse json into type ViewEventView", e);
                                return viewEventView;
                            }
                        } else {
                            viewEventView = null;
                            arrayList = null;
                        }
                        ka8 ka8VarM32 = jsonObject.m("memory_average");
                        ?? F = ka8VarM32 != null ? ka8VarM32.f() : viewEventView;
                        ka8 ka8VarM33 = jsonObject.m("memory_max");
                        ?? F2 = ka8VarM33 != null ? ka8VarM33.f() : viewEventView;
                        ka8 ka8VarM34 = jsonObject.m("cpu_ticks_count");
                        ?? F3 = ka8VarM34 != null ? ka8VarM34.f() : viewEventView;
                        ka8 ka8VarM35 = jsonObject.m("cpu_ticks_per_second");
                        ?? F4 = ka8VarM35 != null ? ka8VarM35.f() : viewEventView;
                        ka8 ka8VarM36 = jsonObject.m("refresh_rate_average");
                        ?? F5 = ka8VarM36 != null ? ka8VarM36.f() : viewEventView;
                        ka8 ka8VarM37 = jsonObject.m("refresh_rate_min");
                        ?? F6 = ka8VarM37 != null ? ka8VarM37.f() : viewEventView;
                        ka8 ka8VarM38 = jsonObject.m("flutter_build_time");
                        ?? FromJsonObject = ka8VarM38 != null ? FlutterBuildTime.INSTANCE.fromJsonObject(ka8VarM38.d()) : viewEventView;
                        ka8 ka8VarM39 = jsonObject.m("flutter_raster_time");
                        ?? FromJsonObject2 = ka8VarM39 != null ? FlutterBuildTime.INSTANCE.fromJsonObject(ka8VarM39.d()) : viewEventView;
                        ka8 ka8VarM40 = jsonObject.m("js_refresh_rate");
                        ?? FromJsonObject3 = ka8VarM40 != null ? FlutterBuildTime.INSTANCE.fromJsonObject(ka8VarM40.d()) : viewEventView;
                        strG2.getClass();
                        strG4.getClass();
                        return new ViewEventView(strG2, strG3, strG4, strG5, lValueOf, lValueOf2, lValueOf3, loadingTypeFromJson, jE, lValueOf4, lValueOf5, strG6, lValueOf6, lValueOf7, strG7, lValueOf8, lValueOf9, strG8, numberF, lValueOf10, strG9, lValueOf11, lValueOf12, lValueOf13, lValueOf14, lValueOf15, customTimingsFromJsonObject, boolValueOf, boolValueOf2, actionFromJsonObject, errorFromJsonObject, crashFromJsonObject, longTaskFromJsonObject, frozenFrameFromJsonObject, resourceFromJsonObject, frustrationFromJsonObject, arrayList, F, F2, F3, F4, F5, F6, FromJsonObject, FromJsonObject2, FromJsonObject3);
                    } catch (IllegalStateException e2) {
                        throw new JsonParseException(e2, "Unable to parse json into type ViewEventView");
                    } catch (NumberFormatException e3) {
                        throw new JsonParseException(e3, "Unable to parse json into type ViewEventView");
                    }
                } catch (NullPointerException e4) {
                    e = e4;
                    viewEventView = null;
                }
            }

            private Companion() {
            }
        }

        public ViewEventView(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, LoadingType loadingType, long j, Long l4, Long l5, String str5, Long l6, Long l7, String str6, Long l8, Long l9, String str7, Number number, Long l10, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, CustomTimings customTimings, Boolean bool, Boolean bool2, Action action, Error error, Crash crash, LongTask longTask, FrozenFrame frozenFrame, Resource resource, Frustration frustration, List<InForegroundPeriod> list, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, FlutterBuildTime flutterBuildTime, FlutterBuildTime flutterBuildTime2, FlutterBuildTime flutterBuildTime3) {
            str.getClass();
            str3.getClass();
            action.getClass();
            error.getClass();
            resource.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
            this.loadingTime = l;
            this.networkSettledTime = l2;
            this.interactionToNextViewTime = l3;
            this.loadingType = loadingType;
            this.timeSpent = j;
            this.firstContentfulPaint = l4;
            this.largestContentfulPaint = l5;
            this.largestContentfulPaintTargetSelector = str5;
            this.firstInputDelay = l6;
            this.firstInputTime = l7;
            this.firstInputTargetSelector = str6;
            this.interactionToNextPaint = l8;
            this.interactionToNextPaintTime = l9;
            this.interactionToNextPaintTargetSelector = str7;
            this.cumulativeLayoutShift = number;
            this.cumulativeLayoutShiftTime = l10;
            this.cumulativeLayoutShiftTargetSelector = str8;
            this.domComplete = l11;
            this.domContentLoaded = l12;
            this.domInteractive = l13;
            this.loadEvent = l14;
            this.firstByte = l15;
            this.customTimings = customTimings;
            this.isActive = bool;
            this.isSlowRendered = bool2;
            this.action = action;
            this.error = error;
            this.crash = crash;
            this.longTask = longTask;
            this.frozenFrame = frozenFrame;
            this.resource = resource;
            this.frustration = frustration;
            this.inForegroundPeriods = list;
            this.memoryAverage = number2;
            this.memoryMax = number3;
            this.cpuTicksCount = number4;
            this.cpuTicksPerSecond = number5;
            this.refreshRateAverage = number6;
            this.refreshRateMin = number7;
            this.flutterBuildTime = flutterBuildTime;
            this.flutterRasterTime = flutterBuildTime2;
            this.jsRefreshRate = flutterBuildTime3;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getWidth", "getHeight", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ViewEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type ViewEvent", e);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ViewEvent fromJsonObject(ab8 jsonObject) {
            ViewEvent viewEvent;
            Context contextFromJsonObject;
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
                ViewEventSession viewEventSessionFromJsonObject = ViewEventSession.INSTANCE.fromJsonObject(jsonObject.m("session").d());
                ka8 ka8VarM5 = jsonObject.m("source");
                ViewEventSource viewEventSourceFromJson = (ka8VarM5 == null || (strG = ka8VarM5.g()) == null) ? null : ViewEventSource.INSTANCE.fromJson(strG);
                ViewEventView viewEventViewFromJsonObject = ViewEventView.INSTANCE.fromJsonObject(jsonObject.m("view").d());
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
                Context contextFromJsonObject2 = ka8VarM14 != null ? Context.INSTANCE.fromJsonObject(ka8VarM14.d()) : null;
                ka8 ka8VarM15 = jsonObject.m("container");
                Container containerFromJsonObject = ka8VarM15 != null ? Container.INSTANCE.fromJsonObject(ka8VarM15.d()) : null;
                String strG6 = jsonObject.m("type").g();
                ka8 ka8VarM16 = jsonObject.m("feature_flags");
                if (ka8VarM16 != null) {
                    viewEvent = null;
                    try {
                        contextFromJsonObject = Context.INSTANCE.fromJsonObject(ka8VarM16.d());
                    } catch (IllegalStateException e) {
                        e = e;
                        g7.n("Unable to parse json into type ViewEvent", e);
                        return viewEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        g7.n("Unable to parse json into type ViewEvent", e);
                        return viewEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        g7.n("Unable to parse json into type ViewEvent", e);
                        return viewEvent;
                    }
                } else {
                    viewEvent = null;
                    contextFromJsonObject = null;
                }
                ka8 ka8VarM17 = jsonObject.m("privacy");
                Privacy privacyFromJsonObject = ka8VarM17 != null ? Privacy.INSTANCE.fromJsonObject(ka8VarM17.d()) : viewEvent;
                if (wl7.b(strG6, "view")) {
                    return new ViewEvent(jE, applicationFromJsonObject, strG2, strG3, strG4, strG5, viewEventSessionFromJsonObject, viewEventSourceFromJson, viewEventViewFromJsonObject, usrFromJsonObject, accountFromJsonObject, connectivityFromJsonObject, displayFromJsonObject, syntheticsFromJsonObject, ciTestFromJsonObject, osFromJsonObject, deviceFromJsonObject, ddFromJsonObject, contextFromJsonObject2, containerFromJsonObject, contextFromJsonObject, privacyFromJsonObject);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e4) {
                e = e4;
                viewEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                viewEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                viewEvent = null;
            }
        }

        private Companion() {
        }
    }

    public ViewEvent(long j, Application application, String str, String str2, String str3, String str4, ViewEventSession viewEventSession, ViewEventSource viewEventSource, ViewEventView viewEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, Context context2, Privacy privacy) {
        application.getClass();
        viewEventSession.getClass();
        viewEventView.getClass();
        dd.getClass();
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.session = viewEventSession;
        this.source = viewEventSource;
        this.view = viewEventView;
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
        this.featureFlags = context2;
        this.privacy = privacy;
        this.type = "view";
    }
}
