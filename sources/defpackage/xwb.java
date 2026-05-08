package defpackage;

import defpackage.hva;
import defpackage.meg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$onEditWorkExperience$1", f = "ProfileSectionsViewModel.kt", l = {430}, m = "invokeSuspend")
public final class xwb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g2h $item;
    final /* synthetic */ gu5<j6g> $onComplete;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwb(yvb yvbVar, g2h g2hVar, gu5<j6g> gu5Var, lu2<? super xwb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yvbVar;
        this.$item = g2hVar;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        xwb xwbVar = new xwb(this.this$0, this.$item, this.$onComplete, lu2Var);
        xwbVar.L$0 = obj;
        return xwbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xwb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar;
        Object objX;
        gu5<j6g> gu5Var;
        e13 e13Var = (e13) this.L$0;
        g13 g13Var = g13.a;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            String str = this.this$0.v().a;
            if (str != null) {
                g2h g2hVar = this.$item;
                yvbVar = this.this$0;
                gu5<j6g> gu5Var2 = this.$onComplete;
                String str2 = g2hVar.a;
                if (str2 != null) {
                    Locale locale = g2hVar.d;
                    String country = locale != null ? locale.getCountry() : null;
                    hva cVar = country == null ? hva.a.a : new hva.c(country);
                    String str3 = g2hVar.e;
                    p38 p38Var = new p38(null, cVar, null, null, str3 == null ? hva.a.a : new hva.c(str3), 16255);
                    ig3 ig3Var = g2hVar.f;
                    yvbVar.getClass();
                    a18 a18VarZ = yvb.z(ig3Var);
                    String str4 = g2hVar.b;
                    hva cVar2 = str4 == null ? hva.a.a : new hva.c(str4);
                    String str5 = g2hVar.c;
                    hva cVar3 = str5 == null ? hva.a.a : new hva.c(str5);
                    hva.a aVar = hva.a.a;
                    hva.c cVar4 = new hva.c(p38Var);
                    hva cVar5 = a18VarZ == null ? aVar : new hva.c(a18VarZ);
                    String str6 = g2hVar.g;
                    bfg bfgVar = new bfg(str2, cVar2, str6 == null ? aVar : new hva.c(str6), cVar3, aVar, cVar4, cVar5);
                    ((gme) yvbVar.e).setValue(b5g.b);
                    zcd zcdVar = yvbVar.b;
                    List listZ = u63.Z(bfgVar);
                    this.L$0 = e13Var;
                    this.L$1 = yvbVar;
                    this.L$2 = gu5Var2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objX = zcdVar.X(str, listZ, this);
                    if (objX == g13Var) {
                        return g13Var;
                    }
                    gu5Var = gu5Var2;
                } else {
                    ArrayList arrayList = lz2.a;
                    lz2.c("ProfileSectionsViewModel", "No work experience id to update", false, null, 12);
                }
            }
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
        objX = obj;
        List list = (List) objX;
        if (list != null) {
            synchronized (e13Var) {
                try {
                    ArrayList arrayListB1 = z92.B1(yvbVar.v().g);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        j2h j2hVar = ((meg.c) it.next()).b;
                        Iterator<j2h> it2 = yvbVar.v().g.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (it2.next().a.equals(j2hVar.a)) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 != -1) {
                            arrayListB1.set(i2, j2hVar);
                        } else {
                            arrayListB1.add(j2hVar);
                        }
                    }
                    ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, z92.z1(arrayListB1), null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -65, 8388607));
                    yvbVar.L();
                    ((gme) yvbVar.e).setValue(b5g.a);
                    gu5Var.invoke();
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            ((gme) yvbVar.e).setValue(b5g.c);
        }
        return j6g.a;
    }
}
