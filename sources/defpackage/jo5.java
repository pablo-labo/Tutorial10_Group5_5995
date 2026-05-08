package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;

/* JADX INFO: loaded from: classes.dex */
public final class jo5 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile loe<io5> b = new loe<>(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.g(115, new ko5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.g(130, new ko5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.g(150, new ko5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.g(180, new ko5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.g(UiRumDebugListener.DEFAULT_ALPHA, new ko5(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            j6g j6gVar = j6g.a;
        }
        if ((b.f(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ce7.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static io5 a(float f) {
        float f2;
        io5 io5VarI;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        io5 io5VarE = b.e(i);
        if (io5VarE != null) {
            return io5VarE;
        }
        loe<io5> loeVar = b;
        if (loeVar.a) {
            u63.i(loeVar);
        }
        int iA = pyd.a(loeVar.d, i, loeVar.b);
        if (iA >= 0) {
            return b.i(iA);
        }
        int i2 = -(iA + 1);
        int i3 = i2 - 1;
        if (i2 >= b.h()) {
            ko5 ko5Var = new ko5(new float[]{1.0f}, new float[]{f});
            b(f, ko5Var);
            return ko5Var;
        }
        if (i3 < 0) {
            io5VarI = new ko5(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.f(i3) / 100.0f;
            io5VarI = b.i(i3);
        }
        float f3 = b.f(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        io5 io5VarI2 = b.i(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fB = io5VarI.b(f4);
            fArr2[i4] = ((io5VarI2.b(f4) - fB) * fMax) + fB;
        }
        ko5 ko5Var2 = new ko5(fArr, fArr2);
        b(f, ko5Var2);
        return ko5Var2;
    }

    public static void b(float f, ko5 ko5Var) {
        synchronized (c) {
            loe<io5> loeVarClone = b.clone();
            loeVarClone.g((int) (f * 100.0f), ko5Var);
            b = loeVarClone;
            j6g j6gVar = j6g.a;
        }
    }
}
