package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class yx4 {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    @sy3
    public static final /* synthetic */ class a implements sw5<yx4> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.utils.EventData", aVar, 4);
            pluginGeneratedSerialDescriptor.k("uuid", false);
            pluginGeneratedSerialDescriptor.k("eventType", false);
            pluginGeneratedSerialDescriptor.k("payload", false);
            pluginGeneratedSerialDescriptor.k("eventTime", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, p59.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            long jF = 0;
            boolean z = true;
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
                    strO3 = ul2VarB.o(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iP != 3) {
                        b0.m(iP);
                        return null;
                    }
                    jF = ul2VarB.f(serialDescriptor, 3);
                    i |= 8;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new yx4(i, jF, strO, strO2, strO3);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            yx4 yx4Var = (yx4) obj;
            yx4Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, yx4Var.a);
            vl2VarB.x(serialDescriptor, 1, yx4Var.b);
            vl2VarB.x(serialDescriptor, 2, yx4Var.c);
            vl2VarB.D(serialDescriptor, 3, yx4Var.d);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<yx4> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ yx4(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx4)) {
            return false;
        }
        yx4 yx4Var = (yx4) obj;
        return wl7.b(this.a, yx4Var.a) && wl7.b(this.b, yx4Var.b) && wl7.b(this.c, yx4Var.c) && this.d == yx4Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("EventData(uuid=", this.a, ", eventType=", this.b, ", payload=");
        sbF.append(this.c);
        sbF.append(", eventTime=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
