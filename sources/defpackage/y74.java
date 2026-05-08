package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.w2;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class y74 extends d4f {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] n = {null, null, null, null, null, null, null, boa.E(qt8.b, new vy2(2))};
    public final String i;
    public final String j;
    public final d4f k;
    public final c l;
    public final d m;

    @sy3
    public static final /* synthetic */ class a implements sw5<y74> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("divider", aVar, 8);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("lineWeight", true);
            pluginGeneratedSerialDescriptor.k("spacing", true);
            pluginGeneratedSerialDescriptor.k("content", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = y74.n;
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[7].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = y74.n;
            Object obj = null;
            boolean z = true;
            d4f d4fVar = null;
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
                        d4fVar = (d4f) ul2VarB.h(serialDescriptor, 7, lazyArr[7].getValue(), d4fVar);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new y74(i, str, bool, str2, str3, str4, str5, str6, d4fVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            y74 y74Var = (y74) obj;
            y74Var.getClass();
            d4f d4fVar = y74Var.k;
            String str = y74Var.j;
            String str2 = y74Var.i;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(y74Var, vl2VarB, serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = y74.n;
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 5, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 6, mve.a, str);
            }
            if (vl2VarB.m(serialDescriptor) || d4fVar != null) {
                vl2VarB.k(serialDescriptor, 7, lazyArr[7].getValue(), d4fVar);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<y74> serializer() {
            return a.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final a a;
        public static final c b;
        public static final /* synthetic */ c[] c;
        public static final /* synthetic */ wv4 d;
        private final float value;

        public static final class a {
        }

        static {
            c cVar = new c("Sm", 0, 1.0f);
            b = cVar;
            c[] cVarArr = {cVar, new c("Md", 1, 2.0f), new c("Lg", 2, 4.0f)};
            c = cVarArr;
            d = new wv4(cVarArr);
            a = new a();
        }

        public c(String str, int i, float f) {
            this.value = f;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }

        public final float a() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final a a;
        public static final /* synthetic */ d[] b;
        public static final /* synthetic */ wv4 c;
        private final float value;

        public static final class a {
        }

        static {
            d[] dVarArr = {new d("None", 0, 0.0f), new d("Sm", 1, 8.0f), new d("Md", 2, 16.0f), new d("Lg", 3, 24.0f), new d("Xl", 4, 32.0f)};
            b = dVarArr;
            c = new wv4(dVarArr);
            a = new a();
        }

        public d(String str, int i, float f) {
            this.value = f;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) b.clone();
        }
    }

    public y74(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, d4f d4fVar) {
        c cVar;
        Object next;
        Object next2;
        super(i, str, bool, str2, str3, str4);
        d dVar = null;
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
            this.k = d4fVar;
        }
        String str7 = this.i;
        if (str7 != null) {
            c.a.getClass();
            wv4 wv4Var = c.d;
            wv4Var.getClass();
            w2.b bVar = new w2.b();
            while (true) {
                if (!bVar.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = bVar.next();
                    if (wve.E(((c) next2).name(), str7, true)) {
                        break;
                    }
                }
            }
            cVar = (c) next2;
            if (cVar == null) {
                l5.q("Unknown lineWeight: ".concat(str7));
                throw null;
            }
        } else {
            cVar = null;
        }
        this.l = cVar;
        String str8 = this.j;
        if (str8 != null) {
            d.a.getClass();
            wv4 wv4Var2 = d.c;
            wv4Var2.getClass();
            w2.b bVar2 = new w2.b();
            while (true) {
                if (!bVar2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = bVar2.next();
                    if (wve.E(((d) next).name(), str8, true)) {
                        break;
                    }
                }
            }
            d dVar2 = (d) next;
            if (dVar2 == null) {
                l5.q("Unknown spacing: ".concat(str8));
                throw null;
            }
            dVar = dVar2;
        }
        this.m = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y74)) {
            return false;
        }
        y74 y74Var = (y74) obj;
        return wl7.b(this.i, y74Var.i) && wl7.b(this.j, y74Var.j) && wl7.b(this.k, y74Var.k);
    }

    public final int hashCode() {
        String str = this.i;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d4f d4fVar = this.k;
        return iHashCode2 + (d4fVar != null ? d4fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("DividerComponent(lineWeight=", this.i, ", spacing=", this.j, ", content=");
        sbF.append(this.k);
        sbF.append(")");
        return sbF.toString();
    }

    public y74() {
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }
}
