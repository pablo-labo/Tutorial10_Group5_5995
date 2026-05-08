package defpackage;

import defpackage.bq7;
import defpackage.fr7;
import defpackage.jt7;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class qq7 {
    public static final c Companion = new c();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new vm1(12));

    public static final class c {
        public final KSerializer<qq7> serializer() {
            return (KSerializer) qq7.a.getValue();
        }
    }

    @o7e
    public static final class e extends qq7 {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public static final /* synthetic */ class a implements sw5<e> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("IndeedApply", aVar, 1);
                pluginGeneratedSerialDescriptor.k("url", false);
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
                return new e(i, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                e eVar = (e) obj;
                eVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, eVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<e> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ e(int i, String str) {
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
            return (obj instanceof e) && wl7.b(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("IndeedApply(url=", this.b, ")");
        }
    }

    @o7e
    public static abstract class g {
        public static final a Companion = new a();
        public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new pd1(14));

        public static final class a {
            public final KSerializer<g> serializer() {
                return (KSerializer) g.a.getValue();
            }
        }

        @o7e
        public static final class b extends g {
            public static final C0399b Companion = new C0399b();
            public final String b;

            @sy3
            public static final /* synthetic */ class a implements sw5<b> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("JobKey", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("jobKey", false);
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

                @Override // defpackage.sw5
                public final KSerializer<?>[] typeParametersSerializers() {
                    return ypd.V;
                }
            }

            /* JADX INFO: renamed from: qq7$g$b$b, reason: collision with other inner class name */
            public static final class C0399b {
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
                return l5.m("JobKey(jobKey=", this.b, ")");
            }
        }

        @o7e
        public static final class c extends g {
            public static final b Companion = new b();
            public final String b;

            @sy3
            public static final /* synthetic */ class a implements sw5<c> {
                public static final a a;
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Url", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("url", false);
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
                return l5.m("Url(url=", this.b, ")");
            }
        }
    }

    @o7e
    public static final class i extends qq7 {
        public static final b Companion = new b();
        public final fr7 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<i> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Onboarding", aVar, 1);
                pluginGeneratedSerialDescriptor.k("params", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{fr7.a.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                fr7 fr7Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        fr7Var = (fr7) ul2VarB.z(serialDescriptor, 0, fr7.a.a, fr7Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new i(i, fr7Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                i iVar = (i) obj;
                iVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, fr7.a.a, iVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<i> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ i(int i, fr7 fr7Var) {
            if (1 == (i & 1)) {
                this.b = fr7Var;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }
    }

    @o7e
    public static final class k extends qq7 {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public static final /* synthetic */ class a implements sw5<k> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ScheduleApplyOnboarding", aVar, 1);
                pluginGeneratedSerialDescriptor.k("jobKey", false);
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
                return new k(i, strO);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                k kVar = (k) obj;
                kVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, kVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<k> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ k(int i, String str) {
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
            return (obj instanceof k) && wl7.b(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("ScheduleApplyOnboarding(jobKey=", this.b, ")");
        }
    }

    @o7e
    public static final class l extends qq7 {
        public static final b Companion = new b();
        public final jt7 b;
        public final String c;

        @sy3
        public static final /* synthetic */ class a implements sw5<l> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SearchOverlay", aVar, 2);
                pluginGeneratedSerialDescriptor.k("args", false);
                pluginGeneratedSerialDescriptor.k("origin", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{jt7.a.a, qp1.b(mve.a)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                jt7 jt7Var = null;
                String str = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        jt7Var = (jt7) ul2VarB.z(serialDescriptor, 0, jt7.a.a, jt7Var);
                        i |= 1;
                    } else {
                        if (iP != 1) {
                            b0.m(iP);
                            return null;
                        }
                        str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                        i |= 2;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new l(i, jt7Var, str);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                l lVar = (l) obj;
                lVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                jt7.a aVar = jt7.a.a;
                jt7 jt7Var = lVar.b;
                String str = lVar.c;
                vl2VarB.y(serialDescriptor, 0, aVar, jt7Var);
                if (vl2VarB.m(serialDescriptor) || str != null) {
                    vl2VarB.k(serialDescriptor, 1, mve.a, str);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<l> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ l(int i, jt7 jt7Var, String str) {
            if (1 != (i & 1)) {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
            this.b = jt7Var;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return wl7.b(this.b, lVar.b) && wl7.b(this.c, lVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "SearchOverlay(args=" + this.b + ", origin=" + this.c + ")";
        }
    }

    @o7e
    public static final class m extends qq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new kr(7))};
        public final g b;

        @sy3
        public static final /* synthetic */ class a implements sw5<m> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ViewJob", aVar, 1);
                pluginGeneratedSerialDescriptor.k("target", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{m.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = m.c;
                boolean z = true;
                int i = 0;
                g gVar = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        gVar = (g) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), gVar);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new m(i, gVar);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                m mVar = (m) obj;
                mVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, m.c[0].getValue(), mVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<m> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ m(int i, g gVar) {
            if (1 == (i & 1)) {
                this.b = gVar;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }
    }

    @o7e
    public static final class b extends qq7 {
        public static final C0398b Companion = new C0398b();
        public final String b;

        @sy3
        public static final /* synthetic */ class a implements sw5<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("AiRecruiter", aVar, 1);
                pluginGeneratedSerialDescriptor.k("url", false);
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

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        /* JADX INFO: renamed from: qq7$b$b, reason: collision with other inner class name */
        public static final class C0398b {
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
            return l5.m("AiRecruiter(url=", this.b, ")");
        }

        public b(String str) {
            str.getClass();
            this.b = str;
        }
    }

    @o7e
    public static final class d extends qq7 {
        public static final b Companion = new b();
        public final bq7 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<d> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DocumentPreview", aVar, 1);
                pluginGeneratedSerialDescriptor.k("fileInfo", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{bq7.a.a};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                bq7 bq7Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        bq7Var = (bq7) ul2VarB.z(serialDescriptor, 0, bq7.a.a, bq7Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new d(i, bq7Var);
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
                vl2VarB.y(serialDescriptor, 0, bq7.a.a, dVar.b);
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

        public /* synthetic */ d(int i, bq7 bq7Var) {
            if (1 == (i & 1)) {
                this.b = bq7Var;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public d(bq7 bq7Var) {
            this.b = bq7Var;
        }
    }

    @o7e
    public static final class h extends qq7 {
        public static final b Companion = new b();
        public final boolean b;
        public final boolean c;

        @sy3
        public static final /* synthetic */ class a implements sw5<h> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Login", aVar, 2);
                pluginGeneratedSerialDescriptor.k("isRegistration", false);
                pluginGeneratedSerialDescriptor.k("isContinueWithGoogle", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                ni1 ni1Var = ni1.a;
                return new KSerializer[]{ni1Var, ni1Var};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                boolean zE = false;
                boolean zE2 = false;
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
                        zE2 = ul2VarB.E(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new h(i, zE, zE2);
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
                vl2VarB.w(serialDescriptor, 0, hVar.b);
                vl2VarB.w(serialDescriptor, 1, hVar.c);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<h> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ h(int i, boolean z, boolean z2) {
            if (3 != (i & 3)) {
                ewa.M(i, 3, a.a.get$$serialDesc());
                throw null;
            }
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && this.c == hVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "Login(isRegistration=" + this.b + ", isContinueWithGoogle=" + this.c + ")";
        }

        public h(boolean z) {
            this.b = z;
            this.c = false;
        }
    }

    @o7e
    public static final class a extends qq7 {
        public static final b Companion = new b();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* JADX INFO: renamed from: qq7$a$a, reason: collision with other inner class name */
        @sy3
        public static final /* synthetic */ class C0397a implements sw5<a> {
            public static final C0397a a;
            private static final SerialDescriptor descriptor;

            static {
                C0397a c0397a = new C0397a();
                a = c0397a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("AceConversation", c0397a, 4);
                pluginGeneratedSerialDescriptor.k("starterMessage", true);
                pluginGeneratedSerialDescriptor.k("agentType", true);
                pluginGeneratedSerialDescriptor.k("conversationId", true);
                pluginGeneratedSerialDescriptor.k("sourceContext", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i |= 1;
                    } else if (iP == 1) {
                        str2 = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str2);
                        i |= 2;
                    } else if (iP == 2) {
                        str3 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str3);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            b0.m(iP);
                            return null;
                        }
                        str4 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str4);
                        i |= 8;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new a(i, str, str2, str3, str4);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                String str = aVar.e;
                String str2 = aVar.d;
                String str3 = aVar.c;
                String str4 = aVar.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                if (vl2VarB.m(serialDescriptor) || str4 != null) {
                    vl2VarB.k(serialDescriptor, 0, mve.a, str4);
                }
                if (vl2VarB.m(serialDescriptor) || str3 != null) {
                    vl2VarB.k(serialDescriptor, 1, mve.a, str3);
                }
                if (vl2VarB.m(serialDescriptor) || str2 != null) {
                    vl2VarB.k(serialDescriptor, 2, mve.a, str2);
                }
                if (vl2VarB.m(serialDescriptor) || str != null) {
                    vl2VarB.k(serialDescriptor, 3, mve.a, str);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<a> serializer() {
                return C0397a.a;
            }
        }

        public /* synthetic */ a(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && wl7.b(this.d, aVar.d) && wl7.b(this.e, aVar.e);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return z3.n(u40.f("AceConversation(starterMessage=", this.b, ", agentType=", this.c, ", conversationId="), this.d, ", sourceContext=", this.e, ")");
        }

        public a() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @o7e
    public static final class f extends qq7 {
        public static final b Companion = new b();
        public final String b;
        public final boolean c;
        public final String d;

        @sy3
        public static final /* synthetic */ class a implements sw5<f> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("InterviewScheduling", aVar, 3);
                pluginGeneratedSerialDescriptor.k("url", false);
                pluginGeneratedSerialDescriptor.k("preferFullScreenModal", true);
                pluginGeneratedSerialDescriptor.k("title", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, ni1.a, qp1.b(mveVar)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                boolean zE = false;
                String strO = null;
                String str = null;
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
                    } else {
                        if (iP != 2) {
                            b0.m(iP);
                            return null;
                        }
                        str = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str);
                        i |= 4;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new f(i, strO, str, zE);
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
                String str = fVar.b;
                String str2 = fVar.d;
                boolean z = fVar.c;
                vl2VarB.x(serialDescriptor, 0, str);
                if (vl2VarB.m(serialDescriptor) || z) {
                    vl2VarB.w(serialDescriptor, 1, z);
                }
                if (vl2VarB.m(serialDescriptor) || str2 != null) {
                    vl2VarB.k(serialDescriptor, 2, mve.a, str2);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<f> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ f(int i, String str, String str2, boolean z) {
            if (1 != (i & 1)) {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.b, fVar.b) && this.c == fVar.c && wl7.b(this.d, fVar.d);
        }

        public final int hashCode() {
            int iF = ia.f(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return iF + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InterviewScheduling(url=");
            sb.append(this.b);
            sb.append(", preferFullScreenModal=");
            sb.append(this.c);
            sb.append(", title=");
            return l6.i(sb, this.d, ")");
        }

        public f(String str, String str2, boolean z) {
            str.getClass();
            this.b = str;
            this.c = z;
            this.d = str2;
        }
    }

    @o7e
    public static final class j extends qq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] f = {null, null, null, boa.E(qt8.b, new jr(16))};
        public final String b;
        public final String c;
        public final String d;
        public final Map<String, String> e;

        @sy3
        public static final /* synthetic */ class a implements sw5<j> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ProfileForms", aVar, 4);
                pluginGeneratedSerialDescriptor.k("sectionType", false);
                pluginGeneratedSerialDescriptor.k("mode", false);
                pluginGeneratedSerialDescriptor.k("itemId", true);
                pluginGeneratedSerialDescriptor.k("prefillData", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = j.f;
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, mveVar, qp1.b(mveVar), qp1.b(lazyArr[3].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = j.f;
                boolean z = true;
                int i = 0;
                String strO = null;
                String strO2 = null;
                String str = null;
                Map map = null;
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
                        str = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 3, lazyArr[3].getValue(), map);
                        i |= 8;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new j(i, strO, strO2, str, map);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                j jVar = (j) obj;
                jVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = j.f;
                String str = jVar.b;
                Map<String, String> map = jVar.e;
                String str2 = jVar.d;
                vl2VarB.x(serialDescriptor, 0, str);
                vl2VarB.x(serialDescriptor, 1, jVar.c);
                if (vl2VarB.m(serialDescriptor) || str2 != null) {
                    vl2VarB.k(serialDescriptor, 2, mve.a, str2);
                }
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 3, lazyArr[3].getValue(), map);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<j> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ j(int i, String str, String str2, String str3, Map map) {
            if (3 != (i & 3)) {
                ewa.M(i, 3, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            this.c = str2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = map;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return wl7.b(this.b, jVar.b) && wl7.b(this.c, jVar.c) && wl7.b(this.d, jVar.d) && wl7.b(this.e, jVar.e);
        }

        public final int hashCode() {
            int iD = akb.d(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, String> map = this.e;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("ProfileForms(sectionType=", this.b, ", mode=", this.c, ", itemId=");
            sbF.append(this.d);
            sbF.append(", prefillData=");
            sbF.append(this.e);
            sbF.append(")");
            return sbF.toString();
        }

        public j(String str, String str2, String str3, Map<String, String> map) {
            str.getClass();
            str2.getClass();
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = map;
        }
    }
}
