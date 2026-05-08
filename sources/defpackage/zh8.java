package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zh8 extends mj8 implements Function1<rx9, j6g> {
    final /* synthetic */ Context $androidContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh8(Context context) {
        super(1);
        this.$androidContext = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(rx9 rx9Var) {
        rx9 rx9Var2 = rx9Var;
        rx9Var2.getClass();
        yh8 yh8Var = new yh8(this.$androidContext);
        iwc iwcVar = fwc.a;
        ue1 ue1Var = new ue1(zpd.c, iwcVar.b(Application.class), null, yh8Var, uh8.a);
        vge vgeVar = new vge(ue1Var);
        rx9Var2.a(vgeVar);
        yd8[] yd8VarArr = {iwcVar.b(Context.class), iwcVar.b(Application.class)};
        List<? extends yd8<?>> list = ue1Var.f;
        ArrayList arrayList = new ArrayList(list.size() + 2);
        arrayList.addAll(list);
        w92.x0(arrayList, yd8VarArr);
        ue1Var.f = arrayList;
        for (int i = 0; i < 2; i++) {
            rx9Var2.c.put(mh2.m(yd8VarArr[i], ue1Var.c, ue1Var.a), vgeVar);
        }
        return j6g.a;
    }
}
