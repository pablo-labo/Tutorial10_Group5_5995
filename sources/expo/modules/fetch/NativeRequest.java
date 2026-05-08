package expo.modules.fetch;

import defpackage.e4d;
import defpackage.gk0;
import defpackage.h4;
import defpackage.q6d;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/fetch/NativeRequest;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeRequest extends SharedObject {
    public final NativeResponse c;
    public final e4d d;
    public RealCall e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeRequest(gk0 gk0Var, NativeResponse nativeResponse) {
        super(gk0Var.b);
        nativeResponse.getClass();
        this.c = nativeResponse;
        e4d e4dVar = new e4d();
        e4dVar.a = null;
        this.d = e4dVar;
    }

    public final void Q() {
        RealCall realCall = this.e;
        if (realCall == null) {
            return;
        }
        realCall.cancel();
        NativeResponse nativeResponse = this.c;
        nativeResponse.getClass();
        FetchRequestCanceledException fetchRequestCanceledException = new FetchRequestCanceledException();
        nativeResponse.W = fetchRequestCanceledException;
        if (nativeResponse.Q() == q6d.BODY_STREAMING_STARTED) {
            nativeResponse.v("didFailWithError", h4.t(fetchRequestCanceledException));
        }
        nativeResponse.b0(q6d.ERROR_RECEIVED);
    }
}
