package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yv9 extends mj8 implements Function1<s5e, j6g> {
    final /* synthetic */ gu5<j6g> $animateToDismiss;
    final /* synthetic */ String $collapseActionLabel;
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ e13 $scope;
    final /* synthetic */ hee $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv9(hee heeVar, String str, String str2, String str3, gu5<j6g> gu5Var, e13 e13Var) {
        super(1);
        this.$sheetState = heeVar;
        this.$dismissActionLabel = str;
        this.$expandActionLabel = str2;
        this.$collapseActionLabel = str3;
        this.$animateToDismiss = gu5Var;
        this.$scope = e13Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(s5e s5eVar) {
        s5e s5eVar2 = s5eVar;
        hee heeVar = this.$sheetState;
        String str = this.$dismissActionLabel;
        String str2 = this.$expandActionLabel;
        String str3 = this.$collapseActionLabel;
        gu5<j6g> gu5Var = this.$animateToDismiss;
        e13 e13Var = this.$scope;
        tv9 tv9Var = new tv9(gu5Var);
        qf8<Object>[] qf8VarArr = o5e.a;
        s5eVar2.a(v4e.u, new r5(str, tv9Var));
        jee jeeVar = (jee) ((gme) heeVar.c.g).getValue();
        jee jeeVar2 = jee.c;
        if (jeeVar == jeeVar2) {
            s5eVar2.a(v4e.s, new r5(str2, new vv9(heeVar, e13Var, heeVar)));
        } else if (heeVar.c.e().d(jeeVar2)) {
            s5eVar2.a(v4e.t, new r5(str3, new xv9(heeVar, e13Var)));
        }
        return j6g.a;
    }
}
