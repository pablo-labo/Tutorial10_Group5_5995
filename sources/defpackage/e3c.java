package defpackage;

import com.facebook.react.modules.network.NetworkingModule;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public final class e3c extends RequestBody {
    public final RequestBody a;
    public final NetworkingModule.h b;
    public long c;

    public e3c(RequestBody requestBody, NetworkingModule.h hVar) {
        this.a = requestBody;
        this.b = hVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        if (this.c == 0) {
            this.c = this.a.contentLength();
        }
        return this.c;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getC() {
        return this.a.getC();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(ro1 ro1Var) {
        ro1Var.getClass();
        d3c d3cVar = new d3c(this, ro1Var.w());
        Logger logger = ppa.a;
        tqc tqcVar = new tqc(new dxa(d3cVar, new kmf()));
        contentLength();
        this.a.writeTo(tqcVar);
        tqcVar.flush();
    }
}
