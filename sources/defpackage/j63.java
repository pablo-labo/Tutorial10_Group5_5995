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
public final class j63 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] f = {null, null, boa.E(qt8.b, new wy2(1)), null, null};
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;

    @sy3
    public static final /* synthetic */ class a implements sw5<j63> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.services.CreateResponseSetFormFieldResponseBody", aVar, 5);
            pluginGeneratedSerialDescriptor.k("form_field_id", false);
            pluginGeneratedSerialDescriptor.k("response_value", false);
            pluginGeneratedSerialDescriptor.k("selected_options", false);
            pluginGeneratedSerialDescriptor.k("validation_status", false);
            pluginGeneratedSerialDescriptor.k("source", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = j63.f;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, qp1.b(mveVar), qp1.b(lazyArr[2].getValue()), mveVar, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = j63.f;
            boolean z = true;
            int i = 0;
            String strO = null;
            String str = null;
            List list = null;
            String strO2 = null;
            String strO3 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                } else if (iP == 1) {
                    str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                    i |= 2;
                } else if (iP == 2) {
                    list = (List) ul2VarB.h(serialDescriptor, 2, lazyArr[2].getValue(), list);
                    i |= 4;
                } else if (iP == 3) {
                    strO2 = ul2VarB.o(serialDescriptor, 3);
                    i |= 8;
                } else {
                    if (iP != 4) {
                        b0.m(iP);
                        return null;
                    }
                    strO3 = ul2VarB.o(serialDescriptor, 4);
                    i |= 16;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new j63(i, strO, str, list, strO2, strO3);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            j63 j63Var = (j63) obj;
            j63Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = j63.f;
            String str = j63Var.a;
            String str2 = j63Var.e;
            vl2VarB.x(serialDescriptor, 0, str);
            vl2VarB.k(serialDescriptor, 1, mve.a, j63Var.b);
            vl2VarB.k(serialDescriptor, 2, lazyArr[2].getValue(), j63Var.c);
            vl2VarB.x(serialDescriptor, 3, j63Var.d);
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str2, "USER_ADDED")) {
                vl2VarB.x(serialDescriptor, 4, str2);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<j63> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ j63(int i, String str, String str2, List list, String str3, String str4) {
        if (15 != (i & 15)) {
            ewa.M(i, 15, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = "USER_ADDED";
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j63)) {
            return false;
        }
        j63 j63Var = (j63) obj;
        return wl7.b(this.a, j63Var.a) && wl7.b(this.b, j63Var.b) && wl7.b(this.c, j63Var.c) && wl7.b(this.d, j63Var.d) && wl7.b(this.e, j63Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.c;
        return this.e.hashCode() + akb.d((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("CreateResponseSetFormFieldResponseBody(form_field_id=", this.a, ", response_value=", this.b, ", selected_options=");
        sbF.append(this.c);
        sbF.append(", validation_status=");
        sbF.append(this.d);
        sbF.append(", source=");
        return l6.i(sbF, this.e, ")");
    }
}
