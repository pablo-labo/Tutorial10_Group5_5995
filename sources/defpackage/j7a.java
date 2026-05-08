package defpackage;

import android.content.Context;
import defpackage.ude;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$2$1", f = "MyJobsScreen.kt", l = {153}, m = "invokeSuspend")
public final class j7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ ude $sharedViewModel;
    int label;

    @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$2$1$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<Integer, lu2<? super j6g>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ude $sharedViewModel;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ude udeVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$context = context;
            this.$sharedViewModel = udeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$context, this.$sharedViewModel, lu2Var);
            aVar.I$0 = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, lu2<? super j6g> lu2Var) {
            return ((a) create(Integer.valueOf(num.intValue()), lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            String string = this.$context.getString(i);
            string.getClass();
            this.$sharedViewModel.m(new ude.c.j0(string, null));
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7a(e8a e8aVar, Context context, ude udeVar, lu2<? super j7a> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$context = context;
        this.$sharedViewModel = udeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j7a(this.$myJobsViewModel, this.$context, this.$sharedViewModel, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((j7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            pqc pqcVar = this.$myJobsViewModel.e0;
            a aVar = new a(this.$context, this.$sharedViewModel, null);
            this.label = 1;
            Object objQ = wg2.q(pqcVar, aVar, this);
            g13 g13Var = g13.a;
            if (objQ == g13Var) {
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
