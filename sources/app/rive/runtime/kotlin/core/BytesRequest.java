package app.rive.runtime.kotlin.core;

import com.android.volley.ParseError;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.j6g;
import defpackage.l6d;
import defpackage.m3d;
import defpackage.ol6;
import defpackage.wga;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/BytesRequest;", "Lm3d;", "", "", "url", "Lkotlin/Function1;", "Lj6g;", "onResponse", "Ll6d$a;", "errorListener", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ll6d$a;)V", "response", "deliverResponse", "([B)V", "Lwga;", "Ll6d;", "parseNetworkResponse", "(Lwga;)Ll6d;", "Lkotlin/jvm/functions/Function1;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class BytesRequest extends m3d<byte[]> {
    public static final int $stable = 0;
    private final Function1<byte[], j6g> onResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BytesRequest(String str, Function1<? super byte[], j6g> function1, l6d.a aVar) {
        super(0, str, aVar);
        str.getClass();
        function1.getClass();
        aVar.getClass();
        this.onResponse = function1;
    }

    @Override // defpackage.m3d
    public void deliverResponse(byte[] response) {
        response.getClass();
        this.onResponse.invoke(response);
    }

    @Override // defpackage.m3d
    public l6d<byte[]> parseNetworkResponse(wga response) {
        byte[] bArr;
        if (response != null) {
            try {
                bArr = response.b;
            } catch (Exception e) {
                return new l6d<>(new ParseError(e));
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new l6d<>(bArr, ol6.a(response));
    }
}
