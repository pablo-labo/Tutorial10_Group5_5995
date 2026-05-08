package defpackage;

import defpackage.d0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.eventlog.IndeedEventLogging$refreshLoggerConfig$advertisingIdDeferred$1", f = "IndeedEventLogging.kt", l = {84}, m = "invokeSuspend")
public final class y87 extends c1f implements Function2<e13, lu2<? super d0.a>, Object> {
    int label;

    @uh3(c = "com.indeed.android.jobsearch.eventlog.IndeedEventLogging$refreshLoggerConfig$advertisingIdDeferred$1$1", f = "IndeedEventLogging.kt", l = {84}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super d0.a>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super d0.a> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
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
            d0 d0Var = d0.a;
            this.label = 1;
            Object objA = d0Var.a(this);
            g13 g13Var = g13.a;
            return objA == g13Var ? g13Var : objA;
        }
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new y87(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super d0.a> lu2Var) {
        return ((y87) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                a aVar = new a(2, null);
                this.label = 1;
                obj = ewa.O(15000L, aVar, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return (d0.a) obj;
        } catch (TimeoutCancellationException unused) {
            ArrayList arrayList = lz2.a;
            lz2.c("IndeedEventLogging", "Timed out retrieving advertising id", false, null, 12);
            return null;
        }
    }
}
