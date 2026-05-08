package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.eventlog.IndeedEventLogging", f = "IndeedEventLogging.kt", l = {116, 120}, m = "refreshLoggerConfig")
public final class w87 extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s87 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w87(s87 s87Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = s87Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
