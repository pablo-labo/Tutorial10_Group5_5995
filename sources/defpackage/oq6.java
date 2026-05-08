package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gq1;
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
public final class oq6 extends d4f {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] q = {null, null, null, null, null, null, null, null, null, boa.E(qt8.b, new k7(3))};
    public final String i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final n3f m;
    public final tq6.c n;
    public final gq1.c o;
    public final c p;

    @sy3
    public static final /* synthetic */ class a implements sw5<oq6> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("iconButton", aVar, 10);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("iconName", false);
            pluginGeneratedSerialDescriptor.k("fullWidth", true);
            pluginGeneratedSerialDescriptor.k("size", true);
            pluginGeneratedSerialDescriptor.k("variant", true);
            pluginGeneratedSerialDescriptor.k("onClick", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = oq6.q;
            mve mveVar = mve.a;
            KSerializer<?> kSerializerB = qp1.b(mveVar);
            ni1 ni1Var = ni1.a;
            return new KSerializer[]{kSerializerB, qp1.b(ni1Var), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), mveVar, qp1.b(ni1Var), qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[9].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            Lazy<KSerializer<Object>>[] lazyArr;
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr2 = oq6.q;
            n3f n3fVar = null;
            String str = null;
            boolean z = true;
            String str2 = null;
            int i = 0;
            String str3 = null;
            Boolean bool = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String strO = null;
            Boolean bool2 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        lazyArr = lazyArr2;
                        str3 = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str3);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        str4 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str4);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        str5 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str5);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        str6 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str6);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        bool2 = (Boolean) ul2VarB.h(serialDescriptor, 6, ni1.a, bool2);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        str2 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str2);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        str = (String) ul2VarB.h(serialDescriptor, 8, mve.a, str);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        lazyArr = lazyArr2;
                        n3fVar = (n3f) ul2VarB.h(serialDescriptor, 9, lazyArr2[9].getValue(), n3fVar);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
                lazyArr2 = lazyArr;
            }
            ul2VarB.c(serialDescriptor);
            return new oq6(i, str3, bool, str4, str5, str6, strO, bool2, str2, str, n3fVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            oq6 oq6Var = (oq6) obj;
            oq6Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(oq6Var, vl2VarB, serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = oq6.q;
            String str = oq6Var.i;
            n3f n3fVar = oq6Var.m;
            String str2 = oq6Var.l;
            String str3 = oq6Var.k;
            Boolean bool = oq6Var.j;
            vl2VarB.x(serialDescriptor, 5, str);
            if (vl2VarB.m(serialDescriptor) || bool != null) {
                vl2VarB.k(serialDescriptor, 6, ni1.a, bool);
            }
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 8, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || n3fVar != null) {
                vl2VarB.k(serialDescriptor, 9, lazyArr[9].getValue(), n3fVar);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<oq6> serializer() {
            return a.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final a a;
        public static final LinkedHashMap b;
        public static final /* synthetic */ c[] c;

        public static final class a {
        }

        static {
            c[] cVarArr = {new c("Primary", 0), new c("Inverse", 1), new c("Utility", 2)};
            c = cVarArr;
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
            return (c[]) c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq6(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, Boolean bool2, String str6, String str7, n3f n3fVar) {
        gq1.c cVarA;
        String string;
        String strValueOf;
        super(i, str, bool, str2, str3, str4);
        c cVar = null;
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
            this.m = n3fVar;
        }
        this.n = tq6.c.valueOf(str5);
        String str8 = this.k;
        if (str8 != null) {
            gq1.c.a.getClass();
            cVarA = gq1.c.a.a(str8);
        } else {
            cVarA = null;
        }
        this.o = cVarA;
        String str9 = this.l;
        if (str9 != null) {
            c.a.getClass();
            LinkedHashMap linkedHashMap = c.b;
            if (str9.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = str9.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    strValueOf = ypd.Z(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                sb.append(str9.substring(1));
                string = sb.toString();
            } else {
                string = str9;
            }
            c cVar2 = (c) linkedHashMap.get(string);
            if (cVar2 == null) {
                l5.q("Unknown variant: ".concat(str9));
                throw null;
            }
            cVar = cVar2;
        }
        this.p = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq6)) {
            return false;
        }
        oq6 oq6Var = (oq6) obj;
        return wl7.b(this.i, oq6Var.i) && wl7.b(this.j, oq6Var.j) && wl7.b(this.k, oq6Var.k) && wl7.b(this.l, oq6Var.l) && wl7.b(this.m, oq6Var.m);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        Boolean bool = this.j;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n3f n3fVar = this.m;
        return iHashCode4 + (n3fVar != null ? n3fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconButtonComponent(iconName=");
        sb.append(this.i);
        sb.append(", fullWidth=");
        sb.append(this.j);
        sb.append(", size=");
        ia.r(sb, this.k, ", variant=", this.l, ", onClick=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
