package defpackage;

import androidx.compose.foundation.gestures.FlingCancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {837}, m = "invokeSuspend")
public final class tsd extends c1f implements Function2<afa, lu2<? super j6g>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ kuc $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ xsd this$0;

    public static final class a implements xrd {
        public final /* synthetic */ xsd a;
        public final /* synthetic */ afa b;

        public a(xsd xsdVar, afa afaVar) {
            this.a = xsdVar;
            this.b = afaVar;
        }

        @Override // defpackage.xrd
        public final float e(float f) {
            xsd xsdVar = this.a;
            boolean zBooleanValue = ((Boolean) xsdVar.h.invoke()).booleanValue();
            if (Math.abs(f) != 0.0f && !zBooleanValue) {
                throw new FlingCancellationException();
            }
            return xsdVar.d(xsdVar.g(this.b.b(2, xsdVar.e(xsdVar.h(f)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsd(xsd xsdVar, kuc kucVar, long j, lu2<? super tsd> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xsdVar;
        this.$result = kucVar;
        this.$available = j;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        tsd tsdVar = new tsd(this.this$0, this.$result, this.$available, lu2Var);
        tsdVar.L$0 = obj;
        return tsdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(afa afaVar, lu2<? super j6g> lu2Var) {
        return ((tsd) create(afaVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        xsd xsdVar;
        kuc kucVar;
        long j;
        xsd xsdVar2;
        int i = this.label;
        dwa dwaVar = dwa.b;
        if (i == 0) {
            r7d.b(obj);
            afa afaVar = (afa) this.L$0;
            xsdVar = this.this$0;
            a aVar = new a(xsdVar, afaVar);
            kuc kucVar2 = this.$result;
            long j2 = this.$available;
            nh5 nh5Var = xsdVar.c;
            long j3 = kucVar2.element;
            float fD = xsdVar.d(xsdVar.d == dwaVar ? vmg.b(j2) : vmg.c(j2));
            this.L$0 = xsdVar;
            this.L$1 = xsdVar;
            this.L$2 = kucVar2;
            this.J$0 = j3;
            this.label = 1;
            Object objA = nh5Var.a(aVar, fD, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
            }
            kucVar = kucVar2;
            j = j3;
            obj = objA;
            xsdVar2 = xsdVar;
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            kucVar = (kuc) this.L$2;
            xsdVar = (xsd) this.L$1;
            xsdVar2 = (xsd) this.L$0;
            r7d.b(obj);
        }
        float fD2 = xsdVar2.d(((Number) obj).floatValue());
        kucVar.element = xsdVar.d == dwaVar ? vmg.a(fD2, 0.0f, 2, j) : vmg.a(0.0f, fD2, 1, j);
        return j6g.a;
    }
}
