package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.jm5;
import defpackage.we1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gvf {

    public static final class a extends mj8 implements Function1<we1.a, Boolean> {
        final /* synthetic */ FocusTargetNode $activeNodeBeforeSearch;
        final /* synthetic */ int $direction;
        final /* synthetic */ qtc $focusedItem;
        final /* synthetic */ Function1<FocusTargetNode, Boolean> $onFound;
        final /* synthetic */ FocusTargetNode $this_generateAndSearchChildren;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, qtc qtcVar, int i, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.$activeNodeBeforeSearch = focusTargetNode;
            this.$this_generateAndSearchChildren = focusTargetNode2;
            this.$focusedItem = qtcVar;
            this.$direction = i;
            this.$onFound = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(we1.a aVar) {
            we1.a aVar2 = aVar;
            if (this.$activeNodeBeforeSearch != us3.g(this.$this_generateAndSearchChildren).getFocusOwner().f()) {
                return Boolean.TRUE;
            }
            boolean zJ = gvf.j(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
            Boolean boolValueOf = Boolean.valueOf(zJ);
            if (zJ || !aVar2.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    public static final boolean a(qtc qtcVar, qtc qtcVar2, qtc qtcVar3, int i) {
        float f;
        float f2;
        boolean zB = b(i, qtcVar3, qtcVar);
        float f3 = qtcVar3.b;
        float f4 = qtcVar3.d;
        float f5 = qtcVar3.a;
        float f6 = qtcVar3.c;
        float f7 = qtcVar.d;
        float f8 = qtcVar.b;
        float f9 = qtcVar.c;
        float f10 = qtcVar.a;
        if (!zB && b(i, qtcVar2, qtcVar)) {
            if (i == 3) {
                if (f10 < f6) {
                    return true;
                }
            } else if (i == 4) {
                if (f9 > f5) {
                    return true;
                }
            } else if (i == 5) {
                if (f8 < f4) {
                    return true;
                }
            } else if (i != 6) {
                r6.g("This function should only be used for 2-D focus search");
            } else if (f7 > f3) {
                return true;
            }
            if (i == 3 || i == 4) {
                return true;
            }
            if (i == 3) {
                f = f10 - qtcVar2.c;
            } else if (i == 4) {
                f = qtcVar2.a - f9;
            } else if (i == 5) {
                f = f8 - qtcVar2.d;
            } else {
                if (i != 6) {
                    r6.g("This function should only be used for 2-D focus search");
                    return false;
                }
                f = qtcVar2.b - f7;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (i == 3) {
                f2 = f10 - f5;
            } else if (i == 4) {
                f2 = f6 - f9;
            } else if (i == 5) {
                f2 = f8 - f3;
            } else {
                if (i != 6) {
                    r6.g("This function should only be used for 2-D focus search");
                    return false;
                }
                f2 = f4 - f7;
            }
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            if (f < f2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(int i, qtc qtcVar, qtc qtcVar2) {
        if (i == 3 || i == 4) {
            if (qtcVar.d > qtcVar2.b && qtcVar.b < qtcVar2.d) {
                return true;
            }
        } else {
            if (i != 5 && i != 6) {
                r6.g("This function should only be used for 2-D focus search");
                return false;
            }
            if (qtcVar.c > qtcVar2.a && qtcVar.a < qtcVar2.c) {
                return true;
            }
        }
        return false;
    }

    public static final void c(FocusTargetNode focusTargetNode, j4a j4aVar) {
        if (!focusTargetNode.a.c0) {
            ae7.b("visitChildren called on an unattached node");
        }
        j4a j4aVar2 = new j4a(new e.c[16]);
        e.c cVar = focusTargetNode.a;
        e.c cVar2 = cVar.f;
        if (cVar2 == null) {
            us3.a(j4aVar2, cVar);
        } else {
            j4aVar2.b(cVar2);
        }
        while (true) {
            int i = j4aVar2.c;
            if (i == 0) {
                return;
            }
            e.c cVarB = (e.c) j4aVar2.k(i - 1);
            if ((cVarB.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
                us3.a(j4aVar2, cVarB);
            } else {
                while (true) {
                    if (cVarB == null) {
                        break;
                    }
                    if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                        j4a j4aVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.c0 && !us3.f(focusTargetNode2).E0) {
                                    if (focusTargetNode2.d2().a) {
                                        j4aVar.b(focusTargetNode2);
                                    } else {
                                        c(focusTargetNode2, j4aVar);
                                    }
                                }
                            } else if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (cVarB instanceof zs3)) {
                                int i2 = 0;
                                for (e.c cVar3 = ((zs3) cVarB).e0; cVar3 != null; cVar3 = cVar3.f) {
                                    if ((cVar3.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (j4aVar3 == null) {
                                                j4aVar3 = new j4a(new e.c[16]);
                                            }
                                            if (cVarB != null) {
                                                j4aVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            j4aVar3.b(cVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVarB = us3.b(j4aVar3);
                        }
                    } else {
                        cVarB = cVarB.f;
                    }
                }
            }
        }
    }

    public static final FocusTargetNode d(j4a<FocusTargetNode> j4aVar, qtc qtcVar, int i) {
        qtc qtcVarH;
        FocusTargetNode focusTargetNode = null;
        if (i == 3) {
            qtcVarH = qtcVar.h((qtcVar.c - qtcVar.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            qtcVarH = qtcVar.h(-((qtcVar.c - qtcVar.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            qtcVarH = qtcVar.h(0.0f, (qtcVar.d - qtcVar.b) + 1.0f);
        } else {
            if (i != 6) {
                r6.g("This function should only be used for 2-D focus search");
                return null;
            }
            qtcVarH = qtcVar.h(0.0f, -((qtcVar.d - qtcVar.b) + 1.0f));
        }
        FocusTargetNode[] focusTargetNodeArr = j4aVar.a;
        int i2 = j4aVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i3];
            if (dn5.d(focusTargetNode2)) {
                qtc qtcVarB = dn5.b(focusTargetNode2);
                if (g(qtcVarB, qtcVarH, qtcVar, i)) {
                    focusTargetNode = focusTargetNode2;
                    qtcVarH = qtcVarB;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        qtc qtcVar;
        j4a j4aVar = new j4a(new FocusTargetNode[16]);
        c(focusTargetNode, j4aVar);
        int i2 = j4aVar.c;
        if (i2 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i2 == 0 ? null : j4aVar.a[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                qtc qtcVarB = dn5.b(focusTargetNode);
                float f = qtcVarB.a;
                float f2 = qtcVarB.b;
                qtcVar = new qtc(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    r6.g("This function should only be used for 2-D focus search");
                    return false;
                }
                qtc qtcVarB2 = dn5.b(focusTargetNode);
                float f3 = qtcVarB2.c;
                float f4 = qtcVarB2.d;
                qtcVar = new qtc(f3, f4, f3, f4);
            }
            FocusTargetNode focusTargetNodeD = d(j4aVar, qtcVar, i);
            if (focusTargetNodeD != null) {
                return function1.invoke(focusTargetNodeD).booleanValue();
            }
        }
        return false;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, qtc qtcVar, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        if (j(focusTargetNode, qtcVar, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) ye1.a(focusTargetNode, i, new a(us3.g(focusTargetNode).getFocusOwner().f(), focusTargetNode, qtcVar, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(qtc qtcVar, qtc qtcVar2, qtc qtcVar3, int i) {
        if (!h(i, qtcVar, qtcVar3)) {
            return false;
        }
        if (h(i, qtcVar2, qtcVar3) && !a(qtcVar3, qtcVar, qtcVar2, i)) {
            return !a(qtcVar3, qtcVar2, qtcVar, i) && i(i, qtcVar3, qtcVar) < i(i, qtcVar3, qtcVar2);
        }
        return true;
    }

    public static final boolean h(int i, qtc qtcVar, qtc qtcVar2) {
        float f = qtcVar.b;
        float f2 = qtcVar.d;
        float f3 = qtcVar.a;
        float f4 = qtcVar.c;
        if (i == 3) {
            float f5 = qtcVar2.c;
            float f6 = qtcVar2.a;
            if ((f5 > f4 || f6 >= f4) && f6 > f3) {
                return true;
            }
        } else if (i == 4) {
            float f7 = qtcVar2.a;
            float f8 = qtcVar2.c;
            if ((f7 < f3 || f8 <= f3) && f8 < f4) {
                return true;
            }
        } else if (i == 5) {
            float f9 = qtcVar2.d;
            float f10 = qtcVar2.b;
            if ((f9 > f2 || f10 >= f2) && f10 > f) {
                return true;
            }
        } else {
            if (i != 6) {
                r6.g("This function should only be used for 2-D focus search");
                return false;
            }
            float f11 = qtcVar2.b;
            float f12 = qtcVar2.d;
            if ((f11 < f || f12 <= f) && f12 < f2) {
                return true;
            }
        }
        return false;
    }

    public static final long i(int i, qtc qtcVar, qtc qtcVar2) {
        float f;
        float f2;
        float f3 = qtcVar2.b;
        float f4 = qtcVar2.d;
        float f5 = qtcVar2.a;
        float f6 = qtcVar2.c;
        if (i == 3) {
            f = qtcVar.a - f6;
        } else if (i == 4) {
            f = f5 - qtcVar.c;
        } else if (i == 5) {
            f = qtcVar.b - f4;
        } else {
            if (i != 6) {
                r6.g("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f3 - qtcVar.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = qtcVar.b;
            f2 = (((qtcVar.d - f7) / 2.0f) + f7) - (((f4 - f3) / 2.0f) + f3);
        } else {
            if (i != 5 && i != 6) {
                r6.g("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = qtcVar.a;
            f2 = (((qtcVar.c - f8) / 2.0f) + f8) - (((f6 - f5) / 2.0f) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean j(FocusTargetNode focusTargetNode, qtc qtcVar, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeD;
        j4a j4aVar = new j4a(new FocusTargetNode[16]);
        if (!focusTargetNode.a.c0) {
            ae7.b("visitChildren called on an unattached node");
        }
        j4a j4aVar2 = new j4a(new e.c[16]);
        e.c cVar = focusTargetNode.a;
        e.c cVar2 = cVar.f;
        if (cVar2 == null) {
            us3.a(j4aVar2, cVar);
        } else {
            j4aVar2.b(cVar2);
        }
        while (true) {
            int i2 = j4aVar2.c;
            if (i2 == 0) {
                break;
            }
            e.c cVarB = (e.c) j4aVar2.k(i2 - 1);
            if ((cVarB.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
                us3.a(j4aVar2, cVarB);
            } else {
                while (true) {
                    if (cVarB == null) {
                        break;
                    }
                    if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                        j4a j4aVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.c0) {
                                    j4aVar.b(focusTargetNode2);
                                }
                            } else if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (cVarB instanceof zs3)) {
                                int i3 = 0;
                                for (e.c cVar3 = ((zs3) cVarB).e0; cVar3 != null; cVar3 = cVar3.f) {
                                    if ((cVar3.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (j4aVar3 == null) {
                                                j4aVar3 = new j4a(new e.c[16]);
                                            }
                                            if (cVarB != null) {
                                                j4aVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            j4aVar3.b(cVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            cVarB = us3.b(j4aVar3);
                        }
                    } else {
                        cVarB = cVarB.f;
                    }
                }
            }
        }
        while (j4aVar.c != 0 && (focusTargetNodeD = d(j4aVar, qtcVar, i)) != null) {
            if (focusTargetNodeD.d2().a) {
                return function1.invoke(focusTargetNodeD).booleanValue();
            }
            if (f(focusTargetNodeD, qtcVar, i, function1)) {
                return true;
            }
            j4aVar.j(focusTargetNodeD);
        }
        return false;
    }

    public static final Boolean k(FocusTargetNode focusTargetNode, int i, qtc qtcVar, jm5.a aVar) {
        int iOrdinal = focusTargetNode.P().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = dn5.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    r6.g("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = focusTargetNodeC.P().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolK = k(focusTargetNodeC, i, qtcVar, aVar);
                        if (!wl7.b(boolK, Boolean.FALSE)) {
                            return boolK;
                        }
                        if (qtcVar == null) {
                            if (focusTargetNodeC.P() != ym5.b) {
                                r6.g("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            FocusTargetNode focusTargetNodeA = dn5.a(focusTargetNodeC);
                            if (focusTargetNodeA == null) {
                                r6.g("ActiveParent must have a focusedChild");
                                return null;
                            }
                            qtcVar = dn5.b(focusTargetNodeA);
                        }
                        return Boolean.valueOf(f(focusTargetNode, qtcVar, i, aVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            l.g();
                            return null;
                        }
                        r6.g("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (qtcVar == null) {
                    qtcVar = dn5.b(focusTargetNodeC);
                }
                return Boolean.valueOf(f(focusTargetNode, qtcVar, i, aVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.d2().a ? (Boolean) aVar.invoke(focusTargetNode) : qtcVar == null ? Boolean.valueOf(e(focusTargetNode, i, aVar)) : Boolean.valueOf(j(focusTargetNode, qtcVar, i, aVar));
                }
                l.g();
                return null;
            }
        }
        return Boolean.valueOf(e(focusTargetNode, i, aVar));
    }
}
