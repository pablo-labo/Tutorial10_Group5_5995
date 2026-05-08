package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d7c extends fa implements Function2<Float, lu2<? super Float>, Object> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, lu2<? super Float> lu2Var) {
        float fFloatValue = f.floatValue();
        g7c g7cVar = (g7c) this.receiver;
        boolean zC = g7cVar.c();
        x2a x2aVar = g7cVar.f;
        float f2 = 0.0f;
        if (!zC) {
            if (g7cVar.a() > g7cVar.b()) {
                ((gu5) g7cVar.b.getValue()).invoke();
            }
            u63.Y(g7cVar.a, null, null, new f7c(g7cVar, 0.0f, null), 3);
            if (((cme) x2aVar).g() == 0.0f || fFloatValue < 0.0f) {
                fFloatValue = 0.0f;
            }
            ((cme) x2aVar).q(0.0f);
            f2 = fFloatValue;
        }
        return new Float(f2);
    }
}
