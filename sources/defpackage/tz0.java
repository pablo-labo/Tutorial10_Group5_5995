package defpackage;

import defpackage.rz0;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class tz0 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] d = {boa.E(qt8.b, new sz0(0)), null, null};
    public final List<nz0> a;
    public final rz0 b;
    public final String c;

    @sy3
    public /* synthetic */ class a implements sw5<tz0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.autocomplete.data.AutoCompleteWhatSuggestion", aVar, 3);
            pluginGeneratedSerialDescriptor.k("matches", false);
            pluginGeneratedSerialDescriptor.k("payload", false);
            pluginGeneratedSerialDescriptor.k("suggestion", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{tz0.d[0].getValue(), rz0.a.a, mve.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = tz0.d;
            boolean z = true;
            int i = 0;
            List list = null;
            rz0 rz0Var = null;
            String strO = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    list = (List) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iP == 1) {
                    rz0Var = (rz0) ul2VarB.z(serialDescriptor, 1, rz0.a.a, rz0Var);
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
            return new tz0(i, list, rz0Var, strO);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            tz0 tz0Var = (tz0) obj;
            tz0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.y(serialDescriptor, 0, tz0.d[0].getValue(), tz0Var.a);
            vl2VarB.y(serialDescriptor, 1, rz0.a.a, tz0Var.b);
            vl2VarB.x(serialDescriptor, 2, tz0Var.c);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<tz0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ tz0(int i, List list, rz0 rz0Var, String str) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, a.a.get$$serialDesc());
            throw null;
        }
        this.a = list;
        this.b = rz0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz0)) {
            return false;
        }
        tz0 tz0Var = (tz0) obj;
        return wl7.b(this.a, tz0Var.a) && wl7.b(this.b, tz0Var.b) && wl7.b(this.c, tz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoCompleteWhatSuggestion(matches=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", suggestion=");
        return l6.i(sb, this.c, ")");
    }
}
