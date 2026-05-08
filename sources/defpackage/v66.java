package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.c;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.f;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.g;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v66 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v66(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                GhostwriterDebugFragment ghostwriterDebugFragment = (GhostwriterDebugFragment) obj6;
                e13 e13Var = (e13) obj5;
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zX = bVar.x(ghostwriterDebugFragment);
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (zX || objV == c0020a) {
                        objV = new ig(ghostwriterDebugFragment, 8);
                        bVar.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar.x(e13Var) | bVar.x(ghostwriterDebugFragment);
                    Object objV2 = bVar.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new yi(3, e13Var, ghostwriterDebugFragment);
                        bVar.p(objV2);
                    }
                    gu5 gu5Var2 = (gu5) objV2;
                    boolean zX3 = bVar.x(e13Var) | bVar.x(ghostwriterDebugFragment);
                    Object objV3 = bVar.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new as(7, e13Var, ghostwriterDebugFragment);
                        bVar.p(objV3);
                    }
                    gu5 gu5Var3 = (gu5) objV3;
                    boolean zX4 = bVar.x(ghostwriterDebugFragment);
                    Object objV4 = bVar.v();
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new hr(ghostwriterDebugFragment, 4);
                        bVar.p(objV4);
                    }
                    gu5 gu5Var4 = (gu5) objV4;
                    boolean zX5 = bVar.x(ghostwriterDebugFragment);
                    Object objV5 = bVar.v();
                    if (zX5 || objV5 == c0020a) {
                        objV5 = ghostwriterDebugFragment.new f(null);
                        bVar.p(objV5);
                    }
                    Function2 function2 = (Function2) objV5;
                    boolean zX6 = bVar.x(ghostwriterDebugFragment);
                    Object objV6 = bVar.v();
                    if (zX6 || objV6 == c0020a) {
                        objV6 = ghostwriterDebugFragment.new g(g4aVar, g4aVar2, null);
                        bVar.p(objV6);
                    }
                    xu5 xu5Var = (xu5) objV6;
                    Object objV7 = bVar.v();
                    if (objV7 == c0020a) {
                        objV7 = new vm1(6);
                        bVar.p(objV7);
                    }
                    gu5 gu5Var5 = (gu5) objV7;
                    Object objV8 = bVar.v();
                    if (objV8 == c0020a) {
                        objV8 = new pd1(7);
                        bVar.p(objV8);
                    }
                    gu5 gu5Var6 = (gu5) objV8;
                    Object objV9 = bVar.v();
                    if (objV9 == c0020a) {
                        objV9 = new jr(8);
                        bVar.p(objV9);
                    }
                    gu5 gu5Var7 = (gu5) objV9;
                    boolean zX7 = bVar.x(ghostwriterDebugFragment);
                    Object objV10 = bVar.v();
                    if (zX7 || objV10 == c0020a) {
                        objV10 = ghostwriterDebugFragment.new c(null);
                        bVar.p(objV10);
                    }
                    n76.f(gu5Var, gu5Var2, gu5Var3, gu5Var4, function2, xu5Var, gu5Var5, gu5Var6, gu5Var7, (Function2) objV10, bVar, 114819072);
                } else {
                    bVar.D();
                }
                break;
            default:
                fv6 fv6Var = (fv6) obj6;
                ar6 ar6Var = (ar6) obj5;
                zq6 zq6Var = (zq6) obj4;
                String str = (String) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (ar6Var == null) {
                        ar6Var = ar6.Filled;
                    }
                    ar6 ar6Var2 = ar6Var;
                    if (zq6Var == null) {
                        zq6Var = zq6.Md;
                    }
                    ev6.b(fv6Var, null, ar6Var2, zq6Var, 0L, str.concat("LeadingIcon"), bVar2, 0, 18);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
