package com.datadog.android.okhttp;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.core.SdkReference;
import com.datadog.android.okhttp.internal.rum.RequestExtKt;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor;
import com.datadog.android.rum.resource.ResourceId;
import defpackage.gu5;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001IB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0012J!\u0010)\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010\u0012J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010\u0012J\u001f\u00103\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010\u0012J\u001f\u00108\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010\u0011\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010@R\u0016\u0010\u0015\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010@R\u0016\u0010\u001a\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010@R\u0016\u0010A\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010B\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0016\u0010C\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010@R\u0016\u0010D\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010@R\u0016\u0010E\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010@R\u0016\u0010F\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010@R\u0016\u0010G\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010@R\u0016\u0010H\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010@¨\u0006J"}, d2 = {"Lcom/datadog/android/okhttp/DatadogEventListener;", "Lokhttp3/EventListener;", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lcom/datadog/android/rum/resource/ResourceId;", "key", "<init>", "(Lcom/datadog/android/api/SdkCore;Lcom/datadog/android/rum/resource/ResourceId;)V", "Lj6g;", "sendWaitForResourceTimingEvent", "()V", "sendTiming", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "buildTiming", "()Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "Lokhttp3/Call;", "call", "callStart", "(Lokhttp3/Call;)V", "", "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "", "byteCount", "responseBodyEnd", "(Lokhttp3/Call;J)V", "callEnd", "Ljava/io/IOException;", "ioe", "callFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lcom/datadog/android/api/SdkCore;", "getSdkCore$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/api/SdkCore;", "Lcom/datadog/android/rum/resource/ResourceId;", "getKey$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/rum/resource/ResourceId;", "J", "connStart", "connEnd", "sslStart", "sslEnd", "headersStart", "headersEnd", "bodyStart", "bodyEnd", "Factory", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogEventListener extends EventListener {
    private long bodyEnd;
    private long bodyStart;
    private long callStart;
    private long connEnd;
    private long connStart;
    private long dnsEnd;
    private long dnsStart;
    private long headersEnd;
    private long headersStart;
    private final ResourceId key;
    private final SdkCore sdkCore;
    private long sslEnd;
    private long sslStart;

    public DatadogEventListener(SdkCore sdkCore, ResourceId resourceId) {
        sdkCore.getClass();
        resourceId.getClass();
        this.sdkCore = sdkCore;
        this.key = resourceId;
    }

    private final ResourceTiming buildTiming() {
        long j;
        Pair pair;
        long j2 = this.dnsStart;
        Pair pair2 = j2 == 0 ? new Pair(0L, 0L) : new Pair(Long.valueOf(j2 - this.callStart), Long.valueOf(this.dnsEnd - this.dnsStart));
        long jLongValue = ((Number) pair2.a()).longValue();
        long jLongValue2 = ((Number) pair2.b()).longValue();
        long j3 = this.connStart;
        Pair pair3 = j3 == 0 ? new Pair(0L, 0L) : new Pair(Long.valueOf(j3 - this.callStart), Long.valueOf(this.connEnd - this.connStart));
        long jLongValue3 = ((Number) pair3.a()).longValue();
        long jLongValue4 = ((Number) pair3.b()).longValue();
        long j4 = this.sslStart;
        if (j4 == 0) {
            pair = new Pair(0L, 0L);
            j = 0;
        } else {
            j = 0;
            pair = new Pair(Long.valueOf(j4 - this.callStart), Long.valueOf(this.sslEnd - this.sslStart));
        }
        long jLongValue5 = ((Number) pair.a()).longValue();
        long jLongValue6 = ((Number) pair.b()).longValue();
        long j5 = this.headersStart;
        Pair pair4 = j5 == j ? new Pair(0L, 0L) : new Pair(Long.valueOf(j5 - this.callStart), Long.valueOf(this.headersEnd - this.headersStart));
        long jLongValue7 = ((Number) pair4.a()).longValue();
        long jLongValue8 = ((Number) pair4.b()).longValue();
        long j6 = this.bodyStart;
        Pair pair5 = j6 == j ? new Pair(0L, 0L) : new Pair(Long.valueOf(j6 - this.callStart), Long.valueOf(this.bodyEnd - this.bodyStart));
        return new ResourceTiming(jLongValue, jLongValue2, jLongValue3, jLongValue4, jLongValue5, jLongValue6, jLongValue7, jLongValue8, ((Number) pair5.a()).longValue(), ((Number) pair5.b()).longValue());
    }

    private final void sendTiming() {
        ResourceTiming resourceTimingBuildTiming = buildTiming();
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof AdvancedNetworkRumMonitor ? (AdvancedNetworkRumMonitor) rumMonitor : null;
        if (advancedNetworkRumMonitor != null) {
            advancedNetworkRumMonitor.addResourceTiming(this.key, resourceTimingBuildTiming);
        }
    }

    private final void sendWaitForResourceTimingEvent() {
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        AdvancedNetworkRumMonitor advancedNetworkRumMonitor = rumMonitor instanceof AdvancedNetworkRumMonitor ? (AdvancedNetworkRumMonitor) rumMonitor : null;
        if (advancedNetworkRumMonitor != null) {
            advancedNetworkRumMonitor.waitForResourceTiming(this.key);
        }
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        call.getClass();
        super.callEnd(call);
        sendTiming();
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException ioe) {
        call.getClass();
        ioe.getClass();
        super.callFailed(call, ioe);
        sendTiming();
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        call.getClass();
        super.callStart(call);
        sendWaitForResourceTimingEvent();
        this.callStart = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        this.connEnd = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        super.connectStart(call, inetSocketAddress, proxy);
        sendWaitForResourceTimingEvent();
        this.connStart = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String domainName, List<? extends InetAddress> inetAddressList) {
        call.getClass();
        domainName.getClass();
        inetAddressList.getClass();
        super.dnsEnd(call, domainName, inetAddressList);
        this.dnsEnd = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String domainName) {
        call.getClass();
        domainName.getClass();
        super.dnsStart(call, domainName);
        sendWaitForResourceTimingEvent();
        this.dnsStart = this.sdkCore.getTime().getDeviceTimeNs();
    }

    /* JADX INFO: renamed from: getKey$dd_sdk_android_okhttp_release, reason: from getter */
    public final ResourceId getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: getSdkCore$dd_sdk_android_okhttp_release, reason: from getter */
    public final SdkCore getSdkCore() {
        return this.sdkCore;
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long byteCount) {
        call.getClass();
        super.responseBodyEnd(call, byteCount);
        this.bodyEnd = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        call.getClass();
        super.responseBodyStart(call);
        sendWaitForResourceTimingEvent();
        this.bodyStart = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        call.getClass();
        response.getClass();
        super.responseHeadersEnd(call, response);
        this.headersEnd = this.sdkCore.getTime().getDeviceTimeNs();
        if (response.d >= 400) {
            sendTiming();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        call.getClass();
        super.responseHeadersStart(call);
        sendWaitForResourceTimingEvent();
        this.headersStart = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        call.getClass();
        super.secureConnectEnd(call, handshake);
        this.sslEnd = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        call.getClass();
        super.secureConnectStart(call);
        sendWaitForResourceTimingEvent();
        this.sslStart = this.sdkCore.getTime().getDeviceTimeNs();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/datadog/android/okhttp/DatadogEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "sdkInstanceName", "", "(Ljava/lang/String;)V", "sdkCoreReference", "Lcom/datadog/android/core/SdkReference;", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "Companion", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Factory implements EventListener.Factory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final EventListener NO_OP_EVENT_LISTENER = new EventListener() { // from class: com.datadog.android.okhttp.DatadogEventListener$Factory$Companion$NO_OP_EVENT_LISTENER$1
        };
        private final SdkReference sdkCoreReference;

        public Factory(String str) {
            this.sdkCoreReference = new SdkReference(str, null, 2, null);
        }

        public EventListener create(Call call) {
            call.getClass();
            ResourceId resourceIdBuildResourceId = RequestExtKt.buildResourceId(call.getB(), true);
            SdkCore sdkCore = this.sdkCoreReference.get();
            if (sdkCore != null) {
                return new DatadogEventListener(sdkCore, resourceIdBuildResourceId);
            }
            InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) new DatadogEventListener$Factory$create$1(call), (Throwable) null, false, (Map) null, 56, (Object) null);
            return NO_OP_EVENT_LISTENER;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/okhttp/DatadogEventListener$Factory$Companion;", "", "()V", "NO_OP_EVENT_LISTENER", "Lokhttp3/EventListener;", "getNO_OP_EVENT_LISTENER", "()Lokhttp3/EventListener;", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EventListener getNO_OP_EVENT_LISTENER() {
                return Factory.NO_OP_EVENT_LISTENER;
            }

            private Companion() {
            }
        }

        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Factory(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
