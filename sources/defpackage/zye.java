package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class zye {
    public static final b Companion = new b();
    public final Integer a;
    public final Integer b;
    public final String c;

    @sy3
    public static final /* synthetic */ class a implements sw5<zye> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jobsearch.searchoverlay.data.SuggestionMatch", aVar, 3);
            pluginGeneratedSerialDescriptor.k("matchStart", true);
            pluginGeneratedSerialDescriptor.k("matchEnd", true);
            pluginGeneratedSerialDescriptor.k("suggestionText", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            rh7 rh7Var = rh7.a;
            return new KSerializer[]{qp1.b(rh7Var), qp1.b(rh7Var), mve.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            Integer num = null;
            Integer num2 = null;
            String strO = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    num = (Integer) ul2VarB.h(serialDescriptor, 0, rh7.a, num);
                    i |= 1;
                } else if (iP == 1) {
                    num2 = (Integer) ul2VarB.h(serialDescriptor, 1, rh7.a, num2);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    strO = ul2VarB.o(serialDescriptor, 2);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new zye(i, num, num2, strO);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            zye zyeVar = (zye) obj;
            zyeVar.getClass();
            Integer num = zyeVar.b;
            Integer num2 = zyeVar.a;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            if (vl2VarB.m(serialDescriptor) || num2 != null) {
                vl2VarB.k(serialDescriptor, 0, rh7.a, num2);
            }
            if (vl2VarB.m(serialDescriptor) || num != null) {
                vl2VarB.k(serialDescriptor, 1, rh7.a, num);
            }
            vl2VarB.x(serialDescriptor, 2, zyeVar.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<zye> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ zye(int i, Integer num, Integer num2, String str) {
        if (4 != (i & 4)) {
            ewa.M(i, 4, a.a.get$$serialDesc());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zye)) {
            return false;
        }
        zye zyeVar = (zye) obj;
        return wl7.b(this.a, zyeVar.a) && wl7.b(this.b, zyeVar.b) && wl7.b(this.c, zyeVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return this.c.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionMatch(matchStart=");
        sb.append(this.a);
        sb.append(", matchEnd=");
        sb.append(this.b);
        sb.append(", suggestionText=");
        return l6.i(sb, this.c, ")");
    }

    public zye(Integer num, Integer num2, String str) {
        str.getClass();
        this.a = num;
        this.b = num2;
        this.c = str;
    }
}
