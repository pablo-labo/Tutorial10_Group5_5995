package defpackage;

import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: loaded from: classes3.dex */
public final class m6d<T> {
    public final Response a;
    public final T b;
    public final ResponseBody c;

    /* JADX WARN: Multi-variable type inference failed */
    public m6d(Response response, Object obj, ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1) {
        this.a = response;
        this.b = obj;
        this.c = responseBody$Companion$asResponseBody$1;
    }

    public final String toString() {
        return this.a.toString();
    }
}
