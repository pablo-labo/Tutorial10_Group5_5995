package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class exe {
    public static final b Companion = new b();
    public final String a;
    public final boolean b;
    public final boolean c;

    @sy3
    public static final /* synthetic */ class a implements sw5<exe> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.services.SubmitApplicationBody", aVar, 3);
            pluginGeneratedSerialDescriptor.k("response_set_id", true);
            pluginGeneratedSerialDescriptor.k("dry_run", true);
            pluginGeneratedSerialDescriptor.k("record_mode", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            ni1 ni1Var = ni1.a;
            return new KSerializer[]{qp1.b(mve.a), ni1Var, ni1Var};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            boolean zE = false;
            boolean zE2 = false;
            String str = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                    i |= 1;
                } else if (iP == 1) {
                    zE = ul2VarB.E(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    zE2 = ul2VarB.E(serialDescriptor, 2);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new exe(i, str, zE, zE2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            exe exeVar = (exe) obj;
            exeVar.getClass();
            boolean z = exeVar.c;
            boolean z2 = exeVar.b;
            String str = exeVar.a;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 0, mve.a, str);
            }
            if (vl2VarB.m(serialDescriptor) || z2) {
                vl2VarB.w(serialDescriptor, 1, z2);
            }
            if (vl2VarB.m(serialDescriptor) || z) {
                vl2VarB.w(serialDescriptor, 2, z);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<exe> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ exe(int i, String str, boolean z, boolean z2) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exe)) {
            return false;
        }
        exe exeVar = (exe) obj;
        return wl7.b(this.a, exeVar.a) && this.b == exeVar.b && this.c == exeVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + ia.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubmitApplicationBody(response_set_id=");
        sb.append(this.a);
        sb.append(", dry_run=");
        sb.append(this.b);
        sb.append(", record_mode=");
        return z3.o(sb, this.c, ")");
    }

    public exe() {
        this.a = null;
        this.b = false;
        this.c = false;
    }
}
