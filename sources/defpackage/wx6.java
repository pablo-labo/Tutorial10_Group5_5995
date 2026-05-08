package defpackage;

import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wx6 implements Function1 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wx6(ArrayList arrayList, e eVar, Function1 function1, String str, String str2, g4a g4aVar) {
        this.d = arrayList;
        this.e = eVar;
        this.b = function1;
        this.f = str;
        this.V = str2;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dbf dbfVar;
        Object next;
        int i = this.a;
        String str = null;
        Object obj2 = this.V;
        Object obj3 = this.f;
        Object obj4 = this.e;
        List list = this.d;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) list;
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                ls8Var.c(arrayList.size(), null, new i03(arrayList, 1), new ah2(2039820996, new cy6(arrayList, (e) obj4, this.b, (String) obj3, (String) obj2, this.c), true));
                break;
            default:
                yvb yvbVar = (yvb) obj4;
                g4a g4aVar = (g4a) obj3;
                g4a g4aVar2 = (g4a) obj2;
                zie zieVar = (zie) obj;
                zieVar.getClass();
                qa9.b(ca9.b, "");
                String str2 = zieVar.a;
                if (str2 == null) {
                    str2 = "";
                }
                g4a g4aVar3 = this.c;
                g4aVar3.setValue(str2);
                String str3 = zieVar.b;
                if (str3 == null) {
                    str3 = "";
                }
                g4aVar.setValue(str3);
                g4aVar2.setValue(zieVar.c);
                if (!wl7.b(zieVar.g, Boolean.TRUE)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            b42 b42Var = ((zie) next).h;
                            String str4 = b42Var != null ? b42Var.a : null;
                            dbf dbfVar2 = zieVar.i;
                            if (wl7.b(str4, dbfVar2 != null ? dbfVar2.b : null)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    zieVar = (zie) next;
                }
                if (zieVar != null && (dbfVar = zieVar.i) != null) {
                    str = dbfVar.b;
                }
                String str5 = str != null ? str : "";
                if (str5.length() > 0) {
                    yvbVar.s(str5);
                }
                if (((String) g4aVar3.getValue()).length() > 0) {
                    this.b.invoke((String) g4aVar3.getValue());
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ wx6(List list, yvb yvbVar, Function1 function1, g4a g4aVar, g4a g4aVar2, g4a g4aVar3) {
        this.d = list;
        this.e = yvbVar;
        this.b = function1;
        this.c = g4aVar;
        this.f = g4aVar2;
        this.V = g4aVar3;
    }
}
