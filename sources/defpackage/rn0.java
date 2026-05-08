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
public final class rn0 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f = {null, null, boa.E(qt8.b, new mz(2)), null, null};
    public final String a;
    public final String b;
    public final List<qn0> c;
    public final boolean d;
    public final rn0 e;

    @sy3
    public static final /* synthetic */ class a implements sw5<rn0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.models.backend.ApplicationFormFieldGroup", aVar, 5);
            pluginGeneratedSerialDescriptor.k("group_label", false);
            pluginGeneratedSerialDescriptor.k("group_id", false);
            pluginGeneratedSerialDescriptor.k("form_fields", false);
            pluginGeneratedSerialDescriptor.k("is_collapsed", true);
            pluginGeneratedSerialDescriptor.k("nested_form_field_group", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = rn0.f;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, lazyArr[2].getValue(), ni1.a, qp1.b(a)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = rn0.f;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strO = null;
            String strO2 = null;
            List list = null;
            rn0 rn0Var = null;
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
                    list = (List) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), list);
                    i |= 4;
                } else if (iP == 3) {
                    zE = ul2VarB.E(serialDescriptor, 3);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    rn0Var = (rn0) ul2VarB.h(serialDescriptor, 4, a, rn0Var);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new rn0(i, strO, strO2, list, zE, rn0Var);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            rn0 rn0Var = (rn0) obj;
            rn0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = rn0.f;
            String str = rn0Var.a;
            rn0 rn0Var2 = rn0Var.e;
            boolean z = rn0Var.d;
            vl2VarB.x(serialDescriptor, 0, str);
            vl2VarB.x(serialDescriptor, 1, rn0Var.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), rn0Var.c);
            if (vl2VarB.m(serialDescriptor) || z) {
                vl2VarB.w(serialDescriptor, 3, z);
            }
            if (vl2VarB.m(serialDescriptor) || rn0Var2 != null) {
                vl2VarB.k(serialDescriptor, 4, a, rn0Var2);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<rn0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ rn0(int i, String str, String str2, List list, boolean z, rn0 rn0Var) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = rn0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn0)) {
            return false;
        }
        rn0 rn0Var = (rn0) obj;
        return wl7.b(this.a, rn0Var.a) && wl7.b(this.b, rn0Var.b) && wl7.b(this.c, rn0Var.c) && this.d == rn0Var.d && wl7.b(this.e, rn0Var.e);
    }

    public final int hashCode() {
        int iF = ia.f(ia.g(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        rn0 rn0Var = this.e;
        return iF + (rn0Var == null ? 0 : rn0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ApplicationFormFieldGroup(group_label=", this.a, ", group_id=", this.b, ", form_fields=");
        sbF.append(this.c);
        sbF.append(", is_collapsed=");
        sbF.append(this.d);
        sbF.append(", nested_form_field_group=");
        sbF.append(this.e);
        sbF.append(")");
        return sbF.toString();
    }
}
