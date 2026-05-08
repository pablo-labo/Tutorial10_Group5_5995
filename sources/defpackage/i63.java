package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class i63 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] c = {null, boa.E(qt8.b, new vy2(1))};
    public final boolean a;
    public final List<k63> b;

    @sy3
    public static final /* synthetic */ class a implements sw5<i63> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.services.CreateResponseSetBody", aVar, 2);
            pluginGeneratedSerialDescriptor.k("is_user_approved", false);
            pluginGeneratedSerialDescriptor.k("response_groups", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{ni1.a, i63.c[1].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = i63.c;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            List list = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    zE = ul2VarB.E(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        b0.m(iP);
                        return null;
                    }
                    list = (List) ul2VarB.z(serialDescriptor, 1, lazyArr[1].getValue(), list);
                    i |= 2;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new i63(i, list, zE);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            i63 i63Var = (i63) obj;
            i63Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = i63.c;
            vl2VarB.w(serialDescriptor, 0, i63Var.a);
            vl2VarB.y(serialDescriptor, 1, lazyArr[1].getValue(), i63Var.b);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<i63> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ i63(int i, List list, boolean z) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, a.a.get$$serialDesc());
            throw null;
        }
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i63)) {
            return false;
        }
        i63 i63Var = (i63) obj;
        return this.a == i63Var.a && wl7.b(this.b, i63Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CreateResponseSetBody(is_user_approved=" + this.a + ", response_groups=" + this.b + ")";
    }
}
