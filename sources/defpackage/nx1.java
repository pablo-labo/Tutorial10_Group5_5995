package defpackage;

import defpackage.ere;
import defpackage.xf8;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nx1 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nx1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IllegalAccessException {
        int i = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i) {
            case 0:
                ui8 type = ((wxf) obj).getType();
                type.getClass();
                return type;
            case 1:
                vz3 vz3Var = ((pz3) obj).d;
                vz3Var.getClass();
                vz3 vz3Var2 = new vz3();
                ct0 ct0VarQ = web.q(vz3.class.getDeclaredFields());
                while (ct0VarQ.hasNext()) {
                    Field field = (Field) ct0VarQ.next();
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj2 = field.get(vz3Var);
                        zna znaVar = obj2 instanceof zna ? (zna) obj2 : null;
                        if (znaVar != null) {
                            String name = field.getName();
                            name.getClass();
                            wve.K(name, "is", false);
                            yd8 yd8VarB = fwc.a.b(vz3.class);
                            String name2 = field.getName();
                            String name3 = field.getName();
                            name3.getClass();
                            if (name3.length() > 0) {
                                name3 = Character.toUpperCase(name3.charAt(0)) + name3.substring(1);
                            }
                            new l4c(iv1.NO_RECEIVER, ((k52) yd8VarB).j(), name2, "get".concat(name3), 0);
                            field.set(vz3Var2, new uz3(znaVar.a, vz3Var2));
                        }
                    }
                }
                int i2 = pz3.f;
                vz3Var2.j(bbe.o(vz3Var2.f(), u63.a0(ere.a.p, ere.a.q)));
                j6g j6gVar = j6g.a;
                vz3Var2.a = true;
                return new pz3(vz3Var2);
            case 2:
                return oie.h((v04) obj);
            case 3:
                List<mf8> parameters = ((wd8) obj).getParameters();
                if ((parameters instanceof Collection) && parameters.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        cg8 type2 = ((mf8) it.next()).getType();
                        mq5 mq5Var = akg.a;
                        ui8 ui8Var = type2.a;
                        if (ui8Var == null || !fe7.f(ui8Var)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return yf8.a((xf8.c) obj, false);
            default:
                return ((yx9) obj).S(ere.i).n();
        }
    }
}
