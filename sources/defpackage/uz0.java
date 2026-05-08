package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class uz0 {
    public static final b Companion = new b();
    public final float a;
    public final float b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    @sy3
    public /* synthetic */ class a implements sw5<uz0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.autocomplete.data.AutoCompleteWherePayload", aVar, 6);
            pluginGeneratedSerialDescriptor.k("latitude", false);
            pluginGeneratedSerialDescriptor.k("longitude", false);
            pluginGeneratedSerialDescriptor.k("locationType", false);
            pluginGeneratedSerialDescriptor.k("popularity", false);
            pluginGeneratedSerialDescriptor.k("population", false);
            pluginGeneratedSerialDescriptor.k("suggestion", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            ei5 ei5Var = ei5.a;
            mve mveVar = mve.a;
            rh7 rh7Var = rh7.a;
            return new KSerializer[]{ei5Var, ei5Var, mveVar, rh7Var, rh7Var, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            int i = 0;
            int iM = 0;
            int iM2 = 0;
            float fV = 0.0f;
            float fV2 = 0.0f;
            String strO = null;
            String strO2 = null;
            boolean z = true;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        fV = ul2VarB.v(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        fV2 = ul2VarB.v(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strO = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        iM = ul2VarB.m(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        iM2 = ul2VarB.m(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strO2 = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new uz0(i, fV, fV2, strO, iM, iM2, strO2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            uz0 uz0Var = (uz0) obj;
            uz0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.q(serialDescriptor, 0, uz0Var.a);
            vl2VarB.q(serialDescriptor, 1, uz0Var.b);
            vl2VarB.x(serialDescriptor, 2, uz0Var.c);
            vl2VarB.r(3, uz0Var.d, serialDescriptor);
            vl2VarB.r(4, uz0Var.e, serialDescriptor);
            vl2VarB.x(serialDescriptor, 5, uz0Var.f);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<uz0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ uz0(int i, float f, float f2, String str, int i2, int i3, String str2) {
        if (63 != (i & 63)) {
            ewa.M(i, 63, a.a.get$$serialDesc());
            throw null;
        }
        this.a = f;
        this.b = f2;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz0)) {
            return false;
        }
        uz0 uz0Var = (uz0) obj;
        return Float.compare(this.a, uz0Var.a) == 0 && Float.compare(this.b, uz0Var.b) == 0 && wl7.b(this.c, uz0Var.c) && this.d == uz0Var.d && this.e == uz0Var.e && wl7.b(this.f, uz0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + w40.c(this.e, w40.c(this.d, akb.d(k6.c(Float.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        return "AutoCompleteWherePayload(latitude=" + this.a + ", longitude=" + this.b + ", locationType=" + this.c + ", popularity=" + this.d + ", population=" + this.e + ", suggestion=" + this.f + ")";
    }
}
