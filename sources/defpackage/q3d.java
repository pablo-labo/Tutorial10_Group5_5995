package defpackage;

import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public final class q3d extends RequestBody {
    public final /* synthetic */ MediaType a;
    public final /* synthetic */ InputStream b;

    public q3d(MediaType mediaType, InputStream inputStream) {
        this.a = mediaType;
        this.b = inputStream;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        try {
            return this.b.available();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getA() {
        return this.a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) {
        ro1Var.getClass();
        hf7 hf7VarS = null;
        try {
            hf7VarS = c0h.S(this.b);
            ro1Var.a1(hf7VarS);
            try {
                hf7VarS.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            if (hf7VarS != null) {
                try {
                    hf7VarS.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }
}
