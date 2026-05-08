package defpackage;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.a;

/* JADX INFO: loaded from: classes.dex */
public final class ma2 implements tlg<Integer> {
    public static final ma2 a = new ma2();

    @Override // defpackage.tlg
    public final Integer a(a aVar, float f) {
        boolean z = aVar.v() == a.b.a;
        if (z) {
            aVar.a();
        }
        double dNextDouble = aVar.nextDouble();
        double dNextDouble2 = aVar.nextDouble();
        double dNextDouble3 = aVar.nextDouble();
        double dNextDouble4 = aVar.v() == a.b.V ? aVar.nextDouble() : 1.0d;
        if (z) {
            aVar.p();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
