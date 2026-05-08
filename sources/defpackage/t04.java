package defpackage;

import defpackage.lf0;
import defpackage.mf8;
import defpackage.v04;
import defpackage.xf8;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int iA;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v04.a aVar = (v04.a) obj;
                return aVar.g.z0(aVar.j);
            case 1:
                wd8 wd8Var = (wd8) obj;
                List<mf8> parameters = wd8Var.getParameters();
                int size = (wd8Var.isSuspend() ? 1 : 0) + parameters.size();
                boolean zBooleanValue = wd8Var.f.getValue().booleanValue();
                mf8.a aVar2 = mf8.a.c;
                if (zBooleanValue) {
                    iA = 0;
                    for (mf8 mf8Var : parameters) {
                        iA += mf8Var.f() == aVar2 ? wd8Var.A(mf8Var) : 0;
                    }
                } else {
                    List<mf8> list = parameters;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        iA = 0;
                    } else {
                        Iterator<T> it = list.iterator();
                        iA = 0;
                        while (it.hasNext()) {
                            if (((mf8) it.next()).f() == aVar2 && (iA = iA + 1) < 0) {
                                u63.n0();
                                throw null;
                            }
                        }
                    }
                }
                int i2 = (iA + 31) / 32;
                Object[] objArr = new Object[size + i2 + 1];
                for (mf8 mf8Var2 : parameters) {
                    if (mf8Var2.u()) {
                        cg8 type = mf8Var2.getType();
                        mq5 mq5Var = akg.a;
                        ui8 ui8Var = type.a;
                        if (ui8Var != null) {
                            int i3 = fe7.a;
                            v62 v62VarD = ui8Var.M0().d();
                            if (v62VarD != null ? fe7.b(v62VarD) : false) {
                            }
                        }
                        int index = mf8Var2.getIndex();
                        cg8 type2 = mf8Var2.getType();
                        Type typeL = type2.l();
                        if (typeL == null && (typeL = type2.l()) == null) {
                            typeL = kzf.b(type2, false);
                        }
                        objArr[index] = akg.e(typeL);
                    }
                    if (mf8Var2.d()) {
                        objArr[mf8Var2.getIndex()] = wd8.v(mf8Var2.getType());
                    }
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    objArr[size + i4] = 0;
                }
                return objArr;
            default:
                xf8.c cVar = (xf8.c) obj;
                p4c p4cVarE = cVar.E().z().e();
                return p4cVarE == null ? jz3.d(cVar.E().z(), lf0.a.a) : p4cVarE;
        }
    }
}
