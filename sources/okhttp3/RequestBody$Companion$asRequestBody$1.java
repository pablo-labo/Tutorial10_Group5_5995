package okhttp3;

import defpackage.c0h;
import defpackage.hf7;
import defpackage.ro1;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$asRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType a;
    public final /* synthetic */ File b;

    public RequestBody$Companion$asRequestBody$1(MediaType mediaType, File file) {
        this.a = mediaType;
        this.b = file;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.b.length();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getA() {
        return this.a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) {
        ro1Var.getClass();
        hf7 hf7VarR = c0h.R(this.b);
        try {
            ro1Var.a1(hf7VarR);
            hf7VarR.close();
        } finally {
        }
    }
}
