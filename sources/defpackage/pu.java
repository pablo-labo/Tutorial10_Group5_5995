package defpackage;

import com.facebook.react.bridge.Promise;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.le0;
import defpackage.lx5;
import defpackage.pif;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pu(u1a u1aVar, k3a k3aVar, p2e p2eVar) {
        this.a = 3;
        this.b = k3aVar;
        this.c = p2eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                ((g4a) obj3).setValue(jhfVar);
                ((g4a) obj2).setValue(jhfVar.a.b);
                return j6g.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function2) obj3).invoke((String) obj2, bool);
                return j6g.a;
            case 2:
                String str = (String) obj3;
                String str2 = (String) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", "Invitations");
                if (str != null) {
                    bVar.a("entityId", str);
                }
                if (str2 != null) {
                    bVar.a("jobKey", str2);
                }
                return j6g.a;
            case 3:
                vzd vzdVar = (vzd) obj;
                u1a.n((k3a) obj3, (p2e) obj2, vzdVar, 0, vzdVar.f.a.a.b.length());
                return j6g.a;
            case 4:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$18((Promise) obj3, (RNProfileFormsModule) obj2, (ps7) obj);
            case 5:
                pif pifVar = (pif) obj3;
                Function1<gcf, j6g> function1 = (Function1) obj2;
                pifVar.c.add(function1);
                return new pif.b(pifVar, function1);
            default:
                gu5 gu5Var = (gu5) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (((le0.c) z92.Q0(((le0) obj3).c(iIntValue, iIntValue, "undo"))) != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ pu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
