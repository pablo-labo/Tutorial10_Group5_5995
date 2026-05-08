package okhttp3.internal.http;

import defpackage.to1;
import defpackage.uqc;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealResponseBody extends ResponseBody {
    public final String c;
    public final long d;
    public final uqc e;

    public RealResponseBody(String str, long j, uqc uqcVar) {
        this.c = str;
        this.d = j;
        this.e = uqcVar;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: K1 */
    public final to1 getE() {
        return this.e;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getD() {
        return this.d;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: s */
    public final MediaType getC() {
        String str = this.c;
        if (str != null) {
            MediaType.e.getClass();
            try {
                return MediaType.Companion.a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
