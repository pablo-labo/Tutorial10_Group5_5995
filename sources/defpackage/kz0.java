package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class kz0 {
    public static final b Companion = new b();
    public final int a;
    public final String b;
    public final String c;

    @sy3
    public /* synthetic */ class a implements sw5<kz0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.autocomplete.data.AutoCompleteCertificationPayload", aVar, 3);
            pluginGeneratedSerialDescriptor.k("score", false);
            pluginGeneratedSerialDescriptor.k("suggestion", false);
            pluginGeneratedSerialDescriptor.k("suid", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{rh7.a, mveVar, qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            int iM = 0;
            String strO = null;
            String str = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    iM = ul2VarB.m(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    strO = ul2VarB.o(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    str = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new kz0(strO, i, iM, str);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            kz0 kz0Var = (kz0) obj;
            kz0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            int i = kz0Var.a;
            String str = kz0Var.c;
            vl2VarB.r(0, i, serialDescriptor);
            vl2VarB.x(serialDescriptor, 1, kz0Var.b);
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 2, mve.a, str);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<kz0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ kz0(String str, int i, int i2, String str2) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, a.a.get$$serialDesc());
            throw null;
        }
        this.a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz0)) {
            return false;
        }
        kz0 kz0Var = (kz0) obj;
        return this.a == kz0Var.a && wl7.b(this.b, kz0Var.b) && wl7.b(this.c, kz0Var.c);
    }

    public final int hashCode() {
        int iD = akb.d(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return l6.i(m6.j(this.a, "AutoCompleteCertificationPayload(score=", ", suggestion=", this.b, ", suid="), this.c, ")");
    }
}
