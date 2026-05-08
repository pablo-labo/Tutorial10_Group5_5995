package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class vid {
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new kr(16));

    public static final class a {
        public final KSerializer<vid> serializer() {
            return (KSerializer) vid.a.getValue();
        }
    }

    @o7e
    public static final class e extends vid {
        public static final e INSTANCE = new e();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new fc2(14));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1219147817;
        }

        public final KSerializer<e> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Heartbeat";
        }
    }

    @o7e
    public static final class b extends vid {
        public static final C0453b Companion = new C0453b();
        public final String b;

        @sy3
        public /* synthetic */ class a implements sw5<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.SSEEvent.CoworkerSuggestions", aVar, 1);
                pluginGeneratedSerialDescriptor.k("update", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new b(i, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, bVar.b);
                vl2VarB.c(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: vid$b$b, reason: collision with other inner class name */
        public static final class C0453b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("CoworkerSuggestions(update=", this.b, ")");
        }

        public b(String str) {
            str.getClass();
            this.b = str;
        }
    }

    @o7e
    public static final class c extends vid {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public /* synthetic */ class a implements sw5<c> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.SSEEvent.CoworkerUpdate", aVar, 1);
                pluginGeneratedSerialDescriptor.k("update", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new c(i, strO);
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
                vl2VarB.x(serialDescriptor, 0, cVar.b);
                vl2VarB.c(serialDescriptor);
            }
        }

        public static final class b {
            public final KSerializer<c> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("CoworkerUpdate(update=", this.b, ")");
        }

        public c(String str) {
            str.getClass();
            this.b = str;
        }
    }

    @o7e
    public static final class d extends vid {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public /* synthetic */ class a implements sw5<d> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.SSEEvent.ErrorEvent", aVar, 1);
                pluginGeneratedSerialDescriptor.k("error", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new d(i, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, dVar.b);
                vl2VarB.c(serialDescriptor);
            }
        }

        public static final class b {
            public final KSerializer<d> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ d(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("ErrorEvent(error=", this.b, ")");
        }

        public d(String str) {
            this.b = str;
        }
    }

    @o7e
    public static final class f extends vid {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public /* synthetic */ class a implements sw5<f> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.SSEEvent.NewMessage", aVar, 1);
                pluginGeneratedSerialDescriptor.k("conversationId", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new f(i, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                f fVar = (f) obj;
                fVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, fVar.b);
                vl2VarB.c(serialDescriptor);
            }
        }

        public static final class b {
            public final KSerializer<f> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ f(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && wl7.b(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("NewMessage(conversationId=", this.b, ")");
        }

        public f(String str) {
            str.getClass();
            this.b = str;
        }
    }

    @o7e
    public static final class h extends vid {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public /* synthetic */ class a implements sw5<h> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.SSEEvent.ReadReceipt", aVar, 1);
                pluginGeneratedSerialDescriptor.k("conversationId", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new h(i, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                h hVar = (h) obj;
                hVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, hVar.b);
                vl2VarB.c(serialDescriptor);
            }
        }

        public static final class b {
            public final KSerializer<h> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ h(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && wl7.b(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("ReadReceipt(conversationId=", this.b, ")");
        }

        public h(String str) {
            str.getClass();
            this.b = str;
        }
    }

    @o7e
    public static final class g extends vid {
        public static final b Companion = new b();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        @sy3
        public /* synthetic */ class a implements sw5<g> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.realtimemessaging.models.SSEEvent.OnlineStatusRefresh", aVar, 4);
                pluginGeneratedSerialDescriptor.k("advertiserKey", false);
                pluginGeneratedSerialDescriptor.k("accountKey", false);
                pluginGeneratedSerialDescriptor.k("newStatus", false);
                pluginGeneratedSerialDescriptor.k("accountType", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{qp1.b(mveVar), mveVar, mveVar, mveVar};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String str = null;
                String strO = null;
                String strO2 = null;
                String strO3 = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i |= 1;
                    } else if (iP == 1) {
                        strO = ul2VarB.o(serialDescriptor, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strO2 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            b0.m(iP);
                            return null;
                        }
                        strO3 = ul2VarB.o(serialDescriptor, 3);
                        i |= 8;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new g(i, str, strO, strO2, strO3);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                g gVar = (g) obj;
                gVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.k(serialDescriptor, 0, mve.a, gVar.b);
                vl2VarB.x(serialDescriptor, 1, gVar.c);
                vl2VarB.x(serialDescriptor, 2, gVar.d);
                vl2VarB.x(serialDescriptor, 3, gVar.e);
                vl2VarB.c(serialDescriptor);
            }
        }

        public static final class b {
            public final KSerializer<g> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ g(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                ewa.M(i, 15, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.b, gVar.b) && wl7.b(this.c, gVar.c) && wl7.b(this.d, gVar.d) && wl7.b(this.e, gVar.e);
        }

        public final int hashCode() {
            String str = this.b;
            return this.e.hashCode() + akb.d(akb.d((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return z3.n(u40.f("OnlineStatusRefresh(advertiserKey=", this.b, ", accountKey=", this.c, ", newStatus="), this.d, ", accountType=", this.e, ")");
        }

        public g(String str, String str2, String str3, String str4) {
            q6.m(str2, str3, str4);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }
    }
}
