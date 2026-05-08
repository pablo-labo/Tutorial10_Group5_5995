package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class twc {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    @sy3
    public /* synthetic */ class a implements sw5<twc> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.RefreshOnlineStatusesPayload", aVar, 5);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("accountKey", false);
            pluginGeneratedSerialDescriptor.k("advertiserKey", true);
            pluginGeneratedSerialDescriptor.k("accountType", false);
            pluginGeneratedSerialDescriptor.k("status", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, qp1.b(mveVar), mveVar, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String str = null;
            String strO3 = null;
            String strO4 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    strO2 = ul2VarB.o(serialDescriptor, 1);
                    i |= 2;
                } else if (iP == 2) {
                    str = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str);
                    i |= 4;
                } else if (iP == 3) {
                    strO3 = ul2VarB.o(serialDescriptor, 3);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    strO4 = ul2VarB.o(serialDescriptor, 4);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new twc(i, strO, strO2, str, strO3, strO4);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            twc twcVar = (twc) obj;
            twcVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            String str = twcVar.a;
            String str2 = twcVar.c;
            vl2VarB.x(serialDescriptor, 0, str);
            vl2VarB.x(serialDescriptor, 1, twcVar.b);
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 2, mve.a, str2);
            }
            vl2VarB.x(serialDescriptor, 3, twcVar.d);
            vl2VarB.x(serialDescriptor, 4, twcVar.e);
            vl2VarB.c(serialDescriptor);
        }
    }

    public static final class b {
        public final KSerializer<twc> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ twc(int i, String str, String str2, String str3, String str4, String str5) {
        if (27 != (i & 27)) {
            ewa.M(i, 27, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twc)) {
            return false;
        }
        twc twcVar = (twc) obj;
        return wl7.b(this.a, twcVar.a) && wl7.b(this.b, twcVar.b) && wl7.b(this.c, twcVar.c) && wl7.b(this.d, twcVar.d) && wl7.b(this.e, twcVar.e);
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + akb.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("RefreshOnlineStatusesPayload(id=", this.a, ", accountKey=", this.b, ", advertiserKey=");
        ia.r(sbF, this.c, ", accountType=", this.d, ", status=");
        return l6.i(sbF, this.e, ")");
    }
}
