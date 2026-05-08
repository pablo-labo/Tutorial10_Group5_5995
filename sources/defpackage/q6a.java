package defpackage;

import android.content.Context;
import androidx.fragment.app.g;
import defpackage.lhb;
import defpackage.os7;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q6a implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q6a(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((g4a) obj2).setValue(j7f.a);
                u63.Y((e13) obj3, null, null, new p7a((e2b) obj, null), 3);
                break;
            case 1:
                break;
            case 2:
                u63.Y((e13) obj3, null, null, new lhb.b((hee) obj2, (mhb) obj, null), 3);
                break;
            case 3:
                ((Function1) obj3).invoke(((dub) obj2).c);
                ((gu5) obj).invoke();
                break;
            case 4:
                x1c x1cVar = (x1c) obj3;
                Context context = (Context) obj2;
                pi piVar = new pi(8, x1cVar, (String) obj);
                x1cVar.getClass();
                context.getClass();
                u63.Y(ee3.p(x1cVar), null, null, new a2c(x1cVar, context, piVar, null), 3);
                break;
            default:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                vr7Var.b(lr5VarU, new os7.g(new ss7(((svb) obj2).b), new szb((wu5) obj, 1)), new ur7.c(""));
                break;
        }
        return j6g.a;
    }
}
