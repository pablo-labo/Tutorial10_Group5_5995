package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class vcf extends d4f {
    public static final b Companion = new b();
    public final String i;
    public final Integer j;
    public final String k;
    public final String l;
    public final String m;
    public final c n;
    public final d o;
    public final e p;
    public final f q;

    @sy3
    public static final /* synthetic */ class a implements sw5<vcf> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text", aVar, 10);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("text", false);
            pluginGeneratedSerialDescriptor.k("level", true);
            pluginGeneratedSerialDescriptor.k("style", true);
            pluginGeneratedSerialDescriptor.k("textAlignment", true);
            pluginGeneratedSerialDescriptor.k("variant", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), mveVar, qp1.b(rh7.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar)};
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
            String strO = null;
            Integer num = null;
            String str7 = null;
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
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        num = (Integer) ul2VarB.h(serialDescriptor, 6, rh7.a, num);
                        i |= 64;
                        break;
                    case 7:
                        str7 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str7);
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
            return new vcf(i, str3, bool, str4, str5, str6, strO, num, str7, str2, str);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            vcf vcfVar = (vcf) obj;
            vcfVar.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(vcfVar, vl2VarB, serialDescriptor);
            String str = vcfVar.i;
            String str2 = vcfVar.m;
            String str3 = vcfVar.l;
            String str4 = vcfVar.k;
            Integer num = vcfVar.j;
            vl2VarB.x(serialDescriptor, 5, str);
            if (vl2VarB.m(serialDescriptor) || num != null) {
                vl2VarB.k(serialDescriptor, 6, rh7.a, num);
            }
            if (vl2VarB.m(serialDescriptor) || str4 != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str4);
            }
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 8, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 9, mve.a, str2);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<vcf> serializer() {
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
            c cVar = new c("L1", 0);
            c cVar2 = new c("L2", 1);
            b = cVar2;
            c[] cVarArr = {cVar, cVar2, new c("L3", 2), new c("L4", 3), new c("L5", 4), new c("L6", 5), new c("L7", 6), new c("L8", 7)};
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
            d dVar = new d(ReactProgressBarViewManager.DEFAULT_STYLE, 0);
            b = dVar;
            d[] dVarArr = {dVar, new d("Bold", 1), new d("Italic", 2), new d("Strikethrough", 3)};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final a a;
        public static final e b;
        public static final /* synthetic */ e[] c;
        public static final /* synthetic */ wv4 d;

        public static final class a {
        }

        static {
            e eVar = new e("Left", 0);
            b = eVar;
            e[] eVarArr = {eVar, new e("Center", 1), new e("Right", 2)};
            c = eVarArr;
            d = new wv4(eVarArr);
            a = new a();
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final a a;
        public static final f b;
        public static final /* synthetic */ f[] c;
        public static final /* synthetic */ wv4 d;

        public static final class a {
        }

        static {
            f fVar = new f("Contrast", 0);
            f fVar2 = new f(ReactProgressBarViewManager.DEFAULT_STYLE, 1);
            b = fVar2;
            f[] fVarArr = {fVar, fVar2, new f("Secondary", 2), new f("Alert", 3), new f("Success", 4)};
            c = fVarArr;
            d = new wv4(fVarArr);
            a = new a();
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcf(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8) {
        c cVar;
        d dVar;
        e eVar;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        super(i, str, bool, str2, str3, str4);
        f fVar = null;
        if (32 != (i & 32)) {
            ewa.M(i, 32, a.a.get$$serialDesc());
            throw null;
        }
        this.i = str5;
        if ((i & 64) == 0) {
            this.j = null;
        } else {
            this.j = num;
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
        Integer num2 = this.j;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            c.a.getClass();
            Iterator<T> it = c.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
                if (wl7.b(((c) next4).name(), "L" + iIntValue)) {
                    break;
                }
            }
            cVar = (c) next4;
            if (cVar == null) {
                l5.q(p6.c(iIntValue, "Unknown level: "));
                throw null;
            }
        } else {
            cVar = null;
        }
        this.n = cVar;
        String str9 = this.k;
        if (str9 != null) {
            d.a.getClass();
            Iterator<T> it2 = d.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it2.next();
                    if (wve.E(((d) next3).name(), str9, true)) {
                        break;
                    }
                }
            }
            dVar = (d) next3;
            if (dVar == null) {
                l5.q("Unknown style: ".concat(str9));
                throw null;
            }
        } else {
            dVar = null;
        }
        this.o = dVar;
        String str10 = this.l;
        if (str10 != null) {
            e.a.getClass();
            Iterator<T> it3 = e.d.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    if (wve.E(((e) next2).name(), str10, true)) {
                        break;
                    }
                }
            }
            eVar = (e) next2;
            if (eVar == null) {
                l5.q("Unknown textAligment: ".concat(str10));
                throw null;
            }
        } else {
            eVar = null;
        }
        this.p = eVar;
        String str11 = this.m;
        if (str11 != null) {
            f.a.getClass();
            Iterator<T> it4 = f.d.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it4.next();
                    if (wve.E(((f) next).name(), str11, true)) {
                        break;
                    }
                }
            }
            f fVar2 = (f) next;
            if (fVar2 == null) {
                l5.q("Unknown variant: ".concat(str11));
                throw null;
            }
            fVar = fVar2;
        }
        this.q = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcf)) {
            return false;
        }
        vcf vcfVar = (vcf) obj;
        return wl7.b(this.i, vcfVar.i) && wl7.b(this.j, vcfVar.j) && wl7.b(this.k, vcfVar.k) && wl7.b(this.l, vcfVar.l) && wl7.b(this.m, vcfVar.m);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        Integer num = this.j;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextComponent(text=");
        sb.append(this.i);
        sb.append(", level=");
        sb.append(this.j);
        sb.append(", style=");
        ia.r(sb, this.k, ", textAlignment=", this.l, ", variant=");
        return l6.i(sb, this.m, ")");
    }
}
