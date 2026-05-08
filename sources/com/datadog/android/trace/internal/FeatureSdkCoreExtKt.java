package com.datadog.android.trace.internal;

import com.datadog.android.api.feature.FeatureSdkCore;
import defpackage.j6g;
import defpackage.l5;
import defpackage.lc9;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "", "traceId", "spanId", "Lj6g;", "addActiveTraceToContext", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Ljava/lang/String;)V", "removeActiveTraceFromContext", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "resolveActiveTraceContextName", "()Ljava/lang/String;", "SPAN_ID_KEY", "Ljava/lang/String;", "TRACE_ID_KEY", "dd-sdk-android-trace_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class FeatureSdkCoreExtKt {
    private static final String SPAN_ID_KEY = "span_id";
    private static final String TRACE_ID_KEY = "trace_id";

    public static final void addActiveTraceToContext(FeatureSdkCore featureSdkCore, String str, String str2) {
        featureSdkCore.getClass();
        str.getClass();
        str2.getClass();
        featureSdkCore.updateFeatureContext("tracing", new AnonymousClass1(resolveActiveTraceContextName(), str2, str));
    }

    public static final void removeActiveTraceFromContext(FeatureSdkCore featureSdkCore) {
        featureSdkCore.getClass();
        featureSdkCore.updateFeatureContext("tracing", new C06271(resolveActiveTraceContextName()));
    }

    private static final String resolveActiveTraceContextName() {
        return l5.l("context@", Thread.currentThread().getName());
    }

    /* JADX INFO: renamed from: com.datadog.android.trace.internal.FeatureSdkCoreExtKt$removeActiveTraceFromContext$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06271 extends mj8 implements Function1<Map<String, Object>, j6g> {
        final /* synthetic */ String $activeTraceContextName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06271(String str) {
            super(1);
            this.$activeTraceContextName = str;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Object> map) {
            map.getClass();
            map.remove(this.$activeTraceContextName);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
            invoke2(map);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.trace.internal.FeatureSdkCoreExtKt$addActiveTraceToContext$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lj6g;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<Map<String, Object>, j6g> {
        final /* synthetic */ String $activeTraceContextName;
        final /* synthetic */ String $spanId;
        final /* synthetic */ String $traceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3) {
            super(1);
            this.$activeTraceContextName = str;
            this.$spanId = str2;
            this.$traceId = str3;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, Object> map) {
            map.getClass();
            map.put(this.$activeTraceContextName, lc9.a0(new Pair(FeatureSdkCoreExtKt.SPAN_ID_KEY, this.$spanId), new Pair(FeatureSdkCoreExtKt.TRACE_ID_KEY, this.$traceId)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(Map<String, Object> map) {
            invoke2(map);
            return j6g.a;
        }
    }
}
