package defpackage;

import defpackage.jpb;
import defpackage.k83;
import defpackage.lx0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class hd7 {
    public static final b Companion = new b();
    public final jpb a;
    public final k83 b;
    public final String c;
    public final String d;
    public final lx0 e;
    public final Boolean f;
    public final Boolean g;

    @sy3
    public static final /* synthetic */ class a implements sw5<hd7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.wlproctor.loader.jsonmodels.InitServiceProctorResult", aVar, 7);
            pluginGeneratedSerialDescriptor.k("proctorResultsModel", false);
            pluginGeneratedSerialDescriptor.k("ctkResultsModel", false);
            pluginGeneratedSerialDescriptor.k("ipCountry", false);
            pluginGeneratedSerialDescriptor.k("ipLookupCountry", false);
            pluginGeneratedSerialDescriptor.k("attributionParams", false);
            pluginGeneratedSerialDescriptor.k("showBlockingTOSBanner", false);
            pluginGeneratedSerialDescriptor.k("showForceUpgradeModal", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            KSerializer<?> kSerializerB = qp1.b(mveVar);
            KSerializer<?> kSerializerB2 = qp1.b(mveVar);
            KSerializer<?> kSerializerB3 = qp1.b(lx0.a.a);
            ni1 ni1Var = ni1.a;
            return new KSerializer[]{jpb.a.a, k83.a.a, kSerializerB, kSerializerB2, kSerializerB3, qp1.b(ni1Var), qp1.b(ni1Var)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            jpb jpbVar = null;
            k83 k83Var = null;
            String str = null;
            String str2 = null;
            lx0 lx0Var = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        jpbVar = (jpb) ul2VarB.z(serialDescriptor, 0, jpb.a.a, jpbVar);
                        i |= 1;
                        break;
                    case 1:
                        k83Var = (k83) ul2VarB.z(serialDescriptor, 1, k83.a.a, k83Var);
                        i |= 2;
                        break;
                    case 2:
                        str = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str);
                        i |= 4;
                        break;
                    case 3:
                        str2 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str2);
                        i |= 8;
                        break;
                    case 4:
                        lx0Var = (lx0) ul2VarB.h(serialDescriptor, 4, lx0.a.a, lx0Var);
                        i |= 16;
                        break;
                    case 5:
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 5, ni1.a, bool);
                        i |= 32;
                        break;
                    case 6:
                        bool2 = (Boolean) ul2VarB.h(serialDescriptor, 6, ni1.a, bool2);
                        i |= 64;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new hd7(i, jpbVar, k83Var, str, str2, lx0Var, bool, bool2);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            hd7 hd7Var = (hd7) obj;
            hd7Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            vl2VarB.y(serialDescriptor, 0, jpb.a.a, hd7Var.a);
            vl2VarB.y(serialDescriptor, 1, k83.a.a, hd7Var.b);
            mve mveVar = mve.a;
            vl2VarB.k(serialDescriptor, 2, mveVar, hd7Var.c);
            vl2VarB.k(serialDescriptor, 3, mveVar, hd7Var.d);
            vl2VarB.k(serialDescriptor, 4, lx0.a.a, hd7Var.e);
            ni1 ni1Var = ni1.a;
            vl2VarB.k(serialDescriptor, 5, ni1Var, hd7Var.f);
            vl2VarB.k(serialDescriptor, 6, ni1Var, hd7Var.g);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<hd7> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ hd7(int i, jpb jpbVar, k83 k83Var, String str, String str2, lx0 lx0Var, Boolean bool, Boolean bool2) {
        if (127 != (i & 127)) {
            ewa.M(i, 127, a.a.get$$serialDesc());
            throw null;
        }
        this.a = jpbVar;
        this.b = k83Var;
        this.c = str;
        this.d = str2;
        this.e = lx0Var;
        this.f = bool;
        this.g = bool2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L5e
            boolean r1 = r6 instanceof defpackage.hd7
            if (r1 != 0) goto L8
            goto L5e
        L8:
            hd7 r6 = (defpackage.hd7) r6
            java.lang.String r1 = r6.c
            r2 = 1
            java.lang.String r3 = r5.c
            java.lang.String r4 = "null"
            if (r3 != 0) goto L29
            if (r1 == 0) goto L27
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            r1.getClass()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L25
            goto L27
        L25:
            r1 = r0
            goto L3d
        L27:
            r1 = r2
            goto L3d
        L29:
            if (r1 != 0) goto L39
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r3.toLowerCase(r1)
            r1.getClass()
            boolean r1 = r1.equals(r4)
            goto L3d
        L39:
            boolean r1 = r3.equals(r1)
        L3d:
            if (r1 == 0) goto L5e
            java.lang.String r1 = r5.d
            java.lang.String r3 = r6.d
            boolean r1 = defpackage.wl7.b(r1, r3)
            if (r1 == 0) goto L5e
            k83 r1 = r5.b
            k83 r3 = r6.b
            boolean r1 = defpackage.wl7.b(r1, r3)
            if (r1 == 0) goto L5e
            jpb r5 = r5.a
            jpb r6 = r6.a
            boolean r5 = defpackage.wl7.b(r5, r6)
            if (r5 == 0) goto L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        lx0 lx0Var = this.e;
        int iHashCode3 = (iHashCode2 + (lx0Var == null ? 0 : lx0Var.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitServiceProctorResult(proctorResultsModel=");
        sb.append(this.a);
        sb.append(", ctkResultsModel=");
        sb.append(this.b);
        sb.append(", ipCountry=");
        ia.r(sb, this.c, ", ipLookupCountry=", this.d, ", attributionParams=");
        sb.append(this.e);
        sb.append(", showBlockingTOSBanner=");
        sb.append(this.f);
        sb.append(", showForceUpgradeModal=");
        return l5.n(sb, this.g, ")");
    }

    public hd7(jpb jpbVar, k83 k83Var, String str, String str2, lx0 lx0Var, Boolean bool, Boolean bool2) {
        this.a = jpbVar;
        this.b = k83Var;
        this.c = str;
        this.d = str2;
        this.e = lx0Var;
        this.f = bool;
        this.g = bool2;
    }
}
