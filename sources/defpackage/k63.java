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
public final class k63 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] e = {null, null, boa.E(qt8.b, new qr0(1)), null};
    public final String a;
    public final int b;
    public final List<j63> c;
    public final boolean d;

    @sy3
    public static final /* synthetic */ class a implements sw5<k63> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.services.CreateResponseSetResponseGroupBody", aVar, 4);
            pluginGeneratedSerialDescriptor.k("field_group_id", false);
            pluginGeneratedSerialDescriptor.k("display_order", false);
            pluginGeneratedSerialDescriptor.k("form_field_responses", false);
            pluginGeneratedSerialDescriptor.k("is_user_approved", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{mve.a, rh7.a, k63.e[2].getValue(), ni1.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = k63.e;
            boolean z = true;
            int i = 0;
            int iM = 0;
            boolean zE = false;
            String strO = null;
            List list = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    iM = ul2VarB.m(serialDescriptor, 1);
                    i |= 2;
                } else if (iP == 2) {
                    list = (List) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), list);
                    i |= 4;
                } else {
                    if (iP != 3) {
                        b0.m(iP);
                        return null;
                    }
                    zE = ul2VarB.E(serialDescriptor, 3);
                    i |= 8;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new k63(i, strO, iM, list, zE);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            k63 k63Var = (k63) obj;
            k63Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = k63.e;
            vl2VarB.x(serialDescriptor, 0, k63Var.a);
            vl2VarB.r(1, k63Var.b, serialDescriptor);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), k63Var.c);
            vl2VarB.w(serialDescriptor, 3, k63Var.d);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<k63> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ k63(int i, String str, int i2, List list, boolean z) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k63)) {
            return false;
        }
        k63 k63Var = (k63) obj;
        return wl7.b(this.a, k63Var.a) && this.b == k63Var.b && wl7.b(this.c, k63Var.c) && this.d == k63Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ia.g(this.c, w40.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbH = w40.h(this.b, "CreateResponseSetResponseGroupBody(field_group_id=", this.a, ", display_order=", ", form_field_responses=");
        sbH.append(this.c);
        sbH.append(", is_user_approved=");
        sbH.append(this.d);
        sbH.append(")");
        return sbH.toString();
    }
}
