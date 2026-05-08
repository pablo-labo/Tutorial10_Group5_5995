package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class jt7 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] d = {boa.E(qt8.b, new jr(17)), null, null};
    public final it7 a;
    public final String b;
    public final String c;

    @sy3
    public static final /* synthetic */ class a implements sw5<jt7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.nav.search.JSTSearchOverlayArgs", aVar, 3);
            pluginGeneratedSerialDescriptor.k("mode", false);
            pluginGeneratedSerialDescriptor.k("initialWhat", false);
            pluginGeneratedSerialDescriptor.k("initialWhere", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{jt7.d[0].getValue(), qp1.b(mveVar), qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = jt7.d;
            boolean z = true;
            int i = 0;
            it7 it7Var = null;
            String str = null;
            String str2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    it7Var = (it7) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), it7Var);
                    i |= 1;
                } else if (iP == 1) {
                    str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        b0.m(iP);
                        return null;
                    }
                    str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                    i |= 4;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new jt7(i, it7Var, str, str2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            jt7 jt7Var = (jt7) obj;
            jt7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.y(serialDescriptor, 0, jt7.d[0].getValue(), jt7Var.a);
            mve mveVar = mve.a;
            vl2VarB.k(serialDescriptor, 1, mveVar, jt7Var.b);
            vl2VarB.k(serialDescriptor, 2, mveVar, jt7Var.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<jt7> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ jt7(int i, it7 it7Var, String str, String str2) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = it7Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt7)) {
            return false;
        }
        jt7 jt7Var = (jt7) obj;
        return this.a == jt7Var.a && wl7.b(this.b, jt7Var.b) && wl7.b(this.c, jt7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSTSearchOverlayArgs(mode=");
        sb.append(this.a);
        sb.append(", initialWhat=");
        sb.append(this.b);
        sb.append(", initialWhere=");
        return l6.i(sb, this.c, ")");
    }

    public jt7(it7 it7Var, String str, String str2) {
        this.a = it7Var;
        this.b = str;
        this.c = str2;
    }
}
