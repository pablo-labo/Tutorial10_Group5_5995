package defpackage;

import defpackage.hq7;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class jq7 {
    public static final e Companion = new e();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new o7(7));

    @o7e
    public static final class a extends jq7 {
        public static final a INSTANCE = new a();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new zw(11));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 785019275;
        }

        public final KSerializer<a> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Ace";
        }
    }

    @o7e
    public static final class c0 extends jq7 {
        public static final c0 INSTANCE = new c0();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new vz0(8));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c0);
        }

        public final int hashCode() {
            return 1268486415;
        }

        public final KSerializer<c0> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "TermsOfService";
        }
    }

    @o7e
    public static final class d extends jq7 {
        public static final d INSTANCE = new d();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new cp0(9));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1434178007;
        }

        public final KSerializer<d> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "CCPA";
        }
    }

    public static final class e {
        public final KSerializer<jq7> serializer() {
            return (KSerializer) jq7.a.getValue();
        }
    }

    @o7e
    public static final class f extends jq7 {
        public static final b Companion = new b();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        @sy3
        public static final /* synthetic */ class a implements sw5<f> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CompanyPage", aVar, 5);
                pluginGeneratedSerialDescriptor.k("sourceUrl", false);
                pluginGeneratedSerialDescriptor.k("targetUrl", false);
                pluginGeneratedSerialDescriptor.k("shareUrl", true);
                pluginGeneratedSerialDescriptor.k("shareMessage", true);
                pluginGeneratedSerialDescriptor.k("shareTk", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, mveVar, qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String strO = null;
                String strO2 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
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
                    } else if (iP == 3) {
                        str2 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str2);
                        i |= 8;
                    } else {
                        if (iP != 4) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        str3 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str3);
                        i |= 16;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new f(i, strO, strO2, str, str2, str3);
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
                String str2 = fVar.f;
                String str3 = fVar.e;
                String str4 = fVar.d;
                vl2VarB.x(serialDescriptor, 0, str);
                vl2VarB.x(serialDescriptor, 1, fVar.c);
                if (vl2VarB.m(serialDescriptor) || str4 != null) {
                    vl2VarB.k(serialDescriptor, 2, mve.a, str4);
                }
                if (vl2VarB.m(serialDescriptor) || str3 != null) {
                    vl2VarB.k(serialDescriptor, 3, mve.a, str3);
                }
                if (vl2VarB.m(serialDescriptor) || str2 != null) {
                    vl2VarB.k(serialDescriptor, 4, mve.a, str2);
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

        public /* synthetic */ f(int i, String str, String str2, String str3, String str4, String str5) {
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
                this.e = str4;
            }
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
        }
    }

    @o7e
    public static final class f0 extends jq7 {
        public static final b Companion = new b();
        public final String b;
        public final String c;
        public final String d;

        @sy3
        public static final /* synthetic */ class a implements sw5<f0> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ViewJobFeed", aVar, 3);
                pluginGeneratedSerialDescriptor.k("homepageTk", false);
                pluginGeneratedSerialDescriptor.k("jobKey", false);
                pluginGeneratedSerialDescriptor.k("url", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, mveVar, mveVar};
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
                    } else {
                        if (iP != 2) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        strO3 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new f0(i, strO, strO2, strO3);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.x(serialDescriptor, 0, f0Var.b);
                vl2VarB.x(serialDescriptor, 1, f0Var.c);
                vl2VarB.x(serialDescriptor, 2, f0Var.d);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<f0> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ f0(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                ewa.M(i, 7, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    @o7e
    public static final class g extends jq7 {
        public static final g INSTANCE = new g();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new dp0(7));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2044522670;
        }

        public final KSerializer<g> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "CookiePolicy";
        }
    }

    @o7e
    public static final class j extends jq7 {
        public static final j INSTANCE = new j();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new ao0(8));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1216590333;
        }

        public final KSerializer<j> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "IndeedNumberOneJobSearchSiteClaims";
        }
    }

    @o7e
    public static final class m extends jq7 {
        public static final m INSTANCE = new m();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new vm1(11));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1796587170;
        }

        public final KSerializer<m> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "InterviewPrepHistory";
        }
    }

    @o7e
    public static final class o extends jq7 {
        public static final o INSTANCE = new o();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new jr(15));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 969361932;
        }

        public final KSerializer<o> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Messaging";
        }
    }

    @o7e
    public static final class q extends jq7 {
        public static final q INSTANCE = new q();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new fc2(6));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 775467546;
        }

        public final KSerializer<q> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "MyJobs";
        }
    }

    @o7e
    public static final class r extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new vy2(6))};
        public final x7a b;

        @sy3
        public static final /* synthetic */ class a implements sw5<r> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MyJobsSubTab", aVar, 1);
                pluginGeneratedSerialDescriptor.k("subTab", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{r.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = r.c;
                boolean z = true;
                int i = 0;
                x7a x7aVar = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        x7aVar = (x7a) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), x7aVar);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new r(i, x7aVar);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                r rVar = (r) obj;
                rVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, r.c[0].getValue(), rVar.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<r> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ r(int i, x7a x7aVar) {
            if (1 == (i & 1)) {
                this.b = x7aVar;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }
    }

    @o7e
    public static final class t extends jq7 {
        public static final t INSTANCE = new t();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new wy2(12));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -913818142;
        }

        public final KSerializer<t> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "PrivacyPolicy";
        }
    }

    @o7e
    public static final class u extends jq7 {
        public static final u INSTANCE = new u();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new qr0(6));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 765705905;
        }

        public final KSerializer<u> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Profile";
        }
    }

    @o7e
    public static final class w extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] f = {null, null, null, boa.E(qt8.b, new cn0(10))};
        public final String b;
        public final String c;
        public final String d;
        public final Map<String, String> e;

        @sy3
        public static final /* synthetic */ class a implements sw5<w> {
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
                Lazy<KSerializer<Object>>[] lazyArr = w.f;
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, mveVar, qp1.b(mveVar), qp1.b(lazyArr[3].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = w.f;
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
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 3, lazyArr[3].getValue(), map);
                        i |= 8;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new w(i, strO, strO2, str, map);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                w wVar = (w) obj;
                wVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = w.f;
                String str = wVar.b;
                Map<String, String> map = wVar.e;
                String str2 = wVar.d;
                vl2VarB.x(serialDescriptor, 0, str);
                vl2VarB.x(serialDescriptor, 1, wVar.c);
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
            public final KSerializer<w> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ w(int i, String str, String str2, String str3, Map map) {
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
    }

    @o7e
    public static final class x extends jq7 {
        public static final x INSTANCE = new x();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new oz0(10));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -1743992621;
        }

        public final KSerializer<x> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "RegPromo";
        }
    }

    @o7e
    public static final class y extends jq7 {
        public static final y INSTANCE = new y();
        public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new zr0(8));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 312529269;
        }

        public final KSerializer<y> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "ResumeCoach";
        }
    }

    @o7e
    public static final class z extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] d = {null, boa.E(qt8.b, new as0(10))};
        public final String b;
        public final Map<String, String> c;

        @sy3
        public static final /* synthetic */ class a implements sw5<z> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ScheduleApplyApplicationReview", aVar, 2);
                pluginGeneratedSerialDescriptor.k("applicationId", false);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a, qp1.b(z.d[1].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = z.d;
                boolean z = true;
                int i = 0;
                String strO = null;
                Map map = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iP != 1) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 1, lazyArr[1].getValue(), map);
                        i |= 2;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new z(i, strO, map);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                z zVar = (z) obj;
                zVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = z.d;
                String str = zVar.b;
                Map<String, String> map = zVar.c;
                vl2VarB.x(serialDescriptor, 0, str);
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 1, lazyArr[1].getValue(), map);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<z> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ z(int i, String str, Map map) {
            if (1 != (i & 1)) {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = map;
            }
        }
    }

    @o7e
    public static final class b0 extends jq7 {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public static final /* synthetic */ class a implements sw5<b0> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SupportUrl", aVar, 1);
                pluginGeneratedSerialDescriptor.k("url", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(mve.a)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String str = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new b0(i, str);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                String str = b0Var.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                if (vl2VarB.m(serialDescriptor) || str != null) {
                    vl2VarB.k(serialDescriptor, 0, mve.a, str);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<b0> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b0(int i, String str) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public b0(String str) {
            this.b = str;
        }

        public b0() {
            this(null);
        }
    }

    @o7e
    public static final class d0 extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new ag3(6))};
        public final Map<String, String> b;

        @sy3
        public static final /* synthetic */ class a implements sw5<d0> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UpdateEmail", aVar, 1);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(d0.c[0].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d0.c;
                boolean z = true;
                int i = 0;
                Map map = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 0, lazyArr[0].getValue(), map);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new d0(i, map);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                Map<String, String> map = d0Var.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = d0.c;
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 0, lazyArr[0].getValue(), map);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<d0> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ d0(int i, Map map) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = map;
            }
        }

        public d0(Object obj) {
            this.b = null;
        }

        public d0() {
            this(null);
        }
    }

    @o7e
    public static final class i extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new pl0(6))};
        public final Map<String, String> b;

        @sy3
        public static final /* synthetic */ class a implements sw5<i> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Home", aVar, 1);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(i.c[0].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = i.c;
                boolean z = true;
                int i = 0;
                Map map = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 0, lazyArr[0].getValue(), map);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new i(i, map);
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
                Map<String, String> map = iVar.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = i.c;
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 0, lazyArr[0].getValue(), map);
                }
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

        public /* synthetic */ i(int i, Map map) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = map;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && wl7.b(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            Map<String, String> map = this.b;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public final String toString() {
            return "Home(optionalArgs=" + this.b + ")";
        }

        public i(Map<String, String> map) {
            this.b = map;
        }

        public i() {
            this(null);
        }
    }

    @o7e
    public static final class k extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new bo0(11))};
        public final Map<String, String> b;

        @sy3
        public static final /* synthetic */ class a implements sw5<k> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("InstantResumeReport", aVar, 1);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(k.c[0].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = k.c;
                boolean z = true;
                int i = 0;
                Map map = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 0, lazyArr[0].getValue(), map);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new k(i, map);
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
                Map<String, String> map = kVar.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = k.c;
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 0, lazyArr[0].getValue(), map);
                }
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

        public /* synthetic */ k(int i, Map map) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = map;
            }
        }

        public k(Map<String, String> map) {
            this.b = map;
        }

        public k() {
            this(null);
        }
    }

    @o7e
    public static final class s extends jq7 {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public static final /* synthetic */ class a implements sw5<s> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Pathfinder", aVar, 1);
                pluginGeneratedSerialDescriptor.k("path", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(mve.a)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String str = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new s(i, str);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                s sVar = (s) obj;
                sVar.getClass();
                String str = sVar.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                if (vl2VarB.m(serialDescriptor) || str != null) {
                    vl2VarB.k(serialDescriptor, 0, mve.a, str);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<s> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ s(int i, String str) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public s(String str) {
            this.b = str;
        }

        public s() {
            this(null);
        }
    }

    @o7e
    public static final class v extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new ym0(10))};
        public final Map<String, String> b;

        @sy3
        public static final /* synthetic */ class a implements sw5<v> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ProfileExclusions", aVar, 1);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(v.c[0].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = v.c;
                boolean z = true;
                int i = 0;
                Map map = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 0, lazyArr[0].getValue(), map);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new v(i, map);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                v vVar = (v) obj;
                vVar.getClass();
                Map<String, String> map = vVar.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = v.c;
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 0, lazyArr[0].getValue(), map);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<v> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ v(int i, Map map) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = map;
            }
        }

        public v() {
            this.b = null;
        }
    }

    @o7e
    public static abstract class n {
        public static final a Companion = new a();
        public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new pd1(13));

        public static final class a {
            public final KSerializer<n> serializer() {
                return (KSerializer) n.a.getValue();
            }
        }

        @o7e
        public static final class b extends n {
            public static final C0280b Companion = new C0280b();
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
                                defpackage.b0.m(iP);
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

            /* JADX INFO: renamed from: jq7$n$b$b, reason: collision with other inner class name */
            public static final class C0280b {
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

            public b(String str) {
                str.getClass();
                this.b = str;
            }
        }

        @o7e
        public static final class c extends n {
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
                                defpackage.b0.m(iP);
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

            public c(String str) {
                this.b = str;
            }
        }
    }

    @o7e
    public static final class a0 extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new sz0(5))};
        public final mt7 b;

        @sy3
        public static final /* synthetic */ class a implements sw5<a0> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Serp", aVar, 1);
                pluginGeneratedSerialDescriptor.k("target", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{a0.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = a0.c;
                boolean z = true;
                int i = 0;
                mt7 mt7Var = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        mt7Var = (mt7) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), mt7Var);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new a0(i, mt7Var);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, a0.c[0].getValue(), a0Var.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<a0> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ a0(int i, mt7 mt7Var) {
            if (1 == (i & 1)) {
                this.b = mt7Var;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public a0(mt7 mt7Var) {
            mt7Var.getClass();
            this.b = mt7Var;
        }
    }

    @o7e
    public static final class e0 extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] c = {boa.E(qt8.b, new j7(7))};
        public final n b;

        @sy3
        public static final /* synthetic */ class a implements sw5<e0> {
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
                return new KSerializer[]{e0.c[0].getValue()};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = e0.c;
                boolean z = true;
                int i = 0;
                n nVar = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        nVar = (n) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), nVar);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new e0(i, nVar);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                e0 e0Var = (e0) obj;
                e0Var.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                vl2VarB.y(serialDescriptor, 0, e0.c[0].getValue(), e0Var.b);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<e0> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ e0(int i, n nVar) {
            if (1 == (i & 1)) {
                this.b = nVar;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public e0(n nVar) {
            this.b = nVar;
        }
    }

    @o7e
    public static final class h extends jq7 {
        public static final b Companion = new b();
        public final String b;

        @sy3
        public static final /* synthetic */ class a implements sw5<h> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("EbaAdLink", aVar, 1);
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
                            defpackage.b0.m(iP);
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

        public /* synthetic */ h(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
        }

        public h(String str) {
            str.getClass();
            this.b = str;
        }
    }

    @o7e
    public static final class p extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] d = {null, boa.E(qt8.b, new kr(6))};
        public final String b;
        public final Map<String, String> c;

        @sy3
        public static final /* synthetic */ class a implements sw5<p> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MessagingConversation", aVar, 2);
                pluginGeneratedSerialDescriptor.k("conversationId", false);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{mve.a, qp1.b(p.d[1].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = p.d;
                boolean z = true;
                int i = 0;
                String strO = null;
                Map map = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iP != 1) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 1, lazyArr[1].getValue(), map);
                        i |= 2;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new p(i, strO, map);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                p pVar = (p) obj;
                pVar.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = p.d;
                String str = pVar.b;
                Map<String, String> map = pVar.c;
                vl2VarB.x(serialDescriptor, 0, str);
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 1, lazyArr[1].getValue(), map);
                }
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        public static final class b {
            public final KSerializer<p> serializer() {
                return a.a;
            }
        }

        public p() {
            throw null;
        }

        public /* synthetic */ p(int i, String str, Map map) {
            if (1 != (i & 1)) {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = map;
            }
        }

        public p(String str) {
            str.getClass();
            this.b = str;
            this.c = null;
        }
    }

    @o7e
    public static final class c extends jq7 {
        public static final b Companion = new b();
        public static final Lazy<KSerializer<Object>>[] e = {null, null, boa.E(qt8.b, new mz(8))};
        public final String b;
        public final String c;
        public final Map<String, String> d;

        @sy3
        public static final /* synthetic */ class a implements sw5<c> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("AceNewConversation", aVar, 3);
                pluginGeneratedSerialDescriptor.k("content", true);
                pluginGeneratedSerialDescriptor.k("agentType", true);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = c.e;
                mve mveVar = mve.a;
                return new KSerializer[]{qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[2].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.e;
                boolean z = true;
                int i = 0;
                String str = null;
                String str2 = null;
                Map map = null;
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
                    } else {
                        if (iP != 2) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 2, lazyArr[2].getValue(), map);
                        i |= 4;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new c(i, str, str2, map);
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
                Map<String, String> map = cVar.d;
                String str = cVar.c;
                String str2 = cVar.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = c.e;
                if (vl2VarB.m(serialDescriptor) || str2 != null) {
                    vl2VarB.k(serialDescriptor, 0, mve.a, str2);
                }
                if (vl2VarB.m(serialDescriptor) || str != null) {
                    vl2VarB.k(serialDescriptor, 1, mve.a, str);
                }
                if (vl2VarB.m(serialDescriptor) || map != null) {
                    vl2VarB.k(serialDescriptor, 2, lazyArr[2].getValue(), map);
                }
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

        public /* synthetic */ c(int i, String str, String str2, Map map) {
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
                this.d = map;
            }
        }

        public c(String str, String str2, Map<String, String> map) {
            this.b = str;
            this.c = str2;
            this.d = map;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            String str = null;
            this(str, str, 7);
        }

        public /* synthetic */ c(String str, String str2, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (Map<String, String>) null);
        }
    }

    @o7e
    public static final class l extends jq7 {
        public static final b Companion = new b();
        public final String b;
        public final String c;
        public final hq7 d;

        @sy3
        public static final /* synthetic */ class a implements sw5<l> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("InterviewPrep", aVar, 3);
                pluginGeneratedSerialDescriptor.k("occupationSuid", true);
                pluginGeneratedSerialDescriptor.k("occupationLabel", true);
                pluginGeneratedSerialDescriptor.k("jobDetails", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                mve mveVar = mve.a;
                return new KSerializer[]{qp1.b(mveVar), qp1.b(mveVar), qp1.b(hq7.a.a)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                boolean z = true;
                int i = 0;
                String str = null;
                String str2 = null;
                hq7 hq7Var = null;
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
                    } else {
                        if (iP != 2) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        hq7Var = (hq7) ul2VarB.h(serialDescriptor, 2, hq7.a.a, hq7Var);
                        i |= 4;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new l(i, str, str2, hq7Var);
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
                hq7 hq7Var = lVar.d;
                String str = lVar.c;
                String str2 = lVar.b;
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                if (vl2VarB.m(serialDescriptor) || str2 != null) {
                    vl2VarB.k(serialDescriptor, 0, mve.a, str2);
                }
                if (vl2VarB.m(serialDescriptor) || str != null) {
                    vl2VarB.k(serialDescriptor, 1, mve.a, str);
                }
                if (vl2VarB.m(serialDescriptor) || hq7Var != null) {
                    vl2VarB.k(serialDescriptor, 2, hq7.a.a, hq7Var);
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

        public /* synthetic */ l(int i, String str, String str2, hq7 hq7Var) {
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
                this.d = hq7Var;
            }
        }

        public l(String str, String str2, hq7 hq7Var) {
            this.b = str;
            this.c = str2;
            this.d = hq7Var;
        }

        public l() {
            this((String) null, (hq7) (0 == true ? 1 : 0), 7);
        }

        public /* synthetic */ l(String str, hq7 hq7Var, int i) {
            this((i & 1) != 0 ? null : str, (String) null, (i & 4) != 0 ? null : hq7Var);
        }
    }

    @o7e
    public static final class b extends jq7 {
        public static final C0279b Companion = new C0279b();
        public static final Lazy<KSerializer<Object>>[] f = {null, null, null, boa.E(qt8.b, new lz(9))};
        public final String b;
        public final String c;
        public final String d;
        public final Map<String, String> e;

        @sy3
        public static final /* synthetic */ class a implements sw5<b> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("AceConversation", aVar, 4);
                pluginGeneratedSerialDescriptor.k("conversationId", false);
                pluginGeneratedSerialDescriptor.k("content", true);
                pluginGeneratedSerialDescriptor.k("agentType", true);
                pluginGeneratedSerialDescriptor.k("optionalArgs", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                Lazy<KSerializer<Object>>[] lazyArr = b.f;
                mve mveVar = mve.a;
                return new KSerializer[]{mveVar, qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[3].getValue())};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                Lazy<KSerializer<Object>>[] lazyArr = b.f;
                boolean z = true;
                int i = 0;
                String strO = null;
                String str = null;
                String str2 = null;
                Map map = null;
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
                        str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            defpackage.b0.m(iP);
                            return null;
                        }
                        map = (Map) ul2VarB.h(serialDescriptor, 3, lazyArr[3].getValue(), map);
                        i |= 8;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new b(i, strO, str, str2, map);
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
                Lazy<KSerializer<Object>>[] lazyArr = b.f;
                String str = bVar.b;
                Map<String, String> map = bVar.e;
                String str2 = bVar.d;
                String str3 = bVar.c;
                vl2VarB.x(serialDescriptor, 0, str);
                if (vl2VarB.m(serialDescriptor) || str3 != null) {
                    vl2VarB.k(serialDescriptor, 1, mve.a, str3);
                }
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

        /* JADX INFO: renamed from: jq7$b$b, reason: collision with other inner class name */
        public static final class C0279b {
            public final KSerializer<b> serializer() {
                return a.a;
            }
        }

        public b() {
            throw null;
        }

        public /* synthetic */ b(int i, String str, String str2, String str3, Map map) {
            if (1 != (i & 1)) {
                ewa.M(i, 1, a.a.get$$serialDesc());
                throw null;
            }
            this.b = str;
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
                this.e = map;
            }
        }

        public b(String str, String str2, String str3) {
            str.getClass();
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = null;
        }
    }
}
