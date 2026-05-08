package com.datadog.android.rum.internal.net;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.net.Request;
import com.datadog.android.api.net.RequestExecutionContext;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.internal.utils.ByteArrayExtKt;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.domain.event.RumViewEventFilter;
import defpackage.a32;
import defpackage.gu5;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.t92;
import defpackage.z92;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J8\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020 H\u0002R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/datadog/android/rum/internal/net/RumRequestFactory;", "Lcom/datadog/android/api/net/RequestFactory;", "customEndpointUrl", "", "viewEventFilter", "Lcom/datadog/android/rum/internal/domain/event/RumViewEventFilter;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/event/RumViewEventFilter;Lcom/datadog/android/api/InternalLogger;)V", "getCustomEndpointUrl$dd_sdk_android_rum_release", "()Ljava/lang/String;", "buildHeaders", "", "requestId", "idempotencyKey", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/datadog/android/api/context/DatadogContext;", "buildTags", "serviceName", "version", "sdkVersion", "env", "variant", "executionContext", "Lcom/datadog/android/api/net/RequestExecutionContext;", "buildUrl", "create", "Lcom/datadog/android/api/net/Request;", "batchData", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchMetadata", "", "byteArray", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumRequestFactory implements RequestFactory {
    public static final String LAST_FAILURE_STATUS_KEY = "last_failure_status";
    private static final byte[] PAYLOAD_SEPARATOR;
    public static final String RETRY_COUNT_KEY = "retry_count";
    private static final String SHA1_GENERATION_ERROR_MESSAGE = "Cannot generate SHA-1 hash for rum request idempotency key.";
    private static final String SHA1_NO_SUCH_ALGORITHM_EXCEPTION = "SHA-1 algorithm could not be found in MessageDigest.";
    private final String customEndpointUrl;
    private final InternalLogger internalLogger;
    private final RumViewEventFilter viewEventFilter;

    static {
        byte[] bytes = "\n".getBytes(a32.b);
        bytes.getClass();
        PAYLOAD_SEPARATOR = bytes;
    }

    public RumRequestFactory(String str, RumViewEventFilter rumViewEventFilter, InternalLogger internalLogger) {
        rumViewEventFilter.getClass();
        internalLogger.getClass();
        this.customEndpointUrl = str;
        this.viewEventFilter = rumViewEventFilter;
        this.internalLogger = internalLogger;
    }

    private final Map<String, String> buildHeaders(String requestId, String idempotencyKey, DatadogContext context) {
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair("DD-API-KEY", context.getClientToken()), new Pair("DD-EVP-ORIGIN", context.getSource()), new Pair("DD-EVP-ORIGIN-VERSION", context.getSdkVersion()), new Pair("DD-REQUEST-ID", requestId));
        if (idempotencyKey != null) {
            linkedHashMapB0.put("DD-IDEMPOTENCY-KEY", idempotencyKey);
        }
        return linkedHashMapB0;
    }

    private final String buildTags(String serviceName, String version, String sdkVersion, String env, String variant, RequestExecutionContext executionContext) {
        StringBuilder sb = new StringBuilder();
        sb.append("service:" + serviceName);
        sb.append(",");
        sb.append("version:" + version);
        sb.append(",");
        sb.append("sdk_version:" + sdkVersion);
        sb.append(",");
        sb.append("env:" + env);
        if (variant.length() > 0) {
            sb.append(",");
            sb.append("variant:" + variant);
        }
        if (executionContext.getPreviousResponseCode() != null) {
            sb.append(",");
            sb.append("retry_count:" + executionContext.getAttemptNumber());
            sb.append(",");
            sb.append("last_failure_status:" + executionContext.getPreviousResponseCode());
        }
        return sb.toString();
    }

    private final String buildUrl(DatadogContext context, RequestExecutionContext executionContext) {
        Map mapA0 = lc9.a0(new Pair("ddsource", context.getSource()), new Pair("ddtags", buildTags(context.getService(), context.getVersion(), context.getSdkVersion(), context.getEnv(), context.getVariant(), executionContext)));
        Locale locale = Locale.US;
        String intakeEndpoint = this.customEndpointUrl;
        if (intakeEndpoint == null) {
            intakeEndpoint = context.getSite().getIntakeEndpoint();
        }
        String str = String.format(locale, "%s/api/v2/rum", Arrays.copyOf(new Object[]{intakeEndpoint}, 1));
        ArrayList arrayList = new ArrayList(mapA0.size());
        for (Map.Entry entry : mapA0.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        return str.concat(z92.W0(arrayList, "&", CoreFeature.DEFAULT_APP_VERSION, null, null, 60));
    }

    private final String idempotencyKey(byte[] byteArray) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(byteArray);
            bArrDigest.getClass();
            return ByteArrayExtKt.toHexString(bArrDigest);
        } catch (IllegalArgumentException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass2.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        } catch (NullPointerException e2) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass4.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
            return null;
        } catch (DigestException e3) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass1.INSTANCE, (Throwable) e3, false, (Map) null, 48, (Object) null);
            return null;
        } catch (NoSuchAlgorithmException e4) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) AnonymousClass3.INSTANCE, (Throwable) e4, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public Request create(DatadogContext context, RequestExecutionContext executionContext, List<RawBatchEvent> batchData, byte[] batchMetadata) {
        context.getClass();
        executionContext.getClass();
        batchData.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        List<RawBatchEvent> listFilterOutRedundantViewEvents = this.viewEventFilter.filterOutRedundantViewEvents(batchData);
        ArrayList arrayList = new ArrayList(t92.r0(listFilterOutRedundantViewEvents, 10));
        Iterator<T> it = listFilterOutRedundantViewEvents.iterator();
        while (it.hasNext()) {
            arrayList.add(((RawBatchEvent) it.next()).getData());
        }
        String strIdempotencyKey = idempotencyKey(com.datadog.android.core.internal.utils.ByteArrayExtKt.join$default(arrayList, PAYLOAD_SEPARATOR, null, null, this.internalLogger, 6, null));
        String strBuildUrl = buildUrl(context, executionContext);
        Map<String, String> mapBuildHeaders = buildHeaders(string, strIdempotencyKey, context);
        List<RawBatchEvent> listFilterOutRedundantViewEvents2 = this.viewEventFilter.filterOutRedundantViewEvents(batchData);
        ArrayList arrayList2 = new ArrayList(t92.r0(listFilterOutRedundantViewEvents2, 10));
        Iterator<T> it2 = listFilterOutRedundantViewEvents2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((RawBatchEvent) it2.next()).getData());
        }
        return new Request(string, "RUM Request", strBuildUrl, mapBuildHeaders, com.datadog.android.core.internal.utils.ByteArrayExtKt.join$default(arrayList2, PAYLOAD_SEPARATOR, null, null, this.internalLogger, 6, null), "text/plain;charset=UTF-8");
    }

    /* JADX INFO: renamed from: getCustomEndpointUrl$dd_sdk_android_rum_release, reason: from getter */
    public final String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumRequestFactory.SHA1_GENERATION_ERROR_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumRequestFactory.SHA1_GENERATION_ERROR_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumRequestFactory.SHA1_NO_SUCH_ALGORITHM_EXCEPTION;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass4 extends mj8 implements gu5<String> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return RumRequestFactory.SHA1_GENERATION_ERROR_MESSAGE;
        }
    }
}
