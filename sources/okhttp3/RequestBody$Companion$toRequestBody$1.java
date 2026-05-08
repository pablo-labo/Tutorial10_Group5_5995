package okhttp3;

import defpackage.ro1;
import defpackage.vr1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType a;
    public final /* synthetic */ vr1 b;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, vr1 vr1Var) {
        this.a = mediaType;
        this.b = vr1Var;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.b.h();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getC() {
        return this.a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) {
        ro1Var.getClass();
        ro1Var.v0(this.b);
    }
}
