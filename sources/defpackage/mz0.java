package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class mz0 {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    @sy3
    public /* synthetic */ class a implements sw5<mz0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.backendservices.autocomplete.data.AutoCompleteLocation", aVar, 12);
            pluginGeneratedSerialDescriptor.k("locationType", true);
            pluginGeneratedSerialDescriptor.k("country", true);
            pluginGeneratedSerialDescriptor.k("admin1", true);
            pluginGeneratedSerialDescriptor.k("admin2", true);
            pluginGeneratedSerialDescriptor.k("admin3", true);
            pluginGeneratedSerialDescriptor.k("admin4", true);
            pluginGeneratedSerialDescriptor.k("name", true);
            pluginGeneratedSerialDescriptor.k("countryText", true);
            pluginGeneratedSerialDescriptor.k("admin1Text", true);
            pluginGeneratedSerialDescriptor.k("admin2Text", true);
            pluginGeneratedSerialDescriptor.k("admin3Text", true);
            pluginGeneratedSerialDescriptor.k("admin4Text", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar, mveVar};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            boolean z = true;
            int i = 0;
            String strO = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            String strO5 = null;
            String strO6 = null;
            String strO7 = null;
            String strO8 = null;
            String strO9 = null;
            String strO10 = null;
            String strO11 = null;
            String strO12 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strO = ul2VarB.o(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strO2 = ul2VarB.o(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strO3 = ul2VarB.o(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strO4 = ul2VarB.o(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strO5 = ul2VarB.o(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strO6 = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        strO7 = ul2VarB.o(serialDescriptor, 6);
                        i |= 64;
                        break;
                    case 7:
                        strO8 = ul2VarB.o(serialDescriptor, 7);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        strO9 = ul2VarB.o(serialDescriptor, 8);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        strO10 = ul2VarB.o(serialDescriptor, 9);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        strO11 = ul2VarB.o(serialDescriptor, 10);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    case 11:
                        strO12 = ul2VarB.o(serialDescriptor, 11);
                        i |= 2048;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new mz0(i, strO, strO2, strO3, strO4, strO5, strO6, strO7, strO8, strO9, strO10, strO11, strO12);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            mz0 mz0Var = (mz0) obj;
            mz0Var.getClass();
            String str = mz0Var.l;
            String str2 = mz0Var.k;
            String str3 = mz0Var.j;
            String str4 = mz0Var.i;
            String str5 = mz0Var.h;
            String str6 = mz0Var.g;
            String str7 = mz0Var.f;
            String str8 = mz0Var.e;
            String str9 = mz0Var.d;
            String str10 = mz0Var.c;
            String str11 = mz0Var.b;
            String str12 = mz0Var.a;
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str12, "")) {
                vl2VarB.x(serialDescriptor, 0, str12);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str11, "")) {
                vl2VarB.x(serialDescriptor, 1, str11);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str10, "")) {
                vl2VarB.x(serialDescriptor, 2, str10);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str9, "")) {
                vl2VarB.x(serialDescriptor, 3, str9);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str8, "")) {
                vl2VarB.x(serialDescriptor, 4, str8);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str7, "")) {
                vl2VarB.x(serialDescriptor, 5, str7);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str6, "")) {
                vl2VarB.x(serialDescriptor, 6, str6);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str5, "")) {
                vl2VarB.x(serialDescriptor, 7, str5);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str4, "")) {
                vl2VarB.x(serialDescriptor, 8, str4);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str3, "")) {
                vl2VarB.x(serialDescriptor, 9, str3);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str2, "")) {
                vl2VarB.x(serialDescriptor, 10, str2);
            }
            if (vl2VarB.m(serialDescriptor) || !wl7.b(str, "")) {
                vl2VarB.x(serialDescriptor, 11, str);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<mz0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ mz0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.i = "";
        } else {
            this.i = str9;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.j = "";
        } else {
            this.j = str10;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.k = "";
        } else {
            this.k = str11;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0Var = (mz0) obj;
        return wl7.b(this.a, mz0Var.a) && wl7.b(this.b, mz0Var.b) && wl7.b(this.c, mz0Var.c) && wl7.b(this.d, mz0Var.d) && wl7.b(this.e, mz0Var.e) && wl7.b(this.f, mz0Var.f) && wl7.b(this.g, mz0Var.g) && wl7.b(this.h, mz0Var.h) && wl7.b(this.i, mz0Var.i) && wl7.b(this.j, mz0Var.j) && wl7.b(this.k, mz0Var.k) && wl7.b(this.l, mz0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AutoCompleteLocation(locationType=", this.a, ", country=", this.b, ", admin1=");
        ia.r(sbF, this.c, ", admin2=", this.d, ", admin3=");
        ia.r(sbF, this.e, ", admin4=", this.f, ", name=");
        ia.r(sbF, this.g, ", countryText=", this.h, ", admin1Text=");
        ia.r(sbF, this.i, ", admin2Text=", this.j, ", admin3Text=");
        return z3.n(sbF, this.k, ", admin4Text=", this.l, ")");
    }

    public mz0() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
    }
}
