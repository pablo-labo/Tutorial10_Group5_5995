package defpackage;

import defpackage.f55;
import defpackage.hh5;
import defpackage.ixa;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class hw4 implements f55 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ixa.b.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.f55
    public final f55.a a() {
        return f55.a.b;
    }

    @Override // defpackage.f55
    public final f55.b b(fv1 fv1Var, fv1 fv1Var2, t52 t52Var) {
        fv1Var.getClass();
        fv1Var2.getClass();
        if (fv1Var2 instanceof iv7) {
            iv7 iv7Var = (iv7) fv1Var2;
            if (iv7Var.getTypeParameters().isEmpty()) {
                ixa.b bVarI = ixa.i(fv1Var, fv1Var2);
                if ((bVarI != null ? bVarI.a : null) == null) {
                    List<rlg> listI = iv7Var.i();
                    listI.getClass();
                    xrf xrfVar = new xrf(new y92(listI), nz3.c);
                    ui8 ui8Var = iv7Var.V;
                    ui8Var.getClass();
                    hh5 hh5VarM = v6e.M(ut0.e0(new r6e[]{xrfVar, new w6e(ui8Var)}), new lt(11));
                    hsc hscVar = iv7Var.X;
                    hh5.a aVar = new hh5.a(v6e.M(ut0.e0(new r6e[]{hh5VarM, new y92(u63.b0(hscVar != null ? hscVar.getType() : null))}), new lt(11)));
                    while (true) {
                        if (aVar.hasNext()) {
                            ui8 ui8Var2 = (ui8) aVar.next();
                            if (!ui8Var2.K0().isEmpty() && !(ui8Var2.P0() instanceof cjc)) {
                                break;
                            }
                        } else {
                            fv1 fv1VarB = fv1Var.b(TypeSubstitutor.e(new ajc()));
                            if (fv1VarB != null) {
                                if (fv1VarB instanceof sfe) {
                                    sfe sfeVar = (sfe) fv1VarB;
                                    List<rxf> typeParameters = sfeVar.getTypeParameters();
                                    typeParameters.getClass();
                                    if (!typeParameters.isEmpty()) {
                                        fv1VarB = sfeVar.F0().i().build();
                                        fv1VarB.getClass();
                                    }
                                }
                                if (a.a[ixa.e.n(fv1VarB, fv1Var2, false).a.ordinal()] == 1) {
                                    return f55.b.a;
                                }
                            }
                        }
                    }
                }
            }
        }
        return f55.b.c;
    }
}
