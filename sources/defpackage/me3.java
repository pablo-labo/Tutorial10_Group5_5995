package defpackage;

import defpackage.pe3;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
public final class me3 extends c1f implements Function2<od7<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ List<le3<Object>> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public me3(List<? extends le3<Object>> list, lu2<? super me3> lu2Var) {
        super(2, lu2Var);
        this.$migrations = list;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        me3 me3Var = new me3(this.$migrations, lu2Var);
        me3Var.L$0 = obj;
        return me3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(od7<Object> od7Var, lu2<? super j6g> lu2Var) {
        return ((me3) create(od7Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            od7 od7Var = (od7) this.L$0;
            List<le3<Object>> list = this.$migrations;
            this.label = 1;
            Object objA = pe3.a.a(pe3.a, list, od7Var, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
