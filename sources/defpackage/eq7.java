package defpackage;

import defpackage.jhb;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class eq7 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new l7(10));

    @o7e
    public static final class a extends eq7 {
        public static final a INSTANCE = new a();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new n7(3));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1012181391;
        }

        public final KSerializer<a> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public static final class b {
        public final KSerializer<eq7> serializer() {
            return (KSerializer) eq7.a.getValue();
        }
    }

    @o7e
    public static final class c extends eq7 {
        public static final b Companion = new b();
        public final boolean b;
        public final String c;
        public final jhb d;
        public final String e;

        @sy3
        public static final /* synthetic */ class a implements sw5<c> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Success", aVar, 4);
                pluginGeneratedSerialDescriptor.k("unwindToOpener", false);
                pluginGeneratedSerialDescriptor.k("continueUrl", false);
                pluginGeneratedSerialDescriptor.k("postApplyInfo", false);
                pluginGeneratedSerialDescriptor.k("userInfo", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{ni1.a, qp1.b(mveVar), jhb.a.a, mveVar};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                boolean zE = false;
                String str = null;
                jhb jhbVar = null;
                String strO = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        zE = ul2VarB.E(serialDescriptor, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                        i |= 2;
                    } else if (iP == 2) {
                        jhbVar = (jhb) ul2VarB.z(serialDescriptor, 2, jhb.a.a, jhbVar);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            b0.m(iP);
                            return null;
                        }
                        strO = ul2VarB.o(serialDescriptor, 3);
                        i |= 8;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new c(i, zE, str, jhbVar, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.w(serialDescriptor, 0, cVar.b);
                vl2VarB.k(serialDescriptor, 1, mve.a, cVar.c);
                vl2VarB.y(serialDescriptor, 2, jhb.a.a, cVar.d);
                vl2VarB.x(serialDescriptor, 3, cVar.e);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<c> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, boolean z, String str, jhb jhbVar, String str2) {
            if (15 != (i & 15)) {
                ewa.M(i, 15, a.a.getDescriptor());
                throw null;
            }
            this.b = z;
            this.c = str;
            this.d = jhbVar;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d) && wl7.b(this.e, cVar.e);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.b) * 31;
            String str = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Success(unwindToOpener=" + this.b + ", continueUrl=" + this.c + ", postApplyInfo=" + this.d + ", userInfo=" + this.e + ")";
        }

        public c(jhb jhbVar) {
            this.b = false;
            this.c = "";
            this.d = jhbVar;
            this.e = "";
        }
    }
}
