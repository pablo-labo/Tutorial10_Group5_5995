package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class dad {
    public static final b Companion = new b();
    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public final int e;

    @sy3
    public /* synthetic */ class a implements sw5<dad> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.RetryConfig", aVar, 5);
            pluginGeneratedSerialDescriptor.k("waitMs", false);
            pluginGeneratedSerialDescriptor.k("multiplier", false);
            pluginGeneratedSerialDescriptor.k("maxAttempts", false);
            pluginGeneratedSerialDescriptor.k("jitter", false);
            pluginGeneratedSerialDescriptor.k("maxWaitMs", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            rh7 rh7Var = rh7.a;
            ei5 ei5Var = ei5.a;
            return new KSerializer[]{rh7Var, ei5Var, rh7Var, ei5Var, rh7Var};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            int i = 0;
            int iM = 0;
            int iM2 = 0;
            int iM3 = 0;
            float fV = 0.0f;
            float fV2 = 0.0f;
            boolean z = true;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    iM = ul2VarB.m(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    fV = ul2VarB.v(serialDescriptor, 1);
                    i |= 2;
                } else if (iP == 2) {
                    iM2 = ul2VarB.m(serialDescriptor, 2);
                    i |= 4;
                } else if (iP == 3) {
                    fV2 = ul2VarB.v(serialDescriptor, 3);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    iM3 = ul2VarB.m(serialDescriptor, 4);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new dad(i, iM, fV, iM2, fV2, iM3);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            dad dadVar = (dad) obj;
            dadVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.r(0, dadVar.a, serialDescriptor);
            vl2VarB.q(serialDescriptor, 1, dadVar.b);
            vl2VarB.r(2, dadVar.c, serialDescriptor);
            vl2VarB.q(serialDescriptor, 3, dadVar.d);
            vl2VarB.r(4, dadVar.e, serialDescriptor);
            vl2VarB.c(serialDescriptor);
        }
    }

    public static final class b {
        public final KSerializer<dad> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ dad(int i, int i2, float f, int i3, float f2, int i4) {
        if (31 != (i & 31)) {
            ewa.M(i, 31, a.a.get$$serialDesc());
            throw null;
        }
        this.a = i2;
        this.b = f;
        this.c = i3;
        this.d = f2;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dad)) {
            return false;
        }
        dad dadVar = (dad) obj;
        return this.a == dadVar.a && Float.compare(this.b, dadVar.b) == 0 && this.c == dadVar.c && Float.compare(this.d, dadVar.d) == 0 && this.e == dadVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + k6.c(w40.c(this.c, k6.c(Integer.hashCode(this.a) * 31, this.b, 31), 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetryConfig(waitMs=");
        sb.append(this.a);
        sb.append(", multiplier=");
        sb.append(this.b);
        sb.append(", maxAttempts=");
        sb.append(this.c);
        sb.append(", jitter=");
        sb.append(this.d);
        sb.append(", maxWaitMs=");
        return w20.k(sb, this.e, ")");
    }

    public dad() {
        this.a = 3000;
        this.b = 2.0f;
        this.c = 5;
        this.d = 0.2f;
        this.e = 300000;
    }
}
