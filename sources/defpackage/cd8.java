package defpackage;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes.dex */
public final class cd8 extends RequestBody {
    public final /* synthetic */ ok6 a;

    public cd8(ok6 ok6Var) {
        this.a = ok6Var;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.a.a();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getC() {
        MediaType.Companion companion = MediaType.e;
        String contentType = this.a.getContentType();
        companion.getClass();
        return MediaType.Companion.a(contentType);
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return this.a instanceof khg;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) {
        ro1Var.getClass();
        this.a.b(ro1Var);
    }
}
