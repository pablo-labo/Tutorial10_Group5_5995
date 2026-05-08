package defpackage;

import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$declineInvitationWithSurvey$1", f = "InvitationTabViewModel.kt", l = {188, 190}, m = "invokeSuspend")
public final class dn7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $comment;
    final /* synthetic */ InvitedJobDto $invitedJob;
    final /* synthetic */ Function1<Boolean, j6g> $onResult;
    final /* synthetic */ String $selectedReason;
    Object L$0;
    int label;
    final /* synthetic */ bn7 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ bn7 a;
        public final /* synthetic */ InvitedJobDto b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Function1<Boolean, j6g> e;

        /* JADX INFO: renamed from: dn7$a$a, reason: collision with other inner class name */
        public static final class C0209a<T> implements wi5 {
            public static final C0209a<T> a = new C0209a<>();

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$declineInvitationWithSurvey$1$1", f = "InvitationTabViewModel.kt", l = {196, 198}, m = "emit")
        public static final class b extends pu2 {
            Object L$0;
            boolean Z$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, lu2<? super b> lu2Var) {
                super(lu2Var);
                this.this$0 = aVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(bn7 bn7Var, InvitedJobDto invitedJobDto, String str, String str2, Function1<? super Boolean, j6g> function1) {
            this.a = bn7Var;
            this.b = invitedJobDto;
            this.c = str;
            this.d = str2;
            this.e = function1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            if (((defpackage.vi5) r12).e(dn7.a.C0209a.a, r0) == r6) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(defpackage.hf3<com.indeed.android.myjobs.data.model.ServiceResultResponse> r11, defpackage.lu2<? super defpackage.j6g> r12) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dn7.a.a(hf3, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dn7(InvitedJobDto invitedJobDto, bn7 bn7Var, String str, String str2, Function1<? super Boolean, j6g> function1, lu2<? super dn7> lu2Var) {
        super(2, lu2Var);
        this.$invitedJob = invitedJobDto;
        this.this$0 = bn7Var;
        this.$selectedReason = str;
        this.$comment = str2;
        this.$onResult = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new dn7(this.$invitedJob, this.this$0, this.$selectedReason, this.$comment, this.$onResult, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((dn7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (((defpackage.vi5) r1).e(r6, r16) == r5) goto L41;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
