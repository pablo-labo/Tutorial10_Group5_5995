package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class zg6 extends d4f {
    public static final b Companion = new b();
    public final int i;
    public final String j;
    public final String k;
    public final c l;
    public final d m;

    @sy3
    public static final /* synthetic */ class a implements sw5<zg6> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("heading", aVar, 8);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("level", false);
            pluginGeneratedSerialDescriptor.k("text", false);
            pluginGeneratedSerialDescriptor.k("textAlignment", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), rh7.a, mveVar, qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Object obj = null;
            boolean z = true;
            int i = 0;
            int iM = 0;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String strO = null;
            String str5 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        continue;
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
                        iM = ul2VarB.m(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strO = ul2VarB.o(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        str5 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str5);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new zg6(i, str, bool, str2, str3, str4, iM, strO, str5);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            zg6 zg6Var = (zg6) obj;
            zg6Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(zg6Var, vl2VarB, serialDescriptor);
            int i = zg6Var.i;
            String str = zg6Var.k;
            vl2VarB.r(5, i, serialDescriptor);
            vl2VarB.x(serialDescriptor, 6, zg6Var.j);
            if (vl2VarB.m(serialDescriptor) || str != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<zg6> serializer() {
            return a.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final a a;
        public static final /* synthetic */ c[] b;
        public static final /* synthetic */ wv4 c;

        public static final class a {
        }

        static {
            c[] cVarArr = {new c("L1", 0), new c("L2", 1), new c("L3", 2), new c("L4", 3), new c("L5", 4), new c("L6", 5), new c("L7", 6), new c("L8", 7)};
            b = cVarArr;
            c = new wv4(cVarArr);
            a = new a();
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final a a;
        public static final d b;
        public static final /* synthetic */ d[] c;
        public static final /* synthetic */ wv4 d;

        public static final class a {
        }

        static {
            d dVar = new d("Left", 0);
            b = dVar;
            d[] dVarArr = {dVar, new d("Center", 1), new d("Right", 2)};
            c = dVarArr;
            d = new wv4(dVarArr);
            a = new a();
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg6(int i, String str, Boolean bool, String str2, String str3, String str4, int i2, String str5, String str6) {
        Object next;
        Object next2;
        super(i, str, bool, str2, str3, str4);
        d dVar = null;
        if (96 != (i & 96)) {
            ewa.M(i, 96, a.a.get$$serialDesc());
            throw null;
        }
        this.i = i2;
        this.j = str5;
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        c.a.getClass();
        Iterator<T> it = c.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((c) next).name(), "L" + i2)) {
                break;
            }
        }
        c cVar = (c) next;
        if (cVar == null) {
            l5.q(p6.c(i2, "Unknown level: "));
            throw null;
        }
        this.l = cVar;
        String str7 = this.k;
        if (str7 != null) {
            d.a.getClass();
            Iterator<T> it2 = d.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (wve.E(((d) next2).name(), str7, true)) {
                        break;
                    }
                }
            }
            d dVar2 = (d) next2;
            if (dVar2 == null) {
                l5.q("Unknown textAligment: ".concat(str7));
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
        if (!(obj instanceof zg6)) {
            return false;
        }
        zg6 zg6Var = (zg6) obj;
        return this.i == zg6Var.i && wl7.b(this.j, zg6Var.j) && wl7.b(this.k, zg6Var.k);
    }

    public final int hashCode() {
        int iD = akb.d(Integer.hashCode(this.i) * 31, 31, this.j);
        String str = this.k;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return l6.i(m6.j(this.i, "HeadingComponent(level=", ", text=", this.j, ", textAlignment="), this.k, ")");
    }
}
