package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tz5 implements vi5<List<? extends SavedJobsDto>> {
    public final /* synthetic */ vi5 a;
    public final /* synthetic */ vz5 b;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5 a;
        public final /* synthetic */ vz5 b;

        /* JADX INFO: renamed from: tz5$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.domain.usecase.GetAppliedWithVisitedJobsUseCase$invoke$$inlined$map$1$2", f = "GetAppliedWithVisitedJobsUseCase.kt", l = {51, 50}, m = "emit")
        public static final class C0426a extends pu2 {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            int label;
            /* synthetic */ Object result;

            public C0426a(lu2 lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(wi5 wi5Var, vz5 vz5Var) {
            this.a = wi5Var;
            this.b = vz5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x01a8, code lost:
        
            if (r6.a(r10, r2) == r9) goto L61;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r59, defpackage.lu2 r60) {
            /*
                Method dump skipped, instruction units count: 430
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tz5.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public tz5(vi5 vi5Var, vz5 vz5Var) {
        this.a = vi5Var;
        this.b = vz5Var;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super List<? extends SavedJobsDto>> wi5Var, lu2 lu2Var) {
        Object objE = this.a.e(new a(wi5Var, this.b), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
