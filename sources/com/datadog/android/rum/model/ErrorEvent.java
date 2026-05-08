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
import defpackage.k6;
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
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b^\b\u0086\b\u0018\u0000 \u0097\u00012\u00020\u0001:Z\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001\u0097\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001B\u008f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010#¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u00108J\u0012\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b:\u00108J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u00108J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020!HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020)HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\b^\u0010UJ¤\u0002\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\ba\u00108J\u0010\u0010c\u001a\u00020bHÖ\u0001¢\u0006\u0004\bc\u0010dJ\u001a\u0010g\u001a\u00020f2\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bg\u0010hR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010i\u001a\u0004\bj\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010k\u001a\u0004\bl\u00106R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010m\u001a\u0004\bn\u00108R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010m\u001a\u0004\bo\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010m\u001a\u0004\bp\u00108R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010m\u001a\u0004\bq\u00108R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010r\u001a\u0004\bs\u0010=R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010t\u001a\u0004\bu\u0010?R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010v\u001a\u0004\bw\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010x\u001a\u0004\by\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010z\u001a\u0004\b{\u0010ER\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010|\u001a\u0004\b}\u0010GR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010~\u001a\u0004\b\u007f\u0010IR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010KR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010MR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010OR\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010QR\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010SR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010UR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010WR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010YR\u0019\u0010*\u001a\u00020)8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010[R\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010]R\u001b\u0010-\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b-\u0010\u008a\u0001\u001a\u0005\b\u0094\u0001\u0010UR\u001d\u0010\u0095\u0001\u001a\u00020\u00068\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010m\u001a\u0005\b\u0096\u0001\u00108¨\u0006Ä\u0001"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent;", "", "", LogAttributes.DATE, "Lcom/datadog/android/rum/model/ErrorEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "session", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "source", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "view", "Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/ErrorEvent$Account;", "account", "Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/ErrorEvent$Display;", "display", "Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/ErrorEvent$Os;", "os", "Lcom/datadog/android/rum/model/ErrorEvent$Device;", "device", "Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/ErrorEvent$Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/rum/model/ErrorEvent$Action;", RumEventDeserializer.EVENT_TYPE_ACTION, "Lcom/datadog/android/rum/model/ErrorEvent$Container;", "container", "Lcom/datadog/android/rum/model/ErrorEvent$Error;", "error", "Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "freeze", "featureFlags", "<init>", "(JLcom/datadog/android/rum/model/ErrorEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;Lcom/datadog/android/rum/model/ErrorEvent$Usr;Lcom/datadog/android/rum/model/ErrorEvent$Account;Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;Lcom/datadog/android/rum/model/ErrorEvent$Display;Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;Lcom/datadog/android/rum/model/ErrorEvent$CiTest;Lcom/datadog/android/rum/model/ErrorEvent$Os;Lcom/datadog/android/rum/model/ErrorEvent$Device;Lcom/datadog/android/rum/model/ErrorEvent$Dd;Lcom/datadog/android/rum/model/ErrorEvent$Context;Lcom/datadog/android/rum/model/ErrorEvent$Action;Lcom/datadog/android/rum/model/ErrorEvent$Container;Lcom/datadog/android/rum/model/ErrorEvent$Error;Lcom/datadog/android/rum/model/ErrorEvent$Freeze;Lcom/datadog/android/rum/model/ErrorEvent$Context;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "component2", "()Lcom/datadog/android/rum/model/ErrorEvent$Application;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "component8", "()Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "component9", "()Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "component10", "()Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "component11", "()Lcom/datadog/android/rum/model/ErrorEvent$Account;", "component12", "()Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "component13", "()Lcom/datadog/android/rum/model/ErrorEvent$Display;", "component14", "()Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "component15", "()Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "component16", "()Lcom/datadog/android/rum/model/ErrorEvent$Os;", "component17", "()Lcom/datadog/android/rum/model/ErrorEvent$Device;", "component18", "()Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "component19", "()Lcom/datadog/android/rum/model/ErrorEvent$Context;", "component20", "()Lcom/datadog/android/rum/model/ErrorEvent$Action;", "component21", "()Lcom/datadog/android/rum/model/ErrorEvent$Container;", "component22", "()Lcom/datadog/android/rum/model/ErrorEvent$Error;", "component23", "()Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "component24", "copy", "(JLcom/datadog/android/rum/model/ErrorEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;Lcom/datadog/android/rum/model/ErrorEvent$Usr;Lcom/datadog/android/rum/model/ErrorEvent$Account;Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;Lcom/datadog/android/rum/model/ErrorEvent$Display;Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;Lcom/datadog/android/rum/model/ErrorEvent$CiTest;Lcom/datadog/android/rum/model/ErrorEvent$Os;Lcom/datadog/android/rum/model/ErrorEvent$Device;Lcom/datadog/android/rum/model/ErrorEvent$Dd;Lcom/datadog/android/rum/model/ErrorEvent$Context;Lcom/datadog/android/rum/model/ErrorEvent$Action;Lcom/datadog/android/rum/model/ErrorEvent$Container;Lcom/datadog/android/rum/model/ErrorEvent$Error;Lcom/datadog/android/rum/model/ErrorEvent$Freeze;Lcom/datadog/android/rum/model/ErrorEvent$Context;)Lcom/datadog/android/rum/model/ErrorEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDate", "Lcom/datadog/android/rum/model/ErrorEvent$Application;", "getApplication", "Ljava/lang/String;", "getService", "getVersion", "getBuildVersion", "getBuildId", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "getSession", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "getSource", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "getView", "Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "getUsr", "Lcom/datadog/android/rum/model/ErrorEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/ErrorEvent$Display;", "getDisplay", "Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "getSynthetics", "Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/ErrorEvent$Os;", "getOs", "Lcom/datadog/android/rum/model/ErrorEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "getDd", "Lcom/datadog/android/rum/model/ErrorEvent$Context;", "getContext", "Lcom/datadog/android/rum/model/ErrorEvent$Action;", "getAction", "Lcom/datadog/android/rum/model/ErrorEvent$Container;", "getContainer", "Lcom/datadog/android/rum/model/ErrorEvent$Error;", "getError", "Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "getFreeze", "getFeatureFlags", "type", "getType", "Companion", "Account", "Action", "Application", "BinaryImage", "Category", "Cause", "Cellular", "CiTest", "Configuration", "Connectivity", "Container", "ContainerView", "Context", "Csp", "Dd", "DdSession", "Device", "DeviceType", "Display", "Disposition", "EffectiveType", "Error", "ErrorEventSession", "ErrorEventSessionType", "ErrorEventSource", "ErrorEventView", "ErrorSource", "Freeze", "Handling", "Interface", "Meta", "Method", "Os", "Plan", "Provider", "ProviderType", "Resource", "SessionPrecondition", "SourceType", "Status", "Synthetics", "Thread", "Usr", "Viewport", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class ErrorEvent {

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
    private final Error error;
    private final Context featureFlags;
    private final Freeze freeze;
    private final Os os;
    private final String service;
    private final ErrorEventSession session;
    private final ErrorEventSource source;
    private final Synthetics synthetics;
    private final String type;
    private final Usr usr;
    private final String version;
    private final ErrorEventView view;

    public /* synthetic */ ErrorEvent(long j, Application application, String str, String str2, String str3, String str4, ErrorEventSession errorEventSession, ErrorEventSource errorEventSource, ErrorEventView errorEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Error error, Freeze freeze, Context context2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, errorEventSession, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : errorEventSource, errorEventView, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : usr, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : account, (i & 2048) != 0 ? null : connectivity, (i & 4096) != 0 ? null : display, (i & 8192) != 0 ? null : synthetics, (i & 16384) != 0 ? null : ciTest, (32768 & i) != 0 ? null : os, (65536 & i) != 0 ? null : device, dd, (262144 & i) != 0 ? null : context, (524288 & i) != 0 ? null : action, (1048576 & i) != 0 ? null : container, error, (4194304 & i) != 0 ? null : freeze, (i & 8388608) != 0 ? null : context2);
    }

    public static /* synthetic */ ErrorEvent copy$default(ErrorEvent errorEvent, long j, Application application, String str, String str2, String str3, String str4, ErrorEventSession errorEventSession, ErrorEventSource errorEventSource, ErrorEventView errorEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Error error, Freeze freeze, Context context2, int i, Object obj) {
        Context context3;
        Freeze freeze2;
        long j2 = (i & 1) != 0 ? errorEvent.date : j;
        Application application2 = (i & 2) != 0 ? errorEvent.application : application;
        String str5 = (i & 4) != 0 ? errorEvent.service : str;
        String str6 = (i & 8) != 0 ? errorEvent.version : str2;
        String str7 = (i & 16) != 0 ? errorEvent.buildVersion : str3;
        String str8 = (i & 32) != 0 ? errorEvent.buildId : str4;
        ErrorEventSession errorEventSession2 = (i & 64) != 0 ? errorEvent.session : errorEventSession;
        ErrorEventSource errorEventSource2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? errorEvent.source : errorEventSource;
        ErrorEventView errorEventView2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? errorEvent.view : errorEventView;
        Usr usr2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? errorEvent.usr : usr;
        Account account2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? errorEvent.account : account;
        Connectivity connectivity2 = (i & 2048) != 0 ? errorEvent.connectivity : connectivity;
        Display display2 = (i & 4096) != 0 ? errorEvent.display : display;
        long j3 = j2;
        Synthetics synthetics2 = (i & 8192) != 0 ? errorEvent.synthetics : synthetics;
        CiTest ciTest2 = (i & 16384) != 0 ? errorEvent.ciTest : ciTest;
        Os os2 = (i & 32768) != 0 ? errorEvent.os : os;
        Device device2 = (i & 65536) != 0 ? errorEvent.device : device;
        Dd dd2 = (i & 131072) != 0 ? errorEvent.dd : dd;
        Context context4 = (i & 262144) != 0 ? errorEvent.context : context;
        Action action2 = (i & 524288) != 0 ? errorEvent.action : action;
        Container container2 = (i & 1048576) != 0 ? errorEvent.container : container;
        Error error2 = (i & 2097152) != 0 ? errorEvent.error : error;
        Freeze freeze3 = (i & 4194304) != 0 ? errorEvent.freeze : freeze;
        if ((i & 8388608) != 0) {
            freeze2 = freeze3;
            context3 = errorEvent.featureFlags;
        } else {
            context3 = context2;
            freeze2 = freeze3;
        }
        return errorEvent.copy(j3, application2, str5, str6, str7, str8, errorEventSession2, errorEventSource2, errorEventView2, usr2, account2, connectivity2, display2, synthetics2, ciTest2, os2, device2, dd2, context4, action2, container2, error2, freeze2, context3);
    }

    public static final ErrorEvent fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final ErrorEvent fromJsonObject(ab8 ab8Var) {
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
    public final Error getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Freeze getFreeze() {
        return this.freeze;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Context getFeatureFlags() {
        return this.featureFlags;
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
    public final ErrorEventSession getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ErrorEventSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ErrorEventView getView() {
        return this.view;
    }

    public final ErrorEvent copy(long date, Application application, String service, String version, String buildVersion, String buildId, ErrorEventSession session, ErrorEventSource source, ErrorEventView view, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Error error, Freeze freeze, Context featureFlags) {
        application.getClass();
        session.getClass();
        view.getClass();
        dd.getClass();
        error.getClass();
        return new ErrorEvent(date, application, service, version, buildVersion, buildId, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, action, container, error, freeze, featureFlags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorEvent)) {
            return false;
        }
        ErrorEvent errorEvent = (ErrorEvent) other;
        return this.date == errorEvent.date && wl7.b(this.application, errorEvent.application) && wl7.b(this.service, errorEvent.service) && wl7.b(this.version, errorEvent.version) && wl7.b(this.buildVersion, errorEvent.buildVersion) && wl7.b(this.buildId, errorEvent.buildId) && wl7.b(this.session, errorEvent.session) && this.source == errorEvent.source && wl7.b(this.view, errorEvent.view) && wl7.b(this.usr, errorEvent.usr) && wl7.b(this.account, errorEvent.account) && wl7.b(this.connectivity, errorEvent.connectivity) && wl7.b(this.display, errorEvent.display) && wl7.b(this.synthetics, errorEvent.synthetics) && wl7.b(this.ciTest, errorEvent.ciTest) && wl7.b(this.os, errorEvent.os) && wl7.b(this.device, errorEvent.device) && wl7.b(this.dd, errorEvent.dd) && wl7.b(this.context, errorEvent.context) && wl7.b(this.action, errorEvent.action) && wl7.b(this.container, errorEvent.container) && wl7.b(this.error, errorEvent.error) && wl7.b(this.freeze, errorEvent.freeze) && wl7.b(this.featureFlags, errorEvent.featureFlags);
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

    public final Error getError() {
        return this.error;
    }

    public final Context getFeatureFlags() {
        return this.featureFlags;
    }

    public final Freeze getFreeze() {
        return this.freeze;
    }

    public final Os getOs() {
        return this.os;
    }

    public final String getService() {
        return this.service;
    }

    public final ErrorEventSession getSession() {
        return this.session;
    }

    public final ErrorEventSource getSource() {
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

    public final ErrorEventView getView() {
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
        ErrorEventSource errorEventSource = this.source;
        int iHashCode6 = (this.view.hashCode() + ((iHashCode5 + (errorEventSource == null ? 0 : errorEventSource.hashCode())) * 31)) * 31;
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
        int iHashCode17 = (this.error.hashCode() + ((iHashCode16 + (container == null ? 0 : container.hashCode())) * 31)) * 31;
        Freeze freeze = this.freeze;
        int iHashCode18 = (iHashCode17 + (freeze == null ? 0 : freeze.hashCode())) * 31;
        Context context2 = this.featureFlags;
        return iHashCode18 + (context2 != null ? context2.hashCode() : 0);
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
        ErrorEventSource errorEventSource = this.source;
        if (errorEventSource != null) {
            ab8Var.i("source", errorEventSource.toJson());
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
        ab8Var.i("error", this.error.toJson());
        Freeze freeze = this.freeze;
        if (freeze != null) {
            ab8Var.i("freeze", freeze.toJson());
        }
        Context context2 = this.featureFlags;
        if (context2 != null) {
            ab8Var.i("feature_flags", context2.toJson());
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
        ErrorEventSession errorEventSession = this.session;
        ErrorEventSource errorEventSource = this.source;
        ErrorEventView errorEventView = this.view;
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
        Error error = this.error;
        Freeze freeze = this.freeze;
        Context context2 = this.featureFlags;
        StringBuilder sb = new StringBuilder("ErrorEvent(date=");
        sb.append(j);
        sb.append(", application=");
        sb.append(application);
        ia.r(sb, ", service=", str, ", version=", str2);
        ia.r(sb, ", buildVersion=", str3, ", buildId=", str4);
        sb.append(", session=");
        sb.append(errorEventSession);
        sb.append(", source=");
        sb.append(errorEventSource);
        sb.append(", view=");
        sb.append(errorEventView);
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
        sb.append(", error=");
        sb.append(error);
        sb.append(", freeze=");
        sb.append(freeze);
        sb.append(", featureFlags=");
        sb.append(context2);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ErrorEvent$Account;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Account;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Action;", "", "", "", "id", "<init>", "(Ljava/util/List;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/datadog/android/rum/model/ErrorEvent$Action;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Action;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Action;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Application;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Application;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Application;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Application;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010JR\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u0006\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\u0010¨\u0006("}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$BinaryImage;", "", "", "uuid", "name", "", "isSystem", "loadAddress", "maxAddress", "arch", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$BinaryImage;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getName", "Z", "getLoadAddress", "getMaxAddress", "getArch", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class BinaryImage {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String arch;
        private final boolean isSystem;
        private final String loadAddress;
        private final String maxAddress;
        private final String name;
        private final String uuid;

        public BinaryImage(String str, String str2, boolean z, String str3, String str4, String str5) {
            str.getClass();
            str2.getClass();
            this.uuid = str;
            this.name = str2;
            this.isSystem = z;
            this.loadAddress = str3;
            this.maxAddress = str4;
            this.arch = str5;
        }

        public static /* synthetic */ BinaryImage copy$default(BinaryImage binaryImage, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = binaryImage.uuid;
            }
            if ((i & 2) != 0) {
                str2 = binaryImage.name;
            }
            if ((i & 4) != 0) {
                z = binaryImage.isSystem;
            }
            if ((i & 8) != 0) {
                str3 = binaryImage.loadAddress;
            }
            if ((i & 16) != 0) {
                str4 = binaryImage.maxAddress;
            }
            if ((i & 32) != 0) {
                str5 = binaryImage.arch;
            }
            String str6 = str4;
            String str7 = str5;
            return binaryImage.copy(str, str2, z, str3, str6, str7);
        }

        public static final BinaryImage fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final BinaryImage fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsSystem() {
            return this.isSystem;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLoadAddress() {
            return this.loadAddress;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getMaxAddress() {
            return this.maxAddress;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getArch() {
            return this.arch;
        }

        public final BinaryImage copy(String uuid, String name, boolean isSystem, String loadAddress, String maxAddress, String arch) {
            uuid.getClass();
            name.getClass();
            return new BinaryImage(uuid, name, isSystem, loadAddress, maxAddress, arch);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BinaryImage)) {
                return false;
            }
            BinaryImage binaryImage = (BinaryImage) other;
            return wl7.b(this.uuid, binaryImage.uuid) && wl7.b(this.name, binaryImage.name) && this.isSystem == binaryImage.isSystem && wl7.b(this.loadAddress, binaryImage.loadAddress) && wl7.b(this.maxAddress, binaryImage.maxAddress) && wl7.b(this.arch, binaryImage.arch);
        }

        public final String getArch() {
            return this.arch;
        }

        public final String getLoadAddress() {
            return this.loadAddress;
        }

        public final String getMaxAddress() {
            return this.maxAddress;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            int iF = ia.f(akb.d(this.uuid.hashCode() * 31, 31, this.name), 31, this.isSystem);
            String str = this.loadAddress;
            int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.maxAddress;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.arch;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean isSystem() {
            return this.isSystem;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("uuid", this.uuid);
            ab8Var.l("name", this.name);
            ab8Var.k("is_system", Boolean.valueOf(this.isSystem));
            String str = this.loadAddress;
            if (str != null) {
                ab8Var.l("load_address", str);
            }
            String str2 = this.maxAddress;
            if (str2 != null) {
                ab8Var.l("max_address", str2);
            }
            String str3 = this.arch;
            if (str3 != null) {
                ab8Var.l("arch", str3);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.uuid;
            String str2 = this.name;
            boolean z = this.isSystem;
            String str3 = this.loadAddress;
            String str4 = this.maxAddress;
            String str5 = this.arch;
            StringBuilder sbF = u40.f("BinaryImage(uuid=", str, ", name=", str2, ", isSystem=");
            k6.k(", loadAddress=", str3, ", maxAddress=", sbF, z);
            return z3.n(sbF, str4, ", arch=", str5, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$BinaryImage$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$BinaryImage;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$BinaryImage;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$BinaryImage;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BinaryImage fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type BinaryImage", e);
                    return null;
                }
            }

            public final BinaryImage fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("uuid").g();
                    String strG2 = jsonObject.m("name").g();
                    boolean zA = jsonObject.m("is_system").a();
                    ka8 ka8VarM = jsonObject.m("load_address");
                    String strG3 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("max_address");
                    String strG4 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("arch");
                    String strG5 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    strG.getClass();
                    strG2.getClass();
                    return new BinaryImage(strG, strG2, zA, strG3, strG4, strG5);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type BinaryImage", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type BinaryImage", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type BinaryImage", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ BinaryImage(String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Category;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANR", "APP_HANG", "EXCEPTION", "WATCHDOG_TERMINATION", "MEMORY_WARNING", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Category {
        ANR("ANR"),
        APP_HANG("App Hang"),
        EXCEPTION("Exception"),
        WATCHDOG_TERMINATION("Watchdog Termination"),
        MEMORY_WARNING("Memory Warning");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Category(String str) {
            this.jsonValue = str;
        }

        public static final Category fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Category$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Category fromJson(String jsonString) {
                jsonString.getClass();
                for (Category category : Category.values()) {
                    if (wl7.b(category.jsonValue, jsonString)) {
                        return category;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b!\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Cause;", "", "", "message", "type", "stack", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;)Lcom/datadog/android/rum/model/ErrorEvent$Cause;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "setMessage", "(Ljava/lang/String;)V", "getType", "getStack", "setStack", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "getSource", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Cause {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String message;
        private final ErrorSource source;
        private String stack;
        private final String type;

        public Cause(String str, String str2, String str3, ErrorSource errorSource) {
            str.getClass();
            errorSource.getClass();
            this.message = str;
            this.type = str2;
            this.stack = str3;
            this.source = errorSource;
        }

        public static /* synthetic */ Cause copy$default(Cause cause, String str, String str2, String str3, ErrorSource errorSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cause.message;
            }
            if ((i & 2) != 0) {
                str2 = cause.type;
            }
            if ((i & 4) != 0) {
                str3 = cause.stack;
            }
            if ((i & 8) != 0) {
                errorSource = cause.source;
            }
            return cause.copy(str, str2, str3, errorSource);
        }

        public static final Cause fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Cause fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStack() {
            return this.stack;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ErrorSource getSource() {
            return this.source;
        }

        public final Cause copy(String message, String type, String stack, ErrorSource source) {
            message.getClass();
            source.getClass();
            return new Cause(message, type, stack, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cause)) {
                return false;
            }
            Cause cause = (Cause) other;
            return wl7.b(this.message, cause.message) && wl7.b(this.type, cause.type) && wl7.b(this.stack, cause.stack) && this.source == cause.source;
        }

        public final String getMessage() {
            return this.message;
        }

        public final ErrorSource getSource() {
            return this.source;
        }

        public final String getStack() {
            return this.stack;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.type;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.stack;
            return this.source.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final void setMessage(String str) {
            str.getClass();
            this.message = str;
        }

        public final void setStack(String str) {
            this.stack = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.l("message", this.message);
            String str = this.type;
            if (str != null) {
                ab8Var.l("type", str);
            }
            String str2 = this.stack;
            if (str2 != null) {
                ab8Var.l("stack", str2);
            }
            ab8Var.i("source", this.source.toJson());
            return ab8Var;
        }

        public String toString() {
            String str = this.message;
            String str2 = this.type;
            String str3 = this.stack;
            ErrorSource errorSource = this.source;
            StringBuilder sbF = u40.f("Cause(message=", str, ", type=", str2, ", stack=");
            sbF.append(str3);
            sbF.append(", source=");
            sbF.append(errorSource);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Cause$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Cause;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Cause;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Cause;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Cause fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Cause", e);
                    return null;
                }
            }

            public final Cause fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("message").g();
                    ka8 ka8VarM = jsonObject.m("type");
                    String strG2 = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("stack");
                    String strG3 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ErrorSource.Companion companion = ErrorSource.INSTANCE;
                    String strG4 = jsonObject.m("source").g();
                    strG4.getClass();
                    ErrorSource errorSourceFromJson = companion.fromJson(strG4);
                    strG.getClass();
                    return new Cause(strG, strG2, strG3, errorSourceFromJson);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Cause", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Cause", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Cause", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ Cause(String str, String str2, String str3, ErrorSource errorSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, errorSource);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTechnology", "getCarrierName", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestExecutionId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$CiTest;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getSessionSampleRate", "getSessionReplaySampleRate", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006-"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Status;", "status", "", "Lcom/datadog/android/rum/model/ErrorEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;Lcom/datadog/android/rum/model/ErrorEvent$Cellular;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$Status;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;Lcom/datadog/android/rum/model/ErrorEvent$Cellular;)Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$Status;", "getStatus", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "getEffectiveType", "Lcom/datadog/android/rum/model/ErrorEvent$Cellular;", "getCellular", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Container;", "", "Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;)Lcom/datadog/android/rum/model/ErrorEvent$Container;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "getView", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "getSource", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Container {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ErrorEventSource source;
        private final ContainerView view;

        public Container(ContainerView containerView, ErrorEventSource errorEventSource) {
            containerView.getClass();
            errorEventSource.getClass();
            this.view = containerView;
            this.source = errorEventSource;
        }

        public static /* synthetic */ Container copy$default(Container container, ContainerView containerView, ErrorEventSource errorEventSource, int i, Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                errorEventSource = container.source;
            }
            return container.copy(containerView, errorEventSource);
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
        public final ErrorEventSource getSource() {
            return this.source;
        }

        public final Container copy(ContainerView view, ErrorEventSource source) {
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

        public final ErrorEventSource getSource() {
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Container;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Container;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    ErrorEventSource.Companion companion = ErrorEventSource.INSTANCE;
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$ContainerView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ErrorEvent$Context;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Context;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Context;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Disposition;", "disposition", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Disposition;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$Disposition;", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$Disposition;)Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$Disposition;", "getDisposition", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Csp {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Disposition disposition;

        public /* synthetic */ Csp(Disposition disposition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : disposition);
        }

        public static /* synthetic */ Csp copy$default(Csp csp, Disposition disposition, int i, Object obj) {
            if ((i & 1) != 0) {
                disposition = csp.disposition;
            }
            return csp.copy(disposition);
        }

        public static final Csp fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Csp fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Disposition getDisposition() {
            return this.disposition;
        }

        public final Csp copy(Disposition disposition) {
            return new Csp(disposition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Csp) && this.disposition == ((Csp) other).disposition;
        }

        public final Disposition getDisposition() {
            return this.disposition;
        }

        public int hashCode() {
            Disposition disposition = this.disposition;
            if (disposition == null) {
                return 0;
            }
            return disposition.hashCode();
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            Disposition disposition = this.disposition;
            if (disposition != null) {
                ab8Var.i("disposition", disposition.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Csp(disposition=" + this.disposition + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Csp$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Csp fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Csp", e);
                    return null;
                }
            }

            public final Csp fromJsonObject(ab8 jsonObject) {
                String strG;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("disposition");
                    return new Csp((ka8VarM == null || (strG = ka8VarM.g()) == null) ? null : Disposition.INSTANCE.fromJson(strG));
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Csp", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Csp", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Csp", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Csp(Disposition disposition) {
            this.disposition = disposition;
        }

        public Csp() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010$\u001a\u00020#8\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "", "Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "configuration", "", "browserSdkVersion", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$DdSession;Lcom/datadog/android/rum/model/ErrorEvent$Configuration;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$DdSession;Lcom/datadog/android/rum/model/ErrorEvent$Configuration;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "getSession", "Lcom/datadog/android/rum/model/ErrorEvent$Configuration;", "getConfiguration", "Ljava/lang/String;", "getBrowserSdkVersion", "", "formatVersion", "J", "getFormatVersion", "()J", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String browserSdkVersion;
        private final Configuration configuration;
        private final long formatVersion;
        private final DdSession session;

        public /* synthetic */ Dd(DdSession ddSession, Configuration configuration, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str);
        }

        public static /* synthetic */ Dd copy$default(Dd dd, DdSession ddSession, Configuration configuration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                ddSession = dd.session;
            }
            if ((i & 2) != 0) {
                configuration = dd.configuration;
            }
            if ((i & 4) != 0) {
                str = dd.browserSdkVersion;
            }
            return dd.copy(ddSession, configuration, str);
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

        public final Dd copy(DdSession session, Configuration configuration, String browserSdkVersion) {
            return new Dd(session, configuration, browserSdkVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) other;
            return wl7.b(this.session, dd.session) && wl7.b(this.configuration, dd.configuration) && wl7.b(this.browserSdkVersion, dd.browserSdkVersion);
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
            return iHashCode2 + (str != null ? str.hashCode() : 0);
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
            return ab8Var;
        }

        public String toString() {
            DdSession ddSession = this.session;
            Configuration configuration = this.configuration;
            String str = this.browserSdkVersion;
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(ddSession);
            sb.append(", configuration=");
            sb.append(configuration);
            sb.append(", browserSdkVersion=");
            return l6.i(sb, str, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Dd;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                    if (jE == 2) {
                        return new Dd(ddSessionFromJsonObject, configurationFromJsonObject, strG);
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

        public Dd(DdSession ddSession, Configuration configuration, String str) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.formatVersion = 2L;
        }

        public Dd() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Plan;Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$Plan;Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "getSessionPrecondition", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$DdSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Device;", "", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Device;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "getType", "Ljava/lang/String;", "getName", "getModel", "getBrand", "getArchitecture", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Device;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Device;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$DeviceType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Display;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "viewport", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Viewport;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$Viewport;)Lcom/datadog/android/rum/model/ErrorEvent$Display;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "getViewport", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Display;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Display;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Disposition;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ENFORCE", "REPORT", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Disposition {
        ENFORCE("enforce"),
        REPORT("report");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Disposition(String str) {
            this.jsonValue = str;
        }

        public static final Disposition fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Disposition$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$Disposition;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Disposition fromJson(String jsonString) {
                jsonString.getClass();
                for (Disposition disposition : Disposition.values()) {
                    if (wl7.b(disposition.jsonValue, jsonString)) {
                        return disposition;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "SLOW_2G", "2G", "3G", "4G", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow_2g"),
        f32G("2g"),
        f43G("3g"),
        f54G("4g");


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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$EffectiveType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u0000 r2\u00020\u0001:\u0001rBõ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010)J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010)J\u0012\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010)J\u0012\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b=\u0010/J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b>\u0010/J\u0012\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b?\u00101J\u0012\u0010@\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0082\u0002\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\b2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bH\u0010)J\u0010\u0010J\u001a\u00020IHÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u000b2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bM\u0010NR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010)R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010)\"\u0004\bR\u0010SR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bU\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010O\u001a\u0004\bV\u0010)\"\u0004\bW\u0010SR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010X\u001a\u0004\bY\u0010/\"\u0004\bZ\u0010[R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\\\u001a\u0004\b\f\u00101R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010O\u001a\u0004\b]\u0010)\"\u0004\b^\u0010SR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\b_\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010`\u001a\u0004\ba\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010b\u001a\u0004\bc\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bd\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010e\u001a\u0004\bf\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010g\u001a\u0004\bh\u0010<R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\bi\u0010/R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\bj\u0010/R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\\\u001a\u0004\bk\u00101R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010l\u001a\u0004\bm\u0010AR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010n\u001a\u0004\bo\u0010CR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010p\u001a\u0004\bq\u0010E¨\u0006s"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Error;", "", "", "id", "message", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "source", "stack", "", "Lcom/datadog/android/rum/model/ErrorEvent$Cause;", "causes", "", "isCrash", "fingerprint", "type", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "category", "Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "handling", "handlingStack", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "sourceType", "Lcom/datadog/android/rum/model/ErrorEvent$Resource;", RumEventDeserializer.EVENT_TYPE_RESOURCE, "Lcom/datadog/android/rum/model/ErrorEvent$Thread;", "threads", "Lcom/datadog/android/rum/model/ErrorEvent$BinaryImage;", "binaryImages", "wasTruncated", "Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "meta", "Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "csp", "", "timeSinceAppStart", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Category;Lcom/datadog/android/rum/model/ErrorEvent$Handling;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$SourceType;Lcom/datadog/android/rum/model/ErrorEvent$Resource;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ErrorEvent$Meta;Lcom/datadog/android/rum/model/ErrorEvent$Csp;Ljava/lang/Long;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "()Lcom/datadog/android/rum/model/ErrorEvent$Category;", "component10", "()Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "component11", "component12", "()Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "component13", "()Lcom/datadog/android/rum/model/ErrorEvent$Resource;", "component14", "component15", "component16", "component17", "()Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "component18", "()Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "component19", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Category;Lcom/datadog/android/rum/model/ErrorEvent$Handling;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$SourceType;Lcom/datadog/android/rum/model/ErrorEvent$Resource;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ErrorEvent$Meta;Lcom/datadog/android/rum/model/ErrorEvent$Csp;Ljava/lang/Long;)Lcom/datadog/android/rum/model/ErrorEvent$Error;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getMessage", "setMessage", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "getSource", "getStack", "setStack", "Ljava/util/List;", "getCauses", "setCauses", "(Ljava/util/List;)V", "Ljava/lang/Boolean;", "getFingerprint", "setFingerprint", "getType", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "getCategory", "Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "getHandling", "getHandlingStack", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "getSourceType", "Lcom/datadog/android/rum/model/ErrorEvent$Resource;", "getResource", "getThreads", "getBinaryImages", "getWasTruncated", "Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "getMeta", "Lcom/datadog/android/rum/model/ErrorEvent$Csp;", "getCsp", "Ljava/lang/Long;", "getTimeSinceAppStart", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Error {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<BinaryImage> binaryImages;
        private final Category category;
        private List<Cause> causes;
        private final Csp csp;
        private String fingerprint;
        private final Handling handling;
        private final String handlingStack;
        private final String id;
        private final Boolean isCrash;
        private String message;
        private final Meta meta;
        private final Resource resource;
        private final ErrorSource source;
        private final SourceType sourceType;
        private String stack;
        private final List<Thread> threads;
        private final Long timeSinceAppStart;
        private final String type;
        private final Boolean wasTruncated;

        public /* synthetic */ Error(String str, String str2, ErrorSource errorSource, String str3, List list, Boolean bool, String str4, String str5, Category category, Handling handling, String str6, SourceType sourceType, Resource resource, List list2, List list3, Boolean bool2, Meta meta, Csp csp, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, errorSource, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str5, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : category, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : handling, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str6, (i & 2048) != 0 ? null : sourceType, (i & 4096) != 0 ? null : resource, (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : list3, (32768 & i) != 0 ? null : bool2, (65536 & i) != 0 ? null : meta, (131072 & i) != 0 ? null : csp, (i & 262144) != 0 ? null : l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, String str, String str2, ErrorSource errorSource, String str3, List list, Boolean bool, String str4, String str5, Category category, Handling handling, String str6, SourceType sourceType, Resource resource, List list2, List list3, Boolean bool2, Meta meta, Csp csp, Long l, int i, Object obj) {
            Long l2;
            Csp csp2;
            String str7 = (i & 1) != 0 ? error.id : str;
            String str8 = (i & 2) != 0 ? error.message : str2;
            ErrorSource errorSource2 = (i & 4) != 0 ? error.source : errorSource;
            String str9 = (i & 8) != 0 ? error.stack : str3;
            List list4 = (i & 16) != 0 ? error.causes : list;
            Boolean bool3 = (i & 32) != 0 ? error.isCrash : bool;
            String str10 = (i & 64) != 0 ? error.fingerprint : str4;
            String str11 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? error.type : str5;
            Category category2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? error.category : category;
            Handling handling2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? error.handling : handling;
            String str12 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? error.handlingStack : str6;
            SourceType sourceType2 = (i & 2048) != 0 ? error.sourceType : sourceType;
            Resource resource2 = (i & 4096) != 0 ? error.resource : resource;
            List list5 = (i & 8192) != 0 ? error.threads : list2;
            String str13 = str7;
            List list6 = (i & 16384) != 0 ? error.binaryImages : list3;
            Boolean bool4 = (i & 32768) != 0 ? error.wasTruncated : bool2;
            Meta meta2 = (i & 65536) != 0 ? error.meta : meta;
            Csp csp3 = (i & 131072) != 0 ? error.csp : csp;
            if ((i & 262144) != 0) {
                csp2 = csp3;
                l2 = error.timeSinceAppStart;
            } else {
                l2 = l;
                csp2 = csp3;
            }
            return error.copy(str13, str8, errorSource2, str9, list4, bool3, str10, str11, category2, handling2, str12, sourceType2, resource2, list5, list6, bool4, meta2, csp2, l2);
        }

        public static final Error fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Error fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Handling getHandling() {
            return this.handling;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getHandlingStack() {
            return this.handlingStack;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final SourceType getSourceType() {
            return this.sourceType;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Resource getResource() {
            return this.resource;
        }

        public final List<Thread> component14() {
            return this.threads;
        }

        public final List<BinaryImage> component15() {
            return this.binaryImages;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Boolean getWasTruncated() {
            return this.wasTruncated;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final Meta getMeta() {
            return this.meta;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final Csp getCsp() {
            return this.csp;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Long getTimeSinceAppStart() {
            return this.timeSinceAppStart;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ErrorSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getStack() {
            return this.stack;
        }

        public final List<Cause> component5() {
            return this.causes;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIsCrash() {
            return this.isCrash;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getFingerprint() {
            return this.fingerprint;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Category getCategory() {
            return this.category;
        }

        public final Error copy(String id, String message, ErrorSource source, String stack, List<Cause> causes, Boolean isCrash, String fingerprint, String type, Category category, Handling handling, String handlingStack, SourceType sourceType, Resource resource, List<Thread> threads, List<BinaryImage> binaryImages, Boolean wasTruncated, Meta meta, Csp csp, Long timeSinceAppStart) {
            message.getClass();
            source.getClass();
            return new Error(id, message, source, stack, causes, isCrash, fingerprint, type, category, handling, handlingStack, sourceType, resource, threads, binaryImages, wasTruncated, meta, csp, timeSinceAppStart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return wl7.b(this.id, error.id) && wl7.b(this.message, error.message) && this.source == error.source && wl7.b(this.stack, error.stack) && wl7.b(this.causes, error.causes) && wl7.b(this.isCrash, error.isCrash) && wl7.b(this.fingerprint, error.fingerprint) && wl7.b(this.type, error.type) && this.category == error.category && this.handling == error.handling && wl7.b(this.handlingStack, error.handlingStack) && this.sourceType == error.sourceType && wl7.b(this.resource, error.resource) && wl7.b(this.threads, error.threads) && wl7.b(this.binaryImages, error.binaryImages) && wl7.b(this.wasTruncated, error.wasTruncated) && wl7.b(this.meta, error.meta) && wl7.b(this.csp, error.csp) && wl7.b(this.timeSinceAppStart, error.timeSinceAppStart);
        }

        public final List<BinaryImage> getBinaryImages() {
            return this.binaryImages;
        }

        public final Category getCategory() {
            return this.category;
        }

        public final List<Cause> getCauses() {
            return this.causes;
        }

        public final Csp getCsp() {
            return this.csp;
        }

        public final String getFingerprint() {
            return this.fingerprint;
        }

        public final Handling getHandling() {
            return this.handling;
        }

        public final String getHandlingStack() {
            return this.handlingStack;
        }

        public final String getId() {
            return this.id;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Meta getMeta() {
            return this.meta;
        }

        public final Resource getResource() {
            return this.resource;
        }

        public final ErrorSource getSource() {
            return this.source;
        }

        public final SourceType getSourceType() {
            return this.sourceType;
        }

        public final String getStack() {
            return this.stack;
        }

        public final List<Thread> getThreads() {
            return this.threads;
        }

        public final Long getTimeSinceAppStart() {
            return this.timeSinceAppStart;
        }

        public final String getType() {
            return this.type;
        }

        public final Boolean getWasTruncated() {
            return this.wasTruncated;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (this.source.hashCode() + akb.d((str == null ? 0 : str.hashCode()) * 31, 31, this.message)) * 31;
            String str2 = this.stack;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Cause> list = this.causes;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isCrash;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.fingerprint;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.type;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Category category = this.category;
            int iHashCode7 = (iHashCode6 + (category == null ? 0 : category.hashCode())) * 31;
            Handling handling = this.handling;
            int iHashCode8 = (iHashCode7 + (handling == null ? 0 : handling.hashCode())) * 31;
            String str5 = this.handlingStack;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            SourceType sourceType = this.sourceType;
            int iHashCode10 = (iHashCode9 + (sourceType == null ? 0 : sourceType.hashCode())) * 31;
            Resource resource = this.resource;
            int iHashCode11 = (iHashCode10 + (resource == null ? 0 : resource.hashCode())) * 31;
            List<Thread> list2 = this.threads;
            int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<BinaryImage> list3 = this.binaryImages;
            int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Boolean bool2 = this.wasTruncated;
            int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Meta meta = this.meta;
            int iHashCode15 = (iHashCode14 + (meta == null ? 0 : meta.hashCode())) * 31;
            Csp csp = this.csp;
            int iHashCode16 = (iHashCode15 + (csp == null ? 0 : csp.hashCode())) * 31;
            Long l = this.timeSinceAppStart;
            return iHashCode16 + (l != null ? l.hashCode() : 0);
        }

        public final Boolean isCrash() {
            return this.isCrash;
        }

        public final void setCauses(List<Cause> list) {
            this.causes = list;
        }

        public final void setFingerprint(String str) {
            this.fingerprint = str;
        }

        public final void setMessage(String str) {
            str.getClass();
            this.message = str;
        }

        public final void setStack(String str) {
            this.stack = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.id;
            if (str != null) {
                ab8Var.l("id", str);
            }
            ab8Var.l("message", this.message);
            ab8Var.i("source", this.source.toJson());
            String str2 = this.stack;
            if (str2 != null) {
                ab8Var.l("stack", str2);
            }
            List<Cause> list = this.causes;
            if (list != null) {
                w98 w98Var = new w98(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    w98Var.i(((Cause) it.next()).toJson());
                }
                ab8Var.i("causes", w98Var);
            }
            Boolean bool = this.isCrash;
            if (bool != null) {
                ab8Var.k("is_crash", bool);
            }
            String str3 = this.fingerprint;
            if (str3 != null) {
                ab8Var.l("fingerprint", str3);
            }
            String str4 = this.type;
            if (str4 != null) {
                ab8Var.l("type", str4);
            }
            Category category = this.category;
            if (category != null) {
                ab8Var.i("category", category.toJson());
            }
            Handling handling = this.handling;
            if (handling != null) {
                ab8Var.i("handling", handling.toJson());
            }
            String str5 = this.handlingStack;
            if (str5 != null) {
                ab8Var.l("handling_stack", str5);
            }
            SourceType sourceType = this.sourceType;
            if (sourceType != null) {
                ab8Var.i("source_type", sourceType.toJson());
            }
            Resource resource = this.resource;
            if (resource != null) {
                ab8Var.i(RumEventDeserializer.EVENT_TYPE_RESOURCE, resource.toJson());
            }
            List<Thread> list2 = this.threads;
            if (list2 != null) {
                w98 w98Var2 = new w98(list2.size());
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    w98Var2.i(((Thread) it2.next()).toJson());
                }
                ab8Var.i("threads", w98Var2);
            }
            List<BinaryImage> list3 = this.binaryImages;
            if (list3 != null) {
                w98 w98Var3 = new w98(list3.size());
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    w98Var3.i(((BinaryImage) it3.next()).toJson());
                }
                ab8Var.i("binary_images", w98Var3);
            }
            Boolean bool2 = this.wasTruncated;
            if (bool2 != null) {
                ab8Var.k("was_truncated", bool2);
            }
            Meta meta = this.meta;
            if (meta != null) {
                ab8Var.i("meta", meta.toJson());
            }
            Csp csp = this.csp;
            if (csp != null) {
                ab8Var.i("csp", csp.toJson());
            }
            Long l = this.timeSinceAppStart;
            if (l != null) {
                ia.o(l, ab8Var, "time_since_app_start");
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.message;
            ErrorSource errorSource = this.source;
            String str3 = this.stack;
            List<Cause> list = this.causes;
            Boolean bool = this.isCrash;
            String str4 = this.fingerprint;
            String str5 = this.type;
            Category category = this.category;
            Handling handling = this.handling;
            String str6 = this.handlingStack;
            SourceType sourceType = this.sourceType;
            Resource resource = this.resource;
            List<Thread> list2 = this.threads;
            List<BinaryImage> list3 = this.binaryImages;
            Boolean bool2 = this.wasTruncated;
            Meta meta = this.meta;
            Csp csp = this.csp;
            Long l = this.timeSinceAppStart;
            StringBuilder sbF = u40.f("Error(id=", str, ", message=", str2, ", source=");
            sbF.append(errorSource);
            sbF.append(", stack=");
            sbF.append(str3);
            sbF.append(", causes=");
            sbF.append(list);
            sbF.append(", isCrash=");
            sbF.append(bool);
            sbF.append(", fingerprint=");
            ia.r(sbF, str4, ", type=", str5, ", category=");
            sbF.append(category);
            sbF.append(", handling=");
            sbF.append(handling);
            sbF.append(", handlingStack=");
            sbF.append(str6);
            sbF.append(", sourceType=");
            sbF.append(sourceType);
            sbF.append(", resource=");
            sbF.append(resource);
            sbF.append(", threads=");
            sbF.append(list2);
            sbF.append(", binaryImages=");
            sbF.append(list3);
            sbF.append(", wasTruncated=");
            sbF.append(bool2);
            sbF.append(", meta=");
            sbF.append(meta);
            sbF.append(", csp=");
            sbF.append(csp);
            sbF.append(", timeSinceAppStart=");
            sbF.append(l);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Error;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Error;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r18v0 */
            /* JADX WARN: Type inference failed for: r18v1 */
            /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r18v3 */
            /* JADX WARN: Type inference failed for: r19v0 */
            /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Boolean] */
            /* JADX WARN: Type inference failed for: r19v2 */
            /* JADX WARN: Type inference failed for: r20v0 */
            /* JADX WARN: Type inference failed for: r20v1, types: [com.datadog.android.rum.model.ErrorEvent$Meta] */
            /* JADX WARN: Type inference failed for: r20v2 */
            /* JADX WARN: Type inference failed for: r21v0 */
            /* JADX WARN: Type inference failed for: r21v1, types: [com.datadog.android.rum.model.ErrorEvent$Csp] */
            /* JADX WARN: Type inference failed for: r21v2 */
            /* JADX WARN: Type inference failed for: r22v0 */
            /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r22v2 */
            /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v25 */
            /* JADX WARN: Type inference failed for: r3v26 */
            /* JADX WARN: Type inference failed for: r3v36, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v2 */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
            public final Error fromJsonObject(ab8 jsonObject) {
                Error error;
                ArrayList arrayList;
                Resource resourceFromJsonObject;
                String str;
                ?? arrayList2;
                ?? r18;
                ?? arrayList3;
                String strG;
                String strG2;
                String strG3;
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("id");
                    String strG4 = ka8VarM != null ? ka8VarM.g() : null;
                    String strG5 = jsonObject.m("message").g();
                    ErrorSource.Companion companion = ErrorSource.INSTANCE;
                    String strG6 = jsonObject.m("source").g();
                    strG6.getClass();
                    ErrorSource errorSourceFromJson = companion.fromJson(strG6);
                    ka8 ka8VarM2 = jsonObject.m("stack");
                    String strG7 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("causes");
                    if (ka8VarM3 != null) {
                        w98 w98VarC = ka8VarM3.c();
                        arrayList = new ArrayList(w98VarC.a.size());
                        Iterator<ka8> it = w98VarC.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Cause.INSTANCE.fromJsonObject(it.next().d()));
                        }
                    } else {
                        arrayList = null;
                    }
                    ka8 ka8VarM4 = jsonObject.m("is_crash");
                    Boolean boolValueOf = ka8VarM4 != null ? Boolean.valueOf(ka8VarM4.a()) : null;
                    ka8 ka8VarM5 = jsonObject.m("fingerprint");
                    String strG8 = ka8VarM5 != null ? ka8VarM5.g() : null;
                    ka8 ka8VarM6 = jsonObject.m("type");
                    String strG9 = ka8VarM6 != null ? ka8VarM6.g() : null;
                    ka8 ka8VarM7 = jsonObject.m("category");
                    Category categoryFromJson = (ka8VarM7 == null || (strG3 = ka8VarM7.g()) == null) ? null : Category.INSTANCE.fromJson(strG3);
                    ka8 ka8VarM8 = jsonObject.m("handling");
                    Handling handlingFromJson = (ka8VarM8 == null || (strG2 = ka8VarM8.g()) == null) ? null : Handling.INSTANCE.fromJson(strG2);
                    ka8 ka8VarM9 = jsonObject.m("handling_stack");
                    String strG10 = ka8VarM9 != null ? ka8VarM9.g() : null;
                    ka8 ka8VarM10 = jsonObject.m("source_type");
                    SourceType sourceTypeFromJson = (ka8VarM10 == null || (strG = ka8VarM10.g()) == null) ? null : SourceType.INSTANCE.fromJson(strG);
                    ka8 ka8VarM11 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_RESOURCE);
                    if (ka8VarM11 != null) {
                        error = null;
                        try {
                            resourceFromJsonObject = Resource.INSTANCE.fromJsonObject(ka8VarM11.d());
                        } catch (IllegalStateException e) {
                            e = e;
                            g7.n("Unable to parse json into type Error", e);
                            return error;
                        } catch (NullPointerException e2) {
                            e = e2;
                            g7.n("Unable to parse json into type Error", e);
                            return error;
                        } catch (NumberFormatException e3) {
                            e = e3;
                            g7.n("Unable to parse json into type Error", e);
                            return error;
                        }
                    } else {
                        error = null;
                        resourceFromJsonObject = null;
                    }
                    ka8 ka8VarM12 = jsonObject.m("threads");
                    if (ka8VarM12 != null) {
                        w98 w98VarC2 = ka8VarM12.c();
                        str = strG4;
                        arrayList2 = new ArrayList(w98VarC2.a.size());
                        for (Iterator<ka8> it2 = w98VarC2.iterator(); it2.hasNext(); it2 = it2) {
                            arrayList2.add(Thread.INSTANCE.fromJsonObject(it2.next().d()));
                        }
                    } else {
                        str = strG4;
                        arrayList2 = error;
                    }
                    ka8 ka8VarM13 = jsonObject.m("binary_images");
                    if (ka8VarM13 != null) {
                        w98 w98VarC3 = ka8VarM13.c();
                        r18 = arrayList2;
                        arrayList3 = new ArrayList(w98VarC3.a.size());
                        for (Iterator<ka8> it3 = w98VarC3.iterator(); it3.hasNext(); it3 = it3) {
                            arrayList3.add(BinaryImage.INSTANCE.fromJsonObject(it3.next().d()));
                        }
                    } else {
                        r18 = arrayList2;
                        arrayList3 = error;
                    }
                    ka8 ka8VarM14 = jsonObject.m("was_truncated");
                    ?? ValueOf = ka8VarM14 != null ? Boolean.valueOf(ka8VarM14.a()) : error;
                    ka8 ka8VarM15 = jsonObject.m("meta");
                    ?? FromJsonObject = ka8VarM15 != null ? Meta.INSTANCE.fromJsonObject(ka8VarM15.d()) : error;
                    ka8 ka8VarM16 = jsonObject.m("csp");
                    ?? FromJsonObject2 = ka8VarM16 != null ? Csp.INSTANCE.fromJsonObject(ka8VarM16.d()) : error;
                    ka8 ka8VarM17 = jsonObject.m("time_since_app_start");
                    ?? ValueOf2 = ka8VarM17 != null ? Long.valueOf(ka8VarM17.e()) : error;
                    strG5.getClass();
                    return new Error(str, strG5, errorSourceFromJson, strG7, arrayList, boolValueOf, strG8, strG9, categoryFromJson, handlingFromJson, strG10, sourceTypeFromJson, resourceFromJsonObject, r18, arrayList3, ValueOf, FromJsonObject, FromJsonObject2, ValueOf2);
                } catch (IllegalStateException e4) {
                    e = e4;
                    error = null;
                } catch (NullPointerException e5) {
                    e = e5;
                    error = null;
                } catch (NumberFormatException e6) {
                    e = e6;
                    error = null;
                }
            }

            private Companion() {
            }
        }

        public Error(String str, String str2, ErrorSource errorSource, String str3, List<Cause> list, Boolean bool, String str4, String str5, Category category, Handling handling, String str6, SourceType sourceType, Resource resource, List<Thread> list2, List<BinaryImage> list3, Boolean bool2, Meta meta, Csp csp, Long l) {
            str2.getClass();
            errorSource.getClass();
            this.id = str;
            this.message = str2;
            this.source = errorSource;
            this.stack = str3;
            this.causes = list;
            this.isCrash = bool;
            this.fingerprint = str4;
            this.type = str5;
            this.category = category;
            this.handling = handling;
            this.handlingStack = str6;
            this.sourceType = sourceType;
            this.resource = resource;
            this.threads = list2;
            this.binaryImages = list3;
            this.wasTruncated = bool2;
            this.meta = meta;
            this.csp = csp;
            this.timeSinceAppStart = l;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "type", "", "hasReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "getType", "Ljava/lang/Boolean;", "getHasReplay", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ErrorEventSession {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean hasReplay;
        private final String id;
        private final ErrorEventSessionType type;

        public ErrorEventSession(String str, ErrorEventSessionType errorEventSessionType, Boolean bool) {
            str.getClass();
            errorEventSessionType.getClass();
            this.id = str;
            this.type = errorEventSessionType;
            this.hasReplay = bool;
        }

        public static /* synthetic */ ErrorEventSession copy$default(ErrorEventSession errorEventSession, String str, ErrorEventSessionType errorEventSessionType, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorEventSession.id;
            }
            if ((i & 2) != 0) {
                errorEventSessionType = errorEventSession.type;
            }
            if ((i & 4) != 0) {
                bool = errorEventSession.hasReplay;
            }
            return errorEventSession.copy(str, errorEventSessionType, bool);
        }

        public static final ErrorEventSession fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ErrorEventSession fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ErrorEventSessionType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final ErrorEventSession copy(String id, ErrorEventSessionType type, Boolean hasReplay) {
            id.getClass();
            type.getClass();
            return new ErrorEventSession(id, type, hasReplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorEventSession)) {
                return false;
            }
            ErrorEventSession errorEventSession = (ErrorEventSession) other;
            return wl7.b(this.id, errorEventSession.id) && this.type == errorEventSession.type && wl7.b(this.hasReplay, errorEventSession.hasReplay);
        }

        public final Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final String getId() {
            return this.id;
        }

        public final ErrorEventSessionType getType() {
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
            ErrorEventSessionType errorEventSessionType = this.type;
            Boolean bool = this.hasReplay;
            StringBuilder sb = new StringBuilder("ErrorEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(errorEventSessionType);
            sb.append(", hasReplay=");
            return l5.n(sb, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSession;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorEventSession fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ErrorEventSession", e);
                    return null;
                }
            }

            public final ErrorEventSession fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    String strG = jsonObject.m("id").g();
                    ErrorEventSessionType.Companion companion = ErrorEventSessionType.INSTANCE;
                    String strG2 = jsonObject.m("type").g();
                    strG2.getClass();
                    ErrorEventSessionType errorEventSessionTypeFromJson = companion.fromJson(strG2);
                    ka8 ka8VarM = jsonObject.m(FeaturesContextResolver.HAS_REPLAY_KEY);
                    Boolean boolValueOf = ka8VarM != null ? Boolean.valueOf(ka8VarM.a()) : null;
                    strG.getClass();
                    return new ErrorEventSession(strG, errorEventSessionTypeFromJson, boolValueOf);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ErrorEventSession", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ErrorEventSession", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ErrorEventSession", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ ErrorEventSession(String str, ErrorEventSessionType errorEventSessionType, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, errorEventSessionType, (i & 4) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER", "SYNTHETICS", "CI_TEST", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ErrorEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ErrorEventSessionType(String str) {
            this.jsonValue = str;
        }

        public static final ErrorEventSessionType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSessionType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorEventSessionType fromJson(String jsonString) {
                jsonString.getClass();
                for (ErrorEventSessionType errorEventSessionType : ErrorEventSessionType.values()) {
                    if (wl7.b(errorEventSessionType.jsonValue, jsonString)) {
                        return errorEventSessionType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ErrorEventSource {
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

        ErrorEventSource(String str) {
            this.jsonValue = str;
        }

        public static final ErrorEventSource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorEventSource fromJson(String jsonString) {
                jsonString.getClass();
                for (ErrorEventSource errorEventSource : ErrorEventSource.values()) {
                    if (wl7.b(errorEventSource.jsonValue, jsonString)) {
                        return errorEventSource;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\"R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014¨\u0006*"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "", "", "id", "referrer", "url", "name", "", "inForeground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getReferrer", "setReferrer", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getName", "setName", "Ljava/lang/Boolean;", "getInForeground", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ErrorEventView {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final Boolean inForeground;
        private String name;
        private String referrer;
        private String url;

        public ErrorEventView(String str, String str2, String str3, String str4, Boolean bool) {
            str.getClass();
            str3.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
            this.inForeground = bool;
        }

        public static /* synthetic */ ErrorEventView copy$default(ErrorEventView errorEventView, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorEventView.id;
            }
            if ((i & 2) != 0) {
                str2 = errorEventView.referrer;
            }
            if ((i & 4) != 0) {
                str3 = errorEventView.url;
            }
            if ((i & 8) != 0) {
                str4 = errorEventView.name;
            }
            if ((i & 16) != 0) {
                bool = errorEventView.inForeground;
            }
            Boolean bool2 = bool;
            String str5 = str3;
            return errorEventView.copy(str, str2, str5, str4, bool2);
        }

        public static final ErrorEventView fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final ErrorEventView fromJsonObject(ab8 ab8Var) {
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

        public final ErrorEventView copy(String id, String referrer, String url, String name, Boolean inForeground) {
            id.getClass();
            url.getClass();
            return new ErrorEventView(id, referrer, url, name, inForeground);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorEventView)) {
                return false;
            }
            ErrorEventView errorEventView = (ErrorEventView) other;
            return wl7.b(this.id, errorEventView.id) && wl7.b(this.referrer, errorEventView.referrer) && wl7.b(this.url, errorEventView.url) && wl7.b(this.name, errorEventView.name) && wl7.b(this.inForeground, errorEventView.inForeground);
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
            StringBuilder sbF = u40.f("ErrorEventView(id=", str, ", referrer=", str2, ", url=");
            ia.r(sbF, str3, ", name=", str4, ", inForeground=");
            return l5.n(sbF, bool, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventView;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorEventView fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ErrorEventView", e);
                    return null;
                }
            }

            public final ErrorEventView fromJsonObject(ab8 jsonObject) {
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
                    return new ErrorEventView(strG, strG2, strG3, strG4, boolValueOf);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type ErrorEventView", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type ErrorEventView", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type ErrorEventView", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public /* synthetic */ ErrorEventView(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "NETWORK", "SOURCE", "CONSOLE", "LOGGER", "AGENT", "WEBVIEW", "CUSTOM", "REPORT", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ErrorSource {
        NETWORK("network"),
        SOURCE("source"),
        CONSOLE("console"),
        LOGGER("logger"),
        AGENT("agent"),
        WEBVIEW("webview"),
        CUSTOM("custom"),
        REPORT("report");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        ErrorSource(String str) {
            this.jsonValue = str;
        }

        public static final ErrorSource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorSource fromJson(String jsonString) {
                jsonString.getClass();
                for (ErrorSource errorSource : ErrorSource.values()) {
                    if (wl7.b(errorSource.jsonValue, jsonString)) {
                        return errorSource;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "", "", "duration", "<init>", "(J)V", "Lka8;", "toJson", "()Lka8;", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDuration", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Freeze {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration;

        public Freeze(long j) {
            this.duration = j;
        }

        public static /* synthetic */ Freeze copy$default(Freeze freeze, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = freeze.duration;
            }
            return freeze.copy(j);
        }

        public static final Freeze fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Freeze fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        public final Freeze copy(long duration) {
            return new Freeze(duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Freeze) && this.duration == ((Freeze) other).duration;
        }

        public final long getDuration() {
            return this.duration;
        }

        public int hashCode() {
            return Long.hashCode(this.duration);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.j(Long.valueOf(this.duration), "duration");
            return ab8Var;
        }

        public String toString() {
            return u40.c(this.duration, "Freeze(duration=", ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Freeze$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Freeze;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Freeze fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Freeze", e);
                    return null;
                }
            }

            public final Freeze fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    return new Freeze(jsonObject.m("duration").e());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Freeze", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Freeze", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Freeze", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "HANDLED", "UNHANDLED", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Handling {
        HANDLED("handled"),
        UNHANDLED("unhandled");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        Handling(String str) {
            this.jsonValue = str;
        }

        public static final Handling fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Handling$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$Handling;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Handling fromJson(String jsonString) {
                jsonString.getClass();
                for (Handling handling : Handling.values()) {
                    if (wl7.b(handling.jsonValue, jsonString)) {
                        return handling;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Interface;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Interface$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$Interface;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010Jd\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b'\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b(\u0010\u0010¨\u0006*"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "", "", "codeType", "parentProcess", "incidentIdentifier", "process", "exceptionType", "exceptionCodes", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCodeType", "getParentProcess", "getIncidentIdentifier", "getProcess", "getExceptionType", "getExceptionCodes", "getPath", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Meta {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String codeType;
        private final String exceptionCodes;
        private final String exceptionType;
        private final String incidentIdentifier;
        private final String parentProcess;
        private final String path;
        private final String process;

        public /* synthetic */ Meta(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }

        public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = meta.codeType;
            }
            if ((i & 2) != 0) {
                str2 = meta.parentProcess;
            }
            if ((i & 4) != 0) {
                str3 = meta.incidentIdentifier;
            }
            if ((i & 8) != 0) {
                str4 = meta.process;
            }
            if ((i & 16) != 0) {
                str5 = meta.exceptionType;
            }
            if ((i & 32) != 0) {
                str6 = meta.exceptionCodes;
            }
            if ((i & 64) != 0) {
                str7 = meta.path;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return meta.copy(str, str2, str11, str4, str10, str8, str9);
        }

        public static final Meta fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Meta fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCodeType() {
            return this.codeType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getParentProcess() {
            return this.parentProcess;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getIncidentIdentifier() {
            return this.incidentIdentifier;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getProcess() {
            return this.process;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getExceptionType() {
            return this.exceptionType;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getExceptionCodes() {
            return this.exceptionCodes;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final Meta copy(String codeType, String parentProcess, String incidentIdentifier, String process, String exceptionType, String exceptionCodes, String path) {
            return new Meta(codeType, parentProcess, incidentIdentifier, process, exceptionType, exceptionCodes, path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) other;
            return wl7.b(this.codeType, meta.codeType) && wl7.b(this.parentProcess, meta.parentProcess) && wl7.b(this.incidentIdentifier, meta.incidentIdentifier) && wl7.b(this.process, meta.process) && wl7.b(this.exceptionType, meta.exceptionType) && wl7.b(this.exceptionCodes, meta.exceptionCodes) && wl7.b(this.path, meta.path);
        }

        public final String getCodeType() {
            return this.codeType;
        }

        public final String getExceptionCodes() {
            return this.exceptionCodes;
        }

        public final String getExceptionType() {
            return this.exceptionType;
        }

        public final String getIncidentIdentifier() {
            return this.incidentIdentifier;
        }

        public final String getParentProcess() {
            return this.parentProcess;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getProcess() {
            return this.process;
        }

        public int hashCode() {
            String str = this.codeType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.parentProcess;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.incidentIdentifier;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.process;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.exceptionType;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.exceptionCodes;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.path;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            String str = this.codeType;
            if (str != null) {
                ab8Var.l("code_type", str);
            }
            String str2 = this.parentProcess;
            if (str2 != null) {
                ab8Var.l("parent_process", str2);
            }
            String str3 = this.incidentIdentifier;
            if (str3 != null) {
                ab8Var.l("incident_identifier", str3);
            }
            String str4 = this.process;
            if (str4 != null) {
                ab8Var.l("process", str4);
            }
            String str5 = this.exceptionType;
            if (str5 != null) {
                ab8Var.l("exception_type", str5);
            }
            String str6 = this.exceptionCodes;
            if (str6 != null) {
                ab8Var.l("exception_codes", str6);
            }
            String str7 = this.path;
            if (str7 != null) {
                ab8Var.l("path", str7);
            }
            return ab8Var;
        }

        public String toString() {
            String str = this.codeType;
            String str2 = this.parentProcess;
            String str3 = this.incidentIdentifier;
            String str4 = this.process;
            String str5 = this.exceptionType;
            String str6 = this.exceptionCodes;
            String str7 = this.path;
            StringBuilder sbF = u40.f("Meta(codeType=", str, ", parentProcess=", str2, ", incidentIdentifier=");
            ia.r(sbF, str3, ", process=", str4, ", exceptionType=");
            ia.r(sbF, str5, ", exceptionCodes=", str6, ", path=");
            return l6.i(sbF, str7, ")");
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Meta$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Meta;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Meta fromJson(String jsonString) {
                jsonString.getClass();
                try {
                    return fromJsonObject(hh2.A(jsonString).d());
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Meta", e);
                    return null;
                }
            }

            public final Meta fromJsonObject(ab8 jsonObject) {
                jsonObject.getClass();
                try {
                    ka8 ka8VarM = jsonObject.m("code_type");
                    String strG = ka8VarM != null ? ka8VarM.g() : null;
                    ka8 ka8VarM2 = jsonObject.m("parent_process");
                    String strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                    ka8 ka8VarM3 = jsonObject.m("incident_identifier");
                    String strG3 = ka8VarM3 != null ? ka8VarM3.g() : null;
                    ka8 ka8VarM4 = jsonObject.m("process");
                    String strG4 = ka8VarM4 != null ? ka8VarM4.g() : null;
                    ka8 ka8VarM5 = jsonObject.m("exception_type");
                    String strG5 = ka8VarM5 != null ? ka8VarM5.g() : null;
                    ka8 ka8VarM6 = jsonObject.m("exception_codes");
                    String strG6 = ka8VarM6 != null ? ka8VarM6.g() : null;
                    ka8 ka8VarM7 = jsonObject.m("path");
                    return new Meta(strG, strG2, strG3, strG4, strG5, strG6, ka8VarM7 != null ? ka8VarM7.g() : null);
                } catch (IllegalStateException e) {
                    g7.n("Unable to parse json into type Meta", e);
                    return null;
                } catch (NullPointerException e2) {
                    g7.n("Unable to parse json into type Meta", e2);
                    return null;
                } catch (NumberFormatException e3) {
                    g7.n("Unable to parse json into type Meta", e3);
                    return null;
                }
            }

            private Companion() {
            }
        }

        public Meta(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.codeType = str;
            this.parentProcess = str2;
            this.incidentIdentifier = str3;
            this.process = str4;
            this.exceptionType = str5;
            this.exceptionCodes = str6;
            this.path = str7;
        }

        public Meta() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Method;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "POST", "GET", "HEAD", "PUT", "DELETE", "PATCH", "TRACE", "OPTIONS", "CONNECT", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Method$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Os;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "getBuild", "getVersionMajor", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Os;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Os;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/Number;", "Companion", "PLAN_1", "PLAN_2", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Plan$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$Plan;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "", "", "domain", "name", "Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;)Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDomain", "getName", "Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "getType", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Provider$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "AD", "ADVERTISING", "ANALYTICS", "CDN", "CONTENT", "CUSTOMER_SUCCESS", "FIRST_PARTY", "HOSTING", "MARKETING", "OTHER", "SOCIAL", "TAG_MANAGER", "UTILITY", "VIDEO", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$ProviderType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$ProviderType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016¨\u0006,"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Resource;", "", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "method", "", "statusCode", "", "url", "Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "provider", "<init>", "(Lcom/datadog/android/rum/model/ErrorEvent$Method;JLjava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Provider;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Lcom/datadog/android/rum/model/ErrorEvent$Method;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "copy", "(Lcom/datadog/android/rum/model/ErrorEvent$Method;JLjava/lang/String;Lcom/datadog/android/rum/model/ErrorEvent$Provider;)Lcom/datadog/android/rum/model/ErrorEvent$Resource;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "getMethod", "J", "getStatusCode", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/model/ErrorEvent$Provider;", "getProvider", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Resource {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Method method;
        private final Provider provider;
        private final long statusCode;
        private String url;

        public Resource(Method method, long j, String str, Provider provider) {
            method.getClass();
            str.getClass();
            this.method = method;
            this.statusCode = j;
            this.url = str;
            this.provider = provider;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, Method method, long j, String str, Provider provider, int i, Object obj) {
            if ((i & 1) != 0) {
                method = resource.method;
            }
            if ((i & 2) != 0) {
                j = resource.statusCode;
            }
            if ((i & 4) != 0) {
                str = resource.url;
            }
            if ((i & 8) != 0) {
                provider = resource.provider;
            }
            return resource.copy(method, j, str, provider);
        }

        public static final Resource fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public static final Resource fromJsonObject(ab8 ab8Var) {
            return INSTANCE.fromJsonObject(ab8Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getStatusCode() {
            return this.statusCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Provider getProvider() {
            return this.provider;
        }

        public final Resource copy(Method method, long statusCode, String url, Provider provider) {
            method.getClass();
            url.getClass();
            return new Resource(method, statusCode, url, provider);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) other;
            return this.method == resource.method && this.statusCode == resource.statusCode && wl7.b(this.url, resource.url) && wl7.b(this.provider, resource.provider);
        }

        public final Method getMethod() {
            return this.method;
        }

        public final Provider getProvider() {
            return this.provider;
        }

        public final long getStatusCode() {
            return this.statusCode;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iD = akb.d(ia.d(this.method.hashCode() * 31, 31, this.statusCode), 31, this.url);
            Provider provider = this.provider;
            return iD + (provider == null ? 0 : provider.hashCode());
        }

        public final void setUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final ka8 toJson() {
            ab8 ab8Var = new ab8();
            ab8Var.i("method", this.method.toJson());
            ab8Var.j(Long.valueOf(this.statusCode), "status_code");
            ab8Var.l("url", this.url);
            Provider provider = this.provider;
            if (provider != null) {
                ab8Var.i("provider", provider.toJson());
            }
            return ab8Var;
        }

        public String toString() {
            return "Resource(method=" + this.method + ", statusCode=" + this.statusCode + ", url=" + this.url + ", provider=" + this.provider + ")";
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Resource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Resource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Resource;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Resource;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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
                Provider providerFromJsonObject;
                jsonObject.getClass();
                try {
                    Method.Companion companion = Method.INSTANCE;
                    String strG = jsonObject.m("method").g();
                    strG.getClass();
                    Method methodFromJson = companion.fromJson(strG);
                    long jE = jsonObject.m("status_code").e();
                    String strG2 = jsonObject.m("url").g();
                    ka8 ka8VarM = jsonObject.m("provider");
                    if (ka8VarM != null) {
                        providerFromJsonObject = Provider.INSTANCE.fromJsonObject(ka8VarM.d());
                    } else {
                        providerFromJsonObject = null;
                    }
                    strG2.getClass();
                    return new Resource(methodFromJson, jE, strG2, providerFromJsonObject);
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

        public /* synthetic */ Resource(Method method, long j, String str, Provider provider, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, j, str, (i & 8) != 0 ? null : provider);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "ANDROID", "BROWSER", "IOS", "REACT_NATIVE", "FLUTTER", "ROKU", "NDK", "IOS_IL2CPP", "NDK_IL2CPP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum SourceType {
        ANDROID(CoreFeature.DEFAULT_SOURCE_NAME),
        BROWSER("browser"),
        IOS("ios"),
        REACT_NATIVE("react-native"),
        FLUTTER("flutter"),
        ROKU("roku"),
        NDK("ndk"),
        IOS_IL2CPP("ios+il2cpp"),
        NDK_IL2CPP("ndk+il2cpp");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jsonValue;

        SourceType(String str) {
            this.jsonValue = str;
        }

        public static final SourceType fromJson(String str) {
            return INSTANCE.fromJson(str);
        }

        public final ka8 toJson() {
            return new fb8(this.jsonValue);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$SourceType$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SourceType fromJson(String jsonString) {
                jsonString.getClass();
                for (SourceType sourceType : SourceType.values()) {
                    if (wl7.b(sourceType.jsonValue, jsonString)) {
                        return sourceType;
                    }
                }
                s6.j("Array contains no element matching the predicate.");
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Status;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "Ljava/lang/String;", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Status$Companion;", "", "()V", "fromJson", "Lcom/datadog/android/rum/model/ErrorEvent$Status;", "jsonString", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "getResultId", "Ljava/lang/Boolean;", "getInjected", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Synthetics;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000e¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Thread;", "", "", "name", "", "crashed", "stack", "state", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Thread;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Z", "getCrashed", "getStack", "getState", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Thread$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Thread;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Thread;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Thread;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u000fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006'"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "getAnonymousId", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "Lka8;", "toJson", "()Lka8;", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getWidth", "getHeight", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent$Viewport;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/model/ErrorEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ErrorEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ErrorEvent;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/rum/model/ErrorEvent;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorEvent fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type ErrorEvent", e);
                return null;
            }
        }

        public final ErrorEvent fromJsonObject(ab8 jsonObject) {
            ErrorEvent errorEvent;
            long jE;
            Application applicationFromJsonObject;
            String strG;
            String strG2;
            String strG3;
            String strG4;
            ErrorEventSession errorEventSessionFromJsonObject;
            ErrorEventSource errorEventSourceFromJson;
            ErrorEventView errorEventViewFromJsonObject;
            Usr usrFromJsonObject;
            Account accountFromJsonObject;
            Connectivity connectivityFromJsonObject;
            Display displayFromJsonObject;
            Synthetics syntheticsFromJsonObject;
            CiTest ciTestFromJsonObject;
            Os osFromJsonObject;
            Device deviceFromJsonObject;
            Dd ddFromJsonObject;
            Context contextFromJsonObject;
            Action actionFromJsonObject;
            Container containerFromJsonObject;
            String strG5;
            String strG6;
            jsonObject.getClass();
            try {
                jE = jsonObject.m(LogAttributes.DATE).e();
                applicationFromJsonObject = Application.INSTANCE.fromJsonObject(jsonObject.m("application").d());
                ka8 ka8VarM = jsonObject.m("service");
                strG = ka8VarM != null ? ka8VarM.g() : null;
                ka8 ka8VarM2 = jsonObject.m("version");
                strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                ka8 ka8VarM3 = jsonObject.m("build_version");
                strG3 = ka8VarM3 != null ? ka8VarM3.g() : null;
                ka8 ka8VarM4 = jsonObject.m("build_id");
                strG4 = ka8VarM4 != null ? ka8VarM4.g() : null;
                errorEventSessionFromJsonObject = ErrorEventSession.INSTANCE.fromJsonObject(jsonObject.m("session").d());
                ka8 ka8VarM5 = jsonObject.m("source");
                errorEventSourceFromJson = (ka8VarM5 == null || (strG6 = ka8VarM5.g()) == null) ? null : ErrorEventSource.INSTANCE.fromJson(strG6);
                errorEventViewFromJsonObject = ErrorEventView.INSTANCE.fromJsonObject(jsonObject.m("view").d());
                ka8 ka8VarM6 = jsonObject.m("usr");
                usrFromJsonObject = ka8VarM6 != null ? Usr.INSTANCE.fromJsonObject(ka8VarM6.d()) : null;
                ka8 ka8VarM7 = jsonObject.m("account");
                accountFromJsonObject = ka8VarM7 != null ? Account.INSTANCE.fromJsonObject(ka8VarM7.d()) : null;
                ka8 ka8VarM8 = jsonObject.m("connectivity");
                connectivityFromJsonObject = ka8VarM8 != null ? Connectivity.INSTANCE.fromJsonObject(ka8VarM8.d()) : null;
                ka8 ka8VarM9 = jsonObject.m("display");
                displayFromJsonObject = ka8VarM9 != null ? Display.INSTANCE.fromJsonObject(ka8VarM9.d()) : null;
                ka8 ka8VarM10 = jsonObject.m("synthetics");
                syntheticsFromJsonObject = ka8VarM10 != null ? Synthetics.INSTANCE.fromJsonObject(ka8VarM10.d()) : null;
                ka8 ka8VarM11 = jsonObject.m("ci_test");
                ciTestFromJsonObject = ka8VarM11 != null ? CiTest.INSTANCE.fromJsonObject(ka8VarM11.d()) : null;
                ka8 ka8VarM12 = jsonObject.m("os");
                osFromJsonObject = ka8VarM12 != null ? Os.INSTANCE.fromJsonObject(ka8VarM12.d()) : null;
                ka8 ka8VarM13 = jsonObject.m("device");
                deviceFromJsonObject = ka8VarM13 != null ? Device.INSTANCE.fromJsonObject(ka8VarM13.d()) : null;
                ddFromJsonObject = Dd.INSTANCE.fromJsonObject(jsonObject.m("_dd").d());
                ka8 ka8VarM14 = jsonObject.m(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
                contextFromJsonObject = ka8VarM14 != null ? Context.INSTANCE.fromJsonObject(ka8VarM14.d()) : null;
                ka8 ka8VarM15 = jsonObject.m(RumEventDeserializer.EVENT_TYPE_ACTION);
                actionFromJsonObject = ka8VarM15 != null ? Action.INSTANCE.fromJsonObject(ka8VarM15.d()) : null;
                ka8 ka8VarM16 = jsonObject.m("container");
                containerFromJsonObject = ka8VarM16 != null ? Container.INSTANCE.fromJsonObject(ka8VarM16.d()) : null;
                strG5 = jsonObject.m("type").g();
                errorEvent = null;
            } catch (IllegalStateException e) {
                e = e;
                errorEvent = null;
            } catch (NullPointerException e2) {
                e = e2;
                errorEvent = null;
            } catch (NumberFormatException e3) {
                e = e3;
                errorEvent = null;
            }
            try {
                Error errorFromJsonObject = Error.INSTANCE.fromJsonObject(jsonObject.m("error").d());
                ka8 ka8VarM17 = jsonObject.m("freeze");
                Freeze freezeFromJsonObject = ka8VarM17 != null ? Freeze.INSTANCE.fromJsonObject(ka8VarM17.d()) : null;
                ka8 ka8VarM18 = jsonObject.m("feature_flags");
                Context contextFromJsonObject2 = ka8VarM18 != null ? Context.INSTANCE.fromJsonObject(ka8VarM18.d()) : null;
                if (wl7.b(strG5, "error")) {
                    return new ErrorEvent(jE, applicationFromJsonObject, strG, strG2, strG3, strG4, errorEventSessionFromJsonObject, errorEventSourceFromJson, errorEventViewFromJsonObject, usrFromJsonObject, accountFromJsonObject, connectivityFromJsonObject, displayFromJsonObject, syntheticsFromJsonObject, ciTestFromJsonObject, osFromJsonObject, deviceFromJsonObject, ddFromJsonObject, contextFromJsonObject, actionFromJsonObject, containerFromJsonObject, errorFromJsonObject, freezeFromJsonObject, contextFromJsonObject2);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e4) {
                e = e4;
                g7.n("Unable to parse json into type ErrorEvent", e);
                return errorEvent;
            } catch (NullPointerException e5) {
                e = e5;
                g7.n("Unable to parse json into type ErrorEvent", e);
                return errorEvent;
            } catch (NumberFormatException e6) {
                e = e6;
                g7.n("Unable to parse json into type ErrorEvent", e);
                return errorEvent;
            }
        }

        private Companion() {
        }
    }

    public ErrorEvent(long j, Application application, String str, String str2, String str3, String str4, ErrorEventSession errorEventSession, ErrorEventSource errorEventSource, ErrorEventView errorEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Action action, Container container, Error error, Freeze freeze, Context context2) {
        application.getClass();
        errorEventSession.getClass();
        errorEventView.getClass();
        dd.getClass();
        error.getClass();
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.session = errorEventSession;
        this.source = errorEventSource;
        this.view = errorEventView;
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
        this.error = error;
        this.freeze = freeze;
        this.featureFlags = context2;
        this.type = "error";
    }
}
