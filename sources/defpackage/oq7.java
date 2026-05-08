package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class oq7 {
    public static final c Companion = new c();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new k7(8));

    public static final class c {
        public final KSerializer<oq7> serializer() {
            return (KSerializer) oq7.a.getValue();
        }
    }

    @o7e
    public static final class d extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new o7(8))};
        public final aq3 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<d> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DocumentPreviewResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{d.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d.c;
                boolean z = true;
                int i = 0;
                aq3 aq3Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        aq3Var = (aq3) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), aq3Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new d(i, aq3Var);
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
                vl2VarB.y(serialDescriptor, 0, d.c[0].getValue(), dVar.b);
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

        public /* synthetic */ d(int i, aq3 aq3Var) {
            if (1 == (i & 1)) {
                this.b = aq3Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DocumentPreviewResult(result=" + this.b + ")";
        }
    }

    @o7e
    public static final class a extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new l7(11))};
        public final aq3 b;

        /* JADX INFO: renamed from: oq7$a$a, reason: collision with other inner class name */
        @sy3
        public static final /* synthetic */ class C0372a implements sw5<a> {
            public static final C0372a a;
            private static final SerialDescriptor descriptor;

            static {
                C0372a c0372a = new C0372a();
                a = c0372a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("AceConversationClosed", c0372a, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{a.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = a.c;
                boolean z = true;
                int i = 0;
                aq3 aq3Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        aq3Var = (aq3) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), aq3Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new a(i, aq3Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, a.c[0].getValue(), aVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<a> serializer() {
                return C0372a.a;
            }
        }

        public /* synthetic */ a(int i, aq3 aq3Var) {
            if (1 == (i & 1)) {
                this.b = aq3Var;
            } else {
                ewa.M(i, 1, C0372a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AceConversationClosed(result=" + this.b + ")";
        }

        public a() {
            this.b = aq3.b;
        }
    }

    @o7e
    public static final class b extends oq7 {
        public static final C0373b Companion = new C0373b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new n7(4))};
        public final aq3 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("AiRecruiterResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{b.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.c;
                boolean z = true;
                int i = 0;
                aq3 aq3Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        aq3Var = (aq3) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), aq3Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new b(i, aq3Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, b.c[0].getValue(), bVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        /* JADX INFO: renamed from: oq7$b$b, reason: collision with other inner class name */
        public static final class C0373b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(int i, aq3 aq3Var) {
            if (1 == (i & 1)) {
                this.b = aq3Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AiRecruiterResult(result=" + this.b + ")";
        }

        public b() {
            this.b = aq3.b;
        }
    }

    @o7e
    public static final class e extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new zw(12))};
        public final eq7 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<e> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("IndeedApplyResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{e.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = e.c;
                boolean z = true;
                int i = 0;
                eq7 eq7Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        eq7Var = (eq7) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), eq7Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new e(i, eq7Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                e eVar = (e) obj;
                eVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, e.c[0].getValue(), eVar.b);
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

        public /* synthetic */ e(int i, eq7 eq7Var) {
            if (1 == (i & 1)) {
                this.b = eq7Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
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
            return "IndeedApplyResult(result=" + this.b + ")";
        }

        public e(eq7 eq7Var) {
            eq7Var.getClass();
            this.b = eq7Var;
        }
    }

    @o7e
    public static final class f extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new lz(10))};
        public final kk7 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<f> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("InterviewSchedulingResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{f.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = f.c;
                boolean z = true;
                int i = 0;
                kk7 kk7Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        kk7Var = (kk7) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), kk7Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new f(i, kk7Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                f fVar = (f) obj;
                fVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, f.c[0].getValue(), fVar.b);
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

        public /* synthetic */ f(int i, kk7 kk7Var) {
            if (1 == (i & 1)) {
                this.b = kk7Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "InterviewSchedulingResult(result=" + this.b + ")";
        }

        public f(kk7 kk7Var) {
            this.b = kk7Var;
        }
    }

    @o7e
    public static final class g extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new mz(9))};
        public final w49 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<g> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("LoginResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{g.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = g.c;
                boolean z = true;
                int i = 0;
                w49 w49Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        w49Var = (w49) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), w49Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new g(i, w49Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                g gVar = (g) obj;
                gVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, g.c[0].getValue(), gVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<g> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ g(int i, w49 w49Var) {
            if (1 == (i & 1)) {
                this.b = w49Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LoginResult(result=" + this.b + ")";
        }

        public g(w49 w49Var) {
            this.b = w49Var;
        }
    }

    @o7e
    public static final class h extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new cp0(10))};
        public final yra b;

        @sy3
        public static final /* synthetic */ class a implements sw5<h> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("OnboardingResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{h.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = h.c;
                boolean z = true;
                int i = 0;
                yra yraVar = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        yraVar = (yra) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), yraVar);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new h(i, yraVar);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                h hVar = (h) obj;
                hVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, h.c[0].getValue(), hVar.b);
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

        public /* synthetic */ h(int i, yra yraVar) {
            if (1 == (i & 1)) {
                this.b = yraVar;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
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
            return "OnboardingResult(result=" + this.b + ")";
        }

        public h(yra yraVar) {
            yraVar.getClass();
            this.b = yraVar;
        }
    }

    @o7e
    public static final class i extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new dp0(8))};
        public final aq3 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<i> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ProfileFormsClosed", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{i.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = i.c;
                boolean z = true;
                int i = 0;
                aq3 aq3Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        aq3Var = (aq3) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), aq3Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new i(i, aq3Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                i iVar = (i) obj;
                iVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, i.c[0].getValue(), iVar.b);
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

        public /* synthetic */ i(int i, aq3 aq3Var) {
            if (1 == (i & 1)) {
                this.b = aq3Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ProfileFormsClosed(result=" + this.b + ")";
        }

        public i() {
            this.b = aq3.b;
        }
    }

    @o7e
    public static final class j extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new pl0(7))};
        public final xnd b;

        @sy3
        public static final /* synthetic */ class a implements sw5<j> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ScheduleApplyOnboardingResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{j.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = j.c;
                boolean z = true;
                int i = 0;
                xnd xndVar = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        xndVar = (xnd) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), xndVar);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new j(i, xndVar);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                j jVar = (j) obj;
                jVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, j.c[0].getValue(), jVar.b);
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

        public /* synthetic */ j(int i, xnd xndVar) {
            if (1 == (i & 1)) {
                this.b = xndVar;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ScheduleApplyOnboardingResult(result=" + this.b + ")";
        }

        public j(xnd xndVar) {
            xndVar.getClass();
            this.b = xndVar;
        }
    }

    @o7e
    public static final class k extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new ao0(9))};
        public final aq3 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<k> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.tare.nav.JSTModalScreenResult.SearchOverlayClosed", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{k.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = k.c;
                boolean z = true;
                int i = 0;
                aq3 aq3Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        aq3Var = (aq3) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), aq3Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new k(i, aq3Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                k kVar = (k) obj;
                kVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, k.c[0].getValue(), kVar.b);
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

        public /* synthetic */ k(int i, aq3 aq3Var) {
            if (1 == (i & 1)) {
                this.b = aq3Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SearchOverlayClosed(result=" + this.b + ")";
        }

        public k() {
            this.b = aq3.b;
        }
    }

    @o7e
    public static final class l extends oq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new bo0(12))};
        public final aq3 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<l> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ViewJobCompletionResult", aVar, 1);
                pluginGeneratedSerialDescriptor.k("result", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{l.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = l.c;
                boolean z = true;
                int i = 0;
                aq3 aq3Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        aq3Var = (aq3) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), aq3Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new l(i, aq3Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                l lVar = (l) obj;
                lVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, l.c[0].getValue(), lVar.b);
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

        public /* synthetic */ l(int i, aq3 aq3Var) {
            if (1 == (i & 1)) {
                this.b = aq3Var;
            } else {
                ewa.M(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ViewJobCompletionResult(result=" + this.b + ")";
        }

        public l() {
            this.b = aq3.b;
        }
    }
}
