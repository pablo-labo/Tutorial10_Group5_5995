package defpackage;

import com.facebook.react.modules.network.NetworkingModule;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class g3c extends ResponseBody {
    public final ResponseBody c;
    public final NetworkingModule.f d;
    public uqc e;
    public long f;

    public g3c(ResponseBody responseBody, NetworkingModule.f fVar) {
        responseBody.getClass();
        this.c = responseBody;
        this.d = fVar;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: K1 */
    public final to1 getE() {
        if (this.e == null) {
            this.e = new uqc(new f3c(this.c.getE(), this));
        }
        uqc uqcVar = this.e;
        if (uqcVar != null) {
            return uqcVar;
        }
        wl7.g("bufferedSource");
        throw null;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: p */
    public final long getD() {
        return this.c.getD();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: s */
    public final MediaType getC() {
        return this.c.getC();
    }
}
