package com.datadog.android.rum.internal.domain.scope;

import android.util.Log;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.internal.utils.ThrowableExtKt;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.internal.FeaturesContextResolver;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.SessionMetricDispatcher;
import com.datadog.android.rum.internal.metric.interactiontonextview.InteractionToNextViewMetricResolver;
import com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext;
import com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext;
import com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.datadog.android.rum.internal.vitals.VitalInfo;
import com.datadog.android.rum.internal.vitals.VitalListener;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.b0;
import defpackage.gu5;
import defpackage.j6;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.t40;
import defpackage.t92;
import defpackage.u63;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z3;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000 \u0096\u00022\u00020\u0001:\u0004\u0096\u0002\u0097\u0002B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010/J%\u00102\u001a\u0002012\u0006\u0010&\u001a\u0002002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\b2\u00103J%\u00104\u001a\u0002012\u0006\u0010&\u001a\u0002002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0002¢\u0006\u0004\b4\u00103J%\u00106\u001a\u0002012\u0006\u0010&\u001a\u0002052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\b6\u00107J%\u00109\u001a\u0002012\u0006\u0010&\u001a\u0002082\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\b9\u0010:J%\u0010<\u001a\u0002012\u0006\u0010&\u001a\u00020;2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\b<\u0010=J%\u0010?\u001a\u0002012\u0006\u0010&\u001a\u00020>2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\b?\u0010@J%\u0010B\u001a\u0002012\u0006\u0010&\u001a\u00020A2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bB\u0010CJ%\u0010E\u001a\u0002012\u0006\u0010&\u001a\u00020D2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u0002012\u0006\u0010&\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ%\u0010K\u001a\u0002012\u0006\u0010&\u001a\u00020J2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bK\u0010LJ%\u0010N\u001a\u0002012\u0006\u0010&\u001a\u00020M2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bN\u0010OJ%\u0010P\u001a\u0002012\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bP\u0010QJ%\u0010R\u001a\u0002012\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bR\u0010QJ\u0019\u0010T\u001a\u0002012\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bT\u0010UJ%\u0010V\u001a\u0002012\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bV\u0010QJ%\u0010X\u001a\u0002012\u0006\u0010&\u001a\u00020W2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\bX\u0010YJ%\u0010[\u001a\u0002012\u0006\u0010&\u001a\u00020Z2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\b[\u0010\\J%\u0010^\u001a\u0002012\u0006\u0010&\u001a\u00020]2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\b^\u0010_J%\u0010a\u001a\u0002012\u0006\u0010&\u001a\u00020`2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u0002012\u0006\u0010&\u001a\u00020cH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u0002012\u0006\u0010&\u001a\u00020fH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u0002012\u0006\u0010&\u001a\u00020iH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u0002012\u0006\u0010&\u001a\u00020lH\u0002¢\u0006\u0004\bm\u0010nJ5\u0010q\u001a\u0002012\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'2\u000e\b\u0002\u0010p\u001a\b\u0012\u0004\u0012\u0002010oH\u0003¢\u0006\u0004\bq\u0010rJ/\u0010u\u001a\u0002012\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'2\b\b\u0002\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u001f\u0010w\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\bw\u0010xJ%\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u0002012\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b{\u0010|J\u001c\u0010\u007f\u001a\u0004\u0018\u00010\u001b2\b\u0010~\u001a\u0004\u0018\u00010}H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0015\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J8\u0010\u0086\u0001\u001a\u0011\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0085\u00012\u0015\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J)\u0010\u0089\u0001\u001a\u0002012\u0007\u0010&\u001a\u00030\u0088\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J)\u0010\u008c\u0001\u001a\u0002012\u0007\u0010&\u001a\u00030\u008b\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J)\u0010\u008f\u0001\u001a\u0002012\u0007\u0010&\u001a\u00030\u008e\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J)\u0010\u0092\u0001\u001a\u0002012\u0007\u0010&\u001a\u00030\u0091\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0012\u0010\u0094\u0001\u001a\u000201H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0096\u0001\u0010/J\"\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001*\u00030\u0097\u00012\u0006\u0010&\u001a\u00020AH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0015\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0002\u0010\u009b\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u009c\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u009d\u0001R\u001d\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\b\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010¡\u0001R\u001d\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0012\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0014\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001d\u0010\u0015\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0015\u0010¥\u0001\u001a\u0006\b¨\u0001\u0010§\u0001R\u001d\u0010\u0016\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0016\u0010¥\u0001\u001a\u0006\b©\u0001\u0010§\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010ª\u0001R\u001d\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u001a\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010®\u0001R\u001d\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u001e\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010²\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010³\u0001R\u001f\u0010´\u0001\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R.\u0010¸\u0001\u001a\u0011\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R'\u0010¼\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R\u0019\u0010½\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010µ\u0001R2\u0010¿\u0001\u001a\u00020\f2\u0007\u0010¾\u0001\u001a\u00020\f8\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010µ\u0001\u001a\u0006\bÀ\u0001\u0010·\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R\u001e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\f0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ç\u0001\u001a\u00030Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R*\u0010É\u0001\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010È\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R,\u0010Î\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R \u0010Ô\u0001\u001a\u00030Æ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010È\u0001\u001a\u0006\bÕ\u0001\u0010Ë\u0001R \u0010Ö\u0001\u001a\u00030Æ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010È\u0001\u001a\u0006\b×\u0001\u0010Ë\u0001R*\u0010Ø\u0001\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bØ\u0001\u0010\u009b\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0005\bÛ\u0001\u0010UR,\u0010Ü\u0001\u001a\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010¹\u0001\u001a\u0006\bÝ\u0001\u0010»\u0001R\u001a\u0010Þ\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010È\u0001R\u001a\u0010ß\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010È\u0001R\u001a\u0010á\u0001\u001a\u00030à\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001a\u0010ã\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010È\u0001R\u001a\u0010ä\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010È\u0001R\u001a\u0010å\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010È\u0001R\u001a\u0010æ\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010È\u0001R*\u0010ç\u0001\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bç\u0001\u0010È\u0001\u001a\u0006\bè\u0001\u0010Ë\u0001\"\u0006\bé\u0001\u0010Í\u0001R*\u0010ê\u0001\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bê\u0001\u0010È\u0001\u001a\u0006\bë\u0001\u0010Ë\u0001\"\u0006\bì\u0001\u0010Í\u0001R*\u0010í\u0001\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bí\u0001\u0010È\u0001\u001a\u0006\bî\u0001\u0010Ë\u0001\"\u0006\bï\u0001\u0010Í\u0001R*\u0010ð\u0001\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bð\u0001\u0010È\u0001\u001a\u0006\bñ\u0001\u0010Ë\u0001\"\u0006\bò\u0001\u0010Í\u0001R*\u0010ó\u0001\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bó\u0001\u0010È\u0001\u001a\u0006\bô\u0001\u0010Ë\u0001\"\u0006\bõ\u0001\u0010Í\u0001R*\u0010ö\u0001\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010È\u0001\u001a\u0006\b÷\u0001\u0010Ë\u0001\"\u0006\bø\u0001\u0010Í\u0001R-\u0010ù\u0001\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030Æ\u00010\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bù\u0001\u0010¹\u0001\u001a\u0006\bú\u0001\u0010»\u0001R.\u0010û\u0001\u001a\u0011\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bû\u0001\u0010¹\u0001\u001a\u0006\bü\u0001\u0010»\u0001R(\u0010ý\u0001\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bý\u0001\u0010®\u0001\u001a\u0005\bþ\u0001\u0010/\"\u0006\bÿ\u0001\u0010\u0080\u0002R\u001c\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R*\u0010\u0085\u0002\u001a\u00030\u0084\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001b\u0010\u008b\u0002\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R*\u0010\u008d\u0002\u001a\u00030\u0084\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u0086\u0002\u001a\u0006\b\u008e\u0002\u0010\u0088\u0002\"\u0006\b\u008f\u0002\u0010\u008a\u0002R\u001b\u0010\u0090\u0002\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u008c\u0002R*\u0010\u0091\u0002\u001a\u00030\u0084\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010\u0086\u0002\u001a\u0006\b\u0092\u0002\u0010\u0088\u0002\"\u0006\b\u0093\u0002\u0010\u008a\u0002R'\u0010\u0095\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0094\u0002\u0012\u0004\u0012\u00020}0\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010¹\u0001¨\u0006\u0098\u0002"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "key", "Lcom/datadog/android/rum/internal/domain/Time;", "eventTime", "", "", "", "initialAttributes", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "viewChangedListener", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "cpuVitalMonitor", "memoryVitalMonitor", "frameRateVitalMonitor", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "featuresContextResolver", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "type", "", "trackFrustrations", "", "sampleRate", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "interactionToNextViewMetricResolver", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "networkSettledMetricResolver", "<init>", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;Lcom/datadog/android/rum/internal/domain/Time;Ljava/util/Map;Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/vitals/VitalMonitor;Lcom/datadog/android/rum/internal/FeaturesContextResolver;Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;ZFLcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/storage/DataWriter;", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "isActive", "()Z", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;", "Lj6g;", "onAddViewLoadingTime", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddViewLoadingTime;Lcom/datadog/android/api/storage/DataWriter;)V", "updateViewLoadingTime", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "onStartView", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;", "onStopView", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopView;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;", "onStartAction", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartAction;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;", "onStartResource", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartResource;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;", "onAddError", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;", "onAddCustomTiming", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddCustomTiming;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;", "onUpdatePerformanceMetric", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$UpdatePerformanceMetric;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopSession;", "onStopSession", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StopSession;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$KeepAlive;", "onKeepAlive", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$KeepAlive;Lcom/datadog/android/api/storage/DataWriter;)V", "delegateEventToChildren", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;)V", "delegateEventToAction", "scope", "updateActiveActionScope", "(Lcom/datadog/android/rum/internal/domain/scope/RumScope;)V", "delegateEventToResources", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;", "onResourceSent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceSent;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;", "onActionSent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionSent;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;", "onLongTaskSent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskSent;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;", "onErrorSent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorSent;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;", "onResourceDropped", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ResourceDropped;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;", "onActionDropped", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ActionDropped;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;", "onErrorDropped", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ErrorDropped;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;", "onLongTaskDropped", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$LongTaskDropped;)V", "Lkotlin/Function0;", "sideEffect", "stopScope", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;Lgu5;)V", "Lcom/datadog/android/api/storage/EventType;", "eventType", "sendViewUpdate", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/api/storage/EventType;)V", "updateGlobalAttributes", "(Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)V", "resolveGlobalAttributes", "(Lcom/datadog/android/core/InternalSdkCore;)Ljava/util/Map;", "resolveViewDuration", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;)V", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "refreshRateInfo", "resolveRefreshRateInfo", "(Lcom/datadog/android/rum/internal/vitals/VitalInfo;)Ljava/lang/Boolean;", "Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "resolveCustomTimings", "()Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "addExtraAttributes", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;", "onApplicationStarted", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$ApplicationStarted;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;", "onAddLongTask", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddLongTask;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;", "onAddFeatureFlagEvaluation", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluation;Lcom/datadog/android/api/storage/DataWriter;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluations;", "onAddFeatureFlagEvaluations", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddFeatureFlagEvaluations;Lcom/datadog/android/api/storage/DataWriter;)V", "sendViewChanged", "()V", "isViewComplete", "Lcom/datadog/android/rum/model/ErrorEvent$Category$Companion;", "Lcom/datadog/android/rum/model/ErrorEvent$Category;", "tryFrom", "(Lcom/datadog/android/rum/model/ErrorEvent$Category$Companion;Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$AddError;)Lcom/datadog/android/rum/model/ErrorEvent$Category;", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "getKey$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getCpuVitalMonitor$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "getMemoryVitalMonitor$dd_sdk_android_rum_release", "getFrameRateVitalMonitor$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "getType$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "Z", "F", "getSampleRate$dd_sdk_android_rum_release", "()F", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "url", "Ljava/lang/String;", "getUrl$dd_sdk_android_rum_release", "()Ljava/lang/String;", "eventAttributes", "Ljava/util/Map;", "getEventAttributes$dd_sdk_android_rum_release", "()Ljava/util/Map;", "globalAttributes", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "value", RumEventMeta.VIEW_ID_KEY, "getViewId$dd_sdk_android_rum_release", "setViewId$dd_sdk_android_rum_release", "(Ljava/lang/String;)V", "", "oldViewIds", "Ljava/util/Set;", "", "startedNanos", "J", "stoppedNanos", "getStoppedNanos$dd_sdk_android_rum_release", "()J", "setStoppedNanos$dd_sdk_android_rum_release", "(J)V", "viewLoadingTime", "Ljava/lang/Long;", "getViewLoadingTime$dd_sdk_android_rum_release", "()Ljava/lang/Long;", "setViewLoadingTime$dd_sdk_android_rum_release", "(Ljava/lang/Long;)V", "serverTimeOffsetInMs", "getServerTimeOffsetInMs$dd_sdk_android_rum_release", "eventTimestamp", "getEventTimestamp$dd_sdk_android_rum_release", "activeActionScope", "getActiveActionScope$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "setActiveActionScope$dd_sdk_android_rum_release", "activeResourceScopes", "getActiveResourceScopes$dd_sdk_android_rum_release", "resourceCount", "actionCount", "", "frustrationCount", "I", "errorCount", "crashCount", "longTaskCount", "frozenFrameCount", "pendingResourceCount", "getPendingResourceCount$dd_sdk_android_rum_release", "setPendingResourceCount$dd_sdk_android_rum_release", "pendingActionCount", "getPendingActionCount$dd_sdk_android_rum_release", "setPendingActionCount$dd_sdk_android_rum_release", "pendingErrorCount", "getPendingErrorCount$dd_sdk_android_rum_release", "setPendingErrorCount$dd_sdk_android_rum_release", "pendingLongTaskCount", "getPendingLongTaskCount$dd_sdk_android_rum_release", "setPendingLongTaskCount$dd_sdk_android_rum_release", "pendingFrozenFrameCount", "getPendingFrozenFrameCount$dd_sdk_android_rum_release", "setPendingFrozenFrameCount$dd_sdk_android_rum_release", "version", "getVersion$dd_sdk_android_rum_release", "setVersion$dd_sdk_android_rum_release", "customTimings", "getCustomTimings$dd_sdk_android_rum_release", "featureFlags", "getFeatureFlags$dd_sdk_android_rum_release", "stopped", "getStopped$dd_sdk_android_rum_release", "setStopped$dd_sdk_android_rum_release", "(Z)V", "", "cpuTicks", "Ljava/lang/Double;", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", "cpuVitalListener", "Lcom/datadog/android/rum/internal/vitals/VitalListener;", "getCpuVitalListener$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/vitals/VitalListener;", "setCpuVitalListener$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/internal/vitals/VitalListener;)V", "lastMemoryInfo", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "memoryVitalListener", "getMemoryVitalListener$dd_sdk_android_rum_release", "setMemoryVitalListener$dd_sdk_android_rum_release", "lastFrameRateInfo", "frameRateVitalListener", "getFrameRateVitalListener$dd_sdk_android_rum_release", "setFrameRateVitalListener$dd_sdk_android_rum_release", "Lcom/datadog/android/rum/RumPerformanceMetric;", "performanceMetrics", "Companion", "RumViewType", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class RumViewScope implements RumScope {
    public static final String ACTION_DROPPED_WARNING = "RUM Action (%s on %s) was dropped, because another action is still active for the same view";
    public static final String ADDING_VIEW_LOADING_TIME_DEBUG_MESSAGE_FORMAT = "View loading time %dns added to the view %s";
    public static final String NEGATIVE_DURATION_WARNING_MESSAGE = "The computed duration for the view: %s was negative. In order to keep the view we forced it to 1ns.";
    public static final String OVERWRITING_VIEW_LOADING_TIME_WARNING_MESSAGE_FORMAT = "View loading time already exists for the view %s. Replacing the existing %d ns view loading time with the new %d ns loading time.";
    public static final String RUM_CONTEXT_UPDATE_IGNORED_AT_ACTION_UPDATE_MESSAGE = "Trying to update active action in the global RUM context, but the context doesn't reference this view.";
    public static final String RUM_CONTEXT_UPDATE_IGNORED_AT_STOP_VIEW_MESSAGE = "Trying to update global RUM context when StopView event arrived, but the context doesn't reference this view.";
    public static final int SLOW_RENDERED_THRESHOLD_FPS = 55;
    public static final String ZERO_DURATION_WARNING_MESSAGE = "The computed duration for the view: %s was 0. In order to keep the view we forced it to 1ns.";
    private long actionCount;
    private RumScope activeActionScope;
    private final Map<Object, RumScope> activeResourceScopes;
    private Double cpuTicks;
    private VitalListener cpuVitalListener;
    private final VitalMonitor cpuVitalMonitor;
    private long crashCount;
    private final Map<String, Long> customTimings;
    private long errorCount;
    private final Map<String, Object> eventAttributes;
    private final long eventTimestamp;
    private final Map<String, Object> featureFlags;
    private final FeaturesContextResolver featuresContextResolver;
    private final FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private VitalListener frameRateVitalListener;
    private final VitalMonitor frameRateVitalMonitor;
    private long frozenFrameCount;
    private int frustrationCount;
    private Map<String, ? extends Object> globalAttributes;
    private final InteractionToNextViewMetricResolver interactionToNextViewMetricResolver;
    private final RumScopeKey key;
    private VitalInfo lastFrameRateInfo;
    private VitalInfo lastMemoryInfo;
    private long longTaskCount;
    private VitalListener memoryVitalListener;
    private final VitalMonitor memoryVitalMonitor;
    private final NetworkSettledMetricResolver networkSettledMetricResolver;
    private final Set<String> oldViewIds;
    private final RumScope parentScope;
    private long pendingActionCount;
    private long pendingErrorCount;
    private long pendingFrozenFrameCount;
    private long pendingLongTaskCount;
    private long pendingResourceCount;
    private Map<RumPerformanceMetric, VitalInfo> performanceMetrics;
    private long resourceCount;
    private final float sampleRate;
    private final InternalSdkCore sdkCore;
    private final long serverTimeOffsetInMs;
    private final SessionMetricDispatcher sessionEndedMetricDispatcher;
    private String sessionId;
    private final long startedNanos;
    private boolean stopped;
    private long stoppedNanos;
    private final boolean trackFrustrations;
    private final RumViewType type;
    private final String url;
    private long version;
    private final RumViewChangedListener viewChangedListener;
    private String viewId;
    private Long viewLoadingTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ONE_SECOND_NS = 1000000000;
    private static final long FROZEN_FRAME_THRESHOLD_NS = 700000000;

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05961 extends mj8 implements Function1<DatadogContext, Object> {
        final /* synthetic */ String $errorFingerprint;
        final /* synthetic */ String $errorType;
        final /* synthetic */ RumRawEvent.AddError $event;
        final /* synthetic */ Map<String, Object> $eventFeatureFlags;
        final /* synthetic */ boolean $isFatal;
        final /* synthetic */ String $message;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ Map<String, Object> $updatedAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05961(RumContext rumContext, RumRawEvent.AddError addError, Map<String, Object> map, String str, boolean z, String str2, String str3, Map<String, Object> map2) {
            super(1);
            this.$rumContext = rumContext;
            this.$event = addError;
            this.$eventFeatureFlags = map;
            this.$message = str;
            this.$isFatal = z;
            this.$errorFingerprint = str2;
            this.$errorType = str3;
            this.$updatedAttributes = map2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(DatadogContext datadogContext) {
            String str;
            String syntheticsResultId;
            datadogContext.getClass();
            UserInfo userInfo = datadogContext.getUserInfo();
            FeaturesContextResolver featuresContextResolver = RumViewScope.this.featuresContextResolver;
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            boolean zResolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
            String syntheticsTestId = this.$rumContext.getSyntheticsTestId();
            ErrorEvent.Synthetics synthetics = (syntheticsTestId == null || zve.U(syntheticsTestId) || (syntheticsResultId = this.$rumContext.getSyntheticsResultId()) == null || zve.U(syntheticsResultId)) ? null : new ErrorEvent.Synthetics(this.$rumContext.getSyntheticsTestId(), this.$rumContext.getSyntheticsResultId(), null, 4, null);
            ErrorEvent.ErrorEventSessionType errorEventSessionType = synthetics == null ? ErrorEvent.ErrorEventSessionType.USER : ErrorEvent.ErrorEventSessionType.SYNTHETICS;
            String appBuildId = datadogContext.getAppBuildId();
            long serverTimeOffsetInMs = RumViewScope.this.getServerTimeOffsetInMs() + this.$event.getEventTime().getTimestamp();
            ErrorEvent.Context context = new ErrorEvent.Context(this.$eventFeatureFlags);
            ErrorEvent.ErrorSource schemaSource = RumEventExtKt.toSchemaSource(this.$event.getSource());
            String stacktrace = this.$event.getStacktrace();
            if (stacktrace != null) {
                str = stacktrace;
            } else {
                Throwable throwable = this.$event.getThrowable();
                if (throwable != null) {
                    stacktrace = ThrowableExtKt.loggableStackTrace(throwable);
                    str = stacktrace;
                } else {
                    str = null;
                }
            }
            ErrorEvent.SourceType schemaSourceType = RumEventExtKt.toSchemaSourceType(this.$event.getSourceType());
            ErrorEvent.Category categoryTryFrom = RumViewScope.this.tryFrom(ErrorEvent.Category.INSTANCE, this.$event);
            List<ThreadDump> threads = this.$event.getThreads();
            ArrayList arrayList = new ArrayList(t92.r0(threads, 10));
            for (ThreadDump threadDump : threads) {
                arrayList.add(new ErrorEvent.Thread(threadDump.getName(), threadDump.getCrashed(), threadDump.getStack(), threadDump.getState()));
                userInfo = userInfo;
            }
            UserInfo userInfo2 = userInfo;
            ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
            Long timeSinceAppStartNs = this.$event.getTimeSinceAppStartNs();
            ErrorEvent.Error error = new ErrorEvent.Error(null, this.$message, schemaSource, str, null, Boolean.valueOf(this.$isFatal), this.$errorFingerprint, this.$errorType, categoryTryFrom, null, null, schemaSourceType, null, arrayList2, null, null, null, null, timeSinceAppStartNs != null ? Long.valueOf(timeSinceAppStartNs.longValue() / 1000000) : null, 251409, null);
            String actionId = this.$rumContext.getActionId();
            ErrorEvent.Action action = actionId != null ? new ErrorEvent.Action(u63.Z(actionId)) : null;
            String viewId2 = this.$rumContext.getViewId();
            String str2 = viewId2 == null ? "" : viewId2;
            String viewName = this.$rumContext.getViewName();
            String viewUrl = this.$rumContext.getViewUrl();
            return new ErrorEvent(serverTimeOffsetInMs, new ErrorEvent.Application(this.$rumContext.getApplicationId()), datadogContext.getService(), datadogContext.getVersion(), null, appBuildId, new ErrorEvent.ErrorEventSession(this.$rumContext.getSessionId(), errorEventSessionType, Boolean.valueOf(zResolveViewHasReplay)), RumEventExtKt.tryFromSource(ErrorEvent.ErrorEventSource.INSTANCE, datadogContext.getSource(), RumViewScope.this.sdkCore.getInternalLogger()), new ErrorEvent.ErrorEventView(str2, null, viewUrl == null ? "" : viewUrl, viewName, null, 18, null), RuntimeUtilsKt.hasUserData(userInfo2) ? new ErrorEvent.Usr(userInfo2.getId(), userInfo2.getName(), userInfo2.getEmail(), null, lc9.i0(userInfo2.getAdditionalProperties()), 8, null) : null, null, RumEventExtKt.toErrorConnectivity(datadogContext.getNetworkInfo()), null, synthetics, null, new ErrorEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null), new ErrorEvent.Device(RumEventExtKt.toErrorSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture()), new ErrorEvent.Dd(new ErrorEvent.DdSession(null, RumEventExtKt.toErrorSessionPrecondition(this.$rumContext.getSessionStartReason()), 1, 0 == true ? 1 : 0), new ErrorEvent.Configuration(Float.valueOf(RumViewScope.this.getSampleRate()), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), null, 4, null), new ErrorEvent.Context(this.$updatedAttributes), action, null, error, null, context, 5264400, null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05971 extends mj8 implements Function1<DatadogContext, Object> {
        final /* synthetic */ RumRawEvent.AddLongTask $event;
        final /* synthetic */ boolean $isFrozenFrame;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ long $timestamp;
        final /* synthetic */ Map<String, Object> $updatedAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05971(RumContext rumContext, long j, RumRawEvent.AddLongTask addLongTask, boolean z, Map<String, Object> map) {
            super(1);
            this.$rumContext = rumContext;
            this.$timestamp = j;
            this.$event = addLongTask;
            this.$isFrozenFrame = z;
            this.$updatedAttributes = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(DatadogContext datadogContext) {
            String syntheticsResultId;
            datadogContext.getClass();
            UserInfo userInfo = datadogContext.getUserInfo();
            FeaturesContextResolver featuresContextResolver = RumViewScope.this.featuresContextResolver;
            String viewId = this.$rumContext.getViewId();
            if (viewId == null) {
                viewId = "";
            }
            boolean zResolveViewHasReplay = featuresContextResolver.resolveViewHasReplay(datadogContext, viewId);
            String syntheticsTestId = this.$rumContext.getSyntheticsTestId();
            LongTaskEvent.Plan plan = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            LongTaskEvent.Synthetics synthetics = (syntheticsTestId == null || zve.U(syntheticsTestId) || (syntheticsResultId = this.$rumContext.getSyntheticsResultId()) == null || zve.U(syntheticsResultId)) ? null : new LongTaskEvent.Synthetics(this.$rumContext.getSyntheticsTestId(), this.$rumContext.getSyntheticsResultId(), null, 4, null);
            LongTaskEvent.LongTaskEventSessionType longTaskEventSessionType = synthetics == null ? LongTaskEvent.LongTaskEventSessionType.USER : LongTaskEvent.LongTaskEventSessionType.SYNTHETICS;
            long durationNs = this.$timestamp - (this.$event.getDurationNs() / 1000000);
            LongTaskEvent.LongTask longTask = new LongTaskEvent.LongTask(null, null, null, this.$event.getDurationNs(), null, null, null, null, Boolean.valueOf(this.$isFrozenFrame), null, 759, null);
            String actionId = this.$rumContext.getActionId();
            LongTaskEvent.Action action = actionId != null ? new LongTaskEvent.Action(u63.Z(actionId)) : null;
            String viewId2 = this.$rumContext.getViewId();
            String str = viewId2 == null ? "" : viewId2;
            String viewName = this.$rumContext.getViewName();
            String viewUrl = this.$rumContext.getViewUrl();
            return new LongTaskEvent(durationNs, new LongTaskEvent.Application(this.$rumContext.getApplicationId()), datadogContext.getService(), datadogContext.getVersion(), null, null, new LongTaskEvent.LongTaskEventSession(this.$rumContext.getSessionId(), longTaskEventSessionType, Boolean.valueOf(zResolveViewHasReplay)), RumEventExtKt.tryFromSource(LongTaskEvent.LongTaskEventSource.INSTANCE, datadogContext.getSource(), RumViewScope.this.sdkCore.getInternalLogger()), new LongTaskEvent.LongTaskEventView(str, null, viewUrl == null ? "" : viewUrl, viewName, 2, null), RuntimeUtilsKt.hasUserData(userInfo) ? new LongTaskEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), null, lc9.i0(userInfo.getAdditionalProperties()), 8, null) : null, null, RumEventExtKt.toLongTaskConnectivity(datadogContext.getNetworkInfo()), null, synthetics, null, new LongTaskEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null), new LongTaskEvent.Device(RumEventExtKt.toLongTaskSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture()), new LongTaskEvent.Dd(new LongTaskEvent.DdSession(plan, RumEventExtKt.toLongTaskSessionPrecondition(this.$rumContext.getSessionStartReason()), 1, b3 == true ? 1 : 0), new LongTaskEvent.Configuration(Float.valueOf(RumViewScope.this.getSampleRate()), b2 == true ? 1 : 0, 2, b == true ? 1 : 0), null, null, 12, null), new LongTaskEvent.Context(this.$updatedAttributes), action, null, longTask, 1070128, null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$onApplicationStarted$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05981 extends mj8 implements Function1<DatadogContext, Object> {
        final /* synthetic */ RumRawEvent.ApplicationStarted $event;
        final /* synthetic */ Map<String, Object> $localCopyOfGlobalAttributes;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ RumViewScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05981(RumContext rumContext, RumViewScope rumViewScope, RumRawEvent.ApplicationStarted applicationStarted, Map<String, Object> map) {
            super(1);
            this.$rumContext = rumContext;
            this.this$0 = rumViewScope;
            this.$event = applicationStarted;
            this.$localCopyOfGlobalAttributes = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(DatadogContext datadogContext) {
            String syntheticsResultId;
            datadogContext.getClass();
            UserInfo userInfo = datadogContext.getUserInfo();
            String syntheticsTestId = this.$rumContext.getSyntheticsTestId();
            ActionEvent.Synthetics synthetics = (syntheticsTestId == null || zve.U(syntheticsTestId) || (syntheticsResultId = this.$rumContext.getSyntheticsResultId()) == null || zve.U(syntheticsResultId)) ? null : new ActionEvent.Synthetics(this.$rumContext.getSyntheticsTestId(), this.$rumContext.getSyntheticsResultId(), null, 4, null);
            ActionEvent.ActionEventSessionType actionEventSessionType = synthetics == null ? ActionEvent.ActionEventSessionType.USER : ActionEvent.ActionEventSessionType.SYNTHETICS;
            long eventTimestamp = this.this$0.getEventTimestamp();
            ActionEvent.ActionEventAction actionEventAction = new ActionEvent.ActionEventAction(ActionEvent.ActionEventActionType.APPLICATION_START, UUID.randomUUID().toString(), Long.valueOf(this.$event.getApplicationStartupNanos()), null, null, new ActionEvent.Error(0L), new ActionEvent.Crash(0L), new ActionEvent.LongTask(0L), new ActionEvent.Resource(0L), 24, null);
            String viewId = this.$rumContext.getViewId();
            String str = viewId == null ? "" : viewId;
            String viewName = this.$rumContext.getViewName();
            String viewUrl = this.$rumContext.getViewUrl();
            ActionEvent.ActionEventView actionEventView = new ActionEvent.ActionEventView(str, null, viewUrl == null ? "" : viewUrl, viewName, null, 18, null);
            ActionEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ActionEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), null, lc9.i0(userInfo.getAdditionalProperties()), 8, null) : null;
            return new ActionEvent(eventTimestamp, new ActionEvent.Application(this.$rumContext.getApplicationId()), datadogContext.getService(), datadogContext.getVersion(), null, null, new ActionEvent.ActionEventSession(this.$rumContext.getSessionId(), actionEventSessionType, Boolean.FALSE), RumEventExtKt.tryFromSource(ActionEvent.ActionEventSource.INSTANCE, datadogContext.getSource(), this.this$0.sdkCore.getInternalLogger()), actionEventView, usr, null, RumEventExtKt.toActionConnectivity(datadogContext.getNetworkInfo()), null, synthetics, null, new ActionEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null), new ActionEvent.Device(RumEventExtKt.toActionSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture()), new ActionEvent.Dd(new ActionEvent.DdSession(null, RumEventExtKt.toActionSessionPrecondition(this.$rumContext.getSessionStartReason()), 1, null), new ActionEvent.Configuration(Float.valueOf(this.this$0.getSampleRate()), null, 2, null), null, null, 12, null), new ActionEvent.Context(this.$localCopyOfGlobalAttributes), null, actionEventAction, 545840, null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStartAction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05991 extends mj8 implements gu5<String> {
        final /* synthetic */ RumRawEvent.StartAction $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05991(RumRawEvent.StartAction startAction) {
            super(0);
            this.$event = startAction;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumViewScope.ACTION_DROPPED_WARNING, Arrays.copyOf(new Object[]{this.$event.getType(), this.$event.getName()}, 2));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$resolveViewDuration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06011 extends mj8 implements gu5<String> {
        public C06011() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumViewScope.ZERO_DURATION_WARNING_MESSAGE, Arrays.copyOf(new Object[]{RumViewScope.this.getKey().getName()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$resolveViewDuration$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumViewScope.NEGATIVE_DURATION_WARNING_MESSAGE, Arrays.copyOf(new Object[]{RumViewScope.this.getKey().getName()}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06051 extends mj8 implements gu5<String> {
        final /* synthetic */ String $viewName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06051(String str) {
            super(0);
            this.$viewName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumViewScope.ADDING_VIEW_LOADING_TIME_DEBUG_MESSAGE_FORMAT, Arrays.copyOf(new Object[]{RumViewScope.this.getViewLoadingTime(), this.$viewName}, 2));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06062 extends mj8 implements gu5<InternalTelemetryEvent.ApiUsage> {
        public static final C06062 INSTANCE = new C06062();

        public C06062() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final InternalTelemetryEvent.ApiUsage invoke() {
            return new InternalTelemetryEvent.ApiUsage.AddViewLoadingTime(false, false, false, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ long $newLoadingTime;
        final /* synthetic */ Long $previousViewLoadingTime;
        final /* synthetic */ String $viewName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, Long l, long j) {
            super(0);
            this.$viewName = str;
            this.$previousViewLoadingTime = l;
            this.$newLoadingTime = j;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, RumViewScope.OVERWRITING_VIEW_LOADING_TIME_WARNING_MESSAGE_FORMAT, Arrays.copyOf(new Object[]{this.$viewName, this.$previousViewLoadingTime, Long.valueOf(this.$newLoadingTime)}, 3));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass4 extends mj8 implements gu5<InternalTelemetryEvent.ApiUsage> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final InternalTelemetryEvent.ApiUsage invoke() {
            return new InternalTelemetryEvent.ApiUsage.AddViewLoadingTime(true, false, false, null, 8, null);
        }
    }

    public RumViewScope(RumScope rumScope, InternalSdkCore internalSdkCore, SessionMetricDispatcher sessionMetricDispatcher, RumScopeKey rumScopeKey, Time time, Map<String, ? extends Object> map, RumViewChangedListener rumViewChangedListener, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, FeaturesContextResolver featuresContextResolver, RumViewType rumViewType, boolean z, float f, InteractionToNextViewMetricResolver interactionToNextViewMetricResolver, NetworkSettledMetricResolver networkSettledMetricResolver) {
        rumScope.getClass();
        internalSdkCore.getClass();
        sessionMetricDispatcher.getClass();
        rumScopeKey.getClass();
        time.getClass();
        map.getClass();
        firstPartyHostHeaderTypeResolver.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        featuresContextResolver.getClass();
        rumViewType.getClass();
        interactionToNextViewMetricResolver.getClass();
        networkSettledMetricResolver.getClass();
        this.parentScope = rumScope;
        this.sdkCore = internalSdkCore;
        this.sessionEndedMetricDispatcher = sessionMetricDispatcher;
        this.key = rumScopeKey;
        this.viewChangedListener = rumViewChangedListener;
        this.firstPartyHostHeaderTypeResolver = firstPartyHostHeaderTypeResolver;
        this.cpuVitalMonitor = vitalMonitor;
        this.memoryVitalMonitor = vitalMonitor2;
        this.frameRateVitalMonitor = vitalMonitor3;
        this.featuresContextResolver = featuresContextResolver;
        this.type = rumViewType;
        this.trackFrustrations = z;
        this.sampleRate = f;
        this.interactionToNextViewMetricResolver = interactionToNextViewMetricResolver;
        this.networkSettledMetricResolver = networkSettledMetricResolver;
        this.url = wve.H(rumScopeKey.getUrl(), JwtParser.SEPARATOR_CHAR, '/');
        this.eventAttributes = new LinkedHashMap(map);
        this.globalAttributes = resolveGlobalAttributes(internalSdkCore);
        this.sessionId = rumScope.getInitialContext().getSessionId();
        this.viewId = t40.h();
        this.oldViewIds = new LinkedHashSet();
        this.startedNanos = time.getNanoTime();
        this.stoppedNanos = time.getNanoTime();
        long serverTimeOffsetMs = internalSdkCore.getTime().getServerTimeOffsetMs();
        this.serverTimeOffsetInMs = serverTimeOffsetMs;
        this.eventTimestamp = time.getTimestamp() + serverTimeOffsetMs;
        this.activeResourceScopes = new LinkedHashMap();
        this.version = 1L;
        this.customTimings = new LinkedHashMap();
        this.featureFlags = new LinkedHashMap();
        this.cpuVitalListener = new VitalListener() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$cpuVitalListener$1
            private double initialTickCount = Double.NaN;

            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public void onVitalUpdate(VitalInfo info) {
                info.getClass();
                if (Double.isNaN(this.initialTickCount)) {
                    this.initialTickCount = info.getMaxValue();
                } else {
                    this.this$0.cpuTicks = Double.valueOf(info.getMaxValue() - this.initialTickCount);
                }
            }
        };
        this.memoryVitalListener = new VitalListener() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$memoryVitalListener$1
            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public void onVitalUpdate(VitalInfo info) {
                info.getClass();
                this.this$0.lastMemoryInfo = info;
            }
        };
        this.frameRateVitalListener = new VitalListener() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$frameRateVitalListener$1
            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public void onVitalUpdate(VitalInfo info) {
                info.getClass();
                this.this$0.lastFrameRateInfo = info;
            }
        };
        this.performanceMetrics = new LinkedHashMap();
        internalSdkCore.updateFeatureContext("rum", new AnonymousClass1());
        vitalMonitor.register(this.cpuVitalListener);
        vitalMonitor2.register(this.memoryVitalListener);
        vitalMonitor3.register(this.frameRateVitalListener);
        RumContext rumContext = rumScope.getInitialContext();
        if (rumContext.getSyntheticsTestId() != null) {
            Log.i("DatadogSynthetics", "_dd.application.id=" + rumContext.getApplicationId());
            Log.i("DatadogSynthetics", "_dd.session.id=" + rumContext.getSessionId());
            Log.i("DatadogSynthetics", "_dd.view.id=" + this.viewId);
        }
        networkSettledMetricResolver.viewWasCreated(time.getNanoTime());
        interactionToNextViewMetricResolver.onViewCreated(this.viewId, time.getNanoTime());
    }

    private final Map<String, Object> addExtraAttributes(Map<String, ? extends Object> attributes) {
        LinkedHashMap linkedHashMapI0 = lc9.i0(attributes);
        linkedHashMapI0.putAll(this.globalAttributes);
        return linkedHashMapI0;
    }

    private final void delegateEventToAction(RumRawEvent event, DataWriter<Object> writer) {
        RumScope rumScope = this.activeActionScope;
        if (rumScope == null || rumScope.handleEvent(event, writer) != null) {
            return;
        }
        updateActiveActionScope(null);
    }

    private final void delegateEventToChildren(RumRawEvent event, DataWriter<Object> writer) {
        delegateEventToResources(event, writer);
        delegateEventToAction(event, writer);
    }

    private final void delegateEventToResources(RumRawEvent event, DataWriter<Object> writer) {
        Iterator<Map.Entry<Object, RumScope>> it = this.activeResourceScopes.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().handleEvent(event, writer) == null) {
                if ((event instanceof RumRawEvent.StopResourceWithError) || (event instanceof RumRawEvent.StopResourceWithStackTrace)) {
                    this.pendingResourceCount--;
                    this.pendingErrorCount++;
                }
                it.remove();
            }
        }
    }

    private final boolean isViewComplete() {
        return this.stopped && this.activeResourceScopes.isEmpty() && ((this.pendingActionCount + this.pendingResourceCount) + this.pendingErrorCount) + this.pendingLongTaskCount <= 0;
    }

    private final void onActionDropped(RumRawEvent.ActionDropped event) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.pendingActionCount--;
        }
    }

    private final void onActionSent(RumRawEvent.ActionSent event, DataWriter<Object> writer) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.pendingActionCount--;
            this.actionCount++;
            this.frustrationCount = event.getFrustrationCount() + this.frustrationCount;
            this.interactionToNextViewMetricResolver.onActionSent(new InternalInteractionContext(event.getViewId(), event.getType(), event.getEventEndTimestampInNanos()));
            sendViewUpdate$default(this, event, writer, null, 4, null);
        }
    }

    private final void onAddCustomTiming(RumRawEvent.AddCustomTiming event, DataWriter<Object> writer) {
        if (this.stopped) {
            return;
        }
        this.customTimings.put(event.getName(), Long.valueOf(Math.max(event.getEventTime().getNanoTime() - this.startedNanos, 1L)));
        sendViewUpdate$default(this, event, writer, null, 4, null);
    }

    private final void onAddError(RumRawEvent.AddError event, DataWriter<Object> writer) {
        String canonicalName;
        String message;
        delegateEventToChildren(event, writer);
        if (this.stopped) {
            return;
        }
        RumContext rumContext = getInitialContext();
        Map<String, Object> mapAddExtraAttributes = addExtraAttributes(event.getAttributes());
        Object objRemove = mapAddExtraAttributes.remove(RumAttributes.INTERNAL_ERROR_IS_CRASH);
        boolean z = wl7.b(objRemove instanceof Boolean ? (Boolean) objRemove : null, Boolean.TRUE) || event.isFatal();
        Object objRemove2 = mapAddExtraAttributes.remove("_dd.error.fingerprint");
        String str = objRemove2 instanceof String ? (String) objRemove2 : null;
        if (this.crashCount <= 0 || !z) {
            String type = event.getType();
            if (type == null) {
                Throwable throwable = event.getThrowable();
                canonicalName = throwable != null ? throwable.getClass().getCanonicalName() : null;
            } else {
                canonicalName = type;
            }
            Throwable throwable2 = event.getThrowable();
            if (throwable2 == null || (message = throwable2.getMessage()) == null) {
                message = "";
            }
            String message2 = (zve.U(message) || wl7.b(event.getMessage(), message)) ? event.getMessage() : z3.m(event.getMessage(), ": ", message);
            LinkedHashMap linkedHashMapI0 = lc9.i0(this.featureFlags);
            EventType eventType = z ? EventType.CRASH : EventType.DEFAULT;
            WriteOperation writeOperationNewRumEventWriteOperation = SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, writer, eventType, new C05961(rumContext, event, linkedHashMapI0, message2, z, str, canonicalName, mapAddExtraAttributes));
            if (!z) {
                writeOperationNewRumEventWriteOperation.onError(new RumViewScope$onAddError$2$1(rumContext));
                writeOperationNewRumEventWriteOperation.onSuccess(new RumViewScope$onAddError$2$2(rumContext));
            }
            writeOperationNewRumEventWriteOperation.submit();
            if (!z) {
                this.pendingErrorCount++;
                return;
            }
            this.errorCount++;
            this.crashCount++;
            sendViewUpdate(event, writer, eventType);
        }
    }

    private final void onAddFeatureFlagEvaluation(RumRawEvent.AddFeatureFlagEvaluation event, DataWriter<Object> writer) {
        if (this.stopped || wl7.b(event.getValue(), this.featureFlags.get(event.getName()))) {
            return;
        }
        this.featureFlags.put(event.getName(), event.getValue());
        sendViewUpdate$default(this, event, writer, null, 4, null);
        sendViewChanged();
    }

    private final void onAddFeatureFlagEvaluations(RumRawEvent.AddFeatureFlagEvaluations event, DataWriter<Object> writer) {
        if (this.stopped) {
            return;
        }
        boolean z = false;
        for (Map.Entry<String, Object> entry : event.getFeatureFlags().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!wl7.b(value, this.featureFlags.get(key))) {
                this.featureFlags.put(key, value);
                z = true;
            }
        }
        if (z) {
            sendViewUpdate$default(this, event, writer, null, 4, null);
            sendViewChanged();
        }
    }

    private final void onAddLongTask(RumRawEvent.AddLongTask event, DataWriter<Object> writer) {
        delegateEventToChildren(event, writer);
        if (this.stopped) {
            return;
        }
        RumContext rumContext = getInitialContext();
        Map<String, Object> mapAddExtraAttributes = addExtraAttributes(j6.c(RumAttributes.LONG_TASK_TARGET, event.getTarget()));
        long timestamp = event.getEventTime().getTimestamp() + this.serverTimeOffsetInMs;
        boolean z = event.getDurationNs() > FROZEN_FRAME_THRESHOLD_NS;
        WriteOperation writeOperationNewRumEventWriteOperation$default = SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, writer, null, new C05971(rumContext, timestamp, event, z, mapAddExtraAttributes), 2, null);
        StorageEvent storageEvent = z ? StorageEvent.FrozenFrame.INSTANCE : StorageEvent.LongTask.INSTANCE;
        writeOperationNewRumEventWriteOperation$default.onError(new RumViewScope$onAddLongTask$2$1(rumContext, storageEvent));
        writeOperationNewRumEventWriteOperation$default.onSuccess(new RumViewScope$onAddLongTask$2$2(rumContext, storageEvent));
        writeOperationNewRumEventWriteOperation$default.submit();
        this.pendingLongTaskCount++;
        if (z) {
            this.pendingFrozenFrameCount++;
        }
    }

    private final void onAddViewLoadingTime(RumRawEvent.AddViewLoadingTime event, DataWriter<Object> writer) {
        if (this.stopped) {
            return;
        }
        if (this.viewLoadingTime == null || event.getOverwrite()) {
            updateViewLoadingTime(event, writer);
        }
    }

    private final void onApplicationStarted(RumRawEvent.ApplicationStarted event, DataWriter<Object> writer) {
        this.pendingActionCount++;
        RumContext rumContext = getInitialContext();
        WriteOperation writeOperationNewRumEventWriteOperation$default = SdkCoreExtKt.newRumEventWriteOperation$default(this.sdkCore, writer, null, new C05981(rumContext, this, event, lc9.i0(this.globalAttributes)), 2, null);
        StorageEvent.Action action = new StorageEvent.Action(0, ActionEvent.ActionEventActionType.APPLICATION_START, event.getApplicationStartupNanos());
        writeOperationNewRumEventWriteOperation$default.onError(new RumViewScope$onApplicationStarted$2$1(rumContext, action));
        writeOperationNewRumEventWriteOperation$default.onSuccess(new RumViewScope$onApplicationStarted$2$2(rumContext, action));
        writeOperationNewRumEventWriteOperation$default.submit();
    }

    private final void onErrorDropped(RumRawEvent.ErrorDropped event) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.pendingErrorCount--;
            if (event.getResourceId() != null) {
                this.networkSettledMetricResolver.resourceWasDropped(event.getResourceId());
            }
        }
    }

    private final void onErrorSent(RumRawEvent.ErrorSent event, DataWriter<Object> writer) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.pendingErrorCount--;
            this.errorCount++;
            if (event.getResourceId() != null && event.getResourceEndTimestampInNanos() != null) {
                this.networkSettledMetricResolver.resourceWasStopped(new InternalResourceContext(event.getResourceId(), event.getResourceEndTimestampInNanos().longValue()));
            }
            sendViewUpdate$default(this, event, writer, null, 4, null);
        }
    }

    private final void onKeepAlive(RumRawEvent.KeepAlive event, DataWriter<Object> writer) {
        delegateEventToChildren(event, writer);
        if (this.stopped) {
            return;
        }
        sendViewUpdate$default(this, event, writer, null, 4, null);
    }

    private final void onLongTaskDropped(RumRawEvent.LongTaskDropped event) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.pendingLongTaskCount--;
            if (event.isFrozenFrame()) {
                this.pendingFrozenFrameCount--;
            }
        }
    }

    private final void onLongTaskSent(RumRawEvent.LongTaskSent event, DataWriter<Object> writer) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.pendingLongTaskCount--;
            this.longTaskCount++;
            if (event.isFrozenFrame()) {
                this.pendingFrozenFrameCount--;
                this.frozenFrameCount++;
            }
            sendViewUpdate$default(this, event, writer, null, 4, null);
        }
    }

    private final void onResourceDropped(RumRawEvent.ResourceDropped event) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.networkSettledMetricResolver.resourceWasDropped(event.getResourceId());
            this.pendingResourceCount--;
        }
    }

    private final void onResourceSent(RumRawEvent.ResourceSent event, DataWriter<Object> writer) {
        if (wl7.b(event.getViewId(), this.viewId) || this.oldViewIds.contains(event.getViewId())) {
            this.pendingResourceCount--;
            this.resourceCount++;
            this.networkSettledMetricResolver.resourceWasStopped(new InternalResourceContext(event.getResourceId(), event.getResourceEndTimestampInNanos()));
            sendViewUpdate$default(this, event, writer, null, 4, null);
        }
    }

    private final void onStartAction(RumRawEvent.StartAction event, DataWriter<Object> writer) {
        delegateEventToChildren(event, writer);
        if (this.stopped) {
            return;
        }
        if (this.activeActionScope == null) {
            updateActiveActionScope(RumActionScope.INSTANCE.fromEvent(this, this.sdkCore, event, this.serverTimeOffsetInMs, this.featuresContextResolver, this.trackFrustrations, this.sampleRate));
            this.pendingActionCount++;
        } else {
            if (event.getType() != RumActionType.CUSTOM || event.getWaitForStop()) {
                InternalLogger.DefaultImpls.log$default(this.sdkCore.getInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05991(event), (Throwable) null, false, (Map) null, 56, (Object) null);
                return;
            }
            RumScope rumScopeFromEvent = RumActionScope.INSTANCE.fromEvent(this, this.sdkCore, event, this.serverTimeOffsetInMs, this.featuresContextResolver, this.trackFrustrations, this.sampleRate);
            this.pendingActionCount++;
            rumScopeFromEvent.handleEvent(new RumRawEvent.SendCustomActionNow(null, 1, null), writer);
        }
    }

    private final void onStartResource(RumRawEvent.StartResource event, DataWriter<Object> writer) {
        delegateEventToChildren(event, writer);
        if (this.stopped) {
            return;
        }
        this.activeResourceScopes.put(event.getKey(), RumResourceScope.INSTANCE.fromEvent(this, this.sdkCore, RumRawEvent.StartResource.copy$default(event, null, null, null, addExtraAttributes(event.getAttributes()), null, 23, null), this.firstPartyHostHeaderTypeResolver, this.serverTimeOffsetInMs, this.featuresContextResolver, this.sampleRate, this.networkSettledMetricResolver));
        this.pendingResourceCount++;
    }

    private final void onStartView(RumRawEvent.StartView event, DataWriter<Object> writer) {
        stopScope$default(this, event, writer, null, 4, null);
    }

    private final void onStopSession(RumRawEvent.StopSession event, DataWriter<Object> writer) {
        stopScope$default(this, event, writer, null, 4, null);
    }

    private final void onStopView(RumRawEvent.StopView event, DataWriter<Object> writer) {
        delegateEventToChildren(event, writer);
        if (!wl7.b(event.getKey().getId(), this.key.getId()) || this.stopped) {
            return;
        }
        stopScope(event, writer, new C06001(event));
    }

    private final void onUpdatePerformanceMetric(RumRawEvent.UpdatePerformanceMetric event) {
        if (this.stopped) {
            return;
        }
        double value = event.getValue();
        VitalInfo empty = this.performanceMetrics.get(event.getMetric());
        if (empty == null) {
            empty = VitalInfo.INSTANCE.getEMPTY();
        }
        int sampleCount = empty.getSampleCount() + 1;
        this.performanceMetrics.put(event.getMetric(), new VitalInfo(sampleCount, Math.min(value, empty.getMinValue()), Math.max(value, empty.getMaxValue()), ((empty.getMeanValue() * ((double) empty.getSampleCount())) + value) / ((double) sampleCount)));
    }

    private final ViewEvent.CustomTimings resolveCustomTimings() {
        if (this.customTimings.isEmpty()) {
            return null;
        }
        return new ViewEvent.CustomTimings(new LinkedHashMap(this.customTimings));
    }

    private final Map<String, Object> resolveGlobalAttributes(InternalSdkCore sdkCore) {
        return lc9.g0(GlobalRumMonitor.get(sdkCore).getAttributes());
    }

    private final Boolean resolveRefreshRateInfo(VitalInfo refreshRateInfo) {
        if (refreshRateInfo == null) {
            return null;
        }
        return Boolean.valueOf(refreshRateInfo.getMeanValue() < 55.0d);
    }

    private final void resolveViewDuration(RumRawEvent event) {
        long nanoTime = event.getEventTime().getNanoTime();
        this.stoppedNanos = nanoTime;
        long j = nanoTime - this.startedNanos;
        if (j != 0) {
            if (j < 0) {
                this.sdkCore.getInternalLogger().log(InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5<String>) new AnonymousClass2(), (Throwable) null, false, lc9.a0(new Pair("view.start_ns", Long.valueOf(this.startedNanos)), new Pair("view.end_ns", Long.valueOf(event.getEventTime().getNanoTime())), new Pair("view.name", this.key.getName())));
                this.stoppedNanos = this.startedNanos + 1;
                return;
            }
            return;
        }
        if (this.type != RumViewType.BACKGROUND || !(event instanceof RumRawEvent.AddError) || !((RumRawEvent.AddError) event).isFatal()) {
            this.sdkCore.getInternalLogger().log(InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5<String>) new C06011(), (Throwable) null, false, j6.c("view.name", this.key.getName()));
        }
        this.stoppedNanos = this.startedNanos + 1;
    }

    private final void sendViewChanged() {
        RumViewChangedListener rumViewChangedListener = this.viewChangedListener;
        if (rumViewChangedListener != null) {
            rumViewChangedListener.onViewChanged(new RumViewInfo(this.key, this.eventAttributes, getIsActive()));
        }
    }

    private final void sendViewUpdate(RumRawEvent event, DataWriter<Object> writer, EventType eventType) {
        boolean zIsViewComplete = isViewComplete();
        Long lResolveMetric = this.networkSettledMetricResolver.resolveMetric();
        Long lResolveMetric2 = this.interactionToNextViewMetricResolver.resolveMetric(this.viewId);
        long j = this.version + 1;
        this.version = j;
        long j2 = this.actionCount;
        long j3 = this.errorCount;
        long j4 = this.resourceCount;
        long j5 = this.crashCount;
        long j6 = this.longTaskCount;
        long j7 = this.frozenFrameCount;
        Double d = this.cpuTicks;
        int i = this.frustrationCount;
        VitalInfo vitalInfo = this.performanceMetrics.get(RumPerformanceMetric.FLUTTER_BUILD_TIME);
        ViewEvent.FlutterBuildTime performanceMetric = vitalInfo != null ? INSTANCE.toPerformanceMetric(vitalInfo) : null;
        VitalInfo vitalInfo2 = this.performanceMetrics.get(RumPerformanceMetric.FLUTTER_RASTER_TIME);
        ViewEvent.FlutterBuildTime performanceMetric2 = vitalInfo2 != null ? INSTANCE.toPerformanceMetric(vitalInfo2) : null;
        VitalInfo vitalInfo3 = this.performanceMetrics.get(RumPerformanceMetric.JS_FRAME_TIME);
        ViewEvent.FlutterBuildTime inversePerformanceMetric = vitalInfo3 != null ? INSTANCE.toInversePerformanceMetric(vitalInfo3) : null;
        if (!this.stopped) {
            resolveViewDuration(event);
        }
        long j8 = this.stoppedNanos - this.startedNanos;
        RumContext rumContext = getInitialContext();
        ViewEvent.CustomTimings customTimingsResolveCustomTimings = resolveCustomTimings();
        VitalInfo vitalInfo4 = this.lastMemoryInfo;
        VitalInfo vitalInfo5 = this.lastFrameRateInfo;
        Boolean boolResolveRefreshRateInfo = resolveRefreshRateInfo(vitalInfo5);
        SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, writer, eventType, new C06021(rumContext, this, lc9.i0(this.featureFlags), j2, j4, j3, j5, j6, j7, zIsViewComplete, j8, d, vitalInfo4, vitalInfo5, i, lResolveMetric, lResolveMetric2, customTimingsResolveCustomTimings, boolResolveRefreshRateInfo != null ? boolResolveRefreshRateInfo.booleanValue() : false, performanceMetric, performanceMetric2, inversePerformanceMetric, new LinkedHashMap(lc9.c0(this.eventAttributes, this.globalAttributes)), j)).submit();
    }

    public static /* synthetic */ void sendViewUpdate$default(RumViewScope rumViewScope, RumRawEvent rumRawEvent, DataWriter dataWriter, EventType eventType, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: sendViewUpdate");
            return;
        }
        if ((i & 4) != 0) {
            eventType = EventType.DEFAULT;
        }
        rumViewScope.sendViewUpdate(rumRawEvent, dataWriter, eventType);
    }

    private final void stopScope(RumRawEvent event, DataWriter<Object> writer, gu5<j6g> sideEffect) {
        if (this.stopped) {
            return;
        }
        sideEffect.invoke();
        this.stopped = true;
        resolveViewDuration(event);
        sendViewUpdate$default(this, event, writer, null, 4, null);
        delegateEventToChildren(event, writer);
        sendViewChanged();
        this.cpuVitalMonitor.unregister(this.cpuVitalListener);
        this.memoryVitalMonitor.unregister(this.memoryVitalListener);
        this.frameRateVitalMonitor.unregister(this.frameRateVitalListener);
        this.networkSettledMetricResolver.viewWasStopped();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void stopScope$default(RumViewScope rumViewScope, RumRawEvent rumRawEvent, DataWriter dataWriter, gu5 gu5Var, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: stopScope");
            return;
        }
        if ((i & 4) != 0) {
            gu5Var = C06031.INSTANCE;
        }
        rumViewScope.stopScope(rumRawEvent, dataWriter, gu5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorEvent.Category tryFrom(ErrorEvent.Category.Companion companion, RumRawEvent.AddError addError) {
        if (addError.getThrowable() != null) {
            return addError.getThrowable() instanceof ANRException ? ErrorEvent.Category.ANR : ErrorEvent.Category.EXCEPTION;
        }
        if (addError.getStacktrace() != null) {
            return ErrorEvent.Category.EXCEPTION;
        }
        return null;
    }

    private final void updateActiveActionScope(RumScope scope) {
        this.activeActionScope = scope;
        this.sdkCore.updateFeatureContext("rum", new C06041(getInitialContext()));
    }

    private final void updateGlobalAttributes(InternalSdkCore sdkCore, RumRawEvent event) {
        if (this.stopped || (event instanceof RumRawEvent.StartView)) {
            return;
        }
        this.globalAttributes = resolveGlobalAttributes(sdkCore);
    }

    private final void updateViewLoadingTime(RumRawEvent.AddViewLoadingTime event, DataWriter<Object> writer) {
        InternalLogger internalLogger = this.sdkCore.getInternalLogger();
        String name = this.key.getName();
        Long l = this.viewLoadingTime;
        long nanoTime = event.getEventTime().getNanoTime() - this.startedNanos;
        if (l == null) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.DEBUG, InternalLogger.Target.USER, (gu5) new C06051(name), (Throwable) null, false, (Map) null, 56, (Object) null);
            InternalLogger.DefaultImpls.logApiUsage$default(internalLogger, 0.0f, C06062.INSTANCE, 1, null);
        } else if (event.getOverwrite()) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass3(name, l, nanoTime), (Throwable) null, false, (Map) null, 56, (Object) null);
            InternalLogger.DefaultImpls.logApiUsage$default(internalLogger, 0.0f, AnonymousClass4.INSTANCE, 1, null);
        }
        this.viewLoadingTime = Long.valueOf(nanoTime);
        sendViewUpdate$default(this, event, writer, null, 4, null);
    }

    /* JADX INFO: renamed from: getActiveActionScope$dd_sdk_android_rum_release, reason: from getter */
    public final RumScope getActiveActionScope() {
        return this.activeActionScope;
    }

    public final Map<Object, RumScope> getActiveResourceScopes$dd_sdk_android_rum_release() {
        return this.activeResourceScopes;
    }

    /* JADX INFO: renamed from: getCpuVitalListener$dd_sdk_android_rum_release, reason: from getter */
    public final VitalListener getCpuVitalListener() {
        return this.cpuVitalListener;
    }

    /* JADX INFO: renamed from: getCpuVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final VitalMonitor getCpuVitalMonitor() {
        return this.cpuVitalMonitor;
    }

    public final Map<String, Long> getCustomTimings$dd_sdk_android_rum_release() {
        return this.customTimings;
    }

    public final Map<String, Object> getEventAttributes$dd_sdk_android_rum_release() {
        return this.eventAttributes;
    }

    /* JADX INFO: renamed from: getEventTimestamp$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    public final Map<String, Object> getFeatureFlags$dd_sdk_android_rum_release() {
        return this.featureFlags;
    }

    /* JADX INFO: renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_rum_release, reason: from getter */
    public final FirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    /* JADX INFO: renamed from: getFrameRateVitalListener$dd_sdk_android_rum_release, reason: from getter */
    public final VitalListener getFrameRateVitalListener() {
        return this.frameRateVitalListener;
    }

    /* JADX INFO: renamed from: getFrameRateVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final VitalMonitor getFrameRateVitalMonitor() {
        return this.frameRateVitalMonitor;
    }

    /* JADX INFO: renamed from: getKey$dd_sdk_android_rum_release, reason: from getter */
    public final RumScopeKey getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: getMemoryVitalListener$dd_sdk_android_rum_release, reason: from getter */
    public final VitalListener getMemoryVitalListener() {
        return this.memoryVitalListener;
    }

    /* JADX INFO: renamed from: getMemoryVitalMonitor$dd_sdk_android_rum_release, reason: from getter */
    public final VitalMonitor getMemoryVitalMonitor() {
        return this.memoryVitalMonitor;
    }

    /* JADX INFO: renamed from: getPendingActionCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingActionCount() {
        return this.pendingActionCount;
    }

    /* JADX INFO: renamed from: getPendingErrorCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingErrorCount() {
        return this.pendingErrorCount;
    }

    /* JADX INFO: renamed from: getPendingFrozenFrameCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingFrozenFrameCount() {
        return this.pendingFrozenFrameCount;
    }

    /* JADX INFO: renamed from: getPendingLongTaskCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingLongTaskCount() {
        return this.pendingLongTaskCount;
    }

    /* JADX INFO: renamed from: getPendingResourceCount$dd_sdk_android_rum_release, reason: from getter */
    public final long getPendingResourceCount() {
        return this.pendingResourceCount;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: getRumContext */
    public RumContext getInitialContext() {
        RumContext rumContext = this.parentScope.getInitialContext();
        if (!wl7.b(rumContext.getSessionId(), this.sessionId)) {
            this.sessionId = rumContext.getSessionId();
            String string = UUID.randomUUID().toString();
            string.getClass();
            setViewId$dd_sdk_android_rum_release(string);
        }
        String str = this.viewId;
        String name = this.key.getName();
        String str2 = this.url;
        RumScope rumScope = this.activeActionScope;
        RumActionScope rumActionScope = rumScope instanceof RumActionScope ? (RumActionScope) rumScope : null;
        return rumContext.copy((32377 & 1) != 0 ? rumContext.applicationId : null, (32377 & 2) != 0 ? rumContext.sessionId : null, (32377 & 4) != 0 ? rumContext.isSessionActive : false, (32377 & 8) != 0 ? rumContext.viewId : str, (32377 & 16) != 0 ? rumContext.viewName : name, (32377 & 32) != 0 ? rumContext.viewUrl : str2, (32377 & 64) != 0 ? rumContext.actionId : rumActionScope != null ? rumActionScope.getActionId() : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? rumContext.sessionState : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? rumContext.sessionStartReason : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? rumContext.viewType : this.type, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? rumContext.syntheticsTestId : null, (32377 & 2048) != 0 ? rumContext.syntheticsResultId : null, (32377 & 4096) != 0 ? rumContext.viewTimestamp : this.eventTimestamp, (32377 & 8192) != 0 ? rumContext.viewTimestampOffset : this.serverTimeOffsetInMs, (32377 & 16384) != 0 ? rumContext.hasReplay : false);
    }

    /* JADX INFO: renamed from: getSampleRate$dd_sdk_android_rum_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: getServerTimeOffsetInMs$dd_sdk_android_rum_release, reason: from getter */
    public final long getServerTimeOffsetInMs() {
        return this.serverTimeOffsetInMs;
    }

    /* JADX INFO: renamed from: getStopped$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getStopped() {
        return this.stopped;
    }

    /* JADX INFO: renamed from: getStoppedNanos$dd_sdk_android_rum_release, reason: from getter */
    public final long getStoppedNanos() {
        return this.stoppedNanos;
    }

    /* JADX INFO: renamed from: getType$dd_sdk_android_rum_release, reason: from getter */
    public final RumViewType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: getUrl$dd_sdk_android_rum_release, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: getVersion$dd_sdk_android_rum_release, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: getViewId$dd_sdk_android_rum_release, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    /* JADX INFO: renamed from: getViewLoadingTime$dd_sdk_android_rum_release, reason: from getter */
    public final Long getViewLoadingTime() {
        return this.viewLoadingTime;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public RumScope handleEvent(RumRawEvent event, DataWriter<Object> writer) {
        event.getClass();
        writer.getClass();
        updateGlobalAttributes(this.sdkCore, event);
        if (event instanceof RumRawEvent.ResourceSent) {
            onResourceSent((RumRawEvent.ResourceSent) event, writer);
        } else if (event instanceof RumRawEvent.ActionSent) {
            onActionSent((RumRawEvent.ActionSent) event, writer);
        } else if (event instanceof RumRawEvent.ErrorSent) {
            onErrorSent((RumRawEvent.ErrorSent) event, writer);
        } else if (event instanceof RumRawEvent.LongTaskSent) {
            onLongTaskSent((RumRawEvent.LongTaskSent) event, writer);
        } else if (event instanceof RumRawEvent.ResourceDropped) {
            onResourceDropped((RumRawEvent.ResourceDropped) event);
        } else if (event instanceof RumRawEvent.ActionDropped) {
            onActionDropped((RumRawEvent.ActionDropped) event);
        } else if (event instanceof RumRawEvent.ErrorDropped) {
            onErrorDropped((RumRawEvent.ErrorDropped) event);
        } else if (event instanceof RumRawEvent.LongTaskDropped) {
            onLongTaskDropped((RumRawEvent.LongTaskDropped) event);
        } else if (event instanceof RumRawEvent.StartView) {
            onStartView((RumRawEvent.StartView) event, writer);
        } else if (event instanceof RumRawEvent.StopView) {
            onStopView((RumRawEvent.StopView) event, writer);
        } else if (event instanceof RumRawEvent.StartAction) {
            onStartAction((RumRawEvent.StartAction) event, writer);
        } else if (event instanceof RumRawEvent.StartResource) {
            onStartResource((RumRawEvent.StartResource) event, writer);
        } else if (event instanceof RumRawEvent.AddError) {
            onAddError((RumRawEvent.AddError) event, writer);
        } else if (event instanceof RumRawEvent.AddLongTask) {
            onAddLongTask((RumRawEvent.AddLongTask) event, writer);
        } else if (event instanceof RumRawEvent.AddFeatureFlagEvaluation) {
            onAddFeatureFlagEvaluation((RumRawEvent.AddFeatureFlagEvaluation) event, writer);
        } else if (event instanceof RumRawEvent.AddFeatureFlagEvaluations) {
            onAddFeatureFlagEvaluations((RumRawEvent.AddFeatureFlagEvaluations) event, writer);
        } else if (event instanceof RumRawEvent.ApplicationStarted) {
            onApplicationStarted((RumRawEvent.ApplicationStarted) event, writer);
        } else if (event instanceof RumRawEvent.AddCustomTiming) {
            onAddCustomTiming((RumRawEvent.AddCustomTiming) event, writer);
        } else if (event instanceof RumRawEvent.KeepAlive) {
            onKeepAlive((RumRawEvent.KeepAlive) event, writer);
        } else if (event instanceof RumRawEvent.StopSession) {
            onStopSession((RumRawEvent.StopSession) event, writer);
        } else if (event instanceof RumRawEvent.UpdatePerformanceMetric) {
            onUpdatePerformanceMetric((RumRawEvent.UpdatePerformanceMetric) event);
        } else if (event instanceof RumRawEvent.AddViewLoadingTime) {
            onAddViewLoadingTime((RumRawEvent.AddViewLoadingTime) event, writer);
        } else {
            delegateEventToChildren(event, writer);
        }
        if (!isViewComplete()) {
            return this;
        }
        this.sdkCore.updateFeatureContext("session-replay", new C05951());
        return null;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return !this.stopped;
    }

    public final void setActiveActionScope$dd_sdk_android_rum_release(RumScope rumScope) {
        this.activeActionScope = rumScope;
    }

    public final void setCpuVitalListener$dd_sdk_android_rum_release(VitalListener vitalListener) {
        vitalListener.getClass();
        this.cpuVitalListener = vitalListener;
    }

    public final void setFrameRateVitalListener$dd_sdk_android_rum_release(VitalListener vitalListener) {
        vitalListener.getClass();
        this.frameRateVitalListener = vitalListener;
    }

    public final void setMemoryVitalListener$dd_sdk_android_rum_release(VitalListener vitalListener) {
        vitalListener.getClass();
        this.memoryVitalListener = vitalListener;
    }

    public final void setPendingActionCount$dd_sdk_android_rum_release(long j) {
        this.pendingActionCount = j;
    }

    public final void setPendingErrorCount$dd_sdk_android_rum_release(long j) {
        this.pendingErrorCount = j;
    }

    public final void setPendingFrozenFrameCount$dd_sdk_android_rum_release(long j) {
        this.pendingFrozenFrameCount = j;
    }

    public final void setPendingLongTaskCount$dd_sdk_android_rum_release(long j) {
        this.pendingLongTaskCount = j;
    }

    public final void setPendingResourceCount$dd_sdk_android_rum_release(long j) {
        this.pendingResourceCount = j;
    }

    public final void setStopped$dd_sdk_android_rum_release(boolean z) {
        this.stopped = z;
    }

    public final void setStoppedNanos$dd_sdk_android_rum_release(long j) {
        this.stoppedNanos = j;
    }

    public final void setVersion$dd_sdk_android_rum_release(long j) {
        this.version = j;
    }

    public final void setViewId$dd_sdk_android_rum_release(String str) {
        str.getClass();
        this.oldViewIds.add(this.viewId);
        this.viewId = str;
        RumContext rumContext = getInitialContext();
        if (rumContext.getSyntheticsTestId() != null) {
            Log.i("DatadogSynthetics", "_dd.application.id=" + rumContext.getApplicationId());
            Log.i("DatadogSynthetics", "_dd.session.id=" + rumContext.getSessionId());
            Log.i("DatadogSynthetics", "_dd.view.id=" + this.viewId);
        }
    }

    public final void setViewLoadingTime$dd_sdk_android_rum_release(Long l) {
        this.viewLoadingTime = l;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "", "asString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAsString", "()Ljava/lang/String;", "NONE", "FOREGROUND", "BACKGROUND", "APPLICATION_LAUNCH", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum RumViewType {
        NONE("NONE"),
        FOREGROUND("FOREGROUND"),
        BACKGROUND("BACKGROUND"),
        APPLICATION_LAUNCH("APPLICATION_LAUNCH");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asString;

        RumViewType(String str) {
            this.asString = str;
        }

        public final String getAsString() {
            return this.asString;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType$Companion;", "", "()V", "fromString", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "string", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RumViewType fromString(String string) {
                for (RumViewType rumViewType : RumViewType.values()) {
                    if (wl7.b(rumViewType.getAsString(), string)) {
                        return rumViewType;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06001 extends mj8 implements gu5<j6g> {
        final /* synthetic */ RumRawEvent.StopView $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06001(RumRawEvent.StopView stopView) {
            super(0);
            this.$event = stopView;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RumContext rumContext = RumViewScope.this.getInitialContext();
            RumViewScope.this.sdkCore.updateFeatureContext("rum", new C01211(RumViewScope.this, rumContext.copy((32377 & 1) != 0 ? rumContext.applicationId : null, (32377 & 2) != 0 ? rumContext.sessionId : null, (32377 & 4) != 0 ? rumContext.isSessionActive : false, (32377 & 8) != 0 ? rumContext.viewId : null, (32377 & 16) != 0 ? rumContext.viewName : null, (32377 & 32) != 0 ? rumContext.viewUrl : null, (32377 & 64) != 0 ? rumContext.actionId : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? rumContext.sessionState : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? rumContext.sessionStartReason : null, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? rumContext.viewType : RumViewType.NONE, (32377 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? rumContext.syntheticsTestId : null, (32377 & 2048) != 0 ? rumContext.syntheticsResultId : null, (32377 & 4096) != 0 ? rumContext.viewTimestamp : 0L, (32377 & 8192) != 0 ? rumContext.viewTimestampOffset : 0L, (32377 & 16384) != 0 ? rumContext.hasReplay : false)));
            RumViewScope.this.getEventAttributes$dd_sdk_android_rum_release().putAll(this.$event.getAttributes());
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "currentRumContext", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
        public static final class C01211 extends mj8 implements Function1<Map<String, Object>, j6g> {
            final /* synthetic */ RumContext $newRumContext;
            final /* synthetic */ RumViewScope this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01211(RumViewScope rumViewScope, RumContext rumContext) {
                super(1);
                this.this$0 = rumViewScope;
                this.$newRumContext = rumContext;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, Object> map) {
                map.getClass();
                if (wl7.b(map.get("session_id"), this.this$0.sessionId) && !wl7.b(map.get(RumContext.VIEW_ID), this.this$0.getViewId())) {
                    InternalLogger.DefaultImpls.log$default(this.this$0.sdkCore.getInternalLogger(), InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, (gu5) C01221.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
                } else {
                    map.clear();
                    map.putAll(this.$newRumContext.toMap());
                }
            }

            /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
            public static final class C01221 extends mj8 implements gu5<String> {
                public static final C01221 INSTANCE = new C01221();

                public C01221() {
                    super(0);
                }

                @Override // defpackage.gu5
                public final String invoke() {
                    return RumViewScope.RUM_CONTEXT_UPDATE_IGNORED_AT_STOP_VIEW_MESSAGE;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
                invoke2(map);
                return j6g.a;
            }
        }

        @Override // defpackage.gu5
        public /* bridge */ /* synthetic */ j6g invoke() {
            invoke2();
            return j6g.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jw\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002J\f\u00101\u001a\u000202*\u000203H\u0002J\f\u00104\u001a\u000202*\u000203H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$Companion;", "", "()V", "ACTION_DROPPED_WARNING", "", "ADDING_VIEW_LOADING_TIME_DEBUG_MESSAGE_FORMAT", "FROZEN_FRAME_THRESHOLD_NS", "", "getFROZEN_FRAME_THRESHOLD_NS$dd_sdk_android_rum_release", "()J", "NEGATIVE_DURATION_WARNING_MESSAGE", "ONE_SECOND_NS", "getONE_SECOND_NS$dd_sdk_android_rum_release", "OVERWRITING_VIEW_LOADING_TIME_WARNING_MESSAGE_FORMAT", "RUM_CONTEXT_UPDATE_IGNORED_AT_ACTION_UPDATE_MESSAGE", "RUM_CONTEXT_UPDATE_IGNORED_AT_STOP_VIEW_MESSAGE", "SLOW_RENDERED_THRESHOLD_FPS", "", "ZERO_DURATION_WARNING_MESSAGE", "fromEvent", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope;", "parentScope", "Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "sessionEndedMetricDispatcher", "Lcom/datadog/android/rum/internal/metric/SessionMetricDispatcher;", "sdkCore", "Lcom/datadog/android/core/InternalSdkCore;", "event", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent$StartView;", "viewChangedListener", "Lcom/datadog/android/rum/internal/domain/scope/RumViewChangedListener;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "cpuVitalMonitor", "Lcom/datadog/android/rum/internal/vitals/VitalMonitor;", "memoryVitalMonitor", "frameRateVitalMonitor", "trackFrustrations", "", "sampleRate", "", "interactionToNextViewMetricResolver", "Lcom/datadog/android/rum/internal/metric/interactiontonextview/InteractionToNextViewMetricResolver;", "networkSettledResourceIdentifier", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "fromEvent$dd_sdk_android_rum_release", "invertValue", "", "value", "toInversePerformanceMetric", "Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "toPerformanceMetric", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final double invertValue(double value) {
            if (value == 0.0d) {
                return 0.0d;
            }
            return 1.0d / value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewEvent.FlutterBuildTime toInversePerformanceMetric(VitalInfo vitalInfo) {
            return new ViewEvent.FlutterBuildTime(Double.valueOf(invertValue(vitalInfo.getMaxValue()) * 1.0E9d), Double.valueOf(invertValue(vitalInfo.getMinValue()) * 1.0E9d), Double.valueOf(invertValue(vitalInfo.getMeanValue()) * 1.0E9d), null, 8, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewEvent.FlutterBuildTime toPerformanceMetric(VitalInfo vitalInfo) {
            return new ViewEvent.FlutterBuildTime(Double.valueOf(vitalInfo.getMinValue()), Double.valueOf(vitalInfo.getMaxValue()), Double.valueOf(vitalInfo.getMeanValue()), null, 8, null);
        }

        public final RumViewScope fromEvent$dd_sdk_android_rum_release(RumScope parentScope, SessionMetricDispatcher sessionEndedMetricDispatcher, InternalSdkCore sdkCore, RumRawEvent.StartView event, RumViewChangedListener viewChangedListener, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor cpuVitalMonitor, VitalMonitor memoryVitalMonitor, VitalMonitor frameRateVitalMonitor, boolean trackFrustrations, float sampleRate, InteractionToNextViewMetricResolver interactionToNextViewMetricResolver, InitialResourceIdentifier networkSettledResourceIdentifier) {
            parentScope.getClass();
            sessionEndedMetricDispatcher.getClass();
            sdkCore.getClass();
            event.getClass();
            firstPartyHostHeaderTypeResolver.getClass();
            cpuVitalMonitor.getClass();
            memoryVitalMonitor.getClass();
            frameRateVitalMonitor.getClass();
            interactionToNextViewMetricResolver.getClass();
            networkSettledResourceIdentifier.getClass();
            return new RumViewScope(parentScope, sdkCore, sessionEndedMetricDispatcher, event.getKey(), event.getEventTime(), event.getAttributes(), viewChangedListener, firstPartyHostHeaderTypeResolver, cpuVitalMonitor, memoryVitalMonitor, frameRateVitalMonitor, null, null, trackFrustrations, sampleRate, interactionToNextViewMetricResolver, new NetworkSettledMetricResolver(networkSettledResourceIdentifier, sdkCore.getInternalLogger()), 6144, null);
        }

        public final long getFROZEN_FRAME_THRESHOLD_NS$dd_sdk_android_rum_release() {
            return RumViewScope.FROZEN_FRAME_THRESHOLD_NS;
        }

        public final long getONE_SECOND_NS$dd_sdk_android_rum_release() {
            return RumViewScope.ONE_SECOND_NS;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateActiveActionScope$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "currentRumContext", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06041 extends mj8 implements Function1<Map<String, Object>, j6g> {
        final /* synthetic */ RumContext $newRumContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06041(RumContext rumContext) {
            super(1);
            this.$newRumContext = rumContext;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Object> map) {
            map.getClass();
            if (wl7.b(map.get("session_id"), RumViewScope.this.sessionId) && !wl7.b(map.get(RumContext.VIEW_ID), RumViewScope.this.getViewId())) {
                InternalLogger.DefaultImpls.log$default(RumViewScope.this.sdkCore.getInternalLogger(), InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, (gu5) C01241.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            } else {
                map.clear();
                map.putAll(this.$newRumContext.toMap());
            }
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateActiveActionScope$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
        public static final class C01241 extends mj8 implements gu5<String> {
            public static final C01241 INSTANCE = new C01241();

            public C01241() {
                super(0);
            }

            @Override // defpackage.gu5
            public final String invoke() {
                return RumViewScope.RUM_CONTEXT_UPDATE_IGNORED_AT_ACTION_UPDATE_MESSAGE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
            invoke2(map);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$stopScope$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06031 extends mj8 implements gu5<j6g> {
        public static final C06031 INSTANCE = new C06031();

        public C06031() {
            super(0);
        }

        @Override // defpackage.gu5
        public /* bridge */ /* synthetic */ j6g invoke() {
            invoke2();
            return j6g.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05951 extends mj8 implements Function1<Map<String, Object>, j6g> {
        public C05951() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Object> map) {
            map.getClass();
            map.remove(RumViewScope.this.getViewId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
            invoke2(map);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "datadogContext", "Lcom/datadog/android/api/context/DatadogContext;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06021 extends mj8 implements Function1<DatadogContext, Object> {
        final /* synthetic */ long $durationNs;
        final /* synthetic */ long $eventActionCount;
        final /* synthetic */ Map<String, Object> $eventAdditionalAttributes;
        final /* synthetic */ Double $eventCpuTicks;
        final /* synthetic */ long $eventCrashCount;
        final /* synthetic */ long $eventErrorCount;
        final /* synthetic */ Map<String, Object> $eventFeatureFlags;
        final /* synthetic */ ViewEvent.FlutterBuildTime $eventFlutterBuildTime;
        final /* synthetic */ ViewEvent.FlutterBuildTime $eventFlutterRasterTime;
        final /* synthetic */ long $eventFrozenFramesCount;
        final /* synthetic */ int $eventFrustrationCount;
        final /* synthetic */ ViewEvent.FlutterBuildTime $eventJsRefreshRate;
        final /* synthetic */ long $eventLongTaskCount;
        final /* synthetic */ long $eventResourceCount;
        final /* synthetic */ long $eventVersion;
        final /* synthetic */ Long $interactionToNextViewTime;
        final /* synthetic */ boolean $isSlowRendered;
        final /* synthetic */ VitalInfo $memoryInfo;
        final /* synthetic */ VitalInfo $refreshRateInfo;
        final /* synthetic */ RumContext $rumContext;
        final /* synthetic */ Long $timeToSettled;
        final /* synthetic */ ViewEvent.CustomTimings $timings;
        final /* synthetic */ boolean $viewComplete;
        final /* synthetic */ RumViewScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06021(RumContext rumContext, RumViewScope rumViewScope, Map<String, Object> map, long j, long j2, long j3, long j4, long j5, long j6, boolean z, long j7, Double d, VitalInfo vitalInfo, VitalInfo vitalInfo2, int i, Long l, Long l2, ViewEvent.CustomTimings customTimings, boolean z2, ViewEvent.FlutterBuildTime flutterBuildTime, ViewEvent.FlutterBuildTime flutterBuildTime2, ViewEvent.FlutterBuildTime flutterBuildTime3, Map<String, Object> map2, long j8) {
            super(1);
            this.$rumContext = rumContext;
            this.this$0 = rumViewScope;
            this.$eventFeatureFlags = map;
            this.$eventActionCount = j;
            this.$eventResourceCount = j2;
            this.$eventErrorCount = j3;
            this.$eventCrashCount = j4;
            this.$eventLongTaskCount = j5;
            this.$eventFrozenFramesCount = j6;
            this.$viewComplete = z;
            this.$durationNs = j7;
            this.$eventCpuTicks = d;
            this.$memoryInfo = vitalInfo;
            this.$refreshRateInfo = vitalInfo2;
            this.$eventFrustrationCount = i;
            this.$timeToSettled = l;
            this.$interactionToNextViewTime = l2;
            this.$timings = customTimings;
            this.$isSlowRendered = z2;
            this.$eventFlutterBuildTime = flutterBuildTime;
            this.$eventFlutterRasterTime = flutterBuildTime2;
            this.$eventJsRefreshRate = flutterBuildTime3;
            this.$eventAdditionalAttributes = map2;
            this.$eventVersion = j8;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(DatadogContext datadogContext) {
            UserInfo userInfo;
            String str;
            boolean z;
            Double dValueOf;
            Double d;
            String syntheticsResultId;
            datadogContext.getClass();
            String viewId = this.$rumContext.getViewId();
            String str2 = viewId == null ? "" : viewId;
            UserInfo userInfo2 = datadogContext.getUserInfo();
            boolean zResolveViewHasReplay = this.this$0.featuresContextResolver.resolveViewHasReplay(datadogContext, str2);
            this.this$0.sdkCore.updateFeatureContext("rum", new C01231(zResolveViewHasReplay));
            ViewEvent.ReplayStats replayStats = new ViewEvent.ReplayStats(Long.valueOf(this.this$0.featuresContextResolver.resolveViewRecordsCount(datadogContext, str2)), null, null, 6, null);
            String syntheticsTestId = this.$rumContext.getSyntheticsTestId();
            ViewEvent.Synthetics synthetics = (syntheticsTestId == null || zve.U(syntheticsTestId) || (syntheticsResultId = this.$rumContext.getSyntheticsResultId()) == null || zve.U(syntheticsResultId)) ? null : new ViewEvent.Synthetics(this.$rumContext.getSyntheticsTestId(), this.$rumContext.getSyntheticsResultId(), null, 4, null);
            ViewEvent.ViewEventSessionType viewEventSessionType = synthetics == null ? ViewEvent.ViewEventSessionType.USER : ViewEvent.ViewEventSessionType.SYNTHETICS;
            long eventTimestamp = this.this$0.getEventTimestamp();
            ViewEvent.Context context = new ViewEvent.Context(this.$eventFeatureFlags);
            String viewName = this.$rumContext.getViewName();
            String viewUrl = this.$rumContext.getViewUrl();
            String str3 = viewUrl != null ? viewUrl : "";
            ViewEvent.Action action = new ViewEvent.Action(this.$eventActionCount);
            ViewEvent.Resource resource = new ViewEvent.Resource(this.$eventResourceCount);
            ViewEvent.Error error = new ViewEvent.Error(this.$eventErrorCount);
            ViewEvent.Crash crash = new ViewEvent.Crash(this.$eventCrashCount);
            ViewEvent.LongTask longTask = new ViewEvent.LongTask(this.$eventLongTaskCount);
            ViewEvent.FrozenFrame frozenFrame = new ViewEvent.FrozenFrame(this.$eventFrozenFramesCount);
            boolean z2 = !this.$viewComplete;
            if (this.$durationNs < RumViewScope.INSTANCE.getONE_SECOND_NS$dd_sdk_android_rum_release() || (d = this.$eventCpuTicks) == null) {
                userInfo = userInfo2;
                str = str3;
                z = zResolveViewHasReplay;
                dValueOf = null;
            } else {
                userInfo = userInfo2;
                str = str3;
                z = zResolveViewHasReplay;
                dValueOf = Double.valueOf((d.doubleValue() * r18.getONE_SECOND_NS$dd_sdk_android_rum_release()) / this.$durationNs);
            }
            VitalInfo vitalInfo = this.$memoryInfo;
            Double dValueOf2 = vitalInfo != null ? Double.valueOf(vitalInfo.getMeanValue()) : null;
            VitalInfo vitalInfo2 = this.$memoryInfo;
            Double dValueOf3 = vitalInfo2 != null ? Double.valueOf(vitalInfo2.getMaxValue()) : null;
            VitalInfo vitalInfo3 = this.$refreshRateInfo;
            Double dValueOf4 = vitalInfo3 != null ? Double.valueOf(vitalInfo3.getMeanValue()) : null;
            VitalInfo vitalInfo4 = this.$refreshRateInfo;
            ViewEvent viewEvent = new ViewEvent(eventTimestamp, new ViewEvent.Application(this.$rumContext.getApplicationId()), datadogContext.getService(), datadogContext.getVersion(), null, null, new ViewEvent.ViewEventSession(this.$rumContext.getSessionId(), viewEventSessionType, Boolean.valueOf(z), Boolean.valueOf(this.$rumContext.isSessionActive()), null, 16, null), RumEventExtKt.tryFromSource(ViewEvent.ViewEventSource.INSTANCE, datadogContext.getSource(), this.this$0.sdkCore.getInternalLogger()), new ViewEvent.ViewEventView(str2, null, str, viewName, this.this$0.getViewLoadingTime(), this.$timeToSettled, this.$interactionToNextViewTime, null, this.$durationNs, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$timings, Boolean.valueOf(z2), Boolean.valueOf(this.$isSlowRendered), action, error, crash, longTask, frozenFrame, resource, new ViewEvent.Frustration(this.$eventFrustrationCount), null, dValueOf2, dValueOf3, this.$eventCpuTicks, dValueOf, dValueOf4, vitalInfo4 != null ? Double.valueOf(vitalInfo4.getMinValue()) : null, this.$eventFlutterBuildTime, this.$eventFlutterRasterTime, this.$eventJsRefreshRate, 67108482, 16, null), RuntimeUtilsKt.hasUserData(userInfo) ? new ViewEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), null, lc9.i0(userInfo.getAdditionalProperties()), 8, null) : null, null, RumEventExtKt.toViewConnectivity(datadogContext.getNetworkInfo()), null, synthetics, null, new ViewEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null), new ViewEvent.Device(RumEventExtKt.toViewSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture()), new ViewEvent.Dd(new ViewEvent.DdSession(null, RumEventExtKt.toViewSessionPrecondition(this.$rumContext.getSessionStartReason()), 1, null), new ViewEvent.Configuration(Float.valueOf(this.this$0.getSampleRate()), null, null, 6, null), null, this.$eventVersion, null, replayStats, 20, null), new ViewEvent.Context(this.$eventAdditionalAttributes), null, context, null, 2642992, null);
            RumViewScope rumViewScope = this.this$0;
            rumViewScope.sessionEndedMetricDispatcher.onViewTracked(rumViewScope.sessionId, viewEvent);
            return viewEvent;
        }

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "currentRumContext", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
        public static final class C01231 extends mj8 implements Function1<Map<String, Object>, j6g> {
            final /* synthetic */ boolean $hasReplay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01231(boolean z) {
                super(1);
                this.$hasReplay = z;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, Object> map) {
                map.getClass();
                map.put(RumContext.HAS_REPLAY, Boolean.valueOf(this.$hasReplay));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
                invoke2(map);
                return j6g.a;
            }
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumViewScope$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<Map<String, Object>, j6g> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Object> map) {
            map.getClass();
            map.putAll(RumViewScope.this.getInitialContext().toMap());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
            invoke2(map);
            return j6g.a;
        }
    }

    public /* synthetic */ RumViewScope(RumScope rumScope, InternalSdkCore internalSdkCore, SessionMetricDispatcher sessionMetricDispatcher, RumScopeKey rumScopeKey, Time time, Map map, RumViewChangedListener rumViewChangedListener, FirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, FeaturesContextResolver featuresContextResolver, RumViewType rumViewType, boolean z, float f, InteractionToNextViewMetricResolver interactionToNextViewMetricResolver, NetworkSettledMetricResolver networkSettledMetricResolver, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rumScope, internalSdkCore, sessionMetricDispatcher, rumScopeKey, time, map, rumViewChangedListener, firstPartyHostHeaderTypeResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, (i & 2048) != 0 ? new FeaturesContextResolver() : featuresContextResolver, (i & 4096) != 0 ? RumViewType.FOREGROUND : rumViewType, z, f, interactionToNextViewMetricResolver, networkSettledMetricResolver);
    }
}
