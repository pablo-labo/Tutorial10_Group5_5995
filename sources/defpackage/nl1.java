package defpackage;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes2.dex */
public final class nl1 {
    public final float a;
    public final float b;
    public final Integer c;
    public final Float d;
    public final Float e;
    public final Boolean f;

    public static final class a {

        /* JADX INFO: renamed from: nl1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0334a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public static nl1 a(Context context, ReadableMap readableMap) {
            Integer num;
            Integer numValueOf;
            if (readableMap == null || !readableMap.hasKey("offsetX") || !readableMap.hasKey("offsetY")) {
                return null;
            }
            float f = (float) readableMap.getDouble("offsetX");
            float f2 = (float) readableMap.getDouble("offsetY");
            if (readableMap.hasKey("color")) {
                ReadableType type = readableMap.getType("color");
                int i = C0334a.a[type.ordinal()];
                if (i == 1) {
                    numValueOf = Integer.valueOf(readableMap.getInt("color"));
                } else {
                    if (i != 2) {
                        throw new JSApplicationCausedNativeException("Unsupported color type " + type);
                    }
                    numValueOf = ColorPropConverter.getColor(readableMap.getMap("color"), context);
                }
                num = numValueOf;
            } else {
                num = null;
            }
            return new nl1(f, f2, num, readableMap.hasKey("blurRadius") ? Float.valueOf((float) readableMap.getDouble("blurRadius")) : null, readableMap.hasKey("spreadDistance") ? Float.valueOf((float) readableMap.getDouble("spreadDistance")) : null, readableMap.hasKey("inset") ? Boolean.valueOf(readableMap.getBoolean("inset")) : null);
        }
    }

    public nl1(float f, float f2, Integer num, Float f3, Float f4, Boolean bool) {
        this.a = f;
        this.b = f2;
        this.c = num;
        this.d = f3;
        this.e = f4;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1Var = (nl1) obj;
        return Float.compare(this.a, nl1Var.a) == 0 && Float.compare(this.b, nl1Var.b) == 0 && wl7.b(this.c, nl1Var.c) && wl7.b(this.d, nl1Var.d) && wl7.b(this.e, nl1Var.e) && wl7.b(this.f, nl1Var.f);
    }

    public final int hashCode() {
        int iC = k6.c(Float.hashCode(this.a) * 31, this.b, 31);
        Integer num = this.c;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.d;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BoxShadow(offsetX=" + this.a + ", offsetY=" + this.b + ", color=" + this.c + ", blurRadius=" + this.d + ", spreadDistance=" + this.e + ", inset=" + this.f + ")";
    }
}
