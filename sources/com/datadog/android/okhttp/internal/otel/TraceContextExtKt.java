package com.datadog.android.okhttp.internal.otel;

import com.datadog.android.okhttp.TraceContext;
import defpackage.bs4;
import defpackage.eoe;
import defpackage.l55;
import java.math.BigInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/okhttp/TraceContext;", "Leoe;", "toOpenTracingContext", "(Lcom/datadog/android/okhttp/TraceContext;)Leoe;", "", "value", "Ljava/math/BigInteger;", "parseToBigInteger", "(Ljava/lang/String;)Ljava/math/BigInteger;", "", "BASE_16_RADIX", "I", "dd-sdk-android-okhttp_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class TraceContextExtKt {
    private static final int BASE_16_RADIX = 16;

    private static final BigInteger parseToBigInteger(String str) {
        try {
            return new BigInteger(str, 16);
        } catch (ArithmeticException unused) {
            BigInteger bigInteger = BigInteger.ZERO;
            bigInteger.getClass();
            return bigInteger;
        } catch (NumberFormatException unused2) {
            BigInteger bigInteger2 = BigInteger.ZERO;
            bigInteger2.getClass();
            return bigInteger2;
        }
    }

    public static final eoe toOpenTracingContext(TraceContext traceContext) {
        traceContext.getClass();
        BigInteger toBigInteger = parseToBigInteger(traceContext.getTraceId());
        BigInteger toBigInteger2 = parseToBigInteger(traceContext.getSpanId());
        int samplingPriority = traceContext.getSamplingPriority();
        bs4 bs4Var = bs4.a;
        return new l55(toBigInteger, toBigInteger2, samplingPriority, null, bs4Var, bs4Var);
    }
}
