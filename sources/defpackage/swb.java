package defpackage;

import defpackage.dd5;
import defpackage.hva;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileSectionsViewModel$getEmployerImageUrl$1", f = "ProfileSectionsViewModel.kt", l = {501}, m = "invokeSuspend")
public final class swb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $employerCompanyName;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yvb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swb(lu2 lu2Var, yvb yvbVar, String str) {
        super(2, lu2Var);
        this.$employerCompanyName = str;
        this.this$0 = yvbVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        swb swbVar = new swb(lu2Var, this.this$0, this.$employerCompanyName);
        swbVar.L$0 = obj;
        return swbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((swb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objA;
        dd5.b bVar;
        dd5.f fVar;
        dd5.g gVar;
        e13 e13Var = (e13) this.L$0;
        g13 g13Var = g13.a;
        int i = this.label;
        dd5.d dVar = null;
        Object obj2 = null;
        if (i == 0) {
            r7d.b(obj);
            String str = this.$employerCompanyName;
            md5 md5Var = new md5(str == null ? hva.a.a : new hva.c(str), 14);
            zcd zcdVar = this.this$0.b;
            this.L$0 = e13Var;
            this.L$1 = null;
            this.label = 1;
            objA = zcdVar.A(md5Var, this);
            if (objA == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objA = obj;
        }
        List list = (List) objA;
        if (list != null) {
            String str2 = this.$employerCompanyName;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (wl7.b(((dd5.d) next).a.b, str2)) {
                    obj2 = next;
                    break;
                }
            }
            dVar = (dd5.d) obj2;
        }
        if (dVar != null && (bVar = dVar.a.a) != null && (fVar = bVar.a) != null && (gVar = fVar.a) != null) {
            String str3 = gVar.a;
            yvb yvbVar = this.this$0;
            String str4 = this.$employerCompanyName;
            synchronized (e13Var) {
                LinkedHashMap linkedHashMapI0 = lc9.i0(yvbVar.v().h);
                linkedHashMapI0.put(str4, str3);
                ((gme) yvbVar.d).setValue(svb.a(yvbVar.v(), null, null, false, null, null, null, null, lc9.g0(linkedHashMapI0), false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -129, 8388607));
                j6g j6gVar = j6g.a;
            }
        }
        return j6g.a;
    }
}
