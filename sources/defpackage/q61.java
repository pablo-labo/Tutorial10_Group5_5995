package defpackage;

import androidx.compose.runtime.c;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q61 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q61(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(((m61) obj).a);
                return j6g.a;
            case 1:
                q0a q0aVar = (q0a) obj;
                ((c) obj2).f0(q0aVar.a, q0aVar.g, q0aVar.b);
                return j6g.a;
            case 2:
                ((Function1) obj2).invoke((z13) obj);
                return j6g.a;
            case 3:
                ((Function1) obj2).invoke(((jo4) obj).a);
                return j6g.a;
            case 4:
                u63.Y((e13) obj2, null, null, new rc7((hw9) obj, null), 3);
                return j6g.a;
            case 5:
                ka2.H((String) obj2, false, false, (FragmentManager) obj);
                return j6g.a;
            case 6:
                ((g4a) obj).setValue(Boolean.FALSE);
                ((gu5) obj2).invoke();
                return j6g.a;
            case 7:
                return x7b.f((x7b) obj2, (rc3) obj);
            default:
                ((Function1) obj2).invoke(((svb) obj).M);
                return j6g.a;
        }
    }
}
