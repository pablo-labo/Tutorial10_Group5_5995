package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.lx5;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.AppliedTabKt$DisplayJobList$1$1$1$1$1$1$1", f = "AppliedTab.kt", l = {}, m = "invokeSuspend")
public final class sq0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ List<SavedJobsDto> $nexusJobs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(List<SavedJobsDto> list, lu2<? super sq0> lu2Var) {
        super(2, lu2Var);
        this.$nexusJobs = list;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new sq0(this.$nexusJobs, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((sq0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        Function1<lx5, j6g> function1 = c05.a;
        final int size = this.$nexusJobs.size();
        c05.a.invoke(tx5.g(c05.b, "myjobs_native_screen", new Function1() { // from class: jz4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                lx5.b bVar = (lx5.b) obj2;
                w40.l(bVar, "elementName", "actionNeededSectionImpression", "subTabName", "Applied");
                bVar.b("jobCount", Long.valueOf(size));
                return j6g.a;
            }
        }, 2));
        return j6g.a;
    }
}
