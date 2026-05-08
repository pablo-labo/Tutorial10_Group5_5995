package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.w2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class fl1 extends d4f {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] n = {null, null, null, null, null, null, null, boa.E(qt8.b, new lz(5))};
    public final String i;
    public final String j;
    public final List<d4f> k;
    public final d l;
    public final c m;

    @sy3
    public static final /* synthetic */ class a implements sw5<fl1> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("box", aVar, 8);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("layout", true);
            pluginGeneratedSerialDescriptor.k("horizontalAlignment", true);
            pluginGeneratedSerialDescriptor.k("content", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = fl1.n;
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), lazyArr[7].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = fl1.n;
            Object obj = null;
            boolean z = true;
            List list = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i = 0;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i |= 1;
                        break;
                    case 1:
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                        i |= 4;
                        break;
                    case 3:
                        str3 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str4);
                        i |= 16;
                        break;
                    case 5:
                        str5 = (String) ul2VarB.h(serialDescriptor, 5, mve.a, str5);
                        i |= 32;
                        break;
                    case 6:
                        str6 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str6);
                        i |= 64;
                        break;
                    case 7:
                        list = (List) ul2VarB.z(serialDescriptor, 7, lazyArr[7].getValue(), list);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new fl1(i, str, bool, str2, str3, str4, str5, str6, list);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            fl1 fl1Var = (fl1) obj;
            fl1Var.getClass();
            String str = fl1Var.j;
            String str2 = fl1Var.i;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(fl1Var, vl2VarB, serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = fl1.n;
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 5, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 6, mve.a, str);
            }
            vl2VarB.y(serialDescriptor, 7, lazyArr[7].getValue(), fl1Var.k);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<fl1> serializer() {
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
            c[] cVarArr = {new c("Left", 0), new c("Center", 1), new c("Right", 2)};
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
            d dVar = new d("Inline", 0);
            c = dVar;
            d[] dVarArr = {dVar, new d("Stack", 1)};
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, List list) {
        d dVar;
        String string;
        String strValueOf;
        String string2;
        String strValueOf2;
        super(i, str, bool, str2, str3, str4);
        c cVar = null;
        if (128 != (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) {
            ewa.M(i, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, a.a.get$$serialDesc());
            throw null;
        }
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
        this.k = list;
        String str7 = this.i;
        if (str7 != null) {
            d.a.getClass();
            LinkedHashMap linkedHashMap = d.b;
            if (str7.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = str7.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    strValueOf2 = ypd.Z(cCharAt, locale);
                } else {
                    strValueOf2 = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf2);
                sb.append(str7.substring(1));
                string2 = sb.toString();
            } else {
                string2 = str7;
            }
            dVar = (d) linkedHashMap.get(string2);
            if (dVar == null) {
                l5.q("Unknown layout: ".concat(str7));
                throw null;
            }
        } else {
            dVar = null;
        }
        this.l = dVar;
        String str8 = this.j;
        if (str8 != null) {
            c.a.getClass();
            LinkedHashMap linkedHashMap2 = c.b;
            if (str8.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char cCharAt2 = str8.charAt(0);
                if (Character.isLowerCase(cCharAt2)) {
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    strValueOf = ypd.Z(cCharAt2, locale2);
                } else {
                    strValueOf = String.valueOf(cCharAt2);
                }
                sb2.append((Object) strValueOf);
                sb2.append(str8.substring(1));
                string = sb2.toString();
            } else {
                string = str8;
            }
            c cVar2 = (c) linkedHashMap2.get(string);
            if (cVar2 == null) {
                l5.q("Unknown horizontalAlignment: ".concat(str8));
                throw null;
            }
            cVar = cVar2;
        }
        this.m = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl1)) {
            return false;
        }
        fl1 fl1Var = (fl1) obj;
        return wl7.b(this.i, fl1Var.i) && wl7.b(this.j, fl1Var.j) && wl7.b(this.k, fl1Var.k);
    }

    public final int hashCode() {
        String str = this.i;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.j;
        return this.k.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return g7.i(u40.f("BoxComponent(layout=", this.i, ", horizontalAlignment=", this.j, ", content="), this.k, ")");
    }
}
