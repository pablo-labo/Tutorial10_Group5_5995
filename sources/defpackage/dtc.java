package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class dtc {
    public static final b Companion = new b();
    public final boolean a;
    public final long b;
    public final long c;

    @sy3
    public static final /* synthetic */ class a implements sw5<dtc> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.utils.ReconnectionTriggerData", aVar, 3);
            pluginGeneratedSerialDescriptor.k("enableRollingReconnections", false);
            pluginGeneratedSerialDescriptor.k(NdkCrashLog.TIMESTAMP_KEY_NAME, false);
            pluginGeneratedSerialDescriptor.k("remainingMs", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            p59 p59Var = p59.a;
            return new KSerializer[]{ni1.a, p59Var, p59Var};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            int i = 0;
            boolean zE = false;
            long jF = 0;
            long jF2 = 0;
            boolean z = true;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    zE = ul2VarB.E(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    jF = ul2VarB.f(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    jF2 = ul2VarB.f(serialDescriptor, 2);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new dtc(i, zE, jF, jF2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            dtc dtcVar = (dtc) obj;
            dtcVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.w(serialDescriptor, 0, dtcVar.a);
            vl2VarB.D(serialDescriptor, 1, dtcVar.b);
            vl2VarB.D(serialDescriptor, 2, dtcVar.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<dtc> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ dtc(int i, boolean z, long j, long j2) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtc)) {
            return false;
        }
        dtc dtcVar = (dtc) obj;
        return this.a == dtcVar.a && this.b == dtcVar.b && this.c == dtcVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ia.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ReconnectionTriggerData(enableRollingReconnections=" + this.a + ", timestamp=" + this.b + ", remainingMs=" + this.c + ")";
    }
}
