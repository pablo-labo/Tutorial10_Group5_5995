package defpackage;

import defpackage.glg;
import defpackage.hv1;
import defpackage.ke8;
import defpackage.of8;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t14 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t14(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        List listN1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u14 u14Var = (u14) obj;
                h04 h04Var = u14Var.Z;
                return z92.z1(h04Var.a.e.b(u14Var.a0, h04Var.b));
            case 1:
                return akg.d(((ke8.a) obj).b());
            case 2:
                of8 of8Var = (of8) obj;
                o3b o3bVarJ = of8Var.j();
                int i2 = of8Var.b;
                wd8<?> wd8Var = of8Var.a;
                if ((o3bVarJ instanceof hsc) && wl7.b(akg.g(wd8Var.z()), o3bVarJ) && wd8Var.z().f() == hv1.a.b) {
                    aj3 aj3VarD = wd8Var.z().d();
                    aj3VarD.getClass();
                    Class<?> clsJ = akg.j((t52) aj3VarD);
                    if (clsJ != null) {
                        return clsJ;
                    }
                    s6.i(o3bVarJ, "Cannot determine receiver Java type of inherited declaration: ");
                    return null;
                }
                pv1<?> pv1VarW = wd8Var.w();
                if (!(pv1VarW instanceof glg)) {
                    if (!(pv1VarW instanceof glg.b)) {
                        return pv1VarW.a().get(i2);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((glg.b) pv1VarW).d.get(i2)).toArray(new Class[0]);
                    Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length = typeArr.length;
                    if (length != 0) {
                        return length != 1 ? new of8.a(typeArr) : (Type) ut0.x0(typeArr);
                    }
                    throw new ri8("Expected at least 1 type for compound type");
                }
                if (wd8Var.C()) {
                    glg glgVar = (glg) pv1VarW;
                    oh7 oh7VarC = glgVar.c(i2 + 1);
                    int i3 = glgVar.c(0).b + 1;
                    listN1 = z92.n1(glgVar.b.a(), new oh7(oh7VarC.a - i3, oh7VarC.b - i3, 1));
                } else {
                    glg glgVar2 = (glg) pv1VarW;
                    listN1 = z92.n1(glgVar2.b.a(), glgVar2.c(i2));
                }
                Type[] typeArr2 = (Type[]) listN1.toArray(new Type[0]);
                Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                int length2 = typeArr3.length;
                if (length2 != 0) {
                    return length2 != 1 ? new of8.a(typeArr3) : (Type) ut0.x0(typeArr3);
                }
                throw new ri8("Expected at least 1 type for compound type");
            case 3:
                return oie.h((ap8) obj);
            default:
                return ((qp8) obj).h(lz3.o, null);
        }
    }
}
