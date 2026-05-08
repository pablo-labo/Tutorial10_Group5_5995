package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class j62 {
    public final String a;
    public List<? extends Annotation> b = zr4.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public j62(String str) {
        this.a = str;
    }

    public static void a(j62 j62Var, String str, SerialDescriptor serialDescriptor) {
        j62Var.getClass();
        str.getClass();
        serialDescriptor.getClass();
        if (!j62Var.d.add(str)) {
            StringBuilder sbM = akb.m("Element with name '", str, "' is already registered in ");
            sbM.append(j62Var.a);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        j62Var.c.add(str);
        j62Var.e.add(serialDescriptor);
        j62Var.f.add(zr4.a);
        j62Var.g.add(false);
    }
}
