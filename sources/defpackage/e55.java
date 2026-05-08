package defpackage;

import android.animation.FloatEvaluator;

/* JADX INFO: loaded from: classes3.dex */
public final class e55 extends FloatEvaluator {
    public final or a;
    public final he b;
    public Number c;
    public Number d;

    public e55(or orVar, he heVar) {
        this.a = orVar;
        this.b = heVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Number number, Number number2) {
        if (this.c == null) {
            this.c = (Number) this.a.invoke(number);
        }
        Number number3 = this.c;
        if (this.d == null) {
            this.b.invoke(number2);
            this.d = Float.valueOf(0.0f);
        }
        Number number4 = this.d;
        if (number3 == null || number4 == null) {
            return null;
        }
        return super.evaluate(f, number3, number4);
    }
}
