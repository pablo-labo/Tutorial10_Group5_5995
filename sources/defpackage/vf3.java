package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.trace.internal.domain.event.BigIntegerUtils;
import defpackage.pk6;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class vf3 implements pk6.d {
    public final BigIntegerUtils a = BigIntegerUtils.INSTANCE;

    @Override // pk6.d
    public final void a(sc3 sc3Var, uif uifVar) {
        BigInteger bigInteger = sc3Var.d;
        BigIntegerUtils bigIntegerUtils = this.a;
        String strLeastSignificant64BitsAsDecimal = bigIntegerUtils.leastSignificant64BitsAsDecimal(bigInteger);
        String strMostSignificant64BitsAsHex = bigIntegerUtils.mostSignificant64BitsAsHex(bigInteger);
        uifVar.a(TracingInterceptor.DATADOG_LEAST_SIGNIFICANT_64_BITS_TRACE_ID_HEADER, strLeastSignificant64BitsAsDecimal);
        uifVar.a(TracingInterceptor.DATADOG_SPAN_ID_HEADER, sc3Var.e.toString());
        rc3 rc3VarW = sc3Var.b.w();
        String str = rc3VarW != null ? rc3VarW.b.m : sc3Var.m;
        if (str != null) {
            uifVar.a(TracingInterceptor.DATADOG_ORIGIN_HEADER, str);
        }
        for (Map.Entry entry : sc3Var.c.entrySet()) {
            String str2 = "ot-baggage-" + ((String) entry.getKey());
            String strEncode = (String) entry.getValue();
            try {
                strEncode = URLEncoder.encode(strEncode, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
            uifVar.a(str2, strEncode);
        }
        uifVar.a(TracingInterceptor.DATADOG_TAGS_HEADER, "_dd.p.tid=" + strMostSignificant64BitsAsHex);
        if (sc3Var.d()) {
            uifVar.a(TracingInterceptor.DATADOG_SAMPLING_PRIORITY_HEADER, String.valueOf(sc3Var.c()));
        }
    }
}
