package defpackage;

import defpackage.ts7;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class qs7 {
    public static final b Companion = new b();
    public final String a;
    public final Integer b;
    public final ts7 c;

    @sy3
    public static final /* synthetic */ class a implements sw5<qs7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.profile.forms.JSTProfileSkill", aVar, 3);
            pluginGeneratedSerialDescriptor.k("text", false);
            pluginGeneratedSerialDescriptor.k("experience", false);
            pluginGeneratedSerialDescriptor.k("taxonomyConceptTitle", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{mve.a, qp1.b(rh7.a), qp1.b(ts7.a.a)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            Integer num = null;
            ts7 ts7Var = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    num = (Integer) ul2VarB.h(serialDescriptor, 1, rh7.a, num);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    ts7Var = (ts7) ul2VarB.h(serialDescriptor, 2, ts7.a.a, ts7Var);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new qs7(i, strO, num, ts7Var);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            qs7 qs7Var = (qs7) obj;
            qs7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.x(serialDescriptor, 0, qs7Var.a);
            vl2VarB.k(serialDescriptor, 1, rh7.a, qs7Var.b);
            vl2VarB.k(serialDescriptor, 2, ts7.a.a, qs7Var.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<qs7> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ qs7(int i, String str, Integer num, ts7 ts7Var) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = ts7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs7)) {
            return false;
        }
        qs7 qs7Var = (qs7) obj;
        return wl7.b(this.a, qs7Var.a) && wl7.b(this.b, qs7Var.b) && wl7.b(this.c, qs7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ts7 ts7Var = this.c;
        return iHashCode2 + (ts7Var != null ? ts7Var.hashCode() : 0);
    }

    public final String toString() {
        return "JSTProfileSkill(text=" + this.a + ", experience=" + this.b + ", taxonomyConceptTitle=" + this.c + ")";
    }

    public qs7(String str, Integer num, ts7 ts7Var) {
        str.getClass();
        this.a = str;
        this.b = num;
        this.c = ts7Var;
    }
}
