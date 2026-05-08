package okhttp3;

import defpackage.to1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    public final /* synthetic */ MediaType c;
    public final /* synthetic */ long d;
    public final /* synthetic */ to1 e;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, to1 to1Var) {
        this.c = mediaType;
        this.d = j;
        this.e = to1Var;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: K1, reason: from getter */
    public final to1 getE() {
        return this.e;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getD() {
        return this.d;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: s, reason: from getter */
    public final MediaType getC() {
        return this.c;
    }
}
