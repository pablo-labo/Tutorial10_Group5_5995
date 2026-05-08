package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.tq6;
import defpackage.w2;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class z7f extends d4f {
    public static final b Companion = new b();
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final c n;
    public final d o;
    public final tq6.c p;
    public final tq6.c q;

    @sy3
    public static final /* synthetic */ class a implements sw5<z7f> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("tag", aVar, 10);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("iconNameBefore", true);
            pluginGeneratedSerialDescriptor.k("iconNameAfter", true);
            pluginGeneratedSerialDescriptor.k("status", true);
            pluginGeneratedSerialDescriptor.k("variant", true);
            pluginGeneratedSerialDescriptor.k("text", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            String str = null;
            boolean z = true;
            String str2 = null;
            int i = 0;
            String str3 = null;
            Boolean bool = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str3 = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str3);
                        i |= 1;
                        break;
                    case 1:
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                        break;
                    case 2:
                        str4 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str4);
                        i |= 4;
                        break;
                    case 3:
                        str5 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str5);
                        i |= 8;
                        break;
                    case 4:
                        str6 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str6);
                        i |= 16;
                        break;
                    case 5:
                        str7 = (String) ul2VarB.h(serialDescriptor, 5, mve.a, str7);
                        i |= 32;
                        break;
                    case 6:
                        str8 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str8);
                        i |= 64;
                        break;
                    case 7:
                        str9 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str9);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        str2 = (String) ul2VarB.h(serialDescriptor, 8, mve.a, str2);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        str = (String) ul2VarB.h(serialDescriptor, 9, mve.a, str);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new z7f(i, str3, bool, str4, str5, str6, str7, str8, str9, str2, str);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            z7f z7fVar = (z7f) obj;
            z7fVar.getClass();
            String str = z7fVar.m;
            String str2 = z7fVar.l;
            String str3 = z7fVar.k;
            String str4 = z7fVar.j;
            String str5 = z7fVar.i;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(z7fVar, vl2VarB, serialDescriptor);
            if (vl2VarB.m(serialDescriptor) || str5 != null) {
                vl2VarB.k(serialDescriptor, 5, mve.a, str5);
            }
            if (vl2VarB.m(serialDescriptor) || str4 != null) {
                vl2VarB.k(serialDescriptor, 6, mve.a, str4);
            }
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 8, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 9, mve.a, str);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<z7f> serializer() {
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
        }

        static {
            c cVar = new c("Success", 0);
            c cVar2 = new c("Alert", 1);
            c cVar3 = new c("Warning", 2);
            c cVar4 = new c("Neutral", 3);
            c = cVar4;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, new c("Info", 4)};
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
        public static final a a;
        public static final LinkedHashMap b;
        public static final d c;
        public static final /* synthetic */ d[] d;

        public static final class a {
        }

        static {
            d dVar = new d("Outline", 0);
            d dVar2 = new d("Solid", 1);
            d dVar3 = new d("Light", 2);
            c = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            d = dVarArr;
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
            return (d[]) d.clone();
        }
    }

    public z7f(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        c cVar;
        d dVar;
        String string;
        String strValueOf;
        String string2;
        String strValueOf2;
        super(i, str, bool, str2, str3, str4);
        if ((i & 32) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 64) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.m = null;
        } else {
            this.m = str9;
        }
        String str10 = this.k;
        if (str10 != null) {
            c.a.getClass();
            LinkedHashMap linkedHashMap = c.b;
            if (str10.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = str10.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    strValueOf2 = ypd.Z(cCharAt, locale);
                } else {
                    strValueOf2 = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf2);
                sb.append(str10.substring(1));
                string2 = sb.toString();
            } else {
                string2 = str10;
            }
            cVar = (c) linkedHashMap.get(string2);
            if (cVar == null) {
                l5.q("Unknown status: ".concat(str10));
                throw null;
            }
        } else {
            cVar = null;
        }
        this.n = cVar;
        String str11 = this.l;
        if (str11 != null) {
            d.a.getClass();
            LinkedHashMap linkedHashMap2 = d.b;
            if (str11.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char cCharAt2 = str11.charAt(0);
                if (Character.isLowerCase(cCharAt2)) {
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    strValueOf = ypd.Z(cCharAt2, locale2);
                } else {
                    strValueOf = String.valueOf(cCharAt2);
                }
                sb2.append((Object) strValueOf);
                sb2.append(str11.substring(1));
                string = sb2.toString();
            } else {
                string = str11;
            }
            dVar = (d) linkedHashMap2.get(string);
            if (dVar == null) {
                l5.q("Unknown variant: ".concat(str11));
                throw null;
            }
        } else {
            dVar = null;
        }
        this.o = dVar;
        String str12 = this.i;
        this.p = str12 != null ? tq6.c.valueOf(str12) : null;
        String str13 = this.j;
        this.q = str13 != null ? tq6.c.valueOf(str13) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7f)) {
            return false;
        }
        z7f z7fVar = (z7f) obj;
        return wl7.b(this.i, z7fVar.i) && wl7.b(this.j, z7fVar.j) && wl7.b(this.k, z7fVar.k) && wl7.b(this.l, z7fVar.l) && wl7.b(this.m, z7fVar.m);
    }

    public final int hashCode() {
        String str = this.i;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("TagComponent(iconNameBefore=", this.i, ", iconNameAfter=", this.j, ", status=");
        ia.r(sbF, this.k, ", variant=", this.l, ", text=");
        return l6.i(sbF, this.m, ")");
    }

    public z7f() {
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }
}
