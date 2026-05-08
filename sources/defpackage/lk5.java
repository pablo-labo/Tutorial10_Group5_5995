package defpackage;

import defpackage.o7d;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
public final class lk5 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ xd2<o7d<fse<Object>>> $result;
    final /* synthetic */ vi5<Object> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ luc<h4a<T>> a;
        public final /* synthetic */ e13 b;
        public final /* synthetic */ xd2<o7d<fse<T>>> c;

        public a(luc<h4a<T>> lucVar, e13 e13Var, xd2<o7d<fse<T>>> xd2Var) {
            this.a = lucVar;
            this.b = e13Var;
            this.c = xd2Var;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, gse] */
        @Override // defpackage.wi5
        public final Object a(T t, lu2<? super j6g> lu2Var) {
            luc<h4a<T>> lucVar = this.a;
            h4a<T> h4aVar = lucVar.element;
            if (h4aVar != null) {
                h4aVar.setValue(t);
            } else {
                ?? r3 = (T) hh2.e(t);
                this.c.j0(new o7d<>(new rqc(r3, u63.I(this.b.getCoroutineContext()))));
                lucVar.element = r3;
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk5(vi5<Object> vi5Var, xd2<o7d<fse<Object>>> xd2Var, lu2<? super lk5> lu2Var) {
        super(2, lu2Var);
        this.$upstream = vi5Var;
        this.$result = xd2Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        lk5 lk5Var = new lk5(this.$upstream, this.$result, lu2Var);
        lk5Var.L$0 = obj;
        return lk5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((lk5) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        luc lucVar;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                lucVar = new luc();
                vi5<Object> vi5Var = this.$upstream;
                a aVar = new a(lucVar, e13Var, this.$result);
                this.L$0 = lucVar;
                this.label = 1;
                Object objE = vi5Var.e(aVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lucVar = (luc) this.L$0;
                r7d.b(obj);
            }
            if (lucVar.element == 0) {
                this.$result.j0(new o7d<>(new o7d.a(new NoSuchElementException("Flow is empty"))));
            }
            return j6g.a;
        } catch (Throwable th) {
            this.$result.h0(th);
            throw th;
        }
    }
}
