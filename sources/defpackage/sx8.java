package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.tq6;
import java.util.Iterator;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class sx8 extends d4f {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] o = {null, null, null, null, null, null, null, null, boa.E(qt8.b, new vy2(9))};
    public final String i;
    public final String j;
    public final String k;
    public final n3f l;
    public final tq6.c m;
    public final c n;

    @sy3
    public static final /* synthetic */ class a implements sw5<sx8> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("link", aVar, 9);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("text", false);
            pluginGeneratedSerialDescriptor.k("iconNameAfter", true);
            pluginGeneratedSerialDescriptor.k("variant", true);
            pluginGeneratedSerialDescriptor.k("onClick", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = sx8.o;
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), mveVar, qp1.b(mveVar), qp1.b(mveVar), qp1.b(lazyArr[8].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = sx8.o;
            n3f n3fVar = null;
            boolean z = true;
            String str = null;
            int i = 0;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String strO = null;
            String str6 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str2 = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str2);
                        i |= 1;
                        break;
                    case 1:
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                        break;
                    case 2:
                        str3 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str3);
                        i |= 4;
                        break;
                    case 3:
                        str4 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str4);
                        i |= 8;
                        break;
                    case 4:
                        str5 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str5);
                        i |= 16;
                        break;
                    case 5:
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        str6 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str6);
                        i |= 64;
                        break;
                    case 7:
                        str = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        n3fVar = (n3f) ul2VarB.h(serialDescriptor, 8, lazyArr[8].getValue(), n3fVar);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new sx8(i, str2, bool, str3, str4, str5, strO, str6, str, n3fVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            sx8 sx8Var = (sx8) obj;
            sx8Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(sx8Var, vl2VarB, serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = sx8.o;
            String str = sx8Var.i;
            n3f n3fVar = sx8Var.l;
            String str2 = sx8Var.k;
            String str3 = sx8Var.j;
            vl2VarB.x(serialDescriptor, 5, str);
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 6, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str2);
            }
            if (vl2VarB.m(serialDescriptor) || n3fVar != null) {
                vl2VarB.k(serialDescriptor, 8, lazyArr[8].getValue(), n3fVar);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<sx8> serializer() {
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

        public static final class a {
        }

        static {
            c cVar = new c("Inverse", 0);
            c cVar2 = new c("Standard", 1);
            c cVar3 = new c("Neutral", 2);
            b = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            c = cVarArr;
            d = new wv4(cVarArr);
            a = new a();
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
    public sx8(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, n3f n3fVar) {
        Object next;
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
            this.l = n3fVar;
        }
        String str8 = this.j;
        this.m = str8 != null ? tq6.c.valueOf(str8) : null;
        String str9 = this.k;
        if (str9 != null) {
            c.a.getClass();
            Iterator<T> it = c.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (wve.E(((c) next).name(), str9, true)) {
                        break;
                    }
                }
            }
            c cVar2 = (c) next;
            if (cVar2 == null) {
                l5.q("Unknown variant: ".concat(str9));
                throw null;
            }
            cVar = cVar2;
        }
        this.n = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx8)) {
            return false;
        }
        sx8 sx8Var = (sx8) obj;
        return wl7.b(this.i, sx8Var.i) && wl7.b(this.j, sx8Var.j) && wl7.b(this.k, sx8Var.k) && wl7.b(this.l, sx8Var.l);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        String str = this.j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n3f n3fVar = this.l;
        return iHashCode3 + (n3fVar != null ? n3fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("LinkComponent(text=", this.i, ", iconNameAfter=", this.j, ", variant=");
        sbF.append(this.k);
        sbF.append(", onClick=");
        sbF.append(this.l);
        sbF.append(")");
        return sbF.toString();
    }
}
