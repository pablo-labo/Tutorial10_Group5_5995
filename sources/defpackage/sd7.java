package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class sd7 {
    public static final b Companion = new b();
    public final c a;

    @sy3
    public static final /* synthetic */ class a implements sw5<sd7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.InitiateConversationResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.k("data", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{c.a.a};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            c cVar = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        b0.m(iP);
                        return null;
                    }
                    cVar = (c) ul2VarB.z(serialDescriptor, 0, c.a.a, cVar);
                    i = 1;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new sd7(i, cVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            sd7 sd7Var = (sd7) obj;
            sd7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.y(serialDescriptor, 0, c.a.a, sd7Var.a);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<sd7> serializer() {
            return a.a;
        }
    }

    @o7e
    public static final class c {
        public static final b Companion = new b();
        public final String a;
        public final boolean b;
        public final String c;
        public final d d;

        @sy3
        public static final /* synthetic */ class a implements sw5<c> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.InitiateConversationResponse.InitiateConversationData", aVar, 4);
                pluginGeneratedSerialDescriptor.k("conversationSid", false);
                pluginGeneratedSerialDescriptor.k("exists", false);
                pluginGeneratedSerialDescriptor.k("token", false);
                pluginGeneratedSerialDescriptor.k("metadata", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, ni1.a, mveVar, d.a.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                boolean zE = false;
                String strO = null;
                String strO2 = null;
                d dVar = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        zE = ul2VarB.E(serialDescriptor, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strO2 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            b0.m(iP);
                            return null;
                        }
                        dVar = (d) ul2VarB.z(serialDescriptor, 3, d.a.a, dVar);
                        i |= 8;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new c(i, strO, zE, strO2, dVar);
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
                vl2VarB.x(serialDescriptor, 0, cVar.a);
                vl2VarB.w(serialDescriptor, 1, cVar.b);
                vl2VarB.x(serialDescriptor, 2, cVar.c);
                vl2VarB.y(serialDescriptor, 3, d.a.a, cVar.d);
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

        public /* synthetic */ c(int i, String str, boolean z, String str2, d dVar) {
            if (15 != (i & 15)) {
                ewa.M(i, 15, a.a.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b == cVar.b && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + akb.d(ia.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "InitiateConversationData(conversationSid=" + this.a + ", exists=" + this.b + ", token=" + this.c + ", metadata=" + this.d + ")";
        }
    }

    @o7e
    public static final class d {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final Long f;

        @sy3
        public static final /* synthetic */ class a implements sw5<d> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.rnmessaging.api.InitiateConversationResponse.InitiateConversationMetaData", aVar, 6);
                pluginGeneratedSerialDescriptor.k("jobKey", false);
                pluginGeneratedSerialDescriptor.k("advertiserKey", false);
                pluginGeneratedSerialDescriptor.k("candidateKey", false);
                pluginGeneratedSerialDescriptor.k("hasEmployerEmail", false);
                pluginGeneratedSerialDescriptor.k("isPreApplyConversation", false);
                pluginGeneratedSerialDescriptor.k("applyTime", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?> kSerializerB = qp1.b(p59.a);
                mve mveVar = mve.a;
                ni1 ni1Var = ni1.a;
                return new KSerializer[]{mveVar, mveVar, mveVar, ni1Var, ni1Var, kSerializerB};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                boolean zE = false;
                boolean zE2 = false;
                String strO = null;
                String strO2 = null;
                String strO3 = null;
                Long l = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strO = ul2VarB.o(serialDescriptor, 0);
                            i |= 1;
                            break;
                        case 1:
                            strO2 = ul2VarB.o(serialDescriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            strO3 = ul2VarB.o(serialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            zE = ul2VarB.E(serialDescriptor, 3);
                            i |= 8;
                            break;
                        case 4:
                            zE2 = ul2VarB.E(serialDescriptor, 4);
                            i |= 16;
                            break;
                        case 5:
                            l = (Long) ul2VarB.h(serialDescriptor, 5, p59.a, l);
                            i |= 32;
                            break;
                        default:
                            b0.m(iP);
                            return null;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new d(i, strO, strO2, strO3, zE, zE2, l);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                String str = dVar.a;
                Long l = dVar.f;
                vl2VarB.x(serialDescriptor, 0, str);
                vl2VarB.x(serialDescriptor, 1, dVar.b);
                vl2VarB.x(serialDescriptor, 2, dVar.c);
                vl2VarB.w(serialDescriptor, 3, dVar.d);
                vl2VarB.w(serialDescriptor, 4, dVar.e);
                if (vl2VarB.m(serialDescriptor) || l != null) {
                    vl2VarB.k(serialDescriptor, 5, p59.a, l);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<d> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ d(int i, String str, String str2, String str3, boolean z, boolean z2, Long l) {
            if (31 != (i & 31)) {
                ewa.M(i, 31, a.a.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = z2;
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = l;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && wl7.b(this.f, dVar.f);
        }

        public final int hashCode() {
            int iF = ia.f(ia.f(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            Long l = this.f;
            return iF + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sbF = u40.f("InitiateConversationMetaData(jobKey=", this.a, ", advertiserKey=", this.b, ", candidateKey=");
            akb.q(this.c, ", hasEmployerEmail=", ", isPreApplyConversation=", sbF, this.d);
            sbF.append(this.e);
            sbF.append(", applyTime=");
            sbF.append(this.f);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public /* synthetic */ sd7(int i, c cVar) {
        if (1 == (i & 1)) {
            this.a = cVar;
        } else {
            ewa.M(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd7) && wl7.b(this.a, ((sd7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InitiateConversationResponse(data=" + this.a + ")";
    }
}
