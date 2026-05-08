package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jm5 implements im5 {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final dm5 d;
    public l3a f;
    public FocusTargetNode h;
    public final FocusTargetNode c = new FocusTargetNode(2, null, 6);
    public final FocusOwnerImpl$modifier$1 e = new qx9<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // defpackage.qx9
        public final e.c a() {
            return this.b.c;
        }

        @Override // defpackage.qx9
        public final /* bridge */ /* synthetic */ void b(e.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.b.c.hashCode();
        }
    };
    public final p3a<em5> g = new p3a<>(1);

    public static final class a extends mj8 implements Function1<FocusTargetNode, Boolean> {
        final /* synthetic */ Function1<FocusTargetNode, Boolean> $onFound;
        final /* synthetic */ FocusTargetNode $source;
        final /* synthetic */ jm5 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FocusTargetNode focusTargetNode, jm5 jm5Var, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.$source = focusTargetNode;
            this.this$0 = jm5Var;
            this.$onFound = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            if (wl7.b(focusTargetNode2, this.$source)) {
                zBooleanValue = false;
            } else {
                if (wl7.b(focusTargetNode2, this.this$0.c)) {
                    r6.g("Focus search landed at the root.");
                    return null;
                }
                zBooleanValue = this.$onFound.invoke(focusTargetNode2).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    public static final class b extends mj8 implements Function1<FocusTargetNode, Boolean> {
        final /* synthetic */ int $focusDirection;
        final /* synthetic */ luc<Boolean> $requestFocusSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(luc<Boolean> lucVar, int i) {
            super(1);
            this.$requestFocusSuccess = lucVar;
            this.$focusDirection = i;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.$requestFocusSuccess.element = Boolean.valueOf(focusTargetNode.A(this.$focusDirection));
            return this.$requestFocusSuccess.element;
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public jm5(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new dm5(this, androidComposeView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [j4a] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v1, types: [jm5$a, kotlin.jvm.functions.Function1] */
    @Override // defpackage.im5
    public final Boolean a(int i, qtc qtcVar, Function1<? super FocusTargetNode, Boolean> function1) {
        Boolean bool;
        boolean zA;
        Object obj;
        ria riaVar;
        FocusTargetNode focusTargetNode = this.c;
        FocusTargetNode focusTargetNodeA = dn5.a(focusTargetNode);
        int i2 = 4;
        AndroidComposeView androidComposeView = this.b;
        if (focusTargetNodeA != null) {
            vl8 layoutDirection = androidComposeView.getLayoutDirection();
            bool = null;
            nm5 nm5VarD2 = focusTargetNodeA.d2();
            sm5 sm5Var = nm5VarD2.h;
            sm5 sm5Var2 = nm5VarD2.i;
            if (i == 1) {
                sm5Var = nm5VarD2.b;
            } else if (i == 2) {
                sm5Var = nm5VarD2.c;
            } else if (i == 5) {
                sm5Var = nm5VarD2.d;
            } else if (i == 6) {
                sm5Var = nm5VarD2.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        l.g();
                        return null;
                    }
                    sm5Var = sm5Var2;
                }
                if (sm5Var == sm5.b) {
                    sm5Var = null;
                }
                if (sm5Var == null) {
                    sm5Var = nm5VarD2.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    sm5Var = sm5Var2;
                } else if (iOrdinal2 != 1) {
                    l.g();
                    return null;
                }
                if (sm5Var == sm5.b) {
                    sm5Var = null;
                }
                if (sm5Var == null) {
                    sm5Var = nm5VarD2.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    r6.g("invalid FocusDirection");
                    return null;
                }
                hw1 hw1Var = new hw1(i);
                im5 focusOwner = us3.g(focusTargetNodeA).getFocusOwner();
                FocusTargetNode focusTargetNodeF = focusOwner.f();
                if (i == 7) {
                    nm5VarD2.j.invoke(hw1Var);
                } else {
                    nm5VarD2.k.invoke(hw1Var);
                }
                sm5Var = hw1Var.b ? sm5.c : focusTargetNodeF != focusOwner.f() ? sm5.d : sm5.b;
            }
            if (!wl7.b(sm5Var, sm5.c)) {
                if (wl7.b(sm5Var, sm5.d)) {
                    FocusTargetNode focusTargetNodeA2 = dn5.a(focusTargetNode);
                    if (focusTargetNodeA2 != null) {
                        return function1.invoke(focusTargetNodeA2);
                    }
                } else if (!wl7.b(sm5Var, sm5.b)) {
                    return Boolean.valueOf(sm5Var.a(function1));
                }
            }
            return bool;
        }
        bool = null;
        focusTargetNodeA = null;
        vl8 layoutDirection2 = androidComposeView.getLayoutDirection();
        ?? aVar = new a(focusTargetNodeA, this, function1);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zA = zra.b(focusTargetNode, aVar);
            } else {
                if (i != 2) {
                    r6.g("This function should only be used for 1-D focus search");
                    return bool;
                }
                zA = zra.a(focusTargetNode, aVar);
            }
            return Boolean.valueOf(zA);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return gvf.k(focusTargetNode, i, qtcVar, aVar);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    l.g();
                    return bool;
                }
                i2 = 3;
            }
            FocusTargetNode focusTargetNodeA3 = dn5.a(focusTargetNode);
            if (focusTargetNodeA3 != null) {
                return gvf.k(focusTargetNodeA3, i2, qtcVar, aVar);
            }
            return bool;
        }
        if (i != 8) {
            s40.i(ol5.a(i), "Focus search invoked with invalid FocusDirection ");
            return bool;
        }
        FocusTargetNode focusTargetNodeA4 = dn5.a(focusTargetNode);
        boolean zBooleanValue = false;
        if (focusTargetNodeA4 == null) {
            obj = bool;
        } else {
            if (!focusTargetNodeA4.a.c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            Object obj2 = focusTargetNodeA4.a.e;
            pm8 pm8VarF = us3.f(focusTargetNodeA4);
            loop0: while (pm8VarF != null) {
                if ((pm8VarF.t0.f.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    for (?? r2 = obj2; r2 != 0; r2 = r2.e) {
                        if ((r2.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                            ?? B = r2;
                            ?? j4aVar = bool;
                            while (B != 0) {
                                if (B instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) B;
                                    if (focusTargetNode2.d2().a) {
                                        obj = focusTargetNode2;
                                        break loop0;
                                    }
                                } else if ((B.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (B instanceof zs3)) {
                                    e.c cVar = ((zs3) B).e0;
                                    int i3 = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar != null) {
                                        if ((cVar.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                            i3++;
                                            j4aVar = j4aVar;
                                            if (i3 == 1) {
                                                B = cVar;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = bool;
                                                }
                                                j4aVar.b(cVar);
                                            }
                                        }
                                        cVar = cVar.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                    }
                }
                pm8VarF = pm8VarF.K();
                obj2 = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? bool : riaVar.e;
            }
            obj = bool;
        }
        if (obj != null && obj != focusTargetNode) {
            zBooleanValue = ((Boolean) aVar.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.im5
    public final void b(sl5 sl5Var) {
        dm5 dm5Var = this.d;
        if (dm5Var.d.d(sl5Var)) {
            dm5Var.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.fm5
    public final boolean c(int i) {
        boolean zB;
        View viewB;
        luc lucVar = new luc();
        lucVar.element = Boolean.FALSE;
        FocusTargetNode focusTargetNode = this.h;
        AndroidComposeView androidComposeView = this.a;
        Boolean boolA = a(i, androidComposeView.getEmbeddedViewFocusRect(), new b(lucVar, i));
        if (!wl7.b(boolA, Boolean.TRUE) || focusTargetNode == this.h) {
            if (boolA != null && lucVar.element != 0) {
                if (!boolA.booleanValue() || !((Boolean) lucVar.element).booleanValue()) {
                    if (i != 1 && i != 2) {
                        if (i != 7 && i != 8) {
                            Integer numF = cr8.F(i);
                            if (numF != null) {
                                int iIntValue = numF.intValue();
                                qtc embeddedViewFocusRect = androidComposeView.getEmbeddedViewFocusRect();
                                Rect rectY = embeddedViewFocusRect != null ? wab.y(embeddedViewFocusRect) : null;
                                tl5 tl5Var = tl5.f.get();
                                tl5Var.getClass();
                                tl5 tl5Var2 = tl5Var;
                                if (rectY == null) {
                                    viewB = tl5Var2.b(androidComposeView, androidComposeView.findFocus(), iIntValue);
                                } else {
                                    tl5Var2.a.set(rectY);
                                    Rect rect = tl5Var2.a;
                                    ArrayList<View> arrayList = tl5Var2.e;
                                    try {
                                        arrayList.clear();
                                        androidComposeView.addFocusables(arrayList, iIntValue, androidComposeView.isInTouchMode() ? 1 : 0);
                                        View viewA = arrayList.isEmpty() ? null : tl5Var2.a(iIntValue, rect, null, androidComposeView, arrayList);
                                        arrayList.clear();
                                        viewB = viewA;
                                    } catch (Throwable th) {
                                        arrayList.clear();
                                        throw th;
                                    }
                                }
                                if (viewB != null) {
                                    zB = cr8.B(viewB, Integer.valueOf(iIntValue), rectY);
                                }
                                if (!zB) {
                                }
                            } else {
                                r6.g("Invalid focus direction");
                            }
                        }
                        zB = false;
                        if (!zB) {
                        }
                    } else if (p(i, false, false)) {
                        Boolean boolA2 = a(i, null, new km5(i));
                        if (boolA2 != null ? boolA2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [j4a] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [j4a] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v14, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [j4a] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [j4a] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // defpackage.im5
    public final boolean d(ufd ufdVar, l50 l50Var) {
        sfd sfdVar;
        int size;
        ria riaVar;
        ?? B;
        ria riaVar2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = dn5.a(this.c);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.a.c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar = focusTargetNodeA.a;
            pm8 pm8VarF = us3.f(focusTargetNodeA);
            loop0: while (true) {
                if (pm8VarF == null) {
                    B = 0;
                    break;
                }
                if ((pm8VarF.t0.f.d & 16384) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 16384) != 0) {
                            ?? j4aVar = 0;
                            B = cVar;
                            while (B != 0) {
                                if (B instanceof sfd) {
                                    break loop0;
                                }
                                if ((B.c & 16384) != 0 && (B instanceof zs3)) {
                                    e.c cVar2 = ((zs3) B).e0;
                                    int i = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 16384) != 0) {
                                            i++;
                                            j4aVar = j4aVar;
                                            if (i == 1) {
                                                B = cVar2;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                pm8VarF = pm8VarF.K();
                cVar = (pm8VarF == null || (riaVar2 = pm8VarF.t0) == null) ? null : riaVar2.e;
            }
            sfdVar = (sfd) B;
        } else {
            sfdVar = null;
        }
        if (sfdVar != null) {
            if (!sfdVar.k().c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar3 = sfdVar.k().e;
            pm8 pm8VarF2 = us3.f(sfdVar);
            ArrayList arrayList = null;
            while (pm8VarF2 != null) {
                if ((pm8VarF2.t0.f.d & 16384) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.c & 16384) != 0) {
                            e.c cVarB = cVar3;
                            j4a j4aVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof sfd) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                } else if ((cVarB.c & 16384) != 0 && (cVarB instanceof zs3)) {
                                    int i2 = 0;
                                    for (e.c cVar4 = ((zs3) cVarB).e0; cVar4 != null; cVar4 = cVar4.f) {
                                        if ((cVar4.c & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar4;
                                            } else {
                                                if (j4aVar2 == null) {
                                                    j4aVar2 = new j4a(new e.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    j4aVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                j4aVar2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarB = us3.b(j4aVar2);
                            }
                        }
                        cVar3 = cVar3.e;
                    }
                }
                pm8VarF2 = pm8VarF2.K();
                cVar3 = (pm8VarF2 == null || (riaVar = pm8VarF2.t0) == null) ? null : riaVar.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((sfd) arrayList.get(size)).l0(ufdVar)) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            ?? K = sfdVar.k();
            ?? j4aVar3 = 0;
            while (true) {
                if (K != 0) {
                    if (K instanceof sfd) {
                        if (((sfd) K).l0(ufdVar)) {
                            break;
                        }
                    } else if ((K.c & 16384) != 0 && (K instanceof zs3)) {
                        e.c cVar5 = ((zs3) K).e0;
                        int i4 = 0;
                        j4aVar3 = j4aVar3;
                        K = K;
                        while (cVar5 != null) {
                            if ((cVar5.c & 16384) != 0) {
                                i4++;
                                j4aVar3 = j4aVar3;
                                if (i4 == 1) {
                                    K = cVar5;
                                } else {
                                    if (j4aVar3 == 0) {
                                        j4aVar3 = new j4a(new e.c[16]);
                                    }
                                    if (K != 0) {
                                        j4aVar3.b(K);
                                        K = 0;
                                    }
                                    j4aVar3.b(cVar5);
                                }
                            }
                            cVar5 = cVar5.f;
                            j4aVar3 = j4aVar3;
                            K = K;
                        }
                        if (i4 == 1) {
                        }
                    }
                    K = us3.b(j4aVar3);
                } else if (!((Boolean) l50Var.invoke()).booleanValue()) {
                    ?? K2 = sfdVar.k();
                    ?? j4aVar4 = 0;
                    while (true) {
                        if (K2 != 0) {
                            if (K2 instanceof sfd) {
                                if (((sfd) K2).H0(ufdVar)) {
                                    break;
                                }
                            } else if ((K2.c & 16384) != 0 && (K2 instanceof zs3)) {
                                e.c cVar6 = ((zs3) K2).e0;
                                int i5 = 0;
                                K2 = K2;
                                j4aVar4 = j4aVar4;
                                while (cVar6 != null) {
                                    if ((cVar6.c & 16384) != 0) {
                                        i5++;
                                        j4aVar4 = j4aVar4;
                                        if (i5 == 1) {
                                            K2 = cVar6;
                                        } else {
                                            if (j4aVar4 == 0) {
                                                j4aVar4 = new j4a(new e.c[16]);
                                            }
                                            if (K2 != 0) {
                                                j4aVar4.b(K2);
                                                K2 = 0;
                                            }
                                            j4aVar4.b(cVar6);
                                        }
                                    }
                                    cVar6 = cVar6.f;
                                    K2 = K2;
                                    j4aVar4 = j4aVar4;
                                }
                                if (i5 == 1) {
                                }
                            }
                            K2 = us3.b(j4aVar4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                if (!((sfd) arrayList.get(i6)).H0(ufdVar)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // defpackage.im5
    public final boolean e(KeyEvent keyEvent) {
        gne gneVar;
        int size;
        ria riaVar;
        ?? B;
        ria riaVar2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = dn5.a(this.c);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.a.c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar = focusTargetNodeA.a;
            pm8 pm8VarF = us3.f(focusTargetNodeA);
            loop0: while (true) {
                if (pm8VarF == null) {
                    B = 0;
                    break;
                }
                if ((pm8VarF.t0.f.d & 131072) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 131072) != 0) {
                            ?? j4aVar = 0;
                            B = cVar;
                            while (B != 0) {
                                if (B instanceof gne) {
                                    break loop0;
                                }
                                if ((B.c & 131072) != 0 && (B instanceof zs3)) {
                                    e.c cVar2 = ((zs3) B).e0;
                                    int i = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 131072) != 0) {
                                            i++;
                                            j4aVar = j4aVar;
                                            if (i == 1) {
                                                B = cVar2;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                pm8VarF = pm8VarF.K();
                cVar = (pm8VarF == null || (riaVar2 = pm8VarF.t0) == null) ? null : riaVar2.e;
            }
            gneVar = (gne) B;
        } else {
            gneVar = null;
        }
        if (gneVar != null) {
            if (!gneVar.k().c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar3 = gneVar.k().e;
            pm8 pm8VarF2 = us3.f(gneVar);
            ArrayList arrayList = null;
            while (pm8VarF2 != null) {
                if ((pm8VarF2.t0.f.d & 131072) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.c & 131072) != 0) {
                            e.c cVarB = cVar3;
                            j4a j4aVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof gne) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                } else if ((cVarB.c & 131072) != 0 && (cVarB instanceof zs3)) {
                                    int i2 = 0;
                                    for (e.c cVar4 = ((zs3) cVarB).e0; cVar4 != null; cVar4 = cVar4.f) {
                                        if ((cVar4.c & 131072) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar4;
                                            } else {
                                                if (j4aVar2 == null) {
                                                    j4aVar2 = new j4a(new e.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    j4aVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                j4aVar2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarB = us3.b(j4aVar2);
                            }
                        }
                        cVar3 = cVar3.e;
                    }
                }
                pm8VarF2 = pm8VarF2.K();
                cVar3 = (pm8VarF2 == null || (riaVar = pm8VarF2.t0) == null) ? null : riaVar.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((gne) arrayList.get(size)).J()) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            ?? K = gneVar.k();
            ?? j4aVar3 = 0;
            while (true) {
                if (K != 0) {
                    if (K instanceof gne) {
                        if (((gne) K).J()) {
                            break;
                        }
                    } else if ((K.c & 131072) != 0 && (K instanceof zs3)) {
                        e.c cVar5 = ((zs3) K).e0;
                        int i4 = 0;
                        K = K;
                        j4aVar3 = j4aVar3;
                        while (cVar5 != null) {
                            if ((cVar5.c & 131072) != 0) {
                                i4++;
                                j4aVar3 = j4aVar3;
                                if (i4 == 1) {
                                    K = cVar5;
                                } else {
                                    if (j4aVar3 == 0) {
                                        j4aVar3 = new j4a(new e.c[16]);
                                    }
                                    if (K != 0) {
                                        j4aVar3.b(K);
                                        K = 0;
                                    }
                                    j4aVar3.b(cVar5);
                                }
                            }
                            cVar5 = cVar5.f;
                            K = K;
                            j4aVar3 = j4aVar3;
                        }
                        if (i4 == 1) {
                        }
                    }
                    K = us3.b(j4aVar3);
                } else {
                    ?? K2 = gneVar.k();
                    ?? j4aVar4 = 0;
                    while (true) {
                        if (K2 != 0) {
                            if (K2 instanceof gne) {
                                if (((gne) K2).E1()) {
                                    break;
                                }
                            } else if ((K2.c & 131072) != 0 && (K2 instanceof zs3)) {
                                e.c cVar6 = ((zs3) K2).e0;
                                int i5 = 0;
                                K2 = K2;
                                j4aVar4 = j4aVar4;
                                while (cVar6 != null) {
                                    if ((cVar6.c & 131072) != 0) {
                                        i5++;
                                        j4aVar4 = j4aVar4;
                                        if (i5 == 1) {
                                            K2 = cVar6;
                                        } else {
                                            if (j4aVar4 == 0) {
                                                j4aVar4 = new j4a(new e.c[16]);
                                            }
                                            if (K2 != 0) {
                                                j4aVar4.b(K2);
                                                K2 = 0;
                                            }
                                            j4aVar4.b(cVar6);
                                        }
                                    }
                                    cVar6 = cVar6.f;
                                    K2 = K2;
                                    j4aVar4 = j4aVar4;
                                }
                                if (i5 == 1) {
                                }
                            }
                            K2 = us3.b(j4aVar4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                if (!((gne) arrayList.get(i6)).E1()) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.im5
    public final FocusTargetNode f() {
        return this.h;
    }

    @Override // defpackage.im5
    public final void g(FocusTargetNode focusTargetNode) {
        dm5 dm5Var = this.d;
        if (dm5Var.c.d(focusTargetNode)) {
            dm5Var.a();
        }
    }

    @Override // defpackage.im5
    public final void h() {
        this.d.a();
    }

    @Override // defpackage.im5
    public final FocusOwnerImpl$modifier$1 i() {
        return this.e;
    }

    @Override // defpackage.im5
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1 A[Catch: all -> 0x033c, TryCatch #0 {all -> 0x033c, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:162:0x01dc, B:143:0x01a4, B:145:0x01aa, B:147:0x01ae, B:149:0x01b6, B:151:0x01bc, B:153:0x01c0, B:155:0x01c6, B:157:0x01cf, B:158:0x01d3, B:159:0x01d6, B:163:0x01e1, B:164:0x01e4, B:166:0x01ea, B:168:0x01ee, B:171:0x01f5, B:173:0x01fd, B:180:0x0214, B:181:0x0216, B:182:0x0224, B:184:0x0228, B:186:0x022c, B:213:0x0284, B:190:0x0238, B:192:0x0241, B:194:0x0245, B:196:0x024c, B:198:0x0252, B:200:0x0256, B:201:0x025b, B:203:0x0261, B:204:0x0268, B:206:0x0270, B:207:0x0275, B:209:0x027b, B:210:0x027e, B:214:0x028f, B:218:0x029f, B:219:0x02ad, B:221:0x02b1, B:223:0x02b5, B:250:0x030d, B:227:0x02c1, B:229:0x02ca, B:231:0x02ce, B:233:0x02d5, B:235:0x02db, B:237:0x02df, B:238:0x02e4, B:240:0x02ea, B:241:0x02f1, B:243:0x02f9, B:244:0x02fe, B:246:0x0304, B:247:0x0307, B:252:0x031a, B:254:0x0321, B:259:0x0334, B:260:0x0336, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:266:0x0007 }] */
    /* JADX WARN: Type inference failed for: r12v23, types: [T, androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v28, types: [T, androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v37, types: [T, androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v40, types: [T, androidx.compose.ui.e$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46, types: [T, androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v49, types: [T, androidx.compose.ui.e$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r7v35, types: [T, j4a] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r9v17, types: [T, j4a] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    @Override // defpackage.im5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.view.KeyEvent r13, defpackage.gu5<java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm5.k(android.view.KeyEvent, gu5):boolean");
    }

    @Override // defpackage.im5
    public final ym5 l() {
        return this.c.P();
    }

    @Override // defpackage.im5
    public final boolean m() {
        return this.a.T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v14, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [j4a] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [j4a] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // defpackage.im5
    public final boolean n(web webVar, AndroidComposeView.f fVar) {
        wa7 wa7Var;
        int size;
        ria riaVar;
        ?? B;
        ria riaVar2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = dn5.a(this.c);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.a.c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar = focusTargetNodeA.a;
            pm8 pm8VarF = us3.f(focusTargetNodeA);
            loop0: while (true) {
                if (pm8VarF == null) {
                    B = 0;
                    break;
                }
                if ((pm8VarF.t0.f.d & 2097152) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 2097152) != 0) {
                            ?? j4aVar = 0;
                            B = cVar;
                            while (B != 0) {
                                if (B instanceof wa7) {
                                    break loop0;
                                }
                                if ((B.c & 2097152) != 0 && (B instanceof zs3)) {
                                    e.c cVar2 = ((zs3) B).e0;
                                    int i = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 2097152) != 0) {
                                            i++;
                                            j4aVar = j4aVar;
                                            if (i == 1) {
                                                B = cVar2;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                pm8VarF = pm8VarF.K();
                cVar = (pm8VarF == null || (riaVar2 = pm8VarF.t0) == null) ? null : riaVar2.e;
            }
            wa7Var = (wa7) B;
        } else {
            wa7Var = null;
        }
        if (wa7Var != null) {
            if (!wa7Var.k().c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar3 = wa7Var.k().e;
            pm8 pm8VarF2 = us3.f(wa7Var);
            ArrayList arrayList = null;
            while (pm8VarF2 != null) {
                if ((pm8VarF2.t0.f.d & 2097152) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.c & 2097152) != 0) {
                            e.c cVarB = cVar3;
                            j4a j4aVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof wa7) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                } else if ((cVarB.c & 2097152) != 0 && (cVarB instanceof zs3)) {
                                    int i2 = 0;
                                    for (e.c cVar4 = ((zs3) cVarB).e0; cVar4 != null; cVar4 = cVar4.f) {
                                        if ((cVar4.c & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar4;
                                            } else {
                                                if (j4aVar2 == null) {
                                                    j4aVar2 = new j4a(new e.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    j4aVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                j4aVar2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarB = us3.b(j4aVar2);
                            }
                        }
                        cVar3 = cVar3.e;
                    }
                }
                pm8VarF2 = pm8VarF2.K();
                cVar3 = (pm8VarF2 == null || (riaVar = pm8VarF2.t0) == null) ? null : riaVar.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((wa7) arrayList.get(size)).L()) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            ?? K = wa7Var.k();
            ?? j4aVar3 = 0;
            while (true) {
                if (K != 0) {
                    if (K instanceof wa7) {
                        if (((wa7) K).L()) {
                            break;
                        }
                    } else if ((K.c & 2097152) != 0 && (K instanceof zs3)) {
                        e.c cVar5 = ((zs3) K).e0;
                        int i4 = 0;
                        K = K;
                        j4aVar3 = j4aVar3;
                        while (cVar5 != null) {
                            if ((cVar5.c & 2097152) != 0) {
                                i4++;
                                j4aVar3 = j4aVar3;
                                if (i4 == 1) {
                                    K = cVar5;
                                } else {
                                    if (j4aVar3 == 0) {
                                        j4aVar3 = new j4a(new e.c[16]);
                                    }
                                    if (K != 0) {
                                        j4aVar3.b(K);
                                        K = 0;
                                    }
                                    j4aVar3.b(cVar5);
                                }
                            }
                            cVar5 = cVar5.f;
                            K = K;
                            j4aVar3 = j4aVar3;
                        }
                        if (i4 == 1) {
                        }
                    }
                    K = us3.b(j4aVar3);
                } else if (!((Boolean) fVar.invoke()).booleanValue()) {
                    ?? K2 = wa7Var.k();
                    ?? j4aVar4 = 0;
                    while (true) {
                        if (K2 != 0) {
                            if (K2 instanceof wa7) {
                                if (((wa7) K2).G0()) {
                                    break;
                                }
                            } else if ((K2.c & 2097152) != 0 && (K2 instanceof zs3)) {
                                e.c cVar6 = ((zs3) K2).e0;
                                int i5 = 0;
                                K2 = K2;
                                j4aVar4 = j4aVar4;
                                while (cVar6 != null) {
                                    if ((cVar6.c & 2097152) != 0) {
                                        i5++;
                                        j4aVar4 = j4aVar4;
                                        if (i5 == 1) {
                                            K2 = cVar6;
                                        } else {
                                            if (j4aVar4 == 0) {
                                                j4aVar4 = new j4a(new e.c[16]);
                                            }
                                            if (K2 != 0) {
                                                j4aVar4.b(K2);
                                                K2 = 0;
                                            }
                                            j4aVar4.b(cVar6);
                                        }
                                    }
                                    cVar6 = cVar6.f;
                                    K2 = K2;
                                    j4aVar4 = j4aVar4;
                                }
                                if (i5 == 1) {
                                }
                            }
                            K2 = us3.b(j4aVar4);
                        } else if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                if (!((wa7) arrayList.get(i6)).G0()) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.im5
    public final qtc o() {
        FocusTargetNode focusTargetNodeA = dn5.a(this.c);
        if (focusTargetNodeA != null) {
            return dn5.b(focusTargetNodeA);
        }
        return null;
    }

    @Override // defpackage.im5
    public final boolean p(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = ie7.r(this.c, i).ordinal()) == 0) {
            u(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                l.g();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            v();
        }
        return z3;
    }

    @Override // defpackage.im5
    public final void q(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.h;
        this.h = focusTargetNode;
        p3a<em5> p3aVar = this.g;
        Object[] objArr = p3aVar.a;
        int i = p3aVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((em5) objArr[i2]).a(focusTargetNode2, focusTargetNode);
        }
    }

    @Override // defpackage.im5
    public final void r() {
        ie7.j(this.c, true);
    }

    @Override // defpackage.im5
    public final p3a<em5> s() {
        return this.g;
    }

    @Override // defpackage.fm5
    public final void t(boolean z) {
        p(8, z, true);
    }

    public final boolean u(boolean z) {
        ria riaVar;
        FocusTargetNode focusTargetNode = this.h;
        if (focusTargetNode != null) {
            q(null);
            ym5 ym5Var = ym5.a;
            ym5 ym5Var2 = ym5.d;
            focusTargetNode.c2(ym5Var, ym5Var2);
            if (!focusTargetNode.a.c0) {
                ae7.b("visitAncestors called on an unattached node");
            }
            e.c cVar = focusTargetNode.a.e;
            pm8 pm8VarF = us3.f(focusTargetNode);
            while (pm8VarF != null) {
                if ((pm8VarF.t0.f.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                            e.c cVarB = cVar;
                            j4a j4aVar = null;
                            while (cVarB != null) {
                                if (cVarB instanceof FocusTargetNode) {
                                    ((FocusTargetNode) cVarB).c2(ym5.b, ym5Var2);
                                } else if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (cVarB instanceof zs3)) {
                                    int i = 0;
                                    for (e.c cVar2 = ((zs3) cVarB).e0; cVar2 != null; cVar2 = cVar2.f) {
                                        if ((cVar2.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVarB = cVar2;
                                            } else {
                                                if (j4aVar == null) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    j4aVar.b(cVarB);
                                                    cVarB = null;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVarB = us3.b(j4aVar);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                pm8VarF = pm8VarF.K();
                cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
            }
        }
        return true;
    }

    public final void v() {
        AndroidComposeView androidComposeView = this.a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.d) * 32, ((long) r0) * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.ut0.m0(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r16 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r16 = r16 ^ (r16 << 16);
        r17 = r13;
        r13 = r16 >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | (((long) (r16 & 127)) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r37 = r7;
        r4.e = defpackage.lnd.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.lnd.c(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0227, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0229, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0267, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0295, code lost:
    
        r21 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0297, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033f, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0341, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm5.w(android.view.KeyEvent):boolean");
    }
}
