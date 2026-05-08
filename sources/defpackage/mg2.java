package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mg2 {
    public final List<uf2<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (uf2<?> uf2Var : componentRegistrar.getComponents()) {
            String str = uf2Var.a;
            if (str != null) {
                uf2Var = new uf2<>(str, uf2Var.b, uf2Var.c, uf2Var.d, uf2Var.e, new lg2(str, uf2Var), uf2Var.g);
            }
            arrayList.add(uf2Var);
        }
        return arrayList;
    }
}
