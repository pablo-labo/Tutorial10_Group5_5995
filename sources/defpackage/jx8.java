package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class jx8 implements hb6 {
    public final a a;
    public final ArrayList b;

    public static abstract class a {

        /* JADX INFO: renamed from: jx8$a$a, reason: collision with other inner class name */
        public static final class C0286a extends a {
            public final double a;

            public C0286a(double d) {
                this.a = d;
            }
        }

        public static final class b extends a {
            public final c a;

            public b(c cVar) {
                this.a = cVar;
            }
        }

        public enum c {
            /* JADX INFO: Fake field, exist only in values array */
            TO_TOP_RIGHT("to top right"),
            /* JADX INFO: Fake field, exist only in values array */
            TO_BOTTOM_RIGHT("to bottom right"),
            /* JADX INFO: Fake field, exist only in values array */
            TO_TOP_LEFT("to top left"),
            /* JADX INFO: Fake field, exist only in values array */
            TO_BOTTOM_LEFT("to bottom left");

            public static final C0287a a = new C0287a();
            private final String value;

            /* JADX INFO: renamed from: jx8$a$c$a, reason: collision with other inner class name */
            public static final class C0287a {
            }

            c(String str) {
                this.value = str;
            }

            public final String a() {
                return this.value;
            }
        }
    }

    public jx8(a aVar, ArrayList arrayList) {
        this.a = aVar;
        this.b = arrayList;
    }

    @Override // defpackage.hb6
    public final Shader a(float f, float f2) throws Throwable {
        Throwable th;
        double d;
        double degrees;
        Pair pair;
        Pair pair2;
        a aVar = this.a;
        if (aVar instanceof a.C0286a) {
            degrees = ((a.C0286a) aVar).a;
            th = null;
            d = 270.0d;
        } else {
            if (!(aVar instanceof a.b)) {
                l.g();
                return null;
            }
            double d2 = f;
            th = null;
            d = 270.0d;
            double d3 = f2;
            int iOrdinal = ((a.b) aVar).a.ordinal();
            if (iOrdinal == 0) {
                degrees = 90.0d - Math.toDegrees(Math.atan(d2 / d3));
            } else if (iOrdinal == 1) {
                degrees = Math.toDegrees(Math.atan(d2 / d3)) + 90.0d;
            } else if (iOrdinal == 2) {
                degrees = Math.toDegrees(Math.atan(d2 / d3)) + 270.0d;
            } else {
                if (iOrdinal != 3) {
                    l.g();
                    return null;
                }
                degrees = Math.toDegrees(Math.atan(d3 / d2)) + 180.0d;
            }
        }
        double d4 = degrees % 360.0d;
        if (d4 < 0.0d) {
            d4 += 360.0d;
        }
        if (d4 == 0.0d) {
            pair = new Pair(new float[]{0.0f, f2}, new float[]{0.0f, 0.0f});
        } else {
            if (d4 == 90.0d) {
                pair2 = new Pair(new float[]{0.0f, 0.0f}, new float[]{f, 0.0f});
            } else if (d4 == 180.0d) {
                pair = new Pair(new float[]{0.0f, 0.0f}, new float[]{0.0f, f2});
            } else if (d4 == d) {
                pair2 = new Pair(new float[]{f, 0.0f}, new float[]{0.0f, 0.0f});
            } else {
                float fTan = (float) Math.tan(Math.toRadians(90.0d - d4));
                float f3 = (-1.0f) / fTan;
                float f4 = f2 / 2.0f;
                float f5 = f / 2.0f;
                float[] fArr = d4 < 90.0d ? new float[]{f5, f4} : d4 < 180.0d ? new float[]{f5, -f4} : d4 < d ? new float[]{-f5, -f4} : new float[]{-f5, f4};
                float f6 = fArr[1] - (fArr[0] * f3);
                float f7 = f6 / (fTan - f3);
                float f8 = (f3 * f7) + f6;
                pair = new Pair(new float[]{f5 - f7, f4 + f8}, new float[]{f5 + f7, f4 - f8});
            }
            pair = pair2;
        }
        float[] fArr2 = (float[]) pair.a();
        float[] fArr3 = (float[]) pair.b();
        float f9 = fArr3[0] - fArr2[0];
        float f10 = fArr3[1] - fArr2[1];
        ArrayList arrayListL = mh2.l(this.b, (float) Math.sqrt((f10 * f10) + (f9 * f9)));
        int[] iArr = new int[arrayListL.size()];
        float[] fArr4 = new float[arrayListL.size()];
        int i = 0;
        for (Object obj : arrayListL) {
            int i2 = i + 1;
            if (i < 0) {
                u63.o0();
                throw th;
            }
            job jobVar = (job) obj;
            Integer num = jobVar.a;
            Float f11 = jobVar.b;
            if (num != null && f11 != null) {
                iArr[i] = num.intValue();
                fArr4[i] = f11.floatValue();
            }
            i = i2;
        }
        return new LinearGradient(fArr2[0], fArr2[1], fArr3[0], fArr3[1], iArr, fArr4, Shader.TileMode.CLAMP);
    }
}
