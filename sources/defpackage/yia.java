package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class yia {
    public static final o3a<Object> a = mna.a();

    public static final void a(e.c cVar, int i, int i2) {
        if (!(cVar instanceof zs3)) {
            b(cVar, i & cVar.c, i2);
            return;
        }
        zs3 zs3Var = (zs3) cVar;
        int i3 = zs3Var.d0;
        b(cVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (e.c cVar2 = zs3Var.e0; cVar2 != null; cVar2 = cVar2.f) {
            a(cVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(e.c cVar, int i, int i2) {
        if (i2 != 0 || cVar.R1()) {
            if ((i & 2) != 0 && (cVar instanceof lm8)) {
                us3.f((lm8) cVar).S();
                if (i2 == 2) {
                    tia tiaVarD = us3.d(cVar, 2);
                    tiaVarD.j0 = true;
                    tiaVarD.y0.invoke();
                    tiaVarD.V1();
                }
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 && (cVar instanceof ql8) && i2 != 2) {
                us3.f(cVar).S();
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 && (cVar instanceof z96)) {
                if (i2 == 1) {
                    pm8 pm8VarF = us3.f(cVar);
                    pm8VarF.n0(pm8VarF.D0 + 1);
                } else if (i2 == 2) {
                    us3.f(cVar).n0(r0.D0 - 1);
                }
                if (i2 != 2) {
                    pm8 pm8VarF2 = us3.f(cVar);
                    if (pm8VarF2.D0 != 0 && !pm8VarF2.F() && !pm8VarF2.G() && !pm8VarF2.C0) {
                        tm8.a(pm8VarF2).j(pm8VarF2);
                    }
                }
            }
            if ((i & 4) != 0 && (cVar instanceof eb4)) {
                fb4.a((eb4) cVar);
            }
            if ((i & 8) != 0 && (cVar instanceof c5e)) {
                us3.f(cVar).f0 = true;
            }
            if ((i & 64) != 0 && (cVar instanceof c4b)) {
                um8 um8Var = us3.f((c4b) cVar).u0;
                um8Var.p.g0 = true;
                z59 z59Var = um8Var.q;
                if (z59Var != null) {
                    z59Var.l0 = true;
                }
            }
            if ((i & 2048) != 0 && (cVar instanceof om5)) {
                om5 om5Var = (om5) cVar;
                ew1.b = null;
                om5Var.V(ew1.a);
                if (ew1.b != null) {
                    if (!om5Var.k().c0) {
                        ae7.b("visitChildren called on an unattached node");
                    }
                    j4a j4aVar = new j4a(new e.c[16]);
                    e.c cVar2 = om5Var.k().f;
                    if (cVar2 == null) {
                        us3.a(j4aVar, om5Var.k());
                    } else {
                        j4aVar.b(cVar2);
                    }
                    while (true) {
                        int i3 = j4aVar.c;
                        if (i3 == 0) {
                            break;
                        }
                        e.c cVarB = (e.c) j4aVar.k(i3 - 1);
                        if ((cVarB.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
                            us3.a(j4aVar, cVarB);
                        } else {
                            while (true) {
                                if (cVarB == null) {
                                    break;
                                }
                                if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                    j4a j4aVar2 = null;
                                    while (cVarB != null) {
                                        if (cVarB instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                                            us3.g(focusTargetNode).getFocusOwner().g(focusTargetNode);
                                        } else if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (cVarB instanceof zs3)) {
                                            int i4 = 0;
                                            for (e.c cVar3 = ((zs3) cVarB).e0; cVar3 != null; cVar3 = cVar3.f) {
                                                if ((cVar3.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cVarB = cVar3;
                                                    } else {
                                                        if (j4aVar2 == null) {
                                                            j4aVar2 = new j4a(new e.c[16]);
                                                        }
                                                        if (cVarB != null) {
                                                            j4aVar2.b(cVarB);
                                                            cVarB = null;
                                                        }
                                                        j4aVar2.b(cVar3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        cVarB = us3.b(j4aVar2);
                                    }
                                } else {
                                    cVarB = cVarB.f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(cVar instanceof sl5)) {
                return;
            }
            sl5 sl5Var = (sl5) cVar;
            us3.g(sl5Var).getFocusOwner().b(sl5Var);
        }
    }

    public static final void c(e.c cVar) {
        if (!cVar.c0) {
            ae7.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cVar, -1, 0);
    }

    public static final int d(e.b bVar) {
        int i = bVar instanceof jm8 ? 3 : 1;
        if (bVar instanceof db4) {
            i |= 4;
        }
        if (bVar instanceof a5e) {
            i |= 8;
        }
        if (bVar instanceof cfb) {
            i |= 16;
        }
        if ((bVar instanceof lx9) || (bVar instanceof ox9)) {
            i |= 32;
        }
        if (bVar instanceof rl5) {
            i |= 4096;
        }
        if (bVar instanceof gm5) {
            i |= 2048;
        }
        if (bVar instanceof mqa) {
            i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (bVar instanceof b4b) {
            i |= 64;
        }
        if ((bVar instanceof xqa) || (bVar instanceof fra)) {
            i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        return bVar instanceof an1 ? 524288 | i : i;
    }

    public static final int e(e.c cVar) {
        int i = cVar.c;
        if (i != 0) {
            return i;
        }
        Class<?> cls = cVar.getClass();
        o3a<Object> o3aVar = a;
        int iD = o3aVar.d(cls);
        if (iD >= 0) {
            return o3aVar.c[iD];
        }
        int i2 = cVar instanceof lm8 ? 3 : 1;
        if (cVar instanceof eb4) {
            i2 |= 4;
        }
        if (cVar instanceof c5e) {
            i2 |= 8;
        }
        if (cVar instanceof dfb) {
            i2 |= 16;
        }
        if (cVar instanceof nx9) {
            i2 |= 32;
        }
        if (cVar instanceof c4b) {
            i2 |= 64;
        }
        if (cVar instanceof ql8) {
            i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVar instanceof z96) {
            i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (cVar instanceof a) {
            i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        if (cVar instanceof FocusTargetNode) {
            i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVar instanceof om5) {
            i2 |= 2048;
        }
        if (cVar instanceof sl5) {
            i2 |= 4096;
        }
        if (cVar instanceof rg8) {
            i2 |= 8192;
        }
        if (cVar instanceof sfd) {
            i2 |= 16384;
        }
        if (cVar instanceof nm2) {
            i2 |= 32768;
        }
        if (cVar instanceof gne) {
            i2 |= 131072;
        }
        if (cVar instanceof jtf) {
            i2 |= 262144;
        }
        if (cVar instanceof an1) {
            i2 |= 524288;
        }
        if (cVar instanceof nra) {
            i2 |= 1048576;
        }
        if (cVar instanceof wa7) {
            i2 |= 2097152;
        }
        o3aVar.h(i2, cls);
        return i2;
    }

    public static final int f(e.c cVar) {
        if (!(cVar instanceof zs3)) {
            return e(cVar);
        }
        zs3 zs3Var = (zs3) cVar;
        int iF = zs3Var.d0;
        for (e.c cVar2 = zs3Var.e0; cVar2 != null; cVar2 = cVar2.f) {
            iF |= f(cVar2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
    }
}
