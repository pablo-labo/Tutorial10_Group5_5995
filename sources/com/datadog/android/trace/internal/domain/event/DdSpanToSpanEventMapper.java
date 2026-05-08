package com.datadog.android.trace.internal.domain.event;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.internal.utils.NumberExtKt;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.trace.model.SpanEvent;
import defpackage.bve;
import defpackage.rc3;
import defpackage.sc3;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/DdSpanToSpanEventMapper;", "Lcom/datadog/android/trace/internal/domain/event/BaseSpanEventMapper;", "Lrc3;", "", "networkInfoEnabled", "Lcom/datadog/android/trace/internal/domain/event/BigIntegerUtils;", "bigIntegerUtils", "<init>", "(ZLcom/datadog/android/trace/internal/domain/event/BigIntegerUtils;)V", "event", "Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "resolveMetrics", "(Lrc3;)Lcom/datadog/android/trace/model/SpanEvent$Metrics;", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lcom/datadog/android/trace/model/SpanEvent$Meta;", "resolveMeta", "(Lcom/datadog/android/api/context/DatadogContext;Lrc3;)Lcom/datadog/android/trace/model/SpanEvent$Meta;", "model", "Lcom/datadog/android/trace/model/SpanEvent;", "map", "(Lcom/datadog/android/api/context/DatadogContext;Lrc3;)Lcom/datadog/android/trace/model/SpanEvent;", "Z", "getNetworkInfoEnabled$dd_sdk_android_trace_release", "()Z", "Lcom/datadog/android/trace/internal/domain/event/BigIntegerUtils;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DdSpanToSpanEventMapper extends BaseSpanEventMapper<rc3> {
    private final BigIntegerUtils bigIntegerUtils;
    private final boolean networkInfoEnabled;

    public DdSpanToSpanEventMapper(boolean z, BigIntegerUtils bigIntegerUtils) {
        bigIntegerUtils.getClass();
        this.networkInfoEnabled = z;
        this.bigIntegerUtils = bigIntegerUtils;
    }

    private final SpanEvent.Meta resolveMeta(DatadogContext datadogContext, rc3 event) {
        SpanEvent.Network networkResolveNetworkInfo = this.networkInfoEnabled ? resolveNetworkInfo(datadogContext.getNetworkInfo()) : null;
        SpanEvent.Device deviceResolveDeviceInfo = resolveDeviceInfo(datadogContext.getDeviceInfo());
        SpanEvent.Os osResolveOsInfo = resolveOsInfo(datadogContext.getDeviceInfo());
        UserInfo userInfo = datadogContext.getUserInfo();
        BigIntegerUtils bigIntegerUtils = this.bigIntegerUtils;
        BigInteger bigInteger = event.b.d;
        bigInteger.getClass();
        String strMostSignificant64BitsAsHex = bigIntegerUtils.mostSignificant64BitsAsHex(bigInteger);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MetaKeysKt.TRACE_ID_META_KEY, strMostSignificant64BitsAsHex);
        linkedHashMap.put("variant", datadogContext.getVariant());
        HashMap map = new HashMap();
        for (Map.Entry entry : event.b.c.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry<String, Object> entry2 : event.l().entrySet()) {
            map.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        linkedHashMap.putAll(map);
        SpanEvent.Usr usrResolveUserInfo = resolveUserInfo(userInfo);
        String source = datadogContext.getSource();
        Object obj = event.l().get("application_id");
        SpanEvent.Application application = obj != null ? new SpanEvent.Application(obj instanceof String ? (String) obj : null) : null;
        Object obj2 = event.l().get("session_id");
        SpanEvent.Session session = obj2 != null ? new SpanEvent.Session(obj2 instanceof String ? (String) obj2 : null) : null;
        Object obj3 = event.l().get(LogAttributes.RUM_VIEW_ID);
        return new SpanEvent.Meta(datadogContext.getVersion(), new SpanEvent.Dd(source, application, session, obj3 != null ? new SpanEvent.View(obj3 instanceof String ? (String) obj3 : null) : null), new SpanEvent.Span(), new SpanEvent.Tracer(datadogContext.getSdkVersion()), usrResolveUserInfo, networkResolveNetworkInfo, deviceResolveDeviceInfo, osResolveOsInfo, linkedHashMap);
    }

    private final SpanEvent.Metrics resolveMetrics(rc3 event) {
        Long l = event.b.f.longValue() == 0 ? 1L : null;
        Map<String, Number> map = event.b.n.get();
        if (map == null) {
            map = sc3.q;
        }
        map.getClass();
        return new SpanEvent.Metrics(l, map);
    }

    /* JADX INFO: renamed from: getNetworkInfoEnabled$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getNetworkInfoEnabled() {
        return this.networkInfoEnabled;
    }

    @Override // com.datadog.android.trace.internal.domain.event.ContextAwareMapper
    public SpanEvent map(DatadogContext datadogContext, rc3 model) {
        datadogContext.getClass();
        model.getClass();
        long serverTimeOffsetNs = datadogContext.getTime().getServerTimeOffsetNs();
        SpanEvent.Metrics metricsResolveMetrics = resolveMetrics(model);
        SpanEvent.Meta metaResolveMeta = resolveMeta(datadogContext, model);
        BigIntegerUtils bigIntegerUtils = this.bigIntegerUtils;
        BigInteger bigInteger = model.b.d;
        bigInteger.getClass();
        String strLeastSignificant64BitsAsHex = bigIntegerUtils.leastSignificant64BitsAsHex(bigInteger);
        bve bveVar = model.b.e;
        bveVar.getClass();
        String hexString = NumberExtKt.toHexString(bveVar);
        BigInteger bigInteger2 = model.b.f;
        bigInteger2.getClass();
        String hexString2 = NumberExtKt.toHexString(bigInteger2);
        sc3 sc3Var = model.b;
        String str = (sc3Var.i == null || sc3Var.i.isEmpty()) ? sc3Var.j : sc3Var.i;
        String str2 = model.b.j;
        String str3 = model.b.h;
        long j = model.e.get();
        long nanos = model.d;
        if (nanos <= 0) {
            nanos = TimeUnit.MICROSECONDS.toNanos(model.c);
        }
        long j2 = nanos + serverTimeOffsetNs;
        long j3 = model.b.k ? 1L : 0L;
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new SpanEvent(strLeastSignificant64BitsAsHex, hexString, hexString2, str, str2, str3, j, j2, j3, metricsResolveMetrics, metaResolveMeta);
    }

    public /* synthetic */ DdSpanToSpanEventMapper(boolean z, BigIntegerUtils bigIntegerUtils, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? BigIntegerUtils.INSTANCE : bigIntegerUtils);
    }
}
