package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m7d extends x81 {
    public m7d(lu2<Object> lu2Var) {
        super(lu2Var);
        if (lu2Var == null || lu2Var.getContext() == vr4.a) {
            return;
        }
        l5.q("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return vr4.a;
    }
}
