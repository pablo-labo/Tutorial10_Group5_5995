package defpackage;

import defpackage.gwe;
import defpackage.hb9;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class i7e {
    public static final anb a(String str, ymb ymbVar) {
        ymbVar.getClass();
        if (zve.U(str)) {
            l5.q("Blank serial names are prohibited");
            return null;
        }
        Object it = ((kb9) hnb.a.values()).iterator();
        while (((hb9.d) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((hb9.f) it).next();
            if (str.equals(kSerializer.getDescriptor().getA())) {
                StringBuilder sbM = akb.m("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM.append(fwc.a.b(kSerializer.getClass()).r());
                sbM.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                l5.q(sve.w(sbM.toString()));
                return null;
            }
        }
        return new anb(str, ymbVar);
    }

    public static final f7e b(String str, m7e m7eVar, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        m7eVar.getClass();
        if (zve.U(str)) {
            l5.q("Blank serial names are prohibited");
            return null;
        }
        if (m7eVar.equals(gwe.a.a)) {
            l5.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        j62 j62Var = new j62(str);
        function1.invoke(j62Var);
        return new f7e(str, m7eVar, j62Var.c.size(), ut0.E0(serialDescriptorArr), j62Var);
    }

    public static f7e c(String str, m7e m7eVar, SerialDescriptor[] serialDescriptorArr) {
        m7eVar.getClass();
        if (zve.U(str)) {
            l5.q("Blank serial names are prohibited");
            return null;
        }
        if (m7eVar.equals(gwe.a.a)) {
            l5.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        j62 j62Var = new j62(str);
        j6g j6gVar = j6g.a;
        return new f7e(str, m7eVar, j62Var.c.size(), ut0.E0(serialDescriptorArr), j62Var);
    }
}
