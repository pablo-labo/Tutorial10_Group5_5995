package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.error.ReportEmailHelperKt$createReportEmailIntent$2", f = "ReportEmailHelper.kt", l = {122, 123}, m = "invokeSuspend")
public final class j2d extends c1f implements Function2<e13, lu2<? super Intent>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String[] $emailAddresses;
    final /* synthetic */ String $emailBody;
    final /* synthetic */ String $emailSubject;
    final /* synthetic */ String $exceptionDump;
    final /* synthetic */ ba5 $fileLogging;
    final /* synthetic */ String $reportSource;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    @uh3(c = "com.indeed.android.jobsearch.error.ReportEmailHelperKt$createReportEmailIntent$2$errorReportFile$1", f = "ReportEmailHelper.kt", l = {119}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super File>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $exceptionDump;
        final /* synthetic */ String $reportSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, String str2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$context = context;
            this.$exceptionDump = str;
            this.$reportSource = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$context, this.$exceptionDump, this.$reportSource, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super File> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            Context context = this.$context;
            String str = this.$exceptionDump;
            String str2 = this.$reportSource;
            this.label = 1;
            Object objA = p2d.a(context, str, str2, this);
            g13 g13Var = g13.a;
            return objA == g13Var ? g13Var : objA;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.error.ReportEmailHelperKt$createReportEmailIntent$2$eventLogFile$1", f = "ReportEmailHelper.kt", l = {120}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super File>, Object> {
        final /* synthetic */ ba5 $fileLogging;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ba5 ba5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$fileLogging = ba5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$fileLogging, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super File> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            ba5 ba5Var = this.$fileLogging;
            this.label = 1;
            Object objB = p2d.b(ba5Var, this);
            g13 g13Var = g13.a;
            return objB == g13Var ? g13Var : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2d(Context context, String str, String str2, ba5 ba5Var, String[] strArr, String str3, String str4, lu2<? super j2d> lu2Var) {
        super(2, lu2Var);
        this.$context = context;
        this.$exceptionDump = str;
        this.$reportSource = str2;
        this.$fileLogging = ba5Var;
        this.$emailAddresses = strArr;
        this.$emailSubject = str3;
        this.$emailBody = str4;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        j2d j2dVar = new j2d(this.$context, this.$exceptionDump, this.$reportSource, this.$fileLogging, this.$emailAddresses, this.$emailSubject, this.$emailBody, lu2Var);
        j2dVar.L$0 = obj;
        return j2dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super Intent> lu2Var) {
        return ((j2d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (r10 == r6) goto L16;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
