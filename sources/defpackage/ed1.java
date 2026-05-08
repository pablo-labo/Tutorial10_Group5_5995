package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.le0;
import defpackage.mld;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ed1(g4a g4aVar, Function1 function1) {
        this.a = 1;
        this.b = function1;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = null;
        int i2 = 1;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                pif pifVar = (pif) obj4;
                Function1 function1 = (Function1) obj3;
                mif mifVar = (mif) obj;
                if (pifVar != null) {
                    ((gme) pifVar.a).setValue(mifVar);
                }
                if (function1 != null) {
                    function1.invoke(mifVar);
                }
                return j6g.a;
            case 1:
                Function1 function12 = (Function1) obj3;
                String str = (String) obj;
                str.getClass();
                if (wve.E(((Locale) ((g4a) obj4).getValue()).getCountry(), "US", true)) {
                    function12.invoke(str);
                }
                return j6g.a;
            case 2:
                gu5 gu5Var = (gu5) obj3;
                int iIntValue = ((Integer) obj).intValue();
                if (((le0.c) z92.Q0(((le0) obj4).c(iIntValue, iIntValue, "contactUs"))) != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 3:
                vnd vndVar = (vnd) obj;
                vndVar.getClass();
                n76.g((g4a) obj4, true);
                ((g4a) obj3).setValue(new ah2(475191036, new w94(vndVar, i2), true));
                return j6g.a;
            case 4:
                ArrayList arrayList = (ArrayList) obj4;
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                ls8.d(ls8Var, arrayList.size(), new se(arrayList, 8), new ah2(580769402, new su6(arrayList, (c3a) obj3), true), 4);
                return j6g.a;
            case 5:
                Function1 function13 = (Function1) obj3;
                String str2 = (String) obj;
                str2.getClass();
                Iterator it = ((List) obj4).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (wl7.b(((wj8) next).b, str2)) {
                            obj2 = next;
                        }
                    }
                }
                wj8 wj8Var = (wj8) obj2;
                if (wj8Var == null) {
                    wj8Var = new wj8(63, (String) null, (String) null, (String) null, (String) null, (String) null);
                }
                function13.invoke(wj8Var);
                return j6g.a;
            case 6:
                x1c x1cVar = (x1c) obj4;
                Context context = (Context) obj3;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    x1cVar.H(context, uri, null);
                }
                return j6g.a;
            case 7:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("fromScreenName", (String) obj4);
                hr7Var.a("pushPrimerButtonName", (String) obj3);
                return j6g.a;
            default:
                zv8 zv8Var = (zv8) obj4;
                ((m74) obj).getClass();
                vf2 vf2Var = new vf2((pld) obj3, i2);
                zv8Var.getLifecycle().a(vf2Var);
                return new mld.i(zv8Var, vf2Var);
        }
    }

    public /* synthetic */ ed1(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ ed1(ArrayList arrayList, c3a c3aVar) {
        this.a = 4;
        this.c = arrayList;
        this.b = c3aVar;
    }
}
