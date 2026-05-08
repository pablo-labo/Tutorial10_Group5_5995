package com.datadog.android.trace.internal.utils;

import defpackage.eoe;
import defpackage.sc3;
import defpackage.zve;
import java.math.BigInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Leoe;", "", "traceIdAsHexString", "(Leoe;)Ljava/lang/String;", "", "TRACE_ID_REQUIRED_LENGTH", "I", "HEX_RADIX", "dd-sdk-android-trace_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class SpanContextExtKt {
    private static final int HEX_RADIX = 16;
    private static final int TRACE_ID_REQUIRED_LENGTH = 32;

    public static final String traceIdAsHexString(eoe eoeVar) {
        BigInteger bigInteger;
        String string;
        String strZ;
        eoeVar.getClass();
        sc3 sc3Var = eoeVar instanceof sc3 ? (sc3) eoeVar : null;
        return (sc3Var == null || (bigInteger = sc3Var.d) == null || (string = bigInteger.toString(16)) == null || (strZ = zve.Z(32, string)) == null) ? "" : strZ;
    }
}
