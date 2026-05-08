package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class ahg {
    public static final b Companion = new b();
    public final c a;

    @sy3
    public static final /* synthetic */ class a implements sw5<ahg> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.api.messaging.UploadFileResponse", aVar, 1);
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
            return new ahg(i, cVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            ahg ahgVar = (ahg) obj;
            ahgVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.y(serialDescriptor, 0, c.a.a, ahgVar.a);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<ahg> serializer() {
            return a.a;
        }
    }

    @o7e
    public static final class c {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        @sy3
        public static final /* synthetic */ class a implements sw5<c> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.api.messaging.UploadFileResponse.UploadFileResponseData", aVar, 5);
                pluginGeneratedSerialDescriptor.k("sid", false);
                pluginGeneratedSerialDescriptor.k("url", false);
                pluginGeneratedSerialDescriptor.k("contentHash", false);
                pluginGeneratedSerialDescriptor.k("fileName", false);
                pluginGeneratedSerialDescriptor.k("fileExtension", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, mveVar, mveVar, mveVar, mveVar};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                String strO2 = null;
                String strO3 = null;
                String strO4 = null;
                String strO5 = null;
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
                        strO3 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                    } else if (iP == 3) {
                        strO4 = ul2VarB.o(serialDescriptor, 3);
                        i |= 8;
                    } else {
                        if (iP != 4) {
                            b0.m(iP);
                            return null;
                        }
                        strO5 = ul2VarB.o(serialDescriptor, 4);
                        i |= 16;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new c(i, strO, strO2, strO3, strO4, strO5);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, cVar.a);
                vl2VarB.x(serialDescriptor, 1, cVar.b);
                vl2VarB.x(serialDescriptor, 2, cVar.c);
                vl2VarB.x(serialDescriptor, 3, cVar.d);
                vl2VarB.x(serialDescriptor, 4, cVar.e);
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

        public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5) {
            if (31 != (i & 31)) {
                ewa.M(i, 31, a.a.get$$serialDesc());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d) && wl7.b(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("UploadFileResponseData(sid=", this.a, ", url=", this.b, ", contentHash=");
            ia.r(sbF, this.c, ", fileName=", this.d, ", fileExtension=");
            return l6.i(sbF, this.e, ")");
        }
    }

    public /* synthetic */ ahg(int i, c cVar) {
        if (1 == (i & 1)) {
            this.a = cVar;
        } else {
            ewa.M(i, 1, a.a.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahg) && wl7.b(this.a, ((ahg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadFileResponse(data=" + this.a + ")";
    }
}
