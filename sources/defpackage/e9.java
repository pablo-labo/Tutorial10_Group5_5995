package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e9 extends z8<Object> {
    public final /* synthetic */ c9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ o8<Object, Object> c;

    public e9(c9 c9Var, String str, o8<Object, Object> o8Var) {
        this.a = c9Var;
        this.b = str;
        this.c = o8Var;
    }

    @Override // defpackage.z8
    public final void a(Object obj) {
        c9 c9Var = this.a;
        ArrayList arrayList = c9Var.d;
        LinkedHashMap linkedHashMap = c9Var.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        o8<Object, Object> o8Var = this.c;
        if (obj2 == null) {
            b0.v("Attempting to launch an unregistered ActivityResultLauncher with contract ", o8Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            c9Var.b(iIntValue, o8Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
