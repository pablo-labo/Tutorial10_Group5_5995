package defpackage;

import android.util.Pair;
import com.facebook.imagepipeline.request.a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class ts4 extends m2a<Pair<ot1, a.c>, vs4> {
    public final am3 e;

    public ts4(am3 am3Var, opb opbVar) {
        super(opbVar, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt");
        this.e = am3Var;
    }

    @Override // defpackage.m2a
    public final Closeable c(Closeable closeable) {
        return vs4.a((vs4) closeable);
    }

    @Override // defpackage.m2a
    public final Pair d(ppb ppbVar) {
        return Pair.create(this.e.b(ppbVar.Q(), ppbVar.a()), ppbVar.h0());
    }
}
