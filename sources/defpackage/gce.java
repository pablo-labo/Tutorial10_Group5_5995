package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class gce {
    public static final boolean a(float f, float f2, v5b v5bVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        m80 m80VarA = p80.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            p80.b("Invalid rectangle, make sure no value is NaN");
        }
        if (m80VarA.b == null) {
            m80VarA.b = new RectF();
        }
        RectF rectF = m80VarA.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = m80VarA.a;
        RectF rectF2 = m80VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        m80 m80VarA2 = p80.a();
        m80VarA2.p(v5bVar, m80VarA, 1);
        boolean zIsEmpty = m80VarA2.a.isEmpty();
        m80VarA2.reset();
        m80VarA.reset();
        return !zIsEmpty;
    }

    public static final boolean b(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
