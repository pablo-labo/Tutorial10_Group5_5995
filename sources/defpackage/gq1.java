package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.tq6;
import defpackage.w2;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class gq1 extends d4f {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] t = {null, null, null, null, null, null, null, null, null, null, null, boa.E(qt8.b, new ym0(3))};
    public final String i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final n3f o;
    public final tq6.c p;
    public final tq6.c q;
    public final c r;
    public final d s;

    @sy3
    public static final /* synthetic */ class a implements sw5<gq1> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("button", aVar, 12);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("text", false);
            pluginGeneratedSerialDescriptor.k("fullWidth", true);
            pluginGeneratedSerialDescriptor.k("iconNameAfter", true);
            pluginGeneratedSerialDescriptor.k("iconNameBefore", true);
            pluginGeneratedSerialDescriptor.k("size", true);
            pluginGeneratedSerialDescriptor.k("variant", true);
            pluginGeneratedSerialDescriptor.k("onClick", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = gq1.t;
            mve mveVar = mve.a;
            KSerializer<?> kSerializerB = qp1.b(mveVar);
            ni1 ni1Var = ni1.a;
            return new KSerializer[]{kSerializerB, qp1.b(ni1Var), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), mveVar, qp1.b(ni1Var), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[11].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            String str;
            boolean z;
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = gq1.t;
            n3f n3fVar = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            boolean z2 = true;
            String str5 = null;
            int i = 0;
            String str6 = null;
            Boolean bool = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String strO = null;
            Boolean bool2 = null;
            while (z2) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        str = strO;
                        z2 = false;
                        strO = str;
                        break;
                    case 0:
                        z = z2;
                        str = strO;
                        str6 = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str6);
                        i |= 1;
                        z2 = z;
                        strO = str;
                        break;
                    case 1:
                        z = z2;
                        str = strO;
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                        z2 = z;
                        strO = str;
                        break;
                    case 2:
                        z = z2;
                        str = strO;
                        str7 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str7);
                        i |= 4;
                        z2 = z;
                        strO = str;
                        break;
                    case 3:
                        z = z2;
                        str = strO;
                        str8 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str8);
                        i |= 8;
                        z2 = z;
                        strO = str;
                        break;
                    case 4:
                        z = z2;
                        str = strO;
                        str9 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str9);
                        i |= 16;
                        z2 = z;
                        strO = str;
                        break;
                    case 5:
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        z2 = z2;
                        break;
                    case 6:
                        z = z2;
                        str = strO;
                        bool2 = (Boolean) ul2VarB.h(serialDescriptor, 6, ni1.a, bool2);
                        i |= 64;
                        z2 = z;
                        strO = str;
                        break;
                    case 7:
                        z = z2;
                        str = strO;
                        str5 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str5);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        z2 = z;
                        strO = str;
                        break;
                    case 8:
                        z = z2;
                        str = strO;
                        str4 = (String) ul2VarB.h(serialDescriptor, 8, mve.a, str4);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        z2 = z;
                        strO = str;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        z = z2;
                        str = strO;
                        str3 = (String) ul2VarB.h(serialDescriptor, 9, mve.a, str3);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        z2 = z;
                        strO = str;
                        break;
                    case 10:
                        z = z2;
                        str = strO;
                        str2 = (String) ul2VarB.h(serialDescriptor, 10, mve.a, str2);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        z2 = z;
                        strO = str;
                        break;
                    case 11:
                        z = z2;
                        str = strO;
                        n3fVar = (n3f) ul2VarB.h(serialDescriptor, 11, lazyArr[11].getValue(), n3fVar);
                        i |= 2048;
                        z2 = z;
                        strO = str;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new gq1(i, str6, bool, str7, str8, str9, strO, bool2, str5, str4, str3, str2, n3fVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            gq1 gq1Var = (gq1) obj;
            gq1Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(gq1Var, vl2VarB, serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = gq1.t;
            String str = gq1Var.i;
            n3f n3fVar = gq1Var.o;
            String str2 = gq1Var.n;
            String str3 = gq1Var.m;
            String str4 = gq1Var.l;
            String str5 = gq1Var.k;
            Boolean bool = gq1Var.j;
            vl2VarB.x(serialDescriptor, 5, str);
            if (vl2VarB.m(serialDescriptor) || bool != null) {
                vl2VarB.k(serialDescriptor, 6, ni1.a, bool);
            }
            if (vl2VarB.m(serialDescriptor) || str5 != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str5);
            }
            if (vl2VarB.m(serialDescriptor) || str4 != null) {
                vl2VarB.k(serialDescriptor, 8, mve.a, str4);
            }
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 9, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 10, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || n3fVar != null) {
                vl2VarB.k(serialDescriptor, 11, lazyArr[11].getValue(), n3fVar);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<gq1> serializer() {
            return a.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final a a;
        public static final LinkedHashMap b;
        public static final c c;
        public static final /* synthetic */ c[] d;

        public static final class a {
            public static c a(String str) {
                String string;
                String strValueOf;
                str.getClass();
                LinkedHashMap linkedHashMap = c.b;
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = str.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        Locale locale = Locale.ROOT;
                        locale.getClass();
                        strValueOf = ypd.Z(cCharAt, locale);
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb.append((Object) strValueOf);
                    sb.append(str.substring(1));
                    string = sb.toString();
                } else {
                    string = str;
                }
                c cVar = (c) linkedHashMap.get(string);
                if (cVar != null) {
                    return cVar;
                }
                l5.q("Unknown size: ".concat(str));
                return null;
            }
        }

        static {
            c cVar = new c("Sm", 0);
            c = cVar;
            c[] cVarArr = {cVar, new c("Md", 1), new c("Lg", 2)};
            d = cVarArr;
            wv4 wv4Var = new wv4(cVarArr);
            a = new a();
            int iV = kc9.V(t92.r0(wv4Var, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
            w2.b bVar = new w2.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                linkedHashMap.put(((c) next).name(), next);
            }
            b = linkedHashMap;
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d V;
        public static final d W;
        public static final /* synthetic */ d[] X;
        public static final a a;
        public static final LinkedHashMap b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;

        public static final class a {
        }

        static {
            d dVar = new d("Text", 0);
            c = dVar;
            d dVar2 = new d("Secondary", 1);
            d = dVar2;
            d dVar3 = new d("Primary", 2);
            e = dVar3;
            d dVar4 = new d("Tertiary", 3);
            f = dVar4;
            d dVar5 = new d("DestructivePrimary", 4);
            d dVar6 = new d("DestructiveSecondary", 5);
            d dVar7 = new d("DestructiveTertiary", 6);
            d dVar8 = new d("DestructiveText", 7);
            d dVar9 = new d("Inverse", 8);
            V = dVar9;
            d dVar10 = new d("Utility", 9);
            W = dVar10;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
            X = dVarArr;
            wv4 wv4Var = new wv4(dVarArr);
            a = new a();
            int iV = kc9.V(t92.r0(wv4Var, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
            w2.b bVar = new w2.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                linkedHashMap.put(((d) next).name(), next);
            }
            b = linkedHashMap;
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) X.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq1(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, Boolean bool2, String str6, String str7, String str8, String str9, n3f n3fVar) {
        c cVarA;
        String string;
        String strValueOf;
        super(i, str, bool, str2, str3, str4);
        d dVar = null;
        if (32 != (i & 32)) {
            ewa.M(i, 32, a.a.get$$serialDesc());
            throw null;
        }
        this.i = str5;
        if ((i & 64) == 0) {
            this.j = null;
        } else {
            this.j = bool2;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.l = null;
        } else {
            this.l = str7;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.m = null;
        } else {
            this.m = str8;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.n = null;
        } else {
            this.n = str9;
        }
        if ((i & 2048) == 0) {
            this.o = null;
        } else {
            this.o = n3fVar;
        }
        String str10 = this.k;
        this.p = str10 != null ? tq6.c.valueOf(str10) : null;
        String str11 = this.l;
        this.q = str11 != null ? tq6.c.valueOf(str11) : null;
        String str12 = this.m;
        if (str12 != null) {
            c.a.getClass();
            cVarA = c.a.a(str12);
        } else {
            cVarA = null;
        }
        this.r = cVarA;
        String str13 = this.n;
        if (str13 != null) {
            d.a.getClass();
            LinkedHashMap linkedHashMap = d.b;
            if (str13.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = str13.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    strValueOf = ypd.Z(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                sb.append(str13.substring(1));
                string = sb.toString();
            } else {
                string = str13;
            }
            d dVar2 = (d) linkedHashMap.get(string);
            if (dVar2 == null) {
                l5.q("Unknown variant: ".concat(str13));
                throw null;
            }
            dVar = dVar2;
        }
        this.s = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq1)) {
            return false;
        }
        gq1 gq1Var = (gq1) obj;
        return wl7.b(this.i, gq1Var.i) && wl7.b(this.j, gq1Var.j) && wl7.b(this.k, gq1Var.k) && wl7.b(this.l, gq1Var.l) && wl7.b(this.m, gq1Var.m) && wl7.b(this.n, gq1Var.n) && wl7.b(this.o, gq1Var.o);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        Boolean bool = this.j;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        n3f n3fVar = this.o;
        return iHashCode6 + (n3fVar != null ? n3fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonComponent(text=");
        sb.append(this.i);
        sb.append(", fullWidth=");
        sb.append(this.j);
        sb.append(", iconNameAfter=");
        ia.r(sb, this.k, ", iconNameBefore=", this.l, ", size=");
        ia.r(sb, this.m, ", variant=", this.n, ", onClick=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
