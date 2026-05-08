package defpackage;

import defpackage.hva;
import defpackage.vcg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$onEditLinkSave$1", f = "ProfileSectionsViewModel.kt", l = {2806}, m = "invokeSuspend")
public final class wwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwb(yvb yvbVar, gu5<j6g> gu5Var, lu2<? super wwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        wwb wwbVar = new wwb(this.this$0, this.$onComplete, lu2Var);
        wwbVar.L$0 = obj;
        return wwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar;
        Object objR;
        gu5<j6g> gu5Var;
        e13 e13Var = (e13) this.L$0;
        g13 g13Var = g13.a;
        int i = this.label;
        j6g j6gVar = null;
        if (i == 0) {
            r7d.b(obj);
            String str = this.this$0.v().a;
            if (str != null) {
                yvbVar = this.this$0;
                gu5<j6g> gu5Var2 = this.$onComplete;
                ((gme) yvbVar.e).setValue(b5g.b);
                ux8 ux8Var = yvbVar.v().a0;
                zcd zcdVar = yvbVar.b;
                String str2 = ux8Var.a;
                String str3 = ux8Var.b;
                List listZ = u63.Z(new jag(str2, str3 == null ? hva.a.a : new hva.c(str3)));
                this.L$0 = e13Var;
                this.L$1 = yvbVar;
                this.L$2 = gu5Var2;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 0;
                this.label = 1;
                objR = zcdVar.R(str, listZ, this);
                if (objR == g13Var) {
                    return g13Var;
                }
                gu5Var = gu5Var2;
            }
            ((gme) this.this$0.e).setValue(b5g.c);
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gu5Var = (gu5) this.L$2;
        yvb yvbVar2 = (yvb) this.L$1;
        r7d.b(obj);
        yvbVar = yvbVar2;
        objR = obj;
        List list = (List) objR;
        if (list != null) {
            synchronized (e13Var) {
                try {
                    LinkedHashMap linkedHashMapI0 = lc9.i0(yvbVar.v().b0);
                    List<vcg.b> list2 = list;
                    ArrayList<ux8> arrayList = new ArrayList(t92.r0(list2, 10));
                    for (vcg.b bVar : list2) {
                        String str4 = bVar.a;
                        String str5 = bVar.b;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList.add(new ux8(str4, str5));
                    }
                    for (ux8 ux8Var2 : arrayList) {
                        linkedHashMapI0.put(ux8Var2.a, ux8Var2);
                    }
                    ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, lc9.g0(linkedHashMapI0), null, -1, 6291455));
                    j6g j6gVar2 = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            yvbVar.C();
            ((gme) yvbVar.e).setValue(b5g.a);
            gu5Var.invoke();
            j6gVar = j6g.a;
        }
        if (j6gVar == null) {
            ((gme) this.this$0.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
