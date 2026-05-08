package com.datadog.android.log.internal.net;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.net.Request;
import com.datadog.android.api.net.RequestExecutionContext;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.a32;
import defpackage.lc9;
import defpackage.t92;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J2\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/datadog/android/log/internal/net/LogsRequestFactory;", "Lcom/datadog/android/api/net/RequestFactory;", "customEndpointUrl", "", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)V", "getCustomEndpointUrl$dd_sdk_android_logs_release", "()Ljava/lang/String;", "buildHeaders", "", "requestId", "clientToken", "source", "sdkVersion", "buildUrl", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/api/context/DatadogContext;", "create", "Lcom/datadog/android/api/net/Request;", "executionContext", "Lcom/datadog/android/api/net/RequestExecutionContext;", "batchData", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchMetadata", "", "Companion", "dd-sdk-android-logs_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class LogsRequestFactory implements RequestFactory {
    private static final byte[] PAYLOAD_PREFIX;
    private static final byte[] PAYLOAD_SEPARATOR;
    private static final byte[] PAYLOAD_SUFFIX;
    private final String customEndpointUrl;
    private final InternalLogger internalLogger;

    static {
        Charset charset = a32.b;
        byte[] bytes = ",".getBytes(charset);
        bytes.getClass();
        PAYLOAD_SEPARATOR = bytes;
        byte[] bytes2 = "[".getBytes(charset);
        bytes2.getClass();
        PAYLOAD_PREFIX = bytes2;
        byte[] bytes3 = "]".getBytes(charset);
        bytes3.getClass();
        PAYLOAD_SUFFIX = bytes3;
    }

    public LogsRequestFactory(String str, InternalLogger internalLogger) {
        internalLogger.getClass();
        this.customEndpointUrl = str;
        this.internalLogger = internalLogger;
    }

    private final Map<String, String> buildHeaders(String requestId, String clientToken, String source, String sdkVersion) {
        return lc9.a0(new Pair("DD-API-KEY", clientToken), new Pair("DD-EVP-ORIGIN", source), new Pair("DD-EVP-ORIGIN-VERSION", sdkVersion), new Pair("DD-REQUEST-ID", requestId));
    }

    private final String buildUrl(String source, DatadogContext context) {
        Locale locale = Locale.US;
        String intakeEndpoint = this.customEndpointUrl;
        if (intakeEndpoint == null) {
            intakeEndpoint = context.getSite().getIntakeEndpoint();
        }
        return String.format(locale, "%s/api/v2/logs?%s=%s", Arrays.copyOf(new Object[]{intakeEndpoint, "ddsource", source}, 3));
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public Request create(DatadogContext context, RequestExecutionContext executionContext, List<RawBatchEvent> batchData, byte[] batchMetadata) {
        context.getClass();
        executionContext.getClass();
        batchData.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strBuildUrl = buildUrl(context.getSource(), context);
        Map<String, String> mapBuildHeaders = buildHeaders(string, context.getClientToken(), context.getSource(), context.getSdkVersion());
        List<RawBatchEvent> list = batchData;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RawBatchEvent) it.next()).getData());
        }
        return new Request(string, "Logs Request", strBuildUrl, mapBuildHeaders, ByteArrayExtKt.join(arrayList, PAYLOAD_SEPARATOR, PAYLOAD_PREFIX, PAYLOAD_SUFFIX, this.internalLogger), "application/json");
    }

    /* JADX INFO: renamed from: getCustomEndpointUrl$dd_sdk_android_logs_release, reason: from getter */
    public final String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }
}
