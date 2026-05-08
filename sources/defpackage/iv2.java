package defpackage;

import defpackage.le0;
import defpackage.lx5;
import defpackage.uc7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iv2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ iv2(CharSequence charSequence, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = charSequence;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        CharSequence charSequence = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "elementName", "applicationError", "subTabName", (String) charSequence);
                bVar.a("entityData", (String) obj4);
                bVar.a("jobKey", (String) obj3);
                bVar.a("encryptedIaAppId", (String) obj2);
                break;
            default:
                e13 e13Var = (e13) obj4;
                hw9 hw9Var = (hw9) obj3;
                gu5 gu5Var = (gu5) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (((le0.c) z92.Q0(((le0) charSequence).c(iIntValue, iIntValue, "contactUs"))) != null) {
                    u63.Y(e13Var, null, null, new uc7.b(hw9Var, gu5Var, null), 3);
                }
                break;
        }
        return j6g.a;
    }
}
