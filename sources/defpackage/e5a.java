package defpackage;

import com.indeed.android.myjobs.data.model.APIError;
import defpackage.hf3;

/* JADX INFO: loaded from: classes3.dex */
public final class e5a<T> implements wi5 {
    public final /* synthetic */ luc<T> a;
    public final /* synthetic */ luc<String> b;

    public e5a(luc<T> lucVar, luc<String> lucVar2) {
        this.a = lucVar;
        this.b = lucVar2;
    }

    @Override // defpackage.wi5
    public final Object a(Object obj, lu2 lu2Var) {
        T t;
        hf3 hf3Var = (hf3) obj;
        if (hf3Var instanceof hf3.c) {
            this.a.element = ((hf3.c) hf3Var).a;
        } else if (hf3Var instanceof hf3.a) {
            APIError aPIError = ((hf3.a) hf3Var).a;
            if (aPIError == null || (t = (T) aPIError.getMessage()) == null) {
                t = (T) "Unknown API error";
            }
            this.b.element = t;
        } else if (!(hf3Var instanceof hf3.b)) {
            l.g();
            return null;
        }
        return j6g.a;
    }
}
