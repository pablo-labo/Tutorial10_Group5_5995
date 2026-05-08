package defpackage;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.error.ReportEmailHelperKt$startReportEmailFlow$3", f = "ReportEmailHelper.kt", l = {94, 104}, m = "invokeSuspend")
public final class o2d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $exceptionDump;
    final /* synthetic */ ba5 $fileLogging;
    final /* synthetic */ Function1<h63, j6g> $onDismissDialog;
    final /* synthetic */ r2d $reportEmailType;
    final /* synthetic */ String $reportSource;
    final /* synthetic */ String $userId;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o2d(Activity activity, r2d r2dVar, String str, String str2, ba5 ba5Var, String str3, Function1<? super h63, j6g> function1, lu2<? super o2d> lu2Var) {
        super(2, lu2Var);
        this.$activity = activity;
        this.$reportEmailType = r2dVar;
        this.$userId = str;
        this.$exceptionDump = str2;
        this.$fileLogging = ba5Var;
        this.$reportSource = str3;
        this.$onDismissDialog = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new o2d(this.$activity, this.$reportEmailType, this.$userId, this.$exceptionDump, this.$fileLogging, this.$reportSource, this.$onDismissDialog, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((o2d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        if (r15 == r4) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L1a
            java.lang.Object r0 = r14.L$1
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.Object r0 = r14.L$0
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            defpackage.r7d.b(r15)
            goto L92
        L1a:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r14)
            return r3
        L20:
            java.lang.Object r0 = r14.L$0
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            defpackage.r7d.b(r15)
            goto L7c
        L28:
            defpackage.r7d.b(r15)
            android.app.Activity r15 = r14.$activity
            r2d r0 = r14.$reportEmailType
            int r0 = r0.c()
            java.lang.String r15 = r15.getString(r0)
            java.lang.String r0 = r14.$userId
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r2]
            r6 = 0
            r5[r6] = r0
            java.lang.CharSequence r15 = android.text.TextUtils.expandTemplate(r15, r5)
            android.app.Activity r6 = r14.$activity
            r0 = 2131951689(0x7f130049, float:1.95398E38)
            java.lang.String r0 = r6.getString(r0)
            r0.getClass()
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.String r11 = r15.toString()
            android.app.Activity r15 = r14.$activity
            r2d r0 = r14.$reportEmailType
            int r0 = r0.a()
            java.lang.String r12 = r15.getString(r0)
            r12.getClass()
            java.lang.String r7 = r14.$exceptionDump
            ba5 r9 = r14.$fileLogging
            java.lang.String r8 = r14.$reportSource
            r14.L$0 = r3
            r14.label = r2
            j2d r5 = new j2d
            r13 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = defpackage.f13.d(r5, r14)
            if (r15 != r4) goto L7c
            goto L91
        L7c:
            android.content.Intent r15 = (android.content.Intent) r15
            android.app.Activity r0 = r14.$activity
            r14.L$0 = r3
            r14.L$1 = r3
            r14.label = r1
            i2d r1 = new i2d
            r1.<init>(r15, r0, r3)
            java.lang.Object r15 = defpackage.f13.d(r1, r14)
            if (r15 != r4) goto L92
        L91:
            return r4
        L92:
            android.content.Intent r15 = (android.content.Intent) r15
            kotlin.jvm.functions.Function1<h63, j6g> r14 = r14.$onDismissDialog
            if (r15 != 0) goto L9e
            h63$b r15 = h63.b.a
            r14.invoke(r15)
            goto La6
        L9e:
            h63$c r0 = new h63$c
            r0.<init>(r15)
            r14.invoke(r0)
        La6:
            j6g r14 = defpackage.j6g.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
