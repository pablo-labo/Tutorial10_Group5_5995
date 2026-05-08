package defpackage;

import defpackage.qa5;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;

/* JADX INFO: loaded from: classes3.dex */
public final class v13 extends RequestBody {
    public final RequestBody$Companion$asRequestBody$1 a;
    public final qa5.i b;

    public v13(RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1, qa5.i iVar) {
        this.a = requestBody$Companion$asRequestBody$1;
        this.b = iVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.a.b.length();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getC() {
        return this.a.a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) {
        ro1Var.getClass();
        tqc tqcVar = new tqc(new x13(ro1Var, this, this.b));
        this.a.writeTo(tqcVar);
        tqcVar.flush();
    }
}
