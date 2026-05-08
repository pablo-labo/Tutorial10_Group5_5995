package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eu2 implements e13 {
    public final v03 a;

    public eu2(v03 v03Var) {
        this.a = v03Var;
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
