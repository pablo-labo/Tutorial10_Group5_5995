package defpackage;

import defpackage.ere;
import defpackage.ewc;
import defpackage.ke8;
import defpackage.lf8;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class uv7 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ uv7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws InvalidProtocolBufferException {
        dw4 dw4Var;
        si8 si8Var;
        hi8 hi8Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Map<String, EnumSet<ti8>> map = lu7.a;
                gu7 gu7Var = ((vv7) obj).d;
                av7 av7Var = gu7Var instanceof av7 ? (av7) gu7Var : null;
                if (av7Var == null || (si8Var = lu7.b.get(av7Var.b().c())) == null) {
                    dw4Var = null;
                } else {
                    mq5 mq5Var = ere.a.v;
                    mq5Var.getClass();
                    dw4Var = new dw4(new a62(mq5Var.b(), mq5Var.a.f()), n8a.h(si8Var.name()));
                }
                Map mapW = dw4Var != null ? kc9.W(new Pair(ju7.c, dw4Var)) : null;
                return mapW == null ? bs4.a : mapW;
            case 1:
                ke8.a aVar = (ke8.a) obj;
                ewc.a aVar2 = aVar.o;
                qf8<Object>[] qf8VarArr = ke8.a.q;
                qf8<Object> qf8Var = qf8VarArr[13];
                Object objInvoke = aVar2.invoke();
                objInvoke.getClass();
                ewc.a aVar3 = aVar.p;
                qf8<Object> qf8Var2 = qf8VarArr[14];
                Object objInvoke2 = aVar3.invoke();
                objInvoke2.getClass();
                return z92.h1((Collection) objInvoke, (Collection) objInvoke2);
            case 2:
                ewc.a aVar4 = ((lf8.a) obj).c;
                qf8<Object> qf8Var3 = lf8.a.g[0];
                awc awcVar = (awc) aVar4.invoke();
                if (awcVar == null || (hi8Var = awcVar.b) == null) {
                    return null;
                }
                String[] strArr = hi8Var.c;
                String[] strArr2 = hi8Var.e;
                if (strArr == null || strArr2 == null) {
                    return null;
                }
                Pair<hd8, e5c> pairH = pd8.h(strArr, strArr2);
                return new muf(pairH.a(), pairH.b(), hi8Var.b);
            default:
                ap8 ap8Var = (ap8) obj;
                if (b04.f(ap8Var) != null) {
                    ap8Var.V.a.w.getClass();
                }
                return null;
        }
    }
}
