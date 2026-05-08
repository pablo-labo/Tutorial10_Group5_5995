package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class rz0 {
    public static final b Companion = new b();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    @sy3
    public /* synthetic */ class a implements sw5<rz0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.autocomplete.data.AutoCompleteWhatPayload", aVar, 8);
            pluginGeneratedSerialDescriptor.k("score", false);
            pluginGeneratedSerialDescriptor.k("suggestion", false);
            pluginGeneratedSerialDescriptor.k("employerKey", true);
            pluginGeneratedSerialDescriptor.k("intentConfidence", true);
            pluginGeneratedSerialDescriptor.k("squareLogo", true);
            pluginGeneratedSerialDescriptor.k("squareLogo64", true);
            pluginGeneratedSerialDescriptor.k("subQuery", true);
            pluginGeneratedSerialDescriptor.k("url", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{rh7.a, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            int iM = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            String strO6 = null;
            String strO7 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        iM = ul2VarB.m(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strO = ul2VarB.o(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strO2 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strO3 = ul2VarB.o(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strO4 = ul2VarB.o(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strO5 = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strO6 = ul2VarB.o(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        strO7 = ul2VarB.o(serialDescriptor, 7);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new rz0(i, iM, strO, strO2, strO3, strO4, strO5, strO6, strO7);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            rz0 rz0Var = (rz0) obj;
            rz0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            int i = rz0Var.a;
            String str = rz0Var.h;
            String str2 = rz0Var.g;
            String str3 = rz0Var.f;
            String str4 = rz0Var.e;
            String str5 = rz0Var.d;
            String str6 = rz0Var.c;
            vl2VarB.r(0, i, serialDescriptor);
            vl2VarB.x(serialDescriptor, 1, rz0Var.b);
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str6, "")) {
                vl2VarB.x(serialDescriptor, 2, str6);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str5, "")) {
                vl2VarB.x(serialDescriptor, 3, str5);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str4, "")) {
                vl2VarB.x(serialDescriptor, 4, str4);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str3, "")) {
                vl2VarB.x(serialDescriptor, 5, str3);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str2, "")) {
                vl2VarB.x(serialDescriptor, 6, str2);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str, "")) {
                vl2VarB.x(serialDescriptor, 7, str);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<rz0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ rz0(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, a.a.get$$serialDesc());
            throw null;
        }
        this.a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz0)) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        return this.a == rz0Var.a && wl7.b(this.b, rz0Var.b) && wl7.b(this.c, rz0Var.c) && wl7.b(this.d, rz0Var.d) && wl7.b(this.e, rz0Var.e) && wl7.b(this.f, rz0Var.f) && wl7.b(this.g, rz0Var.g) && wl7.b(this.h, rz0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbJ = m6.j(this.a, "AutoCompleteWhatPayload(score=", ", suggestion=", this.b, ", employerKey=");
        ia.r(sbJ, this.c, ", intentConfidence=", this.d, ", squareLogo=");
        ia.r(sbJ, this.e, ", squareLogo64=", this.f, ", subQuery=");
        return z3.n(sbJ, this.g, ", url=", this.h, ")");
    }
}
