package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class jo7 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] q;
    public final List<String> a;
    public final List<Boolean> b;
    public final List<Boolean> c;
    public final List<Boolean> d;
    public final List<Boolean> e;
    public final List<Boolean> f;
    public final List<Boolean> g;
    public final List<Boolean> h;
    public final List<String> i;
    public final List<String> j;
    public final List<String> k;
    public final List<Integer> l;
    public final List<Boolean> m;
    public final List<Boolean> n;
    public final List<String> o;
    public final List<Integer> p;

    @sy3
    public static final /* synthetic */ class a implements sw5<jo7> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.messaging.api.messaging.logging.ItemsAttributes", aVar, 16);
            pluginGeneratedSerialDescriptor.k("folders", true);
            pluginGeneratedSerialDescriptor.k("hasCompanyName", true);
            pluginGeneratedSerialDescriptor.k("hasTitleLink", true);
            pluginGeneratedSerialDescriptor.k("isArchived", true);
            pluginGeneratedSerialDescriptor.k("isInitiated", true);
            pluginGeneratedSerialDescriptor.k("isJobRemoved", true);
            pluginGeneratedSerialDescriptor.k("isOld", true);
            pluginGeneratedSerialDescriptor.k("isPreApply", true);
            pluginGeneratedSerialDescriptor.k("jobKey", true);
            pluginGeneratedSerialDescriptor.k("lastEventId", true);
            pluginGeneratedSerialDescriptor.k("lastEventType", true);
            pluginGeneratedSerialDescriptor.k("positions", true);
            pluginGeneratedSerialDescriptor.k("reminders", true);
            pluginGeneratedSerialDescriptor.k("requireResponse", true);
            pluginGeneratedSerialDescriptor.k("types", true);
            pluginGeneratedSerialDescriptor.k("unreadCounts", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = jo7.q;
            return new KSerializer[]{qp1.b(lazyArr[0].getValue()), qp1.b(lazyArr[1].getValue()), qp1.b(lazyArr[2].getValue()), qp1.b(lazyArr[3].getValue()), qp1.b(lazyArr[4].getValue()), qp1.b(lazyArr[5].getValue()), qp1.b(lazyArr[6].getValue()), qp1.b(lazyArr[7].getValue()), qp1.b(lazyArr[8].getValue()), qp1.b(lazyArr[9].getValue()), qp1.b(lazyArr[10].getValue()), qp1.b(lazyArr[11].getValue()), qp1.b(lazyArr[12].getValue()), qp1.b(lazyArr[13].getValue()), qp1.b(lazyArr[14].getValue()), qp1.b(lazyArr[15].getValue())};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            List list;
            List list2;
            List list3;
            List list4;
            List list5;
            List list6;
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = jo7.q;
            List list7 = null;
            List list8 = null;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            List list12 = null;
            int i = 0;
            List list13 = null;
            List list14 = null;
            List list15 = null;
            List list16 = null;
            List list17 = null;
            List list18 = null;
            List list19 = null;
            int i2 = 1;
            boolean z = true;
            List list20 = null;
            List list21 = null;
            List list22 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        list4 = list7;
                        list5 = list17;
                        list6 = list20;
                        z = false;
                        list8 = list8;
                        list17 = list5;
                        i2 = 1;
                        list20 = list6;
                        list7 = list4;
                        break;
                    case 0:
                        list4 = list7;
                        list5 = list17;
                        list6 = (List) ul2VarB.h(serialDescriptor, 0, lazyArr[0].getValue(), list20);
                        i |= 1;
                        list8 = list8;
                        list16 = list16;
                        list17 = list5;
                        i2 = 1;
                        list20 = list6;
                        list7 = list4;
                        break;
                    case 1:
                        list4 = list7;
                        List list23 = list17;
                        int i3 = i2;
                        list21 = (List) ul2VarB.h(serialDescriptor, i3, lazyArr[i2].getValue(), list21);
                        i |= 2;
                        list22 = list22;
                        list16 = list16;
                        list17 = list23;
                        i2 = i3;
                        list7 = list4;
                        break;
                    case 2:
                        list = list7;
                        list2 = list17;
                        list22 = (List) ul2VarB.h(serialDescriptor, 2, lazyArr[2].getValue(), list22);
                        i |= 4;
                        list16 = list16;
                        list7 = list;
                        list17 = list2;
                        break;
                    case 3:
                        list = list7;
                        list2 = list17;
                        list16 = (List) ul2VarB.h(serialDescriptor, 3, lazyArr[3].getValue(), list16);
                        i |= 8;
                        list7 = list;
                        list17 = list2;
                        break;
                    case 4:
                        list4 = list7;
                        list17 = (List) ul2VarB.h(serialDescriptor, 4, lazyArr[4].getValue(), list17);
                        i |= 16;
                        list16 = list16;
                        list7 = list4;
                        break;
                    case 5:
                        list3 = list16;
                        list2 = list17;
                        list18 = (List) ul2VarB.h(serialDescriptor, 5, lazyArr[5].getValue(), list18);
                        i |= 32;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 6:
                        list3 = list16;
                        list2 = list17;
                        list19 = (List) ul2VarB.h(serialDescriptor, 6, lazyArr[6].getValue(), list19);
                        i |= 64;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 7:
                        list3 = list16;
                        list2 = list17;
                        list12 = (List) ul2VarB.h(serialDescriptor, 7, lazyArr[7].getValue(), list12);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 8:
                        list3 = list16;
                        list2 = list17;
                        list10 = (List) ul2VarB.h(serialDescriptor, 8, lazyArr[8].getValue(), list10);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        list3 = list16;
                        list2 = list17;
                        list9 = (List) ul2VarB.h(serialDescriptor, 9, lazyArr[9].getValue(), list9);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 10:
                        list3 = list16;
                        list2 = list17;
                        list8 = (List) ul2VarB.h(serialDescriptor, 10, lazyArr[10].getValue(), list8);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 11:
                        list3 = list16;
                        list2 = list17;
                        list7 = (List) ul2VarB.h(serialDescriptor, 11, lazyArr[11].getValue(), list7);
                        i |= 2048;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 12:
                        list3 = list16;
                        list2 = list17;
                        list11 = (List) ul2VarB.h(serialDescriptor, 12, lazyArr[12].getValue(), list11);
                        i |= 4096;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 13:
                        list3 = list16;
                        list2 = list17;
                        list13 = (List) ul2VarB.h(serialDescriptor, 13, lazyArr[13].getValue(), list13);
                        i |= 8192;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        list3 = list16;
                        list2 = list17;
                        list14 = (List) ul2VarB.h(serialDescriptor, 14, lazyArr[14].getValue(), list14);
                        i |= 16384;
                        list16 = list3;
                        list17 = list2;
                        break;
                    case 15:
                        list3 = list16;
                        list2 = list17;
                        list15 = (List) ul2VarB.h(serialDescriptor, 15, lazyArr[15].getValue(), list15);
                        i |= 32768;
                        list16 = list3;
                        list17 = list2;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            List list24 = list7;
            List list25 = list17;
            ul2VarB.c(serialDescriptor);
            return new jo7(i, list20, list21, list22, list16, list25, list18, list19, list12, list10, list9, list8, list24, list11, list13, list14, list15);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            List<Boolean> list;
            List<Boolean> list2;
            jo7 jo7Var = (jo7) obj;
            jo7Var.getClass();
            List<Integer> list3 = jo7Var.p;
            List<String> list4 = jo7Var.o;
            List<Boolean> list5 = jo7Var.n;
            List<Boolean> list6 = jo7Var.m;
            List<Integer> list7 = jo7Var.l;
            List<String> list8 = jo7Var.k;
            List<String> list9 = jo7Var.j;
            List<String> list10 = jo7Var.i;
            List<Boolean> list11 = jo7Var.h;
            List<Boolean> list12 = jo7Var.g;
            List<Boolean> list13 = jo7Var.f;
            List<Boolean> list14 = jo7Var.e;
            List<Boolean> list15 = jo7Var.d;
            List<Boolean> list16 = jo7Var.c;
            List<Boolean> list17 = jo7Var.b;
            List<String> list18 = jo7Var.a;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = jo7.q;
            if (!vl2VarB.m(serialDescriptor) && list18 == null) {
                list = list5;
                list2 = list6;
            } else {
                list = list5;
                list2 = list6;
                vl2VarB.k(serialDescriptor, 0, lazyArr[0].getValue(), list18);
            }
            if (vl2VarB.m(serialDescriptor) || list17 != null) {
                vl2VarB.k(serialDescriptor, 1, lazyArr[1].getValue(), list17);
            }
            if (vl2VarB.m(serialDescriptor) || list16 != null) {
                vl2VarB.k(serialDescriptor, 2, lazyArr[2].getValue(), list16);
            }
            if (vl2VarB.m(serialDescriptor) || list15 != null) {
                vl2VarB.k(serialDescriptor, 3, lazyArr[3].getValue(), list15);
            }
            if (vl2VarB.m(serialDescriptor) || list14 != null) {
                vl2VarB.k(serialDescriptor, 4, lazyArr[4].getValue(), list14);
            }
            if (vl2VarB.m(serialDescriptor) || list13 != null) {
                vl2VarB.k(serialDescriptor, 5, lazyArr[5].getValue(), list13);
            }
            if (vl2VarB.m(serialDescriptor) || list12 != null) {
                vl2VarB.k(serialDescriptor, 6, lazyArr[6].getValue(), list12);
            }
            if (vl2VarB.m(serialDescriptor) || list11 != null) {
                vl2VarB.k(serialDescriptor, 7, lazyArr[7].getValue(), list11);
            }
            if (vl2VarB.m(serialDescriptor) || list10 != null) {
                vl2VarB.k(serialDescriptor, 8, lazyArr[8].getValue(), list10);
            }
            if (vl2VarB.m(serialDescriptor) || list9 != null) {
                vl2VarB.k(serialDescriptor, 9, lazyArr[9].getValue(), list9);
            }
            if (vl2VarB.m(serialDescriptor) || list8 != null) {
                vl2VarB.k(serialDescriptor, 10, lazyArr[10].getValue(), list8);
            }
            if (vl2VarB.m(serialDescriptor) || list7 != null) {
                vl2VarB.k(serialDescriptor, 11, lazyArr[11].getValue(), list7);
            }
            if (vl2VarB.m(serialDescriptor) || list2 != null) {
                vl2VarB.k(serialDescriptor, 12, lazyArr[12].getValue(), list2);
            }
            if (vl2VarB.m(serialDescriptor) || list != null) {
                vl2VarB.k(serialDescriptor, 13, lazyArr[13].getValue(), list);
            }
            if (vl2VarB.m(serialDescriptor) || list4 != null) {
                vl2VarB.k(serialDescriptor, 14, lazyArr[14].getValue(), list4);
            }
            if (vl2VarB.m(serialDescriptor) || list3 != null) {
                vl2VarB.k(serialDescriptor, 15, lazyArr[15].getValue(), list3);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<jo7> serializer() {
            return a.a;
        }
    }

    static {
        int i = 6;
        mz mzVar = new mz(i);
        qt8 qt8Var = qt8.b;
        int i2 = 8;
        q = new Lazy[]{boa.E(qt8Var, mzVar), boa.E(qt8Var, new o7(i)), boa.E(qt8Var, new lz(i2)), boa.E(qt8Var, new cp0(8)), boa.E(qt8Var, new dp0(6)), boa.E(qt8Var, new ao0(7)), boa.E(qt8Var, new vm1(10)), boa.E(qt8Var, new jr(14)), boa.E(qt8Var, new fc2(5)), boa.E(qt8Var, new wy2(10)), boa.E(qt8Var, new ym0(i2)), boa.E(qt8Var, new oz0(9)), boa.E(qt8Var, new as0(9)), boa.E(qt8Var, new vz0(7)), boa.E(qt8Var, new j7(6)), boa.E(qt8Var, new l7(9))};
    }

    public /* synthetic */ jo7(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list7;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.h = null;
        } else {
            this.h = list8;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.i = null;
        } else {
            this.i = list9;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.j = null;
        } else {
            this.j = list10;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.k = null;
        } else {
            this.k = list11;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list12;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list13;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list14;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list15;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = list16;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo7)) {
            return false;
        }
        jo7 jo7Var = (jo7) obj;
        return wl7.b(this.a, jo7Var.a) && wl7.b(this.b, jo7Var.b) && wl7.b(this.c, jo7Var.c) && wl7.b(this.d, jo7Var.d) && wl7.b(this.e, jo7Var.e) && wl7.b(this.f, jo7Var.f) && wl7.b(this.g, jo7Var.g) && wl7.b(this.h, jo7Var.h) && wl7.b(this.i, jo7Var.i) && wl7.b(this.j, jo7Var.j) && wl7.b(this.k, jo7Var.k) && wl7.b(this.l, jo7Var.l) && wl7.b(this.m, jo7Var.m) && wl7.b(this.n, jo7Var.n) && wl7.b(this.o, jo7Var.o) && wl7.b(this.p, jo7Var.p);
    }

    public final int hashCode() {
        List<String> list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Boolean> list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Boolean> list3 = this.c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Boolean> list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Boolean> list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Boolean> list6 = this.f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Boolean> list7 = this.g;
        int iHashCode7 = (iHashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<Boolean> list8 = this.h;
        int iHashCode8 = (iHashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<String> list9 = this.i;
        int iHashCode9 = (iHashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<String> list10 = this.j;
        int iHashCode10 = (iHashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<String> list11 = this.k;
        int iHashCode11 = (iHashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<Integer> list12 = this.l;
        int iHashCode12 = (iHashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<Boolean> list13 = this.m;
        int iHashCode13 = (iHashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<Boolean> list14 = this.n;
        int iHashCode14 = (iHashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<String> list15 = this.o;
        int iHashCode15 = (iHashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<Integer> list16 = this.p;
        return iHashCode15 + (list16 != null ? list16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemsAttributes(folders=");
        sb.append(this.a);
        sb.append(", hasCompanyName=");
        sb.append(this.b);
        sb.append(", hasTitleLink=");
        l6.q(sb, this.c, ", isArchived=", this.d, ", isInitiated=");
        l6.q(sb, this.e, ", isJobRemoved=", this.f, ", isOld=");
        l6.q(sb, this.g, ", isPreApply=", this.h, ", jobKey=");
        l6.q(sb, this.i, ", lastEventId=", this.j, ", lastEventType=");
        l6.q(sb, this.k, ", positions=", this.l, ", reminders=");
        l6.q(sb, this.m, ", requireResponse=", this.n, ", types=");
        sb.append(this.o);
        sb.append(", unreadCounts=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public jo7() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535);
    }

    public jo7(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, List list2, ArrayList arrayList9, List list3, List list4, int i) {
        ArrayList arrayList10 = (i & 1) != 0 ? null : arrayList;
        ArrayList arrayList11 = (i & 2) != 0 ? null : arrayList2;
        ArrayList arrayList12 = (i & 4) != 0 ? null : arrayList3;
        ArrayList arrayList13 = (i & 8) != 0 ? null : arrayList4;
        List list5 = (i & 16) != 0 ? null : list;
        ArrayList arrayList14 = (i & 64) != 0 ? null : arrayList5;
        ArrayList arrayList15 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : arrayList6;
        ArrayList arrayList16 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : arrayList7;
        ArrayList arrayList17 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : arrayList8;
        List list6 = (i & 2048) != 0 ? null : list2;
        ArrayList arrayList18 = (i & 8192) != 0 ? null : arrayList9;
        List list7 = (i & 16384) != 0 ? null : list3;
        List list8 = (i & 32768) != 0 ? null : list4;
        this.a = arrayList10;
        this.b = arrayList11;
        this.c = arrayList12;
        this.d = arrayList13;
        this.e = list5;
        this.f = null;
        this.g = arrayList14;
        this.h = null;
        this.i = arrayList15;
        this.j = arrayList16;
        this.k = arrayList17;
        this.l = list6;
        this.m = null;
        this.n = arrayList18;
        this.o = list7;
        this.p = list8;
    }
}
