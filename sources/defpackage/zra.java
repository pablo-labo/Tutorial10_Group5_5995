package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.we1;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zra {

    public static final class a extends mj8 implements Function1<we1.a, Boolean> {
        final /* synthetic */ FocusTargetNode $activeNodeBeforeSearch;
        final /* synthetic */ int $direction;
        final /* synthetic */ FocusTargetNode $focusedItem;
        final /* synthetic */ Function1<FocusTargetNode, Boolean> $onFound;
        final /* synthetic */ FocusTargetNode $this_generateAndSearchChildren;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.$activeNodeBeforeSearch = focusTargetNode;
            this.$this_generateAndSearchChildren = focusTargetNode2;
            this.$focusedItem = focusTargetNode3;
            this.$direction = i;
            this.$onFound = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(we1.a aVar) {
            we1.a aVar2 = aVar;
            if (this.$activeNodeBeforeSearch != us3.g(this.$this_generateAndSearchChildren).getFocusOwner().f()) {
                return Boolean.TRUE;
            }
            boolean zF = zra.f(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
            Boolean boolValueOf = Boolean.valueOf(zF);
            if (zF || !aVar2.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(androidx.compose.ui.focus.FocusTargetNode r7, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r8) {
        /*
            ym5 r0 = r7.P()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L81
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L81
            if (r0 != r1) goto L31
            boolean r0 = d(r7, r8)
            if (r0 != 0) goto L77
            nm5 r0 = r7.d2()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L76
            goto L77
        L31:
            defpackage.l.g()
            return r2
        L35:
            androidx.compose.ui.focus.FocusTargetNode r0 = defpackage.dn5.c(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7d
            ym5 r6 = r0.P()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L78
            if (r6 == r4) goto L55
            if (r6 == r3) goto L78
            if (r6 == r1) goto L51
            defpackage.l.g()
            return r2
        L51:
            defpackage.r6.g(r5)
            return r2
        L55:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L77
            boolean r7 = c(r7, r0, r3, r8)
            if (r7 != 0) goto L77
            nm5 r7 = r0.d2()
            boolean r7 = r7.a
            if (r7 == 0) goto L76
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            goto L77
        L76:
            return r2
        L77:
            return r4
        L78:
            boolean r7 = c(r7, r0, r3, r8)
            return r7
        L7d:
            defpackage.r6.g(r5)
            return r2
        L81:
            boolean r7 = d(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zra.a(androidx.compose.ui.focus.FocusTargetNode, kotlin.jvm.functions.Function1):boolean");
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        int iOrdinal = focusTargetNode.P().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = dn5.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return b(focusTargetNodeC, function1) || c(focusTargetNode, focusTargetNodeC, 1, function1);
                }
                r6.g("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.d2().a ? function1.invoke(focusTargetNode).booleanValue() : e(focusTargetNode, function1);
                }
                l.g();
                return false;
            }
        }
        return e(focusTargetNode, function1);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        if (f(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) ye1.a(focusTargetNode, i, new a(us3.g(focusTargetNode).getFocusOwner().f(), focusTargetNode, focusTargetNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.a.c0) {
            ae7.b("visitChildren called on an unattached node");
        }
        j4a j4aVar = new j4a(new e.c[16]);
        e.c cVar = focusTargetNode.a;
        e.c cVar2 = cVar.f;
        if (cVar2 == null) {
            us3.a(j4aVar, cVar);
        } else {
            j4aVar.b(cVar2);
        }
        int i = 0;
        while (true) {
            int i2 = j4aVar.c;
            if (i2 == 0) {
                break;
            }
            e.c cVarB = (e.c) j4aVar.k(i2 - 1);
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = focusTargetNode2;
                                i = i3;
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
        Arrays.sort(objArr, 0, i, en5.b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i5];
                if (dn5.d(focusTargetNode3) && a(focusTargetNode3, function1)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, Function1<? super FocusTargetNode, Boolean> function1) {
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.a.c0) {
            ae7.b("visitChildren called on an unattached node");
        }
        j4a j4aVar = new j4a(new e.c[16]);
        e.c cVar = focusTargetNode.a;
        e.c cVar2 = cVar.f;
        if (cVar2 == null) {
            us3.a(j4aVar, cVar);
        } else {
            j4aVar.b(cVar2);
        }
        int i = 0;
        while (true) {
            int i2 = j4aVar.c;
            if (i2 == 0) {
                break;
            }
            e.c cVarB = (e.c) j4aVar.k(i2 - 1);
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = focusTargetNode2;
                                i = i3;
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
        Arrays.sort(objArr, 0, i, en5.b);
        for (int i5 = 0; i5 < i; i5++) {
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i5];
            if (dn5.d(focusTargetNode3) && b(focusTargetNode3, function1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(androidx.compose.ui.focus.FocusTargetNode r12, androidx.compose.ui.focus.FocusTargetNode r13, int r14, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zra.f(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode, int, kotlin.jvm.functions.Function1):boolean");
    }
}
