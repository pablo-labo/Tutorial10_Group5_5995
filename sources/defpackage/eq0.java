package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import defpackage.ns7;
import defpackage.qq0;
import defpackage.sp7;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eq0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eq0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                u63.Y((e13) obj3, null, null, new qq0.g((e8a) obj2, (ude) obj, null), 3);
                break;
            case 1:
                kqg.a((String) obj3, (FragmentManager) obj2, false, (String) obj);
                break;
            case 2:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                ns7.g gVar = new ns7.g(null, new wzb((wu5) obj, 1));
                n5b n5bVar = (n5b) z92.Q0(((svb) obj2).r);
                if (n5bVar == null || (str = n5bVar.a) == null) {
                    str = "";
                }
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", gVar, new ur7.c(str));
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-".concat((String) obj3), "refresh", null, null, 12));
                ((Function1) obj2).invoke((String) obj);
                break;
        }
        return j6g.a;
    }
}
