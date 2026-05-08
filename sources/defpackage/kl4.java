package defpackage;

import androidx.fragment.app.FragmentManager;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kl4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kl4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                q5b q5bVar = (q5b) obj2;
                ((g4a) obj).setValue(Boolean.FALSE);
                function1.invoke(q5bVar != null ? q5bVar.a : null);
                break;
            case 1:
                String str = (String) obj2;
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                str.getClass();
                gdc gdcVar = new gdc();
                gdcVar.setArguments(aq1.a(new Pair("applicationId", str), new Pair("from", (String) obj)));
                i1gVar.e((FragmentManager) obj3, gdcVar);
                break;
            default:
                gu5 gu5Var = (gu5) obj;
                b4g.q((String) obj3, (String) obj2);
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                break;
        }
        return j6g.a;
    }
}
