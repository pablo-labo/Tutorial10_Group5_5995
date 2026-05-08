package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class fr7 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f = {null, boa.E(qt8.b, new dp0(9)), null, null, null};
    public final String a;
    public final Map<String, JsonElement> b;
    public final boolean c;
    public final String d;
    public final String e;

    @sy3
    public static final /* synthetic */ class a implements sw5<fr7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.nav.JSTOnboardingTarget", aVar, 5);
            pluginGeneratedSerialDescriptor.k("experienceKey", false);
            pluginGeneratedSerialDescriptor.k("experienceData", false);
            pluginGeneratedSerialDescriptor.k("skipExempt", false);
            pluginGeneratedSerialDescriptor.k("origin", true);
            pluginGeneratedSerialDescriptor.k("from", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = fr7.f;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, lazyArr[1].getValue(), ni1.a, qp1.b(mveVar), qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = fr7.f;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strO = null;
            Map map = null;
            String str = null;
            String str2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    map = (Map) ul2VarB.z(serialDescriptor, 1, lazyArr[1].getValue(), map);
                    i |= 2;
                } else if (iP == 2) {
                    zE = ul2VarB.E(serialDescriptor, 2);
                    i |= 4;
                } else if (iP == 3) {
                    str = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    str2 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str2);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new fr7(i, strO, map, zE, str, str2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            fr7 fr7Var = (fr7) obj;
            fr7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = fr7.f;
            String str = fr7Var.a;
            String str2 = fr7Var.e;
            String str3 = fr7Var.d;
            vl2VarB.x(serialDescriptor, 0, str);
            vl2VarB.y(serialDescriptor, 1, lazyArr[1].getValue(), fr7Var.b);
            vl2VarB.w(serialDescriptor, 2, fr7Var.c);
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 3, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 4, mve.a, str2);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<fr7> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ fr7(int i, String str, Map map, boolean z, String str2, String str3) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = z;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr7)) {
            return false;
        }
        fr7 fr7Var = (fr7) obj;
        return wl7.b(this.a, fr7Var.a) && wl7.b(this.b, fr7Var.b) && this.c == fr7Var.c && wl7.b(this.d, fr7Var.d) && wl7.b(this.e, fr7Var.e);
    }

    public final int hashCode() {
        int iF = ia.f(k20.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSTOnboardingTarget(experienceKey=");
        sb.append(this.a);
        sb.append(", experienceData=");
        sb.append(this.b);
        sb.append(", skipExempt=");
        k6.k(", origin=", this.d, ", from=", sb, this.c);
        return l6.i(sb, this.e, ")");
    }
}
