package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.a;

/* JADX INFO: loaded from: classes.dex */
public final class jeb implements tlg<PointF> {
    public static final jeb a = new jeb();

    @Override // defpackage.tlg
    public final PointF a(a aVar, float f) {
        a.b bVarV = aVar.v();
        if (bVarV != a.b.a && bVarV != a.b.c) {
            if (bVarV != a.b.V) {
                akb.o(bVarV, "Cannot convert json to point. Next token is ");
                return null;
            }
            PointF pointF = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
            while (aVar.hasNext()) {
                aVar.I();
            }
            return pointF;
        }
        return ec8.b(aVar, f);
    }
}
