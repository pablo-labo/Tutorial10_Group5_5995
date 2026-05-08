package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.co0;
import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class ep0 {
    public static final b Companion = new b();
    public static final Lazy<KSerializer<Object>>[] j;
    public final String a;
    public final String b;
    public final fo0 c;
    public final o09 d;
    public final o09 e;
    public final String f;
    public final String g;
    public final co0 h;
    public final List<rn0> i;

    @sy3
    public static final /* synthetic */ class a implements sw5<ep0> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.ghostwriter.models.backend.ApplicationsResponse", aVar, 9);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("job_id", false);
            pluginGeneratedSerialDescriptor.k("application_status", false);
            pluginGeneratedSerialDescriptor.k("application_created_at", false);
            pluginGeneratedSerialDescriptor.k("application_updated_at", false);
            pluginGeneratedSerialDescriptor.k("application_notes", true);
            pluginGeneratedSerialDescriptor.k("external_application_id", true);
            pluginGeneratedSerialDescriptor.k("job", false);
            pluginGeneratedSerialDescriptor.k("form_field_groups", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = ep0.j;
            mve mveVar = mve.a;
            return new KSerializer[]{mveVar, mveVar, lazyArr[2].getValue(), lazyArr[3].getValue(), lazyArr[4].getValue(), qp1.b(mveVar), qp1.b(mveVar), co0.a.a, lazyArr[8].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = ep0.j;
            List list = null;
            boolean z = true;
            co0 co0Var = null;
            int i = 0;
            String strO = null;
            String strO2 = null;
            fo0 fo0Var = null;
            o09 o09Var = null;
            o09 o09Var2 = null;
            String str = null;
            String str2 = null;
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
                        fo0Var = (fo0) ul2VarB.z(serialDescriptor, 2, lazyArr[2].getValue(), fo0Var);
                        i |= 4;
                        break;
                    case 3:
                        o09Var = (o09) ul2VarB.z(serialDescriptor, 3, lazyArr[3].getValue(), o09Var);
                        i |= 8;
                        break;
                    case 4:
                        o09Var2 = (o09) ul2VarB.z(serialDescriptor, 4, lazyArr[4].getValue(), o09Var2);
                        i |= 16;
                        break;
                    case 5:
                        str = (String) ul2VarB.h(serialDescriptor, 5, mve.a, str);
                        i |= 32;
                        break;
                    case 6:
                        str2 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str2);
                        i |= 64;
                        break;
                    case 7:
                        co0Var = (co0) ul2VarB.z(serialDescriptor, 7, co0.a.a, co0Var);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        list = (List) ul2VarB.z(serialDescriptor, 8, lazyArr[8].getValue(), list);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        b0.m(iP);
                        return null;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new ep0(i, strO, strO2, fo0Var, o09Var, o09Var2, str, str2, co0Var, list);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            ep0 ep0Var = (ep0) obj;
            ep0Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = ep0.j;
            String str = ep0Var.a;
            List<rn0> list = ep0Var.i;
            String str2 = ep0Var.g;
            String str3 = ep0Var.f;
            vl2VarB.x(serialDescriptor, 0, str);
            vl2VarB.x(serialDescriptor, 1, ep0Var.b);
            vl2VarB.y(serialDescriptor, 2, lazyArr[2].getValue(), ep0Var.c);
            vl2VarB.y(serialDescriptor, 3, lazyArr[3].getValue(), ep0Var.d);
            vl2VarB.y(serialDescriptor, 4, lazyArr[4].getValue(), ep0Var.e);
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 5, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 6, mve.a, str2);
            }
            vl2VarB.y(serialDescriptor, 7, co0.a.a, ep0Var.h);
            if (vl2VarB.m(serialDescriptor) || !wl7.b(list, zr4.a)) {
                vl2VarB.y(serialDescriptor, 8, lazyArr[8].getValue(), list);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<ep0> serializer() {
            return a.a;
        }
    }

    static {
        int i = 3;
        lz lzVar = new lz(i);
        qt8 qt8Var = qt8.b;
        j = new Lazy[]{null, null, boa.E(qt8Var, lzVar), boa.E(qt8Var, new mz(i)), boa.E(qt8Var, new cp0(0)), null, null, null, boa.E(qt8Var, new dp0(0))};
    }

    public /* synthetic */ ep0(int i, String str, String str2, fo0 fo0Var, o09 o09Var, o09 o09Var2, String str3, String str4, co0 co0Var, List list) {
        if (159 != (i & 159)) {
            ewa.M(i, 159, a.a.get$$serialDesc());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = fo0Var;
        this.d = o09Var;
        this.e = o09Var2;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        this.h = co0Var;
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.i = zr4.a;
        } else {
            this.i = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep0)) {
            return false;
        }
        ep0 ep0Var = (ep0) obj;
        return wl7.b(this.a, ep0Var.a) && wl7.b(this.b, ep0Var.b) && this.c == ep0Var.c && wl7.b(this.d, ep0Var.d) && wl7.b(this.e, ep0Var.e) && wl7.b(this.f, ep0Var.f) && wl7.b(this.g, ep0Var.g) && wl7.b(this.h, ep0Var.h) && wl7.b(this.i, ep0Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.a.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ApplicationsResponse(id=", this.a, ", job_id=", this.b, ", application_status=");
        sbF.append(this.c);
        sbF.append(", application_created_at=");
        sbF.append(this.d);
        sbF.append(", application_updated_at=");
        sbF.append(this.e);
        sbF.append(", application_notes=");
        sbF.append(this.f);
        sbF.append(", external_application_id=");
        sbF.append(this.g);
        sbF.append(", job=");
        sbF.append(this.h);
        sbF.append(", form_field_groups=");
        return g7.i(sbF, this.i, ")");
    }
}
