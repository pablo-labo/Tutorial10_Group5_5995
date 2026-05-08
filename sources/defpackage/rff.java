package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.input.key.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rff implements wu5<e, b, Integer, e> {
    public final /* synthetic */ c6g V;
    public final /* synthetic */ Function1<jhf, j6g> W;
    public final /* synthetic */ int X;
    public final /* synthetic */ lu8 a;
    public final /* synthetic */ rgf b;
    public final /* synthetic */ jhf c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ roa f;

    /* JADX WARN: Multi-variable type inference failed */
    public rff(lu8 lu8Var, rgf rgfVar, jhf jhfVar, boolean z, boolean z2, roa roaVar, c6g c6gVar, Function1<? super jhf, j6g> function1, int i) {
        this.a = lu8Var;
        this.b = rgfVar;
        this.c = jhfVar;
        this.d = z;
        this.e = z2;
        this.f = roaVar;
        this.V = c6gVar;
        this.W = function1;
        this.X = i;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(851809892);
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = new yif();
            bVar2.p(objV);
        }
        yif yifVar = (yif) objV;
        Object objV2 = bVar2.v();
        if (objV2 == c0020a) {
            objV2 = new zg3();
            bVar2.p(objV2);
        }
        Function1<jhf, j6g> function1 = this.W;
        int i = this.X;
        pff pffVar = new pff(this.a, this.b, this.c, this.d, this.e, yifVar, this.f, this.V, (zg3) objV2, function1, i);
        boolean zX = bVar2.x(pffVar);
        Object objV3 = bVar2.v();
        if (zX || objV3 == c0020a) {
            qff qffVar = new qff(1, pffVar, pff.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            bVar2.p(qffVar);
            objV3 = qffVar;
        }
        e eVarA = a.a(e.a.b, (Function1) ((ve8) objV3));
        bVar2.F();
        return eVarA;
    }
}
