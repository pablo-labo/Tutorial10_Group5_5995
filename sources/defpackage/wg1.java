package defpackage;

import android.util.Pair;
import com.facebook.imagepipeline.request.a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class wg1 extends m2a<Pair<ot1, a.c>, n82<l82>> {
    public final am3 e;

    public wg1(am3 am3Var, xg1 xg1Var) {
        super(xg1Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.e = am3Var;
    }

    @Override // defpackage.m2a
    public final Closeable c(Closeable closeable) {
        return n82.v((n82) closeable);
    }

    @Override // defpackage.m2a
    public final Pair d(ppb ppbVar) {
        return Pair.create(this.e.a(ppbVar.Q(), ppbVar.a()), ppbVar.h0());
    }
}
