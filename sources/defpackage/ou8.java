package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes2.dex */
public final class ou8 {
    public final float a;
    public final pu8 b;

    public static final class a {

        /* JADX INFO: renamed from: ou8$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0381a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public static ou8 a(Dynamic dynamic) {
            dynamic.getClass();
            int i = C0381a.a[dynamic.getType().ordinal()];
            if (i == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d) {
                    return new ou8((float) dAsDouble, pu8.a);
                }
            } else {
                if (i != 2) {
                    s55.n("ReactNative", "Unsupported type for radius property: " + dynamic.getType());
                    return null;
                }
                String strAsString = dynamic.asString();
                if (strAsString == null || !wve.D(strAsString, "%", false)) {
                    s55.n("ReactNative", "Invalid string value: " + strAsString);
                    return null;
                }
                try {
                    float f = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
                    if (f >= 0.0f) {
                        return new ou8(f, pu8.b);
                    }
                } catch (NumberFormatException unused) {
                    s55.n("ReactNative", "Invalid percentage format: ".concat(strAsString));
                    return null;
                }
            }
            return null;
        }
    }

    public ou8(float f, pu8 pu8Var) {
        this.a = f;
        this.b = pu8Var;
    }

    public final float a(float f) {
        pu8 pu8Var = this.b;
        pu8 pu8Var2 = pu8.b;
        float f2 = this.a;
        return pu8Var == pu8Var2 ? (f2 / 100.0f) * f : f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou8)) {
            return false;
        }
        ou8 ou8Var = (ou8) obj;
        return Float.compare(this.a, ou8Var.a) == 0 && this.b == ou8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LengthPercentage(value=" + this.a + ", type=" + this.b + ")";
    }
}
